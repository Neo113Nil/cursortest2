package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5843a implements Parcelable {
    public static final Parcelable.Creator<C5843a> CREATOR = new C0882a();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final u f58215a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final u f58216b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final c f58217c;

    /* renamed from: d, reason: collision with root package name */
    private u f58218d;

    /* renamed from: e, reason: collision with root package name */
    private final int f58219e;

    /* renamed from: f, reason: collision with root package name */
    private final int f58220f;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    final class C0882a implements Parcelable.Creator<C5843a> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C5843a createFromParcel(@NonNull Parcel parcel) {
            return new C5843a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C5843a[] newArray(int i11) {
            return new C5843a[i11];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        static final long f58221e = C.a(u.b(1900, 0).f58310f);

        /* renamed from: f, reason: collision with root package name */
        static final long f58222f = C.a(u.b(2100, 11).f58310f);

        /* renamed from: a, reason: collision with root package name */
        private long f58223a;

        /* renamed from: b, reason: collision with root package name */
        private long f58224b;

        /* renamed from: c, reason: collision with root package name */
        private Long f58225c;

        /* renamed from: d, reason: collision with root package name */
        private c f58226d;

        b(@NonNull C5843a c5843a) {
            this.f58223a = f58221e;
            this.f58224b = f58222f;
            this.f58226d = C5847e.a();
            this.f58223a = c5843a.f58215a.f58310f;
            this.f58224b = c5843a.f58216b.f58310f;
            this.f58225c = Long.valueOf(c5843a.f58218d.f58310f);
            this.f58226d = c5843a.f58217c;
        }

        @NonNull
        public final C5843a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f58226d);
            u c11 = u.c(this.f58223a);
            u c12 = u.c(this.f58224b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l11 = this.f58225c;
            return new C5843a(c11, c12, cVar, l11 == null ? null : u.c(l11.longValue()));
        }

        @NonNull
        public final void b(long j11) {
            this.f58225c = Long.valueOf(j11);
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends Parcelable {
        boolean R(long j11);
    }

    C5843a(u uVar, u uVar2, c cVar, u uVar3) {
        this.f58215a = uVar;
        this.f58216b = uVar2;
        this.f58218d = uVar3;
        this.f58217c = cVar;
        if (uVar3 != null && uVar.compareTo(uVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (uVar3 != null && uVar3.compareTo(uVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f58220f = uVar.k(uVar2) + 1;
        this.f58219e = (uVar2.f58307c - uVar.f58307c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    final u e(u uVar) {
        u uVar2 = this.f58215a;
        if (uVar.compareTo(uVar2) < 0) {
            return uVar2;
        }
        u uVar3 = this.f58216b;
        return uVar.compareTo(uVar3) > 0 ? uVar3 : uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5843a)) {
            return false;
        }
        C5843a c5843a = (C5843a) obj;
        return this.f58215a.equals(c5843a.f58215a) && this.f58216b.equals(c5843a.f58216b) && Objects.equals(this.f58218d, c5843a.f58218d) && this.f58217c.equals(c5843a.f58217c);
    }

    public final c f() {
        return this.f58217c;
    }

    @NonNull
    final u g() {
        return this.f58216b;
    }

    final int h() {
        return this.f58220f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f58215a, this.f58216b, this.f58218d, this.f58217c});
    }

    final u i() {
        return this.f58218d;
    }

    @NonNull
    final u j() {
        return this.f58215a;
    }

    final int k() {
        return this.f58219e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f58215a, 0);
        parcel.writeParcelable(this.f58216b, 0);
        parcel.writeParcelable(this.f58218d, 0);
        parcel.writeParcelable(this.f58217c, 0);
    }
}
