package com.yalantis.ucrop.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f42279a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42280b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42281c;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AspectRatio createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AspectRatio[] newArray(int i10) {
            return new AspectRatio[i10];
        }
    }

    public AspectRatio(String str, float f10, float f11) {
        this.f42279a = str;
        this.f42280b = f10;
        this.f42281c = f11;
    }

    public String a() {
        return this.f42279a;
    }

    public float b() {
        return this.f42280b;
    }

    public float c() {
        return this.f42281c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42279a);
        parcel.writeFloat(this.f42280b);
        parcel.writeFloat(this.f42281c);
    }

    public AspectRatio(Parcel parcel) {
        this.f42279a = parcel.readString();
        this.f42280b = parcel.readFloat();
        this.f42281c = parcel.readFloat();
    }
}
