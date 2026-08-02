package ic0;

import G.g;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;

/* renamed from: ic0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7045a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C7045a> CREATOR = new C1090a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f66230a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f66231b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f66232c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final FastEntryActionDTO f66233d;

    /* renamed from: ic0.a$a, reason: collision with other inner class name */
    public static final class C1090a implements Parcelable.Creator<C7045a> {
        @Override // android.os.Parcelable.Creator
        public final C7045a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C7045a(parcel.readString(), parcel.readString(), parcel.readString(), FastEntryActionDTO.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final C7045a[] newArray(int i11) {
            return new C7045a[i11];
        }
    }

    public C7045a(@NotNull String analyticTag, @NotNull String title, @NotNull String subtitle, @NotNull FastEntryActionDTO authActionDTO) {
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        this.f66230a = analyticTag;
        this.f66231b = title;
        this.f66232c = subtitle;
        this.f66233d = authActionDTO;
    }

    @NotNull
    public final String a() {
        return this.f66230a;
    }

    @NotNull
    public final FastEntryActionDTO b() {
        return this.f66233d;
    }

    @NotNull
    public final String c() {
        return this.f66232c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7045a)) {
            return false;
        }
        C7045a c7045a = (C7045a) obj;
        return Intrinsics.d(this.f66230a, c7045a.f66230a) && Intrinsics.d(this.f66231b, c7045a.f66231b) && Intrinsics.d(this.f66232c, c7045a.f66232c) && Intrinsics.d(this.f66233d, c7045a.f66233d);
    }

    @NotNull
    public final String getTitle() {
        return this.f66231b;
    }

    public final int hashCode() {
        return this.f66233d.hashCode() + g.a(g.a(this.f66230a.hashCode() * 31, 31, this.f66231b), 31, this.f66232c);
    }

    @NotNull
    public final String toString() {
        return "BiometryDialogArgs(analyticTag=" + this.f66230a + ", title=" + this.f66231b + ", subtitle=" + this.f66232c + ", authActionDTO=" + this.f66233d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66230a);
        dest.writeString(this.f66231b);
        dest.writeString(this.f66232c);
        this.f66233d.writeToParcel(dest, i11);
    }
}
