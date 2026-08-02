package s7;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k1 extends com.google.android.gms.internal.measurement.y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final r3 f22848a;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f22849f;

    /* renamed from: g, reason: collision with root package name */
    public String f22850g;

    public k1(r3 r3Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        g6.v.h(r3Var);
        this.f22848a = r3Var;
        this.f22850g = null;
    }

    @Override // s7.a0
    public final void A(Bundle bundle, zzr zzrVar) {
        f(zzrVar);
        String str = zzrVar.f5820a;
        g6.v.h(str);
        O(new androidx.appcompat.view.menu.f(this, bundle, str, zzrVar, 4, false));
    }

    @Override // s7.a0
    public final void C(zzr zzrVar, zzoo zzooVar, e0 e0Var) {
        f(zzrVar);
        String str = zzrVar.f5820a;
        g6.v.h(str);
        this.f22848a.b().s(new androidx.appcompat.view.menu.f(this, str, zzooVar, e0Var, 2, false));
    }

    @Override // s7.a0
    public final void D(zzr zzrVar) {
        f(zzrVar);
        O(new g1(this, zzrVar, 0));
    }

    @Override // s7.a0
    public final void G(zzr zzrVar) {
        f(zzrVar);
        O(new g1(this, zzrVar, 1));
    }

    @Override // s7.a0
    public final List I(String str, String str2, boolean z5, zzr zzrVar) {
        f(zzrVar);
        String str3 = zzrVar.f5820a;
        g6.v.h(str3);
        r3 r3Var = this.f22848a;
        try {
            List<t3> list = (List) r3Var.b().q(new i1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (t3 t3Var : list) {
                if (!z5 && v3.J(t3Var.f23096c)) {
                }
                arrayList.add(new zzpl(t3Var));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            r3Var.a().f22903f.c(n0.r(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            r3Var.a().f22903f.c(n0.r(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.a0
    public final String J(zzr zzrVar) {
        f(zzrVar);
        r3 r3Var = this.f22848a;
        try {
            return (String) r3Var.b().q(new com.android.billingclient.api.y0(r3Var, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            r3Var.a().f22903f.c(n0.r(zzrVar.f5820a), e7, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // s7.a0
    public final List K(String str, String str2, zzr zzrVar) {
        f(zzrVar);
        String str3 = zzrVar.f5820a;
        g6.v.h(str3);
        r3 r3Var = this.f22848a;
        try {
            return (List) r3Var.b().q(new i1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            r3Var.a().f22903f.b(e7, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.a0
    public final void L(zzr zzrVar, Bundle bundle, c0 c0Var) {
        f(zzrVar);
        String str = zzrVar.f5820a;
        g6.v.h(str);
        this.f22848a.b().s(new io.sentry.android.replay.z(this, zzrVar, bundle, c0Var, str));
    }

    @Override // s7.a0
    public final void M(zzr zzrVar) {
        g6.v.e(zzrVar.f5820a);
        g6.v.h(zzrVar.f5836s);
        e(new g1(this, zzrVar, 4));
    }

    public final void N(String str, boolean z5) {
        boolean isEmpty = TextUtils.isEmpty(str);
        r3 r3Var = this.f22848a;
        if (isEmpty) {
            r3Var.a().f22903f.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z5) {
            try {
                if (this.f22849f == null) {
                    boolean z7 = true;
                    if (!"com.google.android.gms".equals(this.f22850g) && !q6.b.f(r3Var.f22997l.f22740a, Binder.getCallingUid()) && !c6.h.a(r3Var.f22997l.f22740a).b(Binder.getCallingUid())) {
                        z7 = false;
                    }
                    this.f22849f = Boolean.valueOf(z7);
                }
                if (this.f22849f.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                r3Var.a().f22903f.b(n0.r(str), "Measurement Service called with invalid calling package. appId");
                throw e7;
            }
        }
        if (this.f22850g == null) {
            Context context = r3Var.f22997l.f22740a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = c6.g.f3661a;
            if (q6.b.h(context, callingUid, str)) {
                this.f22850g = str;
            }
        }
        if (str.equals(this.f22850g)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void O(Runnable runnable) {
        r3 r3Var = this.f22848a;
        if (r3Var.b().p()) {
            runnable.run();
        } else {
            r3Var.b().s(runnable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i5, Parcel parcel, Parcel parcel2) {
        List list;
        r3 r3Var = this.f22848a;
        ArrayList arrayList = null;
        c0 c0Var = null;
        e0 e0Var = null;
        int i10 = 1;
        switch (i5) {
            case 1:
                zzbg zzbgVar = (zzbg) com.google.android.gms.internal.measurement.z.a(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                q(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) com.google.android.gms.internal.measurement.z.a(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                x(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                D(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) com.google.android.gms.internal.measurement.z.a(parcel, zzbg.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                g6.v.h(zzbgVar2);
                g6.v.e(readString);
                N(readString, true);
                O(new b6.i((Object) this, (AbstractSafeParcelable) zzbgVar2, (Object) readString, 10));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                r(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                r0 = parcel.readInt() != 0 ? 1 : 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                f(zzrVar5);
                String str = zzrVar5.f5820a;
                g6.v.h(str);
                try {
                    List<t3> list2 = (List) r3Var.b().q(new com.android.billingclient.api.y0(this, str, i10)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (t3 t3Var : list2) {
                        if (r0 == 0 && v3.J(t3Var.f23096c)) {
                        }
                        arrayList2.add(new zzpl(t3Var));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e7) {
                    e = e7;
                    r3Var.a().f22903f.c(n0.r(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e9) {
                    e = e9;
                    r3Var.a().f22903f.c(n0.r(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) com.google.android.gms.internal.measurement.z.a(parcel, zzbg.CREATOR);
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                byte[] v5 = v(zzbgVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(v5);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                j(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                String J = J(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(J);
                return true;
            case 12:
                zzah zzahVar = (zzah) com.google.android.gms.internal.measurement.z.a(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                h(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) com.google.android.gms.internal.measurement.z.a(parcel, zzah.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                g6.v.h(zzahVar2);
                g6.v.h(zzahVar2.f5787c);
                g6.v.e(zzahVar2.f5785a);
                N(zzahVar2.f5785a, true);
                O(new w0(2, this, new zzah(zzahVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f5372a;
                boolean z5 = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List I = I(readString6, readString7, z5, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(I);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.z.f5372a;
                boolean z7 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                List g10 = g(readString8, readString9, readString10, z7);
                parcel2.writeNoException();
                parcel2.writeTypedList(g10);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzr zzrVar9 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List K = K(readString11, readString12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(K);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                List m6 = m(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(m6);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                k(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                A(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                M(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                zzao y5 = y(zzrVar13);
                parcel2.writeNoException();
                if (y5 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                y5.writeToParcel(parcel2, 1);
                return true;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                zzr zzrVar14 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                f(zzrVar14);
                String str2 = zzrVar14.f5820a;
                g6.v.h(str2);
                if (r3Var.e0().t(null, x.Z0)) {
                    try {
                        list = (List) r3Var.b().r(new j1(this, zzrVar14, bundle2, r0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                        r3Var.a().f22903f.c(n0.r(str2), e10, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) r3Var.b().q(new j1(this, zzrVar14, bundle2, i10)).get();
                    } catch (InterruptedException | ExecutionException e11) {
                        r3Var.a().f22903f.c(n0.r(str2), e11, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case C0122e9.F /* 25 */:
                zzr zzrVar15 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                n(zzrVar15);
                parcel2.writeNoException();
                return true;
            case C0122e9.G /* 26 */:
                zzr zzrVar16 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                s(zzrVar16);
                parcel2.writeNoException();
                return true;
            case C0122e9.H /* 27 */:
                zzr zzrVar17 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                G(zzrVar17);
                parcel2.writeNoException();
                return true;
            case C0122e9.I /* 29 */:
                zzr zzrVar18 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) com.google.android.gms.internal.measurement.z.a(parcel, zzoo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    e0Var = queryLocalInterface instanceof e0 ? (e0) queryLocalInterface : new d0(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                C(zzrVar18, zzooVar, e0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) com.google.android.gms.internal.measurement.z.a(parcel, zzaf.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                u(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c0Var = queryLocalInterface2 instanceof c0 ? (c0) queryLocalInterface2 : new b0(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                L(zzrVar20, bundle3, c0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void e(Runnable runnable) {
        r3 r3Var = this.f22848a;
        if (r3Var.b().p()) {
            runnable.run();
        } else {
            r3Var.b().u(runnable);
        }
    }

    public final void f(zzr zzrVar) {
        g6.v.h(zzrVar);
        String str = zzrVar.f5820a;
        g6.v.e(str);
        N(str, false);
        this.f22848a.k0().n(zzrVar.f5821b);
    }

    @Override // s7.a0
    public final List g(String str, String str2, String str3, boolean z5) {
        N(str, true);
        r3 r3Var = this.f22848a;
        try {
            List<t3> list = (List) r3Var.b().q(new i1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (t3 t3Var : list) {
                if (!z5 && v3.J(t3Var.f23096c)) {
                }
                arrayList.add(new zzpl(t3Var));
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            r3Var.a().f22903f.c(n0.r(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e9) {
            e = e9;
            r3Var.a().f22903f.c(n0.r(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.a0
    public final void h(zzah zzahVar, zzr zzrVar) {
        g6.v.h(zzahVar);
        g6.v.h(zzahVar.f5787c);
        f(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f5785a = zzrVar.f5820a;
        O(new b6.i((Object) this, (AbstractSafeParcelable) zzahVar2, (Object) zzrVar, 8));
    }

    @Override // s7.a0
    public final void j(long j, String str, String str2, String str3) {
        O(new h1(this, str2, str3, str, j, 0));
    }

    @Override // s7.a0
    public final void k(zzr zzrVar) {
        String str = zzrVar.f5820a;
        g6.v.e(str);
        N(str, false);
        O(new g1(this, zzrVar, 3));
    }

    @Override // s7.a0
    public final List m(String str, String str2, String str3) {
        N(str, true);
        r3 r3Var = this.f22848a;
        try {
            return (List) r3Var.b().q(new i1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            r3Var.a().f22903f.b(e7, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // s7.a0
    public final void n(zzr zzrVar) {
        g6.v.e(zzrVar.f5820a);
        g6.v.h(zzrVar.f5836s);
        e(new g1(this, zzrVar, 6));
    }

    @Override // s7.a0
    public final void q(zzbg zzbgVar, zzr zzrVar) {
        g6.v.h(zzbgVar);
        f(zzrVar);
        O(new b6.i((Object) this, (AbstractSafeParcelable) zzbgVar, (Object) zzrVar, 9));
    }

    @Override // s7.a0
    public final void r(zzr zzrVar) {
        f(zzrVar);
        O(new g1(this, zzrVar, 2));
    }

    @Override // s7.a0
    public final void s(zzr zzrVar) {
        g6.v.e(zzrVar.f5820a);
        g6.v.h(zzrVar.f5836s);
        e(new g1(this, zzrVar, 5));
    }

    @Override // s7.a0
    public final void u(zzr zzrVar, zzaf zzafVar) {
        f(zzrVar);
        O(new b6.i((Object) this, (Object) zzrVar, (Object) zzafVar, 12));
    }

    @Override // s7.a0
    public final byte[] v(zzbg zzbgVar, String str) {
        g6.v.e(str);
        g6.v.h(zzbgVar);
        N(str, true);
        r3 r3Var = this.f22848a;
        l0 l0Var = r3Var.a().f22909m;
        f1 f1Var = r3Var.f22997l;
        i0 i0Var = f1Var.j;
        String str2 = zzbgVar.f5797a;
        l0Var.b(i0Var.a(str2), "Log and bundle. event");
        r3Var.f().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) r3Var.b().r(new com.android.billingclient.api.f0(this, zzbgVar, str)).get();
            if (bArr == null) {
                r3Var.a().f22903f.b(n0.r(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            r3Var.f().getClass();
            r3Var.a().f22909m.d("Log and bundle processed. event, size, time_ms", f1Var.j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e7) {
            e = e7;
            r3Var.a().f22903f.d("Failed to log and bundle. appId, event, error", n0.r(str), f1Var.j.a(str2), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            r3Var.a().f22903f.d("Failed to log and bundle. appId, event, error", n0.r(str), f1Var.j.a(str2), e);
            return null;
        }
    }

    @Override // s7.a0
    public final void x(zzpl zzplVar, zzr zzrVar) {
        g6.v.h(zzplVar);
        f(zzrVar);
        O(new b6.i((Object) this, (AbstractSafeParcelable) zzplVar, (Object) zzrVar, 11));
    }

    @Override // s7.a0
    public final zzao y(zzr zzrVar) {
        f(zzrVar);
        String str = zzrVar.f5820a;
        g6.v.e(str);
        r3 r3Var = this.f22848a;
        try {
            return (zzao) r3Var.b().r(new com.android.billingclient.api.y0(this, zzrVar, 2)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            r3Var.a().f22903f.c(n0.r(str), e7, "Failed to get consent. appId");
            return new zzao(null);
        }
    }
}
