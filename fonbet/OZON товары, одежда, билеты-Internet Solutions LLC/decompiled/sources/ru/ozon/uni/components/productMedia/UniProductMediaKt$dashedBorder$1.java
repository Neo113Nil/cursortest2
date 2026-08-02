package ru.ozon.uni.components.productMedia;

import P9.a;
import android.graphics.DashPathEffect;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7787E;
import n0.C8391l;
import n1.C8416i;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class UniProductMediaKt$dashedBorder$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ C8391l $border;
    final /* synthetic */ float[] $intervals;
    final /* synthetic */ float $radius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniProductMediaKt$dashedBorder$1(C8391l c8391l, float f7, float[] fArr) {
        super(1);
        this.$border = c8391l;
        this.$radius = f7;
        this.$intervals = fArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float v12 = drawBehind.v1(this.$border.c());
        float f7 = v12 / 2;
        InterfaceC8412e.I0(drawBehind, this.$border.b(), a.a(f7, f7), C7465k.a(C7464j.f(drawBehind.i()) - v12, C7464j.d(drawBehind.i()) - v12), C7456b.a(drawBehind.v1(this.$radius), drawBehind.v1(this.$radius)), 0.0f, new C8416i(v12, 0.0f, 0, 0, new C7787E(new DashPathEffect(this.$intervals, 0.0f)), 14), 208);
    }
}
