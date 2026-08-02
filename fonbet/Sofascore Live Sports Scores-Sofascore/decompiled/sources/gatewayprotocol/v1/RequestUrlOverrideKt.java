package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestUrlOverrideKt {

    @NotNull
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    private RequestUrlOverrideKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;", "<init>", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;)V", "_build", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", U3.i.X, "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;", "requestType", "getRequestType", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;", "setRequestType", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;)V", "", "requestTypeValue", "getRequestTypeValue", "()I", "setRequestTypeValue", "(I)V", "clearRequestType", "", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "clearUrl", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            InitializationResponseOuterClass.RequestUrlOverride build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        @NotNull
        public final InitializationResponseOuterClass.RequestType getRequestType() {
            InitializationResponseOuterClass.RequestType requestType = this._builder.getRequestType();
            requestType.getClass();
            return requestType;
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        @NotNull
        public final String getUrl() {
            String url = this._builder.getUrl();
            url.getClass();
            return url;
        }

        public final void setRequestType(@NotNull InitializationResponseOuterClass.RequestType requestType) {
            requestType.getClass();
            this._builder.setRequestType(requestType);
        }

        public final void setRequestTypeValue(int i) {
            this._builder.setRequestTypeValue(i);
        }

        public final void setUrl(@NotNull String str) {
            str.getClass();
            this._builder.setUrl(str);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
