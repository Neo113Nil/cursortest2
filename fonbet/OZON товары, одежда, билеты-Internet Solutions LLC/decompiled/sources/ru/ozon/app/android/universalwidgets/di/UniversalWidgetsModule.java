package ru.ozon.app.android.universalwidgets.di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalGrid3ImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridImagePrefetchInfoProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch.UniversalObjectGridOneSingleItemBannerImageSizeProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/universalwidgets/di/UniversalWidgetsModule;", "", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class UniversalWidgetsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/di/UniversalWidgetsModule$Companion;", "", "<init>", "()V", "provideUWidgetObjectGrid3ImageInfoProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalGrid3ImagePrefetchInfoProvider;", "provideUWidgetObjectGridImageInfoProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridImagePrefetchInfoProvider;", "provideUWidgetObjectBannerImageInfoProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/UniversalObjectGridOneSingleItemBannerImageSizeProvider;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UniversalObjectGridOneSingleItemBannerImageSizeProvider provideUWidgetObjectBannerImageInfoProvider() {
            return new UniversalObjectGridOneSingleItemBannerImageSizeProvider();
        }

        @NotNull
        public final UniversalGrid3ImagePrefetchInfoProvider provideUWidgetObjectGrid3ImageInfoProvider() {
            return new UniversalGrid3ImagePrefetchInfoProvider();
        }

        @NotNull
        public final UniversalObjectGridImagePrefetchInfoProvider provideUWidgetObjectGridImageInfoProvider() {
            return new UniversalObjectGridImagePrefetchInfoProvider();
        }

        private Companion() {
        }
    }
}
