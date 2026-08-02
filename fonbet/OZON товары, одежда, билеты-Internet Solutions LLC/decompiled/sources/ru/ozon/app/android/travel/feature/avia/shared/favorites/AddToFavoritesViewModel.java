package ru.ozon.app.android.travel.feature.avia.shared.favorites;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import BZ.e;
import BZ.f;
import Sg.a;
import WZ.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.favorites.data.api.FavoriteRequest;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellVI;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001e\u0010*\u001a\f\u0012\b\u0012\u00060(j\u0002`)0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R!\u0010+\u001a\f\u0012\b\u0012\u00060(j\u0002`)0#8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "LBZ/e;", "miniAppConfigHolder", "LSg/a;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/action/v2/ActionV2Repository;LBZ/e;LSg/a;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "extractRequestForFavoriteChange", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "", "toggleClicked", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "changeNotificationDialogShownInSession", "()V", "", "getNotificationDialogShownInSession", "()Z", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LBZ/e;", "LSg/a;", "LAe/w0;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "_notificationFlow", "LAe/w0;", "LAe/B0;", "notificationFlow", "LAe/B0;", "getNotificationFlow", "()LAe/B0;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "_analyticsFlow", "analyticsFlow", "getAnalyticsFlow", "", "", "Lxe/B0;", "toggleJobs", "Ljava/util/Map;", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AddToFavoritesViewModel extends w0 {
    private static boolean notificationDialogShownInSession;

    @NotNull
    private final Ae.w0<t> _analyticsFlow;

    @NotNull
    private final Ae.w0<NotificationDTO> _notificationFlow;

    @NotNull
    private final B0<t> analyticsFlow;

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private final B0<NotificationDTO> notificationFlow;

    @NotNull
    private final ActionV2Repository repository;

    @NotNull
    private final Map<Long, xe.B0> toggleJobs;
    public static final int $stable = 8;

    public AddToFavoritesViewModel(@NotNull FavoriteManager favoriteManager, @NotNull ActionV2Repository repository, @NotNull e miniAppConfigHolder, @NotNull a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.favoriteManager = favoriteManager;
        this.repository = repository;
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.analyticsScreenStorage = analyticsScreenStorage;
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        C0 a11 = E0.a(0, 1, enumC11113a);
        this._notificationFlow = a11;
        this.notificationFlow = C2399j.a(a11);
        C0 a12 = E0.a(0, 1, enumC11113a);
        this._analyticsFlow = a12;
        this.analyticsFlow = C2399j.a(a12);
        this.toggleJobs = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Request extractRequestForFavoriteChange(AddToFavoritesCellVI.AddToFavoritesCellModelVI addToFavoritesCellModelVI) {
        Long sku = addToFavoritesCellModelVI.getSku();
        if (sku == null) {
            return null;
        }
        List a02 = C7714v.a0(sku);
        Rg.a a11 = this.analyticsScreenStorage.a();
        return new ActionV2Request(new FavoriteRequest(a02, a11 != null ? a11.c() : null, f.a(this.miniAppConfigHolder)), addToFavoritesCellModelVI.getIsFavorite() ? addToFavoritesCellModelVI.getDeleteLink() : addToFavoritesCellModelVI.getAddLink(), false, 4, null);
    }

    public final void changeNotificationDialogShownInSession() {
        notificationDialogShownInSession = true;
    }

    @NotNull
    public final B0<t> getAnalyticsFlow() {
        return this.analyticsFlow;
    }

    public final boolean getNotificationDialogShownInSession() {
        return notificationDialogShownInSession;
    }

    @NotNull
    public final B0<NotificationDTO> getNotificationFlow() {
        return this.notificationFlow;
    }

    public final void toggleClicked(@NotNull AddToFavoritesCellVI.AddToFavoritesCellModelVI molecule, AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        Long sku = molecule.getSku();
        if (sku != null) {
            long longValue = sku.longValue();
            xe.B0 b02 = this.toggleJobs.get(sku);
            if (b02 != null) {
                b02.j(null);
            }
            this.toggleJobs.put(sku, C10727i.c(x0.a(this), null, null, new AddToFavoritesViewModel$toggleClicked$1(molecule, this, longValue, analyticData, null), 3));
        }
    }
}
