package ru.ozon.app.android.search.widgets.modalButton.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.modalButton.data.ModalButtonConfig;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonBurgerViewMapper;
import ru.ozon.app.android.search.widgets.modalButton.presentation.ModalButtonViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/modalButton/di/ModalButtonDiModule;", "", "<init>", "()V", "provideModalButtonWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/search/widgets/modalButton/data/ModalButtonConfig;", "modalButtonViewMapper", "Lru/ozon/app/android/search/widgets/modalButton/presentation/ModalButtonViewMapper;", "modalButtonBurgerViewMapper", "Lru/ozon/app/android/search/widgets/modalButton/presentation/ModalButtonBurgerViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModalButtonDiModule {

    @NotNull
    public static final ModalButtonDiModule INSTANCE = new ModalButtonDiModule();

    private ModalButtonDiModule() {
    }

    @NotNull
    public final Widget2 provideModalButtonWidget(@NotNull ModalButtonConfig config, @NotNull ModalButtonViewMapper modalButtonViewMapper, @NotNull ModalButtonBurgerViewMapper modalButtonBurgerViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(modalButtonViewMapper, "modalButtonViewMapper");
        Intrinsics.checkNotNullParameter(modalButtonBurgerViewMapper, "modalButtonBurgerViewMapper");
        return new Widget2("catalog", "modalButton", config, new ViewMapper2[]{modalButtonViewMapper, modalButtonBurgerViewMapper});
    }
}
