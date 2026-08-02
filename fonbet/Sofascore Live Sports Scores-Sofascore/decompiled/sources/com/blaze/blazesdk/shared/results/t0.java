package com.blaze.blazesdk.shared.results;

import com.blaze.blazesdk.logger.InternalErrorLogId;
import defpackage.mxm;
import defpackage.yqm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t0 extends g0 implements mxm, yqm {
    public String h;
    public final boolean i;
    public final InternalErrorLogId j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t0() {
        super(1402, r3, r4, "Failed to fetch content for the entry point", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.ENTRY_POINT;
        ErrorReason errorReason = ErrorReason.FAILED_FETCHING_CONTENT;
        d0[] d0VarArr = d0.a;
        e0[] e0VarArr = e0.a;
        this.h = "Failed to fetch content";
        this.i = true;
        this.j = InternalErrorLogId.FAILED_FETCHING_CONTENT;
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
