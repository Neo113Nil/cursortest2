package ru.ozon.app.android.ugc.widgets.selectionItemForm.cellSelector;

import Ak.C2436a;
import Bi.b;
import G.g;
import Kk.C3532b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\\\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b&\u0010%R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/cellSelector/SelectionFormCellSelectorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", "", "isSelected", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "normal", "selected", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLjava/lang/String;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;)V", "copy", "(JLjava/lang/String;ZLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/cellSelector/SelectionFormCellSelectorVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "Z", "()Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getNormal", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSelected", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionFormCellSelectorVO implements c {
    private final long id;
    private final boolean isSelected;

    @NotNull
    private final CellDTO normal;
    private final CellDTO selected;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String uploadKey;

    public SelectionFormCellSelectorVO(long j11, @NotNull String uploadKey, boolean z11, @NotNull CellDTO normal, CellDTO cellDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.isSelected = z11;
        this.normal = normal;
        this.selected = cellDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SelectionFormCellSelectorVO copy$default(SelectionFormCellSelectorVO selectionFormCellSelectorVO, long j11, String str, boolean z11, CellDTO cellDTO, CellDTO cellDTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = selectionFormCellSelectorVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = selectionFormCellSelectorVO.uploadKey;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = selectionFormCellSelectorVO.isSelected;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            cellDTO = selectionFormCellSelectorVO.normal;
        }
        CellDTO cellDTO3 = cellDTO;
        if ((i11 & 16) != 0) {
            cellDTO2 = selectionFormCellSelectorVO.selected;
        }
        CellDTO cellDTO4 = cellDTO2;
        if ((i11 & 32) != 0) {
            map = selectionFormCellSelectorVO.trackingInfo;
        }
        return selectionFormCellSelectorVO.copy(j12, str2, z12, cellDTO3, cellDTO4, map);
    }

    @NotNull
    public final SelectionFormCellSelectorVO copy(long id2, @NotNull String uploadKey, boolean isSelected, @NotNull CellDTO normal, CellDTO selected, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(normal, "normal");
        return new SelectionFormCellSelectorVO(id2, uploadKey, isSelected, normal, selected, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionFormCellSelectorVO)) {
            return false;
        }
        SelectionFormCellSelectorVO selectionFormCellSelectorVO = (SelectionFormCellSelectorVO) other;
        return this.id == selectionFormCellSelectorVO.id && Intrinsics.d(this.uploadKey, selectionFormCellSelectorVO.uploadKey) && this.isSelected == selectionFormCellSelectorVO.isSelected && Intrinsics.d(this.normal, selectionFormCellSelectorVO.normal) && Intrinsics.d(this.selected, selectionFormCellSelectorVO.selected) && Intrinsics.d(this.trackingInfo, selectionFormCellSelectorVO.trackingInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CellDTO getNormal() {
        return this.normal;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CellDTO getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.normal, C3532b.a(g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey), 31, this.isSelected), 31);
        CellDTO cellDTO = this.selected;
        int hashCode = (c11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        boolean z11 = this.isSelected;
        CellDTO cellDTO = this.normal;
        CellDTO cellDTO2 = this.selected;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = C2436a.c(j11, "SelectionFormCellSelectorVO(id=", ", uploadKey=", str);
        c11.append(", isSelected=");
        c11.append(z11);
        c11.append(", normal=");
        c11.append(cellDTO);
        c11.append(", selected=");
        c11.append(cellDTO2);
        c11.append(", trackingInfo=");
        c11.append(map);
        c11.append(")");
        return c11.toString();
    }
}
