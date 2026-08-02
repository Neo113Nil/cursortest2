package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.services.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2817l implements InterfaceC2816k {
    public static final int c = 8;
    public final Context a;
    public C2815j b;

    public C2817l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC2816k
    public C2815j invoke() {
        Object m11180constructorimpl;
        C2815j c2815j = this.b;
        if (c2815j != null) {
            return c2815j;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = this.a;
            String obj = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            PackageInfo a = m.a(this.a);
            String packageName = a.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            String versionName = a.versionName;
            Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
            C2815j c2815j2 = new C2815j(obj, packageName, versionName);
            this.b = c2815j2;
            m11180constructorimpl = Result.m11180constructorimpl(c2815j2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = null;
        }
        C2815j c2815j3 = (C2815j) m11180constructorimpl;
        return c2815j3 == null ? new C2815j("", "", "") : c2815j3;
    }
}
