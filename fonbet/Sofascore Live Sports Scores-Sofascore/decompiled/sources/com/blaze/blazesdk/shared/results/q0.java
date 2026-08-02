package com.blaze.blazesdk.shared.results;

import com.ironsource.InterfaceC4060ee;
import defpackage.mxm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q0 extends g0 implements mxm {
    public String h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q0() {
        super(InterfaceC4060ee.c.d, r3, r4, "Preparing is not supported when using this data source type.", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.CONTENT_PREPARATION;
        ErrorReason errorReason = ErrorReason.ILLEGAL_PREPARE_ON_DATA_SOURCE_TYPE;
        d0[] d0VarArr = d0.a;
        e0[] e0VarArr = e0.a;
        this.h = "Preparing is not supported when using this data source type. You need to proceed to play the content directly, or contact support to discuss upgrade options.";
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
