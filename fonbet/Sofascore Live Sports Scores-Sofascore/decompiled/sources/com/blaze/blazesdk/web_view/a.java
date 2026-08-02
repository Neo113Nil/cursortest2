package com.blaze.blazesdk.web_view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lnb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0022a();
    public final String a;
    public final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.web_view.a$a, reason: collision with other inner class name */
    public static final class C0022a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public static a copy$default(a aVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.b;
        }
        aVar.getClass();
        str2.getClass();
        return new a(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlazeWebActivityArgs(title=");
        sb.append(this.a);
        sb.append(", url=");
        return lnb.q(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public /* synthetic */ a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2);
    }
}
