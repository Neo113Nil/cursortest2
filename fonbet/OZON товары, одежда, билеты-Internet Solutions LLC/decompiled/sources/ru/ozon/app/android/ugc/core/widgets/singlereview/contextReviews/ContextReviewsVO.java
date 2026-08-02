package ru.ozon.app.android.ugc.core.widgets.singlereview.contextReviews;

import B0.C2454a;
import D3.h;
import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/contextReviews/ContextReviewsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "reviews", "", "backgroundColor", "", "topPadding", "bottomPadding", "<init>", "(JLjava/util/List;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getReviews", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "I", "getTopPadding", "getBottomPadding", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ContextReviewsVO implements c {
    private final String backgroundColor;
    private final int bottomPadding;
    private final long id;

    @NotNull
    private final List<TextDTO> reviews;
    private final int topPadding;

    public ContextReviewsVO(long j11, @NotNull List<TextDTO> reviews, String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        this.id = j11;
        this.reviews = reviews;
        this.backgroundColor = str;
        this.topPadding = i11;
        this.bottomPadding = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextReviewsVO)) {
            return false;
        }
        ContextReviewsVO contextReviewsVO = (ContextReviewsVO) other;
        return this.id == contextReviewsVO.id && Intrinsics.d(this.reviews, contextReviewsVO.reviews) && Intrinsics.d(this.backgroundColor, contextReviewsVO.backgroundColor) && this.topPadding == contextReviewsVO.topPadding && this.bottomPadding == contextReviewsVO.bottomPadding;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<TextDTO> getReviews() {
        return this.reviews;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.reviews);
        String str = this.backgroundColor;
        return Integer.hashCode(this.bottomPadding) + C2454a.a(this.topPadding, (b11 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TextDTO> list = this.reviews;
        String str = this.backgroundColor;
        int i11 = this.topPadding;
        int i12 = this.bottomPadding;
        StringBuilder b11 = b.b(j11, "ContextReviewsVO(id=", ", reviews=", list);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", topPadding=");
        b11.append(i11);
        return h.b(b11, ", bottomPadding=", i12, ")");
    }
}
