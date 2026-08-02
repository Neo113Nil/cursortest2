package ic0;

import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;

/* renamed from: ic0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7047c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C7047c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f66239a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66240b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final FastEntryActionDTO f66241c;

    /* renamed from: ic0.c$a */
    public static final class a implements Parcelable.Creator<C7047c> {
        @Override // android.os.Parcelable.Creator
        public final C7047c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C7047c(parcel.readString(), FastEntryActionDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final C7047c[] newArray(int i11) {
            return new C7047c[i11];
        }
    }

    public C7047c(@NotNull String analyticTag, @NotNull FastEntryActionDTO authActionDTO, boolean z11) {
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        Intrinsics.checkNotNullParameter(authActionDTO, "authActionDTO");
        this.f66239a = analyticTag;
        this.f66240b = z11;
        this.f66241c = authActionDTO;
    }

    @NotNull
    public final String a() {
        return this.f66239a;
    }

    @NotNull
    public final FastEntryActionDTO b() {
        return this.f66241c;
    }

    public final boolean c() {
        return this.f66240b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7047c)) {
            return false;
        }
        C7047c c7047c = (C7047c) obj;
        return Intrinsics.d(this.f66239a, c7047c.f66239a) && this.f66240b == c7047c.f66240b && Intrinsics.d(this.f66241c, c7047c.f66241c);
    }

    public final int hashCode() {
        return this.f66241c.hashCode() + C3532b.a(this.f66239a.hashCode() * 31, 31, this.f66240b);
    }

    @NotNull
    public final String toString() {
        return "BiometryDialogResult(analyticTag=" + this.f66239a + ", biometryEnabled=" + this.f66240b + ", authActionDTO=" + this.f66241c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66239a);
        dest.writeInt(this.f66240b ? 1 : 0);
        this.f66241c.writeToParcel(dest, i11);
    }
}
