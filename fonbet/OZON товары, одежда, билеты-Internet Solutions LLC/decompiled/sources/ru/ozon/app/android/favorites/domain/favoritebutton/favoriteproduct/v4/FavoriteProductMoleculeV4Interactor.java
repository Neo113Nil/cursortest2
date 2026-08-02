package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import Ge.f;
import Ge.n;
import He.b;
import Sc.r;
import Sc.s;
import Sg.a;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.u;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.api.FavoriteRequest;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.v4.FavoriteChangeV4Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.v4.FavoriteChangeV4Result;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.sharedfavoritestate.ProductFavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\u00020\u0001:\u0002:;B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u00020\u001f*\u00060\u000fj\u0002`\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b \u0010!J2\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\"\u0010\u0016J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140#¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140#2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020+0#2\u0006\u0010*\u001a\u00020&¢\u0006\u0004\b,\u0010)J\u0015\u0010-\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u0004\u0018\u00010\u00172\u0006\u0010*\u001a\u00020&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0014058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108¨\u0006<"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repo", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "currentMiniAppHolder", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "applicationAnalyticsScreenStorage", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;LSg/a;)V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/v4/FavoriteChangeV4Result;", "onFavoriteChanged", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;LWZ/l;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "trackingRequired", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/v4/FavoriteChangeV4Response;", "callFavoriteChangeAction", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;ZLru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "extractRequestForFavoriteChange", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "", "sendAnalytics", "(LWZ/l;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "addFavoriteChangeRequest", "LAe/h;", "observeRequests", "()LAe/h;", "", "sku", "observeLastFavoriteUpdates", "(J)LAe/h;", "favoriteId", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/sharedfavoritestate/ProductFavoriteEvent;", "observeAllFavoritesEvents", "updateLocalState", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;)V", "getCurrentFavState", "(J)Ljava/lang/Boolean;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "LSg/a;", "LAe/w0;", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor$FavoriteChangeRequest;", "favoriteChangeRequests", "LAe/w0;", "favoriteMoleculeUpdates", "Companion", "FavoriteChangeRequest", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteProductMoleculeV4Interactor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final M coroutineScope;

    @NotNull
    private final ActionV2Repository actionV2Repo;

    @NotNull
    private final a applicationAnalyticsScreenStorage;

    @NotNull
    private final CurrentMiniAppHolder currentMiniAppHolder;

    @NotNull
    private final w0<FavoriteChangeRequest> favoriteChangeRequests;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final w0<FavoriteChangeV4Result> favoriteMoleculeUpdates;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor$Companion;", "", "<init>", "()V", "Lxe/M;", "coroutineScope", "Lxe/M;", "getCoroutineScope", "()Lxe/M;", "", "TIMEOUT_MILLIS", "J", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final M getCoroutineScope() {
            return FavoriteProductMoleculeV4Interactor.coroutineScope;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor$FavoriteChangeRequest;", "", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;LWZ/l;)V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getMolecule", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "getAnalyticData", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FavoriteChangeRequest {
        private final AnalyticData analyticData;

        @NotNull
        private final FavoriteProductModel molecule;
        private final l tokenizedAnalytics;

        public FavoriteChangeRequest(@NotNull FavoriteProductModel molecule, AnalyticData analyticData, l lVar) {
            Intrinsics.checkNotNullParameter(molecule, "molecule");
            this.molecule = molecule;
            this.analyticData = analyticData;
            this.tokenizedAnalytics = lVar;
        }

        public final AnalyticData getAnalyticData() {
            return this.analyticData;
        }

        @NotNull
        public final FavoriteProductModel getMolecule() {
            return this.molecule;
        }

        public final l getTokenizedAnalytics() {
            return this.tokenizedAnalytics;
        }
    }

    static {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        String simpleName = Companion.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        coroutineScope = N.a(d11.plus(new L(simpleName)).plus(new FavoriteProductMoleculeV4Interactor$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    public FavoriteProductMoleculeV4Interactor(@NotNull ActionV2Repository actionV2Repo, @NotNull FavoriteManager favoriteManager, @NotNull CurrentMiniAppHolder currentMiniAppHolder, @NotNull a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(actionV2Repo, "actionV2Repo");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(currentMiniAppHolder, "currentMiniAppHolder");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.actionV2Repo = actionV2Repo;
        this.favoriteManager = favoriteManager;
        this.currentMiniAppHolder = currentMiniAppHolder;
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
        this.favoriteChangeRequests = E0.b(0, 0, null, 7);
        this.favoriteMoleculeUpdates = E0.b(0, 0, null, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object callFavoriteChangeAction(FavoriteProductModel favoriteProductModel, boolean z11, AnalyticData analyticData, d<? super FavoriteChangeV4Response> dVar) {
        FavoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1 favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1;
        int i11;
        FavoriteProductModel favoriteProductModel2;
        String error;
        if (dVar instanceof FavoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1) {
            favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1 = (FavoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1) dVar;
            int i12 = favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ActionV2Request extractRequestForFavoriteChange = extractRequestForFavoriteChange(favoriteProductModel);
                    if (extractRequestForFavoriteChange == null) {
                        throw new IllegalArgumentException("Invalid request data");
                    }
                    c trackingData = analyticData != null ? analyticData.getTrackingData() : null;
                    y callAction = (!z11 || trackingData == null) ? this.actionV2Repo.callAction(extractRequestForFavoriteChange, FavoriteActionV2Response.class) : this.actionV2Repo.callActionWithTracking(extractRequestForFavoriteChange, trackingData, FavoriteActionV2Response.class);
                    favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.L$0 = favoriteProductModel;
                    favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.label = 1;
                    obj = f.b(callAction, favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    favoriteProductModel2 = favoriteProductModel;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    FavoriteProductModel favoriteProductModel3 = (FavoriteProductModel) favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.L$0;
                    s.b(obj);
                    favoriteProductModel2 = favoriteProductModel3;
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                error = actionV2Response.getError();
                if (error == null) {
                    throw new IllegalStateException(error);
                }
                FavoriteProductModel copy$default = FavoriteProductModel.copy$default(favoriteProductModel2, 0L, !favoriteProductModel2.getIsFavorite(), null, null, null, null, 61, null);
                FavoriteActionV2Response favoriteActionV2Response = (FavoriteActionV2Response) actionV2Response.getData();
                return new FavoriteChangeV4Response(copy$default, favoriteActionV2Response != null ? favoriteActionV2Response.getNotification() : null, actionV2Response.getTrackingPayloads());
            }
        }
        favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1 = new FavoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1(this, dVar);
        Object obj2 = favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = favoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        error = actionV2Response2.getError();
        if (error == null) {
        }
    }

    private final ActionV2Request extractRequestForFavoriteChange(FavoriteProductModel favoriteProductModel) {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        CommonControlSettings common;
        AtomActionDTO action2;
        String link;
        CommonControlSettings common2 = FavoriteProductModelKt.getButton(favoriteProductModel).getCommon();
        if (common2 == null || (action = common2.getAction()) == null || (params = action.getParams()) == null || (str = params.get("sku")) == null || (common = FavoriteProductModelKt.getButton(favoriteProductModel).getCommon()) == null || (action2 = common.getAction()) == null || (link = action2.getLink()) == null) {
            return null;
        }
        List a02 = C7714v.a0(Long.valueOf(Long.parseLong(str)));
        Rg.a a11 = this.applicationAnalyticsScreenStorage.a();
        return new ActionV2Request(new FavoriteRequest(a02, a11 != null ? a11.c() : null, this.currentMiniAppHolder.getCurrentMiniAppExceptMain()), link, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductFavoriteEvent observeAllFavoritesEvents$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ProductFavoriteEvent) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onFavoriteChanged(FavoriteProductModel favoriteProductModel, l lVar, AnalyticData analyticData, d<? super FavoriteChangeV4Result> dVar) {
        FavoriteProductMoleculeV4Interactor$onFavoriteChanged$1 favoriteProductMoleculeV4Interactor$onFavoriteChanged$1;
        int i11;
        FavoriteProductModel favoriteProductModel2;
        Throwable th2;
        Object callFavoriteChangeAction;
        int i12;
        AnalyticData analyticData2;
        FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor;
        Object obj;
        Throwable b11;
        if (dVar instanceof FavoriteProductMoleculeV4Interactor$onFavoriteChanged$1) {
            favoriteProductMoleculeV4Interactor$onFavoriteChanged$1 = (FavoriteProductMoleculeV4Interactor$onFavoriteChanged$1) dVar;
            int i13 = favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.result;
                Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    try {
                        r.Companion companion = r.INSTANCE;
                        int i14 = FavoriteProductModelKt.getButton(favoriteProductModel).getTrackingInfo() != null ? 1 : 0;
                        favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$0 = favoriteProductModel;
                        favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$1 = lVar;
                        favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$2 = analyticData;
                        favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$3 = this;
                        favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.I$0 = i14;
                        favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.label = 1;
                        callFavoriteChangeAction = callFavoriteChangeAction(favoriteProductModel, i14 ^ 1, analyticData, favoriteProductMoleculeV4Interactor$onFavoriteChanged$1);
                        if (callFavoriteChangeAction == obj3) {
                            return obj3;
                        }
                        favoriteProductModel2 = favoriteProductModel;
                        i12 = i14;
                        analyticData2 = analyticData;
                        favoriteProductMoleculeV4Interactor = this;
                    } catch (Throwable th3) {
                        favoriteProductModel2 = favoriteProductModel;
                        th2 = th3;
                        r.Companion companion2 = r.INSTANCE;
                        obj = s.a(th2);
                        b11 = r.b(obj);
                        if (b11 == null) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.I$0;
                    FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor2 = (FavoriteProductMoleculeV4Interactor) favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$3;
                    AnalyticData analyticData3 = (AnalyticData) favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$2;
                    l lVar2 = (l) favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$1;
                    favoriteProductModel2 = (FavoriteProductModel) favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.L$0;
                    try {
                        s.b(obj2);
                        favoriteProductMoleculeV4Interactor = favoriteProductMoleculeV4Interactor2;
                        lVar = lVar2;
                        callFavoriteChangeAction = obj2;
                        analyticData2 = analyticData3;
                    } catch (Throwable th4) {
                        th2 = th4;
                        r.Companion companion22 = r.INSTANCE;
                        obj = s.a(th2);
                        b11 = r.b(obj);
                        if (b11 == null) {
                        }
                    }
                }
                FavoriteChangeV4Response favoriteChangeV4Response = (FavoriteChangeV4Response) callFavoriteChangeAction;
                if (i12 != 0 && lVar != null) {
                    favoriteProductMoleculeV4Interactor.sendAnalytics(lVar, favoriteProductModel2, analyticData2);
                }
                favoriteProductMoleculeV4Interactor.updateLocalState(favoriteChangeV4Response.getMolecule());
                r.Companion companion3 = r.INSTANCE;
                obj = favoriteChangeV4Response;
                b11 = r.b(obj);
                if (b11 == null) {
                    return new FavoriteChangeV4Result.Failure(favoriteProductModel2.getSku(), b11);
                }
                FavoriteChangeV4Response favoriteChangeV4Response2 = (FavoriteChangeV4Response) obj;
                return new FavoriteChangeV4Result.Success(favoriteProductModel2.getSku(), favoriteChangeV4Response2.getMolecule(), favoriteChangeV4Response2.getNotification(), favoriteChangeV4Response2.getNotificationPayloads());
            }
        }
        favoriteProductMoleculeV4Interactor$onFavoriteChanged$1 = new FavoriteProductMoleculeV4Interactor$onFavoriteChanged$1(this, dVar);
        Object obj22 = favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.result;
        Object obj32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = favoriteProductMoleculeV4Interactor$onFavoriteChanged$1.label;
        if (i11 != 0) {
        }
        FavoriteChangeV4Response favoriteChangeV4Response3 = (FavoriteChangeV4Response) callFavoriteChangeAction;
        if (i12 != 0) {
            favoriteProductMoleculeV4Interactor.sendAnalytics(lVar, favoriteProductModel2, analyticData2);
        }
        favoriteProductMoleculeV4Interactor.updateLocalState(favoriteChangeV4Response3.getMolecule());
        r.Companion companion32 = r.INSTANCE;
        obj = favoriteChangeV4Response3;
        b11 = r.b(obj);
        if (b11 == null) {
        }
    }

    private final void sendAnalytics(l lVar, FavoriteProductModel favoriteProductModel, AnalyticData analyticData) {
        Map<String, TokenizedTrackingInfo> trackingInfo = FavoriteProductModelKt.getButton(favoriteProductModel).getTrackingInfo();
        if (trackingInfo != null) {
            t mapToTokenizedEvent = TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, analyticData != null ? analyticData.getVoId() : null, FavoriteProductModelKt.getAnalyticActionType(favoriteProductModel));
            if (mapToTokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, mapToTokenizedEvent, null, 2, null);
            }
        }
    }

    public final Object addFavoriteChangeRequest(@NotNull FavoriteProductModel favoriteProductModel, l lVar, AnalyticData analyticData, @NotNull d<? super Unit> dVar) {
        Object emit = this.favoriteChangeRequests.emit(new FavoriteChangeRequest(favoriteProductModel, analyticData, lVar), dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    public final Boolean getCurrentFavState(long favoriteId) {
        return this.favoriteManager.getCurrentFavState(favoriteId);
    }

    @NotNull
    public final InterfaceC2395h<ProductFavoriteEvent> observeAllFavoritesEvents(long favoriteId) {
        u map = this.favoriteManager.onFavoriteChange(favoriteId).map(new CJ.b(FavoriteProductMoleculeV4Interactor$observeAllFavoritesEvents$1.INSTANCE, 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return n.a(map);
    }

    @NotNull
    public final InterfaceC2395h<FavoriteChangeV4Result> observeLastFavoriteUpdates(final long sku) {
        final w0<FavoriteChangeV4Result> w0Var = this.favoriteMoleculeUpdates;
        return new InterfaceC2395h<FavoriteChangeV4Result>() { // from class: ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor$observeLastFavoriteUpdates$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor$observeLastFavoriteUpdates$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ long $sku$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor$observeLastFavoriteUpdates$$inlined$filter$1$2", f = "FavoriteProductMoleculeV4Interactor.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor$observeLastFavoriteUpdates$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, long j11) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$sku$inlined = j11;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((FavoriteChangeV4Result) obj).getSku() == this.$sku$inlined) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super FavoriteChangeV4Result> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, sku), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    @NotNull
    public final InterfaceC2395h<FavoriteChangeV4Result> observeRequests() {
        return new C2408n0(C2399j.D(C2399j.l(this.favoriteChangeRequests, 300L), new FavoriteProductMoleculeV4Interactor$observeRequests$1(this, null)), new FavoriteProductMoleculeV4Interactor$observeRequests$2(this.favoriteMoleculeUpdates));
    }

    public final void updateLocalState(@NotNull FavoriteProductModel molecule) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        if (molecule.getIsFavorite()) {
            this.favoriteManager.addFavorite(molecule.getSku(), molecule.getChangeSourceId());
        } else {
            this.favoriteManager.removeFromFavorites(molecule.getSku(), molecule.getChangeSourceId());
        }
    }
}
