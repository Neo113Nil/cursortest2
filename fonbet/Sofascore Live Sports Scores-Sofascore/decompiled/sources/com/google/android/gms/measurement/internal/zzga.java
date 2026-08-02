package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import com.ironsource.Ua;
import defpackage.een;
import defpackage.jgo;
import defpackage.kro;
import defpackage.nkn;
import defpackage.z1p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzga extends zzbm implements zzgb {
    public zzga() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        List list;
        ArrayList arrayList = null;
        zzge zzgeVar = null;
        zzgh zzghVar = null;
        int i2 = 1;
        switch (i) {
            case 1:
                zzbh zzbhVar = (zzbh) zzbn.a(parcel, zzbh.CREATOR);
                zzr zzrVar = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).o4(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) zzbn.a(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).j1(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).L3(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbh zzbhVar2 = (zzbh) zzbn.a(parcel, zzbh.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                zzbn.d(parcel);
                zzjd zzjdVar = (zzjd) this;
                Preconditions.i(zzbhVar2);
                Preconditions.f(readString);
                zzjdVar.l2(readString, true);
                zzjdVar.D4(new jgo(zzjdVar, zzbhVar2, readString, 5));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).U0(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                zzbn.d(parcel);
                zzjd zzjdVar2 = (zzjd) this;
                zzjdVar2.Z1(zzrVar5);
                String str = zzrVar5.a;
                Preconditions.i(str);
                zzpg zzpgVar = zzjdVar2.a;
                try {
                    List<z1p> list2 = (List) zzpgVar.d().X(new een(zzjdVar2, str, r0, 17)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (z1p z1pVar : list2) {
                        if (objArr == false && zzpp.u0(z1pVar.c)) {
                        }
                        arrayList2.add(new zzpl(z1pVar));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    zzpgVar.b().g.c(zzgu.U(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    zzpgVar.b().g.c(zzgu.U(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbh zzbhVar3 = (zzbh) zzbn.a(parcel, zzbh.CREATOR);
                String readString2 = parcel.readString();
                zzbn.d(parcel);
                byte[] H0 = ((zzjd) this).H0(zzbhVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(H0);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                zzbn.d(parcel);
                ((zzjd) this).y2(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                String O1 = ((zzjd) this).O1(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(O1);
                return true;
            case 12:
                zzah zzahVar = (zzah) zzbn.a(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).P(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) zzbn.a(parcel, zzah.CREATOR);
                zzbn.d(parcel);
                zzjd zzjdVar3 = (zzjd) this;
                Preconditions.i(zzahVar2);
                Preconditions.i(zzahVar2.c);
                Preconditions.f(zzahVar2.a);
                zzjdVar3.l2(zzahVar2.a, true);
                zzjdVar3.D4(new nkn(29, zzjdVar3, new zzah(zzahVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = zzbn.a;
                r0 = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                List i4 = ((zzjd) this).i4(readString6, readString7, r0, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(i4);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = zzbn.a;
                boolean z = parcel.readInt() != 0;
                zzbn.d(parcel);
                List O = ((zzjd) this).O(readString8, readString9, readString10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(O);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzr zzrVar9 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                List r4 = ((zzjd) this).r4(readString11, readString12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(r4);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                zzbn.d(parcel);
                List A0 = ((zzjd) this).A0(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(A0);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).B2(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).x3(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).y4(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                zzao w3 = ((zzjd) this).w3(zzrVar13);
                parcel2.writeNoException();
                if (w3 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                w3.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                zzbn.d(parcel);
                zzjd zzjdVar4 = (zzjd) this;
                zzjdVar4.Z1(zzrVar14);
                String str2 = zzrVar14.a;
                Preconditions.i(str2);
                zzpg zzpgVar2 = zzjdVar4.a;
                if (zzpgVar2.f0().b0(null, zzfy.T0)) {
                    try {
                        list = (List) zzpgVar2.d().Y(new kro(zzjdVar4, zzrVar14, bundle2, r0 ? 1 : 0)).get(Ua.s, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        zzpgVar2.b().g.c(zzgu.U(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) zzpgVar2.d().X(new kro(zzjdVar4, zzrVar14, bundle2, i2)).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        zzpgVar2.b().g.c(zzgu.U(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).K0(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).X0(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).b4(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) zzbn.a(parcel, zzoo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    zzghVar = queryLocalInterface instanceof zzgh ? (zzgh) queryLocalInterface : new zzgf(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                }
                zzbn.d(parcel);
                ((zzjd) this).L(zzrVar18, zzooVar, zzghVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) zzbn.a(parcel, zzaf.CREATOR);
                zzbn.d(parcel);
                ((zzjd) this).k3(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) zzbn.a(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    zzgeVar = queryLocalInterface2 instanceof zzge ? (zzge) queryLocalInterface2 : new zzgc(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                }
                zzbn.d(parcel);
                ((zzjd) this).c3(zzrVar20, bundle3, zzgeVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
