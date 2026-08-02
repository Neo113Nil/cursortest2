package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes3.dex */
public class v3 {
    private a a;
    private String b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    protected v3(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public static v3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new v3(a.AD_UNIT_ID, str);
    }

    public static v3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new v3(a.AD_FORMAT, label);
    }

    public static v3 a(a3 a3Var) {
        String T = a3Var.T();
        MaxAdFormat format = a3Var.getFormat();
        if (TextUtils.isEmpty(T) || format == null) {
            return null;
        }
        return new s3(new l3(T, format));
    }
}
