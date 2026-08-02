package ru.ozon.app.android.initializers.tracker;

import fi0.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.flags.tracker.TrackerProductSendingPeriod;
import ru.ozon.app.android.initializers.tracker.TrackerDynamicSettingsModifier;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/initializers/tracker/TrackerDynamicSettingsModifier;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lfi0/w;", "settings", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lfi0/w;)V", "", "observeFeatureFlagChanged", "()V", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lfi0/w;", "Lkotlin/time/b;", "getProductSendingPeriod-UwyO8pc", "()J", "productSendingPeriod", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerDynamicSettingsModifier {

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final w settings;

    public TrackerDynamicSettingsModifier(@NotNull FeatureService featureService, @NotNull w settings) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.featureService = featureService;
        this.settings = settings;
    }

    /* renamed from: getProductSendingPeriod-UwyO8pc, reason: not valid java name */
    private final long m783getProductSendingPeriodUwyO8pc() {
        b.Companion companion = b.INSTANCE;
        return c.g(this.featureService.getIntKey(TrackerProductSendingPeriod.INSTANCE), EnumC10311b.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFeatureFlagChanged$lambda$0(TrackerDynamicSettingsModifier trackerDynamicSettingsModifier) {
        trackerDynamicSettingsModifier.settings.a().a(b.e(trackerDynamicSettingsModifier.m783getProductSendingPeriodUwyO8pc()));
    }

    public final void observeFeatureFlagChanged() {
        this.featureService.addOnChangeFeatureListener(new OnChangeFeatureListener() { // from class: Wy.a
            @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
            public final void onChangeFeature() {
                TrackerDynamicSettingsModifier.observeFeatureFlagChanged$lambda$0(TrackerDynamicSettingsModifier.this);
            }
        });
    }
}
