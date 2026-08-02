package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import B0.A0;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult;", "", "<init>", "()V", "Success", "Error", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Success;", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NativeResult {

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Success;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult;", "", Success.RESULT_KEY, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Success;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResult", "Companion", "a", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends NativeResult {

        @NotNull
        private static final String RESULT_KEY = "result";

        @NotNull
        private final String result;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        private static final Success DEFAULT = new Success("{}");

        @NotNull
        private static final Success DEFAULT_WITH_SUCCESS = new Success("{\"success\":true}");

        @NotNull
        private static final Success DEFAULT_NOT_SUCCESS = new Success("{\"success\":false}");

        /* renamed from: ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult$Success$a, reason: from kotlin metadata */
        public static final class Companion {
            @NotNull
            public static Success a(Object obj, String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (str == null) {
                        str = Success.RESULT_KEY;
                    }
                    jSONObject.put(str, obj);
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                    return new Success(jSONObject2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return Success.DEFAULT;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = success.result;
            }
            return success.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        @NotNull
        public final Success copy(@NotNull String result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Success(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.d(this.result, ((Success) other).result);
        }

        @NotNull
        public final String getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Success(result=", this.result, ")");
        }
    }

    public /* synthetic */ NativeResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult;", "", "errorMessage", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error$a;", "errorCode", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error$a;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error$a;", "copy", "(Ljava/lang/String;Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error$a;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getErrorMessage", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult$Error$a;", "getErrorCode", "a", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends NativeResult {

        @NotNull
        private final a errorCode;

        @NotNull
        private final String errorMessage;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a INVALIDATED_DATA;
            public static final a IS_NOT_AVAILABLE;
            public static final a SDK_ERROR;
            public static final a USER_CANCELLED;

            static {
                a aVar = new a("SDK_ERROR", 0);
                SDK_ERROR = aVar;
                a aVar2 = new a("IS_NOT_AVAILABLE", 1);
                IS_NOT_AVAILABLE = aVar2;
                a aVar3 = new a("USER_CANCELLED", 2);
                USER_CANCELLED = aVar3;
                a aVar4 = new a("INVALIDATED_DATA", 3);
                INVALIDATED_DATA = aVar4;
                a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
                $VALUES = aVarArr;
                $ENTRIES = Xc.b.a(aVarArr);
            }

            private a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Error(String str, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? a.SDK_ERROR : aVar);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.errorMessage;
            }
            if ((i11 & 2) != 0) {
                aVar = error.errorCode;
            }
            return error.copy(str, aVar);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final a getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final Error copy(@NotNull String errorMessage, @NotNull a errorCode) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            return new Error(errorMessage, errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.d(this.errorMessage, error.errorMessage) && this.errorCode == error.errorCode;
        }

        @NotNull
        public final a getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorCode.hashCode() + (this.errorMessage.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull String errorMessage, @NotNull a errorCode) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.errorMessage = errorMessage;
            this.errorCode = errorCode;
        }
    }

    private NativeResult() {
    }
}
