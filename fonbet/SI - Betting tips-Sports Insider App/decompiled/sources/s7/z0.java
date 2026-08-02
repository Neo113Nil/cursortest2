package s7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.u5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends l3 implements d {

    /* renamed from: d, reason: collision with root package name */
    public final s.e f23264d;

    /* renamed from: e, reason: collision with root package name */
    public final s.e f23265e;

    /* renamed from: f, reason: collision with root package name */
    public final s.e f23266f;

    /* renamed from: g, reason: collision with root package name */
    public final s.e f23267g;

    /* renamed from: h, reason: collision with root package name */
    public final s.e f23268h;

    /* renamed from: i, reason: collision with root package name */
    public final s.e f23269i;
    public final m2.i j;

    /* renamed from: k, reason: collision with root package name */
    public final r7.a f23270k;

    /* renamed from: l, reason: collision with root package name */
    public final s.e f23271l;

    /* renamed from: m, reason: collision with root package name */
    public final s.e f23272m;

    /* renamed from: n, reason: collision with root package name */
    public final s.e f23273n;

    public z0(r3 r3Var) {
        super(r3Var);
        this.f23264d = new s.e(0);
        this.f23265e = new s.e(0);
        this.f23266f = new s.e(0);
        this.f23267g = new s.e(0);
        this.f23268h = new s.e(0);
        this.f23271l = new s.e(0);
        this.f23272m = new s.e(0);
        this.f23273n = new s.e(0);
        this.f23269i = new s.e(0);
        this.j = new m2.i(this);
        this.f23270k = new r7.a(6, this);
    }

    public static final s.e t(com.google.android.gms.internal.measurement.e2 e2Var) {
        s.e eVar = new s.e(0);
        for (com.google.android.gms.internal.measurement.i2 i2Var : e2Var.t()) {
            eVar.put(i2Var.p(), i2Var.q());
        }
        return eVar;
    }

    public static final p1 u(int i5) {
        int i10 = i5 - 1;
        if (i10 == 1) {
            return p1.AD_STORAGE;
        }
        if (i10 == 2) {
            return p1.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return p1.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return p1.AD_PERSONALIZATION;
    }

    public final int A(String str, String str2) {
        Integer num;
        j();
        p(str);
        Map map = (Map) this.f23269i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean B(String str) {
        j();
        p(str);
        s.e eVar = this.f23265e;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains(CommonUrlParts.OS_VERSION) || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean C(String str) {
        j();
        p(str);
        s.e eVar = this.f23265e;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean D(String str, p1 p1Var) {
        j();
        p(str);
        com.google.android.gms.internal.measurement.z1 E = E(str);
        if (E == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.w1 w1Var : E.p()) {
            if (p1Var == u(w1Var.p())) {
                return w1Var.q() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.z1 E(String str) {
        j();
        p(str);
        com.google.android.gms.internal.measurement.e2 v5 = v(str);
        if (v5 == null || !v5.B()) {
            return null;
        }
        return v5.C();
    }

    @Override // s7.d
    public final String d(String str, String str2) {
        j();
        p(str);
        Map map = (Map) this.f23264d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final n1 n(String str, p1 p1Var) {
        j();
        p(str);
        com.google.android.gms.internal.measurement.z1 E = E(str);
        if (E != null) {
            Iterator it = E.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.w1 w1Var = (com.google.android.gms.internal.measurement.w1) it.next();
                if (u(w1Var.p()) == p1Var) {
                    int q = w1Var.q() - 1;
                    if (q == 1) {
                        return n1.GRANTED;
                    }
                    if (q == 2) {
                        return n1.DENIED;
                    }
                }
            }
        }
        return n1.UNINITIALIZED;
    }

    public final boolean o(String str) {
        j();
        p(str);
        com.google.android.gms.internal.measurement.z1 E = E(str);
        if (E == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.w1 w1Var : E.p()) {
            if (w1Var.p() == 3 && w1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void p(String str) {
        k();
        j();
        g6.v.e(str);
        s.e eVar = this.f23268h;
        if (eVar.get(str) == null) {
            j jVar = this.f22859b.f22989c;
            r3.U(jVar);
            kh.g p02 = jVar.p0(str);
            s.e eVar2 = this.f23273n;
            s.e eVar3 = this.f23272m;
            s.e eVar4 = this.f23271l;
            s.e eVar5 = this.f23264d;
            if (p02 != null) {
                com.google.android.gms.internal.measurement.d2 d2Var = (com.google.android.gms.internal.measurement.d2) s(str, (byte[]) p02.f19115b).i();
                q(str, d2Var);
                eVar5.put(str, t((com.google.android.gms.internal.measurement.e2) d2Var.f()));
                eVar.put(str, (com.google.android.gms.internal.measurement.e2) d2Var.f());
                r(str, (com.google.android.gms.internal.measurement.e2) d2Var.f());
                eVar4.put(str, ((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).A());
                eVar3.put(str, (String) p02.f19116c);
                eVar2.put(str, (String) p02.f19117d);
                return;
            }
            eVar5.put(str, null);
            this.f23266f.put(str, null);
            this.f23265e.put(str, null);
            this.f23267g.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.f23269i.put(str, null);
        }
    }

    public final void q(String str, com.google.android.gms.internal.measurement.d2 d2Var) {
        f1 f1Var = (f1) this.f3328a;
        HashSet hashSet = new HashSet();
        s.e eVar = new s.e(0);
        s.e eVar2 = new s.e(0);
        s.e eVar3 = new s.e(0);
        Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.a2) it.next()).p());
        }
        for (int i5 = 0; i5 < ((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).u(); i5++) {
            com.google.android.gms.internal.measurement.b2 b2Var = (com.google.android.gms.internal.measurement.b2) ((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).v(i5).i();
            if (b2Var.i().isEmpty()) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22906i.a("EventConfig contained null event name");
            } else {
                String i10 = b2Var.i();
                String g10 = r1.g(b2Var.i(), r1.f22975a, r1.f22977c);
                if (!TextUtils.isEmpty(g10)) {
                    b2Var.b();
                    ((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).w(g10);
                    d2Var.b();
                    ((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).H(i5, (com.google.android.gms.internal.measurement.c2) b2Var.f());
                }
                if (((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).q() && ((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).r()) {
                    eVar.put(i10, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).s() && ((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).t()) {
                    eVar2.put(b2Var.i(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).u()) {
                    if (((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).v() < 2 || ((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).v() > 65535) {
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22906i.c(b2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        eVar3.put(b2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.c2) b2Var.f5041b).v()));
                    }
                }
            }
        }
        this.f23265e.put(str, hashSet);
        this.f23266f.put(str, eVar);
        this.f23267g.put(str, eVar2);
        this.f23269i.put(str, eVar3);
    }

    public final void r(String key, com.google.android.gms.internal.measurement.e2 e2Var) {
        Object remove;
        int i5 = 0;
        if (e2Var.y() == 0) {
            m2.i iVar = this.j;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (iVar.f22569c) {
                try {
                    e3.i iVar2 = iVar.f22568b;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    remove = iVar2.f8523a.remove(key);
                    if (remove != null) {
                        int i10 = iVar.f22570d;
                        s.l.e(key, remove);
                        iVar.f22570d = i10 - 1;
                    }
                    Unit unit = Unit.f19194a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (remove != null) {
                iVar.b(false, key, remove, null);
                return;
            }
            return;
        }
        f1 f1Var = (f1) this.f3328a;
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22910n.b(Integer.valueOf(e2Var.y()), "EES programs found");
        com.google.android.gms.internal.measurement.u3 u3Var = (com.google.android.gms.internal.measurement.u3) e2Var.x().get(0);
        try {
            com.google.android.gms.internal.measurement.e0 e0Var = new com.google.android.gms.internal.measurement.e0();
            ((HashMap) ((u5) e0Var.f5018a.f6185d).f5267a).put("internal.remoteConfig", new y0(this, key, 2));
            ((HashMap) ((u5) e0Var.f5018a.f6185d).f5267a).put("internal.appMetadata", new y0(this, key, i5));
            ((HashMap) ((u5) e0Var.f5018a.f6185d).f5267a).put("internal.logger", new com.android.billingclient.api.f0(1, this));
            e0Var.b(u3Var);
            this.j.d(key, e0Var);
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22910n.c(key, Integer.valueOf(u3Var.q().q()), "EES program loaded for appId, activities");
            for (com.google.android.gms.internal.measurement.t3 t3Var : u3Var.q().p()) {
                n0 n0Var3 = f1Var.f22745f;
                f1.m(n0Var3);
                n0Var3.f22910n.b(t3Var.p(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.r0 unused) {
            n0 n0Var4 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var4);
            n0Var4.f22903f.b(key, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.e2 s(String str, byte[] bArr) {
        f1 f1Var = (f1) this.f3328a;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.e2.G();
        }
        try {
            com.google.android.gms.internal.measurement.e2 e2Var = (com.google.android.gms.internal.measurement.e2) ((com.google.android.gms.internal.measurement.d2) r0.W(com.google.android.gms.internal.measurement.e2.F(), bArr)).f();
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22910n.c(e2Var.p() ? Long.valueOf(e2Var.q()) : null, e2Var.r() ? e2Var.s() : null, "Parsed config. version, gmp_app_id");
            return e2Var;
        } catch (p5 e7) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.c(n0.r(str), e7, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.e2.G();
        } catch (RuntimeException e9) {
            n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22906i.c(n0.r(str), e9, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.e2.G();
        }
    }

    public final com.google.android.gms.internal.measurement.e2 v(String str) {
        k();
        j();
        g6.v.e(str);
        p(str);
        return (com.google.android.gms.internal.measurement.e2) this.f23268h.get(str);
    }

    public final String w(String str) {
        j();
        p(str);
        return (String) this.f23271l.get(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:47|48|(5:51|52|(3:147|148|149)(3:54|55|(2:56|(2:58|(3:60|61|62)(1:64))(1:65)))|63|49)|153|154|(4:157|(2:159|160)(2:162|163)|161|155)|164|165|(4:166|167|168|(1:170)(2:198|(2:199|(2:201|(1:203)(1:204))(2:205|206))))|171|172|173|174|175|(3:176|177|178)|179|180|181|182|(1:184)|186|187) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0460, code lost:
    
        r9.k();
        r9.j();
        g6.v.e(r29);
        r0 = r9.Y();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0483, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0346, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x032a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ce, code lost:
    
        r0 = r14.f22745f;
        s7.f1.m(r0);
        r0 = r0.f22906i;
        r4 = s7.n0.r(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e3, code lost:
    
        if (r7.p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e5, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f7, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f5, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0388, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0398, code lost:
    
        if (r3.hasNext() == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x039a, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.u1) r3.next();
        r9.k();
        r9.j();
        g6.v.e(r29);
        g6.v.h(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03b4, code lost:
    
        if (r5.r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03e0, code lost:
    
        r6 = r5.a();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f9, code lost:
    
        if (r5.p() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03fb, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0405, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0417, code lost:
    
        if (r5.v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0419, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0423, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0435, code lost:
    
        if (r9.Y().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x044a, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0437, code lost:
    
        r0 = r14.f22745f;
        s7.f1.m(r0);
        r0.f22903f.b(s7.n0.r(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0450, code lost:
    
        r1 = r14.f22745f;
        s7.f1.m(r1);
        r1.f22903f.c(s7.n0.r(r29), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0422, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0404, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b6, code lost:
    
        r0 = r14.f22745f;
        s7.f1.m(r0);
        r0 = r0.f22906i;
        r3 = s7.n0.r(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03cb, code lost:
    
        if (r5.p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03cd, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d7, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0600, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0601, code lost:
    
        r4 = r5.f22745f;
        s7.f1.m(r4);
        r4.f22903f.c(s7.n0.r(r29), r0, "Error storing remote config. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0264, code lost:
    
        r6 = r0.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0270, code lost:
    
        if (r6.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027c, code lost:
    
        if (((com.google.android.gms.internal.measurement.u1) r6.next()).p() != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027e, code lost:
    
        r0 = r14.f22745f;
        s7.f1.m(r0);
        r0.f22906i.c(s7.n0.r(r29), java.lang.Integer.valueOf(r5), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0294, code lost:
    
        r6 = r0.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029c, code lost:
    
        r7 = r6.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a0, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b0, code lost:
    
        if (r7 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b2, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.n1) r6.next();
        r9.k();
        r9.j();
        g6.v.e(r29);
        g6.v.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02cc, code lost:
    
        if (r7.r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0304, code lost:
    
        r25 = r3;
        r3 = r7.a();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID, r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031f, code lost:
    
        if (r7.p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0321, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x032b, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x033b, code lost:
    
        if (r7.z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x033d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0347, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0359, code lost:
    
        if (r9.Y().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x035b, code lost:
    
        r0 = r14.f22745f;
        s7.f1.m(r0);
        r0.f22903f.b(s7.n0.r(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x036b, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0375, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0376, code lost:
    
        r1 = r14.f22745f;
        s7.f1.m(r1);
        r1.f22903f.c(s7.n0.r(r29), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05ef A[Catch: SQLiteException -> 0x0600, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0600, blocks: (B:182:0x05d8, B:184:0x05ef), top: B:181:0x05d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(String str, String str2, String str3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        com.google.android.gms.internal.measurement.d2 d2Var;
        byte[] bArr2;
        j jVar;
        ContentValues contentValues;
        boolean z5;
        k();
        j();
        g6.v.e(str);
        com.google.android.gms.internal.measurement.d2 d2Var2 = (com.google.android.gms.internal.measurement.d2) s(str, bArr).i();
        q(str, d2Var2);
        r(str, (com.google.android.gms.internal.measurement.e2) d2Var2.f());
        com.google.android.gms.internal.measurement.e2 e2Var = (com.google.android.gms.internal.measurement.e2) d2Var2.f();
        s.e eVar = this.f23268h;
        eVar.put(str, e2Var);
        this.f23271l.put(str, ((com.google.android.gms.internal.measurement.e2) d2Var2.f5041b).A());
        this.f23272m.put(str, str2);
        this.f23273n.put(str, str3);
        this.f23264d.put(str, t((com.google.android.gms.internal.measurement.e2) d2Var2.f()));
        r3 r3Var = this.f22859b;
        j jVar2 = r3Var.f22989c;
        r3.U(jVar2);
        ArrayList arrayList = new ArrayList(DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.e2) d2Var2.f5041b).w()));
        f1 f1Var = (f1) jVar2.f3328a;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            com.google.android.gms.internal.measurement.k1 k1Var = (com.google.android.gms.internal.measurement.k1) ((com.google.android.gms.internal.measurement.l1) arrayList.get(i5)).i();
            s.e eVar2 = eVar;
            if (((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).v() != 0) {
                int i10 = 0;
                while (i10 < ((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).v()) {
                    com.google.android.gms.internal.measurement.m1 m1Var = (com.google.android.gms.internal.measurement.m1) ((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).w(i10).i();
                    com.google.android.gms.internal.measurement.m1 m1Var2 = (com.google.android.gms.internal.measurement.m1) m1Var.clone();
                    r3 r3Var2 = r3Var;
                    com.google.android.gms.internal.measurement.d2 d2Var3 = d2Var2;
                    String g10 = r1.g(((com.google.android.gms.internal.measurement.n1) m1Var.f5041b).r(), r1.f22975a, r1.f22977c);
                    if (g10 != null) {
                        m1Var2.b();
                        ((com.google.android.gms.internal.measurement.n1) m1Var2.f5041b).C(g10);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int i11 = 0;
                    while (i11 < ((com.google.android.gms.internal.measurement.n1) m1Var.f5041b).t()) {
                        com.google.android.gms.internal.measurement.p1 u10 = ((com.google.android.gms.internal.measurement.n1) m1Var.f5041b).u(i11);
                        boolean z7 = z5;
                        com.google.android.gms.internal.measurement.m1 m1Var3 = m1Var;
                        String g11 = r1.g(u10.w(), r1.f22979e, r1.f22980f);
                        if (g11 != null) {
                            com.google.android.gms.internal.measurement.o1 o1Var = (com.google.android.gms.internal.measurement.o1) u10.i();
                            o1Var.b();
                            ((com.google.android.gms.internal.measurement.p1) o1Var.f5041b).y(g11);
                            com.google.android.gms.internal.measurement.p1 p1Var = (com.google.android.gms.internal.measurement.p1) o1Var.f();
                            m1Var2.b();
                            ((com.google.android.gms.internal.measurement.n1) m1Var2.f5041b).D(i11, p1Var);
                            z5 = true;
                        } else {
                            z5 = z7;
                        }
                        i11++;
                        m1Var = m1Var3;
                    }
                    if (z5) {
                        k1Var.b();
                        ((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).y(i10, (com.google.android.gms.internal.measurement.n1) m1Var2.f());
                        arrayList.set(i5, (com.google.android.gms.internal.measurement.l1) k1Var.f());
                    }
                    i10++;
                    r3Var = r3Var2;
                    d2Var2 = d2Var3;
                }
            }
            com.google.android.gms.internal.measurement.d2 d2Var4 = d2Var2;
            r3 r3Var3 = r3Var;
            if (((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).s() != 0) {
                for (int i12 = 0; i12 < ((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).s(); i12++) {
                    com.google.android.gms.internal.measurement.u1 t3 = ((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).t(i12);
                    String g12 = r1.g(t3.r(), r1.f22983i, r1.j);
                    if (g12 != null) {
                        com.google.android.gms.internal.measurement.t1 t1Var = (com.google.android.gms.internal.measurement.t1) t3.i();
                        t1Var.b();
                        ((com.google.android.gms.internal.measurement.u1) t1Var.f5041b).y(g12);
                        k1Var.b();
                        ((com.google.android.gms.internal.measurement.l1) k1Var.f5041b).x(i12, (com.google.android.gms.internal.measurement.u1) t1Var.f());
                        arrayList.set(i5, (com.google.android.gms.internal.measurement.l1) k1Var.f());
                    }
                }
            }
            i5++;
            eVar = eVar2;
            r3Var = r3Var3;
            d2Var2 = d2Var4;
        }
        com.google.android.gms.internal.measurement.d2 d2Var5 = d2Var2;
        s.e eVar3 = eVar;
        r3 r3Var4 = r3Var;
        jVar2.k();
        jVar2.j();
        g6.v.e(str);
        SQLiteDatabase Y = jVar2.Y();
        Y.beginTransaction();
        try {
            jVar2.k();
            jVar2.j();
            g6.v.e(str);
            SQLiteDatabase Y2 = jVar2.Y();
            Y2.delete("property_filters", "app_id=?", new String[]{str});
            Y2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) it.next();
                    jVar2.k();
                    jVar2.j();
                    g6.v.e(str);
                    g6.v.h(l1Var);
                    if (l1Var.p()) {
                        int q = l1Var.q();
                        Iterator it2 = l1Var.u().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (!((com.google.android.gms.internal.measurement.n1) it2.next()).p()) {
                                n0 n0Var = f1Var.f22745f;
                                f1.m(n0Var);
                                n0Var.f22906i.c(n0.r(str), Integer.valueOf(q), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                break;
                            }
                        }
                    } else {
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22906i.b(n0.r(str), "Audience with no ID. appId");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = Y;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = Y;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.l1 l1Var2 = (com.google.android.gms.internal.measurement.l1) it3.next();
                arrayList2.add(l1Var2.p() ? Integer.valueOf(l1Var2.q()) : null);
            }
            g6.v.e(str);
            jVar2.k();
            jVar2.j();
            SQLiteDatabase Y3 = jVar2.Y();
            try {
                long T = jVar2.T("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, f1Var.f22743d.r(str, x.V)));
                if (T > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            String join = TextUtils.join(StringUtils.COMMA, arrayList3);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
                            sb2.append("(");
                            sb2.append(join);
                            sb2.append(")");
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder(sb3.length() + 140);
                            sb4.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb4.append(sb3);
                            sb4.append(" order by rowid desc limit -1 offset ?)");
                            Y3.delete("audience_filter_values", sb4.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i13);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i13++;
                    }
                }
            } catch (SQLiteException e7) {
                n0 n0Var3 = f1Var.f22745f;
                f1.m(n0Var3);
                n0Var3.f22903f.c(n0.r(str), e7, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                d2Var5.b();
                d2Var = d2Var5;
            } catch (RuntimeException e9) {
                e = e9;
                d2Var = d2Var5;
            }
            try {
                ((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).I();
                bArr2 = ((com.google.android.gms.internal.measurement.e2) d2Var.f()).a();
            } catch (RuntimeException e10) {
                e = e10;
                n0 n0Var4 = ((f1) this.f3328a).f22745f;
                f1.m(n0Var4);
                n0Var4.f22906i.c(n0.r(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                bArr2 = bArr;
                jVar = r3Var4.f22989c;
                r3.U(jVar);
                f1 f1Var2 = (f1) jVar.f3328a;
                g6.v.e(str);
                jVar.j();
                jVar.k();
                contentValues = new ContentValues();
                contentValues.put("remote_config", bArr2);
                contentValues.put("config_last_modified_time", str2);
                contentValues.put("e_tag", str3);
                if (jVar.Y().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                }
                d2Var.b();
                ((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).J();
                eVar3.put(str, (com.google.android.gms.internal.measurement.e2) d2Var.f());
            }
            jVar = r3Var4.f22989c;
            r3.U(jVar);
            f1 f1Var22 = (f1) jVar.f3328a;
            g6.v.e(str);
            jVar.j();
            jVar.k();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            if (jVar.Y().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                n0 n0Var5 = f1Var22.f22745f;
                f1.m(n0Var5);
                n0Var5.f22903f.b(n0.r(str), "Failed to update remote config (got 0). appId");
            }
            d2Var.b();
            ((com.google.android.gms.internal.measurement.e2) d2Var.f5041b).J();
            eVar3.put(str, (com.google.android.gms.internal.measurement.e2) d2Var.f());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = Y;
        }
    }

    public final boolean y(String str, String str2) {
        Boolean bool;
        j();
        p(str);
        if ("1".equals(d(str, "measurement.upload.blacklist_internal")) && v3.J(str2)) {
            return true;
        }
        if ("1".equals(d(str, "measurement.upload.blacklist_public")) && v3.j0(str2)) {
            return true;
        }
        Map map = (Map) this.f23266f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean z(String str, String str2) {
        Boolean bool;
        j();
        p(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f23267g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // s7.l3
    public final void m() {
    }
}
