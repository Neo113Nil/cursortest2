package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "", "block", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "-initializepayload", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payload", "Dsl", "PayloadKt", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UniversalResponseKt {

    @NotNull
    public static final UniversalResponseKt INSTANCE = new UniversalResponseKt();

    private UniversalResponseKt() {
    }

    @NotNull
    /* renamed from: -initializepayload, reason: not valid java name */
    public final UniversalResponseOuterClass.UniversalResponse.Payload m868initializepayload(@NotNull Function1<? super PayloadKt.Dsl, Unit> block) {
        block.getClass();
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.INSTANCE;
        UniversalResponseOuterClass.UniversalResponse.Payload.Builder newBuilder = UniversalResponseOuterClass.UniversalResponse.Payload.newBuilder();
        newBuilder.getClass();
        PayloadKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PayloadKt {

        @NotNull
        public static final PayloadKt INSTANCE = new PayloadKt();

        private PayloadKt() {
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0012J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0012J\u0006\u0010G\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0011\u0010C\u001a\u00020D8G¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", U3.i.X, "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "initializationResponse", "getInitializationResponse", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "setInitializationResponse", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;)V", "clearInitializationResponse", "", "hasInitializationResponse", "", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adResponse", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "clearAdResponse", "hasAdResponse", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "adPlayerConfigResponse", "getAdPlayerConfigResponse", "()Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", "setAdPlayerConfigResponse", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;)V", "clearAdPlayerConfigResponse", "hasAdPlayerConfigResponse", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "adDataRefreshResponse", "getAdDataRefreshResponse", "()Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "setAdDataRefreshResponse", "(Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;)V", "clearAdDataRefreshResponse", "hasAdDataRefreshResponse", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateResponse", "getPrivacyUpdateResponse", "()Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "setPrivacyUpdateResponse", "(Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;)V", "clearPrivacyUpdateResponse", "hasPrivacyUpdateResponse", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "audienceManagementResponse", "getAudienceManagementResponse", "()Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "setAudienceManagementResponse", "(Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;)V", "clearAudienceManagementResponse", "hasAudienceManagementResponse", "Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "rewardedOffersResponse", "getRewardedOffersResponse", "()Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;", "setRewardedOffersResponse", "(Lgatewayprotocol/v1/RewardedOffersResponseOuterClass$RewardedOffersResponse;)V", "clearRewardedOffersResponse", "hasRewardedOffersResponse", "valueCase", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$ValueCase;", "clearValue", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final UniversalResponseOuterClass.UniversalResponse.Payload.Builder _builder;

            private Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse.Payload _build() {
                UniversalResponseOuterClass.UniversalResponse.Payload build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearAdDataRefreshResponse() {
                this._builder.clearAdDataRefreshResponse();
            }

            public final void clearAdPlayerConfigResponse() {
                this._builder.clearAdPlayerConfigResponse();
            }

            public final void clearAdResponse() {
                this._builder.clearAdResponse();
            }

            public final void clearAudienceManagementResponse() {
                this._builder.clearAudienceManagementResponse();
            }

            public final void clearInitializationResponse() {
                this._builder.clearInitializationResponse();
            }

            public final void clearPrivacyUpdateResponse() {
                this._builder.clearPrivacyUpdateResponse();
            }

            public final void clearRewardedOffersResponse() {
                this._builder.clearRewardedOffersResponse();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            @NotNull
            public final AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = this._builder.getAdDataRefreshResponse();
                adDataRefreshResponse.getClass();
                return adDataRefreshResponse;
            }

            @NotNull
            public final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse = this._builder.getAdPlayerConfigResponse();
                adPlayerConfigResponse.getClass();
                return adPlayerConfigResponse;
            }

            @NotNull
            public final AdResponseOuterClass.AdResponse getAdResponse() {
                AdResponseOuterClass.AdResponse adResponse = this._builder.getAdResponse();
                adResponse.getClass();
                return adResponse;
            }

            @NotNull
            public final AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse() {
                AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse = this._builder.getAudienceManagementResponse();
                audienceManagementResponse.getClass();
                return audienceManagementResponse;
            }

            @NotNull
            public final InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                InitializationResponseOuterClass.InitializationResponse initializationResponse = this._builder.getInitializationResponse();
                initializationResponse.getClass();
                return initializationResponse;
            }

            @NotNull
            public final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = this._builder.getPrivacyUpdateResponse();
                privacyUpdateResponse.getClass();
                return privacyUpdateResponse;
            }

            @NotNull
            public final RewardedOffersResponseOuterClass.RewardedOffersResponse getRewardedOffersResponse() {
                RewardedOffersResponseOuterClass.RewardedOffersResponse rewardedOffersResponse = this._builder.getRewardedOffersResponse();
                rewardedOffersResponse.getClass();
                return rewardedOffersResponse;
            }

            @NotNull
            public final UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase getValueCase() {
                UniversalResponseOuterClass.UniversalResponse.Payload.ValueCase valueCase = this._builder.getValueCase();
                valueCase.getClass();
                return valueCase;
            }

            public final boolean hasAdDataRefreshResponse() {
                return this._builder.hasAdDataRefreshResponse();
            }

            public final boolean hasAdPlayerConfigResponse() {
                return this._builder.hasAdPlayerConfigResponse();
            }

            public final boolean hasAdResponse() {
                return this._builder.hasAdResponse();
            }

            public final boolean hasAudienceManagementResponse() {
                return this._builder.hasAudienceManagementResponse();
            }

            public final boolean hasInitializationResponse() {
                return this._builder.hasInitializationResponse();
            }

            public final boolean hasPrivacyUpdateResponse() {
                return this._builder.hasPrivacyUpdateResponse();
            }

            public final boolean hasRewardedOffersResponse() {
                return this._builder.hasRewardedOffersResponse();
            }

            public final void setAdDataRefreshResponse(@NotNull AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                this._builder.setAdDataRefreshResponse(adDataRefreshResponse);
            }

            public final void setAdPlayerConfigResponse(@NotNull AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                this._builder.setAdPlayerConfigResponse(adPlayerConfigResponse);
            }

            public final void setAdResponse(@NotNull AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                this._builder.setAdResponse(adResponse);
            }

            public final void setAudienceManagementResponse(@NotNull AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                audienceManagementResponse.getClass();
                this._builder.setAudienceManagementResponse(audienceManagementResponse);
            }

            public final void setInitializationResponse(@NotNull InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                this._builder.setInitializationResponse(initializationResponse);
            }

            public final void setPrivacyUpdateResponse(@NotNull PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                this._builder.setPrivacyUpdateResponse(privacyUpdateResponse);
            }

            public final void setRewardedOffersResponse(@NotNull RewardedOffersResponseOuterClass.RewardedOffersResponse rewardedOffersResponse) {
                rewardedOffersResponse.getClass();
                this._builder.setRewardedOffersResponse(rewardedOffersResponse);
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalResponseKt$PayloadKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Payload.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u0013*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010&\u001a\u0004\u0018\u00010\u001e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", U3.i.X, "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "payload", "getPayload", "()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;", "setPayload", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;)V", "clearPayload", "", "hasPayload", "", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableData", "getMutableData", "()Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "setMutableData", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;)V", "clearMutableData", "hasMutableData", "mutableDataOrNull", "getMutableDataOrNull", "(Lgatewayprotocol/v1/UniversalResponseKt$Dsl;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "clearError", "hasError", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/UniversalResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final UniversalResponseOuterClass.UniversalResponse.Builder _builder;

        private Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ UniversalResponseOuterClass.UniversalResponse _build() {
            UniversalResponseOuterClass.UniversalResponse build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearMutableData() {
            this._builder.clearMutableData();
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        @NotNull
        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            error.getClass();
            return error;
        }

        @Nullable
        public final ErrorOuterClass.Error getErrorOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return UniversalResponseKtKt.getErrorOrNull(dsl._builder);
        }

        @NotNull
        public final MutableDataOuterClass.MutableData getMutableData() {
            MutableDataOuterClass.MutableData mutableData = this._builder.getMutableData();
            mutableData.getClass();
            return mutableData;
        }

        @Nullable
        public final MutableDataOuterClass.MutableData getMutableDataOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return UniversalResponseKtKt.getMutableDataOrNull(dsl._builder);
        }

        @NotNull
        public final UniversalResponseOuterClass.UniversalResponse.Payload getPayload() {
            UniversalResponseOuterClass.UniversalResponse.Payload payload = this._builder.getPayload();
            payload.getClass();
            return payload;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasMutableData() {
            return this._builder.hasMutableData();
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final void setError(@NotNull ErrorOuterClass.Error error) {
            error.getClass();
            this._builder.setError(error);
        }

        public final void setMutableData(@NotNull MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            this._builder.setMutableData(mutableData);
        }

        public final void setPayload(@NotNull UniversalResponseOuterClass.UniversalResponse.Payload payload) {
            payload.getClass();
            this._builder.setPayload(payload);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalResponseKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalResponseOuterClass.UniversalResponse.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalResponseOuterClass.UniversalResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
