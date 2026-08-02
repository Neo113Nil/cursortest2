package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector;

import G.g;
import Ns.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO$LogosElementVO;", "elements", "", "scrollPosition", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "<init>", "(JLjava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Ljava/lang/Integer;", "getScrollPosition", "()Ljava/lang/Integer;", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "LogosElementVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LogosCarouselVO implements c {

    @NotNull
    private final List<LogosElementVO> elements;
    private final long id;
    private final Paddings paddings;
    private final Integer scrollPosition;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\r\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO$LogosElementVO;", "", "", "isSelected", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "isSelectable", "<init>", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogosElementVO {
        private final AtomActionDTO action;
        private final boolean isSelectable;
        private final boolean isSelected;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public LogosElementVO(boolean z11, @NotNull TextDTO title, TextDTO textDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, boolean z12) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.isSelected = z11;
            this.title = title;
            this.subtitle = textDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.isSelectable = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogosElementVO)) {
                return false;
            }
            LogosElementVO logosElementVO = (LogosElementVO) other;
            return this.isSelected == logosElementVO.isSelected && Intrinsics.d(this.title, logosElementVO.title) && Intrinsics.d(this.subtitle, logosElementVO.subtitle) && Intrinsics.d(this.action, logosElementVO.action) && Intrinsics.d(this.trackingInfo, logosElementVO.trackingInfo) && this.isSelectable == logosElementVO.isSelectable;
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.title, Boolean.hashCode(this.isSelected) * 31, 31);
            TextDTO textDTO = this.subtitle;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return Boolean.hashCode(this.isSelectable) + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
        }

        /* renamed from: isSelectable, reason: from getter */
        public final boolean getIsSelectable() {
            return this.isSelectable;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "LogosElementVO(isSelected=" + this.isSelected + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", isSelectable=" + this.isSelectable + ")";
        }
    }

    public LogosCarouselVO(long j11, @NotNull List<LogosElementVO> elements, Integer num, Paddings paddings) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.id = j11;
        this.elements = elements;
        this.scrollPosition = num;
        this.paddings = paddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogosCarouselVO)) {
            return false;
        }
        LogosCarouselVO logosCarouselVO = (LogosCarouselVO) other;
        return this.id == logosCarouselVO.id && Intrinsics.d(this.elements, logosCarouselVO.elements) && Intrinsics.d(this.scrollPosition, logosCarouselVO.scrollPosition) && Intrinsics.d(this.paddings, logosCarouselVO.paddings);
    }

    @NotNull
    public final List<LogosElementVO> getElements() {
        return this.elements;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final Integer getScrollPosition() {
        return this.scrollPosition;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.elements);
        Integer num = this.scrollPosition;
        int hashCode = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        Paddings paddings = this.paddings;
        return hashCode + (paddings != null ? paddings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<LogosElementVO> list = this.elements;
        Integer num = this.scrollPosition;
        Paddings paddings = this.paddings;
        StringBuilder b11 = Lh.b.b(j11, "LogosCarouselVO(id=", ", elements=", list);
        b11.append(", scrollPosition=");
        b11.append(num);
        b11.append(", paddings=");
        b11.append(paddings);
        b11.append(")");
        return b11.toString();
    }
}
