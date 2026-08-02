package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import com.ironsource.InterfaceC4060ee;
import defpackage.ern;
import defpackage.krn;
import defpackage.osn;
import defpackage.wsn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzap extends zzau implements zzar {
    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle B1(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        int i2 = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        Parcel S1 = S1(J, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzaw.a(S1);
        S1.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void J3(String str, Bundle bundle, h hVar) {
        Parcel J = J();
        J.writeInt(25);
        J.writeString(str);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(hVar);
        l2(J, 2101);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void K2(String str, Bundle bundle, wsn wsnVar) {
        Parcel J = J();
        J.writeInt(24);
        J.writeString(str);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(wsnVar);
        l2(J, 1701);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void L0(Bundle bundle, zzab zzabVar) {
        Parcel J = J();
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(zzabVar.asBinder());
        l2(J, 2001);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int R0(int i, String str, String str2) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        J.writeString(str2);
        Parcel S1 = S1(J, 1);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void V(int i, String str, Bundle bundle, zzah zzahVar) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        int i2 = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(zzahVar.asBinder());
        l2(J, 1901);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle W(String str, Bundle bundle, String str2) {
        Parcel J = J();
        J.writeInt(9);
        J.writeString(str);
        J.writeString(str2);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        Parcel S1 = S1(J, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzaw.a(S1);
        S1.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void Y2(String str, Bundle bundle, ern ernVar) {
        Parcel J = J();
        J.writeInt(21);
        J.writeString(str);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(ernVar);
        l2(J, 1501);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void b2(String str, Bundle bundle, i iVar) {
        Parcel J = J();
        J.writeInt(12);
        J.writeString(str);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(iVar);
        Z1(J, InterfaceC4060ee.a.b);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void d2(String str, Bundle bundle, com.android.billingclient.api.e eVar) {
        Parcel J = J();
        J.writeInt(18);
        J.writeString(str);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(eVar);
        Z1(J, InterfaceC4060ee.c.e);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle g2(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        J.writeString(null);
        int i2 = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        Parcel S1 = S1(J, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzaw.a(S1);
        S1.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void h1(String str, Bundle bundle, osn osnVar) {
        Parcel J = J();
        J.writeInt(21);
        J.writeString(str);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(osnVar);
        l2(J, 1401);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle j4(String str, String str2, String str3) {
        Parcel J = J();
        J.writeInt(3);
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        J.writeString(null);
        Parcel S1 = S1(J, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(S1);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle k4(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        J.writeString(str2);
        int i2 = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeInt(1);
        bundle2.writeToParcel(J, 0);
        Parcel S1 = S1(J, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) zzaw.a(S1);
        S1.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle n2(String str, String str2, String str3) {
        Parcel J = J();
        J.writeInt(3);
        J.writeString(str);
        J.writeString(str2);
        J.writeString(str3);
        Parcel S1 = S1(J, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(S1);
        S1.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void p1(int i, String str, Bundle bundle, zzad zzadVar) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        int i2 = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(zzadVar.asBinder());
        l2(J, 1601);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final Bundle r0(String str, Bundle bundle, String str2) {
        Parcel J = J();
        J.writeInt(9);
        J.writeString(str);
        J.writeString(str2);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        Parcel S1 = S1(J, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) zzaw.a(S1);
        S1.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int t0(int i, Bundle bundle, String str, String str2) {
        Parcel J = J();
        J.writeInt(i);
        J.writeString(str);
        J.writeString(str2);
        int i2 = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        Parcel S1 = S1(J, 10);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final void v2(String str, Bundle bundle, krn krnVar) {
        Parcel J = J();
        J.writeInt(22);
        J.writeString(str);
        int i = zzaw.a;
        J.writeInt(1);
        bundle.writeToParcel(J, 0);
        J.writeStrongBinder(krnVar);
        l2(J, 1801);
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final int zza(String str, String str2) {
        Parcel J = J();
        J.writeInt(3);
        J.writeString(str);
        J.writeString(str2);
        Parcel S1 = S1(J, 5);
        int readInt = S1.readInt();
        S1.recycle();
        return readInt;
    }
}
