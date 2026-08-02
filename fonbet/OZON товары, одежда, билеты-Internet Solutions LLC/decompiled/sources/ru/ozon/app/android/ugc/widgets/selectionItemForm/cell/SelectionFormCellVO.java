package ru.ozon.app.android.ugc.widgets.selectionItemForm.cell;

import Ak.C2436a;
import B0.C2454a;
import Bi.b;
import D3.h;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data.SelectionFormCellDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 (2\u00060\u0001j\u0002`\u0002:\u0001(BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b#\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b$\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u0015R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b'\u0010\u0015¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "uploadValue", "backgroundColor", "", "leftPadding", "rightPadding", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/lang/String;II)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/lang/String;II)Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getUploadValue", "getBackgroundColor", "I", "getLeftPadding", "getRightPadding", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionFormCellVO implements c {
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final long id;
    private final int leftPadding;
    private final int rightPadding;

    @NotNull
    private final String uploadKey;
    private final String uploadValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CellDTO.$stable;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellVO$Companion;", "", "<init>", "()V", "createFromSelectionFormCellDTO", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/cell/SelectionFormCellVO;", "voId", "", "item", "Lru/ozon/app/android/actionHandlers/ugc/updateCellSelectionFormMobile/data/SelectionFormCellDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectionFormCellVO createFromSelectionFormCellDTO(long voId, @NotNull SelectionFormCellDTO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new SelectionFormCellVO(voId, item.getUploadKey(), item.getCell(), item.getUploadValue(), item.getBackgroundColor(), item.getLeftPadding(), item.getRightPadding());
        }

        private Companion() {
        }
    }

    public SelectionFormCellVO(long j11, @NotNull String uploadKey, @NotNull CellDTO cell, String str, String str2, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.cell = cell;
        this.uploadValue = str;
        this.backgroundColor = str2;
        this.leftPadding = i11;
        this.rightPadding = i12;
    }

    public static /* synthetic */ SelectionFormCellVO copy$default(SelectionFormCellVO selectionFormCellVO, long j11, String str, CellDTO cellDTO, String str2, String str3, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = selectionFormCellVO.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            str = selectionFormCellVO.uploadKey;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            cellDTO = selectionFormCellVO.cell;
        }
        CellDTO cellDTO2 = cellDTO;
        if ((i13 & 8) != 0) {
            str2 = selectionFormCellVO.uploadValue;
        }
        String str5 = str2;
        if ((i13 & 16) != 0) {
            str3 = selectionFormCellVO.backgroundColor;
        }
        return selectionFormCellVO.copy(j12, str4, cellDTO2, str5, str3, (i13 & 32) != 0 ? selectionFormCellVO.leftPadding : i11, (i13 & 64) != 0 ? selectionFormCellVO.rightPadding : i12);
    }

    @NotNull
    public final SelectionFormCellVO copy(long id2, @NotNull String uploadKey, @NotNull CellDTO cell, String uploadValue, String backgroundColor, int leftPadding, int rightPadding) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new SelectionFormCellVO(id2, uploadKey, cell, uploadValue, backgroundColor, leftPadding, rightPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionFormCellVO)) {
            return false;
        }
        SelectionFormCellVO selectionFormCellVO = (SelectionFormCellVO) other;
        return this.id == selectionFormCellVO.id && Intrinsics.d(this.uploadKey, selectionFormCellVO.uploadKey) && Intrinsics.d(this.cell, selectionFormCellVO.cell) && Intrinsics.d(this.uploadValue, selectionFormCellVO.uploadValue) && Intrinsics.d(this.backgroundColor, selectionFormCellVO.backgroundColor) && this.leftPadding == selectionFormCellVO.leftPadding && this.rightPadding == selectionFormCellVO.rightPadding;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    public final String getUploadValue() {
        return this.uploadValue;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.cell, g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey), 31);
        String str = this.uploadValue;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return Integer.hashCode(this.rightPadding) + C2454a.a(this.leftPadding, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        CellDTO cellDTO = this.cell;
        String str2 = this.uploadValue;
        String str3 = this.backgroundColor;
        int i11 = this.leftPadding;
        int i12 = this.rightPadding;
        StringBuilder c11 = C2436a.c(j11, "SelectionFormCellVO(id=", ", uploadKey=", str);
        c11.append(", cell=");
        c11.append(cellDTO);
        c11.append(", uploadValue=");
        c11.append(str2);
        c11.append(", backgroundColor=");
        c11.append(str3);
        c11.append(", leftPadding=");
        c11.append(i11);
        return h.b(c11, ", rightPadding=", i12, ")");
    }
}
