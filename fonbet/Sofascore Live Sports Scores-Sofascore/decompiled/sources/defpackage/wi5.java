package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpk;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wi5 implements qh2 {
    public static final long[] e = new long[0];
    public long a;
    public Object b;
    public Object c;
    public final Object d;

    public wi5(cui cuiVar, long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.a = timeUnit.toNanos(j);
        this.b = cuiVar.d();
        this.c = new f45(1, this, mz1.o(new StringBuilder(), yol.b, " ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
        if (j > 0) {
            return;
        }
        ogj.h(vxd.l(j, "keepAliveDuration <= 0: "));
        throw null;
    }

    public int a(qof qofVar, long j) {
        TimeZone timeZone = yol.a;
        ArrayList arrayList = qofVar.q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + qofVar.c.a.h + " was leaked. Did you forget to close a response body?";
                gie gieVar = gie.a;
                gie.a.j(((nof) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    qofVar.r = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        if (r14 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzhs b(zzhs zzhsVar, String str) {
        Cursor cursor;
        zzhs zzhsVar2;
        long j;
        Cursor cursor2;
        Pair pair;
        Object obj;
        Pair pair2;
        String D = zzhsVar.D();
        List A = zzhsVar.A();
        t9n t9nVar = (t9n) this.d;
        zzpg zzpgVar = t9nVar.c;
        zzic zzicVar = (zzic) t9nVar.b;
        zzpgVar.k0();
        zzhw a0 = zzpk.a0(zzhsVar, "_eid");
        Long l = (Long) (a0 == null ? null : zzpk.i0(a0));
        if (l != null) {
            if (D.equals("_ep")) {
                zzpgVar.k0();
                zzhw a02 = zzpk.a0(zzhsVar, "_en");
                String str2 = (String) (a02 == null ? null : zzpk.i0(a02));
                if (TextUtils.isEmpty(str2)) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.h.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((zzhs) this.b) == null || ((Long) this.c) == null || l.longValue() != ((Long) this.c).longValue()) {
                    hkn hknVar = zzpgVar.c;
                    zzpg.U(hknVar);
                    zzic zzicVar2 = (zzic) hknVar.b;
                    hknVar.Q();
                    hknVar.R();
                    try {
                        cursor2 = hknVar.H0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursor2.moveToFirst()) {
                                    zzhsVar2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((zzhs) ((zzhr) zzpk.B0(zzhs.O(), cursor2.getBlob(0))).m(), Long.valueOf(cursor2.getLong(1)));
                                            cursor2.close();
                                            pair2 = create;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            j = 0;
                                            zzgu zzguVar2 = zzicVar2.f;
                                            zzic.m(zzguVar2);
                                            zzguVar2.g.b(e, "Error selecting main event");
                                        }
                                    } catch (IOException e3) {
                                        zzgu zzguVar3 = zzicVar2.f;
                                        zzic.m(zzguVar3);
                                        j = 0;
                                        try {
                                            zzguVar3.g.d("Failed to merge main event. appId, eventId", zzgu.U(str), l, e3);
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            zzgu zzguVar22 = zzicVar2.f;
                                            zzic.m(zzguVar22);
                                            zzguVar22.g.b(e, "Error selecting main event");
                                        }
                                        cursor2.close();
                                        pair = zzhsVar2;
                                        if (pair != 0) {
                                        }
                                        zzgu zzguVar4 = zzicVar.f;
                                        zzic.m(zzguVar4);
                                        zzguVar4.h.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                        return zzhsVar2;
                                    }
                                } else {
                                    zzgu zzguVar5 = zzicVar2.f;
                                    zzic.m(zzguVar5);
                                    zzguVar5.o.a("Main event not found");
                                    cursor2.close();
                                    pair2 = null;
                                    zzhsVar2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e5) {
                                e = e5;
                                zzhsVar2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e6) {
                        e = e6;
                        zzhsVar2 = null;
                        j = 0;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        zzgu zzguVar42 = zzicVar.f;
                        zzic.m(zzguVar42);
                        zzguVar42.h.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return zzhsVar2;
                    }
                    this.b = (zzhs) obj;
                    this.a = ((Long) pair.second).longValue();
                    zzpgVar.k0();
                    this.c = (Long) zzpk.c0((zzhs) this.b, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.a - 1;
                this.a = j2;
                if (j2 <= j) {
                    hkn hknVar2 = zzpgVar.c;
                    zzpg.U(hknVar2);
                    zzic zzicVar3 = (zzic) hknVar2.b;
                    hknVar2.Q();
                    zzgu zzguVar6 = zzicVar3.f;
                    zzic.m(zzguVar6);
                    zzguVar6.o.b(str, "Clearing complex main event info. appId");
                    try {
                        hknVar2.H0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e7) {
                        zzgu zzguVar7 = zzicVar3.f;
                        zzic.m(zzguVar7);
                        zzguVar7.g.b(e7, "Error clearing complex main event");
                    }
                } else {
                    hkn hknVar3 = zzpgVar.c;
                    zzpg.U(hknVar3);
                    hknVar3.i0(str, l, this.a, (zzhs) this.b);
                }
                ArrayList arrayList = new ArrayList();
                for (zzhw zzhwVar : ((zzhs) this.b).A()) {
                    zzpgVar.k0();
                    if (zzpk.a0(zzhsVar, zzhwVar.z()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    zzgu zzguVar8 = zzicVar.f;
                    zzic.m(zzguVar8);
                    zzguVar8.h.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(A);
                    A = arrayList;
                }
                D = str2;
            } else {
                this.c = l;
                this.b = zzhsVar;
                zzpgVar.k0();
                zzhw a03 = zzpk.a0(zzhsVar, "_epc");
                Object i0 = a03 != null ? zzpk.i0(a03) : null;
                long longValue = ((Long) (i0 != null ? i0 : 0L)).longValue();
                this.a = longValue;
                if (longValue <= 0) {
                    zzgu zzguVar9 = zzicVar.f;
                    zzic.m(zzguVar9);
                    zzguVar9.h.b(D, "Complex event with zero extra param count. eventName");
                } else {
                    hkn hknVar4 = zzpgVar.c;
                    zzpg.U(hknVar4);
                    hknVar4.i0(str, l, this.a, zzhsVar);
                }
            }
        }
        zzhr zzhrVar = (zzhr) zzhsVar.q();
        zzhrVar.w(D);
        zzhrVar.k();
        ((zzhs) zzhrVar.b).S();
        zzhrVar.k();
        ((zzhs) zzhrVar.b).R(A);
        return (zzhs) zzhrVar.m();
    }

    @Override // defpackage.qh2
    public void onFailure(ah2 ah2Var, IOException iOException) {
        xad xadVar = (xad) this.c;
        qzf qzfVar = ((pof) ah2Var).b;
        if (qzfVar != null) {
            jl9 jl9Var = qzfVar.a;
            if (jl9Var != null) {
                xadVar.k(jl9Var.j().toString());
            }
            String str = qzfVar.b;
            if (str != null) {
                xadVar.c(str);
            }
        }
        xadVar.g(this.a);
        fc6.y((Timer) this.d, xadVar, xadVar);
        ((qh2) this.b).onFailure(ah2Var, iOException);
    }

    @Override // defpackage.qh2
    public void onResponse(ah2 ah2Var, d2g d2gVar) {
        FirebasePerfOkHttpClient.a(d2gVar, (xad) this.c, this.a, ((Timer) this.d).a());
        ((qh2) this.b).onResponse(ah2Var, d2gVar);
    }

    public wi5(SerialDescriptor serialDescriptor, p1 p1Var) {
        serialDescriptor.getClass();
        this.b = serialDescriptor;
        this.c = p1Var;
        int d = serialDescriptor.d();
        if (d <= 64) {
            this.a = d != 64 ? (-1) << d : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (d - 1) >>> 6;
        long[] jArr = new long[i];
        if ((d & 63) != 0) {
            jArr[i - 1] = (-1) << d;
        }
        this.d = jArr;
    }

    public /* synthetic */ wi5(t9n t9nVar) {
        this.d = t9nVar;
    }

    public wi5(qh2 qh2Var, fyj fyjVar, Timer timer, long j) {
        this.b = qh2Var;
        this.c = new xad(fyjVar);
        this.a = j;
        this.d = timer;
    }

    public wi5(long j, uf ufVar, wf wfVar, mr9 mr9Var) {
        this.a = j;
        this.b = ufVar;
        this.c = wfVar;
        this.d = mr9Var;
    }
}
