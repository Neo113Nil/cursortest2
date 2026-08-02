package com.getcapacitor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.getcapacitor.android.R;
import com.getcapacitor.cordova.MockCordovaInterfaceImpl;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import com.getcapacitor.plugin.App;
import java.util.ArrayList;
import java.util.List;
import org.apache.cordova.ConfigXmlParser;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.PluginEntry;
import org.apache.cordova.PluginManager;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BridgeActivity extends AppCompatActivity {
    private JSONObject config;
    protected MockCordovaInterfaceImpl cordovaInterface;
    private String lastActivityPlugin;
    private MockCordovaWebViewImpl mockWebView;
    private ArrayList<PluginEntry> pluginEntries;
    private PluginManager pluginManager;
    private CordovaPreferences preferences;
    private ViewBridge webViewBridge;
    protected BridgeStarter bridge = new BridgeStarter();
    protected boolean keepRunning = true;
    private int activityDepth = 0;
    private List<Class<? extends Plugin>> initialPlugins = new ArrayList();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected void init(Bundle bundle, List<Class<? extends Plugin>> list) {
        init(bundle, list, null, false);
    }

    protected void init(Bundle bundle, List<Class<? extends Plugin>> list, boolean z) {
        init(bundle, list, null, z);
    }

    protected void init(Bundle bundle, List<Class<? extends Plugin>> list, JSONObject jSONObject, boolean z) {
        this.initialPlugins = list;
        this.config = jSONObject;
        loadConfig(getApplicationContext(), this);
        load(bundle);
    }

    protected ViewBridge createViewBridge() {
        return new WebViewBridge((WebView) findViewById(R.id.webview));
    }

    protected void load(Bundle bundle) {
        Logger.debug("Starting BridgeActivity");
        this.webViewBridge = createViewBridge();
        MockCordovaInterfaceImpl mockCordovaInterfaceImpl = new MockCordovaInterfaceImpl(this);
        this.cordovaInterface = mockCordovaInterfaceImpl;
        if (bundle != null) {
            mockCordovaInterfaceImpl.restoreInstanceState(bundle);
        }
        MockCordovaWebViewImpl mockCordovaWebViewImpl = new MockCordovaWebViewImpl(getApplicationContext());
        this.mockWebView = mockCordovaWebViewImpl;
        mockCordovaWebViewImpl.init(this.cordovaInterface, this.pluginEntries, this.preferences, this.webViewBridge);
        PluginManager pluginManager = this.mockWebView.getPluginManager();
        this.pluginManager = pluginManager;
        this.cordovaInterface.onCordovaInit(pluginManager);
        this.bridge.init(new Bridge(this, this.webViewBridge, this.initialPlugins, this.cordovaInterface, this.pluginManager, this.preferences, this.config), this.mockWebView);
        if (bundle != null) {
            this.bridge.restoreInstanceState(bundle);
        }
        this.keepRunning = this.preferences.getBoolean("KeepRunning", true);
        onNewIntent(getIntent());
    }

    public Bridge getBridge() {
        return this.bridge.getBridge();
    }

    protected void fireAppStateChanged(boolean z) {
        App app;
        PluginHandle plugin = this.bridge.getPlugin("App");
        if (plugin == null || (app = (App) plugin.getInstance()) == null) {
            return;
        }
        app.fireChange(z);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.bridge.saveInstanceState(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.activityDepth++;
        this.bridge.onStart();
        Logger.debug("App started");
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.bridge.onRestart();
        Logger.debug("App restarted");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.bridge.onResume(this.keepRunning)) {
            fireAppStateChanged(true);
        }
        Logger.debug("App resumed");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.bridge.onPause(this.keepRunning, this.cordovaInterface);
        Logger.debug("App paused");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        int max = Math.max(0, this.activityDepth - 1);
        this.activityDepth = max;
        if (max == 0) {
            fireAppStateChanged(false);
        }
        this.bridge.onStop();
        Logger.debug("App stopped");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.bridge.onDestroy();
        Logger.debug("App destroyed");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewBridge viewBridge = this.webViewBridge;
        if (viewBridge != null) {
            viewBridge.destroy();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        BridgeStarter bridgeStarter = this.bridge;
        if (bridgeStarter == null) {
            return;
        }
        bridgeStarter.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.bridge.onActivityResult(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.bridge.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BridgeStarter bridgeStarter = this.bridge;
        if (bridgeStarter == null) {
            return;
        }
        bridgeStarter.onBackPressed();
    }

    public void loadConfig(Context context, Activity activity) {
        ConfigXmlParser configXmlParser = new ConfigXmlParser();
        configXmlParser.parse(context);
        CordovaPreferences preferences = configXmlParser.getPreferences();
        this.preferences = preferences;
        preferences.setPreferencesBundle(activity.getIntent().getExtras());
        this.pluginEntries = configXmlParser.getPluginEntries();
    }
}
