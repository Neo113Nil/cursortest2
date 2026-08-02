package ru.ozon.app.android.regulardraw.ui;

import P9.a;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class CustomBadgeAtomKt$borderOutside$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomBadgeAtomKt$borderOutside$1(long j11, float f7, float f11) {
        super(1);
        this.$color = j11;
        this.$width = f7;
        this.$cornerRadius = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        long j11 = this.$color;
        long a11 = a.a((-drawWithContent.v1(this.$width)) / 2.0f, (-drawWithContent.v1(this.$width)) / 2.0f);
        long a12 = C7465k.a(drawWithContent.v1(this.$width) + C7464j.f(drawWithContent.i()), drawWithContent.v1(this.$width) + C7464j.d(drawWithContent.i()));
        float v12 = drawWithContent.v1(this.$cornerRadius);
        InterfaceC8412e.p0(drawWithContent, j11, a11, a12, C7456b.a(v12, v12), new C8416i(drawWithContent.v1(this.$width), 0.0f, 0, 0, null, 30), 224);
    }
}
