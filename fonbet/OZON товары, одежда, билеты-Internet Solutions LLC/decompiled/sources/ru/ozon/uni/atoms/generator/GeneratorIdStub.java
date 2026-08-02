package ru.ozon.uni.atoms.generator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/atoms/generator/GeneratorIdStub;", "Lru/ozon/uni/atoms/generator/GeneratorId;", "<init>", "()V", "findParent", "", "generateId", "", "holder", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "position", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GeneratorIdStub implements GeneratorId {
    @Override // ru.ozon.uni.atoms.generator.GeneratorId
    public void findParent() {
    }

    @Override // ru.ozon.uni.atoms.generator.GeneratorId
    @NotNull
    public String generateId(@NotNull Atom<AtomDTO, Atom.AtomConfiguration> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return "";
    }
}
