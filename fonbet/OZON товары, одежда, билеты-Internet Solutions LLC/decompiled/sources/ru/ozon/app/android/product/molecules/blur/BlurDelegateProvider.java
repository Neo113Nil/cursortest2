package ru.ozon.app.android.product.molecules.blur;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "provide", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlurDelegateProvider {

    @NotNull
    private final AdultHandler adultHandler;

    public BlurDelegateProvider(@NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.adultHandler = adultHandler;
    }

    @NotNull
    public final BlurMoleculeDelegate provide() {
        return new BlurMoleculeDelegate(this.adultHandler);
    }
}
