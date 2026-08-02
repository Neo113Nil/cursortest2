package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackVO;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.horizontal.HorizontalButtonsKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.vertical.VerticalButtonsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "item", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "ButtonStack", "(Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ButtonStackKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStackVO.ButtonsOrientation.values().length];
            try {
                iArr[ButtonStackVO.ButtonsOrientation.ORIENTATION_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStackVO.ButtonsOrientation.ORIENTATION_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ButtonStack(@NotNull ButtonStackVO item, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1128570244);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            int i13 = WhenMappings.$EnumSwitchMapping$0[item.getOrientation().ordinal()];
            if (i13 == 1) {
                u11.o(-2005484580);
                VerticalButtonsKt.VerticalButtons(item, actionHandler, u11, i12 & 126);
                u11.k();
            } else {
                if (i13 != 2) {
                    u11.o(-2005487273);
                    u11.k();
                    throw new o();
                }
                u11.o(-2005480738);
                HorizontalButtonsKt.HorizontalButtons(item, actionHandler, u11, i12 & 126);
                u11.k();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ButtonStackKt$ButtonStack$1(item, actionHandler, i11));
        }
    }
}
