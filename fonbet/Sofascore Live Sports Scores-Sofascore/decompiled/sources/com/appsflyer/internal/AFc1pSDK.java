package com.appsflyer.internal;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface AFc1pSDK {
    long AFKeystoreWrapper(String str, long j);

    void AFKeystoreWrapper(String str, int i);

    boolean AFKeystoreWrapper(String str);

    void AFLogger(String str);

    void AFLogger(String str, long j);

    int d(String str, int i);

    String d(String str);

    void d(String str, String str2);

    SharedPreferences p_();

    boolean registerClient(String str);

    void unregisterClient(String str, boolean z);
}
