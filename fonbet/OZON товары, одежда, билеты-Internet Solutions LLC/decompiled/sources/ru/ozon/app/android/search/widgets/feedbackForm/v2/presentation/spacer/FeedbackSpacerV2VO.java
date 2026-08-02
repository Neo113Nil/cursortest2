package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.spacer;

import Pk0.b;
import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/spacer/FeedbackSpacerV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "topCornerRadius", "bottomCornerRadius", "<init>", "(JFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "F", "getTopCornerRadius", "()F", "getBottomCornerRadius", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackSpacerV2VO implements c {
    private final float bottomCornerRadius;
    private final long id;
    private final float topCornerRadius;

    public FeedbackSpacerV2VO(long j11, float f7, float f11) {
        this.id = j11;
        this.topCornerRadius = f7;
        this.bottomCornerRadius = f11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackSpacerV2VO)) {
            return false;
        }
        FeedbackSpacerV2VO feedbackSpacerV2VO = (FeedbackSpacerV2VO) other;
        return this.id == feedbackSpacerV2VO.id && Float.compare(this.topCornerRadius, feedbackSpacerV2VO.topCornerRadius) == 0 && Float.compare(this.bottomCornerRadius, feedbackSpacerV2VO.bottomCornerRadius) == 0;
    }

    public final float getBottomCornerRadius() {
        return this.bottomCornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final float getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Float.hashCode(this.bottomCornerRadius) + b.a(this.topCornerRadius, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "FeedbackSpacerV2VO(id=" + this.id + ", topCornerRadius=" + this.topCornerRadius + ", bottomCornerRadius=" + this.bottomCornerRadius + ")";
    }
}
