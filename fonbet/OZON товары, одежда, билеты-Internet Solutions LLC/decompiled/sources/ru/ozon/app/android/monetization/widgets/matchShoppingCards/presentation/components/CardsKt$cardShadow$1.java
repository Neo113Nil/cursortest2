package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import S0.InterfaceC3967k;
import Z1.d;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.os.Build;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.K0;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7784B;
import l1.r0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CardsKt$cardShadow$1 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ float $cornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardsKt$cardShadow$1(float f7) {
        super(3);
        this.$cornerRadius = f7;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        e a11;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(726182708);
        float f7 = 12;
        if (Build.VERSION.SDK_INT >= 28) {
            interfaceC3967k.o(2098708947);
            d dVar = (d) interfaceC3967k.m(K0.e());
            interfaceC3967k.o(-1594866094);
            boolean n11 = interfaceC3967k.n(dVar);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(1493172224);
                paint.setMaskFilter(new BlurMaskFilter(dVar.v1(f7), BlurMaskFilter.Blur.OUTER));
                C11 = new C7784B(paint);
                interfaceC3967k.x(C11);
            }
            r0 r0Var = (r0) C11;
            interfaceC3967k.k();
            interfaceC3967k.o(-1594854962);
            boolean F11 = interfaceC3967k.F(r0Var);
            Object C12 = interfaceC3967k.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CardsKt$cardShadow$1$1$1(r0Var);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            a11 = c.b(composed, (Function1) C12);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(2099491728);
            interfaceC3967k.o(-1594841708);
            boolean q11 = interfaceC3967k.q(this.$cornerRadius);
            float f11 = this.$cornerRadius;
            Object C13 = interfaceC3967k.C();
            if (q11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new CardsKt$cardShadow$1$2$1(f7, f11);
                interfaceC3967k.x(C13);
            }
            interfaceC3967k.k();
            a11 = a.a(composed, (Function1) C13);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return a11;
    }
}
