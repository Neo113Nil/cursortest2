package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.c5j;
import xsna.d8s;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes13.dex */
public interface ConsentInformation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public static final class PrivacyOptionsRequirementStatus {

        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus NOT_REQUIRED;

        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus REQUIRED;

        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus UNKNOWN;
        private static final /* synthetic */ PrivacyOptionsRequirementStatus[] zza;

        static {
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus = new PrivacyOptionsRequirementStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = privacyOptionsRequirementStatus;
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus2 = new PrivacyOptionsRequirementStatus("NOT_REQUIRED", 1);
            NOT_REQUIRED = privacyOptionsRequirementStatus2;
            PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus3 = new PrivacyOptionsRequirementStatus("REQUIRED", 2);
            REQUIRED = privacyOptionsRequirementStatus3;
            zza = new PrivacyOptionsRequirementStatus[]{privacyOptionsRequirementStatus, privacyOptionsRequirementStatus2, privacyOptionsRequirementStatus3};
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus valueOf(@RecentlyNonNull String str) {
            return (PrivacyOptionsRequirementStatus) Enum.valueOf(PrivacyOptionsRequirementStatus.class, str);
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus[] values() {
            return (PrivacyOptionsRequirementStatus[]) zza.clone();
        }
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public interface a {
        void onConsentInfoUpdateFailure(@RecentlyNonNull d8s d8sVar);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    public interface b {
        void onConsentInfoUpdateSuccess();
    }

    int getConsentStatus();

    @RecentlyNonNull
    PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull c5j c5jVar, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar);

    void reset();
}
