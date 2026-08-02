package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.item;

import B0.C2454a;
import Ih.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data.ItemDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jj\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "Ll20/c;", "", "id", "", "groupId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "addPhotoButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "uploadImageAction", "errorDescription", "maxCount", "", "showError", "<init>", "(JILru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IZ)V", "copy", "(JILru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IZ)Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/item/ItemVI;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getGroupId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "getAddPhotoButton", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO$AddPhotoButtonDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getErrorDescription", "getMaxCount", "Z", "getShowError", "()Z", "getScrollWidgetKey", "()Ljava/lang/Integer;", "scrollWidgetKey", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ItemVI implements c {
    public static final int $stable = IconDTO.$stable | CellDTO.$stable;

    @NotNull
    private final ItemDTO.AddPhotoButtonDTO addPhotoButton;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final TextDTO errorDescription;
    private final int groupId;
    private final long id;
    private final int maxCount;
    private final boolean showError;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final AtomActionDTO uploadImageAction;

    public ItemVI(long j11, int i11, @NotNull CellDTO cell, @NotNull TextDTO subtitle, @NotNull ItemDTO.AddPhotoButtonDTO addPhotoButton, @NotNull AtomActionDTO uploadImageAction, @NotNull TextDTO errorDescription, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        this.id = j11;
        this.groupId = i11;
        this.cell = cell;
        this.subtitle = subtitle;
        this.addPhotoButton = addPhotoButton;
        this.uploadImageAction = uploadImageAction;
        this.errorDescription = errorDescription;
        this.maxCount = i12;
        this.showError = z11;
    }

    public static /* synthetic */ ItemVI copy$default(ItemVI itemVI, long j11, int i11, CellDTO cellDTO, TextDTO textDTO, ItemDTO.AddPhotoButtonDTO addPhotoButtonDTO, AtomActionDTO atomActionDTO, TextDTO textDTO2, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = itemVI.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            i11 = itemVI.groupId;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            cellDTO = itemVI.cell;
        }
        return itemVI.copy(j12, i14, cellDTO, (i13 & 8) != 0 ? itemVI.subtitle : textDTO, (i13 & 16) != 0 ? itemVI.addPhotoButton : addPhotoButtonDTO, (i13 & 32) != 0 ? itemVI.uploadImageAction : atomActionDTO, (i13 & 64) != 0 ? itemVI.errorDescription : textDTO2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? itemVI.maxCount : i12, (i13 & 256) != 0 ? itemVI.showError : z11);
    }

    @NotNull
    public final ItemVI copy(long id2, int groupId, @NotNull CellDTO cell, @NotNull TextDTO subtitle, @NotNull ItemDTO.AddPhotoButtonDTO addPhotoButton, @NotNull AtomActionDTO uploadImageAction, @NotNull TextDTO errorDescription, int maxCount, boolean showError) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        return new ItemVI(id2, groupId, cell, subtitle, addPhotoButton, uploadImageAction, errorDescription, maxCount, showError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemVI)) {
            return false;
        }
        ItemVI itemVI = (ItemVI) other;
        return this.id == itemVI.id && this.groupId == itemVI.groupId && Intrinsics.d(this.cell, itemVI.cell) && Intrinsics.d(this.subtitle, itemVI.subtitle) && Intrinsics.d(this.addPhotoButton, itemVI.addPhotoButton) && Intrinsics.d(this.uploadImageAction, itemVI.uploadImageAction) && Intrinsics.d(this.errorDescription, itemVI.errorDescription) && this.maxCount == itemVI.maxCount && this.showError == itemVI.showError;
    }

    @NotNull
    public final ItemDTO.AddPhotoButtonDTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final TextDTO getErrorDescription() {
        return this.errorDescription;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.groupId);
    }

    public final boolean getShowError() {
        return this.showError;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.showError) + C2454a.a(this.maxCount, b.a(this.errorDescription, a.b(this.uploadImageAction, (this.addPhotoButton.hashCode() + b.a(this.subtitle, Bi.b.c(this.cell, C2454a.a(this.groupId, Long.hashCode(this.id) * 31, 31), 31), 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.groupId;
        CellDTO cellDTO = this.cell;
        TextDTO textDTO = this.subtitle;
        ItemDTO.AddPhotoButtonDTO addPhotoButtonDTO = this.addPhotoButton;
        AtomActionDTO atomActionDTO = this.uploadImageAction;
        TextDTO textDTO2 = this.errorDescription;
        int i12 = this.maxCount;
        boolean z11 = this.showError;
        StringBuilder b11 = Ql.c.b(j11, "ItemVI(id=", i11, ", groupId=");
        b11.append(", cell=");
        b11.append(cellDTO);
        b11.append(", subtitle=");
        b11.append(textDTO);
        b11.append(", addPhotoButton=");
        b11.append(addPhotoButtonDTO);
        b11.append(", uploadImageAction=");
        b11.append(atomActionDTO);
        b11.append(", errorDescription=");
        b11.append(textDTO2);
        b11.append(", maxCount=");
        b11.append(i12);
        return Bi.b.f(b11, ", showError=", z11, ")");
    }

    public /* synthetic */ ItemVI(long j11, int i11, CellDTO cellDTO, TextDTO textDTO, ItemDTO.AddPhotoButtonDTO addPhotoButtonDTO, AtomActionDTO atomActionDTO, TextDTO textDTO2, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, cellDTO, textDTO, addPhotoButtonDTO, atomActionDTO, textDTO2, i12, (i13 & 256) != 0 ? false : z11);
    }
}
