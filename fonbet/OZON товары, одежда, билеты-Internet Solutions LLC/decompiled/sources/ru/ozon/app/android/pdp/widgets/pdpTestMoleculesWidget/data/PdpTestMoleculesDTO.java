package ru.ozon.app.android.pdp.widgets.pdpTestMoleculesWidget.data;

import C.C2702w;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.saleBadge.data.SaleBadgeDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/data/PdpTestMoleculesDTO;", "", "molecule", "<init>", "(Ljava/lang/Object;)V", "getMolecule", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PdpTestMoleculesDTO {
    public static final int $stable = 8;

    @NotNull
    private final Object molecule;

    public PdpTestMoleculesDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "timerMolecule", type = TimerDTO.class), @ProtoOneOfSignature(name = "saleBadge", type = SaleBadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object molecule) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        this.molecule = molecule;
    }

    public static /* synthetic */ PdpTestMoleculesDTO copy$default(PdpTestMoleculesDTO pdpTestMoleculesDTO, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = pdpTestMoleculesDTO.molecule;
        }
        return pdpTestMoleculesDTO.copy(obj);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getMolecule() {
        return this.molecule;
    }

    @NotNull
    public final PdpTestMoleculesDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "timerMolecule", type = TimerDTO.class), @ProtoOneOfSignature(name = "saleBadge", type = SaleBadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object molecule) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        return new PdpTestMoleculesDTO(molecule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PdpTestMoleculesDTO) && Intrinsics.d(this.molecule, ((PdpTestMoleculesDTO) other).molecule);
    }

    @NotNull
    public final Object getMolecule() {
        return this.molecule;
    }

    public int hashCode() {
        return this.molecule.hashCode();
    }

    @NotNull
    public String toString() {
        return C2702w.c(this.molecule, "PdpTestMoleculesDTO(molecule=", ")");
    }
}
