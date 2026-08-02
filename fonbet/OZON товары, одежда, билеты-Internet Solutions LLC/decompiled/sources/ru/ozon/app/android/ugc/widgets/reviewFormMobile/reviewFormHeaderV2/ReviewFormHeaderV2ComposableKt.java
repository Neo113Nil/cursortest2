package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import A0.h;
import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.cell.HeaderDynamicOffsetsLayoutKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "state", "Lkotlin/Function1;", "", "", "onRatingClick", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ViewIntent$OnBackPressed;", "onBackPressed", "LWZ/t;", "onWidgetBecomeVisible", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Landroidx/compose/ui/e;", "modifier", "ReviewFormHeaderV2Composable", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormHeaderV2ComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewFormHeaderV2Composable(@NotNull ReviewFormHeaderV2VO state, @NotNull Function1<? super Float, Unit> onRatingClick, @NotNull Function1<? super ViewIntent.OnBackPressed, Unit> onBackPressed, @NotNull Function1<? super t, Unit> onWidgetBecomeVisible, @NotNull Function1<? super AtomAction, Unit> onAction, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        boolean F11;
        Object C11;
        int I11;
        e eVar3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRatingClick, "onRatingClick");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onWidgetBecomeVisible, "onWidgetBecomeVisible");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(592877531);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(onRatingClick) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onBackPressed) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(onWidgetBecomeVisible) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.F(onAction) ? 16384 : 8192;
        }
        int i14 = i12 & 32;
        if (i14 != 0) {
            i13 |= 196608;
        } else if ((196608 & i11) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 131072 : 65536;
            if ((74899 & i13) == 74898 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
                Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                Unit unit = Unit.f71690a;
                u11.o(-75060345);
                F11 = ((i13 & 7168) != 2048) | u11.F(state);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$1$1(state, onWidgetBecomeVisible, null);
                    u11.x(C11);
                }
                u11.k();
                Q.e(u11, unit, (Function2) C11);
                float f7 = 0;
                float f11 = 24;
                float f12 = 16;
                e j11 = T.j(T.h(androidx.compose.foundation.e.b(a0.e(eVar4, 1.0f), C7811b0.b(ThemeExtKt.themeColor(context, R$attr.layerFloor1)), h.c(f7, f7, f11, f11)), f12, 0.0f, 2), 0.0f, 6, 0.0f, f12, 5);
                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f13 = c.f(u11, j11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                e.a aVar = e.f40358c0;
                if (1.0f > 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                HeaderDynamicOffsetsLayoutKt.HeaderDynamicOffsetsLayout(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), a1.c.c(-1399468559, new ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$1(state, onAction, view, onRatingClick), u11), u11, 48, 0);
                IconButtonV3DTO closeButton = state.getCloseButton();
                e j12 = T.j(aVar, 8, 0.0f, 0.0f, 0.0f, 14);
                u11.o(-102238478);
                boolean F12 = ((i13 & 896) == 256) | u11.F(state) | ((i13 & 57344) == 16384);
                Object C12 = u11.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$2$2$1(onBackPressed, state, onAction);
                    u11.x(C12);
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(closeButton, j12, false, (Function1) C12, u11, IconButtonV3DTO.$stable | 48, 4);
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$3(state, onRatingClick, onBackPressed, onWidgetBecomeVisible, onAction, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((74899 & i13) == 74898) {
        }
        if (i14 == 0) {
        }
        View view2 = (View) u11.m(AndroidCompositionLocals_androidKt.h());
        Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        Unit unit2 = Unit.f71690a;
        u11.o(-75060345);
        F11 = ((i13 & 7168) != 2048) | u11.F(state);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$1$1(state, onWidgetBecomeVisible, null);
        u11.x(C11);
        u11.k();
        Q.e(u11, unit2, (Function2) C11);
        float f72 = 0;
        float f112 = 24;
        float f122 = 16;
        e j112 = T.j(T.h(androidx.compose.foundation.e.b(a0.e(eVar4, 1.0f), C7811b0.b(ThemeExtKt.themeColor(context2, R$attr.layerFloor1)), h.c(f72, f72, f112, f112)), f122, 0.0f, 2), 0.0f, 6, 0.0f, f122, 5);
        Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f132 = c.f(u11, j112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b112, u11, d112);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, h112);
        F1.b(u11, f132, InterfaceC2801g.a.f());
        e.a aVar2 = e.f40358c0;
        if (1.0f > 0.0d) {
        }
    }
}
