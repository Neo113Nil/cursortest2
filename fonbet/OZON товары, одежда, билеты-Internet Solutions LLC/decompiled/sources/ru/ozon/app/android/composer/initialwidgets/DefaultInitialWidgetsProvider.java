package ru.ozon.app.android.composer.initialwidgets;

import C00.a;
import T00.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fabrics.ShellNavBarInitialWidgetFabric;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/composer/initialwidgets/DefaultInitialWidgetsProvider;", "LC00/a;", "Lru/ozon/app/android/fabrics/ShellNavBarInitialWidgetFabric;", "shellNavBarFabric", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/fabrics/ShellNavBarInitialWidgetFabric;Lru/ozon/app/android/utils/AppType;)V", "LA00/a;", "triggerEvent", "", "LT00/j;", "getWidgets", "(LA00/a;)Ljava/util/List;", "Lru/ozon/app/android/fabrics/ShellNavBarInitialWidgetFabric;", "Lru/ozon/app/android/utils/AppType;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultInitialWidgetsProvider implements a {

    @NotNull
    private final AppType appType;

    @NotNull
    private final ShellNavBarInitialWidgetFabric shellNavBarFabric;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final a EMPTY_INSTANCE = new a() { // from class: ru.ozon.app.android.composer.initialwidgets.DefaultInitialWidgetsProvider$Companion$EMPTY_INSTANCE$1
        @Override // C00.a
        public List<j> getWidgets(A00.a triggerEvent) {
            Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
            return K.f71697a;
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/initialwidgets/DefaultInitialWidgetsProvider$Companion;", "", "<init>", "()V", "LC00/a;", "EMPTY_INSTANCE", "LC00/a;", "getEMPTY_INSTANCE", "()LC00/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a getEMPTY_INSTANCE() {
            return DefaultInitialWidgetsProvider.EMPTY_INSTANCE;
        }

        private Companion() {
        }
    }

    public DefaultInitialWidgetsProvider(@NotNull ShellNavBarInitialWidgetFabric shellNavBarFabric, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(shellNavBarFabric, "shellNavBarFabric");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.shellNavBarFabric = shellNavBarFabric;
        this.appType = appType;
    }

    @Override // C00.a
    @NotNull
    public List<j> getWidgets(@NotNull A00.a triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        return this.appType == AppType.SELECT ? C7714v.a0(this.shellNavBarFabric.createShellNavbar()) : K.f71697a;
    }
}
