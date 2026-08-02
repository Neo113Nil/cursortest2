package ru.ozon.app.android.mapcommon.map.sdk;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SdkMapController$addContentViewToContainer$1$1 extends AbstractC7737t implements Function2<Integer, Integer, Unit> {
    final /* synthetic */ SdkMapController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkMapController$addContentViewToContainer$1$1(SdkMapController sdkMapController) {
        super(2);
        this.this$0 = sdkMapController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, int i12) {
        Function0<Unit> onSizeChanged = this.this$0.getOnSizeChanged();
        if (onSizeChanged != null) {
            onSizeChanged.invoke();
        }
    }
}
