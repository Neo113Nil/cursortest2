package ru.ozon.app.android.common.filterWidgets.filters.di;

import AH.a;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityActionHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.openRangeFilter.OpenRangeFilterMapper;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.timerangefilter.TimeRangeFilterMapper;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 '2\u00060\u0001j\u0002`\u0002:\u0001'R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/di/FilterComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "getFilterSharedViewModel", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "filterSharedViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterMapper;", "getGetOpenRangeFilterMapper", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/openRangeFilter/OpenRangeFilterMapper;", "getOpenRangeFilterMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/timerangefilter/TimeRangeFilterMapper;", "getGetTimeRangeFilterMapper", "()Lru/ozon/app/android/common/filterWidgets/filters/presentation/timerangefilter/TimeRangeFilterMapper;", "getTimeRangeFilterMapper", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "getKeyboardVisibilityActionHolder", "()Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "keyboardVisibilityActionHolder", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FilterComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/di/FilterComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/common/filterWidgets/filters/di/FilterComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FilterComponent create$lambda$0(C7475g c7475g) {
            return new FilterComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<FilterComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(FilterComponent.class), new a(storage, 3));
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    Context getContext();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FilterSharedViewModel getFilterSharedViewModel();

    @NotNull
    OpenRangeFilterMapper getGetOpenRangeFilterMapper();

    @NotNull
    TimeRangeFilterMapper getGetTimeRangeFilterMapper();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    KeyboardVisibilityActionHolder getKeyboardVisibilityActionHolder();

    @NotNull
    ComposerNavigator getNavigator();
}
