package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2830j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2831k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2832l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2836p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2837q;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class r {
    public static final long a = ColorKt.Color$default(71, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 238, 0, 8, null);
    public static final long b = Color.INSTANCE.m2149getWhite0d7_KjU();

    public static final class a implements Function3<RowScope, Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ long c;

        public a(String str, Integer num, long j) {
            this.a = str;
            this.b = num;
            this.c = j;
        }

        public final void a(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-469621531, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton.<anonymous> (DEC.kt:230)");
            }
            String str = this.a;
            if (str == null) {
                str = "";
            }
            Integer num = this.b;
            TextUnit m4621boximpl = num != null ? TextUnit.m4621boximpl(TextUnitKt.getSp(num.intValue())) : null;
            composer.startReplaceableGroup(-1245056940);
            long m3970getFontSizeXSAIIZE = m4621boximpl == null ? MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getButton().m3970getFontSizeXSAIIZE() : m4621boximpl.getPackedValue();
            composer.endReplaceableGroup();
            TextKt.m1591TextfLXpl1I(str, null, this.c, m3970getFontSizeXSAIIZE, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m4382getEllipsisgIe3tQ8(), false, 1, null, null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            a(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(Modifier modifier, String str, Function0 function0, C2837q c2837q, int i, int i2, Composer composer, int i3) {
        a(modifier, str, function0, c2837q, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(String str, Function0 function0, Integer num, Integer num2, List list, boolean z, long j, long j2, int i, boolean z2, int i2, int i3, Composer composer, int i4) {
        a(str, function0, num, num2, list, z, j, j2, i, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x029e, code lost:
    
        if (r2 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02a3, code lost:
    
        if (r2 == null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Modifier modifier, final String str, final Function0<Unit> onClick, final C2837q decRenderingData, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float m4440constructorimpl;
        Modifier.Companion companion;
        int i4;
        Modifier modifier3;
        float m4440constructorimpl2;
        Modifier.Companion companion2;
        int i5;
        int i6;
        Modifier modifier4;
        Float f;
        int i7;
        float m4440constructorimpl3;
        Modifier.Companion companion3;
        float m4440constructorimpl4;
        String str2;
        final Modifier modifier5;
        Integer c;
        String h;
        String m;
        Integer n;
        String f2;
        String h2;
        Integer c2;
        List<String> d;
        List list;
        Integer f3;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(decRenderingData, "decRenderingData");
        Composer startRestartGroup = composer.startRestartGroup(-264197625);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(decRenderingData) ? 2048 : 1024;
        }
        int i9 = i3;
        if ((i9 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier5 = modifier2;
        } else {
            Modifier modifier6 = i8 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-264197625, i9, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DEC (DEC.kt:58)");
            }
            Modifier m267clickableXHw0xAI$default = ClickableKt.m267clickableXHw0xAI$default(SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null), false, null, null, onClick, 7, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m267clickableXHw0xAI$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion6 = Modifier.INSTANCE;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl2, columnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (m1642constructorimpl2.getInserting() || !Intrinsics.areEqual(m1642constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            C2830j f4 = decRenderingData.f();
            if (f4 != null && (f3 = f4.f()) != null) {
                m4440constructorimpl = Dp.m4440constructorimpl(f3.intValue());
            } else {
                m4440constructorimpl = Dp.m4440constructorimpl(128);
            }
            C2830j f5 = decRenderingData.f();
            String d2 = f5 != null ? f5.d() : null;
            C2830j f6 = decRenderingData.f();
            C2831k e = f6 != null ? f6.e() : null;
            float m4440constructorimpl5 = Dp.m4440constructorimpl(28);
            Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m634size3ABfNKs(companion6, m4440constructorimpl), 1.0f);
            if (e == null || (d = e.d()) == null) {
                companion = companion6;
                i4 = 2;
            } else {
                if (d.isEmpty()) {
                    i4 = 2;
                    list = null;
                } else {
                    i4 = 2;
                    list = CollectionsKt.listOf((Object[]) new Color[]{Color.m2102boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.first((List) d)))), Color.m2102boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.last((List) d))))});
                }
                if (list != null) {
                    Brush.Companion companion7 = Brush.INSTANCE;
                    Offset.Companion companion8 = Offset.INSTANCE;
                    modifier3 = BackgroundKt.background$default(companion6, Brush.Companion.m2063linearGradientmHitzGk$default(companion7, list, companion8.m1887getZeroF1C5BW0(), companion8.m1885getInfiniteF1C5BW0(), 0, 8, (Object) null), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(m4440constructorimpl5), 0.0f, 4, null);
                    companion = companion6;
                } else {
                    companion = companion6;
                }
                modifier3 = companion;
            }
            modifier3 = companion;
            Modifier then = zIndex.then(modifier3);
            if (e != null && (c2 = e.c()) != null) {
                m4440constructorimpl2 = Dp.m4440constructorimpl(c2.intValue());
            } else {
                m4440constructorimpl2 = Dp.m4440constructorimpl(4);
            }
            Modifier clip = ClipKt.clip(PaddingKt.m585padding3ABfNKs(then, m4440constructorimpl2), (e != null ? e.d() : null) != null ? RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(m4440constructorimpl5) : RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(0)));
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(clip);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (m1642constructorimpl3.getInserting() || !Intrinsics.areEqual(m1642constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1642constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1642constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            k.a(d2, ContentScale.INSTANCE.getCrop(), SizeKt.m634size3ABfNKs(companion, m4440constructorimpl), startRestartGroup, 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1049067275);
            if (str != null) {
                SpacerKt.Spacer(SizeKt.m620height3ABfNKs(companion, Dp.m4440constructorimpl(12)), startRestartGroup, 6);
                long m2149getWhite0d7_KjU = Color.INSTANCE.m2149getWhite0d7_KjU();
                Integer e2 = decRenderingData.e();
                TextUnit m4621boximpl = e2 != null ? TextUnit.m4621boximpl(TextUnitKt.getSp(e2.intValue())) : null;
                startRestartGroup.startReplaceableGroup(1049073645);
                long m3970getFontSizeXSAIIZE = m4621boximpl == null ? MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getButton().m3970getFontSizeXSAIIZE() : m4621boximpl.getPackedValue();
                startRestartGroup.endReplaceableGroup();
                modifier4 = modifier6;
                i6 = i9;
                i5 = i4;
                companion2 = companion;
                f = null;
                TextKt.m1591TextfLXpl1I(str, null, m2149getWhite0d7_KjU, m3970getFontSizeXSAIIZE, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m4382getEllipsisgIe3tQ8(), false, 2, null, null, startRestartGroup, ((i9 >> 3) & 14) | 196992, 3120, 55250);
                startRestartGroup = startRestartGroup;
            } else {
                companion2 = companion;
                i5 = i4;
                i6 = i9;
                modifier4 = modifier6;
                f = null;
            }
            startRestartGroup.endReplaceableGroup();
            if (decRenderingData.h() != null) {
                m4440constructorimpl3 = Dp.m4440constructorimpl(r0.i());
                i7 = 12;
            } else {
                i7 = 12;
                m4440constructorimpl3 = Dp.m4440constructorimpl(12);
            }
            float f7 = m4440constructorimpl3;
            C2836p h3 = decRenderingData.h();
            long m2150getYellow0d7_KjU = (h3 == null || (h2 = h3.h()) == null) ? Color.INSTANCE.m2150getYellow0d7_KjU() : ColorKt.Color(android.graphics.Color.parseColor(h2));
            C2836p h4 = decRenderingData.h();
            long m2142getGray0d7_KjU = (h4 == null || (f2 = h4.f()) == null) ? Color.INSTANCE.m2142getGray0d7_KjU() : ColorKt.Color(android.graphics.Color.parseColor(f2));
            C2836p h5 = decRenderingData.h();
            int g = h5 != null ? h5.g() : 9;
            C2836p h6 = decRenderingData.h();
            Float j = h6 != null ? h6.j() : f;
            startRestartGroup.startReplaceableGroup(1049096610);
            if (j == null) {
                companion3 = companion2;
            } else {
                float floatValue = j.floatValue();
                companion3 = companion2;
                SpacerKt.Spacer(SizeKt.m620height3ABfNKs(companion3, Dp.m4440constructorimpl(i7)), startRestartGroup, 6);
                w.a(floatValue, 5, f7, m2150getYellow0d7_KjU, m2142getGray0d7_KjU, g, null, startRestartGroup, 48, 64);
                Unit unit = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            C2832l g2 = decRenderingData.g();
            if (g2 != null && (n = g2.n()) != null) {
                m4440constructorimpl4 = Dp.m4440constructorimpl(n.intValue());
            } else {
                m4440constructorimpl4 = Dp.m4440constructorimpl(8);
            }
            SpacerKt.Spacer(SizeKt.m620height3ABfNKs(companion3, m4440constructorimpl4), startRestartGroup, 0);
            C2832l g3 = decRenderingData.g();
            if (g3 == null || (str2 = g3.k()) == null) {
                str2 = "GET";
            }
            C2832l g4 = decRenderingData.g();
            Integer j2 = g4 != null ? g4.j() : f;
            C2832l g5 = decRenderingData.g();
            Integer l = g5 != null ? g5.l() : f;
            C2832l g6 = decRenderingData.g();
            C2831k i10 = g6 != null ? g6.i() : f;
            C2832l g7 = decRenderingData.g();
            long Color = (g7 == null || (m = g7.m()) == null) ? b : ColorKt.Color(android.graphics.Color.parseColor(m));
            C2832l g8 = decRenderingData.g();
            long Color2 = (g8 == null || (h = g8.h()) == null) ? a : ColorKt.Color(android.graphics.Color.parseColor(h));
            if (i10 != null) {
                f = i10.d();
            }
            a(str2, onClick, j2, l, f, i10 != null, Color, Color2, (i10 == null || (c = i10.c()) == null) ? i5 : c.intValue(), false, startRestartGroup, (i6 >> 3) & 112, 512);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.a(Modifier.this, str, onClick, decRenderingData, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a9, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v2 */
    /* JADX WARN: Type inference failed for: r50v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final Function0<Unit> onClick, final Integer num, final Integer num2, final List<String> list, final boolean z, final long j, final long j2, final int i, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        boolean z3;
        boolean z4;
        State state;
        List listOf;
        Modifier modifier;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1721864917);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(num2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(j) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            j3 = j2;
            i4 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= startRestartGroup.changed(i) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
            }
            if ((i4 & 306783379) != 306783378 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                z3 = z2;
            } else {
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1721864917, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RotatingGradientButton (DEC.kt:176)");
                }
                if (!z3) {
                    startRestartGroup.startReplaceableGroup(-1672286657);
                    z4 = 1;
                    state = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    z4 = 1;
                    startRestartGroup.startReplaceableGroup(-1671934187);
                    startRestartGroup.startReplaceableGroup(2024277948);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    state = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                double radians = Math.toRadians(a(state));
                long Offset = OffsetKt.Offset(((float) Math.cos(radians)) * 300.0f, ((float) Math.sin(radians)) * 300.0f);
                double d = radians + 3.141592653589793d;
                long Offset2 = OffsetKt.Offset(((float) Math.cos(d)) * 300.0f, ((float) Math.sin(d)) * 300.0f);
                if (list == null && !list.isEmpty()) {
                    Color m2102boximpl = Color.m2102boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.first((List) list))));
                    Color m2102boximpl2 = Color.m2102boximpl(ColorKt.Color(android.graphics.Color.parseColor((String) CollectionsKt.last((List) list))));
                    Color[] colorArr = new Color[2];
                    colorArr[0] = m2102boximpl;
                    colorArr[z4] = m2102boximpl2;
                    listOf = CollectionsKt.listOf((Object[]) colorArr);
                } else {
                    long j4 = a;
                    Color m2102boximpl3 = Color.m2102boximpl(j4);
                    Color m2102boximpl4 = Color.m2102boximpl(j4);
                    Color[] colorArr2 = new Color[2];
                    colorArr2[0] = m2102boximpl3;
                    colorArr2[z4] = m2102boximpl4;
                    listOf = CollectionsKt.listOf((Object[]) colorArr2);
                }
                Brush m2063linearGradientmHitzGk$default = Brush.Companion.m2063linearGradientmHitzGk$default(Brush.INSTANCE, listOf, Offset, Offset2, 0, 8, (Object) null);
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                ButtonColors m1274buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1274buttonColorsro_MJ88(j3, j, 0L, 0L, startRestartGroup, ((i4 >> 21) & 14) | ((i4 >> 15) & 112) | (ButtonDefaults.$stable << 12), 12);
                BorderStroke borderStroke = !z ? new BorderStroke(Dp.m4440constructorimpl(i), m2063linearGradientmHitzGk$default, null) : null;
                if (num != null) {
                    modifier = SizeKt.m636sizeVpY3zN4(Modifier.INSTANCE, Dp.m4440constructorimpl(num.intValue()), Dp.m4440constructorimpl(num.intValue() * 0.33f));
                }
                modifier = Modifier.INSTANCE;
                ButtonKt.Button(onClick, modifier, false, null, null, circleShape, borderStroke, m1274buttonColorsro_MJ88, null, ComposableLambdaKt.composableLambda(startRestartGroup, -469621531, z4, new a(str, num2, j)), startRestartGroup, ((i4 >> 3) & 14) | C.ENCODING_PCM_32BIT, 284);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final boolean z5 = z3;
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.a(str, onClick, num, num2, list, z, j, j2, i, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        j3 = j2;
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z3) {
        }
        double radians2 = Math.toRadians(a(state));
        long Offset3 = OffsetKt.Offset(((float) Math.cos(radians2)) * 300.0f, ((float) Math.sin(radians2)) * 300.0f);
        double d2 = radians2 + 3.141592653589793d;
        long Offset22 = OffsetKt.Offset(((float) Math.cos(d2)) * 300.0f, ((float) Math.sin(d2)) * 300.0f);
        if (list == null) {
        }
        long j42 = a;
        Color m2102boximpl32 = Color.m2102boximpl(j42);
        Color m2102boximpl42 = Color.m2102boximpl(j42);
        Color[] colorArr22 = new Color[2];
        colorArr22[0] = m2102boximpl32;
        colorArr22[z4] = m2102boximpl42;
        listOf = CollectionsKt.listOf((Object[]) colorArr22);
        Brush m2063linearGradientmHitzGk$default2 = Brush.Companion.m2063linearGradientmHitzGk$default(Brush.INSTANCE, listOf, Offset3, Offset22, 0, 8, (Object) null);
        RoundedCornerShape circleShape2 = RoundedCornerShapeKt.getCircleShape();
        ButtonColors m1274buttonColorsro_MJ882 = ButtonDefaults.INSTANCE.m1274buttonColorsro_MJ88(j3, j, 0L, 0L, startRestartGroup, ((i4 >> 21) & 14) | ((i4 >> 15) & 112) | (ButtonDefaults.$stable << 12), 12);
        if (!z) {
        }
        if (num != null) {
        }
        modifier = Modifier.INSTANCE;
        ButtonKt.Button(onClick, modifier, false, null, null, circleShape2, borderStroke, m1274buttonColorsro_MJ882, null, ComposableLambdaKt.composableLambda(startRestartGroup, -469621531, z4, new a(str, num2, j)), startRestartGroup, ((i4 >> 3) & 14) | C.ENCODING_PCM_32BIT, 284);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-227963495);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227963495, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.DECPreview (DEC.kt:246)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, m.a.a(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float a(State<Float> state) {
        return state.getValue().floatValue();
    }
}
