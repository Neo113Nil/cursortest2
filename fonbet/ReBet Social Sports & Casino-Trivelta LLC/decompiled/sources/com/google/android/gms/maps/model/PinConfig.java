package com.google.android.gms.maps.model;

import N9.b;
import N9.d;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public class PinConfig extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PinConfig> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f33239a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33240b;

    /* renamed from: c, reason: collision with root package name */
    public final Glyph f33241c;

    public static class Glyph extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<Glyph> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f33242a;

        /* renamed from: b, reason: collision with root package name */
        public Y9.b f33243b;

        /* renamed from: c, reason: collision with root package name */
        public int f33244c;

        /* renamed from: d, reason: collision with root package name */
        public int f33245d;

        public Glyph(String str, IBinder iBinder, int i10, int i11) {
            this.f33244c = -5041134;
            this.f33245d = -16777216;
            this.f33242a = str;
            this.f33243b = iBinder == null ? null : new Y9.b(b.a.c(iBinder));
            this.f33244c = i10;
            this.f33245d = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.f33244c != glyph.f33244c || !Objects.equals(this.f33242a, glyph.f33242a) || this.f33245d != glyph.f33245d) {
                return false;
            }
            Y9.b bVar = this.f33243b;
            if ((bVar == null && glyph.f33243b != null) || (bVar != null && glyph.f33243b == null)) {
                return false;
            }
            Y9.b bVar2 = glyph.f33243b;
            if (bVar == null || bVar2 == null) {
                return true;
            }
            return Objects.equals(d.g(bVar.a()), d.g(bVar2.a()));
        }

        public int g() {
            return this.f33244c;
        }

        public String h() {
            return this.f33242a;
        }

        public int hashCode() {
            return Objects.hash(this.f33242a, this.f33243b, Integer.valueOf(this.f33244c));
        }

        public int i() {
            return this.f33245d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = E9.b.a(parcel);
            E9.b.F(parcel, 2, h(), false);
            Y9.b bVar = this.f33243b;
            E9.b.t(parcel, 3, bVar == null ? null : bVar.a().asBinder(), false);
            E9.b.u(parcel, 4, g());
            E9.b.u(parcel, 5, i());
            E9.b.b(parcel, a10);
        }
    }

    public PinConfig(int i10, int i11, Glyph glyph) {
        this.f33239a = i10;
        this.f33240b = i11;
        this.f33241c = glyph;
    }

    public int g() {
        return this.f33239a;
    }

    public int h() {
        return this.f33240b;
    }

    public Glyph i() {
        return this.f33241c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, g());
        E9.b.u(parcel, 3, h());
        E9.b.D(parcel, 4, i(), i10, false);
        E9.b.b(parcel, a10);
    }
}
