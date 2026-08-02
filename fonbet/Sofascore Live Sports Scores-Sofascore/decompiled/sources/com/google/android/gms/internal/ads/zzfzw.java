package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzfzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfzw> CREATOR = new zzfzx();
    public final int a;
    public final byte[] b;
    public final int c;

    public zzfzw(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.c(parcel, 2, this.b, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.t(parcel, s);
    }

    public zzfzw() {
        this(1, 1, null);
    }
}
