package com.socure.docv.capturesdk.common.network.repository;

import com.socure.docv.capturesdk.api.SocureDocVError;
import kotlin.Metadata;

/* compiled from: StepUpRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"codeToError", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "code", "", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StepUpRepositoryKt {
    public static final SocureDocVError codeToError(int i) {
        if (i == 119 || i == 7011) {
            return SocureDocVError.INVALID_DOCV_TRANSACTION_TOKEN;
        }
        if (i == 7014) {
            return SocureDocVError.SESSION_EXPIRED;
        }
        if (i == 7101) {
            return SocureDocVError.INVALID_PUBLIC_KEY;
        }
        if (i == 7103) {
            return SocureDocVError.NO_INTERNET_CONNECTION;
        }
        if (i == 7110) {
            return SocureDocVError.CONSENT_DECLINED;
        }
        if (i == 7021) {
            return SocureDocVError.SESSION_INITIATION_FAILURE;
        }
        if (i == 7022) {
            return SocureDocVError.DOCUMENT_UPLOAD_FAILURE;
        }
        return SocureDocVError.UNKNOWN;
    }
}
