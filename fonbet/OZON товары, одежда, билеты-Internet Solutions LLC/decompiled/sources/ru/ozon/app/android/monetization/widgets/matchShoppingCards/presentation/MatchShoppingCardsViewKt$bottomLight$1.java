package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Fl0.b;
import Kk.C3532b;
import P9.a;
import k1.C7459e;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import n1.C8408a;
import n1.C8415h;
import n1.InterfaceC8410c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$bottomLight$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ Function0<C7807Z> $color;
    final /* synthetic */ Function0<Float> $fraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewKt$bottomLight$1(Function0<Float> function0, Function0<C7807Z> function02) {
        super(1);
        this.$fraction = function0;
        this.$color = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        long j11;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        long a11 = C7465k.a(drawWithContent.v1(558), drawWithContent.v1(346));
        if (a11 == 9205357640488583168L) {
            b.d();
            throw null;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (a11 >> 32)) * 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (a11 & 4294967295L)) * 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        float f7 = 2;
        long a12 = a.a(C7464j.f(drawWithContent.i()) / f7, (((C7464j.d(floatToRawIntBits) / f7) + C7464j.d(drawWithContent.i())) - drawWithContent.v1(64)) - (this.$fraction.invoke().floatValue() * drawWithContent.v1(100)));
        Function0<C7807Z> function0 = this.$color;
        Function0<Float> function02 = this.$fraction;
        C8408a.b w02 = drawWithContent.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            w02.f().e(C7464j.f(floatToRawIntBits) / C7464j.e(floatToRawIntBits), C7464j.d(floatToRawIntBits) / C7464j.e(floatToRawIntBits), a12);
            AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
            Pair pair = new Pair(Float.valueOf(0.0f), function0.invoke());
            Float valueOf = Float.valueOf(1.0f);
            j11 = C7807Z.f72258l;
            drawWithContent.t1(AbstractC7799Q.a.f(aVar, new Pair[]{pair, new Pair(valueOf, C7807Z.m(j11))}, a12, C7464j.e(floatToRawIntBits) / f7), a.a(C7459e.g(a12) - (C7464j.f(floatToRawIntBits) / f7), C7459e.h(a12) - (C7464j.d(floatToRawIntBits) / f7)), floatToRawIntBits, function02.invoke().floatValue(), C8415h.f76287a);
            w02.a().p();
            w02.k(e11);
            drawWithContent.F0();
        } catch (Throwable th2) {
            C3532b.b(w02, e11);
            throw th2;
        }
    }
}
