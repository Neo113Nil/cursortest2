package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import Ak.C2436a;
import B0.C2454a;
import El.C2971a;
import G.g;
import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014Jr\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\f\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b1\u0010\u0018R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b2\u0010.¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "rating", "", "isRatingFullScreen", "LWZ/t;", "ratingFullScreenEvent", "", "points", "backgroundColor", "ratingTokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;ZLWZ/t;ILjava/lang/String;LWZ/t;)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;ZLWZ/t;ILjava/lang/String;LWZ/t;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "Z", "()Z", "LWZ/t;", "getRatingFullScreenEvent", "()LWZ/t;", "I", "getPoints", "getBackgroundColor", "getRatingTokenizedEvent", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormRatingVO implements c {
    private final String backgroundColor;
    private final long id;
    private final boolean isRatingFullScreen;
    private final int points;

    @NotNull
    private final RatingDTO rating;
    private final t ratingFullScreenEvent;
    private final t ratingTokenizedEvent;
    private final TextDTO title;

    @NotNull
    private final String uploadKey;

    public ReviewFormRatingVO(long j11, @NotNull String uploadKey, TextDTO textDTO, @NotNull RatingDTO rating, boolean z11, t tVar, int i11, String str, t tVar2) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(rating, "rating");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.title = textDTO;
        this.rating = rating;
        this.isRatingFullScreen = z11;
        this.ratingFullScreenEvent = tVar;
        this.points = i11;
        this.backgroundColor = str;
        this.ratingTokenizedEvent = tVar2;
    }

    public static /* synthetic */ ReviewFormRatingVO copy$default(ReviewFormRatingVO reviewFormRatingVO, long j11, String str, TextDTO textDTO, RatingDTO ratingDTO, boolean z11, t tVar, int i11, String str2, t tVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = reviewFormRatingVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = reviewFormRatingVO.uploadKey;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            textDTO = reviewFormRatingVO.title;
        }
        return reviewFormRatingVO.copy(j12, str3, textDTO, (i12 & 8) != 0 ? reviewFormRatingVO.rating : ratingDTO, (i12 & 16) != 0 ? reviewFormRatingVO.isRatingFullScreen : z11, (i12 & 32) != 0 ? reviewFormRatingVO.ratingFullScreenEvent : tVar, (i12 & 64) != 0 ? reviewFormRatingVO.points : i11, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewFormRatingVO.backgroundColor : str2, (i12 & 256) != 0 ? reviewFormRatingVO.ratingTokenizedEvent : tVar2);
    }

    @NotNull
    public final ReviewFormRatingVO copy(long id2, @NotNull String uploadKey, TextDTO title, @NotNull RatingDTO rating, boolean isRatingFullScreen, t ratingFullScreenEvent, int points, String backgroundColor, t ratingTokenizedEvent) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(rating, "rating");
        return new ReviewFormRatingVO(id2, uploadKey, title, rating, isRatingFullScreen, ratingFullScreenEvent, points, backgroundColor, ratingTokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormRatingVO)) {
            return false;
        }
        ReviewFormRatingVO reviewFormRatingVO = (ReviewFormRatingVO) other;
        return this.id == reviewFormRatingVO.id && Intrinsics.d(this.uploadKey, reviewFormRatingVO.uploadKey) && Intrinsics.d(this.title, reviewFormRatingVO.title) && Intrinsics.d(this.rating, reviewFormRatingVO.rating) && this.isRatingFullScreen == reviewFormRatingVO.isRatingFullScreen && Intrinsics.d(this.ratingFullScreenEvent, reviewFormRatingVO.ratingFullScreenEvent) && this.points == reviewFormRatingVO.points && Intrinsics.d(this.backgroundColor, reviewFormRatingVO.backgroundColor) && Intrinsics.d(this.ratingTokenizedEvent, reviewFormRatingVO.ratingTokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    public final t getRatingFullScreenEvent() {
        return this.ratingFullScreenEvent;
    }

    public final t getRatingTokenizedEvent() {
        return this.ratingTokenizedEvent;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey);
        TextDTO textDTO = this.title;
        int a12 = C3532b.a((this.rating.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31, this.isRatingFullScreen);
        t tVar = this.ratingFullScreenEvent;
        int a13 = C2454a.a(this.points, (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
        String str = this.backgroundColor;
        int hashCode = (a13 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar2 = this.ratingTokenizedEvent;
        return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    /* renamed from: isRatingFullScreen, reason: from getter */
    public final boolean getIsRatingFullScreen() {
        return this.isRatingFullScreen;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        TextDTO textDTO = this.title;
        RatingDTO ratingDTO = this.rating;
        boolean z11 = this.isRatingFullScreen;
        t tVar = this.ratingFullScreenEvent;
        int i11 = this.points;
        String str2 = this.backgroundColor;
        t tVar2 = this.ratingTokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "ReviewFormRatingVO(id=", ", uploadKey=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", rating=");
        c11.append(ratingDTO);
        C2971a.d(c11, ", isRatingFullScreen=", z11, ", ratingFullScreenEvent=", tVar);
        c11.append(", points=");
        c11.append(i11);
        c11.append(", backgroundColor=");
        c11.append(str2);
        return Lh.a.b(c11, ", ratingTokenizedEvent=", tVar2, ")");
    }
}
