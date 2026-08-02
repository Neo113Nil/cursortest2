package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal;

import A0.g;
import A0.h;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import Tg.b;
import android.content.Context;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import i1.C6988h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackVO;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.components.button.UniButtonAtomKt;
import ru.ozon.uni.components.button.UniButtonResizing;
import ru.ozon.uni.components.iconButton.UniIconButtonAtomKt;
import ru.ozon.uni.components.iconButton.UniIconButtonResizing;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.VisualEffectsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "vo", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "HorizontalButtons", "(Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HorizontalButtonsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonStackVO.ButtonsSize.values().length];
            try {
                iArr[ButtonStackVO.ButtonsSize.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStackVO.ButtonsSize.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonStackVO.WidgetButtons.Sizing.values().length];
            try {
                iArr2[ButtonStackVO.WidgetButtons.Sizing.SIZING_FIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonStackVO.WidgetButtons.Sizing.SIZING_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonStackVO.WidgetButtons.Sizing.SIZING_HUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalButtons(@NotNull final ButtonStackVO vo, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float m1866getDpD9Ej5fM;
        boolean z11;
        int I11;
        boolean F11;
        Object C11;
        int I12;
        Function1<? super b, Unit> function1;
        char c11;
        UniIconButtonResizing uniIconButtonResizing;
        UniButtonResizing uniButtonResizing;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(935560916);
        int i13 = (i11 & 6) == 0 ? (u11.F(vo) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            String backgroundColor = vo.getBackgroundColor();
            u11.o(-109207217);
            C7807Z c7807z = backgroundColor == null ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
            u11.k();
            u11.o(-109207803);
            long clearLightKey0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0() : c7807z.w();
            u11.k();
            boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
            int i15 = WhenMappings.$EnumSwitchMapping$0[vo.getButtonsSize().ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    CornerRadius backgroundRadius = vo.getBackgroundRadius();
                    if (backgroundRadius == null) {
                        backgroundRadius = CornerRadius.NO_RADIUS;
                    }
                    m1866getDpD9Ej5fM = backgroundRadius.m1866getDpD9Ej5fM();
                } else {
                    CornerRadius backgroundRadius2 = vo.getBackgroundRadius();
                    if (backgroundRadius2 != null) {
                        m1866getDpD9Ej5fM = backgroundRadius2.m1866getDpD9Ej5fM();
                    } else {
                        i12 = roundCornersFlag ? 36 : 24;
                        m1866getDpD9Ej5fM = i12;
                    }
                }
                float f7 = m1866getDpD9Ej5fM;
                CornerRadius cornerRadius = CornerRadius.NO_RADIUS;
                g c12 = h.c(f7, f7, cornerRadius.m1866getDpD9Ej5fM(), cornerRadius.m1866getDpD9Ej5fM());
                CornerRadius backgroundRadius3 = vo.getBackgroundRadius();
                g b11 = h.b(backgroundRadius3 != null ? backgroundRadius3.m1866getDpD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM());
                z11 = !vo.getIsSticky() && (vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_500 || vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_600);
                e.a aVar = e.f40358c0;
                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, aVar);
                Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 f13 = E.f(u11, f11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                e b12 = androidx.compose.foundation.e.b(a0.e(aVar, 1.0f), clearLightKey0, vo.getIsSticky() ? c12 : b11);
                if (vo.getIsSticky()) {
                    b12 = C6988h.a(b12, c12);
                    if (vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_500 || vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_600) {
                        Paddings leftPadding = vo.getLeftPadding();
                        float m1867getDpD9Ej5fM = leftPadding != null ? leftPadding.m1867getDpD9Ej5fM() : 8;
                        Paddings topPadding = vo.getTopPadding();
                        float m1867getDpD9Ej5fM2 = topPadding != null ? topPadding.m1867getDpD9Ej5fM() : 8;
                        Paddings bottomPadding = vo.getBottomPadding();
                        float m1867getDpD9Ej5fM3 = bottomPadding != null ? bottomPadding.m1867getDpD9Ej5fM() : 8;
                        Paddings rightPadding = vo.getRightPadding();
                        b12 = T.i(b12, m1867getDpD9Ej5fM, m1867getDpD9Ej5fM2, rightPadding != null ? rightPadding.m1867getDpD9Ej5fM() : 8, m1867getDpD9Ej5fM3);
                    }
                }
                if (!vo.getIsSticky()) {
                    e a12 = C6988h.a(b12, b11);
                    Paddings leftPadding2 = vo.getLeftPadding();
                    if (leftPadding2 == null) {
                        leftPadding2 = Paddings.NONE;
                    }
                    float m1867getDpD9Ej5fM4 = leftPadding2.m1867getDpD9Ej5fM();
                    Paddings topPadding2 = vo.getTopPadding();
                    if (topPadding2 == null) {
                        topPadding2 = Paddings.NONE;
                    }
                    float m1867getDpD9Ej5fM5 = topPadding2.m1867getDpD9Ej5fM();
                    Paddings rightPadding2 = vo.getRightPadding();
                    if (rightPadding2 == null) {
                        rightPadding2 = Paddings.NONE;
                    }
                    float m1867getDpD9Ej5fM6 = rightPadding2.m1867getDpD9Ej5fM();
                    Paddings bottomPadding2 = vo.getBottomPadding();
                    if (bottomPadding2 == null) {
                        bottomPadding2 = Paddings.NONE;
                    }
                    b12 = T.i(a12, m1867getDpD9Ej5fM4, m1867getDpD9Ej5fM5, m1867getDpD9Ej5fM6, bottomPadding2.m1867getDpD9Ej5fM());
                }
                u11.o(-1328707861);
                F11 = u11.F(vo);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new V() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1

                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$4, reason: invalid class name */
                        static final class AnonymousClass4 extends AbstractC7737t implements Function1<m0.a, Unit> {
                            final /* synthetic */ int $horizontalGapPx;
                            final /* synthetic */ List<Pair<Integer, m0>> $sortedPlaceables;
                            final /* synthetic */ int $startOffsetX;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass4(int i11, List<? extends Pair<Integer, ? extends m0>> list, int i12) {
                                super(1);
                                this.$startOffsetX = i11;
                                this.$sortedPlaceables = list;
                                this.$horizontalGapPx = i12;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                invoke2(aVar);
                                return Unit.f71690a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(m0.a layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                int i11 = this.$startOffsetX;
                                List<Pair<Integer, m0>> list = this.$sortedPlaceables;
                                int i12 = this.$horizontalGapPx;
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    m0 m0Var = (m0) ((Pair) it.next()).b();
                                    layout.d(m0Var, i11, 0, 0.0f);
                                    i11 += m0Var.u0() + i12;
                                }
                            }
                        }

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ButtonStackVO.AlignType.values().length];
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_START.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_CENTER.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_END.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:105:0x02c5  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x02c7  */
                        /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
                        /* JADX WARN: Removed duplicated region for block: B:114:0x0242  */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x023f  */
                        /* JADX WARN: Removed duplicated region for block: B:91:0x027a  */
                        /* JADX WARN: Removed duplicated region for block: B:95:0x028b A[LOOP:5: B:93:0x0285->B:95:0x028b, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:99:0x02af  */
                        /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
                        @Override // B1.V
                        /* renamed from: measure-3p2s80s */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                            Integer num;
                            Iterator it;
                            Integer num2;
                            Iterator it2;
                            int i16;
                            int i17;
                            W z02;
                            Integer num3;
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = Layout.Y0(ButtonStackVO.this.getButtonsSize().getHorizontalGap());
                            int size = ButtonStackVO.this.getButtons().size() - 1;
                            if (size < 0) {
                                size = 0;
                            }
                            int i18 = size * Y02;
                            int k11 = Z1.b.k(j11) - i18;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            List<ButtonStackVO.WidgetButtons> buttons = ButtonStackVO.this.getButtons();
                            ButtonStackVO buttonStackVO = ButtonStackVO.this;
                            if (!(buttons instanceof Collection) || !buttons.isEmpty()) {
                                Iterator it3 = buttons.iterator();
                                while (it3.hasNext()) {
                                    if (((ButtonStackVO.WidgetButtons) it3.next()).getSizing() != ((ButtonStackVO.WidgetButtons) C7714v.K(buttonStackVO.getButtons())).getSizing()) {
                                        break;
                                    }
                                }
                            }
                            if (ButtonStackVO.this.getButtons().size() > 1) {
                                Iterator it4 = measurables.iterator();
                                int i19 = 0;
                                while (it4.hasNext()) {
                                    i19 += ((U) it4.next()).T(Z1.b.j(j11));
                                }
                                if (i19 >= k11) {
                                    num = Integer.valueOf(k11 / ButtonStackVO.this.getButtons().size());
                                    int i21 = 0;
                                    for (Object obj : ButtonStackVO.this.getButtons()) {
                                        int i22 = i21 + 1;
                                        if (i21 < 0) {
                                            C7714v.O0();
                                            throw null;
                                        }
                                        ButtonStackVO.WidgetButtons widgetButtons = (ButtonStackVO.WidgetButtons) obj;
                                        if (widgetButtons.getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FIX && widgetButtons.getButtonWidth() != null) {
                                            int intValue = num != null ? num.intValue() : ResourceExtKt.toPx(widgetButtons.getButtonWidth().intValue());
                                            linkedHashMap.put(Integer.valueOf(i21), measurables.get(i21).a0(Z1.b.c(intValue, intValue, 0, 0, 12, j11)));
                                            k11 -= intValue;
                                        }
                                        i21 = i22;
                                    }
                                    Integer num4 = null;
                                    int i23 = 0;
                                    for (Object obj2 : ButtonStackVO.this.getButtons()) {
                                        int i24 = i23 + 1;
                                        if (i23 < 0) {
                                            C7714v.O0();
                                            throw null;
                                        }
                                        if (((ButtonStackVO.WidgetButtons) obj2).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_HUG) {
                                            int intValue2 = num != null ? num.intValue() : measurables.get(i23).T(Z1.b.j(j11));
                                            if (num == null) {
                                                k11 -= measurables.get(i23).T(Z1.b.j(j11));
                                            }
                                            linkedHashMap.put(Integer.valueOf(i23), measurables.get(i23).a0(Z1.b.c(intValue2, intValue2, 0, 0, 12, j11)));
                                        }
                                        i23 = i24;
                                    }
                                    List<ButtonStackVO.WidgetButtons> buttons2 = ButtonStackVO.this.getButtons();
                                    ButtonStackVO buttonStackVO2 = ButtonStackVO.this;
                                    int i25 = 0;
                                    for (Object obj3 : buttons2) {
                                        int i26 = i25 + 1;
                                        if (i25 < 0) {
                                            ?? r24 = num4;
                                            C7714v.O0();
                                            throw r24;
                                        }
                                        if (((ButtonStackVO.WidgetButtons) obj3).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FILL) {
                                            List<ButtonStackVO.WidgetButtons> buttons3 = buttonStackVO2.getButtons();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj4 : buttons3) {
                                                Integer num5 = num4;
                                                if (((ButtonStackVO.WidgetButtons) obj4).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FILL) {
                                                    arrayList.add(obj4);
                                                }
                                                num4 = num5;
                                            }
                                            num3 = num4;
                                            linkedHashMap.put(Integer.valueOf(i25), measurables.get(i25).a0(Z1.b.c(20, k11 / arrayList.size(), 0, 0, 12, j11)));
                                        } else {
                                            num3 = num4;
                                        }
                                        i25 = i26;
                                        num4 = num3;
                                    }
                                    Integer num6 = num4;
                                    List I02 = C7714v.I0(new Comparator() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$measure-3p2s80s$$inlined$sortedBy$1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.util.Comparator
                                        public final int compare(T t2, T t11) {
                                            return Vc.a.b((Integer) ((Pair) t2).e(), (Integer) ((Pair) t11).e());
                                        }
                                    }, kotlin.collections.U.r(linkedHashMap));
                                    int k12 = Z1.b.k(j11);
                                    List list = I02;
                                    it = list.iterator();
                                    if (!it.hasNext()) {
                                        Integer valueOf = Integer.valueOf(((m0) ((Pair) it.next()).f()).l0());
                                        loop6: while (true) {
                                            num2 = valueOf;
                                            while (it.hasNext()) {
                                                valueOf = Integer.valueOf(((m0) ((Pair) it.next()).f()).l0());
                                                if (num2.compareTo(valueOf) < 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        num2 = num6;
                                    }
                                    int intValue3 = num2 == null ? num2.intValue() : 0;
                                    it2 = list.iterator();
                                    int i27 = 0;
                                    while (it2.hasNext()) {
                                        i27 += ((m0) ((Pair) it2.next()).f()).u0();
                                    }
                                    int i28 = i27 + i18;
                                    i16 = WhenMappings.$EnumSwitchMapping$0[ButtonStackVO.this.getAlign().ordinal()];
                                    if (i16 != 1) {
                                        i17 = 0;
                                    } else if (i16 == 2) {
                                        i17 = (k12 - i28) / 2;
                                    } else {
                                        if (i16 != 3) {
                                            throw new o();
                                        }
                                        i17 = k12 - i28;
                                    }
                                    z02 = Layout.z0(k12, intValue3, kotlin.collections.U.c(), new AnonymousClass4(i17 >= 0 ? 0 : i17, I02, Y02));
                                    return z02;
                                }
                            }
                            num = null;
                            int i212 = 0;
                            while (r10.hasNext()) {
                            }
                            Integer num42 = null;
                            int i232 = 0;
                            while (r6.hasNext()) {
                            }
                            List<ButtonStackVO.WidgetButtons> buttons22 = ButtonStackVO.this.getButtons();
                            ButtonStackVO buttonStackVO22 = ButtonStackVO.this;
                            int i252 = 0;
                            while (r6.hasNext()) {
                            }
                            Integer num62 = num42;
                            List I022 = C7714v.I0(new Comparator() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$measure-3p2s80s$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t2, T t11) {
                                    return Vc.a.b((Integer) ((Pair) t2).e(), (Integer) ((Pair) t11).e());
                                }
                            }, kotlin.collections.U.r(linkedHashMap));
                            int k122 = Z1.b.k(j11);
                            List list2 = I022;
                            it = list2.iterator();
                            if (!it.hasNext()) {
                            }
                            if (num2 == null) {
                            }
                            it2 = list2.iterator();
                            int i272 = 0;
                            while (it2.hasNext()) {
                            }
                            int i282 = i272 + i18;
                            i16 = WhenMappings.$EnumSwitchMapping$0[ButtonStackVO.this.getAlign().ordinal()];
                            if (i16 != 1) {
                            }
                            z02 = Layout.z0(k122, intValue3, kotlin.collections.U.c(), new AnonymousClass4(i17 >= 0 ? 0 : i17, I022, Y02));
                            return z02;
                        }
                    };
                    u11.x(C11);
                }
                V v11 = (V) C11;
                u11.k();
                I12 = u11.I();
                A0 d12 = u11.d();
                e f14 = c.f(u11, b12);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 f15 = E.f(u11, v11, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f15);
                }
                F1.b(u11, f14, InterfaceC2801g.a.f());
                u11.o(501670069);
                int i16 = 0;
                for (Object obj : vo.getButtons()) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    ButtonStackVO.WidgetButtons widgetButtons = (ButtonStackVO.WidgetButtons) obj;
                    ButtonsDTO button = widgetButtons.getButton();
                    if (button instanceof ButtonV3DTO) {
                        u11.o(1000344755);
                        int i18 = WhenMappings.$EnumSwitchMapping$1[widgetButtons.getSizing().ordinal()];
                        if (i18 == 1 || i18 == 2) {
                            uniButtonResizing = UniButtonResizing.FILL;
                        } else {
                            if (i18 != 3) {
                                throw new o();
                            }
                            uniButtonResizing = UniButtonResizing.HUG;
                        }
                        ButtonV3DTO copy$default = ButtonV3DTO.copy$default((ButtonV3DTO) button, null, ButtonV3DTO.Sizes.valueOf(vo.getButtonsSize().name()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069, null);
                        e eVar = e.f40358c0;
                        if (widgetButtons.getButtonWidth() != null) {
                            Intrinsics.f(widgetButtons.getButtonWidth());
                            eVar = a0.r(eVar, r1.intValue());
                        }
                        UniButtonAtomKt.UniButtonAtom(copy$default, eVar, uniButtonResizing, false, actionHandler, u11, (i14 << 9) & 57344, 8);
                        u11.k();
                    } else if (button instanceof IconButtonV3DTO) {
                        u11.o(1001076355);
                        int i19 = WhenMappings.$EnumSwitchMapping$1[widgetButtons.getSizing().ordinal()];
                        if (i19 != 1) {
                            c11 = 2;
                            if (i19 != 2) {
                                if (i19 != 3) {
                                    throw new o();
                                }
                                uniIconButtonResizing = UniIconButtonResizing.HUG;
                                IconButtonV3DTO copy$default2 = IconButtonV3DTO.copy$default((IconButtonV3DTO) button, IconButtonV3DTO.Sizes.valueOf(vo.getButtonsSize().name()), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
                                e eVar2 = e.f40358c0;
                                if (widgetButtons.getButtonWidth() != null) {
                                    Intrinsics.f(widgetButtons.getButtonWidth());
                                    eVar2 = a0.r(eVar2, r1.intValue());
                                }
                                UniIconButtonAtomKt.UniIconButtonAtom(copy$default2, eVar2, uniIconButtonResizing, false, actionHandler, u11, IconButtonV3DTO.$stable | (57344 & (i14 << 9)), 8);
                                u11.k();
                            }
                        } else {
                            c11 = 2;
                        }
                        uniIconButtonResizing = UniIconButtonResizing.FILL;
                        IconButtonV3DTO copy$default22 = IconButtonV3DTO.copy$default((IconButtonV3DTO) button, IconButtonV3DTO.Sizes.valueOf(vo.getButtonsSize().name()), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
                        e eVar22 = e.f40358c0;
                        if (widgetButtons.getButtonWidth() != null) {
                        }
                        UniIconButtonAtomKt.UniIconButtonAtom(copy$default22, eVar22, uniIconButtonResizing, false, actionHandler, u11, IconButtonV3DTO.$stable | (57344 & (i14 << 9)), 8);
                        u11.k();
                    } else {
                        u11.o(1556336386);
                        u11.k();
                    }
                    i16 = i17;
                }
                function1 = actionHandler;
                u11.k();
                u11.f();
                u11.o(-1328606822);
                if (z11) {
                    VisualEffectsKt.m3267ThreeSideBordera_Az1LM(1, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicDisabled(), f7, c5187j.b(e.f40358c0), u11, 6);
                    u11 = u11;
                }
                u11.k();
                u11.f();
            } else {
                CornerRadius backgroundRadius4 = vo.getBackgroundRadius();
                if (backgroundRadius4 != null) {
                    m1866getDpD9Ej5fM = backgroundRadius4.m1866getDpD9Ej5fM();
                    float f72 = m1866getDpD9Ej5fM;
                    CornerRadius cornerRadius2 = CornerRadius.NO_RADIUS;
                    g c122 = h.c(f72, f72, cornerRadius2.m1866getDpD9Ej5fM(), cornerRadius2.m1866getDpD9Ej5fM());
                    CornerRadius backgroundRadius32 = vo.getBackgroundRadius();
                    g b112 = h.b(backgroundRadius32 != null ? backgroundRadius32.m1866getDpD9Ej5fM() : cornerRadius2.m1866getDpD9Ej5fM());
                    if (vo.getIsSticky()) {
                    }
                    e.a aVar2 = e.f40358c0;
                    V f112 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f122 = c.f(u11, aVar2);
                    Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f132 = E.f(u11, f112, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f132);
                    F1.b(u11, f122, InterfaceC2801g.a.f());
                    C5187j c5187j2 = C5187j.f39515a;
                    e b122 = androidx.compose.foundation.e.b(a0.e(aVar2, 1.0f), clearLightKey0, vo.getIsSticky() ? c122 : b112);
                    if (vo.getIsSticky()) {
                    }
                    if (!vo.getIsSticky()) {
                    }
                    u11.o(-1328707861);
                    F11 = u11.F(vo);
                    C11 = u11.C();
                    if (!F11) {
                    }
                    C11 = new V() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1

                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$4, reason: invalid class name */
                        static final class AnonymousClass4 extends AbstractC7737t implements Function1<m0.a, Unit> {
                            final /* synthetic */ int $horizontalGapPx;
                            final /* synthetic */ List<Pair<Integer, m0>> $sortedPlaceables;
                            final /* synthetic */ int $startOffsetX;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass4(int i11, List<? extends Pair<Integer, ? extends m0>> list, int i12) {
                                super(1);
                                this.$startOffsetX = i11;
                                this.$sortedPlaceables = list;
                                this.$horizontalGapPx = i12;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                invoke2(aVar);
                                return Unit.f71690a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(m0.a layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                int i11 = this.$startOffsetX;
                                List<Pair<Integer, m0>> list = this.$sortedPlaceables;
                                int i12 = this.$horizontalGapPx;
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    m0 m0Var = (m0) ((Pair) it.next()).b();
                                    layout.d(m0Var, i11, 0, 0.0f);
                                    i11 += m0Var.u0() + i12;
                                }
                            }
                        }

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ButtonStackVO.AlignType.values().length];
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_START.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_CENTER.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_END.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:105:0x02c5  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x02c7  */
                        /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
                        /* JADX WARN: Removed duplicated region for block: B:114:0x0242  */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x023f  */
                        /* JADX WARN: Removed duplicated region for block: B:91:0x027a  */
                        /* JADX WARN: Removed duplicated region for block: B:95:0x028b A[LOOP:5: B:93:0x0285->B:95:0x028b, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:99:0x02af  */
                        /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
                        @Override // B1.V
                        /* renamed from: measure-3p2s80s */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                            Integer num;
                            Iterator it;
                            Integer num2;
                            Iterator it2;
                            int i162;
                            int i172;
                            W z02;
                            Integer num3;
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = Layout.Y0(ButtonStackVO.this.getButtonsSize().getHorizontalGap());
                            int size = ButtonStackVO.this.getButtons().size() - 1;
                            if (size < 0) {
                                size = 0;
                            }
                            int i182 = size * Y02;
                            int k11 = Z1.b.k(j11) - i182;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            List<ButtonStackVO.WidgetButtons> buttons = ButtonStackVO.this.getButtons();
                            ButtonStackVO buttonStackVO = ButtonStackVO.this;
                            if (!(buttons instanceof Collection) || !buttons.isEmpty()) {
                                Iterator it3 = buttons.iterator();
                                while (it3.hasNext()) {
                                    if (((ButtonStackVO.WidgetButtons) it3.next()).getSizing() != ((ButtonStackVO.WidgetButtons) C7714v.K(buttonStackVO.getButtons())).getSizing()) {
                                        break;
                                    }
                                }
                            }
                            if (ButtonStackVO.this.getButtons().size() > 1) {
                                Iterator it4 = measurables.iterator();
                                int i192 = 0;
                                while (it4.hasNext()) {
                                    i192 += ((U) it4.next()).T(Z1.b.j(j11));
                                }
                                if (i192 >= k11) {
                                    num = Integer.valueOf(k11 / ButtonStackVO.this.getButtons().size());
                                    int i212 = 0;
                                    for (Object obj2 : ButtonStackVO.this.getButtons()) {
                                        int i22 = i212 + 1;
                                        if (i212 < 0) {
                                            C7714v.O0();
                                            throw null;
                                        }
                                        ButtonStackVO.WidgetButtons widgetButtons2 = (ButtonStackVO.WidgetButtons) obj2;
                                        if (widgetButtons2.getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FIX && widgetButtons2.getButtonWidth() != null) {
                                            int intValue = num != null ? num.intValue() : ResourceExtKt.toPx(widgetButtons2.getButtonWidth().intValue());
                                            linkedHashMap.put(Integer.valueOf(i212), measurables.get(i212).a0(Z1.b.c(intValue, intValue, 0, 0, 12, j11)));
                                            k11 -= intValue;
                                        }
                                        i212 = i22;
                                    }
                                    Integer num42 = null;
                                    int i232 = 0;
                                    for (Object obj22 : ButtonStackVO.this.getButtons()) {
                                        int i24 = i232 + 1;
                                        if (i232 < 0) {
                                            C7714v.O0();
                                            throw null;
                                        }
                                        if (((ButtonStackVO.WidgetButtons) obj22).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_HUG) {
                                            int intValue2 = num != null ? num.intValue() : measurables.get(i232).T(Z1.b.j(j11));
                                            if (num == null) {
                                                k11 -= measurables.get(i232).T(Z1.b.j(j11));
                                            }
                                            linkedHashMap.put(Integer.valueOf(i232), measurables.get(i232).a0(Z1.b.c(intValue2, intValue2, 0, 0, 12, j11)));
                                        }
                                        i232 = i24;
                                    }
                                    List<ButtonStackVO.WidgetButtons> buttons22 = ButtonStackVO.this.getButtons();
                                    ButtonStackVO buttonStackVO22 = ButtonStackVO.this;
                                    int i252 = 0;
                                    for (Object obj3 : buttons22) {
                                        int i26 = i252 + 1;
                                        if (i252 < 0) {
                                            ?? r24 = num42;
                                            C7714v.O0();
                                            throw r24;
                                        }
                                        if (((ButtonStackVO.WidgetButtons) obj3).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FILL) {
                                            List<ButtonStackVO.WidgetButtons> buttons3 = buttonStackVO22.getButtons();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj4 : buttons3) {
                                                Integer num5 = num42;
                                                if (((ButtonStackVO.WidgetButtons) obj4).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FILL) {
                                                    arrayList.add(obj4);
                                                }
                                                num42 = num5;
                                            }
                                            num3 = num42;
                                            linkedHashMap.put(Integer.valueOf(i252), measurables.get(i252).a0(Z1.b.c(20, k11 / arrayList.size(), 0, 0, 12, j11)));
                                        } else {
                                            num3 = num42;
                                        }
                                        i252 = i26;
                                        num42 = num3;
                                    }
                                    Integer num62 = num42;
                                    List I022 = C7714v.I0(new Comparator() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$measure-3p2s80s$$inlined$sortedBy$1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.util.Comparator
                                        public final int compare(T t2, T t11) {
                                            return Vc.a.b((Integer) ((Pair) t2).e(), (Integer) ((Pair) t11).e());
                                        }
                                    }, kotlin.collections.U.r(linkedHashMap));
                                    int k122 = Z1.b.k(j11);
                                    List list2 = I022;
                                    it = list2.iterator();
                                    if (!it.hasNext()) {
                                        Integer valueOf = Integer.valueOf(((m0) ((Pair) it.next()).f()).l0());
                                        loop6: while (true) {
                                            num2 = valueOf;
                                            while (it.hasNext()) {
                                                valueOf = Integer.valueOf(((m0) ((Pair) it.next()).f()).l0());
                                                if (num2.compareTo(valueOf) < 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        num2 = num62;
                                    }
                                    int intValue3 = num2 == null ? num2.intValue() : 0;
                                    it2 = list2.iterator();
                                    int i272 = 0;
                                    while (it2.hasNext()) {
                                        i272 += ((m0) ((Pair) it2.next()).f()).u0();
                                    }
                                    int i282 = i272 + i182;
                                    i162 = WhenMappings.$EnumSwitchMapping$0[ButtonStackVO.this.getAlign().ordinal()];
                                    if (i162 != 1) {
                                        i172 = 0;
                                    } else if (i162 == 2) {
                                        i172 = (k122 - i282) / 2;
                                    } else {
                                        if (i162 != 3) {
                                            throw new o();
                                        }
                                        i172 = k122 - i282;
                                    }
                                    z02 = Layout.z0(k122, intValue3, kotlin.collections.U.c(), new AnonymousClass4(i172 >= 0 ? 0 : i172, I022, Y02));
                                    return z02;
                                }
                            }
                            num = null;
                            int i2122 = 0;
                            while (r10.hasNext()) {
                            }
                            Integer num422 = null;
                            int i2322 = 0;
                            while (r6.hasNext()) {
                            }
                            List<ButtonStackVO.WidgetButtons> buttons222 = ButtonStackVO.this.getButtons();
                            ButtonStackVO buttonStackVO222 = ButtonStackVO.this;
                            int i2522 = 0;
                            while (r6.hasNext()) {
                            }
                            Integer num622 = num422;
                            List I0222 = C7714v.I0(new Comparator() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$measure-3p2s80s$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t2, T t11) {
                                    return Vc.a.b((Integer) ((Pair) t2).e(), (Integer) ((Pair) t11).e());
                                }
                            }, kotlin.collections.U.r(linkedHashMap));
                            int k1222 = Z1.b.k(j11);
                            List list22 = I0222;
                            it = list22.iterator();
                            if (!it.hasNext()) {
                            }
                            if (num2 == null) {
                            }
                            it2 = list22.iterator();
                            int i2722 = 0;
                            while (it2.hasNext()) {
                            }
                            int i2822 = i2722 + i182;
                            i162 = WhenMappings.$EnumSwitchMapping$0[ButtonStackVO.this.getAlign().ordinal()];
                            if (i162 != 1) {
                            }
                            z02 = Layout.z0(k1222, intValue3, kotlin.collections.U.c(), new AnonymousClass4(i172 >= 0 ? 0 : i172, I0222, Y02));
                            return z02;
                        }
                    };
                    u11.x(C11);
                    V v112 = (V) C11;
                    u11.k();
                    I12 = u11.I();
                    A0 d122 = u11.d();
                    e f142 = c.f(u11, b122);
                    Function0 a132 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 f152 = E.f(u11, v112, u11, d122);
                    if (!u11.t()) {
                    }
                    a.d(I12, u11, I12, f152);
                    F1.b(u11, f142, InterfaceC2801g.a.f());
                    u11.o(501670069);
                    int i162 = 0;
                    while (r12.hasNext()) {
                    }
                    function1 = actionHandler;
                    u11.k();
                    u11.f();
                    u11.o(-1328606822);
                    if (z11) {
                    }
                    u11.k();
                    u11.f();
                } else {
                    i12 = roundCornersFlag ? 30 : 20;
                    m1866getDpD9Ej5fM = i12;
                    float f722 = m1866getDpD9Ej5fM;
                    CornerRadius cornerRadius22 = CornerRadius.NO_RADIUS;
                    g c1222 = h.c(f722, f722, cornerRadius22.m1866getDpD9Ej5fM(), cornerRadius22.m1866getDpD9Ej5fM());
                    CornerRadius backgroundRadius322 = vo.getBackgroundRadius();
                    g b1122 = h.b(backgroundRadius322 != null ? backgroundRadius322.m1866getDpD9Ej5fM() : cornerRadius22.m1866getDpD9Ej5fM());
                    if (vo.getIsSticky()) {
                    }
                    e.a aVar22 = e.f40358c0;
                    V f1122 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d1122 = u11.d();
                    e f1222 = c.f(u11, aVar22);
                    Function0 a1122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f1322 = E.f(u11, f1122, u11, d1122);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f1322);
                    F1.b(u11, f1222, InterfaceC2801g.a.f());
                    C5187j c5187j22 = C5187j.f39515a;
                    e b1222 = androidx.compose.foundation.e.b(a0.e(aVar22, 1.0f), clearLightKey0, vo.getIsSticky() ? c1222 : b1122);
                    if (vo.getIsSticky()) {
                    }
                    if (!vo.getIsSticky()) {
                    }
                    u11.o(-1328707861);
                    F11 = u11.F(vo);
                    C11 = u11.C();
                    if (!F11) {
                    }
                    C11 = new V() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1

                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$4, reason: invalid class name */
                        static final class AnonymousClass4 extends AbstractC7737t implements Function1<m0.a, Unit> {
                            final /* synthetic */ int $horizontalGapPx;
                            final /* synthetic */ List<Pair<Integer, m0>> $sortedPlaceables;
                            final /* synthetic */ int $startOffsetX;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass4(int i11, List<? extends Pair<Integer, ? extends m0>> list, int i12) {
                                super(1);
                                this.$startOffsetX = i11;
                                this.$sortedPlaceables = list;
                                this.$horizontalGapPx = i12;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                invoke2(aVar);
                                return Unit.f71690a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(m0.a layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                int i11 = this.$startOffsetX;
                                List<Pair<Integer, m0>> list = this.$sortedPlaceables;
                                int i12 = this.$horizontalGapPx;
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    m0 m0Var = (m0) ((Pair) it.next()).b();
                                    layout.d(m0Var, i11, 0, 0.0f);
                                    i11 += m0Var.u0() + i12;
                                }
                            }
                        }

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[ButtonStackVO.AlignType.values().length];
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_START.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_CENTER.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[ButtonStackVO.AlignType.ALIGN_END.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:105:0x02c5  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x02c7  */
                        /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
                        /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
                        /* JADX WARN: Removed duplicated region for block: B:114:0x0242  */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x023f  */
                        /* JADX WARN: Removed duplicated region for block: B:91:0x027a  */
                        /* JADX WARN: Removed duplicated region for block: B:95:0x028b A[LOOP:5: B:93:0x0285->B:95:0x028b, LOOP_END] */
                        /* JADX WARN: Removed duplicated region for block: B:99:0x02af  */
                        /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
                        @Override // B1.V
                        /* renamed from: measure-3p2s80s */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                            Integer num;
                            Iterator it;
                            Integer num2;
                            Iterator it2;
                            int i1622;
                            int i172;
                            W z02;
                            Integer num3;
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = Layout.Y0(ButtonStackVO.this.getButtonsSize().getHorizontalGap());
                            int size = ButtonStackVO.this.getButtons().size() - 1;
                            if (size < 0) {
                                size = 0;
                            }
                            int i182 = size * Y02;
                            int k11 = Z1.b.k(j11) - i182;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            List<ButtonStackVO.WidgetButtons> buttons = ButtonStackVO.this.getButtons();
                            ButtonStackVO buttonStackVO = ButtonStackVO.this;
                            if (!(buttons instanceof Collection) || !buttons.isEmpty()) {
                                Iterator it3 = buttons.iterator();
                                while (it3.hasNext()) {
                                    if (((ButtonStackVO.WidgetButtons) it3.next()).getSizing() != ((ButtonStackVO.WidgetButtons) C7714v.K(buttonStackVO.getButtons())).getSizing()) {
                                        break;
                                    }
                                }
                            }
                            if (ButtonStackVO.this.getButtons().size() > 1) {
                                Iterator it4 = measurables.iterator();
                                int i192 = 0;
                                while (it4.hasNext()) {
                                    i192 += ((U) it4.next()).T(Z1.b.j(j11));
                                }
                                if (i192 >= k11) {
                                    num = Integer.valueOf(k11 / ButtonStackVO.this.getButtons().size());
                                    int i2122 = 0;
                                    for (Object obj2 : ButtonStackVO.this.getButtons()) {
                                        int i22 = i2122 + 1;
                                        if (i2122 < 0) {
                                            C7714v.O0();
                                            throw null;
                                        }
                                        ButtonStackVO.WidgetButtons widgetButtons2 = (ButtonStackVO.WidgetButtons) obj2;
                                        if (widgetButtons2.getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FIX && widgetButtons2.getButtonWidth() != null) {
                                            int intValue = num != null ? num.intValue() : ResourceExtKt.toPx(widgetButtons2.getButtonWidth().intValue());
                                            linkedHashMap.put(Integer.valueOf(i2122), measurables.get(i2122).a0(Z1.b.c(intValue, intValue, 0, 0, 12, j11)));
                                            k11 -= intValue;
                                        }
                                        i2122 = i22;
                                    }
                                    Integer num422 = null;
                                    int i2322 = 0;
                                    for (Object obj22 : ButtonStackVO.this.getButtons()) {
                                        int i24 = i2322 + 1;
                                        if (i2322 < 0) {
                                            C7714v.O0();
                                            throw null;
                                        }
                                        if (((ButtonStackVO.WidgetButtons) obj22).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_HUG) {
                                            int intValue2 = num != null ? num.intValue() : measurables.get(i2322).T(Z1.b.j(j11));
                                            if (num == null) {
                                                k11 -= measurables.get(i2322).T(Z1.b.j(j11));
                                            }
                                            linkedHashMap.put(Integer.valueOf(i2322), measurables.get(i2322).a0(Z1.b.c(intValue2, intValue2, 0, 0, 12, j11)));
                                        }
                                        i2322 = i24;
                                    }
                                    List<ButtonStackVO.WidgetButtons> buttons222 = ButtonStackVO.this.getButtons();
                                    ButtonStackVO buttonStackVO222 = ButtonStackVO.this;
                                    int i2522 = 0;
                                    for (Object obj3 : buttons222) {
                                        int i26 = i2522 + 1;
                                        if (i2522 < 0) {
                                            ?? r24 = num422;
                                            C7714v.O0();
                                            throw r24;
                                        }
                                        if (((ButtonStackVO.WidgetButtons) obj3).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FILL) {
                                            List<ButtonStackVO.WidgetButtons> buttons3 = buttonStackVO222.getButtons();
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj4 : buttons3) {
                                                Integer num5 = num422;
                                                if (((ButtonStackVO.WidgetButtons) obj4).getSizing() == ButtonStackVO.WidgetButtons.Sizing.SIZING_FILL) {
                                                    arrayList.add(obj4);
                                                }
                                                num422 = num5;
                                            }
                                            num3 = num422;
                                            linkedHashMap.put(Integer.valueOf(i2522), measurables.get(i2522).a0(Z1.b.c(20, k11 / arrayList.size(), 0, 0, 12, j11)));
                                        } else {
                                            num3 = num422;
                                        }
                                        i2522 = i26;
                                        num422 = num3;
                                    }
                                    Integer num622 = num422;
                                    List I0222 = C7714v.I0(new Comparator() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$measure-3p2s80s$$inlined$sortedBy$1
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.util.Comparator
                                        public final int compare(T t2, T t11) {
                                            return Vc.a.b((Integer) ((Pair) t2).e(), (Integer) ((Pair) t11).e());
                                        }
                                    }, kotlin.collections.U.r(linkedHashMap));
                                    int k1222 = Z1.b.k(j11);
                                    List list22 = I0222;
                                    it = list22.iterator();
                                    if (!it.hasNext()) {
                                        Integer valueOf = Integer.valueOf(((m0) ((Pair) it.next()).f()).l0());
                                        loop6: while (true) {
                                            num2 = valueOf;
                                            while (it.hasNext()) {
                                                valueOf = Integer.valueOf(((m0) ((Pair) it.next()).f()).l0());
                                                if (num2.compareTo(valueOf) < 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        num2 = num622;
                                    }
                                    int intValue3 = num2 == null ? num2.intValue() : 0;
                                    it2 = list22.iterator();
                                    int i2722 = 0;
                                    while (it2.hasNext()) {
                                        i2722 += ((m0) ((Pair) it2.next()).f()).u0();
                                    }
                                    int i2822 = i2722 + i182;
                                    i1622 = WhenMappings.$EnumSwitchMapping$0[ButtonStackVO.this.getAlign().ordinal()];
                                    if (i1622 != 1) {
                                        i172 = 0;
                                    } else if (i1622 == 2) {
                                        i172 = (k1222 - i2822) / 2;
                                    } else {
                                        if (i1622 != 3) {
                                            throw new o();
                                        }
                                        i172 = k1222 - i2822;
                                    }
                                    z02 = Layout.z0(k1222, intValue3, kotlin.collections.U.c(), new AnonymousClass4(i172 >= 0 ? 0 : i172, I0222, Y02));
                                    return z02;
                                }
                            }
                            num = null;
                            int i21222 = 0;
                            while (r10.hasNext()) {
                            }
                            Integer num4222 = null;
                            int i23222 = 0;
                            while (r6.hasNext()) {
                            }
                            List<ButtonStackVO.WidgetButtons> buttons2222 = ButtonStackVO.this.getButtons();
                            ButtonStackVO buttonStackVO2222 = ButtonStackVO.this;
                            int i25222 = 0;
                            while (r6.hasNext()) {
                            }
                            Integer num6222 = num4222;
                            List I02222 = C7714v.I0(new Comparator() { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt$HorizontalButtons$1$3$1$measure-3p2s80s$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t2, T t11) {
                                    return Vc.a.b((Integer) ((Pair) t2).e(), (Integer) ((Pair) t11).e());
                                }
                            }, kotlin.collections.U.r(linkedHashMap));
                            int k12222 = Z1.b.k(j11);
                            List list222 = I02222;
                            it = list222.iterator();
                            if (!it.hasNext()) {
                            }
                            if (num2 == null) {
                            }
                            it2 = list222.iterator();
                            int i27222 = 0;
                            while (it2.hasNext()) {
                            }
                            int i28222 = i27222 + i182;
                            i1622 = WhenMappings.$EnumSwitchMapping$0[ButtonStackVO.this.getAlign().ordinal()];
                            if (i1622 != 1) {
                            }
                            z02 = Layout.z0(k12222, intValue3, kotlin.collections.U.c(), new AnonymousClass4(i172 >= 0 ? 0 : i172, I02222, Y02));
                            return z02;
                        }
                    };
                    u11.x(C11);
                    V v1122 = (V) C11;
                    u11.k();
                    I12 = u11.I();
                    A0 d1222 = u11.d();
                    e f1422 = c.f(u11, b1222);
                    Function0 a1322 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 f1522 = E.f(u11, v1122, u11, d1222);
                    if (!u11.t()) {
                    }
                    a.d(I12, u11, I12, f1522);
                    F1.b(u11, f1422, InterfaceC2801g.a.f());
                    u11.o(501670069);
                    int i1622 = 0;
                    while (r12.hasNext()) {
                    }
                    function1 = actionHandler;
                    u11.k();
                    u11.f();
                    u11.o(-1328606822);
                    if (z11) {
                    }
                    u11.k();
                    u11.f();
                }
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new HorizontalButtonsKt$HorizontalButtons$2(vo, function1, i11));
        }
    }
}
