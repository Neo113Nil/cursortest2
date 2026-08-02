package ru.ozon.app.android.search.widgets.brandList.presentation.navBar;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a00.C4911f;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.brandList.data.BrandListDTO;
import ru.ozon.app.android.search.widgets.brandList.presentation.Paddings;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.E;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;", "state", "", "searchText", "Lkotlin/Function1;", "", "onValueChange", "Lkotlin/Function0;", "onClear", "onBack", "BrandListNavBar", "(Lru/ozon/app/android/search/widgets/brandList/data/BrandListDTO$NavBar;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BrandListNavBarKt {
    public static final void BrandListNavBar(@NotNull BrandListDTO.NavBar state, @NotNull String searchText, @NotNull Function1<? super String, Unit> onValueChange, @NotNull Function0<Unit> onClear, @NotNull Function0<Unit> onBack, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l c3969l;
        boolean z11;
        Unit unit;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onClear, "onClear");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        C3969l u11 = interfaceC3967k.u(530437459);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(searchText) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onValueChange) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onClear) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onBack) ? 16384 : 8192;
        }
        int i13 = i12;
        if ((i13 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            UniTheme uniTheme = UniTheme.INSTANCE;
            long bgDarkKey = uniTheme.getColors(u11, UniTheme.$stable).getBgDarkKey();
            StatusBarController.INSTANCE.setStatusBarBackgroundColor(((C4911f) u11.m(f.d())).c(), StatusBarController.UpdateReason.NewState.INSTANCE, ThemeExtKt.themeColor((Context) u11.m(AndroidCompositionLocals_androidKt.d()), R$attr.layerFloor0));
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(aVar, bgDarkKey, y0.a());
            Paddings paddings = Paddings.INSTANCE;
            e f7 = a0.f(a0.e(T.g(b11, paddings.m963getHorizontalPaddingsD9Ej5fM(), paddings.m965getVerticalPaddingsD9Ej5fM()), 1.0f), 48);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, f7);
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
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            BrandListDTO.SearchBar searchBar = state.getSearchBar();
            u11.o(-1405465015);
            if (searchBar == null) {
                unit = null;
                c3969l = u11;
                z11 = true;
            } else {
                e a12 = c9891d.a(aVar, 1.0f, true);
                int i14 = i13 << 3;
                int i15 = IconDTO.$stable | (i14 & 896) | (i14 & 7168) | (i14 & 57344);
                c3969l = u11;
                z11 = true;
                SearchBarKt.SearchBar(searchBar, a12, searchText, onValueChange, onClear, c3969l, i15, 0);
                unit = Unit.f71690a;
            }
            c3969l.k();
            c3969l.o(-1405465472);
            if (unit == null) {
                E.a(c3969l, c9891d.a(aVar, 1.0f, z11));
            }
            c3969l.k();
            IconButtonV3DTO closeButton = state.getCloseButton();
            c3969l.o(-1405452402);
            if (closeButton != null) {
                c3969l.o(-1334728136);
                boolean z12 = (i13 & 57344) == 16384 ? z11 : false;
                Object C11 = c3969l.C();
                if (z12 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new BrandListNavBarKt$BrandListNavBar$1$3$1$1(onBack);
                    c3969l.x(C11);
                }
                c3969l.k();
                DsIconButtonAtomKt.DsIconButtonAtom(closeButton, T.j(i.c(aVar, false, null, null, (Function0) C11, 7), uniTheme.getPaddings().getPadding300(), 0.0f, 0.0f, 0.0f, 14), false, null, c3969l, IconButtonV3DTO.$stable, 12);
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new BrandListNavBarKt$BrandListNavBar$2(state, searchText, onValueChange, onClear, onBack, i11));
        }
    }
}
