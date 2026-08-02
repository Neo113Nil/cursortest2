package gatewayprotocol.v1;

import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "", "block", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "-initializeadPlayerConfigRequest", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "adPlayerConfigRequest", "copy", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder;", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequestOrBuilder;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdPlayerConfigRequestKtKt {
    @NotNull
    /* renamed from: -initializeadPlayerConfigRequest, reason: not valid java name */
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest m796initializeadPlayerConfigRequest(@NotNull Function1<? super AdPlayerConfigRequestKt.Dsl, Unit> function1) {
        function1.getClass();
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.INSTANCE;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        newBuilder.getClass();
        AdPlayerConfigRequestKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest copy(@NotNull AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest, @NotNull Function1<? super AdPlayerConfigRequestKt.Dsl, Unit> function1) {
        adPlayerConfigRequest.getClass();
        function1.getClass();
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.INSTANCE;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder = adPlayerConfigRequest.toBuilder();
        builder.getClass();
        AdPlayerConfigRequestKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder adPlayerConfigRequestOrBuilder) {
        adPlayerConfigRequestOrBuilder.getClass();
        if (adPlayerConfigRequestOrBuilder.hasMediationInfo()) {
            return adPlayerConfigRequestOrBuilder.getMediationInfo();
        }
        return null;
    }
}
