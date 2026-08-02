package ru.ozon.app.android.composer.compose;

import S0.C3996z;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l20.c;
import l20.d;

/* JADX WARN: Incorrect field signature: TI; */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ComposeWidgetViewHolder$bind$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ d $info;
    final /* synthetic */ c $item;
    final /* synthetic */ ComposeWidgetViewHolder<I> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ll20/d;Lru/ozon/app/android/composer/compose/ComposeWidgetViewHolder<TI;>;TI;)V */
    ComposeWidgetViewHolder$bind$1(d dVar, ComposeWidgetViewHolder composeWidgetViewHolder, c cVar) {
        super(2);
        this.$info = dVar;
        this.this$0 = composeWidgetViewHolder;
        this.$item = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            C3996z.a(Cg0.d.a().c(new Cg0.c(this.$info.c().h())), this.this$0.content(this.$item, this.$info), interfaceC3967k, 8);
        }
    }
}
