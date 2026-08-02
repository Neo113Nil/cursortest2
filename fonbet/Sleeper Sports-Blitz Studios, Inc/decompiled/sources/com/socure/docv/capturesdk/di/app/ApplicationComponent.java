package com.socure.docv.capturesdk.di.app;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.socure.docv.capturesdk.di.DependencyComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApplicationComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "Lcom/socure/docv/capturesdk/di/app/ProductionApplicationComponentProvisions;", "Lcom/socure/docv/capturesdk/di/DependencyComponent;", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ApplicationComponent extends ProductionApplicationComponentProvisions, DependencyComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ApplicationComponent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/di/app/ApplicationComponent$Companion;", "", "()V", "build", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ApplicationComponent build(final Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            return new ProductionReleaseApplicationComponentImpl(application) { // from class: com.socure.docv.capturesdk.di.app.ApplicationComponent$Companion$build$1
            };
        }
    }
}
