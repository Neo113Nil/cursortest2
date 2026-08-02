package com.blaze.blazesdk.shared.results;

import com.ironsource.InterfaceC4060ee;
import defpackage.mxm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c0 extends g0 implements mxm {
    public String h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c0() {
        super(InterfaceC4060ee.c.e, r3, r4, "The specified data source type is invalid for widget", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.WIDGET;
        ErrorReason errorReason = ErrorReason.INVALID_DATA_SOURCE_TYPE_PROVIDED;
        d0[] d0VarArr = d0.a;
        e0[] e0VarArr = e0.a;
        this.h = "Invalid data source type";
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
