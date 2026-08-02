package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation.compose;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import J0.u3;
import K00.b;
import S0.A0;
import S0.C3956f1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.J0;
import S0.Q;
import Z1.d;
import Z1.h;
import a00.C4911f;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.Q1;
import androidx.fragment.app.ComponentCallbacksC5392m;
import b00.f;
import e1.InterfaceC6250b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.button.compose.MorkovskShadowButtonKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuItemVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuVO;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.atoms.af.AtomAction;
import u0.E;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "MorkovskMenuWidgetComposable", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;", "item", "MenuItem", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/fragment/app/m;", "fragment", "setScrollableContent", "(Landroidx/fragment/app/m;)V", "", "navigationBarPadding", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskMenuWidgetComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void MenuItem(MorkovskMenuItemVO morkovskMenuItemVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Context context;
        e.a aVar;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-721230585);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(morkovskMenuItemVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            e.a aVar2 = e.f40358c0;
            e g10 = T.g(a0.e(a0.u(aVar2, 3), 1.0f), 16, 18);
            boolean z11 = morkovskMenuItemVO.getAction() != null;
            u11.o(1521963006);
            boolean F11 = ((i12 & 112) == 32) | u11.F(morkovskMenuItemVO);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new MorkovskMenuWidgetComposableKt$MenuItem$1$1(morkovskMenuItemVO, function1);
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(g10, null, null, z11, null, null, (Function0) C11, 24);
            u11.o(1521965758);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = MorkovskMenuWidgetComposableKt$MenuItem$2$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            e c11 = o.c(b11, false, (Function1) C12);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, c11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(-1667807953);
            if (morkovskMenuItemVO.getIcon().getIcon().length() > 0) {
                float f11 = 24;
                e a12 = Q1.a(a0.o(aVar2, f11, f11), "icon");
                context = context2;
                aVar = aVar2;
                Ag0.e.a(morkovskMenuItemVO.getIcon().getIcon(), a12, null, null, null, 0.0f, C7809a0.a.a(5, C7811b0.b(UtilKt.parseColor(morkovskMenuItemVO.getIcon().getTintColor(), context2))), u11, 3120, 116);
            } else {
                context = context2;
                aVar = aVar2;
            }
            u11.k();
            E.a(u11, a0.n(aVar, 14));
            e.a aVar3 = aVar;
            u3.b(morkovskMenuItemVO.getTitle().getText(), Q1.a(aVar, "menuText"), C7811b0.b(UtilKt.parseColor(morkovskMenuItemVO.getTitle().getTintColor(), context)), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, RegularDrawTypographyKt.getText_20_20_W500(), u11, 48, 3120, 55288);
            u11.o(-1667782102);
            if (morkovskMenuItemVO.getInfo() != null) {
                float f12 = ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp;
                E.a(u11, a0.n(aVar3, 4));
                c3969l = u11;
                u3.b(morkovskMenuItemVO.getInfo().getText(), Q1.a(a0.t(aVar3, 0.0f, f12 / 2, 1), "menuInfo"), C7811b0.b(UtilKt.parseColor(morkovskMenuItemVO.getInfo().getTintColor(), context)), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, RegularDrawTypographyKt.getText_20_20_W500(), c3969l, 0, 3120, 55288);
            } else {
                c3969l = u11;
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new MorkovskMenuWidgetComposableKt$MenuItem$4(morkovskMenuItemVO, function1, i11));
        }
    }

    public static final void MorkovskMenuWidgetComposable(@NotNull MorkovskMenuVO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(2011417980);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            d dVar = (d) u11.m(K0.e());
            ComponentCallbacksC5392m c11 = ((C4911f) u11.m(f.d())).c();
            setScrollableContent(c11);
            u11.o(-1797807240);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C3956f1.a(1);
                u11.x(C11);
            }
            InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
            u11.k();
            Unit unit = Unit.f71690a;
            u11.o(-1797804900);
            boolean F11 = u11.F(c11);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$1$1(c11, interfaceC3972m0, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            float f7 = 16;
            e j11 = T.j(a0.e(e.f40358c0, 1.0f), f7, f7, f7, 0.0f, 8);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, j11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            U7.i.b(u11, f11, 251801);
            if (interfaceC3972m0.getIntValue() >= 0) {
                u11.o(253167);
                Iterator<T> it = state.getItems().iterator();
                while (it.hasNext()) {
                    MenuItem((MorkovskMenuItemVO) it.next(), actionHandler, u11, i12 & 112);
                }
                u11.k();
                MorkovskShadowButtonDTO button = state.getButton();
                e.a aVar = e.f40358c0;
                e j12 = T.j(aVar, 0.0f, 8, 0.0f, 6, 5);
                u11.o(264528);
                boolean z11 = (i12 & 112) == 32;
                Object C13 = u11.C();
                if (z11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$2$2$1(actionHandler);
                    u11.x(C13);
                }
                u11.k();
                MorkovskShadowButtonKt.m913MorkovskShadowButton942rkJo(button, j12, 0.0f, (Function1) C13, u11, 48, 4);
                E.a(u11, a0.n(aVar, h.a(dVar.B(interfaceC3972m0.getIntValue())).d()));
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$3(state, actionHandler, i11));
        }
    }

    private static final void setScrollableContent(ComponentCallbacksC5392m componentCallbacksC5392m) {
        ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m != null ? componentCallbacksC5392m.getParentFragment() : null;
        if (parentFragment instanceof BottomSheetComposerFragment) {
            Dialog dialog = ((BottomSheetComposerFragment) parentFragment).getDialog();
            SheetDialog sheetDialog = dialog instanceof SheetDialog ? (SheetDialog) dialog : null;
            if (sheetDialog != null) {
                sheetDialog.setScrollableContent(true);
            }
        }
    }
}
