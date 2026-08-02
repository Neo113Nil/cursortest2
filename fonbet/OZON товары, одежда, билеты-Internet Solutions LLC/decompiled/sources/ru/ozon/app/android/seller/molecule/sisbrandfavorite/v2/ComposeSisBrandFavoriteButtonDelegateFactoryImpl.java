package ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2;

import Vg.e;
import a00.C4911f;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactoryImpl;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;", "sisBrandFavoriteInteractor", "<init>", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;)V", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "view", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "La00/f;", "ownerContainer", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateImpl;", "create-wXMEtSA", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;Landroidx/lifecycle/J;LVg/e$a;La00/f;)Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateImpl;", "create", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeSisBrandFavoriteButtonDelegateFactoryImpl implements ComposeSisBrandFavoriteButtonDelegateFactory {

    @NotNull
    private final SisBrandFavoriteInteractor sisBrandFavoriteInteractor;

    public ComposeSisBrandFavoriteButtonDelegateFactoryImpl(@NotNull SisBrandFavoriteInteractor sisBrandFavoriteInteractor) {
        Intrinsics.checkNotNullParameter(sisBrandFavoriteInteractor, "sisBrandFavoriteInteractor");
        this.sisBrandFavoriteInteractor = sisBrandFavoriteInteractor;
    }

    @Override // ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory
    @NotNull
    /* renamed from: create-wXMEtSA */
    public ComposeSisBrandFavoriteButtonDelegateImpl mo996createwXMEtSA(@NotNull SisBrandFavoriteButtonView view, @NotNull J lifecycleOwner, @NotNull e.a actionHandlerBuilder, @NotNull C4911f ownerContainer) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandlerBuilder, "actionHandlerBuilder");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        return new ComposeSisBrandFavoriteButtonDelegateImpl(view, lifecycleOwner, ownerContainer, this.sisBrandFavoriteInteractor, actionHandlerBuilder, null);
    }
}
