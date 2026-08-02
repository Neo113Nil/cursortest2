package com.getcapacitor;

import android.content.Intent;
import android.os.Bundle;
import com.getcapacitor.cordova.MockCordovaInterfaceImpl;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;

/* loaded from: classes8.dex */
public class BridgeStarter {
    private Bridge bridge;
    private MockCordovaWebViewImpl mockWebView;

    public void init(Bridge bridge, MockCordovaWebViewImpl mockCordovaWebViewImpl) {
        this.bridge = bridge;
        this.mockWebView = mockCordovaWebViewImpl;
        Logger.info("Bridge is constructed - BridgeStarter.init");
    }

    public Bridge getBridge() {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            return bridge;
        }
        Logger.warn("Bridge is not yet initialized - getBridge");
        return null;
    }

    public void reload() {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.reload();
        } else {
            Logger.warn("Bridge is not yet initialized - reload");
        }
    }

    public void restoreInstanceState(Bundle bundle) {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.restoreInstanceState(bundle);
        } else {
            Logger.warn("Bridge is not yet initialized - restoreInstanceState");
        }
    }

    public PluginHandle getPlugin(String str) {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            return bridge.getPlugin(str);
        }
        Logger.warn("Bridge is not yet initialized - getPlugin : " + str);
        return null;
    }

    public void saveInstanceState(Bundle bundle) {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.saveInstanceState(bundle);
        } else {
            Logger.warn("Bridge is not yet initialized - saveInstanceState");
        }
    }

    public void onStart() {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onStart();
            this.mockWebView.handleStart();
        } else {
            Logger.warn("Bridge is not yet initialized - onStart");
        }
    }

    public void onRestart() {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onRestart();
        } else {
            Logger.warn("Bridge is not yet initialized - onRestart");
        }
    }

    public boolean onResume(boolean z) {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onResume();
            this.mockWebView.handleResume(z);
            return true;
        }
        Logger.warn("Bridge is not yet initialized - onResume : " + z);
        return false;
    }

    public void onPause(boolean z, MockCordovaInterfaceImpl mockCordovaInterfaceImpl) {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onPause();
            if (this.mockWebView == null || mockCordovaInterfaceImpl == null) {
                return;
            }
            this.mockWebView.handlePause(z || mockCordovaInterfaceImpl.getActivityResultCallback() != null);
            return;
        }
        Logger.warn("Bridge is not yet initialized - onPause");
    }

    public void onStop() {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onStop();
            MockCordovaWebViewImpl mockCordovaWebViewImpl = this.mockWebView;
            if (mockCordovaWebViewImpl != null) {
                mockCordovaWebViewImpl.handleStop();
                return;
            }
            return;
        }
        Logger.warn("Bridge is not yet initialized - onStop");
    }

    public void onDestroy() {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onDestroy();
            MockCordovaWebViewImpl mockCordovaWebViewImpl = this.mockWebView;
            if (mockCordovaWebViewImpl != null) {
                mockCordovaWebViewImpl.handleDestroy();
                return;
            }
            return;
        }
        Logger.warn("Bridge is not yet initialized - onDestroy");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onRequestPermissionsResult(i, strArr, iArr);
        } else {
            Logger.warn("Bridge is not yet initialized - onRequestPermissionsResult");
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            return bridge.onActivityResult(i, i2, intent);
        }
        Logger.warn("Bridge is not yet initialized - onActivityResult");
        return false;
    }

    public void onNewIntent(Intent intent) {
        Bridge bridge = this.bridge;
        if (bridge != null && intent != null) {
            bridge.onNewIntent(intent);
            this.mockWebView.onNewIntent(intent);
        } else {
            Logger.warn("Bridge is not yet initialized - onNewIntent");
        }
    }

    public void onBackPressed() {
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onBackPressed();
        } else {
            Logger.warn("Bridge is not yet initialized - onBackPressed");
        }
    }
}
