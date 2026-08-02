package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C4259pg;
import com.ironsource.Nf;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediationInfoKt {

    @NotNull
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    private MediationInfoKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010#\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u0016J\u0006\u0010)\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR$\u0010%\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001c¨\u0006+"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;", "<init>", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;)V", "_build", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", U3.i.X, "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", IronSourceConstants.EVENTS_PROVIDER, "getProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "", "providerValue", "getProviderValue", "()I", "setProviderValue", "(I)V", "clearProvider", "", "", "customName", "getCustomName", "()Ljava/lang/String;", "setCustomName", "(Ljava/lang/String;)V", "clearCustomName", "hasCustomName", "", "version", C4259pg.b, "setVersion", "clearVersion", "hasVersion", Nf.b, "getAdapterVersion", "setAdapterVersion", "clearAdapterVersion", "hasAdapterVersion", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            MediationInfoOuterClass.MediationInfo build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        @NotNull
        public final String getAdapterVersion() {
            String adapterVersion = this._builder.getAdapterVersion();
            adapterVersion.getClass();
            return adapterVersion;
        }

        @NotNull
        public final String getCustomName() {
            String customName = this._builder.getCustomName();
            customName.getClass();
            return customName;
        }

        @NotNull
        public final ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider provider = this._builder.getProvider();
            provider.getClass();
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        @NotNull
        public final String getVersion() {
            String version = this._builder.getVersion();
            version.getClass();
            return version;
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        public final void setAdapterVersion(@NotNull String str) {
            str.getClass();
            this._builder.setAdapterVersion(str);
        }

        public final void setCustomName(@NotNull String str) {
            str.getClass();
            this._builder.setCustomName(str);
        }

        public final void setProvider(@NotNull ClientInfoOuterClass.MediationProvider mediationProvider) {
            mediationProvider.getClass();
            this._builder.setProvider(mediationProvider);
        }

        public final void setProviderValue(int i) {
            this._builder.setProviderValue(i);
        }

        public final void setVersion(@NotNull String str) {
            str.getClass();
            this._builder.setVersion(str);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/MediationInfoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/MediationInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
