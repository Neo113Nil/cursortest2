package ru.ozon.app.android.atoms.data.rating;

import C.J;
import De.C2859b;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00013BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\fH\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010$\u001a\u00020\u000eHÆ\u0003J^\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\fJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\fHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00064"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/Rating;", "Lru/ozon/uni/atoms/data/AtomDTO;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rating", "", "reviewsCount", "", "reviewsCountType", "Lru/ozon/app/android/atoms/data/rating/Rating$ReviewsCountType;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;FLjava/lang/Integer;Lru/ozon/app/android/atoms/data/rating/Rating$ReviewsCountType;)V", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getRating", "()F", "getReviewsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReviewsCountType", "()Lru/ozon/app/android/atoms/data/rating/Rating$ReviewsCountType;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;FLjava/lang/Integer;Lru/ozon/app/android/atoms/data/rating/Rating$ReviewsCountType;)Lru/ozon/app/android/atoms/data/rating/Rating;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ReviewsCountType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Rating extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<Rating> CREATOR = new Creator();
    private final String context;
    private final float rating;
    private final Integer reviewsCount;

    @NotNull
    private final ReviewsCountType reviewsCountType;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Rating> {
        @Override // android.os.Parcelable.Creator
        public final Rating createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(Rating.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(Rating.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new Rating(readString, testInfo, linkedHashMap, parcel.readFloat(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, ReviewsCountType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Rating[] newArray(int i11) {
            return new Rating[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/Rating$ReviewsCountType;", "", "<init>", "(Ljava/lang/String;I)V", "DIGITAL", "TEXT", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReviewsCountType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ReviewsCountType[] $VALUES;
        public static final ReviewsCountType DIGITAL = new ReviewsCountType("DIGITAL", 0);
        public static final ReviewsCountType TEXT = new ReviewsCountType("TEXT", 1);

        private static final /* synthetic */ ReviewsCountType[] $values() {
            return new ReviewsCountType[]{DIGITAL, TEXT};
        }

        static {
            ReviewsCountType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ReviewsCountType(String str, int i11) {
        }

        @NotNull
        public static a<ReviewsCountType> getEntries() {
            return $ENTRIES;
        }

        public static ReviewsCountType valueOf(String str) {
            return (ReviewsCountType) Enum.valueOf(ReviewsCountType.class, str);
        }

        public static ReviewsCountType[] values() {
            return (ReviewsCountType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Rating(String str, TestInfo testInfo, Map map, float f7, Integer num, ReviewsCountType reviewsCountType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : testInfo, (i11 & 4) != 0 ? null : map, f7, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? ReviewsCountType.TEXT : reviewsCountType);
    }

    public static /* synthetic */ Rating copy$default(Rating rating, String str, TestInfo testInfo, Map map, float f7, Integer num, ReviewsCountType reviewsCountType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rating.context;
        }
        if ((i11 & 2) != 0) {
            testInfo = rating.testInfo;
        }
        if ((i11 & 4) != 0) {
            map = rating.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            f7 = rating.rating;
        }
        if ((i11 & 16) != 0) {
            num = rating.reviewsCount;
        }
        if ((i11 & 32) != 0) {
            reviewsCountType = rating.reviewsCountType;
        }
        Integer num2 = num;
        ReviewsCountType reviewsCountType2 = reviewsCountType;
        return rating.copy(str, testInfo, map, f7, num2, reviewsCountType2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final float getRating() {
        return this.rating;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getReviewsCount() {
        return this.reviewsCount;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ReviewsCountType getReviewsCountType() {
        return this.reviewsCountType;
    }

    @NotNull
    public final Rating copy(String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, float rating, Integer reviewsCount, @NotNull ReviewsCountType reviewsCountType) {
        Intrinsics.checkNotNullParameter(reviewsCountType, "reviewsCountType");
        return new Rating(context, testInfo, trackingInfo, rating, reviewsCount, reviewsCountType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rating)) {
            return false;
        }
        Rating rating = (Rating) other;
        return Intrinsics.d(this.context, rating.context) && Intrinsics.d(this.testInfo, rating.testInfo) && Intrinsics.d(this.trackingInfo, rating.trackingInfo) && Float.compare(this.rating, rating.rating) == 0 && Intrinsics.d(this.reviewsCount, rating.reviewsCount) && this.reviewsCountType == rating.reviewsCountType;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_rating;
    }

    public final float getRating() {
        return this.rating;
    }

    public final Integer getReviewsCount() {
        return this.reviewsCount;
    }

    @NotNull
    public final ReviewsCountType getReviewsCountType() {
        return this.reviewsCountType;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.context;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int a11 = Pk0.b.a(this.rating, (hashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31);
        Integer num = this.reviewsCount;
        return this.reviewsCountType.hashCode() + ((a11 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "Rating(context=" + this.context + ", testInfo=" + this.testInfo + ", trackingInfo=" + this.trackingInfo + ", rating=" + this.rating + ", reviewsCount=" + this.reviewsCount + ", reviewsCountType=" + this.reviewsCountType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        dest.writeParcelable(this.testInfo, flags);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeFloat(this.rating);
        Integer num = this.reviewsCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeString(this.reviewsCountType.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rating(String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, float f7, Integer num, @NotNull ReviewsCountType reviewsCountType) {
        super(AtomTypeImpl.RATING, str, map, testInfo);
        Intrinsics.checkNotNullParameter(reviewsCountType, "reviewsCountType");
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.rating = f7;
        this.reviewsCount = num;
        this.reviewsCountType = reviewsCountType;
    }
}
