package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/ActiveDeliveriesDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/HeaderDTO;", "elements", "", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/ElementDTO;", "sticky", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/StickyDTO;", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/HeaderDTO;Ljava/util/List;Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/StickyDTO;)V", "getHeader", "()Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/HeaderDTO;", "getElements", "()Ljava/util/List;", "getSticky", "()Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/StickyDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActiveDeliveriesDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ElementDTO> elements;
    private final HeaderDTO header;
    private final StickyDTO sticky;

    public ActiveDeliveriesDTO(HeaderDTO headerDTO, @NotNull List<ElementDTO> elements, StickyDTO stickyDTO) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.header = headerDTO;
        this.elements = elements;
        this.sticky = stickyDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActiveDeliveriesDTO copy$default(ActiveDeliveriesDTO activeDeliveriesDTO, HeaderDTO headerDTO, List list, StickyDTO stickyDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = activeDeliveriesDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = activeDeliveriesDTO.elements;
        }
        if ((i11 & 4) != 0) {
            stickyDTO = activeDeliveriesDTO.sticky;
        }
        return activeDeliveriesDTO.copy(headerDTO, list, stickyDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<ElementDTO> component2() {
        return this.elements;
    }

    /* renamed from: component3, reason: from getter */
    public final StickyDTO getSticky() {
        return this.sticky;
    }

    @NotNull
    public final ActiveDeliveriesDTO copy(HeaderDTO header, @NotNull List<ElementDTO> elements, StickyDTO sticky) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ActiveDeliveriesDTO(header, elements, sticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveDeliveriesDTO)) {
            return false;
        }
        ActiveDeliveriesDTO activeDeliveriesDTO = (ActiveDeliveriesDTO) other;
        return Intrinsics.d(this.header, activeDeliveriesDTO.header) && Intrinsics.d(this.elements, activeDeliveriesDTO.elements) && Intrinsics.d(this.sticky, activeDeliveriesDTO.sticky);
    }

    @NotNull
    public final List<ElementDTO> getElements() {
        return this.elements;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final StickyDTO getSticky() {
        return this.sticky;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int b11 = g.b((headerDTO == null ? 0 : headerDTO.hashCode()) * 31, 31, this.elements);
        StickyDTO stickyDTO = this.sticky;
        return b11 + (stickyDTO != null ? stickyDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActiveDeliveriesDTO(header=" + this.header + ", elements=" + this.elements + ", sticky=" + this.sticky + ")";
    }
}
