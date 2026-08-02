package ru.ozon.app.android.atoms.data.button;

import Sc.InterfaceC3999a;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/button/Icon;", "Landroid/os/Parcelable;", "image", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Icon implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Icon> CREATOR = new Creator();

    @NotNull
    private final String image;
    private final String tintColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Icon> {
        @Override // android.os.Parcelable.Creator
        public final Icon createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Icon(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Icon[] newArray(int i11) {
            return new Icon[i11];
        }
    }

    public Icon(@NotNull String image, String str) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.tintColor = str;
    }

    public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = icon.image;
        }
        if ((i11 & 2) != 0) {
            str2 = icon.tintColor;
        }
        return icon.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    @NotNull
    public final Icon copy(@NotNull String image, String tintColor) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new Icon(image, tintColor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) other;
        return Intrinsics.d(this.image, icon.image) && Intrinsics.d(this.tintColor, icon.tintColor);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.tintColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return e.a("Icon(image=", this.image, ", tintColor=", this.tintColor, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.image);
        dest.writeString(this.tintColor);
    }
}
