package com.blaze.blazesdk.shared.results;

import com.blaze.blazesdk.logger.InternalErrorLogId;
import defpackage.mxm;
import defpackage.yqm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends g0 implements mxm, yqm {
    public String h;
    public final boolean i;
    public final InternalErrorLogId j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c() {
        super(1103, r3, r4, "SDK operation attempted before proper initialization", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.INITIALIZATION;
        ErrorReason errorReason = ErrorReason.APPLICATION_NOT_INITIALIZED;
        d0[] d0VarArr = d0.a;
        e0[] e0VarArr = e0.a;
        this.h = "SDK initialization required";
        this.i = true;
        this.j = InternalErrorLogId.APPLICATION_NOT_INITIALIZED;
    }

    @Override // defpackage.mxm
    public final void a(String str) {
        str.getClass();
        this.h = str;
    }

    @Override // defpackage.yqm
    public final InternalErrorLogId b() {
        return this.j;
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
