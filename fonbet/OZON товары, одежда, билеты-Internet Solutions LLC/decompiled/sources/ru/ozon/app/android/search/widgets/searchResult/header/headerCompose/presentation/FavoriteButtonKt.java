package ru.ozon.app.android.search.widgets.searchResult.header.headerCompose.presentation;

import Pk0.h;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Vg.e;
import WZ.l;
import a00.C4911f;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.viewinterop.a;
import androidx.lifecycle.J;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.ComposeWidgetInfo;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "widgetId", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "favoriteEntityButton", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;", "favoriteEntityComposeDelegateFactory", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "", "FavoriteButton-oVahEfE", "(JLru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;LVg/e$a;LS0/k;I)V", "FavoriteButton", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: FavoriteButton-oVahEfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m978FavoriteButtonoVahEfE(long j11, FavoriteEntity favoriteEntity, @NotNull FavoriteEntityInteractor favoriteEntityInteractor, @NotNull FavoriteEntityComposeDelegateFactory favoriteEntityComposeDelegateFactory, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        InterfaceC3978p0 interfaceC3978p0;
        C3969l c3969l;
        J0 m02;
        boolean F11;
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        Intrinsics.checkNotNullParameter(favoriteEntityComposeDelegateFactory, "favoriteEntityComposeDelegateFactory");
        C3969l u11 = interfaceC3967k.u(-601221911);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(favoriteEntity) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(favoriteEntityInteractor) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(favoriteEntityComposeDelegateFactory) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            if ((32768 & i11) == 0) {
                F11 = u11.n(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            } else {
                F11 = u11.F(aVar != null ? WidgetActionHandlerBuilder.m469boximpl(aVar) : null);
            }
            i12 |= F11 ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else if (favoriteEntity != null) {
            ComposeWidgetInfo composeWidgetInfo = new ComposeWidgetInfo(j11, (l) u11.m(f.e()), (C4911f) u11.m(f.d()), (J) u11.m(r.a()), (InterfaceC7851b) u11.m(f.c()));
            if (aVar != null) {
                u11.o(-1283421635);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(null, D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
                u11.k();
                androidx.compose.ui.e n11 = a0.n(androidx.compose.ui.e.f40358c0, 24);
                u11.o(-1283416020);
                boolean F12 = u11.F(favoriteEntityComposeDelegateFactory) | u11.F(composeWidgetInfo) | u11.F(favoriteEntityInteractor) | u11.F(aVar);
                Object C12 = u11.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    interfaceC3978p0 = interfaceC3978p02;
                    Object favoriteButtonKt$FavoriteButton$1$1$1 = new FavoriteButtonKt$FavoriteButton$1$1$1(interfaceC3978p0, favoriteEntityComposeDelegateFactory, composeWidgetInfo, favoriteEntityInteractor, aVar);
                    u11.x(favoriteButtonKt$FavoriteButton$1$1$1);
                    C12 = favoriteButtonKt$FavoriteButton$1$1$1;
                } else {
                    interfaceC3978p0 = interfaceC3978p02;
                }
                Function1 function1 = (Function1) C12;
                Object b11 = h.b(u11, -1283400724);
                if (b11 == InterfaceC3967k.a.a()) {
                    b11 = new FavoriteButtonKt$FavoriteButton$1$2$1(interfaceC3978p0);
                    u11.x(b11);
                }
                Function1 function12 = (Function1) b11;
                Object b12 = h.b(u11, -1283386565);
                if (b12 == InterfaceC3967k.a.a()) {
                    b12 = new FavoriteButtonKt$FavoriteButton$1$3$1(interfaceC3978p0);
                    u11.x(b12);
                }
                Function1 function13 = (Function1) b12;
                u11.k();
                u11.o(-1283395273);
                boolean F13 = u11.F(favoriteEntity);
                Object C13 = u11.C();
                if (F13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new FavoriteButtonKt$FavoriteButton$1$4$1(interfaceC3978p0, favoriteEntity);
                    u11.x(C13);
                }
                u11.k();
                c3969l = u11;
                a.b(function1, n11, function12, function13, (Function1) C13, c3969l, 3504, 0);
                m02 = c3969l.m0();
                if (m02 == null) {
                    m02.G(new FavoriteButtonKt$FavoriteButton$2(j11, favoriteEntity, favoriteEntityInteractor, favoriteEntityComposeDelegateFactory, aVar, i11));
                    return;
                }
                return;
            }
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
