package ru.ozon.app.android.pdp.view.shared;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;

/* JADX WARN: Incorrect field signature: TT; */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TabEmbeddedComposableKt$TabEmbeddedComposable$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6511n<T, InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ TabEmbeddedViewObject $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;Lfd/n<-TT;-LS0/k;-Ljava/lang/Integer;Lkotlin/Unit;>;I)V */
    TabEmbeddedComposableKt$TabEmbeddedComposable$1(TabEmbeddedViewObject tabEmbeddedViewObject, InterfaceC6511n interfaceC6511n, int i11) {
        super(2);
        this.$item = tabEmbeddedViewObject;
        this.$content = interfaceC6511n;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TabEmbeddedComposableKt.TabEmbeddedComposable(this.$item, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
