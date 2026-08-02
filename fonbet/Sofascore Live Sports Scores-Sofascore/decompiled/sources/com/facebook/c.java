package com.facebook;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c {
    public final SharedPreferences a;

    public c(int i) {
        switch (i) {
            case 1:
                SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                sharedPreferences.getClass();
                this.a = sharedPreferences;
                break;
            case 2:
                SharedPreferences sharedPreferences2 = w.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences2.getClass();
                this.a = sharedPreferences2;
                break;
            default:
                SharedPreferences sharedPreferences3 = w.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences3.getClass();
                this.a = sharedPreferences3;
                break;
        }
    }
}
