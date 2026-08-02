package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct;

import Bc.C2626a;
import Bc.h;
import Bc.i;
import Bc.j;
import Bc.r;
import Fy.C3065c;
import HZ.d;
import Nc.C3669c;
import Ty.g;
import W10.c;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import ht.C6974a;
import io.reactivex.C;
import io.reactivex.p;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.api.FavoriteRequest;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionSelectionResponse;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResponse;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResult;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import sc.C9653a;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001GB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142$\b\u0002\u0010\u001b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b&\u0010#J\u0015\u0010(\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\r¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u0004\u0018\u00010\u00142\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+J_\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122$\b\u0002\u0010\u001b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016H\u0003¢\u0006\u0004\b.\u0010/J_\u00100\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122$\b\u0002\u0010\u001b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0016H\u0002¢\u0006\u0004\b0\u0010/J'\u00101\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b1\u00102J'\u00103\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b3\u00102J\u0015\u00105\u001a\u0004\u0018\u000104*\u00020\rH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\n 8*\u0004\u0018\u00010707H\u0002¢\u0006\u0004\b9\u0010:J)\u0010;\u001a\u00020\u001a*\u00060\u000fj\u0002`\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b;\u0010<J)\u0010=\u001a\u00020\u001a*\u00060\u000fj\u0002`\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b=\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\"\u0010D\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010C0C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010F\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010!0!0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010E¨\u0006H"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repo", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "LHZ/d;", "deeplinkMiniAppMapper", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "applicationAnalyticsScreenStorage", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;LHZ/d;LSg/a;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "", "defaultChange", "Lkotlin/Function1;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "fallbackAnalytics", "addFavoriteChangeRequest", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;LWZ/l;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;ZLkotlin/jvm/functions/Function1;)V", "", "sku", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "observeFavoritesUpdates", "(J)Lio/reactivex/p;", "favoriteId", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;", "observeOutFavoritesEvents", "updatedMolecule", "shareUpdateMolecule", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "getCurrentFavState", "(J)Ljava/lang/Boolean;", "Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;", "onFavoriteChanged", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;LWZ/l;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Lkotlin/jvm/functions/Function1;)Lio/reactivex/y;", "onFavoriteDefaultChange", "processFavoriteChange", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)Lio/reactivex/y;", "processFavoriteDefaultChange", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "extractRequestForFavoriteChange", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "Lnc/b;", "kotlin.jvm.PlatformType", "observeRequests", "()Lnc/b;", "sendAnalytics", "(LWZ/l;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "sendSelectionAnalytics", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "LHZ/d;", "LSg/a;", "LNc/c;", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor$FavoriteChangeRequest;", "favoriteChangeRequests", "LNc/c;", "favoriteMoleculeUpdates", "FavoriteChangeRequest", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteProductMoleculeInteractor {

    @NotNull
    private final ActionV2Repository actionV2Repo;

    @NotNull
    private final Sg.a applicationAnalyticsScreenStorage;

    @NotNull
    private final d deeplinkMiniAppMapper;

    @NotNull
    private final C3669c<FavoriteChangeRequest> favoriteChangeRequests;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final C3669c<FavoriteChangeResult> favoriteMoleculeUpdates;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012$\b\u0002\u0010\u0010\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR3\u0010\u0010\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor$FavoriteChangeRequest;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "defaultChange", "Lkotlin/Function1;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "fallbackAnalytics", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;LWZ/l;ZLkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getMolecule", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "getAnalyticData", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Z", "getDefaultChange", "()Z", "Lkotlin/jvm/functions/Function1;", "getFallbackAnalytics", "()Lkotlin/jvm/functions/Function1;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    static final class FavoriteChangeRequest {
        private final AnalyticData analyticData;
        private final boolean defaultChange;
        private final Function1<Map<String, TokenizedTrackingInfo>, Unit> fallbackAnalytics;

        @NotNull
        private final FavoriteProductMolecule molecule;
        private final l tokenizedAnalytics;

        /* JADX WARN: Multi-variable type inference failed */
        public FavoriteChangeRequest(@NotNull FavoriteProductMolecule molecule, AnalyticData analyticData, l lVar, boolean z11, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> function1) {
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            this.molecule = molecule;
            this.analyticData = analyticData;
            this.tokenizedAnalytics = lVar;
            this.defaultChange = z11;
            this.fallbackAnalytics = function1;
        }

        public final AnalyticData getAnalyticData() {
            return this.analyticData;
        }

        public final boolean getDefaultChange() {
            return this.defaultChange;
        }

        public final Function1<Map<String, TokenizedTrackingInfo>, Unit> getFallbackAnalytics() {
            return this.fallbackAnalytics;
        }

        @NotNull
        public final FavoriteProductMolecule getMolecule() {
            return this.molecule;
        }

        public final l getTokenizedAnalytics() {
            return this.tokenizedAnalytics;
        }
    }

    public FavoriteProductMoleculeInteractor(@NotNull ActionV2Repository actionV2Repo, @NotNull FavoriteManager favoriteManager, @NotNull d deeplinkMiniAppMapper, @NotNull Sg.a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(actionV2Repo, "actionV2Repo");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(deeplinkMiniAppMapper, "deeplinkMiniAppMapper");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.actionV2Repo = actionV2Repo;
        this.favoriteManager = favoriteManager;
        this.deeplinkMiniAppMapper = deeplinkMiniAppMapper;
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
        C3669c<FavoriteChangeRequest> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.favoriteChangeRequests = d11;
        C3669c<FavoriteChangeResult> d12 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d12, "create(...)");
        this.favoriteMoleculeUpdates = d12;
        observeRequests();
    }

    private final ActionV2Request extractRequestForFavoriteChange(FavoriteProductMolecule favoriteProductMolecule) {
        Map<String, String> params;
        String str;
        AtomActionDTO action;
        String link;
        AtomActionDTO action2 = FavoriteProductMoleculeKt.getButton(favoriteProductMolecule).getAction();
        if (action2 == null || (params = action2.getParams()) == null || (str = params.get("sku")) == null || (action = FavoriteProductMoleculeKt.getButton(favoriteProductMolecule).getAction()) == null || (link = action.getLink()) == null) {
            return null;
        }
        List a02 = C7714v.a0(Long.valueOf(Long.parseLong(str)));
        Rg.a a11 = this.applicationAnalyticsScreenStorage.a();
        String c11 = a11 != null ? a11.c() : null;
        String a12 = this.deeplinkMiniAppMapper.a();
        return new ActionV2Request(new FavoriteRequest(a02, c11, Intrinsics.d(a12, "main") ? null : a12), link, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeFavoritesUpdates$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductFavoriteEvent observeOutFavoritesEvents$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ProductFavoriteEvent) function1.invoke(p02);
    }

    private final InterfaceC8487b observeRequests() {
        return this.favoriteChangeRequests.debounce(300L, TimeUnit.MILLISECONDS).concatMapSingle(new ht.b(new FavoriteProductMoleculeInteractor$observeRequests$1(this), 0)).subscribe(new Fl.a(new FavoriteProductMoleculeInteractor$observeRequests$2(this.favoriteMoleculeUpdates), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C observeRequests$lambda$14(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public final y<FavoriteChangeResponse> onFavoriteChanged(FavoriteProductMolecule molecule, l tokenizedAnalytics, AnalyticData analyticData, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> fallbackAnalytics) {
        y<FavoriteChangeResponse> processFavoriteChange = processFavoriteChange(molecule, analyticData);
        processFavoriteChange.getClass();
        C2626a c2626a = new C2626a(processFavoriteChange);
        new i(new h(new r(c2626a, new GH.b(FavoriteProductMoleculeInteractor$onFavoriteChanged$result$1$1.INSTANCE, 8)), new C3065c(new FavoriteProductMoleculeInteractor$onFavoriteChanged$result$1$2(this, molecule), 11)), new Gy.a(new FavoriteProductMoleculeInteractor$onFavoriteChanged$result$1$3(this, molecule), 7)).h(C9653a.g(), C9653a.f98525e);
        j jVar = new j(c2626a, new Gy.b(new FavoriteProductMoleculeInteractor$onFavoriteChanged$1(tokenizedAnalytics, this, molecule, analyticData, fallbackAnalytics), 7));
        Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteProductMolecule onFavoriteChanged$lambda$5$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (FavoriteProductMolecule) function1.invoke(p02);
    }

    private final y<FavoriteChangeResponse> onFavoriteDefaultChange(FavoriteProductMolecule molecule, l tokenizedAnalytics, AnalyticData analyticData, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> fallbackAnalytics) {
        y<FavoriteChangeResponse> processFavoriteDefaultChange = processFavoriteDefaultChange(molecule, analyticData);
        GH.a aVar = new GH.a(new FavoriteProductMoleculeInteractor$onFavoriteDefaultChange$1(tokenizedAnalytics, this, molecule, analyticData, fallbackAnalytics), 10);
        processFavoriteDefaultChange.getClass();
        j jVar = new j(processFavoriteDefaultChange, aVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ y onFavoriteDefaultChange$default(FavoriteProductMoleculeInteractor favoriteProductMoleculeInteractor, FavoriteProductMolecule favoriteProductMolecule, l lVar, AnalyticData analyticData, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            analyticData = null;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        return favoriteProductMoleculeInteractor.onFavoriteDefaultChange(favoriteProductMolecule, lVar, analyticData, function1);
    }

    private final y<FavoriteChangeResponse> processFavoriteChange(FavoriteProductMolecule molecule, AnalyticData analyticData) {
        ActionV2Repository actionV2Repository = this.actionV2Repo;
        ActionV2Request extractRequestForFavoriteChange = extractRequestForFavoriteChange(molecule);
        if (extractRequestForFavoriteChange == null) {
            Bc.l e11 = y.e(new Exception("Invalid request data"));
            Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
            return e11;
        }
        c trackingData = analyticData != null ? analyticData.getTrackingData() : null;
        if (trackingData == null) {
            trackingData = new c(null, null, null);
        }
        y callActionWithTracking = actionV2Repository.callActionWithTracking(extractRequestForFavoriteChange, trackingData, FavoriteActionV2Response.class);
        Gy.c cVar = new Gy.c(new FavoriteProductMoleculeInteractor$processFavoriteChange$2(molecule), 5);
        callActionWithTracking.getClass();
        r rVar = new r(callActionWithTracking, cVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteChangeResponse processFavoriteChange$lambda$9(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (FavoriteChangeResponse) function1.invoke(p02);
    }

    private final y<FavoriteChangeResponse> processFavoriteDefaultChange(FavoriteProductMolecule molecule, AnalyticData analyticData) {
        ActionV2Request actionV2Request;
        ActionV2Repository actionV2Repository = this.actionV2Repo;
        AtomActionDTO action = FavoriteProductMoleculeKt.getButton(molecule).getAction();
        if (action != null) {
            String link = action.getLink();
            if (link == null) {
                actionV2Request = null;
            } else {
                Object params = action.getParams();
                if (params == null) {
                    params = new JSONObject();
                }
                actionV2Request = new ActionV2Request(params, link, false, 4, null);
            }
            if (actionV2Request != null) {
                c trackingData = analyticData != null ? analyticData.getTrackingData() : null;
                if (trackingData == null) {
                    trackingData = new c(null, null, null);
                }
                y callActionWithTracking = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, FavoriteActionSelectionResponse.class);
                BO.b bVar = new BO.b(new FavoriteProductMoleculeInteractor$processFavoriteDefaultChange$2(molecule), 8);
                callActionWithTracking.getClass();
                r rVar = new r(callActionWithTracking, bVar);
                Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
                return rVar;
            }
        }
        Bc.l e11 = y.e(new Exception("Invalid request data"));
        Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteChangeResponse processFavoriteDefaultChange$lambda$12(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (FavoriteChangeResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalytics(l lVar, FavoriteProductMolecule favoriteProductMolecule, AnalyticData analyticData) {
        Map<String, TokenizedTrackingInfo> trackingInfo = FavoriteProductMoleculeKt.getButton(favoriteProductMolecule).getTrackingInfo();
        if (trackingInfo != null) {
            t mapToTokenizedEvent = TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, analyticData != null ? analyticData.getVoId() : null, FavoriteProductMoleculeKt.getAnalyticActionType(favoriteProductMolecule));
            if (mapToTokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(lVar, mapToTokenizedEvent, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSelectionAnalytics(l lVar, FavoriteProductMolecule favoriteProductMolecule, AnalyticData analyticData) {
        Map<String, TokenizedTrackingInfo> trackingInfo = FavoriteProductMoleculeKt.getButton(favoriteProductMolecule).getTrackingInfo();
        if (trackingInfo != null) {
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, analyticData != null ? analyticData.getVoId() : null, null, 2, null);
            if (mapToTokenizedEvent$default != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
            }
        }
    }

    public final void addFavoriteChangeRequest(@NotNull FavoriteProductMolecule molecule, l tokenizedAnalytics, AnalyticData analyticData, boolean defaultChange, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> fallbackAnalytics) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        this.favoriteChangeRequests.onNext(new FavoriteChangeRequest(molecule, analyticData, tokenizedAnalytics, defaultChange, fallbackAnalytics));
    }

    public final Boolean getCurrentFavState(long favoriteId) {
        return this.favoriteManager.getCurrentFavState(favoriteId);
    }

    @NotNull
    public final p<FavoriteChangeResult> observeFavoritesUpdates(long sku) {
        p<FavoriteChangeResult> filter = this.favoriteMoleculeUpdates.filter(new C6974a(new FavoriteProductMoleculeInteractor$observeFavoritesUpdates$1(sku)));
        Intrinsics.checkNotNullExpressionValue(filter, "filter(...)");
        return filter;
    }

    @NotNull
    public final p<ProductFavoriteEvent> observeOutFavoritesEvents(long favoriteId) {
        p map = this.favoriteManager.onFavoriteChange(favoriteId).map(new g(FavoriteProductMoleculeInteractor$observeOutFavoritesEvents$1.INSTANCE, 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void shareUpdateMolecule(@NotNull FavoriteProductMolecule updatedMolecule) {
        Intrinsics.checkNotNullParameter(updatedMolecule, "updatedMolecule");
        if (updatedMolecule.isFavorite()) {
            this.favoriteManager.addFavorite(updatedMolecule.getSku(), updatedMolecule.getChangeSourceId());
        } else {
            this.favoriteManager.removeFromFavorites(updatedMolecule.getSku(), updatedMolecule.getChangeSourceId());
        }
    }
}
