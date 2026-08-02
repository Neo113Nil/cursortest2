package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Vg.e;
import androidx.compose.foundation.layout.T;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.FavoriteCell;
import ru.ozon.app.android.search.widgets.brandList.presentation.models.TitleCell;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u00002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aO\u0010\u0010\u001a\u00020\r2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/TitleCell;", "", "Lru/ozon/app/android/search/widgets/brandList/presentation/models/FavoriteCell;", "state", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandler", "Lv0/I;", "lazyListState", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "", "CellList--vqFMAM", "(Ljava/util/Map;LVg/e$a;Lv0/I;Landroidx/compose/ui/e;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;LS0/k;I)V", "CellList", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CellListKt {
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        if (r11.F(r17 != null ? ru.ozon.app.android.action.WidgetActionHandlerBuilder.m469boximpl(r17) : null) != false) goto L63;
     */
    /* renamed from: CellList--vqFMAM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m967CellListvqFMAM(Map<TitleCell, ? extends List<FavoriteCell>> map, e.a aVar, @NotNull I lazyListState, @NotNull androidx.compose.ui.e modifier, ComposeSisBrandFavoriteButtonDelegateFactory composeSisBrandFavoriteButtonDelegateFactory, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        Object C11;
        boolean F11;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(-90124355);
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
            i12 |= u11.n(modifier) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(composeSisBrandFavoriteButtonDelegateFactory) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            C9915y b11 = T.b(0.0f, UniTheme.INSTANCE.getPaddings().getPadding300(), 0.0f, 0.0f, 13);
            u11.o(1759126143);
            boolean F12 = u11.F(map) | u11.F(composeSisBrandFavoriteButtonDelegateFactory);
            if ((i12 & 112) != 32) {
                if ((i12 & 64) != 0) {
                }
                z11 = false;
                z12 = z11 | F12;
                C11 = u11.C();
                if (!z12 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new CellListKt$CellList$1$1(map, composeSisBrandFavoriteButtonDelegateFactory, aVar);
                    u11.x(C11);
                }
                u11.k();
                C10164d.a(modifier, lazyListState, b11, null, null, null, false, (Function1) C11, u11, ((i12 >> 9) & 14) | ((i12 >> 3) & 112), 248);
            }
            z11 = true;
            z12 = z11 | F12;
            C11 = u11.C();
            if (!z12) {
            }
            C11 = new CellListKt$CellList$1$1(map, composeSisBrandFavoriteButtonDelegateFactory, aVar);
            u11.x(C11);
            u11.k();
            C10164d.a(modifier, lazyListState, b11, null, null, null, false, (Function1) C11, u11, ((i12 >> 9) & 14) | ((i12 >> 3) & 112), 248);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CellListKt$CellList$2(map, aVar, lazyListState, modifier, composeSisBrandFavoriteButtonDelegateFactory, i11));
        }
    }
}
