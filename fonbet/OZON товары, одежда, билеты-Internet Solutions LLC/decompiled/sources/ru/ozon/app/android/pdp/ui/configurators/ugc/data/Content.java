package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import B0.C2454a;
import B4.V;
import B90.C2616s;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import V.e;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003J\u0092\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0016\b\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content;", "", "comment", "", "negative", "positive", "score", "", "photos", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "videos", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Video;", "contextQuestionsAnswers", "", "pickerValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getComment", "()Ljava/lang/String;", "getNegative", "getPositive", "getScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPhotos", "()Ljava/util/List;", "getVideos", "getContextQuestionsAnswers", "()Ljava/util/Map;", "getPickerValues", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content;", "equals", "", "other", "hashCode", "toString", "Photo", "Video", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Content {
    public static final int $stable = 8;
    private final String comment;
    private final Map<String, Object> contextQuestionsAnswers;
    private final String negative;
    private final List<Photo> photos;
    private final Map<String, Object> pickerValues;
    private final String positive;
    private final Integer score;
    private final List<Video> videos;

    public Content(String str, String str2, String str3, Integer num, List<Photo> list, List<Video> list2, @i(name = "context_questions_answers") Map<String, ? extends Object> map, @i(name = "picker_values") Map<String, ? extends Object> map2) {
        this.comment = str;
        this.negative = str2;
        this.positive = str3;
        this.score = num;
        this.photos = list;
        this.videos = list2;
        this.contextQuestionsAnswers = map;
        this.pickerValues = map2;
    }

    public static /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, Integer num, List list, List list2, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = content.comment;
        }
        if ((i11 & 2) != 0) {
            str2 = content.negative;
        }
        if ((i11 & 4) != 0) {
            str3 = content.positive;
        }
        if ((i11 & 8) != 0) {
            num = content.score;
        }
        if ((i11 & 16) != 0) {
            list = content.photos;
        }
        if ((i11 & 32) != 0) {
            list2 = content.videos;
        }
        if ((i11 & 64) != 0) {
            map = content.contextQuestionsAnswers;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map2 = content.pickerValues;
        }
        Map map3 = map;
        Map map4 = map2;
        List list3 = list;
        List list4 = list2;
        return content.copy(str, str2, str3, num, list3, list4, map3, map4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNegative() {
        return this.negative;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPositive() {
        return this.positive;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    public final List<Photo> component5() {
        return this.photos;
    }

    public final List<Video> component6() {
        return this.videos;
    }

    public final Map<String, Object> component7() {
        return this.contextQuestionsAnswers;
    }

    public final Map<String, Object> component8() {
        return this.pickerValues;
    }

    @NotNull
    public final Content copy(String comment, String negative, String positive, Integer score, List<Photo> photos, List<Video> videos, @i(name = "context_questions_answers") Map<String, ? extends Object> contextQuestionsAnswers, @i(name = "picker_values") Map<String, ? extends Object> pickerValues) {
        return new Content(comment, negative, positive, score, photos, videos, contextQuestionsAnswers, pickerValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Content)) {
            return false;
        }
        Content content = (Content) other;
        return Intrinsics.d(this.comment, content.comment) && Intrinsics.d(this.negative, content.negative) && Intrinsics.d(this.positive, content.positive) && Intrinsics.d(this.score, content.score) && Intrinsics.d(this.photos, content.photos) && Intrinsics.d(this.videos, content.videos) && Intrinsics.d(this.contextQuestionsAnswers, content.contextQuestionsAnswers) && Intrinsics.d(this.pickerValues, content.pickerValues);
    }

    public final String getComment() {
        return this.comment;
    }

    public final Map<String, Object> getContextQuestionsAnswers() {
        return this.contextQuestionsAnswers;
    }

    public final String getNegative() {
        return this.negative;
    }

    public final List<Photo> getPhotos() {
        return this.photos;
    }

    public final Map<String, Object> getPickerValues() {
        return this.pickerValues;
    }

    public final String getPositive() {
        return this.positive;
    }

    public final Integer getScore() {
        return this.score;
    }

    public final List<Video> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        String str = this.comment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.negative;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.positive;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.score;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Photo> list = this.photos;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<Video> list2 = this.videos;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, Object> map = this.contextQuestionsAnswers;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.pickerValues;
        return hashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.comment;
        String str2 = this.negative;
        String str3 = this.positive;
        Integer num = this.score;
        List<Photo> list = this.photos;
        List<Video> list2 = this.videos;
        Map<String, Object> map = this.contextQuestionsAnswers;
        Map<String, Object> map2 = this.pickerValues;
        StringBuilder d11 = C3660k.d("Content(comment=", str, ", negative=", str2, ", positive=");
        C2454a.f(num, str3, ", score=", ", photos=", d11);
        C2616s.g(", videos=", ", contextQuestionsAnswers=", d11, list, list2);
        return V.c(d11, map, ", pickerValues=", map2, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Video;", "", ImagesContract.URL, "", "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getUuid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video {
        public static final int $stable = 0;

        @NotNull
        private final String url;
        private final String uuid;

        public Video(@NotNull String url, String str) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.uuid = str;
        }

        public static /* synthetic */ Video copy$default(Video video, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = video.url;
            }
            if ((i11 & 2) != 0) {
                str2 = video.uuid;
            }
            return video.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        @NotNull
        public final Video copy(@NotNull String url, String uuid) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Video(url, uuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return Intrinsics.d(this.url, video.url) && Intrinsics.d(this.uuid, video.uuid);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.uuid;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("Video(url=", this.url, ", uuid=", this.uuid, ")");
        }

        public /* synthetic */ Video(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Content$Photo;", "", ImagesContract.URL, "", "width", "height", "uuid", "fileName", "bucket", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getWidth", "getHeight", "getUuid", "getFileName", "getBucket", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo {
        public static final int $stable = 0;
        private final String bucket;
        private final String fileName;
        private final String height;

        @NotNull
        private final String url;
        private final String uuid;
        private final String width;

        public Photo(@NotNull String url, String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.width = str;
            this.height = str2;
            this.uuid = str3;
            this.fileName = str4;
            this.bucket = str5;
        }

        public static /* synthetic */ Photo copy$default(Photo photo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = photo.url;
            }
            if ((i11 & 2) != 0) {
                str2 = photo.width;
            }
            if ((i11 & 4) != 0) {
                str3 = photo.height;
            }
            if ((i11 & 8) != 0) {
                str4 = photo.uuid;
            }
            if ((i11 & 16) != 0) {
                str5 = photo.fileName;
            }
            if ((i11 & 32) != 0) {
                str6 = photo.bucket;
            }
            String str7 = str5;
            String str8 = str6;
            return photo.copy(str, str2, str3, str4, str7, str8);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHeight() {
            return this.height;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component5, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBucket() {
            return this.bucket;
        }

        @NotNull
        public final Photo copy(@NotNull String url, String width, String height, String uuid, String fileName, String bucket) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Photo(url, width, height, uuid, fileName, bucket);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Photo)) {
                return false;
            }
            Photo photo = (Photo) other;
            return Intrinsics.d(this.url, photo.url) && Intrinsics.d(this.width, photo.width) && Intrinsics.d(this.height, photo.height) && Intrinsics.d(this.uuid, photo.uuid) && Intrinsics.d(this.fileName, photo.fileName) && Intrinsics.d(this.bucket, photo.bucket);
        }

        public final String getBucket() {
            return this.bucket;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getHeight() {
            return this.height;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final String getWidth() {
            return this.width;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.width;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.height;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uuid;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fileName;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.bucket;
            return hashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            String str2 = this.width;
            String str3 = this.height;
            String str4 = this.uuid;
            String str5 = this.fileName;
            String str6 = this.bucket;
            StringBuilder d11 = C3660k.d("Photo(url=", str, ", width=", str2, ", height=");
            a.h(d11, str3, ", uuid=", str4, ", fileName=");
            return C3173b.c(d11, str5, ", bucket=", str6, ")");
        }

        public /* synthetic */ Photo(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
        }
    }

    public /* synthetic */ Content(String str, String str2, String str3, Integer num, List list, List list2, Map map, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, list, list2, map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map2);
    }
}
