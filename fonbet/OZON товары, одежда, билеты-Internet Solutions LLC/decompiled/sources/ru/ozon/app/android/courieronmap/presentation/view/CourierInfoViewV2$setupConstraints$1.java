package ru.ozon.app.android.courieronmap.presentation.view;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewV2;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CourierInfoViewV2$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ CourierInfoViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierInfoViewV2$setupConstraints$1(CourierInfoViewV2 courierInfoViewV2) {
        super(1);
        this.this$0 = courierInfoViewV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomV2View courierTitleTv;
        TextAtomV2View courierTitleTv2;
        TextAtomV2View courierSubtitleTv;
        TextAtomV2View courierSubtitleTv2;
        TextAtomV2View courierTitleTv3;
        VerticalRecyclerContainer courierInfoScrollVRC;
        VerticalRecyclerContainer courierInfoScrollVRC2;
        VerticalRecyclerContainer courierInfoScrollVRC3;
        TextAtomV2View courierSubtitleTv3;
        VerticalRecyclerContainer courierInfoScrollVRC4;
        FrameLayout callCourierContainer;
        FrameLayout callCourierContainer2;
        FrameLayout callCourierContainer3;
        FrameLayout callCourierContainer4;
        VerticalRecyclerContainer courierInfoScrollVRC5;
        FrameLayout callCourierContainer5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        courierTitleTv = this.this$0.getCourierTitleTv();
        updateConstraints.s(courierTitleTv.getId(), 6, 0, 6);
        courierTitleTv2 = this.this$0.getCourierTitleTv();
        int id2 = courierTitleTv2.getId();
        CourierInfoViewV2.Companion companion = CourierInfoViewV2.INSTANCE;
        updateConstraints.t(id2, 3, 0, 3, companion.getMARGIN_8());
        courierSubtitleTv = this.this$0.getCourierSubtitleTv();
        updateConstraints.s(courierSubtitleTv.getId(), 6, 0, 6);
        courierSubtitleTv2 = this.this$0.getCourierSubtitleTv();
        int id3 = courierSubtitleTv2.getId();
        courierTitleTv3 = this.this$0.getCourierTitleTv();
        updateConstraints.t(id3, 3, courierTitleTv3.getId(), 4, companion.getMARGIN_4());
        courierInfoScrollVRC = this.this$0.getCourierInfoScrollVRC();
        updateConstraints.s(courierInfoScrollVRC.getId(), 6, 0, 6);
        courierInfoScrollVRC2 = this.this$0.getCourierInfoScrollVRC();
        updateConstraints.s(courierInfoScrollVRC2.getId(), 7, 0, 7);
        courierInfoScrollVRC3 = this.this$0.getCourierInfoScrollVRC();
        int id4 = courierInfoScrollVRC3.getId();
        courierSubtitleTv3 = this.this$0.getCourierSubtitleTv();
        updateConstraints.t(id4, 3, courierSubtitleTv3.getId(), 4, companion.getMARGIN_12());
        courierInfoScrollVRC4 = this.this$0.getCourierInfoScrollVRC();
        int id5 = courierInfoScrollVRC4.getId();
        callCourierContainer = this.this$0.getCallCourierContainer();
        updateConstraints.t(id5, 4, callCourierContainer.getId(), 3, companion.getMARGIN_16());
        callCourierContainer2 = this.this$0.getCallCourierContainer();
        updateConstraints.s(callCourierContainer2.getId(), 6, 0, 6);
        callCourierContainer3 = this.this$0.getCallCourierContainer();
        updateConstraints.s(callCourierContainer3.getId(), 7, 0, 7);
        callCourierContainer4 = this.this$0.getCallCourierContainer();
        int id6 = callCourierContainer4.getId();
        courierInfoScrollVRC5 = this.this$0.getCourierInfoScrollVRC();
        updateConstraints.s(id6, 3, courierInfoScrollVRC5.getId(), 4);
        callCourierContainer5 = this.this$0.getCallCourierContainer();
        updateConstraints.s(callCourierContainer5.getId(), 4, 0, 4);
    }
}
