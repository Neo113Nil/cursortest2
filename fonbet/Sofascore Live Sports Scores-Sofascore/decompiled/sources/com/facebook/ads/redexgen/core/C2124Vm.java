package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2124Vm {
    public final AdErrorType A00;
    public final String A01;

    public C2124Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C2124Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C2124Vm A00(AdErrorType adErrorType) {
        return new C2124Vm(adErrorType, (String) null);
    }

    public static C2124Vm A01(AdErrorType adErrorType, String str) {
        return new C2124Vm(adErrorType, str);
    }

    public static C2124Vm A02(C2125Vn c2125Vn) {
        return new C2124Vm(c2125Vn.A00(), c2125Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
