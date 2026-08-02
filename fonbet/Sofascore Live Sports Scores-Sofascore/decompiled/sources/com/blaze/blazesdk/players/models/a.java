package com.blaze.blazesdk.players.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements InterfaceC1358b, BlazeParcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0020a();
    public final com.blaze.blazesdk.ads.ima.models.b a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.players.models.a$a, reason: collision with other inner class name */
    public static final class C0020a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(com.blaze.blazesdk.ads.ima.models.b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(@NotNull com.blaze.blazesdk.ads.ima.models.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    public static a copy$default(a aVar, com.blaze.blazesdk.ads.ima.models.b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = aVar.a;
        }
        aVar.getClass();
        bVar.getClass();
        return new a(bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Ima(imaModel=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
    }
}
