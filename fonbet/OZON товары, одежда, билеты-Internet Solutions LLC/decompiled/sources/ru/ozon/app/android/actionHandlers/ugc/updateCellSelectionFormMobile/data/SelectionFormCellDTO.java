package ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data;

import B0.C2454a;
import Bi.b;
import J0.P;
import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\tJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;", "Landroid/os/Parcelable;", "uploadKey", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "uploadValue", "backgroundColor", "leftPadding", "", "rightPadding", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/lang/String;II)V", "getUploadKey", "()Ljava/lang/String;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getUploadValue", "getBackgroundColor", "getLeftPadding", "()I", "getRightPadding", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectionFormCellDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelectionFormCellDTO> CREATOR = new Creator();
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final int leftPadding;
    private final int rightPadding;

    @NotNull
    private final String uploadKey;
    private final String uploadValue;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectionFormCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final SelectionFormCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectionFormCellDTO(parcel.readString(), (CellDTO) parcel.readParcelable(SelectionFormCellDTO.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionFormCellDTO[] newArray(int i11) {
            return new SelectionFormCellDTO[i11];
        }
    }

    public SelectionFormCellDTO(@NotNull String uploadKey, @NotNull CellDTO cell, String str, String str2, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.uploadKey = uploadKey;
        this.cell = cell;
        this.uploadValue = str;
        this.backgroundColor = str2;
        this.leftPadding = i11;
        this.rightPadding = i12;
    }

    public static /* synthetic */ SelectionFormCellDTO copy$default(SelectionFormCellDTO selectionFormCellDTO, String str, CellDTO cellDTO, String str2, String str3, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = selectionFormCellDTO.uploadKey;
        }
        if ((i13 & 2) != 0) {
            cellDTO = selectionFormCellDTO.cell;
        }
        if ((i13 & 4) != 0) {
            str2 = selectionFormCellDTO.uploadValue;
        }
        if ((i13 & 8) != 0) {
            str3 = selectionFormCellDTO.backgroundColor;
        }
        if ((i13 & 16) != 0) {
            i11 = selectionFormCellDTO.leftPadding;
        }
        if ((i13 & 32) != 0) {
            i12 = selectionFormCellDTO.rightPadding;
        }
        int i14 = i11;
        int i15 = i12;
        return selectionFormCellDTO.copy(str, cellDTO, str2, str3, i14, i15);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUploadValue() {
        return this.uploadValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    public final SelectionFormCellDTO copy(@NotNull String uploadKey, @NotNull CellDTO cell, String uploadValue, String backgroundColor, int leftPadding, int rightPadding) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new SelectionFormCellDTO(uploadKey, cell, uploadValue, backgroundColor, leftPadding, rightPadding);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionFormCellDTO)) {
            return false;
        }
        SelectionFormCellDTO selectionFormCellDTO = (SelectionFormCellDTO) other;
        return Intrinsics.d(this.uploadKey, selectionFormCellDTO.uploadKey) && Intrinsics.d(this.cell, selectionFormCellDTO.cell) && Intrinsics.d(this.uploadValue, selectionFormCellDTO.uploadValue) && Intrinsics.d(this.backgroundColor, selectionFormCellDTO.backgroundColor) && this.leftPadding == selectionFormCellDTO.leftPadding && this.rightPadding == selectionFormCellDTO.rightPadding;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    public final String getUploadValue() {
        return this.uploadValue;
    }

    public int hashCode() {
        int c11 = b.c(this.cell, this.uploadKey.hashCode() * 31, 31);
        String str = this.uploadValue;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return Integer.hashCode(this.rightPadding) + C2454a.a(this.leftPadding, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.uploadKey;
        CellDTO cellDTO = this.cell;
        String str2 = this.uploadValue;
        String str3 = this.backgroundColor;
        int i11 = this.leftPadding;
        int i12 = this.rightPadding;
        StringBuilder sb2 = new StringBuilder("SelectionFormCellDTO(uploadKey=");
        sb2.append(str);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", uploadValue=");
        a.h(sb2, str2, ", backgroundColor=", str3, ", leftPadding=");
        return P.a(i11, i12, ", rightPadding=", ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.uploadKey);
        dest.writeParcelable(this.cell, flags);
        dest.writeString(this.uploadValue);
        dest.writeString(this.backgroundColor);
        dest.writeInt(this.leftPadding);
        dest.writeInt(this.rightPadding);
    }

    public /* synthetic */ SelectionFormCellDTO(String str, CellDTO cellDTO, String str2, String str3, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cellDTO, str2, str3, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
