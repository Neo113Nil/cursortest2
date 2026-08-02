package ru.ozon.app.android.ugcratingmolecule.presentation.factory;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegate;
import ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegateImpl;
import ru.ozon.app.android.ugcratingservice.UgcRatingService;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/factory/UgcRatingDelegateFactoryImpl;", "Lru/ozon/app/android/ugcratingmolecule/presentation/factory/UgcRatingDelegateFactory;", "ugcRatingService", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "<init>", "(Lru/ozon/app/android/ugcratingservice/UgcRatingService;)V", "create", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegate;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcRatingDelegateFactoryImpl implements UgcRatingDelegateFactory {

    @NotNull
    private final UgcRatingService ugcRatingService;

    public UgcRatingDelegateFactoryImpl(@NotNull UgcRatingService ugcRatingService) {
        Intrinsics.checkNotNullParameter(ugcRatingService, "ugcRatingService");
        this.ugcRatingService = ugcRatingService;
    }

    @Override // ru.ozon.app.android.ugcratingmolecule.presentation.factory.UgcRatingDelegateFactory
    @NotNull
    public UgcRatingDelegate create(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new UgcRatingDelegateImpl(refs, this.ugcRatingService);
    }
}
