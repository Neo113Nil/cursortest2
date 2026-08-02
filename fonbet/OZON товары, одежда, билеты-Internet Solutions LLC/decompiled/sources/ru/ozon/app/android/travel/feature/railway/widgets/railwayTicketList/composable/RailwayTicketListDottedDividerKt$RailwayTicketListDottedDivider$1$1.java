package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import P9.a;
import android.graphics.DashPathEffect;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7787E;
import n1.InterfaceC8412e;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class RailwayTicketListDottedDividerKt$RailwayTicketListDottedDivider$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RailwayTicketListDottedDividerKt$RailwayTicketListDottedDivider$1$1(long j11) {
        super(1);
        this.$color = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float pxF = UiExtKt.toPxF(4);
        float d11 = C7464j.d(Canvas.i()) / 2;
        Canvas.U(this.$color, a.a(0.0f, d11), a.a(C7464j.f(Canvas.i()), d11), Canvas.v1(1), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : new C7787E(new DashPathEffect(new float[]{pxF, pxF}, 0.0f)));
    }
}
