package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class w implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    public static final w f32602b = new w(new x());

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable.Creator f32603a;

    public w(Parcelable.Creator creator) {
        this.f32603a = creator;
    }

    public static w a() {
        return f32602b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return x.a(parcel);
        }
        parcel.setDataPosition(dataPosition - 4);
        return ApiMetadata.h();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
