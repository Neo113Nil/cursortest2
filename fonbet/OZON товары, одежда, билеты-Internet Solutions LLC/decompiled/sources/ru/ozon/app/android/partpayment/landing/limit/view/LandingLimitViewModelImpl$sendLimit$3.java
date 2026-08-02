package ru.ozon.app.android.partpayment.landing.limit.view;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;
import ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModel;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LandingLimitViewModelImpl$sendLimit$3 extends AbstractC7737t implements Function1<PassFormVO, Unit> {
    final /* synthetic */ String $name;
    final /* synthetic */ LandingLimitViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LandingLimitViewModelImpl$sendLimit$3(String str, LandingLimitViewModelImpl landingLimitViewModelImpl) {
        super(1);
        this.$name = str;
        this.this$0 = landingLimitViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PassFormVO passFormVO) {
        invoke2(passFormVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PassFormVO passFormVO) {
        String deeplink;
        String str;
        Map<String, String> fields = passFormVO.getFields();
        if ((fields == null || !fields.containsKey(this.$name)) && (deeplink = passFormVO.getDeeplink()) != null && !h.K(deeplink)) {
            this.this$0.getNoUiAction().setValue(new LandingLimitViewModel.NoUiAction.SendSuccess(passFormVO.getDeeplink()));
            return;
        }
        BroadcastSingleLiveEvent<LandingLimitViewModel.UiAction> uiAction = this.this$0.getUiAction();
        Map<String, String> fields2 = passFormVO.getFields();
        if (fields2 == null || (str = fields2.get(this.$name)) == null) {
            str = " ";
        }
        uiAction.setValue(new LandingLimitViewModel.UiAction.WrongLimit(str));
    }
}
