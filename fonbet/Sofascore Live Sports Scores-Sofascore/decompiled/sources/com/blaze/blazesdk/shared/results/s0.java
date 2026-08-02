package com.blaze.blazesdk.shared.results;

import com.blaze.blazesdk.logger.InternalErrorLogId;
import defpackage.yqm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s0 extends g0 implements yqm {
    public final InternalErrorLogId h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0() {
        super(2000, r3, r4, "Storage operation failed to save data due to disk or permission error", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.DATA_STORAGE;
        ErrorReason errorReason = ErrorReason.FAILED_TO_SAVE_DATA;
        d0[] d0VarArr = d0.a;
        this.h = InternalErrorLogId.FAILED_TO_SAVE_DATA;
    }

    @Override // defpackage.yqm
    public final InternalErrorLogId b() {
        return this.h;
    }
}
