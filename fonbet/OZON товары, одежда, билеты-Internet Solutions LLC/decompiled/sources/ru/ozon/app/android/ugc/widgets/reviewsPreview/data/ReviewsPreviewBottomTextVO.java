package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewBottomTextVO;", "Ll20/c;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/CommonVO;", "", "id", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "itemSpacing", "", "widgetBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bottomText", "<init>", "(JLru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getItemSpacing", "Ljava/lang/String;", "getWidgetBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getBottomText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsPreviewBottomTextVO implements c, CommonVO {
    private final TextDTO bottomText;
    private final Paddings horizontalPadding;
    private final long id;
    private final Paddings itemSpacing;

    @NotNull
    private final String widgetBackgroundColor;

    public ReviewsPreviewBottomTextVO(long j11, Paddings paddings, Paddings paddings2, @NotNull String widgetBackgroundColor, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
        this.id = j11;
        this.horizontalPadding = paddings;
        this.itemSpacing = paddings2;
        this.widgetBackgroundColor = widgetBackgroundColor;
        this.bottomText = textDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsPreviewBottomTextVO)) {
            return false;
        }
        ReviewsPreviewBottomTextVO reviewsPreviewBottomTextVO = (ReviewsPreviewBottomTextVO) other;
        return this.id == reviewsPreviewBottomTextVO.id && this.horizontalPadding == reviewsPreviewBottomTextVO.horizontalPadding && this.itemSpacing == reviewsPreviewBottomTextVO.itemSpacing && Intrinsics.d(this.widgetBackgroundColor, reviewsPreviewBottomTextVO.widgetBackgroundColor) && Intrinsics.d(this.bottomText, reviewsPreviewBottomTextVO.bottomText);
    }

    public final TextDTO getBottomText() {
        return this.bottomText;
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
    public Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
    public Paddings getItemSpacing() {
        return this.itemSpacing;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsPreview.data.CommonVO
    @NotNull
    public String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Paddings paddings = this.horizontalPadding;
        int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.itemSpacing;
        int a11 = g.a((hashCode2 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31, 31, this.widgetBackgroundColor);
        TextDTO textDTO = this.bottomText;
        return a11 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewsPreviewBottomTextVO(id=" + this.id + ", horizontalPadding=" + this.horizontalPadding + ", itemSpacing=" + this.itemSpacing + ", widgetBackgroundColor=" + this.widgetBackgroundColor + ", bottomText=" + this.bottomText + ")";
    }
}
