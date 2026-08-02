package ru.ozon.app.android.partpayment.smssign.view;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.m;
import ru.ozon.app.android.partpayment.R$string;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "sec", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SmsSignViewModelImpl$resetTimer$3 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ int $durationSec;
    final /* synthetic */ SmsSignViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmsSignViewModelImpl$resetTimer$3(int i11, SmsSignViewModelImpl smsSignViewModelImpl) {
        super(1);
        this.$durationSec = i11;
        this.this$0 = smsSignViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke2(l11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Long l11) {
        m mVar;
        long j11 = this.$durationSec;
        Intrinsics.f(l11);
        Period F11 = Period.F((int) (j11 - l11.longValue()));
        Intrinsics.checkNotNullExpressionValue(F11, "seconds(...)");
        V<SmsSignViewModel.TimerInfoVO> timerInfo = this.this$0.getTimerInfo();
        int i11 = R$string.cabinet_retry_send_in;
        mVar = this.this$0.formatter;
        timerInfo.postValue(new SmsSignViewModel.TimerInfoVO(StringProvider.getString(i11, mVar.e(F11.E(PeriodType.j()))), false, 0, 6, null));
    }
}
