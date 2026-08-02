package com.vk.id;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/vk/id/VKIDAuthFail;", "", "description", "", "<init>", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "Canceled", "FailedApiCall", "FailedOAuth", "FailedOAuthState", "FailedRedirectActivity", "NoBrowserAvailable", "Lcom/vk/id/VKIDAuthFail$Canceled;", "Lcom/vk/id/VKIDAuthFail$FailedApiCall;", "Lcom/vk/id/VKIDAuthFail$FailedOAuth;", "Lcom/vk/id/VKIDAuthFail$FailedOAuthState;", "Lcom/vk/id/VKIDAuthFail$FailedRedirectActivity;", "Lcom/vk/id/VKIDAuthFail$NoBrowserAvailable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class VKIDAuthFail {

    @NotNull
    private final String description;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/vk/id/VKIDAuthFail$Canceled;", "Lcom/vk/id/VKIDAuthFail;", "description", "", "<init>", "(Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Canceled extends VKIDAuthFail {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }

        public boolean equals(Object other) {
            return (other instanceof Canceled) && Intrinsics.d(getDescription(), ((Canceled) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/id/VKIDAuthFail$FailedApiCall;", "Lcom/vk/id/VKIDAuthFail;", "", "description", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedApiCall extends VKIDAuthFail {

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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/id/VKIDAuthFail$FailedOAuth;", "Lcom/vk/id/VKIDAuthFail;", "description", "", "<init>", "(Ljava/lang/String;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedOAuth extends VKIDAuthFail {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedOAuth(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/vk/id/VKIDAuthFail$FailedOAuthState;", "Lcom/vk/id/VKIDAuthFail;", "description", "", "<init>", "(Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedOAuthState extends VKIDAuthFail {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedOAuthState(@NotNull String description) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }

        public boolean equals(Object other) {
            return (other instanceof FailedOAuthState) && Intrinsics.d(getDescription(), ((FailedOAuthState) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/id/VKIDAuthFail$FailedRedirectActivity;", "Lcom/vk/id/VKIDAuthFail;", "", "description", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedRedirectActivity extends VKIDAuthFail {
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedRedirectActivity(@NotNull String description, Throwable th2) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.throwable = th2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof FailedRedirectActivity)) {
                return false;
            }
            FailedRedirectActivity failedRedirectActivity = (FailedRedirectActivity) other;
            return Intrinsics.d(getDescription(), failedRedirectActivity.getDescription()) && Intrinsics.d(this.throwable, failedRedirectActivity.throwable);
        }

        public int hashCode() {
            int hashCode = getDescription().hashCode() * 31;
            Throwable th2 = this.throwable;
            return hashCode + (th2 != null ? th2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/id/VKIDAuthFail$NoBrowserAvailable;", "Lcom/vk/id/VKIDAuthFail;", "", "description", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoBrowserAvailable extends VKIDAuthFail {
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoBrowserAvailable(@NotNull String description, Throwable th2) {
            super(description, null);
            Intrinsics.checkNotNullParameter(description, "description");
            this.throwable = th2;
        }

        public boolean equals(Object other) {
            if (!(other instanceof NoBrowserAvailable)) {
                return false;
            }
            NoBrowserAvailable noBrowserAvailable = (NoBrowserAvailable) other;
            return Intrinsics.d(getDescription(), noBrowserAvailable.getDescription()) && Intrinsics.d(this.throwable, noBrowserAvailable.throwable);
        }

        public int hashCode() {
            int hashCode = getDescription().hashCode() * 31;
            Throwable th2 = this.throwable;
            return hashCode + (th2 != null ? th2.hashCode() : 0);
        }
    }

    public /* synthetic */ VKIDAuthFail(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    private VKIDAuthFail(String str) {
        this.description = str;
    }
}
