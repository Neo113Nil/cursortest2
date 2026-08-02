package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC0137eo;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f15278a;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f15279a;

        public /* synthetic */ Builder(int i5) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC0137eo> userProfileUpdate) {
            this.f15279a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f15279a, 0);
        }

        private Builder() {
            this.f15279a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i5) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC0137eo>> getUserProfileUpdates() {
        return this.f15278a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f15278a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
