package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcs;
import com.google.android.gms.internal.fitness.zzct;
import java.util.Arrays;
import xsna.dq70;
import xsna.j001;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new j001();

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final zzct d;

    public zzaw(@Nullable String str, @Nullable String str2, @Nullable IBinder iBinder) {
        this.b = str;
        this.c = str2;
        this.d = iBinder == null ? null : zzcs.zzb(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzawVar = (zzaw) obj;
        return dq70.b(this.b, zzawVar.b) && dq70.b(this.c, zzawVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "name");
        aVar.a(this.c, "identifier");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        zzct zzctVar = this.d;
        ozg0.h(parcel, 3, zzctVar == null ? null : zzctVar.asBinder());
        ozg0.x(w, parcel);
    }

    public zzaw(@Nullable String str, @Nullable String str2, @Nullable zzct zzctVar) {
        this.b = null;
        this.c = str2;
        this.d = zzctVar;
    }
}
