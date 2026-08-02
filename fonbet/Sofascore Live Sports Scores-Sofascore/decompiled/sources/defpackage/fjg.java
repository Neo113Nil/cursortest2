package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzekm;
import com.google.android.gms.internal.ads.zzeks;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.play_billing.zzkw;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import com.ironsource.U3;
import com.moloco.sdk.internal.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class fjg implements wif, xfc, f, zzg, RemoteCall, zzfpi {
    public static fjg c;
    public boolean a;
    public Object b;

    public fjg(boolean z) {
        this.b = rto.JAVASCRIPT;
        this.a = z;
    }

    public static synchronized fjg c() {
        fjg fjgVar;
        hjg hjgVar;
        synchronized (fjg.class) {
            fjgVar = c;
            if (fjgVar == null) {
                ejg.p().getClass();
                synchronized (hjg.class) {
                    hjgVar = hjg.a;
                    if (hjgVar == null) {
                        hjgVar = new hjg();
                        hjg.a = hjgVar;
                    }
                }
                fjgVar = new fjg("SCSLibrary", hjgVar, ((Boolean) ejg.p().c).booleanValue());
                c = fjgVar;
            }
        }
        return fjgVar;
    }

    public boolean a() {
        return this.a;
    }

    @Override // defpackage.xfc
    public void b(vec vecVar, boolean z) {
        dc dcVar;
        fkj fkjVar = (fkj) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        ActionMenuView actionMenuView = fkjVar.m.a.a;
        if (actionMenuView != null && (dcVar = actionMenuView.e) != null) {
            dcVar.j();
            ac acVar = dcVar.r;
            if (acVar != null && acVar.b()) {
                acVar.j.dismiss();
            }
        }
        fkjVar.n.onPanelClosed(108, vecVar);
        this.a = false;
    }

    public void d() {
        this.a = true;
    }

    public boolean e(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            ilg.c();
            return false;
        }
        if (((tnf) this.b) == null) {
            return a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            fjg fjgVar = a9j.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return a();
        }
        return false;
    }

    public void f(int i) {
        if (!(i == 1 && this.a) && ((gjg) this.b).b(i)) {
            wt3.C(i);
        }
    }

    public void g() {
        this.a = false;
    }

    @Override // defpackage.wif
    public void h(vif vifVar, int i) {
        StringBuilder sb = (StringBuilder) this.b;
        if (this.a) {
            this.a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void i() {
        this.a = false;
    }

    public void j(byte b) {
        ((yz1) this.b).g(String.valueOf(b));
    }

    @Override // defpackage.xfc
    public boolean k(vec vecVar) {
        ((fkj) this.b).n.onMenuOpened(108, vecVar);
        return true;
    }

    public void l(char c2) {
        yz1 yz1Var = (yz1) this.b;
        yz1Var.a(yz1Var.b, 1);
        char[] cArr = (char[]) yz1Var.c;
        int i = yz1Var.b;
        yz1Var.b = i + 1;
        cArr[i] = c2;
    }

    public void m(int i) {
        ((yz1) this.b).g(String.valueOf(i));
    }

    public void n(long j) {
        ((yz1) this.b).g(String.valueOf(j));
    }

    public void o(String str) {
        str.getClass();
        ((yz1) this.b).g(str);
    }

    public void p(short s) {
        ((yz1) this.b).g(String.valueOf(s));
    }

    public void q(String str) {
        int i;
        str.getClass();
        yz1 yz1Var = (yz1) this.b;
        yz1Var.a(yz1Var.b, str.length() + 2);
        char[] cArr = (char[]) yz1Var.c;
        int i2 = yz1Var.b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c2 = cArr[i5];
            byte[] bArr = thi.b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    yz1Var.a(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = thi.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) yz1Var.c)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = thi.a[charAt];
                                str2.getClass();
                                yz1Var.a(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) yz1Var.c, i5);
                                int length3 = str2.length() + i5;
                                yz1Var.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) yz1Var.c;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                yz1Var.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) yz1Var.c)[i5] = charAt;
                    }
                    i5 = i;
                }
                yz1Var.a(i5, 1);
                ((char[]) yz1Var.c)[i5] = '\"';
                yz1Var.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        yz1Var.b = i4 + 1;
    }

    public synchronized void r(e1g e1gVar, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                e1gVar.c();
                this.a = false;
            }
            ((Handler) this.b).obtainMessage(1, e1gVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzbm zzbmVar = (zzbm) this.b;
        boolean z = this.a;
        zzy zzyVar = (zzy) anyClient;
        zzah zzahVar = (zzah) zzyVar.getService();
        double d = zzbmVar.w;
        boolean z2 = zzbmVar.x;
        zzyVar.getContext();
        ApiMetadata a = zzff.a();
        Parcel J = zzahVar.J();
        int i = zzc.a;
        J.writeInt(z ? 1 : 0);
        J.writeDouble(d);
        J.writeInt(z2 ? 1 : 0);
        zzc.b(J, a);
        zzahVar.l2(J, 8);
        taskCompletionSource.setResult(null);
    }

    public void v(zzkw zzkwVar) {
        if (this.a) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            return;
        }
        try {
            ((p03) this.b).x(new cu0(null, zzkwVar, i7f.a, null), new ogj(15));
        } catch (Throwable unused) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Object zza(Object obj) {
        long j;
        zzeks zzeksVar = (zzeks) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.a) {
            zzeksVar.b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzbil.zzaf.zza.U(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzige e) {
                int i = zze.zza;
                zzo.zzf("Unable to deserialize proto from offline signals database:");
                zzo.zzf(e.getMessage());
            }
        }
        query.close();
        Context context = zzeksVar.b;
        zzbil.zzaf.zzc D = zzbil.zzaf.D();
        String packageName = context.getPackageName();
        D.n();
        ((zzbil.zzaf) D.b).L(packageName);
        String str = Build.MODEL;
        D.n();
        ((zzbil.zzaf) D.b).M();
        int a = zzekm.a(sQLiteDatabase, 0);
        D.n();
        ((zzbil.zzaf) D.b).I(a);
        D.n();
        ((zzbil.zzaf) D.b).H(arrayList);
        int a2 = zzekm.a(sQLiteDatabase, 1);
        D.n();
        ((zzbil.zzaf) D.b).J(a2);
        int a3 = zzekm.a(sQLiteDatabase, 3);
        D.n();
        ((zzbil.zzaf) D.b).F(a3);
        long a4 = zzt.zzk().a();
        D.n();
        ((zzbil.zzaf) D.b).K(a4);
        Cursor c2 = zzekm.c(sQLiteDatabase, 2);
        if (c2.getCount() > 0) {
            c2.moveToNext();
            j = c2.getLong(c2.getColumnIndexOrThrow(U3.i.X));
        } else {
            j = 0;
        }
        c2.close();
        D.n();
        ((zzbil.zzaf) D.b).E(j);
        zzbil.zzaf zzafVar = (zzbil.zzaf) D.o();
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zzbil.zzaf.zza zzaVar = (zzbil.zzaf.zza) arrayList.get(i2);
            if (zzaVar.S() == zzbil.zzq.ENUM_TRUE && zzaVar.L() > j2) {
                j2 = zzaVar.L();
            }
        }
        if (j2 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(U3.i.X, Long.valueOf(j2));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        zzbif zzbifVar = zzeksVar.a;
        synchronized (zzbifVar) {
            if (zzbifVar.c) {
                try {
                    zzbil.zzt.zza zzaVar2 = zzbifVar.b;
                    zzaVar2.n();
                    ((zzbil.zzt) zzaVar2.b).N(zzafVar);
                } catch (NullPointerException e2) {
                    zzt.zzh().d("AdMobClearcutLogger.modify", e2);
                }
            }
            VersionInfoParcel versionInfoParcel = zzeksVar.c;
            zzbil.zzar.zza H = zzbil.zzar.H();
            int i3 = versionInfoParcel.buddyApkVersion;
            H.n();
            ((zzbil.zzar) H.b).E(i3);
            int i4 = versionInfoParcel.clientJarVersion;
            H.n();
            ((zzbil.zzar) H.b).F(i4);
            int i5 = true != versionInfoParcel.isClientJar ? 2 : 0;
            H.n();
            ((zzbil.zzar) H.b).G(i5);
            zzbil.zzar zzarVar = (zzbil.zzar) H.o();
            synchronized (zzbifVar) {
                if (zzbifVar.c) {
                    try {
                        zzbil.zzt.zza zzaVar3 = zzbifVar.b;
                        zzbil.zzm.zza zzaVar4 = (zzbil.zzm.zza) ((zzbil.zzt) zzaVar3.b).D().w();
                        zzaVar4.n();
                        ((zzbil.zzm) zzaVar4.b).G(zzarVar);
                        zzaVar3.n();
                        ((zzbil.zzt) zzaVar3.b).L((zzbil.zzm) zzaVar4.o());
                    } catch (NullPointerException e3) {
                        zzt.zzh().d("AdMobClearcutLogger.modify", e3);
                    }
                }
            }
        }
        zzbifVar.c(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzekm.d(sQLiteDatabase, "failed_requests");
        zzekm.d(sQLiteDatabase, "total_requests");
        zzekm.d(sQLiteDatabase, "completed_requests");
        return null;
    }

    public /* synthetic */ fjg(Object obj, byte b) {
        this.b = obj;
        this.a = true;
    }

    public /* synthetic */ fjg(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public /* synthetic */ fjg(Object obj) {
        this.b = obj;
    }

    public fjg(String str, gjg gjgVar, boolean z) {
        this.b = gjgVar;
        this.a = z;
    }

    public fjg(tnf tnfVar, boolean z) {
        this(tnfVar);
        this.a = z;
    }

    public void s() {
    }

    public void t() {
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public Object zza() {
        return HsdpDeepLinkServiceFactory.lambda$createInternal$0((Context) this.b, this.a);
    }
}
