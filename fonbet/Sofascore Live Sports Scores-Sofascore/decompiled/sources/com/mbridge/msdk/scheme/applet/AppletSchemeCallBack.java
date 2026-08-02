package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class AppletSchemeCallBack implements IAppletSchemeCallBack {
    private static final String TAG = "AppletSchemeCallBack";

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestFailed(int i, String str, String str2) {
        try {
            onRequestFailed(i, str, str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestStart() {
        try {
            onRequestStart();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestSuccess(String str) {
        try {
            onRequestSuccess(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onNetworkError(int i, String str, String str2) {
        try {
            onRequestFailed(i, str, str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e.getMessage());
            }
        }
    }

    public abstract void onRequestFailed(int i, String str, String str2);

    public abstract void onRequestStart();

    public abstract void onRequestSuccess(String str);
}
