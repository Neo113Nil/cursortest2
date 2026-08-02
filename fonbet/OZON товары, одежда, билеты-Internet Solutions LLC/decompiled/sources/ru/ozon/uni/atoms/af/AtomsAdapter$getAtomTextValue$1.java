package ru.ozon.uni.atoms.af;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "invoke", "(Lru/ozon/uni/atoms/af/Atom;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AtomsAdapter$getAtomTextValue$1 extends AbstractC7737t implements Function1<Atom<AtomDTO, Atom.AtomConfiguration>, Boolean> {
    final /* synthetic */ Class<? extends AtomDTO> $type;
    final /* synthetic */ AtomsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AtomsAdapter$getAtomTextValue$1(Class<? extends AtomDTO> cls, AtomsAdapter atomsAdapter) {
        super(1);
        this.$type = cls;
        this.this$0 = atomsAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Atom<AtomDTO, Atom.AtomConfiguration> it) {
        Class viewType;
        Intrinsics.checkNotNullParameter(it, "it");
        Class<? extends AtomDTO> cls = this.$type;
        viewType = this.this$0.getViewType(it.getData());
        return Boolean.valueOf(Intrinsics.d(cls, viewType));
    }
}
