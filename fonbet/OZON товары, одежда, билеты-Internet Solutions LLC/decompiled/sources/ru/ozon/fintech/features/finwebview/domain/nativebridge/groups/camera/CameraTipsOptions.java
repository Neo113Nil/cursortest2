package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera;

import Bi.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.TextItemDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTipsOptions;", "", "textAtoms", "", "Lru/ozon/fintech/features/cbottombase/models/widgets/v2/TextItemDTO;", "type", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTextAtoms", "()Ljava/util/List;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CameraTipsOptions {

    @NotNull
    private final List<TextItemDTO> textAtoms;

    @NotNull
    private final String type;

    public CameraTipsOptions(@i(name = "text_atom") @NotNull List<TextItemDTO> textAtoms, @i(name = "type") @NotNull String type) {
        Intrinsics.checkNotNullParameter(textAtoms, "textAtoms");
        Intrinsics.checkNotNullParameter(type, "type");
        this.textAtoms = textAtoms;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CameraTipsOptions copy$default(CameraTipsOptions cameraTipsOptions, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cameraTipsOptions.textAtoms;
        }
        if ((i11 & 2) != 0) {
            str = cameraTipsOptions.type;
        }
        return cameraTipsOptions.copy(list, str);
    }

    @NotNull
    public final List<TextItemDTO> component1() {
        return this.textAtoms;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final CameraTipsOptions copy(@i(name = "text_atom") @NotNull List<TextItemDTO> textAtoms, @i(name = "type") @NotNull String type) {
        Intrinsics.checkNotNullParameter(textAtoms, "textAtoms");
        Intrinsics.checkNotNullParameter(type, "type");
        return new CameraTipsOptions(textAtoms, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraTipsOptions)) {
            return false;
        }
        CameraTipsOptions cameraTipsOptions = (CameraTipsOptions) other;
        return Intrinsics.d(this.textAtoms, cameraTipsOptions.textAtoms) && Intrinsics.d(this.type, cameraTipsOptions.type);
    }

    @NotNull
    public final List<TextItemDTO> getTextAtoms() {
        return this.textAtoms;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.textAtoms.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.e("CameraTipsOptions(textAtoms=", ", type=", this.type, ")", this.textAtoms);
    }
}
