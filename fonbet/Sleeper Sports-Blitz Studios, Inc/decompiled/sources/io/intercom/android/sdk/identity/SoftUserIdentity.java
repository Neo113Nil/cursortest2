package io.intercom.android.sdk.identity;

import android.text.TextUtils;

/* loaded from: classes9.dex */
abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE = create("", "", "", "", "", "", "", "");

    abstract String anonymousId();

    abstract String email();

    abstract String encryptedUserId();

    abstract String fingerprint();

    abstract String hmac();

    abstract String intercomId();

    abstract String jwt();

    abstract String userId();

    SoftUserIdentity() {
    }

    static SoftUserIdentity create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new AutoValue_SoftUserIdentity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    boolean isSameUser(Registration registration) {
        String userId = registration.getUserId();
        String email = registration.getEmail();
        boolean z = (TextUtils.isEmpty(userId) && TextUtils.isEmpty(email)) ? false : true;
        if (!TextUtils.isEmpty(userId)) {
            z = z && userId.equals(userId());
        }
        return !TextUtils.isEmpty(email) ? z && email.equals(email()) : z;
    }

    boolean isPresent() {
        return !equals(NONE);
    }
}
