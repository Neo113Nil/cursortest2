package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import Ae.E0;
import Ae.O0;
import Ae.x0;
import GZ.g;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SubscribeEvent;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010#\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerHeaderViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;LGZ/g;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "", "params", "", "shouldShowMessage", "Lxe/B0;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Z)Lxe/B0;", "dtoValue", "sellerId", "shouldDisplayAsFavourite", "(ZLjava/lang/String;)Z", "", "forceUnlikeState", "(Ljava/lang/String;)V", "clearSubscribeStateFlow", "()V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "LGZ/g;", "authUri", "Ljava/lang/String;", "LAe/x0;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SubscribeEvent;", "subscribeStateFlow", "LAe/x0;", "getSubscribeStateFlow", "()LAe/x0;", "LAe/w0;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/ShowMessageEvent;", "showMessageEventFlow", "LAe/w0;", "getShowMessageEventFlow", "()LAe/w0;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerHeaderViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final String authUri;

    @NotNull
    private final g router;

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    @NotNull
    private final Ae.w0<ShowMessageEvent> showMessageEventFlow;

    @NotNull
    private final x0<SubscribeEvent> subscribeStateFlow;
    public static final int $stable = 8;

    public SellerHeaderViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull AuthStateStorage authStateStorage, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull g router) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(router, "router");
        this.actionV2Repository = actionV2Repository;
        this.authStateStorage = authStateStorage;
        this.sellerFavoriteService = sellerFavoriteService;
        this.router = router;
        String uri = LinkGenerator.INSTANCE.auth().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.authUri = uri;
        this.subscribeStateFlow = O0.a(null);
        this.showMessageEventFlow = E0.b(0, 0, null, 7);
    }

    public static /* synthetic */ B0 processAction$default(SellerHeaderViewModel sellerHeaderViewModel, AtomAction atomAction, Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return sellerHeaderViewModel.processAction(atomAction, map, z11);
    }

    public static /* synthetic */ boolean shouldDisplayAsFavourite$default(SellerHeaderViewModel sellerHeaderViewModel, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return sellerHeaderViewModel.shouldDisplayAsFavourite(z11, str);
    }

    public final void clearSubscribeStateFlow() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SellerHeaderViewModel$clearSubscribeStateFlow$1(this, null), 3);
    }

    public final void forceUnlikeState(@NotNull String sellerId) {
        Intrinsics.checkNotNullParameter(sellerId, "sellerId");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SellerHeaderViewModel$forceUnlikeState$1(this, sellerId, null), 3);
    }

    @NotNull
    public final Ae.w0<ShowMessageEvent> getShowMessageEventFlow() {
        return this.showMessageEventFlow;
    }

    @NotNull
    public final x0<SubscribeEvent> getSubscribeStateFlow() {
        return this.subscribeStateFlow;
    }

    @NotNull
    public final B0 processAction(AtomAction atomAction, Map<String, String> params, boolean shouldShowMessage) {
        return C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SellerHeaderViewModel$processAction$1(atomAction, this, params, shouldShowMessage, null), 3);
    }

    public final boolean shouldDisplayAsFavourite(boolean dtoValue, String sellerId) {
        SubscribeEvent value = this.subscribeStateFlow.getValue();
        SubscribeEvent.SuccessfulEvent successfulEvent = value instanceof SubscribeEvent.SuccessfulEvent ? (SubscribeEvent.SuccessfulEvent) value : null;
        return (successfulEvent == null || !Intrinsics.d(successfulEvent.getSellerId(), sellerId)) ? dtoValue : Intrinsics.d(successfulEvent.getAction(), "sisLike");
    }
}
