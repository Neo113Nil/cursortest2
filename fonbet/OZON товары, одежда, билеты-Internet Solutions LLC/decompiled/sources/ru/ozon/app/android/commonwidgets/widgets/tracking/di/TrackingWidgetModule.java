package ru.ozon.app.android.commonwidgets.widgets.tracking.di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.tracking.core.TrackingConfig;
import ru.ozon.app.android.commonwidgets.widgets.tracking.core.TrackingViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tracking/di/TrackingWidgetModule;", "", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TrackingWidgetModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tracking/di/TrackingWidgetModule$Companion;", "", "<init>", "()V", "provideMasterWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/commonwidgets/widgets/tracking/core/TrackingConfig;", "viewMapper", "Lru/ozon/app/android/commonwidgets/widgets/tracking/core/TrackingViewMapper;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget provideMasterWidget(@NotNull TrackingConfig config, @NotNull TrackingViewMapper viewMapper) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
            return new Widget("common", "tracking", config, new TrackingViewMapper[]{viewMapper});
        }

        private Companion() {
        }
    }
}
