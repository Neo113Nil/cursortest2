package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleData;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleRequestExt.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"CAPTURE_DELTA", "", "CAPTURE_ENGINE", "createBackModuleRequest", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleSubmissionRequest;", "moduleId", "moduleVersion", "createConsentModuleRequest", "consentStatus", "createFrontModuleRequest", "createIdTypeSelectionModuleRequest", "cardType", "createPassportModuleRequest", "createSelfieModuleRequest", "createUnstructuredDocModuleRequest", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ModuleRequestExtKt {
    public static final String CAPTURE_DELTA = "1";
    public static final String CAPTURE_ENGINE = "100";

    public static /* synthetic */ ModuleSubmissionRequest createSelfieModuleRequest$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "1.0";
        }
        return createSelfieModuleRequest(str, str2);
    }

    public static final ModuleSubmissionRequest createSelfieModuleRequest(String moduleId, String moduleVersion) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_SELFIE, moduleVersion, moduleId, new ModuleData.Scan("1", CAPTURE_ENGINE));
    }

    public static /* synthetic */ ModuleSubmissionRequest createConsentModuleRequest$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "1.0";
        }
        return createConsentModuleRequest(str, str2, str3);
    }

    public static final ModuleSubmissionRequest createConsentModuleRequest(String moduleId, String moduleVersion, String consentStatus) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_CONSENT, moduleVersion, moduleId, new ModuleData.Consent(consentStatus));
    }

    public static /* synthetic */ ModuleSubmissionRequest createIdTypeSelectionModuleRequest$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "1.0";
        }
        return createIdTypeSelectionModuleRequest(str, str2, str3);
    }

    public static final ModuleSubmissionRequest createIdTypeSelectionModuleRequest(String moduleId, String moduleVersion, String cardType) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_ID_TYPE_SELECTION, moduleVersion, moduleId, new ModuleData.IDSelection(cardType));
    }

    public static /* synthetic */ ModuleSubmissionRequest createFrontModuleRequest$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "1.0";
        }
        return createFrontModuleRequest(str, str2);
    }

    public static final ModuleSubmissionRequest createFrontModuleRequest(String moduleId, String moduleVersion) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_FRONT, moduleVersion, moduleId, new ModuleData.Scan("1", CAPTURE_ENGINE));
    }

    public static /* synthetic */ ModuleSubmissionRequest createPassportModuleRequest$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "1.0";
        }
        return createPassportModuleRequest(str, str2);
    }

    public static final ModuleSubmissionRequest createPassportModuleRequest(String moduleId, String moduleVersion) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_PASSPORT, moduleVersion, moduleId, new ModuleData.Scan("1", CAPTURE_ENGINE));
    }

    public static /* synthetic */ ModuleSubmissionRequest createBackModuleRequest$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "1.0";
        }
        return createBackModuleRequest(str, str2);
    }

    public static final ModuleSubmissionRequest createBackModuleRequest(String moduleId, String moduleVersion) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_BACK, moduleVersion, moduleId, new ModuleData.Scan("1", CAPTURE_ENGINE));
    }

    public static /* synthetic */ ModuleSubmissionRequest createUnstructuredDocModuleRequest$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "1.0";
        }
        return createUnstructuredDocModuleRequest(str, str2);
    }

    public static final ModuleSubmissionRequest createUnstructuredDocModuleRequest(String moduleId, String moduleVersion) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleVersion, "moduleVersion");
        return new ModuleSubmissionRequest(ApiConstant.MODULE_TYPE_UNSTRUCTURED, moduleVersion, moduleId, null, 8, null);
    }
}
