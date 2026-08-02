package ru.ozon.app.android.atoms.data.rating;

import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/data/rating/RatingBadgeAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RatingBadgeAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<RatingBadgeAtom> CREATOR = new Creator();
    private final TestInfo testInfo;

    @NotNull
    private final String text;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<RatingBadgeAtom> {
        @Override // android.os.Parcelable.Creator
        public final RatingBadgeAtom createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RatingBadgeAtom(parcel.readString(), (TestInfo) parcel.readParcelable(RatingBadgeAtom.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingBadgeAtom[] newArray(int i11) {
            return new RatingBadgeAtom[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingBadgeAtom(@NotNull String text, TestInfo testInfo) {
        super(Type.RATING_BADGE, null, null, testInfo, 4, null);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ RatingBadgeAtom copy$default(RatingBadgeAtom ratingBadgeAtom, String str, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ratingBadgeAtom.text;
        }
        if ((i11 & 2) != 0) {
            testInfo = ratingBadgeAtom.testInfo;
        }
        return ratingBadgeAtom.copy(str, testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final RatingBadgeAtom copy(@NotNull String text, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new RatingBadgeAtom(text, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingBadgeAtom)) {
            return false;
        }
        RatingBadgeAtom ratingBadgeAtom = (RatingBadgeAtom) other;
        return Intrinsics.d(this.text, ratingBadgeAtom.text) && Intrinsics.d(this.testInfo, ratingBadgeAtom.testInfo);
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_rating_badge_atom;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo == null ? 0 : testInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "RatingBadgeAtom(text=" + this.text + ", testInfo=" + this.testInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeParcelable(this.testInfo, flags);
    }
}
