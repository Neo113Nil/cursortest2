package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class jd {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f2682;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2683;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private d f2684;

    public jd(String str, int i, String str2, long j) {
        this.f2683 = str;
        this.f2682 = j;
        this.f2684 = new d(i, str2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m8130() {
        return this.f2683;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m8129() throws JSONException {
        if (!TextUtils.isEmpty(this.f2683)) {
            return IronSourceNetworkBridge.jsonObjectInit(this.f2683);
        }
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final d m8128() {
        return this.f2684;
    }

    public static class d {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private int f2685;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f2686;

        public d(int i, String str) {
            this.f2685 = i;
            this.f2686 = str;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final int m8131() {
            return this.f2685;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final String m8132() {
            return this.f2686;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final long m8127() {
        return this.f2682;
    }
}
