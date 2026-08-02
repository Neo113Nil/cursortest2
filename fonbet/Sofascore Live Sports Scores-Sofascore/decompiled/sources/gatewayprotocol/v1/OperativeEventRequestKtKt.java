package gatewayprotocol.v1;

import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.OperativeEventRequestKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/OperativeEventRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "-initializeoperativeEventRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventRequest", "copy", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "getStaticDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfoOrNull", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfoOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfoOrNull", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "getCampaignStateOrNull", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequestOrBuilder;)Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "campaignStateOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OperativeEventRequestKtKt {
    @NotNull
    /* renamed from: -initializeoperativeEventRequest, reason: not valid java name */
    public static final OperativeEventRequestOuterClass.OperativeEventRequest m844initializeoperativeEventRequest(@NotNull Function1<? super OperativeEventRequestKt.Dsl, Unit> function1) {
        function1.getClass();
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventRequest.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
        newBuilder.getClass();
        OperativeEventRequestKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final OperativeEventRequestOuterClass.OperativeEventRequest copy(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, @NotNull Function1<? super OperativeEventRequestKt.Dsl, Unit> function1) {
        operativeEventRequest.getClass();
        function1.getClass();
        OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder = operativeEventRequest.toBuilder();
        builder.getClass();
        OperativeEventRequestKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        operativeEventRequestOrBuilder.getClass();
        if (operativeEventRequestOrBuilder.hasCampaignState()) {
            return operativeEventRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    @Nullable
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        operativeEventRequestOrBuilder.getClass();
        if (operativeEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return operativeEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        operativeEventRequestOrBuilder.getClass();
        if (operativeEventRequestOrBuilder.hasSessionCounters()) {
            return operativeEventRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(@NotNull OperativeEventRequestOuterClass.OperativeEventRequestOrBuilder operativeEventRequestOrBuilder) {
        operativeEventRequestOrBuilder.getClass();
        if (operativeEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return operativeEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
