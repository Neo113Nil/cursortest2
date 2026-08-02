package ru.ozon.app.android.partpayment.smssign.view;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.partpayment.smssign.data.SmsSignDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0001\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO;", "<unused var>", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignNoUiVO;", "invoke", "(Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class SmsSignNoUiViewMapper$mapper$1 extends AbstractC7737t implements Function2<SmsSignDTO, d, List<? extends SmsSignNoUiVO>> {
    public static final SmsSignNoUiViewMapper$mapper$1 INSTANCE = new SmsSignNoUiViewMapper$mapper$1();

    SmsSignNoUiViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<SmsSignNoUiVO> invoke(SmsSignDTO smsSignDTO, d dVar) {
        Intrinsics.checkNotNullParameter(smsSignDTO, "<unused var>");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        return C7714v.a0(new SmsSignNoUiVO(0L, 1, null));
    }
}
