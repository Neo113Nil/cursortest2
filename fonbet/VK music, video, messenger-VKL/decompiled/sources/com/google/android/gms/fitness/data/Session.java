package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzgo;
import java.util.Arrays;
import xsna.dq70;
import xsna.fvz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class Session extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Session> CREATOR = new fvz0();
    public final long b;
    public final long c;

    @Nullable
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final zzb h;

    @Nullable
    public final Long i;

    public Session(long j, long j2, @Nullable String str, String str2, String str3, int i, zzb zzbVar, @Nullable Long l) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = zzbVar;
        this.i = l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return this.b == session.b && this.c == session.c && dq70.b(this.d, session.d) && dq70.b(this.e, session.e) && dq70.b(this.f, session.f) && dq70.b(this.h, session.h) && this.g == session.g;
    }

    @NonNull
    public final String getDescription() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.e});
    }

    @NonNull
    public final String i() {
        return zzgo.zzb(this.g);
    }

    @Nullable
    public final String j() {
        zzb zzbVar = this.h;
        if (zzbVar == null) {
            return null;
        }
        return zzbVar.b;
    }

    @NonNull
    public final String k() {
        return this.e;
    }

    @Nullable
    public final String l() {
        return this.d;
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(Long.valueOf(this.b), "startTime");
        aVar.a(Long.valueOf(this.c), "endTime");
        aVar.a(this.d, "name");
        aVar.a(this.e, "identifier");
        aVar.a(this.f, "description");
        aVar.a(Integer.valueOf(this.g), "activity");
        aVar.a(this.h, "application");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(this.g);
        ozg0.p(parcel, 8, this.h, i, false);
        ozg0.o(parcel, 9, this.i);
        ozg0.x(w, parcel);
    }
}
