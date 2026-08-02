package ru.ozon.app.android.atoms.rv.atom;

import hk0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0002\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R'\u0010\u0005\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0002\u0012\u0006\b\u0000\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "Lhk0/d;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "atom", "atomConfiguration", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "paddingConfiguration", "<init>", "(Lru/ozon/uni/atoms/af/Atom;Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;)V", "item", "", "bind", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "recycle", "()V", "", "toString", "()Ljava/lang/String;", "Lru/ozon/uni/atoms/af/Atom;", "getAtom", "()Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "getPaddingConfiguration", "()Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AtomItemViewHolder extends d<AtomDTO> {

    @NotNull
    private final Atom<? super AtomDTO, ? super Atom.AtomConfiguration> atom;
    private final Atom.DefaultConfigurator paddingConfiguration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomItemViewHolder(@NotNull Atom<? super AtomDTO, ? super Atom.AtomConfiguration> atom, Atom.AtomConfiguration atomConfiguration, Atom.DefaultConfigurator defaultConfigurator) {
        super(atom.getContainerView());
        Intrinsics.checkNotNullParameter(atom, "atom");
        this.atom = atom;
        this.paddingConfiguration = defaultConfigurator;
        if (atomConfiguration != null) {
            atom.build(null, atomConfiguration, null, null);
        }
    }

    @NotNull
    public final Atom<? super AtomDTO, ? super Atom.AtomConfiguration> getAtom() {
        return this.atom;
    }

    public final Atom.DefaultConfigurator getPaddingConfiguration() {
        return this.paddingConfiguration;
    }

    @Override // hk0.d
    public void recycle() {
        super.recycle();
        this.atom.setOnAtomAction(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C
    @NotNull
    public String toString() {
        AtomDTO data = this.atom.getData();
        return "AtomItemViewHolder(atom=" + (data != null ? data.getClass().getSimpleName() : "") + ", configuration=" + this.paddingConfiguration + ")";
    }

    @Override // hk0.d
    public void bind(@NotNull AtomDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((AtomItemViewHolder) item);
        this.atom.bind(item);
    }
}
