package ru.ozon.app.android.cart.installment.presentation.compose;

import Kk.C3532b;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import l1.C7790H;
import n1.C8408a;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class InstallmentComposeWidgetKt$cornerWithTopDivider$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $dividerColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentComposeWidgetKt$cornerWithTopDivider$1$1(long j11) {
        super(1);
        this.$dividerColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float v12 = drawWithContent.v1(24);
        float v13 = drawWithContent.v1(1);
        C7786D a11 = C7790H.a();
        a11.a(0.0f, v12);
        a11.r(0.0f, 0.0f, v12, 0.0f);
        a11.b(C7464j.f(drawWithContent.i()) - v12, 0.0f);
        a11.r(C7464j.f(drawWithContent.i()), 0.0f, C7464j.f(drawWithContent.i()), v12);
        a11.b(C7464j.f(drawWithContent.i()), C7464j.d(drawWithContent.i()));
        a11.b(0.0f, C7464j.d(drawWithContent.i()));
        a11.close();
        C8408a.b w02 = drawWithContent.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            w02.f().a(a11);
            drawWithContent.F0();
            w02.a().p();
            w02.k(e11);
            C7786D a12 = C7790H.a();
            float f7 = v13 / 2;
            a12.a(-f7, v12);
            a12.r(0.0f, 0.0f, v12, f7);
            a12.b(C7464j.f(drawWithContent.i()) - v12, f7);
            a12.r(C7464j.f(drawWithContent.i()), 0.0f, C7464j.f(drawWithContent.i()) + f7, v12);
            InterfaceC8412e.X(drawWithContent, a12, this.$dividerColor, new C8416i(v13, 0.0f, 0, 0, null, 30), 52);
        } catch (Throwable th2) {
            C3532b.b(w02, e11);
            throw th2;
        }
    }
}
