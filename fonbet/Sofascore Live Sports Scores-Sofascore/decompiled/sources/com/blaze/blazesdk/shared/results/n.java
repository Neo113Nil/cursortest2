package com.blaze.blazesdk.shared.results;

import com.blaze.blazesdk.logger.InternalErrorLogId;
import com.ironsource.InterfaceC4060ee;
import defpackage.mxm;
import defpackage.yqm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n extends g0 implements mxm, yqm {
    public String h;
    public final boolean i;
    public final InternalErrorLogId j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n() {
        super(InterfaceC4060ee.a.h, r3, r4, "Image asset loading failed due to network or decoding error", null);
        f0[] f0VarArr = f0.a;
        ErrorDomain errorDomain = ErrorDomain.PLAYER;
        ErrorReason errorReason = ErrorReason.FAILED_TO_LOAD_IMAGE_ASSET;
        d0[] d0VarArr = d0.a;
        e0[] e0VarArr = e0.a;
        this.h = "Image loading failed";
        this.i = true;
        this.j = InternalErrorLogId.FAILED_TO_LOAD_IMAGE_ASSET;
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
