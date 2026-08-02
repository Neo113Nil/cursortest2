package ru.ozon.app.android.pikazon.util;

import We.E;
import android.R;
import android.content.Context;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandlerConfig;
import ru.ozon.app.android.pikazon.logging.error.PikazonErrorsLogger;
import xe.C10727i;

@Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0015\u001aS\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Resource", "", "testImage", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "resourceType", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "loadTestResource", "(ILjava/util/List;Landroid/content/Context;Ljava/lang/Class;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)Ljava/lang/Object;", "LWe/E;", "httpClient", "Lru/ozon/app/android/pikazon/Pikazon$Config;", "config", "", "bindPikazonTest", "(ILWe/E;Lru/ozon/app/android/pikazon/Pikazon$Config;)V", "ru/ozon/app/android/pikazon/util/TestUtilKt$defaultPerformanceAvailabilityChecker$1", "defaultPerformanceAvailabilityChecker", "Lru/ozon/app/android/pikazon/util/TestUtilKt$defaultPerformanceAvailabilityChecker$1;", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;", "defaultImagePathHandlerConfig", "Lru/ozon/app/android/pikazon/imagePathHandler/ImagePathHandlerConfig;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TestUtilKt {

    @NotNull
    private static final TestUtilKt$defaultPerformanceAvailabilityChecker$1 defaultPerformanceAvailabilityChecker = new PikazonPerformanceAvailabilityChecker() { // from class: ru.ozon.app.android.pikazon.util.TestUtilKt$defaultPerformanceAvailabilityChecker$1
        @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
        public boolean isImageErrorsAnalyticsEnabled(PikazonErrorsLogger.AnalyticsPlatform analyticsPlatform) {
            Intrinsics.checkNotNullParameter(analyticsPlatform, "analyticsPlatform");
            return false;
        }

        @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
        public boolean isImagePlaceholderAnalyticsEnabled() {
            return false;
        }

        @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
        public boolean isLoadCancellingAnalyticsEnabled() {
            return false;
        }

        @Override // ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker
        public boolean isPerformanceAnalyticsEnabled() {
            return false;
        }
    };

    @NotNull
    private static final ImagePathHandlerConfig defaultImagePathHandlerConfig = new ImagePathHandlerConfig(C7714v.b0(new Regex("cdn[0-9]+\\.ozone\\.ru"), new Regex("ir\\.ozone\\.ru"), new Regex("ir[0-9]+\\.ozone\\.ru")), false);

    public static final void bindPikazonTest(int i11, @NotNull E httpClient, @NotNull Pikazon.Config config) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(config, "config");
        Pikazon.INSTANCE.bind(httpClient, config).setInTestMode(true);
    }

    public static void bindPikazonTest$default(int i11, E e11, Pikazon.Config config, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = R.drawable.ic_media_play;
        }
        int i13 = i11;
        if ((i12 & 2) != 0) {
            e11 = new E(new E.a());
        }
        if ((i12 & 4) != 0) {
            config = new Pikazon.Config((String) null, i13, (Set) null, (PikazonUrlFactory) null, defaultPerformanceAvailabilityChecker, 13, (DefaultConstructorMarker) null);
        }
        bindPikazonTest(i13, e11, config);
    }

    public static final <Resource> Resource loadTestResource(int i11, @NotNull List<? extends ImageTransformation> transformations, @NotNull Context context, @NotNull Class<Resource> resourceType, PikazonLoaderCallback<Resource> pikazonLoaderCallback) {
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        return (Resource) C10727i.d(g.f71771a, new TestUtilKt$loadTestResource$1(transformations, context, i11, resourceType, pikazonLoaderCallback, null));
    }
}
