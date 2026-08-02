package com.socure.docv.capturesdk.di.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "Lcom/socure/docv/capturesdk/di/activity/ActivityComponentProvisions;", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ActivityComponent extends ApplicationComponent, ActivityComponentProvisions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ActivityComponent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/di/activity/ActivityComponent$Companion;", "", "()V", "build", "Lcom/socure/docv/capturesdk/di/activity/ActivityComponent;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroidx/appcompat/app/AppCompatActivity;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ActivityComponent build(final AppCompatActivity activity, final ApplicationComponent applicationComponent) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
            return new ActivityComponentImpl(activity, applicationComponent) { // from class: com.socure.docv.capturesdk.di.activity.ActivityComponent$Companion$build$1
            };
        }
    }
}
