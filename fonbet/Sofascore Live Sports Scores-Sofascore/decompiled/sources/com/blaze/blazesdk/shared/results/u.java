package com.blaze.blazesdk.shared.results;

import com.blaze.blazesdk.logger.InternalErrorLogId;
import defpackage.mxm;
import defpackage.yqm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u extends g0 implements mxm, yqm {
    public String h;
    public final boolean i;
    public final InternalErrorLogId j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u() {
        super(2100, r3, r4, "Failed to launch share intent due to system or application error", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.SHARING;
        ErrorReason errorReason = ErrorReason.FAILED_LAUNCHING_SHARE_INTENT;
        d0[] d0VarArr = d0.a;
        e0[] e0VarArr = e0.a;
        this.h = "Failed to launch share dialog";
        this.i = true;
        this.j = InternalErrorLogId.FAILED_LAUNCHING_SHARE_INTENT;
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
