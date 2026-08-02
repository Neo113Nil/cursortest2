package ru.ozon.app.android.search.widgets.brandList.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import GZ.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Vg.e;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import c1.u;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2TopPartVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.brandList.data.BrandListDTO;
import ru.ozon.app.android.search.widgets.brandList.presentation.list.BrandListWithToothKt;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.navBar.BrandListNavBarKt;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import v0.I;
import v0.M;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aA\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00192\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00192\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!¨\u0006\"²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListVI;", "state", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "LGZ/g;", "router", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListViewModel;", "viewModel", "", "BrandListWidget-Q4CkjMc", "(Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListVI;LVg/e$a;LGZ/g;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListViewModel;LS0/k;I)V", "BrandListWidget", "LWZ/t;", "tokenizedEvent", "ViewAnalytics", "(LWZ/t;LS0/k;I)V", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "getFavoriteCells", "(Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListVI;Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListViewModel;)Ljava/util/List;", "favoriteCells", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "combineCells", "(Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListVI;Ljava/util/List;)Ljava/util/Map;", "combinedCells", "", "searchText", "filterItemsBySearch", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BrandListWidgetKt {
    /* renamed from: BrandListWidget-Q4CkjMc, reason: not valid java name */
    public static final void m962BrandListWidgetQ4CkjMc(@NotNull BrandListVI state, @NotNull e.a actionHandlerBuilder, @NotNull g router, @NotNull ComposeSisBrandFavoriteButtonDelegateFactory sisBrandFavoriteButtonDelegateFactory, EmptyStateV2TopPartVO emptyStateV2TopPartVO, @NotNull BrandListViewModel viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandlerBuilder, "actionHandlerBuilder");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteButtonDelegateFactory, "sisBrandFavoriteButtonDelegateFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(1743692526);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(actionHandlerBuilder) : u11.F(actionHandlerBuilder) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(router) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(sisBrandFavoriteButtonDelegateFactory) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? u11.n(emptyStateV2TopPartVO) : u11.F(emptyStateV2TopPartVO) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(viewModel) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(1131533582);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(viewModel.getTextState(), D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            List<Long> favorites = state.getFavorites();
            u11.o(1131536352);
            boolean F11 = u11.F(viewModel) | u11.F(state);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new BrandListWidgetKt$BrandListWidget$1$1(viewModel, state, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, favorites, (Function2) C12);
            List<FavoriteCell> favoriteCells = getFavoriteCells(state, viewModel);
            u11.o(1131541856);
            boolean n11 = u11.n(favoriteCells);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = combineCells(state, favoriteCells);
                u11.x(C13);
            }
            u11.k();
            Map<TitleCell, List<FavoriteCell>> filterItemsBySearch = filterItemsBySearch((Map) C13, BrandListWidget_Q4CkjMc$lambda$1(interfaceC3978p0));
            I c11 = M.c(0, 0, u11, 3);
            String BrandListWidget_Q4CkjMc$lambda$1 = BrandListWidget_Q4CkjMc$lambda$1(interfaceC3978p0);
            u11.o(1131550747);
            boolean F12 = u11.F(viewModel) | u11.n(c11);
            Object C14 = u11.C();
            if (F12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new BrandListWidgetKt$BrandListWidget$2$1(viewModel, c11, interfaceC3978p0, null);
                u11.x(C14);
            }
            u11.k();
            Q.e(u11, BrandListWidget_Q4CkjMc$lambda$1, (Function2) C14);
            ViewAnalytics(state.getTokenizedEvent(), u11, 0);
            androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = c.f(u11, e11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            I i13 = c11;
            BrandListDTO.NavBar navBar = state.getNavBar();
            u11.o(-1192609733);
            if (navBar == null) {
                c3969l = u11;
            } else {
                String BrandListWidget_Q4CkjMc$lambda$12 = BrandListWidget_Q4CkjMc$lambda$1(interfaceC3978p0);
                u11.o(714591392);
                boolean F13 = u11.F(viewModel);
                Object C15 = u11.C();
                if (F13 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new BrandListWidgetKt$BrandListWidget$3$1$1$1(viewModel, interfaceC3978p0);
                    u11.x(C15);
                }
                Function1 function1 = (Function1) C15;
                u11.k();
                u11.o(714595553);
                boolean F14 = u11.F(viewModel);
                Object C16 = u11.C();
                if (F14 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new BrandListWidgetKt$BrandListWidget$3$1$2$1(viewModel, interfaceC3978p0);
                    u11.x(C16);
                }
                Function0 function0 = (Function0) C16;
                u11.k();
                u11.o(714585709);
                boolean F15 = u11.F(viewModel) | u11.F(router);
                Object C17 = u11.C();
                if (F15 || C17 == InterfaceC3967k.a.a()) {
                    C17 = new BrandListWidgetKt$BrandListWidget$3$1$3$1(viewModel, router, interfaceC3978p0);
                    u11.x(C17);
                }
                u11.k();
                i13 = i13;
                c3969l = u11;
                BrandListNavBarKt.BrandListNavBar(navBar, BrandListWidget_Q4CkjMc$lambda$12, function1, function0, (Function0) C17, c3969l, IconDTO.$stable | IconButtonV3DTO.$stable);
            }
            c3969l.k();
            I i14 = i13;
            BrandListWithToothKt.m966BrandListWithToothvqFMAM(filterItemsBySearch, actionHandlerBuilder, i14, sisBrandFavoriteButtonDelegateFactory, emptyStateV2TopPartVO, c3969l, (i12 & 57344) | (i12 & 112) | 64 | (i12 & 7168) | (EmptyStateV2TopPartVO.$stable << 12));
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new BrandListWidgetKt$BrandListWidget$4(state, actionHandlerBuilder, router, sisBrandFavoriteButtonDelegateFactory, emptyStateV2TopPartVO, viewModel, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BrandListWidget_Q4CkjMc$lambda$1(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViewAnalytics(t tVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1451528598);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            if (tVar != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1413063499);
                boolean F11 = u11.F(lVar) | u11.F(tVar);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new BrandListWidgetKt$ViewAnalytics$1$1$1(lVar, tVar);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BrandListWidgetKt$ViewAnalytics$2(tVar, i11));
        }
    }

    private static final Map<TitleCell, List<FavoriteCell>> combineCells(BrandListVI brandListVI, List<FavoriteCell> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!list.isEmpty()) {
            linkedHashMap.put(brandListVI.getTitleFavorite(), list);
        }
        Map<TitleCell, List<FavoriteCell>> sections = brandListVI.getSections();
        if (sections == null) {
            sections = U.c();
        }
        linkedHashMap.putAll(sections);
        return linkedHashMap;
    }

    private static final Map<TitleCell, List<FavoriteCell>> filterItemsBySearch(Map<TitleCell, ? extends List<FavoriteCell>> map, String str) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<TitleCell, ? extends List<FavoriteCell>> entry : map.entrySet()) {
            TitleCell key = entry.getKey();
            List<FavoriteCell> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                if (h.t(((FavoriteCell) obj).getCell().getCenterBlock().getTitle().getText(), str, true)) {
                    arrayList2.add(obj);
                }
            }
            Pair pair = !arrayList2.isEmpty() ? new Pair(key, arrayList2) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return U.s(arrayList);
    }

    private static final List<FavoriteCell> getFavoriteCells(BrandListVI brandListVI, BrandListViewModel brandListViewModel) {
        Collection<List<FavoriteCell>> values;
        Map<TitleCell, List<FavoriteCell>> sections = brandListVI.getSections();
        if (sections == null || (values = sections.values()) == null) {
            return K.f71697a;
        }
        ArrayList N11 = C7714v.N(values);
        ArrayList arrayList = new ArrayList();
        Iterator it = N11.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            u<Long> favorites = brandListViewModel.getFavorites();
            SisBrandFavoriteButton favoriteButton = ((FavoriteCell) next).getFavoriteButton();
            if (C7714v.A(favorites, favoriteButton != null ? Long.valueOf(favoriteButton.getId()) : null)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
