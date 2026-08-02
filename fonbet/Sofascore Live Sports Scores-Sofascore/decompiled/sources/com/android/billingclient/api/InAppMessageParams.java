package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class InAppMessageParams {
    public final ArrayList a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public final HashSet a = new HashSet();

        @NonNull
        public Builder addAllInAppMessageCategoriesToShow() {
            this.a.add(2);
            return this;
        }

        @NonNull
        public Builder addInAppMessageCategoryToShow(int i) {
            this.a.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public InAppMessageParams build() {
            return new InAppMessageParams(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    public /* synthetic */ InAppMessageParams(HashSet hashSet) {
        this.a = new ArrayList(Collections.unmodifiableList(new ArrayList(hashSet)));
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
