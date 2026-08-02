package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbf extends zza implements zzbg {
    @Override // com.google.android.gms.internal.cast.zzbg
    public final void C4(Bundle bundle, String str) {
        Parcel J = J();
        J.writeString(str);
        zzc.b(J, bundle);
        Z1(J, 4);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final void G3(Bundle bundle, String str) {
        Parcel J = J();
        J.writeString(str);
        zzc.b(J, bundle);
        Z1(J, 2);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final void V2(int i, Bundle bundle, String str, String str2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzc.b(J, bundle);
        J.writeInt(i);
        Z1(J, 10);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final void Z3(String str, Bundle bundle, String str2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzc.b(J, bundle);
        Z1(J, 8);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final void n4(Bundle bundle, String str) {
        Parcel J = J();
        J.writeString(str);
        zzc.b(J, bundle);
        Z1(J, 3);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final void r3(Bundle bundle, String str) {
        Parcel J = J();
        J.writeString(str);
        zzc.b(J, bundle);
        Z1(J, 1);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final void s4(String str, Bundle bundle, String str2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        zzc.b(J, bundle);
        Z1(J, 9);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final void y1(String str, int i, Bundle bundle) {
        Parcel J = J();
        J.writeString(str);
        zzc.b(J, bundle);
        J.writeInt(i);
        Z1(J, 6);
    }

    @Override // com.google.android.gms.internal.cast.zzbg
    public final int zze() {
        Parcel S1 = S1(J(), 7);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }
}
