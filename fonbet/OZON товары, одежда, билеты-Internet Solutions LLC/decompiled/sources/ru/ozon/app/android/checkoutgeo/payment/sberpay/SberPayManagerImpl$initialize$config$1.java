package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.ozonLogger.core.c;
import sj.d;
import sj.f;
import spay.sdk.api.InitializationResult;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lspay/sdk/api/InitializationResult;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SberPayManagerImpl$initialize$config$1 extends AbstractC7737t implements Function1<InitializationResult, Unit> {
    final /* synthetic */ SberPayManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SberPayManagerImpl$initialize$config$1(SberPayManagerImpl sberPayManagerImpl) {
        super(1);
        this.this$0 = sberPayManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InitializationResult initializationResult) {
        invoke2(initializationResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InitializationResult result) {
        d logger;
        Intrinsics.checkNotNullParameter(result, "result");
        this.this$0.checkIsReadyForSPaySdk();
        logger = this.this$0.getLogger();
        logger.f(c.INFO, "spay_init_result", f.a(U.i(new Pair("Result", result.toString()))), Boolean.FALSE);
    }
}
