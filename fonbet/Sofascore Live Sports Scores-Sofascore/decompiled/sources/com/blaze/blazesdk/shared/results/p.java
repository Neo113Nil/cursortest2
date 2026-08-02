package com.blaze.blazesdk.shared.results;

import defpackage.mxm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p extends g0 implements mxm {
    public String h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p() {
        super(1505, r3, r4, "Player operation requires an internet connection which is not available", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.PLAYER;
        ErrorReason errorReason = ErrorReason.NO_INTERNET_CONNECTION;
        d0[] d0VarArr = d0.a;
        e0[] e0VarArr = e0.a;
        this.h = "No internet connection";
        this.i = true;
    }

    @Override // defpackage.mxm
    public final void a(String str) {
        str.getClass();
        this.h = str;
    }

    @Override // defpackage.mxm
    public final String c() {
        return this.h;
    }

    @Override // defpackage.mxm
    public final boolean a() {
        return this.i;
    }
}
