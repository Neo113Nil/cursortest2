package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;

/* loaded from: classes6.dex */
public final class s {
    public static final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, long j, long j2, long j3, q qVar, Function0<Unit> function0, com.moloco.sdk.internal.ortb.model.k kVar, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-992573618);
        Alignment topEnd = (i2 & 1) != 0 ? Alignment.INSTANCE.getTopEnd() : alignment;
        PaddingValues m578PaddingValues0680j_4 = (i2 & 2) != 0 ? PaddingKt.m578PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m1324getPrimary0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1324getPrimary0d7_KjU() : j;
        long b = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
        long d = (i2 & 16) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d() : j3;
        q a = (i2 & 32) != 0 ? a(null, 0L, null, 0L, composer, 0, 15) : qVar;
        Function0<Unit> function02 = (i2 & 64) != 0 ? null : function0;
        com.moloco.sdk.internal.ortb.model.k kVar2 = (i2 & 128) == 0 ? kVar : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-992573618, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultAdCloseCountdownButton (DefaultAdCloseCountdownButton.kt:31)");
        }
        int i3 = i << 3;
        Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = d.a(topEnd, m578PaddingValues0680j_4, m1324getPrimary0d7_KjU, b, d, a, a.AbstractC0383a.c.EnumC0385a.b, function02, kVar2, composer, (i3 & 234881024) | (i & 14) | 1572864 | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (29360128 & i3));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a2;
    }

    public static final q a(Painter painter, long j, Shape shape, long j2, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(571957227);
        if ((i2 & 1) != 0) {
            painter = PainterResources_androidKt.painterResource(R.drawable.ic_round_close_24, composer, 0);
        }
        Painter painter2 = painter;
        if ((i2 & 2) != 0) {
            j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            shape = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f();
        }
        Shape shape2 = shape;
        long e = (i2 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(571957227, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.adCloseAfterCountdownIcon (DefaultAdCloseCountdownButton.kt:49)");
        }
        q.b bVar = new q.b(painter2, "Close", j3, shape2, e, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }
}
