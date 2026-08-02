package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import B1.V;
import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Vg.e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2TopPartVO;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.brandList.presentation.Paddings;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;
import ru.ozon.uni.core.repository.UniTheme;
import v0.I;

@Metadata(d1 = {"\u00002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aQ\u0010\u0010\u001a\u00020\r2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "state", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandler", "Lv0/I;", "lazyListState", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", HammersV3BodyDTO.PLACEHOLDER, "", "BrandListWithTooth--vqFMAM", "(Ljava/util/Map;LVg/e$a;Lv0/I;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;LS0/k;I)V", "BrandListWithTooth", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BrandListWithToothKt {
    /* renamed from: BrandListWithTooth--vqFMAM, reason: not valid java name */
    public static final void m966BrandListWithToothvqFMAM(Map<TitleCell, ? extends List<FavoriteCell>> map, e.a aVar, @NotNull I lazyListState, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, EmptyStateV2TopPartVO emptyStateV2TopPartVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C5187j c5187j;
        int i13;
        boolean F11;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        C3969l u11 = interfaceC3967k.u(-430473029);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(map) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i11 & 64) == 0) {
                F11 = u11.n(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            } else {
                F11 = u11.F(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            }
            i12 |= F11 ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(lazyListState) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(composeSisBrandFavoriteButtonDelegateFactory) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? u11.n(emptyStateV2TopPartVO) : u11.F(emptyStateV2TopPartVO) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            float none = emptyStateV2TopPartVO != null ? UniTheme.INSTANCE.getPaddings().getNone() : Paddings.INSTANCE.m964getTabBarPaddingD9Ej5fM();
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = c.f(u11, aVar2);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            if (map == null || map.isEmpty()) {
                u11.o(1453839374);
                EmptyStateItemKt.EmptyStateItem(emptyStateV2TopPartVO, u11, ((i12 >> 12) & 14) | EmptyStateV2TopPartVO.$stable);
                u11.k();
                c5187j = c5187j2;
                i13 = 0;
            } else {
                u11.o(1453906520);
                c5187j = c5187j2;
                i13 = 0;
                CellListKt.m967CellListvqFMAM(map, aVar, lazyListState, T.j(a0.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, none, 7), composeSisBrandFavoriteButtonDelegateFactory, u11, ((i12 << 3) & 57344) | (i12 & 14) | 64 | (i12 & 112) | (i12 & 896));
                u11.k();
            }
            u11.o(-230181862);
            if (((map == null || map.isEmpty()) ? 1 : i13) == 0 || emptyStateV2TopPartVO != null) {
                ToothItemKt.ToothItem(c5187j.a(aVar2, InterfaceC6250b.a.m()), u11, i13);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BrandListWithToothKt$BrandListWithTooth$2(map, aVar, lazyListState, composeSisBrandFavoriteButtonDelegateFactory, emptyStateV2TopPartVO, i11));
        }
    }
}
