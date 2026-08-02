package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Content;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002*+Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jh\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "", "rating", "", "medias", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData$CachedMedia;", "comment", "anonymous", "", "questions", "", "variantId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;)V", "getRating", "()Ljava/lang/String;", "getMedias", "()Ljava/util/List;", "getComment", "getAnonymous", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQuestions", "()Ljava/util/Map;", "getVariantId", "hasOnlyRating", "getHasOnlyRating", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "equals", "other", "hashCode", "", "toString", "Companion", "CachedMedia", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ReviewFormData {
    private final Boolean anonymous;
    private final String comment;
    private final boolean hasOnlyRating;
    private final List<CachedMedia> medias;
    private final Map<String, String> questions;
    private final String rating;
    private final String variantId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final ReviewFormData EMPTY = new ReviewFormData(null, null, null, null, null, null, 63, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData$Companion;", "", "<init>", "()V", "EMPTY", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "getEMPTY", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReviewFormData getEMPTY() {
            return ReviewFormData.EMPTY;
        }

        private Companion() {
        }
    }

    public ReviewFormData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ReviewFormData copy$default(ReviewFormData reviewFormData, String str, List list, String str2, Boolean bool, Map map, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewFormData.rating;
        }
        if ((i11 & 2) != 0) {
            list = reviewFormData.medias;
        }
        if ((i11 & 4) != 0) {
            str2 = reviewFormData.comment;
        }
        if ((i11 & 8) != 0) {
            bool = reviewFormData.anonymous;
        }
        if ((i11 & 16) != 0) {
            map = reviewFormData.questions;
        }
        if ((i11 & 32) != 0) {
            str3 = reviewFormData.variantId;
        }
        Map map2 = map;
        String str4 = str3;
        return reviewFormData.copy(str, list, str2, bool, map2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRating() {
        return this.rating;
    }

    public final List<CachedMedia> component2() {
        return this.medias;
    }

    /* renamed from: component3, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getAnonymous() {
        return this.anonymous;
    }

    public final Map<String, String> component5() {
        return this.questions;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVariantId() {
        return this.variantId;
    }

    @NotNull
    public final ReviewFormData copy(String rating, List<CachedMedia> medias, String comment, Boolean anonymous, Map<String, String> questions, String variantId) {
        return new ReviewFormData(rating, medias, comment, anonymous, questions, variantId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormData)) {
            return false;
        }
        ReviewFormData reviewFormData = (ReviewFormData) other;
        return Intrinsics.d(this.rating, reviewFormData.rating) && Intrinsics.d(this.medias, reviewFormData.medias) && Intrinsics.d(this.comment, reviewFormData.comment) && Intrinsics.d(this.anonymous, reviewFormData.anonymous) && Intrinsics.d(this.questions, reviewFormData.questions) && Intrinsics.d(this.variantId, reviewFormData.variantId);
    }

    public final Boolean getAnonymous() {
        return this.anonymous;
    }

    public final String getComment() {
        return this.comment;
    }

    public final boolean getHasOnlyRating() {
        return this.hasOnlyRating;
    }

    public final List<CachedMedia> getMedias() {
        return this.medias;
    }

    public final Map<String, String> getQuestions() {
        return this.questions;
    }

    public final String getRating() {
        return this.rating;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        String str = this.rating;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CachedMedia> list = this.medias;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.comment;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.anonymous;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.questions;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.variantId;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.rating;
        List<CachedMedia> list = this.medias;
        String str2 = this.comment;
        Boolean bool = this.anonymous;
        Map<String, String> map = this.questions;
        String str3 = this.variantId;
        StringBuilder f7 = b.f("ReviewFormData(rating=", str, ", medias=", ", comment=", list);
        Sh.a.d(bool, str2, ", anonymous=", ", questions=", f7);
        f7.append(map);
        f7.append(", variantId=");
        f7.append(str3);
        f7.append(")");
        return f7.toString();
    }

    public ReviewFormData(String str, List<CachedMedia> list, String str2, Boolean bool, Map<String, String> map, String str3) {
        List<CachedMedia> list2;
        this.rating = str;
        this.medias = list;
        this.comment = str2;
        this.anonymous = bool;
        this.questions = map;
        this.variantId = str3;
        this.hasOnlyRating = (str2 == null || str2.length() == 0) && ((list2 = list) == null || list2.isEmpty());
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormData$CachedMedia;", "", "uri", "", "photo", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "video", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Video;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Video;)V", "getUri", "()Ljava/lang/String;", "getPhoto", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "getVideo", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Video;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CachedMedia {
        public static final int $stable = 0;
        private final Content.Photo photo;

        @NotNull
        private final String uri;
        private final Content.Video video;

        public CachedMedia(@NotNull String uri, Content.Photo photo, Content.Video video) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
            this.photo = photo;
            this.video = video;
        }

        public static /* synthetic */ CachedMedia copy$default(CachedMedia cachedMedia, String str, Content.Photo photo, Content.Video video, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cachedMedia.uri;
            }
            if ((i11 & 2) != 0) {
                photo = cachedMedia.photo;
            }
            if ((i11 & 4) != 0) {
                video = cachedMedia.video;
            }
            return cachedMedia.copy(str, photo, video);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* renamed from: component2, reason: from getter */
        public final Content.Photo getPhoto() {
            return this.photo;
        }

        /* renamed from: component3, reason: from getter */
        public final Content.Video getVideo() {
            return this.video;
        }

        @NotNull
        public final CachedMedia copy(@NotNull String uri, Content.Photo photo, Content.Video video) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new CachedMedia(uri, photo, video);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedMedia)) {
                return false;
            }
            CachedMedia cachedMedia = (CachedMedia) other;
            return Intrinsics.d(this.uri, cachedMedia.uri) && Intrinsics.d(this.photo, cachedMedia.photo) && Intrinsics.d(this.video, cachedMedia.video);
        }

        public final Content.Photo getPhoto() {
            return this.photo;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public final Content.Video getVideo() {
            return this.video;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            Content.Photo photo = this.photo;
            int hashCode2 = (hashCode + (photo == null ? 0 : photo.hashCode())) * 31;
            Content.Video video = this.video;
            return hashCode2 + (video != null ? video.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CachedMedia(uri=" + this.uri + ", photo=" + this.photo + ", video=" + this.video + ")";
        }

        public /* synthetic */ CachedMedia(String str, Content.Photo photo, Content.Video video, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : photo, (i11 & 4) != 0 ? null : video);
        }
    }

    public /* synthetic */ ReviewFormData(String str, List list, String str2, Boolean bool, Map map, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? null : str3);
    }
}
