package ru.ozon.app.android.account.orders.commonBarcodeV2;

import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$screenshotTracker$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ CommonBarcodeV2VO $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeV2WidgetKt$CommonBarcodeV2Widget$1$3$2$1$screenshotTracker$1$1(CommonBarcodeV2VO commonBarcodeV2VO, C4911f c4911f) {
        super(0);
        this.$item = commonBarcodeV2VO;
        this.$container = c4911f;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$item.getIsOfflineMode()) {
            return;
        }
        List<ComponentCallbacksC5392m> r02 = this.$container.k().r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        List<ComponentCallbacksC5392m> list = r02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ComponentCallbacksC5392m) it.next()) instanceof DialogInterfaceOnCancelListenerC5390k) {
                    return;
                }
            }
        }
        String code = this.$item.getCode();
        String obj = this.$item.getVisibleCode().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        ShareBarcodeBottomSheetFragment.INSTANCE.newInstance(code, obj, this.$item.getObjectType()).show(this.$container.k(), (String) null);
    }
}
