package ru.ozon.app.android.courieronmap.presentation.view;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewV1;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CourierInfoViewV1$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ CourierInfoViewV1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierInfoViewV1$setupConstraints$1(CourierInfoViewV1 courierInfoViewV1) {
        super(1);
        this.this$0 = courierInfoViewV1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        TextAtomView courierTitleTv;
        TextAtomView courierTitleTv2;
        TextAtomView courierTitleTv3;
        TextAtomView courierSubtitleTv;
        TextAtomView courierSubtitleTv2;
        TextAtomView courierSubtitleTv3;
        TextAtomView courierTitleTv4;
        TextAtomView courierSubtitleTv4;
        VerticalRecyclerContainer courierInfoScrollVRC;
        VerticalRecyclerContainer courierInfoScrollVRC2;
        VerticalRecyclerContainer courierInfoScrollVRC3;
        VerticalRecyclerContainer courierInfoScrollVRC4;
        TextAtomView courierSubtitleTv5;
        VerticalRecyclerContainer courierInfoScrollVRC5;
        FrameLayout callCourierContainer;
        FrameLayout callCourierContainer2;
        FrameLayout callCourierContainer3;
        FrameLayout callCourierContainer4;
        VerticalRecyclerContainer courierInfoScrollVRC6;
        FrameLayout callCourierContainer5;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        courierTitleTv = this.this$0.getCourierTitleTv();
        updateConstraints.s(courierTitleTv.getId(), 6, 0, 6);
        courierTitleTv2 = this.this$0.getCourierTitleTv();
        updateConstraints.s(courierTitleTv2.getId(), 7, 0, 7);
        courierTitleTv3 = this.this$0.getCourierTitleTv();
        int id2 = courierTitleTv3.getId();
        CourierInfoViewV1.Companion companion = CourierInfoViewV1.INSTANCE;
        updateConstraints.t(id2, 3, 0, 3, companion.getMARGIN_8());
        courierSubtitleTv = this.this$0.getCourierSubtitleTv();
        updateConstraints.s(courierSubtitleTv.getId(), 6, 0, 6);
        courierSubtitleTv2 = this.this$0.getCourierSubtitleTv();
        updateConstraints.s(courierSubtitleTv2.getId(), 7, 0, 7);
        courierSubtitleTv3 = this.this$0.getCourierSubtitleTv();
        int id3 = courierSubtitleTv3.getId();
        courierTitleTv4 = this.this$0.getCourierTitleTv();
        updateConstraints.s(id3, 3, courierTitleTv4.getId(), 4);
        courierSubtitleTv4 = this.this$0.getCourierSubtitleTv();
        int id4 = courierSubtitleTv4.getId();
        courierInfoScrollVRC = this.this$0.getCourierInfoScrollVRC();
        updateConstraints.s(id4, 4, courierInfoScrollVRC.getId(), 3);
        courierInfoScrollVRC2 = this.this$0.getCourierInfoScrollVRC();
        updateConstraints.s(courierInfoScrollVRC2.getId(), 6, 0, 6);
        courierInfoScrollVRC3 = this.this$0.getCourierInfoScrollVRC();
        updateConstraints.s(courierInfoScrollVRC3.getId(), 7, 0, 7);
        courierInfoScrollVRC4 = this.this$0.getCourierInfoScrollVRC();
        int id5 = courierInfoScrollVRC4.getId();
        courierSubtitleTv5 = this.this$0.getCourierSubtitleTv();
        updateConstraints.t(id5, 3, courierSubtitleTv5.getId(), 4, companion.getMARGIN_13());
        courierInfoScrollVRC5 = this.this$0.getCourierInfoScrollVRC();
        int id6 = courierInfoScrollVRC5.getId();
        callCourierContainer = this.this$0.getCallCourierContainer();
        updateConstraints.s(id6, 4, callCourierContainer.getId(), 3);
        callCourierContainer2 = this.this$0.getCallCourierContainer();
        updateConstraints.s(callCourierContainer2.getId(), 6, 0, 6);
        callCourierContainer3 = this.this$0.getCallCourierContainer();
        updateConstraints.s(callCourierContainer3.getId(), 7, 0, 7);
        callCourierContainer4 = this.this$0.getCallCourierContainer();
        int id7 = callCourierContainer4.getId();
        courierInfoScrollVRC6 = this.this$0.getCourierInfoScrollVRC();
        updateConstraints.s(id7, 3, courierInfoScrollVRC6.getId(), 4);
        callCourierContainer5 = this.this$0.getCallCourierContainer();
        updateConstraints.s(callCourierContainer5.getId(), 4, 0, 4);
    }
}
