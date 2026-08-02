package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Am.C2438a;
import B0.C2454a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewScrollState;", "", "", "firstIndex", "offset", "lastIndex", "", "isScrolling", "<init>", "(IIIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getFirstIndex", "getOffset", "getLastIndex", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryPreviewScrollState {
    private final int firstIndex;
    private final boolean isScrolling;
    private final int lastIndex;
    private final int offset;

    public ReviewGalleryPreviewScrollState(int i11, int i12, int i13, boolean z11) {
        this.firstIndex = i11;
        this.offset = i12;
        this.lastIndex = i13;
        this.isScrolling = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryPreviewScrollState)) {
            return false;
        }
        ReviewGalleryPreviewScrollState reviewGalleryPreviewScrollState = (ReviewGalleryPreviewScrollState) other;
        return this.firstIndex == reviewGalleryPreviewScrollState.firstIndex && this.offset == reviewGalleryPreviewScrollState.offset && this.lastIndex == reviewGalleryPreviewScrollState.lastIndex && this.isScrolling == reviewGalleryPreviewScrollState.isScrolling;
    }

    public final int getFirstIndex() {
        return this.firstIndex;
    }

    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final int getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isScrolling) + C2454a.a(this.lastIndex, C2454a.a(this.offset, Integer.hashCode(this.firstIndex) * 31, 31), 31);
    }

    /* renamed from: isScrolling, reason: from getter */
    public final boolean getIsScrolling() {
        return this.isScrolling;
    }

    @NotNull
    public String toString() {
        int i11 = this.firstIndex;
        int i12 = this.offset;
        int i13 = this.lastIndex;
        boolean z11 = this.isScrolling;
        StringBuilder a11 = C2438a.a("ReviewGalleryPreviewScrollState(firstIndex=", i11, ", offset=", ", lastIndex=", i12);
        a11.append(i13);
        a11.append(", isScrolling=");
        a11.append(z11);
        a11.append(")");
        return a11.toString();
    }
}
