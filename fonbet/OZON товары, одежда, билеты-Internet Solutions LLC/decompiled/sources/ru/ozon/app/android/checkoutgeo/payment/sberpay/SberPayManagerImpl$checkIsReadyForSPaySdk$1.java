package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.SdkReadyCheckResult;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lspay/sdk/api/SdkReadyCheckResult;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SberPayManagerImpl$checkIsReadyForSPaySdk$1 extends AbstractC7737t implements Function1<SdkReadyCheckResult, Unit> {
    final /* synthetic */ SberPayManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SberPayManagerImpl$checkIsReadyForSPaySdk$1(SberPayManagerImpl sberPayManagerImpl) {
        super(1);
        this.this$0 = sberPayManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SdkReadyCheckResult sdkReadyCheckResult) {
        invoke2(sdkReadyCheckResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SdkReadyCheckResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.this$0.isReadyForSPaySdk = result instanceof SdkReadyCheckResult.Ready;
    }
}
