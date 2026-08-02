package com.blaze.blazesdk.first_time_slide.models.args;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jxl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0018a();
    public final jxl a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.first_time_slide.models.args.a$a, reason: collision with other inner class name */
    public static final class C0018a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a((jxl) parcel.readValue(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(@Nullable jxl jxlVar) {
        this.a = jxlVar;
    }

    public static a copy$default(a aVar, jxl jxlVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jxlVar = aVar.a;
        }
        aVar.getClass();
        return new a(jxlVar);
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
        jxl jxlVar = this.a;
        if (jxlVar == null) {
            return 0;
        }
        return jxlVar.hashCode();
    }

    public final String toString() {
        return "FirstTimeSlideArgs(style=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeValue(this.a);
    }
}
