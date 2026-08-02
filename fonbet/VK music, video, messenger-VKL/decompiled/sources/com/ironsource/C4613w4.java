package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import xsna.s3q0;
import xsna.zcl;

/* renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4613w4 implements P8, O8 {
    private final InterfaceC4634x7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4613w4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.O8
    public void a(Context context, EnumC4595v4 enumC4595v4, String str, String str2) {
        s3q0 s3q0Var;
        B4 a = this.a.a(context, enumC4595v4);
        if (a != null) {
            a.b(str, str2);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC4595v4);
        }
    }

    public C4613w4(InterfaceC4634x7 interfaceC4634x7) {
        this.a = interfaceC4634x7;
    }

    @Override // com.ironsource.P8
    public String a(Context context, EnumC4595v4 enumC4595v4, String str) {
        B4 a = this.a.a(context, enumC4595v4);
        if (a != null) {
            return B4.a(a, str, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC4595v4);
        return null;
    }

    public /* synthetic */ C4613w4(InterfaceC4634x7 interfaceC4634x7, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C4667z4() : interfaceC4634x7);
    }
}
