package com.socure.docv.capturesdk.di.app;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.socure.docv.capturesdk.common.network.repository.ModulesRepository;
import com.socure.docv.capturesdk.common.network.repository.ModulesRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductionReleaseApplicationComponentImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/di/app/ProductionReleaseApplicationComponentImpl;", "Lcom/socure/docv/capturesdk/di/app/ProductionApplicationComponentImpl;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "modulesRepository", "Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "getModulesRepository", "()Lcom/socure/docv/capturesdk/common/network/repository/ModulesRepository;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ProductionReleaseApplicationComponentImpl extends ProductionApplicationComponentImpl {
    private final Application application;

    @Override // com.socure.docv.capturesdk.di.app.ProductionApplicationComponentImpl, com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public Application getApplication() {
        return this.application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductionReleaseApplicationComponentImpl(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    @Override // com.socure.docv.capturesdk.di.app.ApplicationComponentProvisions
    public ModulesRepository getModulesRepository() {
        return new ModulesRepositoryImpl(getRepoHolder().getStepUpRepository(), getBackgroundDispatcher(), getModuleResponseMapper(), getStartSessionMapper());
    }
}
