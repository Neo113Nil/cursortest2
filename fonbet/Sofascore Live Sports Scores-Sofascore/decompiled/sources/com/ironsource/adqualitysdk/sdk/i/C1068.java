package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯩ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1068 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public boolean f3364;

    /* renamed from: ｋ, reason: contains not printable characters */
    public boolean f3365;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f3366;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object f3367;

    public C1068(Object obj) {
        this.f3367 = obj;
    }

    public final String toString() {
        if (!(this.f3367 instanceof String)) {
            return mz1.n(new StringBuilder(), this.f3367, "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("ZQ==\n", "R0Px+Vlqo3o=\n"));
        sb.append(this.f3367);
        return AbstractC1133.m662("Aw==\n", "IfLSckYwJks=\n", sb);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Number m639() {
        Object obj = this.f3367;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m640() {
        Object obj = this.f3367;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d;
        }
        if (obj instanceof String) {
            return !TextUtils.isEmpty((String) obj);
        }
        return true;
    }
}
