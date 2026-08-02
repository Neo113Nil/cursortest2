package spay.sdk.api;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lspay/sdk/api/SdkReadyCheckResult;", "", "()V", "NotReady", "Ready", "Lspay/sdk/api/SdkReadyCheckResult$NotReady;", "Lspay/sdk/api/SdkReadyCheckResult$Ready;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class SdkReadyCheckResult {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/api/SdkReadyCheckResult$NotReady;", "Lspay/sdk/api/SdkReadyCheckResult;", "cause", "", "(Ljava/lang/String;)V", "getCause", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class NotReady extends SdkReadyCheckResult {

        @NotNull
        private final String cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotReady(@NotNull String cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public static /* synthetic */ NotReady copy$default(NotReady notReady, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notReady.cause;
            }
            return notReady.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCause() {
            return this.cause;
        }

        @NotNull
        public final NotReady copy(@NotNull String cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new NotReady(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotReady) && Intrinsics.d(this.cause, ((NotReady) other).cause);
        }

        @NotNull
        public final String getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("NotReady(cause=", this.cause, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SdkReadyCheckResult$Ready;", "Lspay/sdk/api/SdkReadyCheckResult;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ready extends SdkReadyCheckResult {

        @NotNull
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super(null);
        }
    }

    public /* synthetic */ SdkReadyCheckResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SdkReadyCheckResult() {
    }
}
