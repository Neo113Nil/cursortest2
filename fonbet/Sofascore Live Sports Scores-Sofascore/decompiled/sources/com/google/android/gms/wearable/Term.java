package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class Term extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Term> CREATOR = new zzr();
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;

    public Term(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = i;
        this.d = str2;
        this.c = z;
        this.b = str;
        this.e = str3;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.m(parcel, 5, this.e, false);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f);
        SafeParcelWriter.t(parcel, s);
    }
}
