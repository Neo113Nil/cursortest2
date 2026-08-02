package com.moloco.sdk.internal;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.moloco.sdk.R;
import com.moloco.sdk.internal.ortb.model.C2787a;
import com.moloco.sdk.internal.ortb.model.C2788b;
import com.moloco.sdk.internal.ortb.model.C2789c;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.ortb.model.E;
import com.moloco.sdk.internal.ortb.model.F;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class d {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.d$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.c();
        }
    });
    public static final long b = Color.INSTANCE.m2149getWhite0d7_KjU();
    public static final long c = u.a();
    public static final int d = 30;
    public static final long e;

    public static final class a implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ D a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.v b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public a(D d, com.moloco.sdk.internal.ortb.model.v vVar, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.a = d;
            this.b = vVar;
            this.c = kVar;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Color foregroundColor;
            composer.startReplaceableGroup(-1625076729);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1625076729, i, -1, "com.moloco.sdk.internal.determineSkipCloseBehaviorFromDec.<anonymous> (AggregatedOptions.kt:237)");
            }
            float m4440constructorimpl = Dp.m4440constructorimpl(this.a.getControlSize());
            long m4462DpSizeYgX7TsA = DpKt.m4462DpSizeYgX7TsA(m4440constructorimpl, m4440constructorimpl);
            com.moloco.sdk.internal.ortb.model.v vVar = this.b;
            long foregroundColor2 = (vVar == null || (foregroundColor = vVar.getForegroundColor()) == null) ? this.a.getForegroundColor() : foregroundColor.m2122unboximpl();
            Alignment a = d.a(this.a.getHorizontalAlignment(), this.a.getVerticalAlignment());
            PaddingValues m578PaddingValues0680j_4 = PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(this.a.getPadding()));
            long sp = TextUnitKt.getSp(this.a.getControlSize());
            TextUnitKt.m4644checkArithmeticR2X_6o(sp);
            long pack = TextUnitKt.pack(TextUnit.m4629getRawTypeimpl(sp), TextUnit.m4631getValueimpl(sp) / 2);
            long m4543timesGh9hcWk = DpSize.m4543timesGh9hcWk(m4462DpSizeYgX7TsA, 0.4f);
            Color color = this.a.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(a, m578PaddingValues0680j_4, foregroundColor2, m4462DpSizeYgX7TsA, pack, d.b(m4543timesGh9hcWk, color != null ? color.m2122unboximpl() : d.b, foregroundColor2, this.b, composer, 0), null, this.c, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class b implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ D b;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.k c;

        public b(boolean z, D d, com.moloco.sdk.internal.ortb.model.k kVar) {
            this.a = z;
            this.b = d;
            this.c = kVar;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a;
            composer.startReplaceableGroup(1846302992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1846302992, i, -1, "com.moloco.sdk.internal.toCloseButton.<anonymous> (AggregatedOptions.kt:258)");
            }
            if (this.a) {
                a = null;
            } else {
                float m4440constructorimpl = Dp.m4440constructorimpl(this.b.getControlSize());
                long m4462DpSizeYgX7TsA = DpKt.m4462DpSizeYgX7TsA(m4440constructorimpl, m4440constructorimpl);
                Alignment a2 = d.a(this.b.getHorizontalAlignment(), this.b.getVerticalAlignment());
                PaddingValues m578PaddingValues0680j_4 = PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(this.b.getPadding()));
                long foregroundColor = this.b.getForegroundColor();
                long sp = TextUnitKt.getSp(this.b.getControlSize());
                TextUnitKt.m4644checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m4629getRawTypeimpl(sp), TextUnit.m4631getValueimpl(sp) / 2);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.moloco_close, composer, 0);
                long m4543timesGh9hcWk = DpSize.m4543timesGh9hcWk(m4462DpSizeYgX7TsA, 0.45f);
                Color color = this.b.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(a2, m578PaddingValues0680j_4, foregroundColor, m4462DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s.a(painterResource, m4543timesGh9hcWk, null, color != null ? color.m2122unboximpl() : d.b, composer, 0, 4), null, this.c, composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class c implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public c(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        public final Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            long j;
            composer.startReplaceableGroup(1012987991);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1012987991, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:80)");
            }
            if (this.a.getMute().getControlSize() != null) {
                float m4440constructorimpl = Dp.m4440constructorimpl(r1.getData());
                j = DpKt.m4462DpSizeYgX7TsA(m4440constructorimpl, m4440constructorimpl);
            } else {
                j = d.e;
            }
            Alignment a = d.a(this.a.getMute().getHorizontalAlignment(), this.a.getMute().getVerticalAlignment());
            PaddingValues m578PaddingValues0680j_4 = PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(this.a.getMute().getPadding()));
            long m4543timesGh9hcWk = DpSize.m4543timesGh9hcWk(j, 0.6f);
            long foregroundColor = this.a.getMute().getForegroundColor();
            Color color = this.a.getMute().getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
            Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(j, m4543timesGh9hcWk, null, color != null ? color.m2122unboximpl() : d.b, a, m578PaddingValues0680j_4, foregroundColor, PainterResources_androidKt.painterResource(R.drawable.moloco_volume_off, composer, 0), PainterResources_androidKt.painterResource(R.drawable.moloco_volume_on, composer, 0), null, composer, 0, 516);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.internal.d$d, reason: collision with other inner class name */
    public static final class C0232d implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public C0232d(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a;
            Color foregroundColor;
            composer.startReplaceableGroup(-474197615);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474197615, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:95)");
            }
            D skip = this.a.getSkip();
            if (skip == null) {
                a = null;
            } else {
                com.moloco.sdk.internal.ortb.model.z zVar = this.a;
                float m4440constructorimpl = Dp.m4440constructorimpl(skip.getControlSize());
                long m4462DpSizeYgX7TsA = DpKt.m4462DpSizeYgX7TsA(m4440constructorimpl, m4440constructorimpl);
                com.moloco.sdk.internal.ortb.model.v inlineTextButton = zVar.getInlineTextButton();
                long foregroundColor2 = (inlineTextButton == null || (foregroundColor = inlineTextButton.getForegroundColor()) == null) ? skip.getForegroundColor() : foregroundColor.m2122unboximpl();
                Alignment a2 = d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                PaddingValues m578PaddingValues0680j_4 = PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(skip.getPadding()));
                long sp = TextUnitKt.getSp(skip.getControlSize());
                TextUnitKt.m4644checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m4629getRawTypeimpl(sp), TextUnit.m4631getValueimpl(sp) / 2);
                long m4543timesGh9hcWk = DpSize.m4543timesGh9hcWk(m4462DpSizeYgX7TsA, 0.4f);
                Color color = skip.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(a2, m578PaddingValues0680j_4, foregroundColor2, m4462DpSizeYgX7TsA, pack, d.b(m4543timesGh9hcWk, color != null ? color.m2122unboximpl() : d.b, foregroundColor2, zVar.getInlineTextButton(), composer, 0), null, zVar.getCountDownTimer(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class e implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public e(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a;
            composer.startReplaceableGroup(-606521360);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606521360, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:116)");
            }
            D skip = this.a.getSkip();
            if (skip == null) {
                a = null;
            } else {
                com.moloco.sdk.internal.ortb.model.z zVar = this.a;
                float m4440constructorimpl = Dp.m4440constructorimpl(skip.getControlSize());
                long m4462DpSizeYgX7TsA = DpKt.m4462DpSizeYgX7TsA(m4440constructorimpl, m4440constructorimpl);
                Alignment a2 = d.a(skip.getHorizontalAlignment(), skip.getVerticalAlignment());
                PaddingValues m578PaddingValues0680j_4 = PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(skip.getPadding()));
                long foregroundColor = skip.getForegroundColor();
                long sp = TextUnitKt.getSp(skip.getControlSize());
                TextUnitKt.m4644checkArithmeticR2X_6o(sp);
                long pack = TextUnitKt.pack(TextUnit.m4629getRawTypeimpl(sp), TextUnit.m4631getValueimpl(sp) / 2);
                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.moloco_skip, composer, 0);
                long m4543timesGh9hcWk = DpSize.m4543timesGh9hcWk(m4462DpSizeYgX7TsA, 0.4f);
                Color color = skip.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(a2, m578PaddingValues0680j_4, foregroundColor, m4462DpSizeYgX7TsA, pack, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(painterResource, m4543timesGh9hcWk, null, color != null ? color.m2122unboximpl() : d.b, composer, 0, 4), null, zVar.getCountDownTimer(), composer, 0, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class f implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z b;

        public f(boolean z, com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = z;
            this.b = zVar;
        }

        public final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> function7;
            Composer composer2;
            com.moloco.sdk.internal.ortb.model.i cta;
            composer.startReplaceableGroup(483693011);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(483693011, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:134)");
            }
            if (this.a || (cta = this.b.getCta()) == null) {
                function7 = null;
                composer2 = composer;
            } else {
                Alignment a = d.a(cta.getHorizontalAlignment(), cta.getVerticalAlignment());
                PaddingValues m578PaddingValues0680j_4 = PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(cta.getPadding()));
                String text = cta.getText();
                long foregroundColor = cta.getForegroundColor();
                Color color = cta.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
                composer2 = composer;
                function7 = u.a(a, m578PaddingValues0680j_4, text, foregroundColor, color != null ? color.m2122unboximpl() : u.a(), cta.getImageUrl(), composer2, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return function7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class g implements Function2<Composer, Integer, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public g(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        public final Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a(Composer composer, int i) {
            Composer composer2;
            Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a;
            composer.startReplaceableGroup(830314579);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(830314579, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:152)");
            }
            com.moloco.sdk.internal.ortb.model.A progressBar = this.a.getProgressBar();
            if (progressBar == null) {
                a = null;
                composer2 = composer;
            } else {
                composer2 = composer;
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(d.a(progressBar.getHorizontalAlignment(), progressBar.getVerticalAlignment()), PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(progressBar.getPadding())), progressBar.getForegroundColor(), composer2, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class h implements Function2<Composer, Integer, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public final /* synthetic */ com.moloco.sdk.internal.ortb.model.z a;

        public h(com.moloco.sdk.internal.ortb.model.z zVar) {
            this.a = zVar;
        }

        public final Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(392356305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(392356305, i, -1, "com.moloco.sdk.internal.toVastOptions.<anonymous> (AggregatedOptions.kt:161)");
            }
            E vastPrivacyIcon = this.a.getVastPrivacyIcon();
            composer.startReplaceableGroup(-1135715087);
            Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a = vastPrivacyIcon == null ? null : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(d.a(vastPrivacyIcon.getHorizontalAlignment(), vastPrivacyIcon.getVerticalAlignment()), PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(vastPrivacyIcon.getPadding())), composer, 0, 0);
            composer.endReplaceableGroup();
            if (a == null) {
                a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, composer, 0, 3);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    static {
        float f2 = 30;
        e = DpKt.m4462DpSizeYgX7TsA(Dp.m4440constructorimpl(f2), Dp.m4440constructorimpl(f2));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b(com.moloco.sdk.internal.ortb.model.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(zVar, false);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h(b(zVar, false), a2, a2);
    }

    public static final com.moloco.sdk.internal.ortb.model.z c() {
        long j = c;
        int m11277constructorimpl = UInt.m11277constructorimpl(30);
        com.moloco.sdk.internal.ortb.model.u uVar = com.moloco.sdk.internal.ortb.model.u.d;
        F f2 = F.b;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Color color = null;
        D d2 = new D(5, 10, m11277constructorimpl, uVar, f2, j, color, 64, defaultConstructorMarker);
        return new com.moloco.sdk.internal.ortb.model.z(d2, d2, new com.moloco.sdk.internal.ortb.model.A(0, com.moloco.sdk.internal.ortb.model.u.c, F.d, j, null), new com.moloco.sdk.internal.ortb.model.y(false, 10, com.moloco.sdk.internal.ortb.model.u.b, f2, j, (UInt) null, color, 96, defaultConstructorMarker), (com.moloco.sdk.internal.ortb.model.i) null, true, new C2789c(false, false, (String) null, 6, (DefaultConstructorMarker) null), (E) null, (com.moloco.sdk.internal.ortb.model.l) null, (com.moloco.sdk.internal.ortb.model.k) null, (C2787a) null, (C2788b) null, (com.moloco.sdk.internal.ortb.model.v) null, 7552, (DefaultConstructorMarker) null);
    }

    public static final com.moloco.sdk.internal.ortb.model.z f() {
        return (com.moloco.sdk.internal.ortb.model.z) a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a2 = a(zVar, true);
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h(b(zVar, true), a2, a2);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h b() {
        return b(f());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a() {
        return a(f());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x b(com.moloco.sdk.internal.ortb.model.z zVar, boolean z) {
        com.moloco.sdk.internal.ortb.model.r close;
        UInt delaySeconds;
        boolean mute = zVar.getMute().getMute();
        Boolean bool = zVar.getSkip() == null ? null : Boolean.TRUE;
        D skip = zVar.getSkip();
        int i = 0;
        int delaySeconds2 = skip != null ? skip.getDelaySeconds() : 0;
        C2789c autoStore = zVar.getAutoStore();
        boolean z2 = autoStore != null && autoStore.getEnabled() && zVar.getAutoStore().getOnSkip();
        C2789c autoStore2 = zVar.getAutoStore();
        boolean z3 = autoStore2 != null && autoStore2.getEnabled();
        int delaySeconds3 = zVar.getClose().getDelaySeconds();
        com.moloco.sdk.internal.ortb.model.l lVar = zVar.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String();
        if (lVar != null && (close = lVar.getClose()) != null && (delaySeconds = close.getDelaySeconds()) != null) {
            i = delaySeconds.getData();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x(mute, bool, delaySeconds2, delaySeconds3, i, z2, z3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(0L, new c(zVar), a(zVar.getClose(), z, zVar.getCountDownTimer()), new C0232d(zVar), new e(zVar), new f(z, zVar), p.a(zVar.getIsAllAreaClickable()), new g(zVar), new h(zVar), (Function2) null, (Q) null, !z, 1537, (Object) null), zVar.getAndroidInline(), zVar.getAutoInline());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f a(com.moloco.sdk.internal.ortb.model.z zVar, boolean z) {
        com.moloco.sdk.internal.ortb.model.r close;
        UInt delaySeconds;
        int delaySeconds2 = zVar.getClose().getDelaySeconds();
        Function10 a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b.a(0L, a(z, zVar.getClose(), zVar.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String(), zVar.getCountDownTimer(), zVar.getInlineTextButton()), 1, null);
        com.moloco.sdk.internal.ortb.model.l lVar = zVar.getCom.safedk.android.analytics.brandsafety.m.Q java.lang.String();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f(delaySeconds2, a2, (lVar == null || (close = lVar.getClose()) == null || (delaySeconds = close.getDelaySeconds()) == null) ? 0 : delaySeconds.getData(), a(zVar.getClose(), z, (com.moloco.sdk.internal.ortb.model.k) null, 2, (Object) null), zVar.getAndroidInline(), zVar.getAutoInline());
    }

    public static final Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> a(boolean z, D close, com.moloco.sdk.internal.ortb.model.l lVar, com.moloco.sdk.internal.ortb.model.k kVar, com.moloco.sdk.internal.ortb.model.v vVar) {
        Intrinsics.checkNotNullParameter(close, "close");
        if (lVar == null) {
            return a(close, z, kVar);
        }
        return new a(close, vVar, kVar);
    }

    public static final Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> a(D d2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar) {
        return new b(z, d2, kVar);
    }

    public static /* synthetic */ Function2 a(D d2, boolean z, com.moloco.sdk.internal.ortb.model.k kVar, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = null;
        }
        return a(d2, z, kVar);
    }

    public static final Alignment a(com.moloco.sdk.internal.ortb.model.u horizontalAlignment, F verticalAlignment) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        F f2 = F.b;
        if (verticalAlignment == f2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) {
            return Alignment.INSTANCE.getTopStart();
        }
        if (verticalAlignment == f2 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) {
            return Alignment.INSTANCE.getTopCenter();
        }
        if (verticalAlignment == f2 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) {
            return Alignment.INSTANCE.getTopEnd();
        }
        F f3 = F.c;
        if (verticalAlignment == f3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) {
            return Alignment.INSTANCE.getCenterStart();
        }
        if (verticalAlignment == f3 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) {
            return Alignment.INSTANCE.getCenter();
        }
        if (verticalAlignment == f3 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        F f4 = F.d;
        return (verticalAlignment == f4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.b || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.e)) ? Alignment.INSTANCE.getBottomStart() : (verticalAlignment == f4 && horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.c) ? Alignment.INSTANCE.getBottomCenter() : (verticalAlignment == f4 && (horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.d || horizontalAlignment == com.moloco.sdk.internal.ortb.model.u.f)) ? Alignment.INSTANCE.getBottomEnd() : Alignment.INSTANCE.getTopStart();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q b(long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.v vVar, Composer composer, int i) {
        long j4;
        composer.startReplaceableGroup(129538364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129538364, i, -1, "com.moloco.sdk.internal.defaultMolocoSkipAfterCountdownButtonPart (AggregatedOptions.kt:184)");
        }
        composer.startReplaceableGroup(-1579299883);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q qVar = null;
        String str = null;
        if (vVar != null) {
            String textPosition = vVar.getTextPosition();
            if (textPosition != null) {
                str = textPosition.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            boolean z = !Intrinsics.areEqual(str, TtmlNode.RIGHT);
            Boolean useIcon = vVar.getUseIcon();
            boolean booleanValue = useIcon != null ? useIcon.booleanValue() : true;
            String text = vVar.getText();
            if (text == null) {
                text = "play store";
            }
            Color foregroundColor = vVar.getForegroundColor();
            long m2122unboximpl = foregroundColor != null ? foregroundColor.m2122unboximpl() : j3;
            Color color = vVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR java.lang.String();
            long m2122unboximpl2 = color != null ? color.m2122unboximpl() : j2;
            Integer num = vVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_FONT_SIZE java.lang.String();
            long sp = num != null ? TextUnitKt.getSp(num.intValue()) : TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE();
            if (vVar.getIconSize() != null) {
                float m4440constructorimpl = Dp.m4440constructorimpl(r2.intValue());
                j4 = DpKt.m4462DpSizeYgX7TsA(m4440constructorimpl, m4440constructorimpl);
            } else {
                j4 = j;
            }
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(text, null, j4, null, m2122unboximpl2, z, booleanValue, m2122unboximpl, sp, composer, 0, 10);
        }
        composer.endReplaceableGroup();
        if (qVar == null) {
            qVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(PainterResources_androidKt.painterResource(R.drawable.moloco_skip, composer, 0), j, null, j2, composer, ((i << 3) & 112) | ((i << 6) & 7168), 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return qVar;
    }
}
