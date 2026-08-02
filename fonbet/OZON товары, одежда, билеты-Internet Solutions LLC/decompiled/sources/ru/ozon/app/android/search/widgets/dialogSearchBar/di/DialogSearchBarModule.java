package ru.ozon.app.android.search.widgets.dialogSearchBar.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/di/DialogSearchBarModule;", "", "<init>", "()V", "provideSearchBarMobileWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "dialogSearchBarMobileConfig", "Lru/ozon/app/android/search/widgets/dialogSearchBar/di/DialogSearchBarConfig;", "dialogSearchBarViewMapper", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DialogSearchBarModule {

    @NotNull
    public static final DialogSearchBarModule INSTANCE = new DialogSearchBarModule();

    private DialogSearchBarModule() {
    }

    @NotNull
    public final Widget2 provideSearchBarMobileWidget(@NotNull DialogSearchBarConfig dialogSearchBarMobileConfig, @NotNull DialogSearchBarViewMapper dialogSearchBarViewMapper) {
        Intrinsics.checkNotNullParameter(dialogSearchBarMobileConfig, "dialogSearchBarMobileConfig");
        Intrinsics.checkNotNullParameter(dialogSearchBarViewMapper, "dialogSearchBarViewMapper");
        return new Widget2("catalog", "dialogSearchBar", dialogSearchBarMobileConfig, new ViewMapper2[]{dialogSearchBarViewMapper});
    }
}
