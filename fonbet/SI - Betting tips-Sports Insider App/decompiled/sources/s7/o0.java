package s7;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22920a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f22921b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22922c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22923d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22924e;

    public o0(long j, Bundle bundle, String str, String str2) {
        this.f22922c = str;
        this.f22923d = str2;
        this.f22924e = bundle;
        this.f22921b = j;
    }

    public static o0 b(zzbg zzbgVar) {
        String str = zzbgVar.f5797a;
        String str2 = zzbgVar.f5799c;
        return new o0(zzbgVar.f5800d, zzbgVar.f5798b.s0(), str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r8 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.gms.internal.measurement.a3 a(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        Cursor cursor;
        com.google.android.gms.internal.measurement.a3 a3Var2;
        long j;
        Cursor cursor2;
        Pair pair;
        Object obj;
        Pair pair2;
        String s8 = a3Var.s();
        List p10 = a3Var.p();
        c cVar = (c) this.f22924e;
        r3 r3Var = cVar.f22859b;
        r3 r3Var2 = cVar.f22859b;
        f1 f1Var = (f1) cVar.f3328a;
        r3Var.j0();
        com.google.android.gms.internal.measurement.d3 r5 = r0.r(a3Var, "_eid");
        Long l6 = (Long) (r5 == null ? null : r0.y(r5));
        if (l6 != null) {
            if (s8.equals("_ep")) {
                r3Var.j0();
                com.google.android.gms.internal.measurement.d3 r6 = r0.r(a3Var, "_en");
                String str2 = (String) (r6 == null ? null : r0.y(r6));
                if (TextUtils.isEmpty(str2)) {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22904g.b(l6, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((com.google.android.gms.internal.measurement.a3) this.f22922c) == null || ((Long) this.f22923d) == null || l6.longValue() != ((Long) this.f22923d).longValue()) {
                    j jVar = r3Var.f22989c;
                    r3.U(jVar);
                    f1 f1Var2 = (f1) jVar.f3328a;
                    jVar.j();
                    jVar.k();
                    try {
                        cursor2 = jVar.Y().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l6.toString()});
                        try {
                            try {
                                if (cursor2.moveToFirst()) {
                                    a3Var2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.z2) r0.W(com.google.android.gms.internal.measurement.a3.z(), cursor2.getBlob(0))).f(), Long.valueOf(cursor2.getLong(1)));
                                            cursor2.close();
                                            pair2 = create;
                                        } catch (SQLiteException e7) {
                                            e = e7;
                                            j = 0;
                                            n0 n0Var2 = f1Var2.f22745f;
                                            f1.m(n0Var2);
                                            n0Var2.f22903f.b(e, "Error selecting main event");
                                        }
                                    } catch (IOException e9) {
                                        n0 n0Var3 = f1Var2.f22745f;
                                        f1.m(n0Var3);
                                        j = 0;
                                        try {
                                            n0Var3.f22903f.d("Failed to merge main event. appId, eventId", n0.r(str), l6, e9);
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            n0 n0Var22 = f1Var2.f22745f;
                                            f1.m(n0Var22);
                                            n0Var22.f22903f.b(e, "Error selecting main event");
                                        }
                                        cursor2.close();
                                        pair = a3Var2;
                                        if (pair != 0) {
                                        }
                                        n0 n0Var4 = f1Var.f22745f;
                                        f1.m(n0Var4);
                                        n0Var4.f22904g.c(str2, l6, "Extra parameter without existing main event. eventName, eventId");
                                        return a3Var2;
                                    }
                                } else {
                                    n0 n0Var5 = f1Var2.f22745f;
                                    f1.m(n0Var5);
                                    n0Var5.f22910n.a("Main event not found");
                                    cursor2.close();
                                    pair2 = null;
                                    a3Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e11) {
                                e = e11;
                                a3Var2 = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        a3Var2 = null;
                        j = 0;
                        cursor2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        n0 n0Var42 = f1Var.f22745f;
                        f1.m(n0Var42);
                        n0Var42.f22904g.c(str2, l6, "Extra parameter without existing main event. eventName, eventId");
                        return a3Var2;
                    }
                    this.f22922c = (com.google.android.gms.internal.measurement.a3) obj;
                    this.f22921b = ((Long) pair.second).longValue();
                    r3Var2.j0();
                    this.f22923d = (Long) r0.s((com.google.android.gms.internal.measurement.a3) this.f22922c, "_eid");
                } else {
                    j = 0;
                }
                long j6 = this.f22921b - 1;
                this.f22921b = j6;
                if (j6 <= j) {
                    j jVar2 = r3Var2.f22989c;
                    r3.U(jVar2);
                    f1 f1Var3 = (f1) jVar2.f3328a;
                    jVar2.j();
                    n0 n0Var6 = f1Var3.f22745f;
                    f1.m(n0Var6);
                    n0Var6.f22910n.b(str, "Clearing complex main event info. appId");
                    try {
                        jVar2.Y().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        n0 n0Var7 = f1Var3.f22745f;
                        f1.m(n0Var7);
                        n0Var7.f22903f.b(e13, "Error clearing complex main event");
                    }
                } else {
                    j jVar3 = r3Var2.f22989c;
                    r3.U(jVar3);
                    jVar3.A(str, l6, this.f22921b, (com.google.android.gms.internal.measurement.a3) this.f22922c);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.d3 d3Var : ((com.google.android.gms.internal.measurement.a3) this.f22922c).p()) {
                    r3Var2.j0();
                    if (r0.r(a3Var, d3Var.q()) == null) {
                        arrayList.add(d3Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    n0 n0Var8 = f1Var.f22745f;
                    f1.m(n0Var8);
                    n0Var8.f22904g.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(p10);
                    p10 = arrayList;
                }
                s8 = str2;
            } else {
                this.f22923d = l6;
                this.f22922c = a3Var;
                r3Var.j0();
                com.google.android.gms.internal.measurement.d3 r10 = r0.r(a3Var, "_epc");
                Object y5 = r10 == null ? null : r0.y(r10);
                long longValue = ((Long) (y5 != null ? y5 : 0L)).longValue();
                this.f22921b = longValue;
                if (longValue <= 0) {
                    n0 n0Var9 = f1Var.f22745f;
                    f1.m(n0Var9);
                    n0Var9.f22904g.b(s8, "Complex event with zero extra param count. eventName");
                } else {
                    j jVar4 = r3Var.f22989c;
                    r3.U(jVar4);
                    jVar4.A(str, l6, this.f22921b, a3Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) a3Var.i();
        z2Var.b();
        ((com.google.android.gms.internal.measurement.a3) z2Var.f5041b).F(s8);
        z2Var.b();
        ((com.google.android.gms.internal.measurement.a3) z2Var.f5041b).D();
        z2Var.b();
        ((com.google.android.gms.internal.measurement.a3) z2Var.f5041b).C(p10);
        return (com.google.android.gms.internal.measurement.a3) z2Var.f();
    }

    public zzbg c() {
        return new zzbg((String) this.f22922c, new zzbe(new Bundle((Bundle) this.f22924e)), (String) this.f22923d, this.f22921b);
    }

    public String toString() {
        switch (this.f22920a) {
            case 0:
                String str = (String) this.f22923d;
                String obj = ((Bundle) this.f22924e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f22922c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                r4.k.s(sb2, "origin=", str, ",name=", str2);
                return d9.e.l(sb2, ",params=", obj);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o0(c cVar) {
        this.f22924e = cVar;
    }
}
