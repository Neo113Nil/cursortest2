package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList;

import B0.C2454a;
import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO;", "tags", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "<init>", "(JLjava/util/List;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "TagItemVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TagListVO implements c {
    private final long id;
    private final Paddings paddings;

    @NotNull
    private final List<TagItemVO> tags;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO;", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "button", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;", "tooltip", "<init>", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;", "getTooltip", "()Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;", "TooltipVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TagItemVO {

        @NotNull
        private final TagButtonDTO button;
        private final TooltipVO tooltip;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;", "", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "", "index", "", "timeout", "showDelay", "<init>", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;ILjava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "getTooltip", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "I", "getIndex", "Ljava/lang/Long;", "getTimeout", "()Ljava/lang/Long;", "getShowDelay", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TooltipVO {
            private final int index;
            private final Long showDelay;
            private final Long timeout;

            @NotNull
            private final CartTooltipVO tooltip;

            public TooltipVO(@NotNull CartTooltipVO tooltip, int i11, Long l11, Long l12) {
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                this.tooltip = tooltip;
                this.index = i11;
                this.timeout = l11;
                this.showDelay = l12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TooltipVO)) {
                    return false;
                }
                TooltipVO tooltipVO = (TooltipVO) other;
                return Intrinsics.d(this.tooltip, tooltipVO.tooltip) && this.index == tooltipVO.index && Intrinsics.d(this.timeout, tooltipVO.timeout) && Intrinsics.d(this.showDelay, tooltipVO.showDelay);
            }

            public final Long getShowDelay() {
                return this.showDelay;
            }

            public final Long getTimeout() {
                return this.timeout;
            }

            @NotNull
            public final CartTooltipVO getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.index, this.tooltip.hashCode() * 31, 31);
                Long l11 = this.timeout;
                int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.showDelay;
                return hashCode + (l12 != null ? l12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "TooltipVO(tooltip=" + this.tooltip + ", index=" + this.index + ", timeout=" + this.timeout + ", showDelay=" + this.showDelay + ")";
            }
        }

        public TagItemVO(@NotNull TagButtonDTO button, TooltipVO tooltipVO) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.tooltip = tooltipVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagItemVO)) {
                return false;
            }
            TagItemVO tagItemVO = (TagItemVO) other;
            return Intrinsics.d(this.button, tagItemVO.button) && Intrinsics.d(this.tooltip, tagItemVO.tooltip);
        }

        @NotNull
        public final TagButtonDTO getButton() {
            return this.button;
        }

        public final TooltipVO getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            TooltipVO tooltipVO = this.tooltip;
            return hashCode + (tooltipVO == null ? 0 : tooltipVO.hashCode());
        }

        @NotNull
        public String toString() {
            return "TagItemVO(button=" + this.button + ", tooltip=" + this.tooltip + ")";
        }
    }

    public TagListVO(long j11, @NotNull List<TagItemVO> tags, Paddings paddings) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = j11;
        this.tags = tags;
        this.paddings = paddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagListVO)) {
            return false;
        }
        TagListVO tagListVO = (TagListVO) other;
        return this.id == tagListVO.id && Intrinsics.d(this.tags, tagListVO.tags) && Intrinsics.d(this.paddings, tagListVO.paddings);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TagItemVO> getTags() {
        return this.tags;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.tags);
        Paddings paddings = this.paddings;
        return b11 + (paddings == null ? 0 : paddings.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TagItemVO> list = this.tags;
        Paddings paddings = this.paddings;
        StringBuilder b11 = b.b(j11, "TagListVO(id=", ", tags=", list);
        b11.append(", paddings=");
        b11.append(paddings);
        b11.append(")");
        return b11.toString();
    }
}
