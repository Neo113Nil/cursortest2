package ru.ozon.app.android.atoms.data.rating;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u0015J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0015HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/data/rating/RatingVerticalAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "rating", "", "count", "", "theme", "Lru/ozon/app/android/atoms/data/rating/RatingVerticalAtom$RatingTheme;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(FLjava/lang/String;Lru/ozon/app/android/atoms/data/rating/RatingVerticalAtom$RatingTheme;Lru/ozon/uni/atoms/data/TestInfo;)V", "getRating", "()F", "getCount", "()Ljava/lang/String;", "getTheme", "()Lru/ozon/app/android/atoms/data/rating/RatingVerticalAtom$RatingTheme;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RatingTheme", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RatingVerticalAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<RatingVerticalAtom> CREATOR = new Creator();
    private final String count;
    private final float rating;
    private final TestInfo testInfo;

    @NotNull
    private final RatingTheme theme;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<RatingVerticalAtom> {
        @Override // android.os.Parcelable.Creator
        public final RatingVerticalAtom createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RatingVerticalAtom(parcel.readFloat(), parcel.readString(), RatingTheme.valueOf(parcel.readString()), (TestInfo) parcel.readParcelable(RatingVerticalAtom.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingVerticalAtom[] newArray(int i11) {
            return new RatingVerticalAtom[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/RatingVerticalAtom$RatingTheme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_XS", "THEME_TYPE_S", "THEME_TYPE_M", "THEME_TYPE_L", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class RatingTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RatingTheme[] $VALUES;

        @i(name = "THEME_TYPE_XS")
        public static final RatingTheme THEME_TYPE_XS = new RatingTheme("THEME_TYPE_XS", 0);

        @i(name = "THEME_TYPE_S")
        public static final RatingTheme THEME_TYPE_S = new RatingTheme("THEME_TYPE_S", 1);

        @i(name = "THEME_TYPE_M")
        public static final RatingTheme THEME_TYPE_M = new RatingTheme("THEME_TYPE_M", 2);

        @i(name = "THEME_TYPE_L")
        public static final RatingTheme THEME_TYPE_L = new RatingTheme("THEME_TYPE_L", 3);

        private static final /* synthetic */ RatingTheme[] $values() {
            return new RatingTheme[]{THEME_TYPE_XS, THEME_TYPE_S, THEME_TYPE_M, THEME_TYPE_L};
        }

        static {
            RatingTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RatingTheme(String str, int i11) {
        }

        @NotNull
        public static a<RatingTheme> getEntries() {
            return $ENTRIES;
        }

        public static RatingTheme valueOf(String str) {
            return (RatingTheme) Enum.valueOf(RatingTheme.class, str);
        }

        public static RatingTheme[] values() {
            return (RatingTheme[]) $VALUES.clone();
        }
    }

    public /* synthetic */ RatingVerticalAtom(float f7, String str, RatingTheme ratingTheme, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, str, (i11 & 4) != 0 ? RatingTheme.THEME_TYPE_XS : ratingTheme, testInfo);
    }

    public static /* synthetic */ RatingVerticalAtom copy$default(RatingVerticalAtom ratingVerticalAtom, float f7, String str, RatingTheme ratingTheme, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f7 = ratingVerticalAtom.rating;
        }
        if ((i11 & 2) != 0) {
            str = ratingVerticalAtom.count;
        }
        if ((i11 & 4) != 0) {
            ratingTheme = ratingVerticalAtom.theme;
        }
        if ((i11 & 8) != 0) {
            testInfo = ratingVerticalAtom.testInfo;
        }
        return ratingVerticalAtom.copy(f7, str, ratingTheme, testInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final float getRating() {
        return this.rating;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RatingTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component4, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final RatingVerticalAtom copy(float rating, String count, @NotNull RatingTheme theme, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new RatingVerticalAtom(rating, count, theme, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingVerticalAtom)) {
            return false;
        }
        RatingVerticalAtom ratingVerticalAtom = (RatingVerticalAtom) other;
        return Float.compare(this.rating, ratingVerticalAtom.rating) == 0 && Intrinsics.d(this.count, ratingVerticalAtom.count) && this.theme == ratingVerticalAtom.theme && Intrinsics.d(this.testInfo, ratingVerticalAtom.testInfo);
    }

    public final String getCount() {
        return this.count;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_rating_vertical_atom;
    }

    public final float getRating() {
        return this.rating;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final RatingTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.rating) * 31;
        String str = this.count;
        int hashCode2 = (this.theme.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RatingVerticalAtom(rating=" + this.rating + ", count=" + this.count + ", theme=" + this.theme + ", testInfo=" + this.testInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.rating);
        dest.writeString(this.count);
        dest.writeString(this.theme.name());
        dest.writeParcelable(this.testInfo, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingVerticalAtom(float f7, String str, @NotNull RatingTheme theme, TestInfo testInfo) {
        super(Type.RATING_VERTICAL, null, null, testInfo, 4, null);
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.rating = f7;
        this.count = str;
        this.theme = theme;
        this.testInfo = testInfo;
    }
}
