package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.wearable.zzag;
import defpackage.fbn;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    public final Uri a;
    public final int b;

    public zzk(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzk)) {
            return false;
        }
        zzk zzkVar = (zzk) obj;
        return Objects.equals(this.a, zzkVar.a) && this.b == zzkVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        zzag zzagVar = new zzag(getClass().getSimpleName());
        zzagVar.a(this.a, "uri");
        String valueOf = String.valueOf(this.b);
        fbn fbnVar = new fbn(24, false);
        zzagVar.c.d = fbnVar;
        zzagVar.c = fbnVar;
        fbnVar.c = valueOf;
        fbnVar.b = "filterType";
        return zzagVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.t(parcel, s);
    }
}
