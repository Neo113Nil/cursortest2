package ru.ozon.uni.atoms.af;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.Atom;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H&¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/af/HasNested;", "", "setNestedConfigs", "", "atomContext", "", "nestedConfigs", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "nestedDecorators", "Lru/ozon/uni/atoms/af/AtomDecorator;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HasNested {
    void setNestedConfigs(String atomContext, @NotNull Map<Atom.ConfCondition, ? extends Map<Atom.ConfCondition, ? extends Atom.AtomConfiguration>> nestedConfigs, Map<Atom.ConfCondition, ? extends AtomDecorator> nestedDecorators);
}
