package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/ErrorKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* compiled from: ErrorKt.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0001J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "(Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;)V", "value", "Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", IronSourceConstants.EVENTS_ERROR_CODE, "getErrorCode", "()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;", "setErrorCode", "(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;)V", "", "errorCodeValue", "getErrorCodeValue", "()I", "setErrorCodeValue", "(I)V", "", "errorText", "getErrorText", "()Ljava/lang/String;", "setErrorText", "(Ljava/lang/String;)V", "Lcom/google/protobuf/ByteString;", "errorToken", "getErrorToken", "()Lcom/google/protobuf/ByteString;", "setErrorToken", "(Lcom/google/protobuf/ByteString;)V", "_build", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "clearErrorCode", "", "clearErrorText", "clearErrorToken", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: ErrorKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/ErrorKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/ErrorKt$Dsl;", "builder", "Lgatewayprotocol/v1/ErrorOuterClass$Error$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            Intrinsics.checkNotNullExpressionValue(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final void setErrorText(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorText(value);
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            ErrorOuterClass.PublicErrorCode errorCode = this._builder.getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "_builder.getErrorCode()");
            return errorCode;
        }

        public final void setErrorCode(ErrorOuterClass.PublicErrorCode value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorCode(value);
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        public final void setErrorCodeValue(int i) {
            this._builder.setErrorCodeValue(i);
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            Intrinsics.checkNotNullExpressionValue(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final void setErrorToken(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorToken(value);
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }
    }

    private ErrorKt() {
    }
}
