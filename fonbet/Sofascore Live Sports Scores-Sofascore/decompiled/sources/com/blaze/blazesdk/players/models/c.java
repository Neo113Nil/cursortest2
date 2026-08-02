package com.blaze.blazesdk.players.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.u0a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c implements BlazeParcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();
    public boolean a;
    public boolean b;
    public final InterfaceC1358b c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() != 0, parcel.readInt() != 0, (InterfaceC1358b) parcel.readParcelable(c.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public /* synthetic */ c(boolean z, boolean z2, InterfaceC1358b interfaceC1358b, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, interfaceC1358b);
    }

    public static c copy$default(c cVar, boolean z, boolean z2, InterfaceC1358b interfaceC1358b, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cVar.a;
        }
        if ((i & 2) != 0) {
            z2 = cVar.b;
        }
        if ((i & 4) != 0) {
            interfaceC1358b = cVar.c;
        }
        cVar.getClass();
        interfaceC1358b.getClass();
        return new c(z, z2, interfaceC1358b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && Intrinsics.c(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u0a.t(Boolean.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        return "BlazeExternalContentToShow(didShow=" + this.a + ", shouldShow=" + this.b + ", content=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }

    public c(boolean z, boolean z2, @NotNull InterfaceC1358b interfaceC1358b) {
        interfaceC1358b.getClass();
        this.a = z;
        this.b = z2;
        this.c = interfaceC1358b;
    }
}
