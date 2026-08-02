package com.vk.id.logout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutFail;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "FailedApiCall", "NotAuthenticated", "Lcom/vk/id/logout/VKIDLogoutFail$FailedApiCall;", "Lcom/vk/id/logout/VKIDLogoutFail$NotAuthenticated;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class VKIDLogoutFail {

    @NotNull
    private final String description;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutFail$FailedApiCall;", "Lcom/vk/id/logout/VKIDLogoutFail;", "", "description", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedApiCall extends VKIDLogoutFail {

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedApiCall(@NotNull String description, @NotNull Throwable throwable) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public boolean equals(Object other) {
            if (!(other instanceof FailedApiCall)) {
                return false;
            }
            FailedApiCall failedApiCall = (FailedApiCall) other;
            return Intrinsics.d(getDescription(), failedApiCall.getDescription()) && Intrinsics.d(this.throwable, failedApiCall.throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode() + (getDescription().hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutFail$NotAuthenticated;", "Lcom/vk/id/logout/VKIDLogoutFail;", "description", "", "<init>", "(Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotAuthenticated extends VKIDLogoutFail {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAuthenticated(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }

        public boolean equals(Object other) {
            return (other instanceof VKIDLogoutFail) && Intrinsics.d(getDescription(), ((VKIDLogoutFail) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    public /* synthetic */ VKIDLogoutFail(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    private VKIDLogoutFail(String str) {
        this.description = str;
    }
}
