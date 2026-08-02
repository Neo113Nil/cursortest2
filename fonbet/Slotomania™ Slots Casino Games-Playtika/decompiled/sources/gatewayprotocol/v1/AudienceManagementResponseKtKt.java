package gatewayprotocol.v1;

import gatewayprotocol.v1.AudienceManagementResponseKt;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudienceManagementResponseKt.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"errorOrNull", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponseOrBuilder;", "getErrorOrNull", "(Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponseOrBuilder;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "audienceManagementResponse", "Lgatewayprotocol/v1/AudienceManagementResponseOuterClass$AudienceManagementResponse;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/AudienceManagementResponseKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeaudienceManagementResponse", "copy", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AudienceManagementResponseKtKt {
    /* renamed from: -initializeaudienceManagementResponse, reason: not valid java name */
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse m10795initializeaudienceManagementResponse(Function1<? super AudienceManagementResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.INSTANCE;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder newBuilder = AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        AudienceManagementResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse copy(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse, Function1<? super AudienceManagementResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(audienceManagementResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.INSTANCE;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder = audienceManagementResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        AudienceManagementResponseKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder audienceManagementResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(audienceManagementResponseOrBuilder, "<this>");
        if (audienceManagementResponseOrBuilder.hasError()) {
            return audienceManagementResponseOrBuilder.getError();
        }
        return null;
    }
}
