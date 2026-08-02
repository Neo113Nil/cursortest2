package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/AtomComponentDTO;", "", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AtomComponentDTO {
    public static final int $stable = AtomDTO.$stable;

    @NotNull
    private final AtomDTO atom;

    public AtomComponentDTO(@NotNull AtomDTO atom) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        this.atom = atom;
    }

    public static /* synthetic */ AtomComponentDTO copy$default(AtomComponentDTO atomComponentDTO, AtomDTO atomDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomDTO = atomComponentDTO.atom;
        }
        return atomComponentDTO.copy(atomDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomDTO getAtom() {
        return this.atom;
    }

    @NotNull
    public final AtomComponentDTO copy(@NotNull AtomDTO atom) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        return new AtomComponentDTO(atom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AtomComponentDTO) && Intrinsics.d(this.atom, ((AtomComponentDTO) other).atom);
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    public int hashCode() {
        return this.atom.hashCode();
    }

    @NotNull
    public String toString() {
        return "AtomComponentDTO(atom=" + this.atom + ")";
    }
}
