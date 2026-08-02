package ru.ozon.android.messenger.blocks.showTextButton;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
public final class k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final ButtonV3DTO f86403a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86404b;

    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new k((ButtonV3DTO) parcel.readParcelable(k.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i11) {
            return new k[i11];
        }
    }

    public k() {
        this(0);
    }

    public static k a(k kVar, boolean z11) {
        ButtonV3DTO buttonV3DTO = kVar.f86403a;
        kVar.getClass();
        return new k(buttonV3DTO, z11);
    }

    public final ButtonV3DTO b() {
        return this.f86403a;
    }

    public final boolean c() {
        return this.f86404b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f86403a, kVar.f86403a) && this.f86404b == kVar.f86404b;
    }

    public final int hashCode() {
        ButtonV3DTO buttonV3DTO = this.f86403a;
        return Boolean.hashCode(this.f86404b) + ((buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "ShowTextButtonState(button=" + this.f86403a + ", loading=" + this.f86404b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86403a, i11);
        dest.writeInt(this.f86404b ? 1 : 0);
    }

    public /* synthetic */ k(int i11) {
        this(null, false);
    }

    public k(ButtonV3DTO buttonV3DTO, boolean z11) {
        this.f86403a = buttonV3DTO;
        this.f86404b = z11;
    }
}
