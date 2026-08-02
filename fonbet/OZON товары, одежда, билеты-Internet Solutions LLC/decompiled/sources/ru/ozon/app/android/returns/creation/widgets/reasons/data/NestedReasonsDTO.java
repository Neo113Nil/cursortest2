package ru.ozon.app.android.returns.creation.widgets.reasons.data;

import G.g;
import Tl.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.reason.InputDTO;
import ru.ozon.app.android.returns.ui.molecules.reason.PickedImagesDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/data/NestedReasonsDTO;", "", "rows", "", "backgroundColor", "", "validationText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getRows", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getValidationText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NestedReasonsDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<Object> rows;
    private final TextDTO validationText;

    public NestedReasonsDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "cell", name = "cell", type = CellDTO.class), @ProtoOneOfSignature(fieldName = "input", name = "input", type = InputDTO.class), @ProtoOneOfSignature(fieldName = "pickedImages", name = "pickedImages", type = PickedImagesDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> rows, @NotNull String backgroundColor, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.rows = rows;
        this.backgroundColor = backgroundColor;
        this.validationText = textDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestedReasonsDTO copy$default(NestedReasonsDTO nestedReasonsDTO, List list, String str, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = nestedReasonsDTO.rows;
        }
        if ((i11 & 2) != 0) {
            str = nestedReasonsDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            textDTO = nestedReasonsDTO.validationText;
        }
        return nestedReasonsDTO.copy(list, str, textDTO);
    }

    @NotNull
    public final List<Object> component1() {
        return this.rows;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getValidationText() {
        return this.validationText;
    }

    @NotNull
    public final NestedReasonsDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "cell", name = "cell", type = CellDTO.class), @ProtoOneOfSignature(fieldName = "input", name = "input", type = InputDTO.class), @ProtoOneOfSignature(fieldName = "pickedImages", name = "pickedImages", type = PickedImagesDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> rows, @NotNull String backgroundColor, TextDTO validationText) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new NestedReasonsDTO(rows, backgroundColor, validationText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NestedReasonsDTO)) {
            return false;
        }
        NestedReasonsDTO nestedReasonsDTO = (NestedReasonsDTO) other;
        return Intrinsics.d(this.rows, nestedReasonsDTO.rows) && Intrinsics.d(this.backgroundColor, nestedReasonsDTO.backgroundColor) && Intrinsics.d(this.validationText, nestedReasonsDTO.validationText);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Object> getRows() {
        return this.rows;
    }

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    public int hashCode() {
        int a11 = g.a(this.rows.hashCode() * 31, 31, this.backgroundColor);
        TextDTO textDTO = this.validationText;
        return a11 + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        List<Object> list = this.rows;
        String str = this.backgroundColor;
        return b.e(C4055a.a("NestedReasonsDTO(rows=", ", backgroundColor=", str, ", validationText=", list), this.validationText, ")");
    }
}
