package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.q;
import k7.C7599c;
import s7.C9613h;

/* loaded from: classes9.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    private d f58501a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f58502b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f58503c;

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0886a();

        /* renamed from: a, reason: collision with root package name */
        int f58504a;

        /* renamed from: b, reason: collision with root package name */
        C9613h f58505b;

        /* renamed from: com.google.android.material.navigation.e$a$a, reason: collision with other inner class name */
        final class C0886a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel) {
                a aVar = new a();
                aVar.f58504a = parcel.readInt();
                aVar.f58505b = (C9613h) parcel.readParcelable(a.class.getClassLoader());
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeInt(this.f58504a);
            parcel.writeParcelable(this.f58505b, 0);
        }
    }

    public final void a() {
        this.f58503c = 1;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(g gVar, boolean z11) {
    }

    @Override // androidx.appcompat.view.menu.m
    @NonNull
    public final Parcelable c() {
        a aVar = new a();
        aVar.f58504a = this.f58501a.A();
        aVar.f58505b = C7599c.b(this.f58501a.h());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d(i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(boolean z11) {
        if (this.f58502b) {
            return;
        }
        if (z11) {
            this.f58501a.d();
        } else {
            this.f58501a.X();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void g(@NonNull Context context, @NonNull g gVar) {
        this.f58501a.a(gVar);
    }

    @Override // androidx.appcompat.view.menu.m
    public final int getId() {
        return this.f58503c;
    }

    public final void h(@NonNull d dVar) {
        this.f58501a = dVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean j(i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void k(@NonNull Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f58501a.W(aVar.f58504a);
            this.f58501a.D(C7599c.a(this.f58501a.getContext(), aVar.f58505b));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean l(q qVar) {
        return false;
    }

    public final void m(boolean z11) {
        this.f58502b = z11;
    }
}
