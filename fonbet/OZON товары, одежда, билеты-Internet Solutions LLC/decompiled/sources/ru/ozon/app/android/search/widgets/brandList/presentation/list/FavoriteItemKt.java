package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Tg.b;
import Vg.e;
import a00.C4911f;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.J;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "item", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "", "FavoriteItem-JHTRYPU", "(Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;LVg/e$a;LS0/k;I)V", "FavoriteItem", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteItemKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: FavoriteItem-JHTRYPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m968FavoriteItemJHTRYPU(FavoriteCell favoriteCell, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object favoriteItemKt$FavoriteItem$1$1$1$1$1;
        ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory2;
        e.a aVar2;
        FavoriteCell favoriteCell2;
        J0 m02;
        boolean F11;
        C3969l u11 = interfaceC3967k.u(269908801);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(favoriteCell) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(composeSisBrandFavoriteButtonDelegateFactory) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                F11 = u11.n(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            } else {
                F11 = u11.F(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            }
            i12 |= F11 ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            J j11 = (J) u11.m(r.a());
            C4911f c4911f = (C4911f) u11.m(f.d());
            if (aVar != null) {
                u11.o(-110215768);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(null, D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                u11.o(412808998);
                if (favoriteCell == null) {
                    composeSisBrandFavoriteButtonDelegateFactory2 = composeSisBrandFavoriteButtonDelegateFactory;
                    aVar2 = aVar;
                    favoriteCell2 = favoriteCell;
                } else {
                    e.a aVar3 = androidx.compose.ui.e.f40358c0;
                    androidx.compose.ui.e e11 = a0.e(aVar3, 1.0f);
                    Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                    int I11 = u11.I();
                    A0 d11 = u11.d();
                    androidx.compose.ui.e f7 = c.f(u11, e11);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        Ep.a.d(I11, u11, I11, h11);
                    }
                    F1.b(u11, f7, InterfaceC2801g.a.f());
                    CellDTO cell = favoriteCell.getCell();
                    Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(aVar);
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                    }
                    float f11 = 1.0f;
                    if (1.0f > Float.MAX_VALUE) {
                        f11 = Float.MAX_VALUE;
                    }
                    DsCellAtomKt.DsCellAtom(cell, new LayoutWeightElement(f11, true), m470buildHandlerimpl, u11, CellDTO.$stable, 0);
                    androidx.compose.ui.e j12 = T.j(aVar3, 0.0f, 0.0f, UniTheme.INSTANCE.getPaddings().getPadding300(), 0.0f, 11);
                    u11.o(-230171670);
                    boolean F12 = u11.F(composeSisBrandFavoriteButtonDelegateFactory) | u11.F(j11) | u11.F(aVar) | u11.F(c4911f) | u11.F(favoriteCell);
                    Object C12 = u11.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        favoriteItemKt$FavoriteItem$1$1$1$1$1 = new FavoriteItemKt$FavoriteItem$1$1$1$1$1(interfaceC3978p0, composeSisBrandFavoriteButtonDelegateFactory, j11, aVar, c4911f, favoriteCell);
                        composeSisBrandFavoriteButtonDelegateFactory2 = composeSisBrandFavoriteButtonDelegateFactory;
                        aVar2 = aVar;
                        favoriteCell2 = favoriteCell;
                        u11.x(favoriteItemKt$FavoriteItem$1$1$1$1$1);
                    } else {
                        composeSisBrandFavoriteButtonDelegateFactory2 = composeSisBrandFavoriteButtonDelegateFactory;
                        aVar2 = aVar;
                        favoriteItemKt$FavoriteItem$1$1$1$1$1 = C12;
                        favoriteCell2 = favoriteCell;
                    }
                    Function1 function1 = (Function1) favoriteItemKt$FavoriteItem$1$1$1$1$1;
                    u11.k();
                    u11.o(-230151928);
                    boolean F13 = u11.F(favoriteCell2);
                    Object C13 = u11.C();
                    if (F13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new FavoriteItemKt$FavoriteItem$1$1$1$2$1(interfaceC3978p0, favoriteCell2);
                        u11.x(C13);
                    }
                    u11.k();
                    androidx.compose.ui.viewinterop.a.a(function1, j12, (Function1) C13, u11, 0, 0);
                    u11.f();
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                m02 = u11.m0();
                if (m02 == null) {
                    m02.G(new FavoriteItemKt$FavoriteItem$2(favoriteCell2, composeSisBrandFavoriteButtonDelegateFactory2, aVar2, i11));
                    return;
                }
                return;
            }
        }
        composeSisBrandFavoriteButtonDelegateFactory2 = composeSisBrandFavoriteButtonDelegateFactory;
        aVar2 = aVar;
        favoriteCell2 = favoriteCell;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
