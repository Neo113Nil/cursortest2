package qZ;

import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.InterfaceC9014f;

/* renamed from: qZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9010b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C9010b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9014f f81783a;

    /* renamed from: b, reason: collision with root package name */
    private final String f81784b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f81785c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f81786d;

    /* renamed from: qZ.b$a */
    public static final class a implements Parcelable.Creator<C9010b> {
        @Override // android.os.Parcelable.Creator
        public final C9010b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C9010b((InterfaceC9014f) parcel.readParcelable(C9010b.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final C9010b[] newArray(int i11) {
            return new C9010b[i11];
        }
    }

    public C9010b() {
        this(null, 15);
    }

    @NotNull
    public final InterfaceC9014f a() {
        return this.f81783a;
    }

    public final boolean b() {
        return this.f81786d;
    }

    public final boolean c() {
        return this.f81785c;
    }

    public final String d() {
        return this.f81784b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9010b)) {
            return false;
        }
        C9010b c9010b = (C9010b) obj;
        return this.f81785c == c9010b.f81785c && this.f81786d == c9010b.f81786d && Intrinsics.d(this.f81783a, c9010b.f81783a) && Intrinsics.d(this.f81784b, c9010b.f81784b);
    }

    public final int hashCode() {
        int hashCode = (this.f81783a.hashCode() + C3532b.a(Boolean.hashCode(this.f81785c) * 31, 31, this.f81786d)) * 31;
        String str = this.f81784b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowConfig(flowTag=");
        sb2.append(this.f81783a);
        sb2.append(", redirectDeeplink=");
        sb2.append(this.f81784b);
        sb2.append(", hideKeyboardOnFinish=");
        sb2.append(this.f81785c);
        sb2.append(", hasBackStack=");
        return Pk0.a.a(")", sb2, this.f81786d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81783a, i11);
        dest.writeString(this.f81784b);
        dest.writeInt(this.f81785c ? 1 : 0);
        dest.writeInt(this.f81786d ? 1 : 0);
    }

    public C9010b(@NotNull InterfaceC9014f flowTag, String str, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(flowTag, "flowTag");
        this.f81783a = flowTag;
        this.f81784b = str;
        this.f81785c = z11;
        this.f81786d = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C9010b(InterfaceC9014f interfaceC9014f, int i11) {
        this(interfaceC9014f, null, (i11 & 4) == 0, (i11 & 8) != 0);
        if ((i11 & 1) != 0) {
            InterfaceC9014f.f81797k0.getClass();
            interfaceC9014f = InterfaceC9014f.a.a();
        }
    }
}
