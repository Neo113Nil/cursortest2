package com.playtika.pras.sdk.views;

import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.playtika.pras.e.k;
import com.playtika.pras.e.l;
import com.playtika.pras.sdk.R;
import com.playtika.pras.sdk.network.SdkConfig;
import com.playtika.pras.sdk.network.StagesApi;

/* loaded from: classes8.dex */
public class RedirectionWebViewActivity extends AppCompatActivity {
    public static final /* synthetic */ int b = 0;
    public WebView a;

    @Override // android.app.Activity
    public final void finish() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(-1);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            StagesApi.restore(bundle);
            SdkConfig.restore(bundle);
        }
        super.onCreate(bundle);
        setContentView(R.layout.redirection_webview_activity);
        this.a = (WebView) findViewById(R.id.redirection_web_view_browser);
        ((Button) findViewById(R.id.redirection_web_view_close_button)).setOnClickListener(new l(this));
        WebSettings settings = this.a.getSettings();
        settings.setCacheMode(-1);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        String stringExtra = getIntent().getStringExtra("RedirectionWebViewActivity.RedirectUri");
        this.a.setWebViewClient(new k(this, stringExtra));
        this.a.setInitialScale(100);
        this.a.setScrollBarStyle(33554432);
        this.a.setVerticalScrollBarEnabled(true);
        this.a.setScrollbarFadingEnabled(false);
        this.a.loadUrl(getIntent().getData().toString());
        this.a.addJavascriptInterface(new RedirectionJSInterface(stringExtra), "AndroidClient");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        WebView webView = this.a;
        if (webView != null) {
            webView.removeAllViews();
            this.a.destroy();
            this.a = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        StagesApi.save(bundle);
        SdkConfig.save(bundle);
        super.onSaveInstanceState(bundle);
    }
}
