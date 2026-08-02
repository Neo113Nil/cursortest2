package com.socure.docv.capturesdk.common.utils;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/SocureDocVSuccess;", "Lcom/socure/docv/capturesdk/common/utils/SocureResult;", "deviceSessionToken", "", "(Ljava/lang/String;)V", "getDeviceSessionToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SocureDocVSuccess implements SocureResult {
    public static final int $stable = 0;
    private final String deviceSessionToken;

    public static /* synthetic */ SocureDocVSuccess copy$default(SocureDocVSuccess socureDocVSuccess, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socureDocVSuccess.getDeviceSessionToken();
        }
        return socureDocVSuccess.copy(str);
    }

    public final String component1() {
        return getDeviceSessionToken();
    }

    public final SocureDocVSuccess copy(String deviceSessionToken) {
        return new SocureDocVSuccess(deviceSessionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocureDocVSuccess) && Intrinsics.areEqual(getDeviceSessionToken(), ((SocureDocVSuccess) other).getDeviceSessionToken());
    }

    public int hashCode() {
        if (getDeviceSessionToken() == null) {
            return 0;
        }
        return getDeviceSessionToken().hashCode();
    }

    public String toString() {
        return "SocureDocVSuccess(deviceSessionToken=" + getDeviceSessionToken() + ")";
    }

    public SocureDocVSuccess(String str) {
        this.deviceSessionToken = str;
    }

    @Override // com.socure.docv.capturesdk.common.utils.SocureResult
    public String getDeviceSessionToken() {
        return this.deviceSessionToken;
    }
}
