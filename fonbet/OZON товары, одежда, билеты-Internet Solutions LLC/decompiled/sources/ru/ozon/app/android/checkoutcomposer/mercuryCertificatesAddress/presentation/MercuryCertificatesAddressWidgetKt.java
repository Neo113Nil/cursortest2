package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.UiState;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.AddressesVO;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.MercuryCertificatesAddressVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniIconToken;
import t0.q;
import x1.L;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "state", "", "searchState", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;", "addressesState", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/MercuryCertificatesAddressViewModel;", "viewModel", "MercuryCertificatesAddressWidget", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/MercuryCertificatesAddressViewModel;LS0/k;I)V", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$AddressesState;", "Addresses", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/UiState$AddressesState;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "action", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Address", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MercuryCertificatesAddressWidgetKt {
    public static final void Address(@NotNull TextDTO title, AtomAction atomAction, CommonAtomIconDTO commonAtomIconDTO, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1725296443);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(atomAction) : u11.F(atomAction) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(commonAtomIconDTO) : u11.F(commonAtomIconDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e h11 = T.h(a0.e(e.f40358c0, 1.0f), 0.0f, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 1);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            e c11 = a0.c(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            u11.o(-2089329343);
            boolean z11 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && u11.F(atomAction))) | ((i12 & 7168) == 2048);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new MercuryCertificatesAddressWidgetKt$Address$1$1$1(atomAction, actionHandler);
                u11.x(C11);
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(title, i.b(c11, null, null, false, null, null, (Function0) C11, 28), u11, i12 & 14, 0);
            c3969l = u11;
            DsIconAtomKt.DsIconAtom(new IconDTO(null, null, IconDTO.IconShape.SHAPE_NONE, null, commonAtomIconDTO, null, null, null, null, null, null, null, null, null, null, null, 65515, null), null, c3969l, IconDTO.$stable, 2);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new MercuryCertificatesAddressWidgetKt$Address$2(title, atomAction, commonAtomIconDTO, actionHandler, i11));
        }
    }

    public static final void Addresses(UiState.AddressesState addressesState, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1265052281);
        int i12 = (i11 & 6) == 0 ? (u11.F(addressesState) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            List<AddressesVO.AddressVO> addresses = addressesState != null ? addressesState.getAddresses() : null;
            if (addresses != null) {
                for (AddressesVO.AddressVO addressVO : addresses) {
                    TextDTO title = addressVO.getTitle();
                    u11.o(1909738798);
                    if (title == null) {
                        function1 = actionHandler;
                    } else {
                        function1 = actionHandler;
                        Address(title, addressVO.getAction(), addressVO.getIcon(), function1, u11, ((i12 << 6) & 7168) | (AtomAction.$stable << 3) | (CommonAtomIconDTO.$stable << 6));
                    }
                    u11.k();
                    actionHandler = function1;
                }
            }
        }
        Function1<? super AtomAction, Unit> function12 = actionHandler;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MercuryCertificatesAddressWidgetKt$Addresses$2(addressesState, function12, i11));
        }
    }

    public static final void MercuryCertificatesAddressWidget(@NotNull MercuryCertificatesAddressVO state, @NotNull String searchState, @NotNull UiState addressesState, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull MercuryCertificatesAddressViewModel viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(searchState, "searchState");
        Intrinsics.checkNotNullParameter(addressesState, "addressesState");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(457685706);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(searchState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(addressesState) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(viewModel) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            j1.i iVar = (j1.i) u11.m(K0.f());
            P1 p12 = (P1) u11.m(K0.o());
            ViewGroup rootView = ContextExtKt.getRootView(((C4911f) u11.m(f.d())).c());
            u11.o(82230403);
            if (addressesState.isError() && rootView != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, ((C4911f) u11.m(f.d())).g(), 62, null).show();
            }
            u11.k();
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            Unit unit = Unit.f71690a;
            u11.o(82241656);
            boolean F11 = u11.F(iVar) | u11.n(p12);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$1$1(iVar, p12, null);
                u11.x(C11);
            }
            u11.k();
            e f7 = T.f(L.b(e11, unit, (Function2) C11), Paddings.PADDING_500.m1867getDpD9Ej5fM());
            d.a g10 = InterfaceC6250b.a.g();
            int i13 = C5179b.f39454h;
            C5194q a11 = C5193p.a(C5179b.n(Paddings.PADDING_300.m1867getDpD9Ej5fM()), g10, u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, f7);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g11 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            u11.o(-911723321);
            boolean F12 = u11.F(viewModel) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(state)));
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$2$1$1(viewModel, state);
                u11.x(C12);
            }
            Function1 function12 = (Function1) C12;
            u11.k();
            String searchHint = state.getSearchHint();
            if (searchHint == null) {
                searchHint = "";
            }
            int i14 = i12;
            function1 = actionHandler;
            DsInputBaseKt.m1743DsInputBaseawFkL_c(searchState, (Function1<? super String, Unit>) function12, (e) null, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, (DsInputStatus) null, false, searchHint, (DsInputLabelPosition) null, (String) null, (String) null, (C7807Z) null, (UniIconToken) null, (UniIconToken) null, false, false, false, (N0) null, (M0) null, (Q1.X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) u11, (i12 >> 3) & 14, 0, 0, 536870396);
            u11 = u11;
            if (addressesState.isLoading()) {
                u11.o(1801677839);
                DsLoaderKt.m1753DsLoader3IgeMak(T.j(aVar, 0.0f, Paddings.PADDING_1100.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13), 0L, null, u11, 0, 6);
                u11.k();
            } else {
                u11.o(1801777659);
                UiState.AddressesState addressesState2 = addressesState instanceof UiState.AddressesState ? (UiState.AddressesState) addressesState : null;
                if (addressesState2 != null) {
                    Addresses(addressesState2, function1, u11, (i14 >> 6) & 112);
                }
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$3(state, searchState, addressesState, function1, viewModel, i11));
        }
    }
}
