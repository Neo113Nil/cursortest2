package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import B0.C2454a;
import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryNoUiV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "selectedIndex", "orientation", "", "onBackConfigKey", "<init>", "(JLjava/lang/Integer;ILjava/lang/String;)V", "copy", "(JLjava/lang/Integer;ILjava/lang/String;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryNoUiV2VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getSelectedIndex", "()Ljava/lang/Integer;", "I", "getOrientation", "Ljava/lang/String;", "getOnBackConfigKey", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryNoUiV2VO implements c {
    private final long id;
    private final String onBackConfigKey;
    private final int orientation;
    private final Integer selectedIndex;

    public ReviewGalleryNoUiV2VO(long j11, Integer num, int i11, String str) {
        this.id = j11;
        this.selectedIndex = num;
        this.orientation = i11;
        this.onBackConfigKey = str;
    }

    public static /* synthetic */ ReviewGalleryNoUiV2VO copy$default(ReviewGalleryNoUiV2VO reviewGalleryNoUiV2VO, long j11, Integer num, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = reviewGalleryNoUiV2VO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            num = reviewGalleryNoUiV2VO.selectedIndex;
        }
        Integer num2 = num;
        if ((i12 & 4) != 0) {
            i11 = reviewGalleryNoUiV2VO.orientation;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str = reviewGalleryNoUiV2VO.onBackConfigKey;
        }
        return reviewGalleryNoUiV2VO.copy(j12, num2, i13, str);
    }

    @NotNull
    public final ReviewGalleryNoUiV2VO copy(long id2, Integer selectedIndex, int orientation, String onBackConfigKey) {
        return new ReviewGalleryNoUiV2VO(id2, selectedIndex, orientation, onBackConfigKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryNoUiV2VO)) {
            return false;
        }
        ReviewGalleryNoUiV2VO reviewGalleryNoUiV2VO = (ReviewGalleryNoUiV2VO) other;
        return this.id == reviewGalleryNoUiV2VO.id && Intrinsics.d(this.selectedIndex, reviewGalleryNoUiV2VO.selectedIndex) && this.orientation == reviewGalleryNoUiV2VO.orientation && Intrinsics.d(this.onBackConfigKey, reviewGalleryNoUiV2VO.onBackConfigKey);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getOnBackConfigKey() {
        return this.onBackConfigKey;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.selectedIndex;
        int a11 = C2454a.a(this.orientation, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.onBackConfigKey;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.selectedIndex;
        int i11 = this.orientation;
        String str = this.onBackConfigKey;
        StringBuilder c11 = a.c("ReviewGalleryNoUiV2VO(id=", j11, ", selectedIndex=", num);
        c11.append(", orientation=");
        c11.append(i11);
        c11.append(", onBackConfigKey=");
        c11.append(str);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ ReviewGalleryNoUiV2VO(long j11, Integer num, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, num, (i12 & 4) != 0 ? 1 : i11, str);
    }
}
