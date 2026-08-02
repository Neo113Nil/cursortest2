package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "-initializeinitializationRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "initializationRequest", "copy", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequestOrBuilder;", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "getClientInfoOrNull", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequestOrBuilder;)Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfoOrNull", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "getDeviceInfoOrNull", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequestOrBuilder;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "deviceInfoOrNull", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "getInstallReferrerOrNull", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequestOrBuilder;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "installReferrerOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitializationRequestKtKt {
    @NotNull
    /* renamed from: -initializeinitializationRequest, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationRequest m831initializeinitializationRequest(@NotNull Function1<? super InitializationRequestKt.Dsl, Unit> function1) {
        function1.getClass();
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.INSTANCE;
        InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
        newBuilder.getClass();
        InitializationRequestKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final InitializationRequestOuterClass.InitializationRequest copy(@NotNull InitializationRequestOuterClass.InitializationRequest initializationRequest, @NotNull Function1<? super InitializationRequestKt.Dsl, Unit> function1) {
        initializationRequest.getClass();
        function1.getClass();
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.INSTANCE;
        InitializationRequestOuterClass.InitializationRequest.Builder builder = initializationRequest.toBuilder();
        builder.getClass();
        InitializationRequestKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(@NotNull InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        initializationRequestOrBuilder.getClass();
        if (initializationRequestOrBuilder.hasClientInfo()) {
            return initializationRequestOrBuilder.getClientInfo();
        }
        return null;
    }

    @Nullable
    public static final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfoOrNull(@NotNull InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        initializationRequestOrBuilder.getClass();
        if (initializationRequestOrBuilder.hasDeviceInfo()) {
            return initializationRequestOrBuilder.getDeviceInfo();
        }
        return null;
    }

    @Nullable
    public static final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(@NotNull InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        initializationRequestOrBuilder.getClass();
        if (initializationRequestOrBuilder.hasInstallReferrer()) {
            return initializationRequestOrBuilder.getInstallReferrer();
        }
        return null;
    }
}
