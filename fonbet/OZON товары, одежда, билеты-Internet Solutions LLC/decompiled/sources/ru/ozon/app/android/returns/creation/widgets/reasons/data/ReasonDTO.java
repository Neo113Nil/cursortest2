package ru.ozon.app.android.returns.creation.widgets.reasons.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.reason.InputDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/data/ReasonDTO;", "", "row", "nestedReasons", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/NestedReasonsDTO;", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/returns/creation/widgets/reasons/data/NestedReasonsDTO;)V", "getRow", "()Ljava/lang/Object;", "getNestedReasons", "()Lru/ozon/app/android/returns/creation/widgets/reasons/data/NestedReasonsDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReasonDTO {
    public static final int $stable = 8;
    private final NestedReasonsDTO nestedReasons;

    @NotNull
    private final Object row;

    public ReasonDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "cell", name = "cell", type = CellDTO.class), @ProtoOneOfSignature(fieldName = "input", name = "input", type = InputDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object row, NestedReasonsDTO nestedReasonsDTO) {
        Intrinsics.checkNotNullParameter(row, "row");
        this.row = row;
        this.nestedReasons = nestedReasonsDTO;
    }

    public static /* synthetic */ ReasonDTO copy$default(ReasonDTO reasonDTO, Object obj, NestedReasonsDTO nestedReasonsDTO, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = reasonDTO.row;
        }
        if ((i11 & 2) != 0) {
            nestedReasonsDTO = reasonDTO.nestedReasons;
        }
        return reasonDTO.copy(obj, nestedReasonsDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getRow() {
        return this.row;
    }

    /* renamed from: component2, reason: from getter */
    public final NestedReasonsDTO getNestedReasons() {
        return this.nestedReasons;
    }

    @NotNull
    public final ReasonDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "cell", name = "cell", type = CellDTO.class), @ProtoOneOfSignature(fieldName = "input", name = "input", type = InputDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object row, NestedReasonsDTO nestedReasons) {
        Intrinsics.checkNotNullParameter(row, "row");
        return new ReasonDTO(row, nestedReasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReasonDTO)) {
            return false;
        }
        ReasonDTO reasonDTO = (ReasonDTO) other;
        return Intrinsics.d(this.row, reasonDTO.row) && Intrinsics.d(this.nestedReasons, reasonDTO.nestedReasons);
    }

    public final NestedReasonsDTO getNestedReasons() {
        return this.nestedReasons;
    }

    @NotNull
    public final Object getRow() {
        return this.row;
    }

    public int hashCode() {
        int hashCode = this.row.hashCode() * 31;
        NestedReasonsDTO nestedReasonsDTO = this.nestedReasons;
        return hashCode + (nestedReasonsDTO == null ? 0 : nestedReasonsDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "ReasonDTO(row=" + this.row + ", nestedReasons=" + this.nestedReasons + ")";
    }
}
