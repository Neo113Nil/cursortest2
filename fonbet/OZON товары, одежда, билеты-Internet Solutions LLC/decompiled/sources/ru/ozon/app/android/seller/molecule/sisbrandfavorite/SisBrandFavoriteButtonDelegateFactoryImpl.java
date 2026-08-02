package ru.ozon.app.android.seller.molecule.sisbrandfavorite;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegateImpl;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonView;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactoryImpl;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteButtonDelegateFactory;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;", "sisBrandFavoriteInteractor", "<init>", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;)V", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;", "view", "Lru/ozon/composer/ui/widget/k;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegateImpl;", "create", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonView;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegateImpl;", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/SisBrandFavoriteInteractor;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SisBrandFavoriteButtonDelegateFactoryImpl implements SisBrandFavoriteButtonDelegateFactory {

    @NotNull
    private final SisBrandFavoriteInteractor sisBrandFavoriteInteractor;

    public SisBrandFavoriteButtonDelegateFactoryImpl(@NotNull SisBrandFavoriteInteractor sisBrandFavoriteInteractor) {
        Intrinsics.checkNotNullParameter(sisBrandFavoriteInteractor, "sisBrandFavoriteInteractor");
        this.sisBrandFavoriteInteractor = sisBrandFavoriteInteractor;
    }

    @Override // ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactory
    public /* bridge */ /* synthetic */ SisBrandFavoriteButtonDelegate create(SisBrandFavoriteButtonView sisBrandFavoriteButtonView, k kVar, ComposerReferences composerReferences) {
        return create(sisBrandFavoriteButtonView, (k<?>) kVar, composerReferences);
    }

    @Override // ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteButtonDelegateFactory
    @NotNull
    public SisBrandFavoriteButtonDelegateImpl create(@NotNull SisBrandFavoriteButtonView view, @NotNull k<?> widgetViewHolder, @NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new SisBrandFavoriteButtonDelegateImpl(view, widgetViewHolder, refs, this.sisBrandFavoriteInteractor);
    }
}
