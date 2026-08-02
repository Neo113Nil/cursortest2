package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzfm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfm> CREATOR = new zzfl();
    public final String a;
    public final byte[] b;
    public final ArrayList c;

    public zzfm(String str, byte[] bArr, ArrayList arrayList) {
        this.a = str;
        this.b = bArr;
        this.c = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfm)) {
            return false;
        }
        zzfm zzfmVar = (zzfm) obj;
        return Objects.a(this.a, zzfmVar.a) && Objects.a(this.b, zzfmVar.b) && Objects.a(this.c, zzfmVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.c(parcel, 2, this.b, false);
        SafeParcelWriter.h(parcel, 3, new ArrayList(this.c));
        SafeParcelWriter.t(parcel, s);
    }
}
