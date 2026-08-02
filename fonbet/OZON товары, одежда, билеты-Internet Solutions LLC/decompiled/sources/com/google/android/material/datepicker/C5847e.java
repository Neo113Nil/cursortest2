package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.C5843a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5847e implements C5843a.c {
    public static final Parcelable.Creator<C5847e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f58241a;

    /* renamed from: com.google.android.material.datepicker.e$a */
    final class a implements Parcelable.Creator<C5847e> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C5847e createFromParcel(@NonNull Parcel parcel) {
            return new C5847e(parcel.readLong(), 0);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C5847e[] newArray(int i11) {
            return new C5847e[i11];
        }
    }

    /* synthetic */ C5847e(long j11, int i11) {
        this(j11);
    }

    @NonNull
    public static C5847e a() {
        return new C5847e(Long.MIN_VALUE);
    }

    @Override // com.google.android.material.datepicker.C5843a.c
    public final boolean R(long j11) {
        return j11 >= this.f58241a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5847e) && this.f58241a == ((C5847e) obj).f58241a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f58241a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeLong(this.f58241a);
    }

    private C5847e(long j11) {
        this.f58241a = j11;
    }
}
