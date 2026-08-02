package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.ip;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class io {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ir f2543;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ip f2544;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Context f2545;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f2546;

    public io(Context context, String str, String str2) {
        this.f2545 = context.getApplicationContext();
        this.f2546 = str2;
        this.f2543 = new ir(this.f2545, str);
        this.f2544 = new ip(im.f2542, this.f2545.getPackageName(), iq.m8093(this.f2545), this.f2546);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m8085(String str) {
        try {
            return this.f2543.m8099(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m8082(String str, int i) {
        try {
            HashMap<String, String> m8102 = this.f2543.m8102(str, i);
            HashMap<String, String> hashMap = new HashMap<>();
            for (String str2 : m8102.keySet()) {
                String str3 = m8102.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        hashMap.put(str2, this.f2544.m8090(str3));
                    } catch (ip.d unused) {
                    }
                }
            }
            return hashMap;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m8081(String str) {
        try {
            String m8103 = this.f2543.m8103(str);
            if (m8103 == null || TextUtils.isEmpty(m8103)) {
                return m8103;
            }
            try {
                return this.f2544.m8090(m8103);
            } catch (ip.d unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8083(String str) {
        try {
            this.f2543.m8101(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8084(String str, String str2) {
        try {
            this.f2543.m8100(str, this.f2544.m8091(str2));
        } catch (Throwable unused) {
        }
    }
}
