package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.unity3d.services.UnityAdsConstants;
import defpackage.av8;
import defpackage.of3;
import defpackage.rd0;
import defpackage.utc;
import defpackage.vdj;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f0 implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public f0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        vdj.c(this.a, rd0.O(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, 1), this.b, this.c, null, null, 0L, null, 0L, 0, false, 0, null, null, of3Var, 48, 0, 65520);
        return Unit.a;
    }
}
