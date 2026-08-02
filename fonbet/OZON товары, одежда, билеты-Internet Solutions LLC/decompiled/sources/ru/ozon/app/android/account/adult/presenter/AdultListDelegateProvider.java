package ru.ozon.app.android.account.adult.presenter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "get", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "T", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdultListDelegateProvider {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final FeatureChecker featureChecker;

    public AdultListDelegateProvider(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
    }

    @NotNull
    public final <T extends AdultVO> AdultListDelegate<T> get() {
        return new AdultListDelegate<>(this.adultHandler, this.featureChecker);
    }
}
