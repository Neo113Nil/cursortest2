package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.internal.ortb.model.h0;
import defpackage.av8;
import defpackage.fz8;
import defpackage.io;
import defpackage.l98;
import defpackage.ml4;
import defpackage.n12;
import defpackage.of3;
import defpackage.os8;
import defpackage.p3e;
import defpackage.utc;
import defpackage.y7k;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i implements os8 {
    public final /* synthetic */ io a;
    public final /* synthetic */ p3e b;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c c;
    public final /* synthetic */ u d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ h0 h;

    public i(io ioVar, p3e p3eVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar, u uVar, long j, long j2, long j3, h0 h0Var) {
        this.a = ioVar;
        this.b = p3eVar;
        this.c = cVar;
        this.d = uVar;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = h0Var;
    }

    @Override // defpackage.os8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        int i;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        Function0 function0 = (Function0) obj4;
        Function1 function1 = (Function1) obj5;
        boolean booleanValue3 = ((Boolean) obj6).booleanValue();
        int i2 = ((y7k) obj7).a;
        int i3 = ((y7k) obj8).a;
        Function0 function02 = (Function0) obj9;
        of3 of3Var = (of3) obj10;
        int intValue = ((Number) obj11).intValue();
        function0.getClass();
        function1.getClass();
        function02.getClass();
        int i4 = intValue & 6;
        n12 n12Var = n12.a;
        if (i4 == 0) {
            i = (((av8) of3Var).g(n12Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((av8) of3Var).h(booleanValue) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((av8) of3Var).h(booleanValue2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= ((av8) of3Var).g(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= ((av8) of3Var).g(function1) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= ((av8) of3Var).h(booleanValue3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & intValue) == 0) {
            i |= ((av8) of3Var).e(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & intValue) == 0) {
            i |= ((av8) of3Var).e(i3) ? 8388608 : 4194304;
        }
        if ((intValue & 100663296) == 0) {
            i |= ((av8) of3Var).g(function02) ? 67108864 : 33554432;
        }
        int i5 = i;
        if ((i5 & 306783379) == 306783378) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        fz8.e(booleanValue2, l98.a0(ml4.R(n12Var.a(utc.a, this.a)), this.b), null, null, null, yqo.y(762064671, of3Var, new h(this.c, function1, booleanValue, this.d, booleanValue3, i2, i3, function0, this.e, this.f, this.g, this.h, function02)), of3Var, ((i5 >> 6) & 14) | 196608, 28);
        return Unit.a;
    }
}
