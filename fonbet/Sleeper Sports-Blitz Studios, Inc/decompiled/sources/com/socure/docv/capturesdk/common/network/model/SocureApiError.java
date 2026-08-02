package com.socure.docv.capturesdk.common.network.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.api.SocureDocVError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SocureApiError.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/SocureApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "socureDocVError", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;)V", "getSocureDocVError", "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SocureApiError extends Exception {
    public static final int $stable = 0;
    private final SocureDocVError socureDocVError;

    public static /* synthetic */ SocureApiError copy$default(SocureApiError socureApiError, SocureDocVError socureDocVError, int i, Object obj) {
        if ((i & 1) != 0) {
            socureDocVError = socureApiError.socureDocVError;
        }
        return socureApiError.copy(socureDocVError);
    }

    /* renamed from: component1, reason: from getter */
    public final SocureDocVError getSocureDocVError() {
        return this.socureDocVError;
    }

    public final SocureApiError copy(SocureDocVError socureDocVError) {
        Intrinsics.checkNotNullParameter(socureDocVError, "socureDocVError");
        return new SocureApiError(socureDocVError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocureApiError) && this.socureDocVError == ((SocureApiError) other).socureDocVError;
    }

    public int hashCode() {
        return this.socureDocVError.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "SocureApiError(socureDocVError=" + this.socureDocVError + ")";
    }

    public final SocureDocVError getSocureDocVError() {
        return this.socureDocVError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocureApiError(SocureDocVError socureDocVError) {
        super("SocureApiError: " + socureDocVError);
        Intrinsics.checkNotNullParameter(socureDocVError, "socureDocVError");
        this.socureDocVError = socureDocVError;
    }
}
