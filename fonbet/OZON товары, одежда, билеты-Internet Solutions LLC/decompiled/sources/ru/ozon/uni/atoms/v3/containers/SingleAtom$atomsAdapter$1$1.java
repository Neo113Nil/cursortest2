package ru.ozon.uni.atoms.v3.containers;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "list", "", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class SingleAtom$atomsAdapter$1$1 extends AbstractC7737t implements Function1<List<? extends Atom<AtomDTO, Atom.AtomConfiguration>>, Unit> {
    final /* synthetic */ SingleAtom this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleAtom$atomsAdapter$1$1(SingleAtom singleAtom) {
        super(1);
        this.this$0 = singleAtom;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            this.this$0.clearLayout();
        } else {
            this.this$0.onAdapterChanged((Atom) C7714v.B0(list));
        }
    }
}
