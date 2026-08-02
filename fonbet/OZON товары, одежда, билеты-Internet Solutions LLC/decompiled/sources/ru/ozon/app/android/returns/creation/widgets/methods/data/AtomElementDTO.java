package ru.ozon.app.android.returns.creation.widgets.methods.data;

import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/AtomElementDTO;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/ElementDTO;", "paddings", "Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "backgroundColor", "", "atom", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomDTO;)V", "getPaddings", "()Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "setPaddings", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AtomElementDTO implements ElementDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomDTO atom;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private PaddingsDTO paddings;

    public AtomElementDTO(@NotNull PaddingsDTO paddings, @NotNull String backgroundColor, @NotNull AtomDTO atom) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(atom, "atom");
        this.paddings = paddings;
        this.backgroundColor = backgroundColor;
        this.atom = atom;
    }

    public static /* synthetic */ AtomElementDTO copy$default(AtomElementDTO atomElementDTO, PaddingsDTO paddingsDTO, String str, AtomDTO atomDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddingsDTO = atomElementDTO.paddings;
        }
        if ((i11 & 2) != 0) {
            str = atomElementDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            atomDTO = atomElementDTO.atom;
        }
        return atomElementDTO.copy(paddingsDTO, str, atomDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomDTO getAtom() {
        return this.atom;
    }

    @NotNull
    public final AtomElementDTO copy(@NotNull PaddingsDTO paddings, @NotNull String backgroundColor, @NotNull AtomDTO atom) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(atom, "atom");
        return new AtomElementDTO(paddings, backgroundColor, atom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtomElementDTO)) {
            return false;
        }
        AtomElementDTO atomElementDTO = (AtomElementDTO) other;
        return Intrinsics.d(this.paddings, atomElementDTO.paddings) && Intrinsics.d(this.backgroundColor, atomElementDTO.backgroundColor) && Intrinsics.d(this.atom, atomElementDTO.atom);
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    @NotNull
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.methods.data.ElementDTO
    @NotNull
    public PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        return this.atom.hashCode() + g.a(this.paddings.hashCode() * 31, 31, this.backgroundColor);
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.methods.data.ElementDTO
    public void setPaddings(@NotNull PaddingsDTO paddingsDTO) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<set-?>");
        this.paddings = paddingsDTO;
    }

    @NotNull
    public String toString() {
        return "AtomElementDTO(paddings=" + this.paddings + ", backgroundColor=" + this.backgroundColor + ", atom=" + this.atom + ")";
    }
}
