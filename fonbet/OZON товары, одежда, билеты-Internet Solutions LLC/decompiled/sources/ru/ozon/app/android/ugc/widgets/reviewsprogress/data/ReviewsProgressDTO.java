package ru.ozon.app.android.ugc.widgets.reviewsprogress.data;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsprogress/data/ReviewsProgressDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "progressBar", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/progress/ProgressBar;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getProgressBar", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsProgressDTO {
    public static final int $stable = 8;

    @NotNull
    private final ProgressBar progressBar;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public ReviewsProgressDTO(@NotNull String title, @NotNull String subtitle, @NotNull ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.title = title;
        this.subtitle = subtitle;
        this.progressBar = progressBar;
    }

    public static /* synthetic */ ReviewsProgressDTO copy$default(ReviewsProgressDTO reviewsProgressDTO, String str, String str2, ProgressBar progressBar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewsProgressDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = reviewsProgressDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            progressBar = reviewsProgressDTO.progressBar;
        }
        return reviewsProgressDTO.copy(str, str2, progressBar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final ReviewsProgressDTO copy(@NotNull String title, @NotNull String subtitle, @NotNull ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        return new ReviewsProgressDTO(title, subtitle, progressBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsProgressDTO)) {
            return false;
        }
        ReviewsProgressDTO reviewsProgressDTO = (ReviewsProgressDTO) other;
        return Intrinsics.d(this.title, reviewsProgressDTO.title) && Intrinsics.d(this.subtitle, reviewsProgressDTO.subtitle) && Intrinsics.d(this.progressBar, reviewsProgressDTO.progressBar);
    }

    @NotNull
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.progressBar.hashCode() + g.a(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ProgressBar progressBar = this.progressBar;
        StringBuilder d11 = C3660k.d("ReviewsProgressDTO(title=", str, ", subtitle=", str2, ", progressBar=");
        d11.append(progressBar);
        d11.append(")");
        return d11.toString();
    }
}
