package ru.ozon.app.android.scanit.scanit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import retrofit2.HttpException;
import ru.ozon.app.android.feature.scanit.R$string;
import ru.ozon.app.android.scanit.scanit.ScanItViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ScanItViewModel$requestDeeplinkByBarcode$3 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ ScanItViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScanItViewModel$requestDeeplinkByBarcode$3(ScanItViewModel scanItViewModel) {
        super(1);
        this.this$0 = scanItViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        if ((th2 instanceof HttpException) && ((HttpException) th2).code() == 404) {
            this.this$0.getLiveData().setValue(new ScanItViewModel.Action.Error(R$string.error_scan_it_not_found));
        } else {
            this.this$0.getLiveData().setValue(new ScanItViewModel.Action.Error(ru.ozon.app.android.platform.R$string.common_universal_network_error));
        }
        Lm0.a.f17149a.e(th2);
    }
}
