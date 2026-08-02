package ru.ozon.app.android.travel.favorite.delegate;

import Ae.C2380A;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ge.n;
import Sc.InterfaceC4008j;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "isUserAuthenticated", "Lio/reactivex/p;", "authEvents", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;ZLio/reactivex/p;)V", "isFeatureEnabled$delegate", "LSc/j;", "isFeatureEnabled", "()Z", "LAe/h;", "isFeatureActivatedFlow", "LAe/h;", "()LAe/h;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HotelFavoritesForAuthorizedFeatureActivator {

    @NotNull
    private final InterfaceC2395h<Boolean> isFeatureActivatedFlow;

    /* renamed from: isFeatureEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isFeatureEnabled;

    public HotelFavoritesForAuthorizedFeatureActivator(@NotNull FeatureChecker featureChecker, boolean z11, @NotNull p<Boolean> authEvents) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(authEvents, "authEvents");
        this.isFeatureEnabled = LazyUtilsKt.unsafeLazy(new HotelFavoritesForAuthorizedFeatureActivator$isFeatureEnabled$2(featureChecker));
        this.isFeatureActivatedFlow = C2399j.o(C2399j.D(new C2380A(n.a(authEvents), new HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1(z11, null)), new HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2(this, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFeatureEnabled() {
        return ((Boolean) this.isFeatureEnabled.getValue()).booleanValue();
    }

    @NotNull
    public final InterfaceC2395h<Boolean> isFeatureActivatedFlow() {
        return this.isFeatureActivatedFlow;
    }
}
