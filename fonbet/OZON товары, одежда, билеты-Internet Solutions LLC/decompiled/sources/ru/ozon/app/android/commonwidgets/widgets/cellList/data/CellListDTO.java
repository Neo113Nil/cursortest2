package ru.ozon.app.android.commonwidgets.widgets.cellList.data;

import G.g;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/cellList/data/CellListDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "list", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getList", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CellListDTO {
    private final String backgroundColor;
    private final TextAtom header;

    @NotNull
    private final List<AtomDTO> list;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public CellListDTO(TextAtom textAtom, @NotNull List<? extends AtomDTO> list, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.header = textAtom;
        this.list = list;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CellListDTO copy$default(CellListDTO cellListDTO, TextAtom textAtom, List list, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = cellListDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = cellListDTO.list;
        }
        if ((i11 & 4) != 0) {
            str = cellListDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            map = cellListDTO.trackingInfo;
        }
        return cellListDTO.copy(textAtom, list, str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final List<AtomDTO> component2() {
        return this.list;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final CellListDTO copy(TextAtom header, @NotNull List<? extends AtomDTO> list, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new CellListDTO(header, list, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellListDTO)) {
            return false;
        }
        CellListDTO cellListDTO = (CellListDTO) other;
        return Intrinsics.d(this.header, cellListDTO.header) && Intrinsics.d(this.list, cellListDTO.list) && Intrinsics.d(this.backgroundColor, cellListDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, cellListDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    @NotNull
    public final List<AtomDTO> getList() {
        return this.list;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.header;
        int b11 = g.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.list);
        String str = this.backgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.header;
        List<AtomDTO> list = this.list;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CellListDTO(header=");
        sb2.append(textAtom);
        sb2.append(", list=");
        sb2.append(list);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ CellListDTO(TextAtom textAtom, List list, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, list, str, (i11 & 8) != 0 ? null : map);
    }
}
