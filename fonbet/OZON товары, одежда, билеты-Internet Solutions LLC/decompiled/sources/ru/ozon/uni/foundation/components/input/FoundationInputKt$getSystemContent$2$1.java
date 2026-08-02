package ru.ozon.uni.foundation.components.input;

import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.ui.e;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.components.inputCore.DefaultTrailingIconKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FoundationInputKt$getSystemContent$2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ long $systemContentColor;
    final /* synthetic */ e $systemContentModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoundationInputKt$getSystemContent$2$1(e eVar, boolean z11, AbstractC8972b abstractC8972b, long j11, r rVar) {
        super(2);
        this.$systemContentModifier = eVar;
        this.$readOnly = z11;
        this.$icon = abstractC8972b;
        this.$systemContentColor = j11;
        this.$focusRequester = rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        interfaceC3967k.o(-2031902678);
        e eVar = this.$systemContentModifier;
        boolean z11 = this.$readOnly;
        r rVar = this.$focusRequester;
        if (!z11) {
            e.a aVar = e.f40358c0;
            interfaceC3967k.o(-610544080);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            q qVar = (q) C11;
            interfaceC3967k.k();
            interfaceC3967k.o(-610541754);
            boolean n11 = interfaceC3967k.n(rVar);
            Object C12 = interfaceC3967k.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new FoundationInputKt$getSystemContent$2$1$1$2$1(rVar);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            eVar = eVar.l0(i.b(aVar, qVar, null, false, null, null, (Function0) C12, 28));
        }
        interfaceC3967k.k();
        DefaultTrailingIconKt.m3010DefaultTrailingIconN8B1yIo(this.$icon, this.$systemContentColor, eVar, 0.0f, interfaceC3967k, 0, 8);
    }
}
