package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "", "block", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "-initializesharedData", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedData", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "-initializepayload", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "Dsl", "SharedDataKt", "PayloadKt", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UniversalRequestKt {

    @NotNull
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    private UniversalRequestKt() {
    }

    @NotNull
    /* renamed from: -initializepayload, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.Payload m865initializepayload(@NotNull Function1<? super PayloadKt.Dsl, Unit> block) {
        block.getClass();
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        newBuilder.getClass();
        PayloadKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    /* renamed from: -initializesharedData, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.SharedData m866initializesharedData(@NotNull Function1<? super SharedDataKt.Dsl, Unit> block) {
        block.getClass();
        SharedDataKt.Dsl.Companion companion = SharedDataKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        newBuilder.getClass();
        SharedDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PayloadKt {

        @NotNull
        public static final PayloadKt INSTANCE = new PayloadKt();

        private PayloadKt() {
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0012J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0012J\u0006\u0010I\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0012J\u0006\u0010Q\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\u0012J\u0006\u0010Y\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020\u0012J\u0006\u0010a\u001a\u00020\u0010J\u0006\u0010b\u001a\u00020\u0012J\u0006\u0010i\u001a\u00020\u0010J\u0006\u0010j\u001a\u00020\u0012J\u0006\u0010q\u001a\u00020\u0010J\u0006\u0010r\u001a\u00020\u0012J\u0006\u0010y\u001a\u00020\u0010J\u0006\u0010z\u001a\u00020\u0012J\u0007\u0010\u0081\u0001\u001a\u00020\u0010J\u0007\u0010\u0082\u0001\u001a\u00020\u0012J\u0007\u0010\u0087\u0001\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u00020K2\u0006\u0010\b\u001a\u00020K8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010T\u001a\u00020S2\u0006\u0010\b\u001a\u00020S8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\\\u001a\u00020[2\u0006\u0010\b\u001a\u00020[8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010d\u001a\u00020c2\u0006\u0010\b\u001a\u00020c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010l\u001a\u00020k2\u0006\u0010\b\u001a\u00020k8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010t\u001a\u00020s2\u0006\u0010\b\u001a\u00020s8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR%\u0010|\u001a\u00020{2\u0006\u0010\b\u001a\u00020{8G@GX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010\u0083\u0001\u001a\u00030\u0084\u00018G¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0089\u0001"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", U3.i.X, "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequest", "getInitializationRequest", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "setInitializationRequest", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;)V", "clearInitializationRequest", "", "hasInitializationRequest", "", "Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "adRequest", "getAdRequest", "()Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;", "setAdRequest", "(Lgatewayprotocol/v1/AdRequestOuterClass$AdRequest;)V", "clearAdRequest", "hasAdRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEvent", "getOperativeEvent", "()Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "setOperativeEvent", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V", "clearOperativeEvent", "hasOperativeEvent", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "diagnosticEventRequest", "getDiagnosticEventRequest", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;", "setDiagnosticEventRequest", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventRequest;)V", "clearDiagnosticEventRequest", "hasDiagnosticEventRequest", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequest", "getAdPlayerConfigRequest", "()Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "setAdPlayerConfigRequest", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;)V", "clearAdPlayerConfigRequest", "hasAdPlayerConfigRequest", "Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "getTokenEventRequest", "getGetTokenEventRequest", "()Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;", "setGetTokenEventRequest", "(Lgatewayprotocol/v1/GetTokenEventRequestOuterClass$GetTokenEventRequest;)V", "clearGetTokenEventRequest", "hasGetTokenEventRequest", "Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "privacyUpdateRequest", "getPrivacyUpdateRequest", "()Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;", "setPrivacyUpdateRequest", "(Lgatewayprotocol/v1/PrivacyUpdateRequestOuterClass$PrivacyUpdateRequest;)V", "clearPrivacyUpdateRequest", "hasPrivacyUpdateRequest", "Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "adDataRefreshRequest", "getAdDataRefreshRequest", "()Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;", "setAdDataRefreshRequest", "(Lgatewayprotocol/v1/AdDataRefreshRequestOuterClass$AdDataRefreshRequest;)V", "clearAdDataRefreshRequest", "hasAdDataRefreshRequest", "Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "initializationCompletedEventRequest", "getInitializationCompletedEventRequest", "()Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;", "setInitializationCompletedEventRequest", "(Lgatewayprotocol/v1/InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest;)V", "clearInitializationCompletedEventRequest", "hasInitializationCompletedEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "transactionEventRequest", "getTransactionEventRequest", "()Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "setTransactionEventRequest", "(Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;)V", "clearTransactionEventRequest", "hasTransactionEventRequest", "Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "audienceManagementRequest", "getAudienceManagementRequest", "()Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;", "setAudienceManagementRequest", "(Lgatewayprotocol/v1/AudienceManagementRequestOuterClass$AudienceManagementRequest;)V", "clearAudienceManagementRequest", "hasAudienceManagementRequest", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "adRevenueEventRequest", "getAdRevenueEventRequest", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "setAdRevenueEventRequest", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;)V", "clearAdRevenueEventRequest", "hasAdRevenueEventRequest", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "monitoringEventRequest", "getMonitoringEventRequest", "()Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;", "setMonitoringEventRequest", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventRequest;)V", "clearMonitoringEventRequest", "hasMonitoringEventRequest", "Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "lifecycleEventRequest", "getLifecycleEventRequest", "()Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;", "setLifecycleEventRequest", "(Lgatewayprotocol/v1/LifecycleEventRequestOuterClass$LifecycleEventRequest;)V", "clearLifecycleEventRequest", "hasLifecycleEventRequest", "Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", "rewardedOffersRequest", "getRewardedOffersRequest", "()Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;", "setRewardedOffersRequest", "(Lgatewayprotocol/v1/RewardedOffersRequestOuterClass$RewardedOffersRequest;)V", "clearRewardedOffersRequest", "hasRewardedOffersRequest", "valueCase", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$ValueCase;", "clearValue", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                UniversalRequestOuterClass.UniversalRequest.Payload build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final void clearAdRevenueEventRequest() {
                this._builder.clearAdRevenueEventRequest();
            }

            public final void clearAudienceManagementRequest() {
                this._builder.clearAudienceManagementRequest();
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final void clearLifecycleEventRequest() {
                this._builder.clearLifecycleEventRequest();
            }

            public final void clearMonitoringEventRequest() {
                this._builder.clearMonitoringEventRequest();
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final void clearRewardedOffersRequest() {
                this._builder.clearRewardedOffersRequest();
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            @NotNull
            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                adDataRefreshRequest.getClass();
                return adDataRefreshRequest;
            }

            @NotNull
            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                adPlayerConfigRequest.getClass();
                return adPlayerConfigRequest;
            }

            @NotNull
            public final AdRequestOuterClass.AdRequest getAdRequest() {
                AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                adRequest.getClass();
                return adRequest;
            }

            @NotNull
            public final AdRevenueEventRequestOuterClass.AdRevenueEventRequest getAdRevenueEventRequest() {
                AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest = this._builder.getAdRevenueEventRequest();
                adRevenueEventRequest.getClass();
                return adRevenueEventRequest;
            }

            @NotNull
            public final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest() {
                AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest = this._builder.getAudienceManagementRequest();
                audienceManagementRequest.getClass();
                return audienceManagementRequest;
            }

            @NotNull
            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                diagnosticEventRequest.getClass();
                return diagnosticEventRequest;
            }

            @NotNull
            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                getTokenEventRequest.getClass();
                return getTokenEventRequest;
            }

            @NotNull
            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                initializationCompletedEventRequest.getClass();
                return initializationCompletedEventRequest;
            }

            @NotNull
            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                initializationRequest.getClass();
                return initializationRequest;
            }

            @NotNull
            public final LifecycleEventRequestOuterClass.LifecycleEventRequest getLifecycleEventRequest() {
                LifecycleEventRequestOuterClass.LifecycleEventRequest lifecycleEventRequest = this._builder.getLifecycleEventRequest();
                lifecycleEventRequest.getClass();
                return lifecycleEventRequest;
            }

            @NotNull
            public final MonitoringEventRequestOuterClass.MonitoringEventRequest getMonitoringEventRequest() {
                MonitoringEventRequestOuterClass.MonitoringEventRequest monitoringEventRequest = this._builder.getMonitoringEventRequest();
                monitoringEventRequest.getClass();
                return monitoringEventRequest;
            }

            @NotNull
            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEvent = this._builder.getOperativeEvent();
                operativeEvent.getClass();
                return operativeEvent;
            }

            @NotNull
            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                privacyUpdateRequest.getClass();
                return privacyUpdateRequest;
            }

            @NotNull
            public final RewardedOffersRequestOuterClass.RewardedOffersRequest getRewardedOffersRequest() {
                RewardedOffersRequestOuterClass.RewardedOffersRequest rewardedOffersRequest = this._builder.getRewardedOffersRequest();
                rewardedOffersRequest.getClass();
                return rewardedOffersRequest;
            }

            @NotNull
            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                transactionEventRequest.getClass();
                return transactionEventRequest;
            }

            @NotNull
            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
                valueCase.getClass();
                return valueCase;
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final boolean hasAdRevenueEventRequest() {
                return this._builder.hasAdRevenueEventRequest();
            }

            public final boolean hasAudienceManagementRequest() {
                return this._builder.hasAudienceManagementRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final boolean hasLifecycleEventRequest() {
                return this._builder.hasLifecycleEventRequest();
            }

            public final boolean hasMonitoringEventRequest() {
                return this._builder.hasMonitoringEventRequest();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final boolean hasRewardedOffersRequest() {
                return this._builder.hasRewardedOffersRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final void setAdDataRefreshRequest(@NotNull AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                this._builder.setAdDataRefreshRequest(adDataRefreshRequest);
            }

            public final void setAdPlayerConfigRequest(@NotNull AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                this._builder.setAdPlayerConfigRequest(adPlayerConfigRequest);
            }

            public final void setAdRequest(@NotNull AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                this._builder.setAdRequest(adRequest);
            }

            public final void setAdRevenueEventRequest(@NotNull AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest) {
                adRevenueEventRequest.getClass();
                this._builder.setAdRevenueEventRequest(adRevenueEventRequest);
            }

            public final void setAudienceManagementRequest(@NotNull AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                audienceManagementRequest.getClass();
                this._builder.setAudienceManagementRequest(audienceManagementRequest);
            }

            public final void setDiagnosticEventRequest(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                this._builder.setDiagnosticEventRequest(diagnosticEventRequest);
            }

            public final void setGetTokenEventRequest(@NotNull GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                this._builder.setGetTokenEventRequest(getTokenEventRequest);
            }

            public final void setInitializationCompletedEventRequest(@NotNull InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                this._builder.setInitializationCompletedEventRequest(initializationCompletedEventRequest);
            }

            public final void setInitializationRequest(@NotNull InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                this._builder.setInitializationRequest(initializationRequest);
            }

            public final void setLifecycleEventRequest(@NotNull LifecycleEventRequestOuterClass.LifecycleEventRequest lifecycleEventRequest) {
                lifecycleEventRequest.getClass();
                this._builder.setLifecycleEventRequest(lifecycleEventRequest);
            }

            public final void setMonitoringEventRequest(@NotNull MonitoringEventRequestOuterClass.MonitoringEventRequest monitoringEventRequest) {
                monitoringEventRequest.getClass();
                this._builder.setMonitoringEventRequest(monitoringEventRequest);
            }

            public final void setOperativeEvent(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                this._builder.setOperativeEvent(operativeEventRequest);
            }

            public final void setPrivacyUpdateRequest(@NotNull PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                this._builder.setPrivacyUpdateRequest(privacyUpdateRequest);
            }

            public final void setRewardedOffersRequest(@NotNull RewardedOffersRequestOuterClass.RewardedOffersRequest rewardedOffersRequest) {
                rewardedOffersRequest.getClass();
                this._builder.setRewardedOffersRequest(rewardedOffersRequest);
            }

            public final void setTransactionEventRequest(@NotNull TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                this._builder.setTransactionEventRequest(transactionEventRequest);
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$PayloadKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SharedDataKt {

        @NotNull
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        private SharedDataKt() {
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010,\u001a\u00020\u0010J\u0006\u0010-\u001a\u00020\u0012J\u0006\u00107\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0012J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010=\u001a\u00020\u0012J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010E\u001a\u00020\u0012J\u0006\u0010O\u001a\u00020\u0010J\u0006\u0010P\u001a\u00020\u0012J\u0006\u0010T\u001a\u00020\u0010J\u0006\u0010U\u001a\u00020\u0012J\u0006\u0010\\\u001a\u00020\u0010J\u0006\u0010]\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u0004\u0018\u00010\u001b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010.\u001a\u0004\u0018\u00010&*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b/\u00100R$\u00102\u001a\u0002012\u0006\u0010\b\u001a\u0002018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010?\u001a\u00020>2\u0006\u0010\b\u001a\u00020>8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0017\u0010F\u001a\u0004\u0018\u00010>*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bG\u0010HR$\u0010J\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010Q\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010L\"\u0004\bS\u0010NR$\u0010W\u001a\u00020V2\u0006\u0010\b\u001a\u00020V8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0017\u0010^\u001a\u0004\u0018\u00010V*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", U3.i.X, "Lcom/google/protobuf/ByteString;", "sessionToken", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "clearSessionToken", "", "hasSessionToken", "", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "timestamps", "getTimestamps", "()Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "setTimestamps", "(Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;)V", "clearTimestamps", "hasTimestamps", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "pii", "getPii", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "setPii", "(Lgatewayprotocol/v1/PiiOuterClass$Pii;)V", "clearPii", "hasPii", "piiOrNull", "getPiiOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/PiiOuterClass$Pii;", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsent", "getDeveloperConsent", "()Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "setDeveloperConsent", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;)V", "clearDeveloperConsent", "hasDeveloperConsent", "developerConsentOrNull", "getDeveloperConsentOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "", "webviewVersion", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "clearWebviewVersion", "hasWebviewVersion", "currentState", "getCurrentState", "setCurrentState", "clearCurrentState", "hasCurrentState", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "testData", "getTestData", "()Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "setTestData", "(Lgatewayprotocol/v1/TestDataOuterClass$TestData;)V", "clearTestData", "hasTestData", "testDataOrNull", "getTestDataOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/TestDataOuterClass$TestData;", "Lcom/google/protobuf/Timestamp;", "appStartTime", "getAppStartTime", "()Lcom/google/protobuf/Timestamp;", "setAppStartTime", "(Lcom/google/protobuf/Timestamp;)V", "clearAppStartTime", "hasAppStartTime", "sdkStartTime", "getSdkStartTime", "setSdkStartTime", "clearSdkStartTime", "hasSdkStartTime", "Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "limitedSessionToken", "getLimitedSessionToken", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "setLimitedSessionToken", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;)V", "clearLimitedSessionToken", "hasLimitedSessionToken", "limitedSessionTokenOrNull", "getLimitedSessionTokenOrNull", "(Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;)Lgatewayprotocol/v1/UniversalRequestOuterClass$LimitedSessionToken;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @ProtoDslMarker
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                UniversalRequestOuterClass.UniversalRequest.SharedData build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            @NotNull
            public final Timestamp getAppStartTime() {
                Timestamp appStartTime = this._builder.getAppStartTime();
                appStartTime.getClass();
                return appStartTime;
            }

            @NotNull
            public final ByteString getCurrentState() {
                ByteString currentState = this._builder.getCurrentState();
                currentState.getClass();
                return currentState;
            }

            @NotNull
            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                developerConsent.getClass();
                return developerConsent;
            }

            @Nullable
            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(@NotNull Dsl dsl) {
                dsl.getClass();
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            @NotNull
            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                limitedSessionToken.getClass();
                return limitedSessionToken;
            }

            @Nullable
            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull Dsl dsl) {
                dsl.getClass();
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }

            @NotNull
            public final PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this._builder.getPii();
                pii.getClass();
                return pii;
            }

            @Nullable
            public final PiiOuterClass.Pii getPiiOrNull(@NotNull Dsl dsl) {
                dsl.getClass();
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            @NotNull
            public final Timestamp getSdkStartTime() {
                Timestamp sdkStartTime = this._builder.getSdkStartTime();
                sdkStartTime.getClass();
                return sdkStartTime;
            }

            @NotNull
            public final ByteString getSessionToken() {
                ByteString sessionToken = this._builder.getSessionToken();
                sessionToken.getClass();
                return sessionToken;
            }

            @NotNull
            public final TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this._builder.getTestData();
                testData.getClass();
                return testData;
            }

            @Nullable
            public final TestDataOuterClass.TestData getTestDataOrNull(@NotNull Dsl dsl) {
                dsl.getClass();
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            @NotNull
            public final TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                timestamps.getClass();
                return timestamps;
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final void setAppStartTime(@NotNull Timestamp timestamp) {
                timestamp.getClass();
                this._builder.setAppStartTime(timestamp);
            }

            public final void setCurrentState(@NotNull ByteString byteString) {
                byteString.getClass();
                this._builder.setCurrentState(byteString);
            }

            public final void setDeveloperConsent(@NotNull DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                this._builder.setDeveloperConsent(developerConsent);
            }

            public final void setLimitedSessionToken(@NotNull UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                this._builder.setLimitedSessionToken(limitedSessionToken);
            }

            public final void setPii(@NotNull PiiOuterClass.Pii pii) {
                pii.getClass();
                this._builder.setPii(pii);
            }

            public final void setSdkStartTime(@NotNull Timestamp timestamp) {
                timestamp.getClass();
                this._builder.setSdkStartTime(timestamp);
            }

            public final void setSessionToken(@NotNull ByteString byteString) {
                byteString.getClass();
                this._builder.setSessionToken(byteString);
            }

            public final void setTestData(@NotNull TestDataOuterClass.TestData testData) {
                testData.getClass();
                this._builder.setTestData(testData);
            }

            public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                this._builder.setTimestamps(timestamps);
            }

            public final void setWebviewVersion(int i) {
                this._builder.setWebviewVersion(i);
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$SharedDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", U3.i.X, "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "sharedData", "getSharedData", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "setSharedData", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;)V", "clearSharedData", "", "hasSharedData", "", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "getPayload", "()Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "setPayload", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;)V", "clearPayload", "hasPayload", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            UniversalRequestOuterClass.UniversalRequest build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        @NotNull
        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            payload.getClass();
            return payload;
        }

        @NotNull
        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            sharedData.getClass();
            return sharedData;
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setPayload(@NotNull UniversalRequestOuterClass.UniversalRequest.Payload payload) {
            payload.getClass();
            this._builder.setPayload(payload);
        }

        public final void setSharedData(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            this._builder.setSharedData(sharedData);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/UniversalRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/UniversalRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
