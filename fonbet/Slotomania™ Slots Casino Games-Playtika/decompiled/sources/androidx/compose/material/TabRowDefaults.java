package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "()V", "DividerOpacity", "", "DividerThickness", "Landroidx/compose/ui/unit/Dp;", "getDividerThickness-D9Ej5fM", "()F", "F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "height", "Indicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material/TabPosition;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m4440constructorimpl(1);
    private static final float IndicatorHeight = Dp.m4440constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m4440constructorimpl(52);

    private TabRowDefaults() {
    }

    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m1548Divider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final float f2;
        final long j2;
        TabRowDefaults tabRowDefaults;
        float f3;
        Modifier modifier3;
        float f4;
        long m2111copywmQWz5c$default;
        final Modifier modifier4;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(910934799);
        ComposerKt.sourceInformation(startRestartGroup, "C(Divider)P(1,2:c#ui.unit.Dp,0:c#ui.graphics.Color)366@16274L7,368@16353L66:TabRow.kt#jmzs0o");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            tabRowDefaults = this;
        } else {
            tabRowDefaults = this;
            if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(tabRowDefaults) ? 2048 : 1024;
            }
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    f3 = DividerThickness;
                    i3 &= -113;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContentColor);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    i3 &= -897;
                    modifier3 = companion;
                    f4 = f3;
                    m2111copywmQWz5c$default = Color.m2111copywmQWz5c$default(((Color) consume).m2122unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    startRestartGroup.endDefaults();
                    DividerKt.m1364DivideroMI9zvI(modifier3, m2111copywmQWz5c$default, f4, 0.0f, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
                    modifier4 = modifier3;
                    j2 = m2111copywmQWz5c$default;
                    f2 = f4;
                } else {
                    modifier3 = companion;
                    f4 = f3;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
                f4 = f2;
            }
            m2111copywmQWz5c$default = j2;
            startRestartGroup.endDefaults();
            DividerKt.m1364DivideroMI9zvI(modifier3, m2111copywmQWz5c$default, f4, 0.0f, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
            modifier4 = modifier3;
            j2 = m2111copywmQWz5c$default;
            f2 = f4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final TabRowDefaults tabRowDefaults2 = tabRowDefaults;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowDefaults$Divider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                TabRowDefaults.this.m1548Divider9IZ8Weo(modifier4, f2, j2, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m1549Indicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        long m2122unboximpl;
        final long j3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1499002201);
        ComposerKt.sourceInformation(startRestartGroup, "C(Indicator)P(2,1:c#ui.unit.Dp,0:c#ui.graphics.Color)383@16862L7,385@16886L142:TabRow.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(f)) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    f = IndicatorHeight;
                }
                if ((i2 & 4) != 0) {
                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContentColor);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    m2122unboximpl = ((Color) consume).m2122unboximpl();
                    startRestartGroup.endDefaults();
                    BoxKt.Box(BackgroundKt.m233backgroundbw27NRU$default(SizeKt.m620height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f), m2122unboximpl, null, 2, null), startRestartGroup, 0);
                    j3 = m2122unboximpl;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            m2122unboximpl = j2;
            startRestartGroup.endDefaults();
            BoxKt.Box(BackgroundKt.m233backgroundbw27NRU$default(SizeKt.m620height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f), m2122unboximpl, null, 2, null), startRestartGroup, 0);
            j3 = m2122unboximpl;
        } else {
            startRestartGroup.skipToGroupEnd();
            j3 = j2;
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowDefaults$Indicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                TabRowDefaults.this.m1549Indicator9IZ8Weo(modifier2, f2, j3, composer2, i | 1, i2);
            }
        });
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m1550getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1551getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m1552getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, final TabPosition currentTabPosition) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(TabPosition.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-398757863);
                ComposerKt.sourceInformation(composer, "C408@17714L165,412@17911L164:TabRow.kt#jmzs0o");
                State m140animateDpAsStateKz89ssw = AnimateAsStateKt.m140animateDpAsStateKz89ssw(TabPosition.this.getWidth(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4);
                Modifier m639width3ABfNKs = SizeKt.m639width3ABfNKs(OffsetKt.m546offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), m1554invoke$lambda1(AnimateAsStateKt.m140animateDpAsStateKz89ssw(TabPosition.this.getLeft(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, composer, 0, 4)), 0.0f, 2, null), m1553invoke$lambda0(m140animateDpAsStateKz89ssw));
                composer.endReplaceableGroup();
                return m639width3ABfNKs;
            }

            /* renamed from: invoke$lambda-0, reason: not valid java name */
            private static final float m1553invoke$lambda0(State<Dp> state) {
                return state.getValue().m4454unboximpl();
            }

            /* renamed from: invoke$lambda-1, reason: not valid java name */
            private static final float m1554invoke$lambda1(State<Dp> state) {
                return state.getValue().m4454unboximpl();
            }
        });
    }
}
