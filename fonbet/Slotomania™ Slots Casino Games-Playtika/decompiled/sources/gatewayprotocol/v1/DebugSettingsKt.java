package gatewayprotocol.v1;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugSettingsKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DebugSettingsKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugSettingsKt {
    public static final DebugSettingsKt INSTANCE = new DebugSettingsKt();

    /* compiled from: DebugSettingsKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0019"}, d2 = {"Lgatewayprotocol/v1/DebugSettingsKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings$Builder;", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings$Builder;)V", "value", "", "cleanCache", "getCleanCache", "()Z", "setCleanCache", "(Z)V", "enableTracing", "getEnableTracing", "setEnableTracing", "webviewInspectable", "getWebviewInspectable", "setWebviewInspectable", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "clearCleanCache", "", "clearEnableTracing", "clearWebviewInspectable", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.DebugSettings.Builder _builder;

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DebugSettingsKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/DebugSettingsKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/DebugSettingsKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DebugSettings _build() {
            NativeConfigurationOuterClass.DebugSettings build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final boolean getWebviewInspectable() {
            return this._builder.getWebviewInspectable();
        }

        public final void setWebviewInspectable(boolean z) {
            this._builder.setWebviewInspectable(z);
        }

        public final void clearWebviewInspectable() {
            this._builder.clearWebviewInspectable();
        }

        public final boolean getEnableTracing() {
            return this._builder.getEnableTracing();
        }

        public final void setEnableTracing(boolean z) {
            this._builder.setEnableTracing(z);
        }

        public final void clearEnableTracing() {
            this._builder.clearEnableTracing();
        }

        public final boolean getCleanCache() {
            return this._builder.getCleanCache();
        }

        public final void setCleanCache(boolean z) {
            this._builder.setCleanCache(z);
        }

        public final void clearCleanCache() {
            this._builder.clearCleanCache();
        }
    }

    private DebugSettingsKt() {
    }
}
