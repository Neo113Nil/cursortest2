package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¬\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a¢\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m4440constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0066  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1556TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Function2<? super Composer, ? super Integer, Unit> m1355getLambda1$material_release;
        Composer composer2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-249175289);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)131@6500L6,132@6549L32,145@7022L1504:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i4 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i4 |= i8;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 2048;
                        i4 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 1024;
                i4 |= i7;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changed(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    function22 = function2;
                    i4 |= startRestartGroup.changed(function22) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        i4 |= startRestartGroup.changed(tabs) ? 1048576 : 524288;
                    }
                    if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            if (i5 != 0) {
                                function32 = ComposableLambdaKt.composableLambda(startRestartGroup, -553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                        invoke((List<TabPosition>) list, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(List<TabPosition> tabPositions, Composer composer3, int i10) {
                                        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                        ComposerKt.sourceInformation(composer3, "C135@6733L100:TabRow.kt#jmzs0o");
                                        TabRowDefaults.INSTANCE.m1549Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                m1355getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1355getLambda1$material_release();
                                long j7 = j3;
                                final int i10 = i4;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function32;
                                startRestartGroup.endDefaults();
                                composer2 = startRestartGroup;
                                long j8 = j4;
                                SurfaceKt.m1520SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j7, j8, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        ComposerKt.sourceInformation(composer3, "C150@7205L1315,150@7163L1357:TabRow.kt#jmzs0o");
                                        if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        final Function2<Composer, Integer, Unit> function24 = tabs;
                                        final Function2<Composer, Integer, Unit> function25 = m1355getLambda1$material_release;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                        final int i12 = i10;
                                        composer3.startReplaceableGroup(1618982084);
                                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                        boolean changed = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function35);
                                        Object rememberedValue = composer3.rememberedValue();
                                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                    return m1558invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                public final MeasureResult m1558invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                                    Object next;
                                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                    final int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j9);
                                                    List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                                    int size = subcompose.size();
                                                    final int i13 = m4396getMaxWidthimpl / size;
                                                    List<Measurable> list = subcompose;
                                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                    Iterator<T> it = list.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                                    }
                                                    final ArrayList arrayList2 = arrayList;
                                                    Iterator it2 = arrayList2.iterator();
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (it2.hasNext()) {
                                                            int height = ((Placeable) next).getHeight();
                                                            do {
                                                                Object next2 = it2.next();
                                                                int height2 = ((Placeable) next2).getHeight();
                                                                if (height < height2) {
                                                                    next = next2;
                                                                    height = height2;
                                                                }
                                                            } while (it2.hasNext());
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                    Placeable placeable = (Placeable) next;
                                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                                    ArrayList arrayList3 = new ArrayList(size);
                                                    for (int i14 = 0; i14 < size; i14++) {
                                                        arrayList3.add(new TabPosition(Dp.m4440constructorimpl(SubcomposeLayout.mo333toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo333toDpu2uoSUM(i13), null));
                                                    }
                                                    final ArrayList arrayList4 = arrayList3;
                                                    final Function2<Composer, Integer, Unit> function26 = function25;
                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                    final int i15 = i12;
                                                    final int i16 = height3;
                                                    return MeasureScope.layout$default(SubcomposeLayout, m4396getMaxWidthimpl, i16, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                            invoke2(placementScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(Placeable.PlacementScope layout) {
                                                            Placeable.PlacementScope placementScope = layout;
                                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                            List<Placeable> list2 = arrayList2;
                                                            int i17 = i13;
                                                            int i18 = 0;
                                                            for (Object obj : list2) {
                                                                int i19 = i18 + 1;
                                                                if (i18 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                                placementScope = layout;
                                                                i18 = i19;
                                                            }
                                                            List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                            long j10 = j9;
                                                            int i20 = i16;
                                                            Iterator<T> it3 = subcompose2.iterator();
                                                            while (it3.hasNext()) {
                                                                Placeable mo3383measureBRTryo0 = ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                                                Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, i20 - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                j10 = j10;
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function37 = function36;
                                                            final List<TabPosition> list3 = arrayList4;
                                                            final int i21 = i15;
                                                            List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                    invoke(composer4, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer4, int i22) {
                                                                    ComposerKt.sourceInformation(composer4, "C176@8330L23:TabRow.kt#jmzs0o");
                                                                    if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                                        composer4.skipToGroupEnd();
                                                                    } else {
                                                                        function37.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                                    }
                                                                }
                                                            }));
                                                            int i22 = m4396getMaxWidthimpl;
                                                            int i23 = i16;
                                                            Iterator<T> it4 = subcompose3.iterator();
                                                            while (it4.hasNext()) {
                                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                            }
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue);
                                        }
                                        composer3.endReplaceableGroup();
                                        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer3, 6, 0);
                                    }
                                }), composer2, (i10 & 896) | 1572864 | (i10 & 7168), 50);
                                function33 = function34;
                                function23 = m1355getLambda1$material_release;
                                modifier3 = modifier2;
                                j5 = j7;
                                j6 = j8;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                        }
                        m1355getLambda1$material_release = function22;
                        long j72 = j3;
                        final int i102 = i4;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342 = function32;
                        startRestartGroup.endDefaults();
                        composer2 = startRestartGroup;
                        long j82 = j4;
                        SurfaceKt.m1520SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j72, j82, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11) {
                                ComposerKt.sourceInformation(composer3, "C150@7205L1315,150@7163L1357:TabRow.kt#jmzs0o");
                                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = m1355getLambda1$material_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function342;
                                final int i12 = i102;
                                composer3.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean changed = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function35);
                                Object rememberedValue = composer3.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m1558invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m1558invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                            Object next;
                                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                            final int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j9);
                                            List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                            int size = subcompose.size();
                                            final int i13 = m4396getMaxWidthimpl / size;
                                            List<Measurable> list = subcompose;
                                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                            Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                            }
                                            final List<? extends Placeable> arrayList2 = arrayList;
                                            Iterator it2 = arrayList2.iterator();
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (it2.hasNext()) {
                                                    int height = ((Placeable) next).getHeight();
                                                    do {
                                                        Object next2 = it2.next();
                                                        int height2 = ((Placeable) next2).getHeight();
                                                        if (height < height2) {
                                                            next = next2;
                                                            height = height2;
                                                        }
                                                    } while (it2.hasNext());
                                                }
                                            } else {
                                                next = null;
                                            }
                                            Placeable placeable = (Placeable) next;
                                            int height3 = placeable != null ? placeable.getHeight() : 0;
                                            ArrayList arrayList3 = new ArrayList(size);
                                            for (int i14 = 0; i14 < size; i14++) {
                                                arrayList3.add(new TabPosition(Dp.m4440constructorimpl(SubcomposeLayout.mo333toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo333toDpu2uoSUM(i13), null));
                                            }
                                            final List<TabPosition> arrayList4 = arrayList3;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                            final int i15 = i12;
                                            final int i16 = height3;
                                            return MeasureScope.layout$default(SubcomposeLayout, m4396getMaxWidthimpl, i16, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope layout) {
                                                    Placeable.PlacementScope placementScope = layout;
                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                    List<Placeable> list2 = arrayList2;
                                                    int i17 = i13;
                                                    int i18 = 0;
                                                    for (Object obj : list2) {
                                                        int i19 = i18 + 1;
                                                        if (i18 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                        placementScope = layout;
                                                        i18 = i19;
                                                    }
                                                    List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                    long j10 = j9;
                                                    int i20 = i16;
                                                    Iterator<T> it3 = subcompose2.iterator();
                                                    while (it3.hasNext()) {
                                                        Placeable mo3383measureBRTryo0 = ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, i20 - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        j10 = j10;
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                                    final List<TabPosition> list3 = arrayList4;
                                                    final int i21 = i15;
                                                    List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i22) {
                                                            ComposerKt.sourceInformation(composer4, "C176@8330L23:TabRow.kt#jmzs0o");
                                                            if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                            } else {
                                                                function37.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                            }
                                                        }
                                                    }));
                                                    int i22 = m4396getMaxWidthimpl;
                                                    int i23 = i16;
                                                    Iterator<T> it4 = subcompose3.iterator();
                                                    while (it4.hasNext()) {
                                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer3, 6, 0);
                            }
                        }), composer2, (i102 & 896) | 1572864 | (i102 & 7168), 50);
                        function33 = function342;
                        function23 = m1355getLambda1$material_release;
                        modifier3 = modifier2;
                        j5 = j72;
                        j6 = j82;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                        function33 = function32;
                        function23 = function22;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i11) {
                            TabRowKt.m1556TabRowpAZo6Ak(i, modifier3, j5, j6, function33, function23, tabs, composer3, i2 | 1, i3);
                        }
                    });
                    return;
                }
                function22 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((2995931 & i4) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                m1355getLambda1$material_release = function22;
                long j722 = j3;
                final int i1022 = i4;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3422 = function32;
                startRestartGroup.endDefaults();
                composer2 = startRestartGroup;
                long j822 = j4;
                SurfaceKt.m1520SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j722, j822, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i11) {
                        ComposerKt.sourceInformation(composer3, "C150@7205L1315,150@7163L1357:TabRow.kt#jmzs0o");
                        if ((i11 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function25 = m1355getLambda1$material_release;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function3422;
                        final int i12 = i1022;
                        composer3.startReplaceableGroup(1618982084);
                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                        boolean changed = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function35);
                        Object rememberedValue = composer3.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1558invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1558invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                    Object next;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    final int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j9);
                                    List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                    int size = subcompose.size();
                                    final int i13 = m4396getMaxWidthimpl / size;
                                    List<Measurable> list = subcompose;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                    }
                                    final List<? extends Placeable> arrayList2 = arrayList;
                                    Iterator it2 = arrayList2.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            int height = ((Placeable) next).getHeight();
                                            do {
                                                Object next2 = it2.next();
                                                int height2 = ((Placeable) next2).getHeight();
                                                if (height < height2) {
                                                    next = next2;
                                                    height = height2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    Placeable placeable = (Placeable) next;
                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                    ArrayList arrayList3 = new ArrayList(size);
                                    for (int i14 = 0; i14 < size; i14++) {
                                        arrayList3.add(new TabPosition(Dp.m4440constructorimpl(SubcomposeLayout.mo333toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo333toDpu2uoSUM(i13), null));
                                    }
                                    final List<TabPosition> arrayList4 = arrayList3;
                                    final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                    final int i15 = i12;
                                    final int i16 = height3;
                                    return MeasureScope.layout$default(SubcomposeLayout, m4396getMaxWidthimpl, i16, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope layout) {
                                            Placeable.PlacementScope placementScope = layout;
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            List<Placeable> list2 = arrayList2;
                                            int i17 = i13;
                                            int i18 = 0;
                                            for (Object obj : list2) {
                                                int i19 = i18 + 1;
                                                if (i18 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                placementScope = layout;
                                                i18 = i19;
                                            }
                                            List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                            long j10 = j9;
                                            int i20 = i16;
                                            Iterator<T> it3 = subcompose2.iterator();
                                            while (it3.hasNext()) {
                                                Placeable mo3383measureBRTryo0 = ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, i20 - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                j10 = j10;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                            final List<TabPosition> list3 = arrayList4;
                                            final int i21 = i15;
                                            List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i22) {
                                                    ComposerKt.sourceInformation(composer4, "C176@8330L23:TabRow.kt#jmzs0o");
                                                    if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                    } else {
                                                        function37.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            int i22 = m4396getMaxWidthimpl;
                                            int i23 = i16;
                                            Iterator<T> it4 = subcompose3.iterator();
                                            while (it4.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        composer3.endReplaceableGroup();
                        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer3, 6, 0);
                    }
                }), composer2, (i1022 & 896) | 1572864 | (i1022 & 7168), 50);
                function33 = function3422;
                function23 = m1355getLambda1$material_release;
                modifier3 = modifier2;
                j5 = j722;
                j6 = j822;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function22 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((2995931 & i4) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            m1355getLambda1$material_release = function22;
            long j7222 = j3;
            final int i10222 = i4;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34222 = function32;
            startRestartGroup.endDefaults();
            composer2 = startRestartGroup;
            long j8222 = j4;
            SurfaceKt.m1520SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j7222, j8222, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i11) {
                    ComposerKt.sourceInformation(composer3, "C150@7205L1315,150@7163L1357:TabRow.kt#jmzs0o");
                    if ((i11 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                    final Function2<? super Composer, ? super Integer, Unit> function25 = m1355getLambda1$material_release;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34222;
                    final int i12 = i10222;
                    composer3.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                    boolean changed = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function35);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1558invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1558invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                Object next;
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                final int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j9);
                                List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                int size = subcompose.size();
                                final int i13 = m4396getMaxWidthimpl / size;
                                List<Measurable> list = subcompose;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                }
                                final List<? extends Placeable> arrayList2 = arrayList;
                                Iterator it2 = arrayList2.iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        int height = ((Placeable) next).getHeight();
                                        do {
                                            Object next2 = it2.next();
                                            int height2 = ((Placeable) next2).getHeight();
                                            if (height < height2) {
                                                next = next2;
                                                height = height2;
                                            }
                                        } while (it2.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                Placeable placeable = (Placeable) next;
                                int height3 = placeable != null ? placeable.getHeight() : 0;
                                ArrayList arrayList3 = new ArrayList(size);
                                for (int i14 = 0; i14 < size; i14++) {
                                    arrayList3.add(new TabPosition(Dp.m4440constructorimpl(SubcomposeLayout.mo333toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo333toDpu2uoSUM(i13), null));
                                }
                                final List<TabPosition> arrayList4 = arrayList3;
                                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                final int i15 = i12;
                                final int i16 = height3;
                                return MeasureScope.layout$default(SubcomposeLayout, m4396getMaxWidthimpl, i16, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope layout) {
                                        Placeable.PlacementScope placementScope = layout;
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        List<Placeable> list2 = arrayList2;
                                        int i17 = i13;
                                        int i18 = 0;
                                        for (Object obj : list2) {
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                            placementScope = layout;
                                            i18 = i19;
                                        }
                                        List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                        long j10 = j9;
                                        int i20 = i16;
                                        Iterator<T> it3 = subcompose2.iterator();
                                        while (it3.hasNext()) {
                                            Placeable mo3383measureBRTryo0 = ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, i20 - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            j10 = j10;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                        final List<TabPosition> list3 = arrayList4;
                                        final int i21 = i15;
                                        List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i22) {
                                                ComposerKt.sourceInformation(composer4, "C176@8330L23:TabRow.kt#jmzs0o");
                                                if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    function37.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                }
                                            }
                                        }));
                                        int i22 = m4396getMaxWidthimpl;
                                        int i23 = i16;
                                        Iterator<T> it4 = subcompose3.iterator();
                                        while (it4.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    composer3.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer3, 6, 0);
                }
            }), composer2, (i10222 & 896) | 1572864 | (i10222 & 7168), 50);
            function33 = function34222;
            function23 = m1355getLambda1$material_release;
            modifier3 = modifier2;
            j5 = j7222;
            j6 = j8222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function22 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((2995931 & i4) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        m1355getLambda1$material_release = function22;
        long j72222 = j3;
        final int i102222 = i4;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342222 = function32;
        startRestartGroup.endDefaults();
        composer2 = startRestartGroup;
        long j82222 = j4;
        SurfaceKt.m1520SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j72222, j82222, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i11) {
                ComposerKt.sourceInformation(composer3, "C150@7205L1315,150@7163L1357:TabRow.kt#jmzs0o");
                if ((i11 & 11) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                final Function2<? super Composer, ? super Integer, Unit> function25 = m1355getLambda1$material_release;
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function342222;
                final int i12 = i102222;
                composer3.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                boolean changed = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function35);
                Object rememberedValue = composer3.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m1558invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m1558invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                            Object next;
                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                            final int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j9);
                            List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                            int size = subcompose.size();
                            final int i13 = m4396getMaxWidthimpl / size;
                            List<Measurable> list = subcompose;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                            }
                            final List<? extends Placeable> arrayList2 = arrayList;
                            Iterator it2 = arrayList2.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    int height = ((Placeable) next).getHeight();
                                    do {
                                        Object next2 = it2.next();
                                        int height2 = ((Placeable) next2).getHeight();
                                        if (height < height2) {
                                            next = next2;
                                            height = height2;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Placeable placeable = (Placeable) next;
                            int height3 = placeable != null ? placeable.getHeight() : 0;
                            ArrayList arrayList3 = new ArrayList(size);
                            for (int i14 = 0; i14 < size; i14++) {
                                arrayList3.add(new TabPosition(Dp.m4440constructorimpl(SubcomposeLayout.mo333toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo333toDpu2uoSUM(i13), null));
                            }
                            final List<TabPosition> arrayList4 = arrayList3;
                            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                            final int i15 = i12;
                            final int i16 = height3;
                            return MeasureScope.layout$default(SubcomposeLayout, m4396getMaxWidthimpl, i16, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope layout) {
                                    Placeable.PlacementScope placementScope = layout;
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    List<Placeable> list2 = arrayList2;
                                    int i17 = i13;
                                    int i18 = 0;
                                    for (Object obj : list2) {
                                        int i19 = i18 + 1;
                                        if (i18 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                        placementScope = layout;
                                        i18 = i19;
                                    }
                                    List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                    long j10 = j9;
                                    int i20 = i16;
                                    Iterator<T> it3 = subcompose2.iterator();
                                    while (it3.hasNext()) {
                                        Placeable mo3383measureBRTryo0 = ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                        Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, i20 - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        j10 = j10;
                                    }
                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                    final List<TabPosition> list3 = arrayList4;
                                    final int i21 = i15;
                                    List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i22) {
                                            ComposerKt.sourceInformation(composer4, "C176@8330L23:TabRow.kt#jmzs0o");
                                            if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                function37.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & 112) | 8));
                                            }
                                        }
                                    }));
                                    int i22 = m4396getMaxWidthimpl;
                                    int i23 = i16;
                                    Iterator<T> it4 = subcompose3.iterator();
                                    while (it4.hasNext()) {
                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                    }
                                }
                            }, 4, null);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue);
                }
                composer3.endReplaceableGroup();
                SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer3, 6, 0);
            }
        }), composer2, (i102222 & 896) | 1572864 | (i102222 & 7168), 50);
        function33 = function342222;
        function23 = m1355getLambda1$material_release;
        modifier3 = modifier2;
        j5 = j72222;
        j6 = j82222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ab  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1555ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        int i8;
        int i9;
        float m1552getScrollableTabRowPaddingD9Ej5fM;
        int i10;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composer2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34;
        final float f3;
        final long j5;
        final long j6;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-1473476840);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)225@11134L6,226@11183L32,240@11718L3006:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i13 = 256;
                        i4 |= i13;
                    }
                } else {
                    j3 = j;
                }
                i13 = 128;
                i4 |= i13;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i12 = 2048;
                        i4 |= i12;
                    }
                } else {
                    j4 = j2;
                }
                i12 = 1024;
                i4 |= i12;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changed(function32) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i8 = i4 | 1572864;
                    } else {
                        int i15 = i4;
                        if ((i2 & 3670016) == 0) {
                            i8 = i15 | (startRestartGroup.changed(function2) ? 1048576 : 524288);
                        } else {
                            i8 = i15;
                        }
                    }
                    if ((i3 & 128) != 0) {
                        i11 = (29360128 & i2) == 0 ? startRestartGroup.changed(tabs) ? 8388608 : 4194304 : 12582912;
                        i9 = i8;
                        if ((i9 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                    i9 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i9 >> 6) & 14);
                                    i9 &= -7169;
                                }
                                m1552getScrollableTabRowPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m1552getScrollableTabRowPaddingD9Ej5fM() : f2;
                                ComposableLambda composableLambda = i6 != 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                        invoke((List<TabPosition>) list, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(List<TabPosition> tabPositions, Composer composer3, int i16) {
                                        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                        ComposerKt.sourceInformation(composer3, "C230@11429L100:TabRow.kt#jmzs0o");
                                        TabRowDefaults.INSTANCE.m1549Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                    }
                                }) : function32;
                                if (i7 != 0) {
                                    function22 = ComposableSingletons$TabRowKt.INSTANCE.m1356getLambda2$material_release();
                                    Modifier modifier4 = companion;
                                    i10 = i9;
                                    function33 = composableLambda;
                                    modifier2 = modifier4;
                                } else {
                                    Modifier modifier5 = companion;
                                    i10 = i9;
                                    function33 = composableLambda;
                                    modifier2 = modifier5;
                                    function22 = function2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i9 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i9 &= -7169;
                                }
                                function22 = function2;
                                i10 = i9;
                                m1552getScrollableTabRowPaddingD9Ej5fM = f2;
                                function33 = function32;
                                modifier2 = modifier;
                            }
                            long j7 = j3;
                            long j8 = j4;
                            startRestartGroup.endDefaults();
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function33;
                            final int i16 = i10;
                            final float f4 = m1552getScrollableTabRowPaddingD9Ej5fM;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                            composer2 = startRestartGroup;
                            SurfaceKt.m1520SurfaceFjzlyU(modifier2, null, j7, j8, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i17) {
                                    ComposerKt.sourceInformation(composer3, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                                    if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                        composer3.startReplaceableGroup(773894976);
                                        ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                        composer3.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = composer3.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        composer3.endReplaceableGroup();
                                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                        composer3.endReplaceableGroup();
                                        composer3.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean changed = composer3.changed(rememberScrollState) | composer3.changed(coroutineScope);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                                            composer3.updateRememberedValue(rememberedValue2);
                                        }
                                        composer3.endReplaceableGroup();
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                        final float f5 = f4;
                                        final Function2<Composer, Integer, Unit> function25 = tabs;
                                        final Function2<Composer, Integer, Unit> function26 = function24;
                                        final int i18 = i;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                        final int i19 = i16;
                                        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m1557invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m1557invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                                float f6;
                                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                int i20 = SubcomposeLayout.mo330roundToPx0680j_4(f6);
                                                final int i21 = SubcomposeLayout.mo330roundToPx0680j_4(f5);
                                                long m4387copyZbe2FdA$default = Constraints.m4387copyZbe2FdA$default(j9, i20, 0, 0, 0, 14, null);
                                                List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function25);
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                                Iterator<T> it = subcompose.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(m4387copyZbe2FdA$default));
                                                }
                                                final ArrayList<Placeable> arrayList2 = arrayList;
                                                final Ref.IntRef intRef = new Ref.IntRef();
                                                intRef.element = i21 * 2;
                                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                                for (Placeable placeable : arrayList2) {
                                                    intRef.element += placeable.getWidth();
                                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                }
                                                int i22 = intRef.element;
                                                int i23 = intRef2.element;
                                                final Function2<Composer, Integer, Unit> function27 = function26;
                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i24 = i18;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function37 = function36;
                                                final int i25 = i19;
                                                return MeasureScope.layout$default(SubcomposeLayout, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Placeable.PlacementScope layout) {
                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                        final ArrayList arrayList3 = new ArrayList();
                                                        int i26 = i21;
                                                        List<Placeable> list = arrayList2;
                                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                        int i27 = i26;
                                                        for (Placeable placeable2 : list) {
                                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, i27, 0, 0.0f, 4, null);
                                                            arrayList3.add(new TabPosition(subcomposeMeasureScope.mo333toDpu2uoSUM(i27), subcomposeMeasureScope.mo333toDpu2uoSUM(placeable2.getWidth()), null));
                                                            i27 += placeable2.getWidth();
                                                        }
                                                        List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function27);
                                                        long j10 = j9;
                                                        Ref.IntRef intRef3 = intRef;
                                                        Ref.IntRef intRef4 = intRef2;
                                                        Iterator<T> it2 = subcompose2.iterator();
                                                        while (it2.hasNext()) {
                                                            long j11 = j10;
                                                            Placeable mo3383measureBRTryo0 = ((Measurable) it2.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                            Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, intRef4.element - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            j10 = j11;
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function38 = function37;
                                                        final int i28 = i25;
                                                        List<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i29) {
                                                                ComposerKt.sourceInformation(composer4, "C301@14269L23:TabRow.kt#jmzs0o");
                                                                if ((i29 & 11) == 2 && composer4.getSkipping()) {
                                                                    composer4.skipToGroupEnd();
                                                                } else {
                                                                    function38.invoke(arrayList3, composer4, Integer.valueOf(((i28 >> 12) & 112) | 8));
                                                                }
                                                            }
                                                        }));
                                                        Ref.IntRef intRef5 = intRef;
                                                        Ref.IntRef intRef6 = intRef2;
                                                        Iterator<T> it3 = subcompose3.iterator();
                                                        while (it3.hasNext()) {
                                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.onLaidOut(SubcomposeLayout, i21, arrayList3, i24);
                                                    }
                                                }, 4, null);
                                            }
                                        }, composer3, 0, 0);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, ((i16 >> 3) & 14) | 1572864 | (i16 & 896) | (i16 & 7168), 50);
                            function34 = function35;
                            f3 = m1552getScrollableTabRowPaddingD9Ej5fM;
                            j5 = j7;
                            j6 = j8;
                            function23 = function24;
                            modifier3 = modifier2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function23 = function2;
                            composer2 = startRestartGroup;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            function34 = function32;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i17) {
                                TabRowKt.m1555ScrollableTabRowsKfQg0A(i, modifier3, j5, j6, f3, function34, function23, tabs, composer3, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i8 |= i11;
                    i9 = i8;
                    if ((i9 & 23967451) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    long j72 = j3;
                    long j82 = j4;
                    startRestartGroup.endDefaults();
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function352 = function33;
                    final int i162 = i10;
                    final float f42 = m1552getScrollableTabRowPaddingD9Ej5fM;
                    final Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1520SurfaceFjzlyU(modifier2, null, j72, j82, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i17) {
                            ComposerKt.sourceInformation(composer3, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                            if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                composer3.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                composer3.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue = composer3.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composer3.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed = composer3.changed(rememberScrollState) | composer3.changed(coroutineScope);
                                Object rememberedValue2 = composer3.rememberedValue();
                                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                final float f5 = f42;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = tabs;
                                final Function2<? super Composer, ? super Integer, Unit> function26 = function242;
                                final int i18 = i;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function352;
                                final int i19 = i162;
                                SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m1557invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1557invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                        float f6;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                        int i20 = SubcomposeLayout.mo330roundToPx0680j_4(f6);
                                        final int i21 = SubcomposeLayout.mo330roundToPx0680j_4(f5);
                                        long m4387copyZbe2FdA$default = Constraints.m4387copyZbe2FdA$default(j9, i20, 0, 0, 0, 14, null);
                                        List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function25);
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                        Iterator<T> it = subcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(m4387copyZbe2FdA$default));
                                        }
                                        final List<? extends Placeable> arrayList2 = arrayList;
                                        final Ref.IntRef intRef = new Ref.IntRef();
                                        intRef.element = i21 * 2;
                                        final Ref.IntRef intRef2 = new Ref.IntRef();
                                        for (Placeable placeable : arrayList2) {
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                        }
                                        int i22 = intRef.element;
                                        int i23 = intRef2.element;
                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i24 = i18;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                        final int i25 = i19;
                                        return MeasureScope.layout$default(SubcomposeLayout, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope layout) {
                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                int i26 = i21;
                                                List<Placeable> list = arrayList2;
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                int i27 = i26;
                                                for (Placeable placeable2 : list) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable2, i27, 0, 0.0f, 4, null);
                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope.mo333toDpu2uoSUM(i27), subcomposeMeasureScope.mo333toDpu2uoSUM(placeable2.getWidth()), null));
                                                    i27 += placeable2.getWidth();
                                                }
                                                List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function27);
                                                long j10 = j9;
                                                Ref.IntRef intRef3 = intRef;
                                                Ref.IntRef intRef4 = intRef2;
                                                Iterator<T> it2 = subcompose2.iterator();
                                                while (it2.hasNext()) {
                                                    long j11 = j10;
                                                    Placeable mo3383measureBRTryo0 = ((Measurable) it2.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, intRef4.element - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    j10 = j11;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function38 = function37;
                                                final int i28 = i25;
                                                List<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i29) {
                                                        ComposerKt.sourceInformation(composer4, "C301@14269L23:TabRow.kt#jmzs0o");
                                                        if ((i29 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                        } else {
                                                            function38.invoke(arrayList3, composer4, Integer.valueOf(((i28 >> 12) & 112) | 8));
                                                        }
                                                    }
                                                }));
                                                Ref.IntRef intRef5 = intRef;
                                                Ref.IntRef intRef6 = intRef2;
                                                Iterator<T> it3 = subcompose3.iterator();
                                                while (it3.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.onLaidOut(SubcomposeLayout, i21, arrayList3, i24);
                                            }
                                        }, 4, null);
                                    }
                                }, composer3, 0, 0);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ((i162 >> 3) & 14) | 1572864 | (i162 & 896) | (i162 & 7168), 50);
                    function34 = function352;
                    f3 = m1552getScrollableTabRowPaddingD9Ej5fM;
                    j5 = j72;
                    j6 = j82;
                    function23 = function242;
                    modifier3 = modifier2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                i8 |= i11;
                i9 = i8;
                if ((i9 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                long j722 = j3;
                long j822 = j4;
                startRestartGroup.endDefaults();
                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3522 = function33;
                final int i1622 = i10;
                final float f422 = m1552getScrollableTabRowPaddingD9Ej5fM;
                final Function2<? super Composer, ? super Integer, Unit> function2422 = function22;
                composer2 = startRestartGroup;
                SurfaceKt.m1520SurfaceFjzlyU(modifier2, null, j722, j822, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i17) {
                        ComposerKt.sourceInformation(composer3, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                        if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                            composer3.startReplaceableGroup(773894976);
                            ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            composer3.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                            Object rememberedValue = composer3.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer3.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            composer3.endReplaceableGroup();
                            composer3.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                            boolean changed = composer3.changed(rememberScrollState) | composer3.changed(coroutineScope);
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                            Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                            final float f5 = f422;
                            final Function2<? super Composer, ? super Integer, Unit> function25 = tabs;
                            final Function2<? super Composer, ? super Integer, Unit> function26 = function2422;
                            final int i18 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function3522;
                            final int i19 = i1622;
                            SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m1557invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1557invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                    float f6;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                    int i20 = SubcomposeLayout.mo330roundToPx0680j_4(f6);
                                    final int i21 = SubcomposeLayout.mo330roundToPx0680j_4(f5);
                                    long m4387copyZbe2FdA$default = Constraints.m4387copyZbe2FdA$default(j9, i20, 0, 0, 0, 14, null);
                                    List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function25);
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                    Iterator<T> it = subcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(m4387copyZbe2FdA$default));
                                    }
                                    final List<? extends Placeable> arrayList2 = arrayList;
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    intRef.element = i21 * 2;
                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                    for (Placeable placeable : arrayList2) {
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i22 = intRef.element;
                                    int i23 = intRef2.element;
                                    final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i24 = i18;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                    final int i25 = i19;
                                    return MeasureScope.layout$default(SubcomposeLayout, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            final List<TabPosition> arrayList3 = new ArrayList();
                                            int i26 = i21;
                                            List<Placeable> list = arrayList2;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int i27 = i26;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, i27, 0, 0.0f, 4, null);
                                                arrayList3.add(new TabPosition(subcomposeMeasureScope.mo333toDpu2uoSUM(i27), subcomposeMeasureScope.mo333toDpu2uoSUM(placeable2.getWidth()), null));
                                                i27 += placeable2.getWidth();
                                            }
                                            List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function27);
                                            long j10 = j9;
                                            Ref.IntRef intRef3 = intRef;
                                            Ref.IntRef intRef4 = intRef2;
                                            Iterator<T> it2 = subcompose2.iterator();
                                            while (it2.hasNext()) {
                                                long j11 = j10;
                                                Placeable mo3383measureBRTryo0 = ((Measurable) it2.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, intRef4.element - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                j10 = j11;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function38 = function37;
                                            final int i28 = i25;
                                            List<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i29) {
                                                    ComposerKt.sourceInformation(composer4, "C301@14269L23:TabRow.kt#jmzs0o");
                                                    if ((i29 & 11) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                    } else {
                                                        function38.invoke(arrayList3, composer4, Integer.valueOf(((i28 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref.IntRef intRef5 = intRef;
                                            Ref.IntRef intRef6 = intRef2;
                                            Iterator<T> it3 = subcompose3.iterator();
                                            while (it3.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, i21, arrayList3, i24);
                                        }
                                    }, 4, null);
                                }
                            }, composer3, 0, 0);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, ((i1622 >> 3) & 14) | 1572864 | (i1622 & 896) | (i1622 & 7168), 50);
                function34 = function3522;
                f3 = m1552getScrollableTabRowPaddingD9Ej5fM;
                j5 = j722;
                j6 = j822;
                function23 = function2422;
                modifier3 = modifier2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i8 |= i11;
            i9 = i8;
            if ((i9 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            long j7222 = j3;
            long j8222 = j4;
            startRestartGroup.endDefaults();
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35222 = function33;
            final int i16222 = i10;
            final float f4222 = m1552getScrollableTabRowPaddingD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function24222 = function22;
            composer2 = startRestartGroup;
            SurfaceKt.m1520SurfaceFjzlyU(modifier2, null, j7222, j8222, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i17) {
                    ComposerKt.sourceInformation(composer3, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                    if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                        composer3.startReplaceableGroup(773894976);
                        ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        composer3.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        Object rememberedValue = composer3.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer3.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed = composer3.changed(rememberScrollState) | composer3.changed(coroutineScope);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                        final float f5 = f4222;
                        final Function2<? super Composer, ? super Integer, Unit> function25 = tabs;
                        final Function2<? super Composer, ? super Integer, Unit> function26 = function24222;
                        final int i18 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35222;
                        final int i19 = i16222;
                        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m1557invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1557invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                float f6;
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                int i20 = SubcomposeLayout.mo330roundToPx0680j_4(f6);
                                final int i21 = SubcomposeLayout.mo330roundToPx0680j_4(f5);
                                long m4387copyZbe2FdA$default = Constraints.m4387copyZbe2FdA$default(j9, i20, 0, 0, 0, 14, null);
                                List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function25);
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                Iterator<T> it = subcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(m4387copyZbe2FdA$default));
                                }
                                final List<? extends Placeable> arrayList2 = arrayList;
                                final Ref.IntRef intRef = new Ref.IntRef();
                                intRef.element = i21 * 2;
                                final Ref.IntRef intRef2 = new Ref.IntRef();
                                for (Placeable placeable : arrayList2) {
                                    intRef.element += placeable.getWidth();
                                    intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i22 = intRef.element;
                                int i23 = intRef2.element;
                                final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i24 = i18;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                final int i25 = i19;
                                return MeasureScope.layout$default(SubcomposeLayout, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        final List<TabPosition> arrayList3 = new ArrayList();
                                        int i26 = i21;
                                        List<Placeable> list = arrayList2;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int i27 = i26;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, i27, 0, 0.0f, 4, null);
                                            arrayList3.add(new TabPosition(subcomposeMeasureScope.mo333toDpu2uoSUM(i27), subcomposeMeasureScope.mo333toDpu2uoSUM(placeable2.getWidth()), null));
                                            i27 += placeable2.getWidth();
                                        }
                                        List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function27);
                                        long j10 = j9;
                                        Ref.IntRef intRef3 = intRef;
                                        Ref.IntRef intRef4 = intRef2;
                                        Iterator<T> it2 = subcompose2.iterator();
                                        while (it2.hasNext()) {
                                            long j11 = j10;
                                            Placeable mo3383measureBRTryo0 = ((Measurable) it2.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, intRef3.element, intRef3.element, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, intRef4.element - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            j10 = j11;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function38 = function37;
                                        final int i28 = i25;
                                        List<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i29) {
                                                ComposerKt.sourceInformation(composer4, "C301@14269L23:TabRow.kt#jmzs0o");
                                                if ((i29 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    function38.invoke(arrayList3, composer4, Integer.valueOf(((i28 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref.IntRef intRef5 = intRef;
                                        Ref.IntRef intRef6 = intRef2;
                                        Iterator<T> it3 = subcompose3.iterator();
                                        while (it3.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, i21, arrayList3, i24);
                                    }
                                }, 4, null);
                            }
                        }, composer3, 0, 0);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i16222 >> 3) & 14) | 1572864 | (i16222 & 896) | (i16222 & 7168), 50);
            function34 = function35222;
            f3 = m1552getScrollableTabRowPaddingD9Ej5fM;
            j5 = j7222;
            j6 = j8222;
            function23 = function24222;
            modifier3 = modifier2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i8 |= i11;
        i9 = i8;
        if ((i9 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        long j72222 = j3;
        long j82222 = j4;
        startRestartGroup.endDefaults();
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function352222 = function33;
        final int i162222 = i10;
        final float f42222 = m1552getScrollableTabRowPaddingD9Ej5fM;
        final Function2<? super Composer, ? super Integer, Unit> function242222 = function22;
        composer2 = startRestartGroup;
        SurfaceKt.m1520SurfaceFjzlyU(modifier2, null, j72222, j82222, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i17) {
                ComposerKt.sourceInformation(composer3, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                    ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                    composer3.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    composer3.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                    Object rememberedValue = composer3.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer3.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    composer3.endReplaceableGroup();
                    composer3.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed = composer3.changed(rememberScrollState) | composer3.changed(coroutineScope);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                    Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                    final float f5 = f42222;
                    final Function2<? super Composer, ? super Integer, Unit> function25 = tabs;
                    final Function2<? super Composer, ? super Integer, Unit> function26 = function242222;
                    final int i18 = i;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function352222;
                    final int i19 = i162222;
                    SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                            return m1557invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m1557invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                            float f6;
                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                            f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                            int i20 = SubcomposeLayout.mo330roundToPx0680j_4(f6);
                            final int i21 = SubcomposeLayout.mo330roundToPx0680j_4(f5);
                            long m4387copyZbe2FdA$default = Constraints.m4387copyZbe2FdA$default(j9, i20, 0, 0, 0, 14, null);
                            List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function25);
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                            Iterator<T> it = subcompose.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Measurable) it.next()).mo3383measureBRTryo0(m4387copyZbe2FdA$default));
                            }
                            final List<? extends Placeable> arrayList2 = arrayList;
                            final Ref.IntRef intRef = new Ref.IntRef();
                            intRef.element = i21 * 2;
                            final Ref.IntRef intRef2 = new Ref.IntRef();
                            for (Placeable placeable : arrayList2) {
                                intRef.element += placeable.getWidth();
                                intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                            }
                            int i22 = intRef.element;
                            int i23 = intRef2.element;
                            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i24 = i18;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                            final int i25 = i19;
                            return MeasureScope.layout$default(SubcomposeLayout, i22, i23, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    final List<TabPosition> arrayList3 = new ArrayList();
                                    int i26 = i21;
                                    List<Placeable> list = arrayList2;
                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                    int i27 = i26;
                                    for (Placeable placeable2 : list) {
                                        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i27, 0, 0.0f, 4, null);
                                        arrayList3.add(new TabPosition(subcomposeMeasureScope.mo333toDpu2uoSUM(i27), subcomposeMeasureScope.mo333toDpu2uoSUM(placeable2.getWidth()), null));
                                        i27 += placeable2.getWidth();
                                    }
                                    List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function27);
                                    long j10 = j9;
                                    Ref.IntRef intRef3 = intRef;
                                    Ref.IntRef intRef4 = intRef2;
                                    Iterator<T> it2 = subcompose2.iterator();
                                    while (it2.hasNext()) {
                                        long j11 = j10;
                                        Placeable mo3383measureBRTryo0 = ((Measurable) it2.next()).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j10, intRef3.element, intRef3.element, 0, 0, 8, null));
                                        Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, intRef4.element - mo3383measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        j10 = j11;
                                    }
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function38 = function37;
                                    final int i28 = i25;
                                    List<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i29) {
                                            ComposerKt.sourceInformation(composer4, "C301@14269L23:TabRow.kt#jmzs0o");
                                            if ((i29 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                            } else {
                                                function38.invoke(arrayList3, composer4, Integer.valueOf(((i28 >> 12) & 112) | 8));
                                            }
                                        }
                                    }));
                                    Ref.IntRef intRef5 = intRef;
                                    Ref.IntRef intRef6 = intRef2;
                                    Iterator<T> it3 = subcompose3.iterator();
                                    while (it3.hasNext()) {
                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo3383measureBRTryo0(Constraints.INSTANCE.m4404fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                    }
                                    scrollableTabData2.onLaidOut(SubcomposeLayout, i21, arrayList3, i24);
                                }
                            }, 4, null);
                        }
                    }, composer3, 0, 0);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, ((i162222 >> 3) & 14) | 1572864 | (i162222 & 896) | (i162222 & 7168), 50);
        function34 = function352222;
        f3 = m1552getScrollableTabRowPaddingD9Ej5fM;
        j5 = j72222;
        j6 = j82222;
        function23 = function242222;
        modifier3 = modifier2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
