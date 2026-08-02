package com.socure.docv.capturesdk.common.utils;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.api.SocureDocVError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/SocureDocVFailure;", "Lcom/socure/docv/capturesdk/common/utils/SocureResult;", "error", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "deviceSessionToken", "", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;Ljava/lang/String;)V", "getDeviceSessionToken", "()Ljava/lang/String;", "getError", "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SocureDocVFailure implements SocureResult {
    public static final int $stable = 0;
    private final String deviceSessionToken;
    private final SocureDocVError error;

    public static /* synthetic */ SocureDocVFailure copy$default(SocureDocVFailure socureDocVFailure, SocureDocVError socureDocVError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            socureDocVError = socureDocVFailure.error;
        }
        if ((i & 2) != 0) {
            str = socureDocVFailure.getDeviceSessionToken();
        }
        return socureDocVFailure.copy(socureDocVError, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SocureDocVError getError() {
        return this.error;
    }

    public final String component2() {
        return getDeviceSessionToken();
    }

    public final SocureDocVFailure copy(SocureDocVError error, String deviceSessionToken) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new SocureDocVFailure(error, deviceSessionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocureDocVFailure)) {
            return false;
        }
        SocureDocVFailure socureDocVFailure = (SocureDocVFailure) other;
        return this.error == socureDocVFailure.error && Intrinsics.areEqual(getDeviceSessionToken(), socureDocVFailure.getDeviceSessionToken());
    }

    public int hashCode() {
        return (this.error.hashCode() * 31) + (getDeviceSessionToken() == null ? 0 : getDeviceSessionToken().hashCode());
    }

    public String toString() {
        return "SocureDocVFailure(error=" + this.error + ", deviceSessionToken=" + getDeviceSessionToken() + ")";
    }

    public SocureDocVFailure(SocureDocVError error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.deviceSessionToken = str;
    }

    public final SocureDocVError getError() {
        return this.error;
    }

    @Override // com.socure.docv.capturesdk.common.utils.SocureResult
    public String getDeviceSessionToken() {
        return this.deviceSessionToken;
    }
}
