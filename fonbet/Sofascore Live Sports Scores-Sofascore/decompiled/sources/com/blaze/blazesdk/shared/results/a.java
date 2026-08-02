package com.blaze.blazesdk.shared.results;

import com.blaze.blazesdk.logger.InternalErrorLogId;
import defpackage.yqm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a extends g0 implements yqm {
    public final InternalErrorLogId h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a() {
        super(1000, r3, r4, "An unexpected error occurred in the SDK operation", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.GENERAL;
        ErrorReason errorReason = ErrorReason.UNEXPECTED;
        d0[] d0VarArr = d0.a;
        this.h = InternalErrorLogId.UNEXPECTED;
    }

    @Override // defpackage.yqm
    public final InternalErrorLogId b() {
        return this.h;
    }
}
