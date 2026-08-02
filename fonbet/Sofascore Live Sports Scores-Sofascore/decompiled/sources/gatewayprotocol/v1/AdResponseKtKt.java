package gatewayprotocol.v1;

import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdResponseKt$Dsl;", "", "block", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "-initializeadResponse", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adResponse", "copy", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponseOrBuilder;", "Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "getWebviewConfigurationOrNull", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponseOrBuilder;)Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "webviewConfigurationOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "getErrorOrNull", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "errorOrNull", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponseOrBuilder;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadataOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdResponseKtKt {
    @NotNull
    /* renamed from: -initializeadResponse, reason: not valid java name */
    public static final AdResponseOuterClass.AdResponse m799initializeadResponse(@NotNull Function1<? super AdResponseKt.Dsl, Unit> function1) {
        function1.getClass();
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.INSTANCE;
        AdResponseOuterClass.AdResponse.Builder newBuilder = AdResponseOuterClass.AdResponse.newBuilder();
        newBuilder.getClass();
        AdResponseKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final AdResponseOuterClass.AdResponse copy(@NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull Function1<? super AdResponseKt.Dsl, Unit> function1) {
        adResponse.getClass();
        function1.getClass();
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.INSTANCE;
        AdResponseOuterClass.AdResponse.Builder builder = adResponse.toBuilder();
        builder.getClass();
        AdResponseKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(@NotNull AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        adResponseOrBuilder.getClass();
        if (adResponseOrBuilder.hasCampaignMetadata()) {
            return adResponseOrBuilder.getCampaignMetadata();
        }
        return null;
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        adResponseOrBuilder.getClass();
        if (adResponseOrBuilder.hasError()) {
            return adResponseOrBuilder.getError();
        }
        return null;
    }

    @Nullable
    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(@NotNull AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        adResponseOrBuilder.getClass();
        if (adResponseOrBuilder.hasWebviewConfiguration()) {
            return adResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
