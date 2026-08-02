package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1167Vm {
    public final AdErrorType A00;
    public final String A01;

    public C1167Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C1167Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1167Vm A00(AdErrorType adErrorType) {
        return new C1167Vm(adErrorType, (String) null);
    }

    public static C1167Vm A01(AdErrorType adErrorType, String str) {
        return new C1167Vm(adErrorType, str);
    }

    public static C1167Vm A02(C1168Vn c1168Vn) {
        return new C1167Vm(c1168Vn.A00(), c1168Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
