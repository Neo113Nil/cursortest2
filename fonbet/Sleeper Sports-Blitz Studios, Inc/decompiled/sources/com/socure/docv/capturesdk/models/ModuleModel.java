package com.socure.docv.capturesdk.models;

import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ModuleModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "moduleId", "", "getModuleId", "()Ljava/lang/String;", "sessionToken", "getSessionToken", "Lcom/socure/docv/capturesdk/models/BackModuleModel;", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "Lcom/socure/docv/capturesdk/models/ErrorModule;", "Lcom/socure/docv/capturesdk/models/FinishedModuleModel;", "Lcom/socure/docv/capturesdk/models/FrontModuleModel;", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "Lcom/socure/docv/capturesdk/models/LandingModuleModel;", "Lcom/socure/docv/capturesdk/models/PassportModuleModel;", "Lcom/socure/docv/capturesdk/models/SelfieModuleModel;", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ModuleModel extends Parcelable {
    String getModuleId();

    String getSessionToken();
}
