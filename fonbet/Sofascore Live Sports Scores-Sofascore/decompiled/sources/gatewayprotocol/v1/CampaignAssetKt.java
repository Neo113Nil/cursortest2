package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/CampaignAssetKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CampaignAssetKt {

    @NotNull
    public static final CampaignAssetKt INSTANCE = new CampaignAssetKt();

    private CampaignAssetKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lgatewayprotocol/v1/CampaignAssetKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset$Builder;", "<init>", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset$Builder;)V", "_build", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", U3.i.X, "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "clearUrl", "", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "getPriority", "()I", "setPriority", "(I)V", "clearPriority", "", "required", "getRequired", "()Z", "setRequired", "(Z)V", "clearRequired", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final CampaignMetadataOuterClass.CampaignAsset.Builder _builder;

        private Dsl(CampaignMetadataOuterClass.CampaignAsset.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset _build() {
            CampaignMetadataOuterClass.CampaignAsset build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearPriority() {
            this._builder.clearPriority();
        }

        public final void clearRequired() {
            this._builder.clearRequired();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final int getPriority() {
            return this._builder.getPriority();
        }

        public final boolean getRequired() {
            return this._builder.getRequired();
        }

        @NotNull
        public final String getUrl() {
            String url = this._builder.getUrl();
            url.getClass();
            return url;
        }

        public final void setPriority(int i) {
            this._builder.setPriority(i);
        }

        public final void setRequired(boolean z) {
            this._builder.setRequired(z);
        }

        public final void setUrl(@NotNull String str) {
            str.getClass();
            this._builder.setUrl(str);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/CampaignAssetKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/CampaignAssetKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignMetadataOuterClass.CampaignAsset.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(CampaignMetadataOuterClass.CampaignAsset.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
