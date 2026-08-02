package zendesk.core;

import androidx.annotation.NonNull;
import ld.AbstractC5459a;

/* loaded from: classes5.dex */
class ApiAnonymousIdentity implements Identity {
    private static final transient String LOG_TAG = "ApiAnonymousIdentity";
    private String email;
    private String name;
    private String sdkGuid;

    public ApiAnonymousIdentity(@NonNull AnonymousIdentity anonymousIdentity, @NonNull String str) {
        if (com.zendesk.util.d.c(str)) {
            this.sdkGuid = "";
            AbstractC5459a.i(LOG_TAG, "SdkGuid cannot be null or empty.", new Object[0]);
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            AbstractC5459a.i(LOG_TAG, "Identity is null.", new Object[0]);
        } else {
            this.email = anonymousIdentity.getEmail();
            this.name = anonymousIdentity.getName();
        }
    }
}
