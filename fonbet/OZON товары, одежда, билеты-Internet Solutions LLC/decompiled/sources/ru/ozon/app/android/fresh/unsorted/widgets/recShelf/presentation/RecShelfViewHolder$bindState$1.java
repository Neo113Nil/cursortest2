package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import l10.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class RecShelfViewHolder$bindState$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ RecShelfViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecShelfViewHolder$bindState$1(RecShelfViewHolder recShelfViewHolder) {
        super(0);
        this.this$0 = recShelfViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        i iVar;
        InterfaceC7851b M11;
        RecShelfVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            iVar = this.this$0.screenContainer;
            if (iVar == null || (M11 = iVar.M()) == null) {
                return;
            }
            M11.m(id2);
        }
    }
}
