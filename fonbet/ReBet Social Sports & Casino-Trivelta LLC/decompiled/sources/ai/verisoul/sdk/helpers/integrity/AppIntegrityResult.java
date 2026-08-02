package ai.verisoul.sdk.helpers.integrity;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult;", "A", "B", "", "()V", "isError", "", "Failure", "Success", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult$Failure;", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult$Success;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AppIntegrityResult<A, B> {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult$Failure;", "B", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult;", "", "error", "(Ljava/lang/Object;)V", "getError", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult$Failure;", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure<B> extends AppIntegrityResult {
        private final B error;

        public Failure(B b10) {
            super(null);
            this.error = b10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failure copy$default(Failure failure, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = failure.error;
            }
            return failure.copy(obj);
        }

        public final B component1() {
            return this.error;
        }

        @NotNull
        public final Failure<B> copy(B error) {
            return new Failure<>(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
        }

        public final B getError() {
            return this.error;
        }

        public int hashCode() {
            B b10 = this.error;
            if (b10 == null) {
                return 0;
            }
            return b10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult$Success;", "A", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult;", "", EventKeys.VALUE_KEY, "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<A> extends AppIntegrityResult {
        private final A value;

        public Success(A a10) {
            super(null);
            this.value = a10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final A component1() {
            return this.value;
        }

        @NotNull
        public final Success<A> copy(A value) {
            return new Success<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public final A getValue() {
            return this.value;
        }

        public int hashCode() {
            A a10 = this.value;
            if (a10 == null) {
                return 0;
            }
            return a10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ")";
        }
    }

    public /* synthetic */ AppIntegrityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isError() {
        return this instanceof Failure;
    }

    private AppIntegrityResult() {
    }
}
