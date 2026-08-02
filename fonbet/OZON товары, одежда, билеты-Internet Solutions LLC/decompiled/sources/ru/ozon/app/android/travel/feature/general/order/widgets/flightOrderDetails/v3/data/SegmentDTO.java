package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.data;

import B90.C2618u;
import D3.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/SegmentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "segmentParts", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/SegmentPartDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getSegmentParts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SegmentDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SegmentPartDTO> segmentParts;
    private final TextDTO subtitle;
    private final TextDTO title;

    public SegmentDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull List<SegmentPartDTO> segmentParts) {
        Intrinsics.checkNotNullParameter(segmentParts, "segmentParts");
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.segmentParts = segmentParts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentDTO copy$default(SegmentDTO segmentDTO, TextDTO textDTO, TextDTO textDTO2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = segmentDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = segmentDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = segmentDTO.segmentParts;
        }
        return segmentDTO.copy(textDTO, textDTO2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<SegmentPartDTO> component3() {
        return this.segmentParts;
    }

    @NotNull
    public final SegmentDTO copy(TextDTO title, TextDTO subtitle, @NotNull List<SegmentPartDTO> segmentParts) {
        Intrinsics.checkNotNullParameter(segmentParts, "segmentParts");
        return new SegmentDTO(title, subtitle, segmentParts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentDTO)) {
            return false;
        }
        SegmentDTO segmentDTO = (SegmentDTO) other;
        return Intrinsics.d(this.title, segmentDTO.title) && Intrinsics.d(this.subtitle, segmentDTO.subtitle) && Intrinsics.d(this.segmentParts, segmentDTO.segmentParts);
    }

    @NotNull
    public final List<SegmentPartDTO> getSegmentParts() {
        return this.segmentParts;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.subtitle;
        return this.segmentParts.hashCode() + ((hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        return C2618u.h(g.g("SegmentDTO(title=", textDTO, ", subtitle=", textDTO2, ", segmentParts="), this.segmentParts, ")");
    }
}
