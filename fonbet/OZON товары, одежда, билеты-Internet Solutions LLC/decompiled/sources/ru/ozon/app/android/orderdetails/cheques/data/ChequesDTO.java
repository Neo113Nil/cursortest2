package ru.ozon.app.android.orderdetails.cheques.data;

import An.C2439a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/cheques/data/ChequesDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "cheques", "", "Lru/ozon/app/android/orderdetails/cheques/data/ChequesItemDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getCheques", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ChequesDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ChequesItemDTO> cheques;

    @NotNull
    private final String title;

    public ChequesDTO(@NotNull String title, @NotNull List<ChequesItemDTO> cheques) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cheques, "cheques");
        this.title = title;
        this.cheques = cheques;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChequesDTO copy$default(ChequesDTO chequesDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chequesDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = chequesDTO.cheques;
        }
        return chequesDTO.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<ChequesItemDTO> component2() {
        return this.cheques;
    }

    @NotNull
    public final ChequesDTO copy(@NotNull String title, @NotNull List<ChequesItemDTO> cheques) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cheques, "cheques");
        return new ChequesDTO(title, cheques);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChequesDTO)) {
            return false;
        }
        ChequesDTO chequesDTO = (ChequesDTO) other;
        return Intrinsics.d(this.title, chequesDTO.title) && Intrinsics.d(this.cheques, chequesDTO.cheques);
    }

    @NotNull
    public final List<ChequesItemDTO> getCheques() {
        return this.cheques;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cheques.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("ChequesDTO(title=", this.title, ", cheques=", ")", this.cheques);
    }
}
