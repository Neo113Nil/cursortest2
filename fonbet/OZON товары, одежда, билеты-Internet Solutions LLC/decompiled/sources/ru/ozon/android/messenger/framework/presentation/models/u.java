package ru.ozon.android.messenger.framework.presentation.models;

import B0.C2454a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class u implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f91551a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91552b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.viewmapper.e f91553c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f91554d;

    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new u((g) parcel.readValue(u.class.getClassLoader()), parcel.readInt(), (ru.ozon.android.messenger.framework.core.viewmapper.e) parcel.readParcelable(u.class.getClassLoader()), d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i11) {
            return new u[i11];
        }
    }

    public u(@NotNull g blockVO, int i11, @NotNull ru.ozon.android.messenger.framework.core.viewmapper.e viewMapperType, @NotNull d blockInfo) {
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(viewMapperType, "viewMapperType");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        this.f91551a = blockVO;
        this.f91552b = i11;
        this.f91553c = viewMapperType;
        this.f91554d = blockInfo;
    }

    public static u a(u uVar, g blockVO) {
        int i11 = uVar.f91552b;
        ru.ozon.android.messenger.framework.core.viewmapper.e viewMapperType = uVar.f91553c;
        d blockInfo = uVar.f91554d;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(viewMapperType, "viewMapperType");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        return new u(blockVO, i11, viewMapperType, blockInfo);
    }

    @NotNull
    public final d b() {
        return this.f91554d;
    }

    @NotNull
    public final g c() {
        return this.f91551a;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.core.viewmapper.e d() {
        return this.f91553c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f91552b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f91551a, uVar.f91551a) && this.f91552b == uVar.f91552b && Intrinsics.d(this.f91553c, uVar.f91553c) && Intrinsics.d(this.f91554d, uVar.f91554d);
    }

    public final int hashCode() {
        return this.f91554d.hashCode() + ((this.f91553c.hashCode() + C2454a.a(this.f91552b, this.f91551a.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "MessengerVO(blockVO=" + this.f91551a + ", viewType=" + this.f91552b + ", viewMapperType=" + this.f91553c + ", blockInfo=" + this.f91554d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeValue(this.f91551a);
        dest.writeInt(this.f91552b);
        dest.writeParcelable(this.f91553c, i11);
        this.f91554d.writeToParcel(dest, i11);
    }

    public u(g gVar, int i11, ru.ozon.android.messenger.framework.core.viewmapper.e eVar) {
        this(gVar, i11, eVar, new d(0, ""));
    }
}
