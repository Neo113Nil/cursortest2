package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzf;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfg;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzja;
import defpackage.dh0;
import defpackage.gmo;
import defpackage.hkn;
import defpackage.jk3;
import defpackage.lgn;
import defpackage.ono;
import defpackage.p0p;
import defpackage.q7o;
import defpackage.sx2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzht extends p0p implements lgn {
    public final dh0 e;
    public final dh0 f;
    public final dh0 g;
    public final dh0 h;
    public final dh0 i;
    public final dh0 j;
    public final dh0 k;
    public final jk3 l;
    public final gmo m;
    public final dh0 n;
    public final dh0 o;
    public final dh0 p;

    public zzht(zzpg zzpgVar) {
        super(zzpgVar);
        this.e = new dh0(0);
        this.f = new dh0(0);
        this.g = new dh0(0);
        this.h = new dh0(0);
        this.i = new dh0(0);
        this.j = new dh0(0);
        this.n = new dh0(0);
        this.o = new dh0(0);
        this.p = new dh0(0);
        this.k = new dh0(0);
        this.l = new jk3(this);
        this.m = new gmo(this, 1);
    }

    public static final dh0 a0(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        dh0 dh0Var = new dh0(0);
        for (zzgt zzgtVar : zzglVar.C()) {
            dh0Var.put(zzgtVar.y(), zzgtVar.z());
        }
        return dh0Var;
    }

    public static final zzjk b0(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return zzjk.AD_STORAGE;
        }
        if (i2 == 2) {
            return zzjk.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return zzjk.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return zzjk.AD_PERSONALIZATION;
    }

    public final zzji U(String str, zzjk zzjkVar) {
        Q();
        W(str);
        com.google.android.gms.internal.measurement.zzgf m0 = m0(str);
        if (m0 != null) {
            Iterator<E> it = m0.D().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzfu zzfuVar = (zzfu) it.next();
                if (b0(zzfuVar.y()) == zzjkVar) {
                    int z = zzfuVar.z() - 1;
                    if (z == 1) {
                        return zzji.GRANTED;
                    }
                    if (z == 2) {
                        return zzji.DENIED;
                    }
                }
            }
        }
        return zzji.UNINITIALIZED;
    }

    public final boolean V(String str) {
        Q();
        W(str);
        com.google.android.gms.internal.measurement.zzgf m0 = m0(str);
        if (m0 == null) {
            return false;
        }
        for (zzfu zzfuVar : m0.y()) {
            if (zzfuVar.y() == 3 && zzfuVar.A() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void W(String str) {
        R();
        Q();
        Preconditions.f(str);
        dh0 dh0Var = this.j;
        if (dh0Var.get(str) == null) {
            hkn hknVar = this.c.c;
            zzpg.U(hknVar);
            sx2 Y0 = hknVar.Y0(str);
            dh0 dh0Var2 = this.p;
            dh0 dh0Var3 = this.o;
            dh0 dh0Var4 = this.n;
            dh0 dh0Var5 = this.e;
            if (Y0 != null) {
                com.google.android.gms.internal.measurement.zzgk zzgkVar = (com.google.android.gms.internal.measurement.zzgk) Z(str, (byte[]) Y0.a).q();
                X(str, zzgkVar);
                dh0Var5.put(str, a0((com.google.android.gms.internal.measurement.zzgl) zzgkVar.m()));
                dh0Var.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.m());
                Y(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.m());
                dh0Var4.put(str, ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).J());
                dh0Var3.put(str, (String) Y0.b);
                dh0Var2.put(str, (String) Y0.c);
                return;
            }
            dh0Var5.put(str, null);
            this.g.put(str, null);
            this.f.put(str, null);
            this.h.put(str, null);
            this.i.put(str, null);
            dh0Var.put(str, null);
            dh0Var4.put(str, null);
            dh0Var3.put(str, null);
            dh0Var2.put(str, null);
            this.k.put(str, null);
        }
    }

    public final void X(String str, com.google.android.gms.internal.measurement.zzgk zzgkVar) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        dh0 dh0Var = new dh0(0);
        dh0 dh0Var2 = new dh0(0);
        dh0 dh0Var3 = new dh0(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).I()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzgh) it.next()).y());
        }
        zzic zzicVar = (zzic) this.b;
        zzal zzalVar = zzicVar.d;
        zzgu zzguVar = zzicVar.f;
        zzfx zzfxVar = zzfy.V0;
        if (zzalVar.b0(null, zzfxVar)) {
            arrayList2.addAll(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).O()));
        }
        while (i < ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).D()) {
            com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).E(i).q();
            if (zzgiVar.p().isEmpty()) {
                zzic.m(zzguVar);
                zzguVar.j.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String p = zzgiVar.p();
                arrayList = arrayList2;
                String b = zzlt.b(zzgiVar.p(), zzjm.a, zzjm.f);
                if (!TextUtils.isEmpty(b)) {
                    zzgiVar.k();
                    ((zzgj) zzgiVar.b).F(b);
                    zzgkVar.k();
                    ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).R(i, (zzgj) zzgiVar.m());
                }
                if (((zzgj) zzgiVar.b).z() && ((zzgj) zzgiVar.b).A()) {
                    dh0Var.put(p, Boolean.TRUE);
                }
                if (((zzgj) zzgiVar.b).B() && ((zzgj) zzgiVar.b).C()) {
                    dh0Var2.put(zzgiVar.p(), Boolean.TRUE);
                }
                if (((zzgj) zzgiVar.b).D()) {
                    if (((zzgj) zzgiVar.b).E() < 2 || ((zzgj) zzgiVar.b).E() > 65535) {
                        zzic.m(zzguVar);
                        zzguVar.j.c(zzgiVar.p(), Integer.valueOf(((zzgj) zzgiVar.b).E()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        dh0Var3.put(zzgiVar.p(), Integer.valueOf(((zzgj) zzgiVar.b).E()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f.put(str, hashSet);
        if (zzicVar.d.b0(null, zzfxVar)) {
            this.i.put(str, arrayList3);
        }
        this.g.put(str, dh0Var);
        this.h.put(str, dh0Var2);
        this.k.put(str, dh0Var3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(String str, com.google.android.gms.internal.measurement.zzgl zzglVar) {
        zzic zzicVar = (zzic) this.b;
        int H = zzglVar.H();
        jk3 jk3Var = this.l;
        if (H == 0) {
            jk3Var.e(str);
            return;
        }
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.o.b(Integer.valueOf(zzglVar.H()), "EES programs found");
        zzja zzjaVar = (zzja) zzglVar.G().get(0);
        try {
            zzc zzcVar = new zzc();
            zzf zzfVar = zzcVar.a;
            zzfVar.d.a.put("internal.remoteConfig", new ono(this, str, 2));
            zzfVar.d.a.put("internal.appMetadata", new ono(this, str, 0));
            zzfVar.d.a.put("internal.logger", new q7o(this, 19));
            zzcVar.b(zzjaVar);
            jk3Var.d(str, zzcVar);
            zzic.m(zzguVar);
            zzgs zzgsVar = zzguVar.o;
            zzgsVar.c(str, Integer.valueOf(zzjaVar.z().z()), "EES program loaded for appId, activities");
            for (zziy zziyVar : zzjaVar.z().y()) {
                zzic.m(zzguVar);
                zzgsVar.b(zziyVar.y(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(str, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.zzgl Z(String str, byte[] bArr) {
        zzic zzicVar = (zzic) this.b;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzgl.Q();
        }
        try {
            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) ((com.google.android.gms.internal.measurement.zzgk) zzpk.B0(com.google.android.gms.internal.measurement.zzgl.P(), bArr)).m();
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.o.c(zzglVar.y() ? Long.valueOf(zzglVar.z()) : null, zzglVar.A() ? zzglVar.B() : null, "Parsed config. version, gmp_app_id");
            return zzglVar;
        } catch (zzaeh e) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.j.c(zzgu.U(str), e, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.zzgl.Q();
        } catch (RuntimeException e2) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.j.c(zzgu.U(str), e2, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.zzgl.Q();
        }
    }

    public final com.google.android.gms.internal.measurement.zzgl c0(String str) {
        R();
        Q();
        Preconditions.f(str);
        W(str);
        return (com.google.android.gms.internal.measurement.zzgl) this.j.get(str);
    }

    public final String d0(String str) {
        Q();
        W(str);
        return (String) this.n.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0481, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0342, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0326, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cc, code lost:
    
        r0 = r14.f;
        com.google.android.gms.measurement.internal.zzic.m(r0);
        r0 = r0.j;
        r4 = com.google.android.gms.measurement.internal.zzgu.U(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e1, code lost:
    
        if (r7.y() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e3, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f3, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f1, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x061e, code lost:
    
        r24.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0621, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0386, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.A().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0396, code lost:
    
        if (r3.hasNext() == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0398, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzfn) r3.next();
        r9.R();
        r9.Q();
        com.google.android.gms.common.internal.Preconditions.f(r29);
        com.google.android.gms.common.internal.Preconditions.i(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03b2, code lost:
    
        if (r5.A().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03de, code lost:
    
        r6 = r5.h();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03f7, code lost:
    
        if (r5.y() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f9, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0403, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0415, code lost:
    
        if (r5.E() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0417, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0421, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0433, code lost:
    
        if (r9.H0().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0448, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0435, code lost:
    
        r0 = r14.f;
        com.google.android.gms.measurement.internal.zzic.m(r0);
        r0.g.b(com.google.android.gms.measurement.internal.zzgu.U(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0446, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x044e, code lost:
    
        r1 = r14.f;
        com.google.android.gms.measurement.internal.zzic.m(r1);
        r1.g.c(com.google.android.gms.measurement.internal.zzgu.U(r29), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0420, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0402, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b4, code lost:
    
        r0 = r14.f;
        com.google.android.gms.measurement.internal.zzic.m(r0);
        r0 = r0.j;
        r3 = com.google.android.gms.measurement.internal.zzgu.U(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03c9, code lost:
    
        if (r5.y() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03cb, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d5, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0262, code lost:
    
        r6 = r0.A().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x026e, code lost:
    
        if (r6.hasNext() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x027a, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r6.next()).y() != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x027c, code lost:
    
        r0 = r14.f;
        com.google.android.gms.measurement.internal.zzic.m(r0);
        r0.j.c(com.google.android.gms.measurement.internal.zzgu.U(r29), java.lang.Integer.valueOf(r5), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0292, code lost:
    
        r6 = r0.D().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x029a, code lost:
    
        r7 = r6.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029e, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = com.mbridge.msdk.MBridgeConstans.APP_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ae, code lost:
    
        if (r7 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b0, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzff) r6.next();
        r9.R();
        r9.Q();
        com.google.android.gms.common.internal.Preconditions.f(r29);
        com.google.android.gms.common.internal.Preconditions.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ca, code lost:
    
        if (r7.A().isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0300, code lost:
    
        r25 = r3;
        r3 = r7.h();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put(com.mbridge.msdk.MBridgeConstans.APP_ID, r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x031b, code lost:
    
        if (r7.y() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031d, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.z());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0327, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0337, code lost:
    
        if (r7.I() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0339, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.J());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0343, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0355, code lost:
    
        if (r9.H0().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0357, code lost:
    
        r0 = r14.f;
        com.google.android.gms.measurement.internal.zzic.m(r0);
        r0.g.b(com.google.android.gms.measurement.internal.zzgu.U(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x036a, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0368, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0374, code lost:
    
        r1 = r14.f;
        com.google.android.gms.measurement.internal.zzic.m(r1);
        r1.g.c(com.google.android.gms.measurement.internal.zzgu.U(r29), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x045e, code lost:
    
        r9.R();
        r9.Q();
        com.google.android.gms.common.internal.Preconditions.f(r29);
        r0 = r9.H0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05e6 A[Catch: SQLiteException -> 0x05f7, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x05f7, blocks: (B:177:0x05cf, B:179:0x05e6), top: B:176:0x05cf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(String str, String str2, String str3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        com.google.android.gms.internal.measurement.zzgk zzgkVar;
        byte[] bArr2;
        hkn hknVar;
        ContentValues contentValues;
        boolean z;
        R();
        Q();
        Preconditions.f(str);
        com.google.android.gms.internal.measurement.zzgk zzgkVar2 = (com.google.android.gms.internal.measurement.zzgk) Z(str, bArr).q();
        X(str, zzgkVar2);
        Y(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar2.m());
        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgkVar2.m();
        dh0 dh0Var = this.j;
        dh0Var.put(str, zzglVar);
        this.n.put(str, ((com.google.android.gms.internal.measurement.zzgl) zzgkVar2.b).J());
        this.o.put(str, str2);
        this.p.put(str, str3);
        this.e.put(str, a0((com.google.android.gms.internal.measurement.zzgl) zzgkVar2.m()));
        zzpg zzpgVar = this.c;
        hkn hknVar2 = zzpgVar.c;
        zzpg.U(hknVar2);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzgl) zzgkVar2.b).F()));
        zzic zzicVar = (zzic) hknVar2.b;
        int i = 0;
        while (i < arrayList.size()) {
            zzfc zzfcVar = (zzfc) ((zzfd) arrayList.get(i)).q();
            dh0 dh0Var2 = dh0Var;
            if (((zzfd) zzfcVar.b).E() != 0) {
                int i2 = 0;
                while (i2 < ((zzfd) zzfcVar.b).E()) {
                    zzfe zzfeVar = (zzfe) ((zzfd) zzfcVar.b).F(i2).q();
                    zzfe zzfeVar2 = (zzfe) zzfeVar.clone();
                    zzpg zzpgVar2 = zzpgVar;
                    com.google.android.gms.internal.measurement.zzgk zzgkVar3 = zzgkVar2;
                    String b = zzlt.b(((zzff) zzfeVar.b).A(), zzjm.a, zzjm.f);
                    if (b != null) {
                        zzfeVar2.k();
                        ((zzff) zzfeVar2.b).L(b);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < ((zzff) zzfeVar.b).C()) {
                        zzfh D = ((zzff) zzfeVar.b).D(i3);
                        boolean z2 = z;
                        zzfe zzfeVar3 = zzfeVar;
                        String b2 = zzlt.b(D.F(), zzjn.a, zzjn.b);
                        if (b2 != null) {
                            zzfg zzfgVar = (zzfg) D.q();
                            zzfgVar.k();
                            ((zzfh) zzfgVar.b).H(b2);
                            zzfh zzfhVar = (zzfh) zzfgVar.m();
                            zzfeVar2.k();
                            ((zzff) zzfeVar2.b).M(i3, zzfhVar);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i3++;
                        zzfeVar = zzfeVar3;
                    }
                    if (z) {
                        zzfcVar.k();
                        ((zzfd) zzfcVar.b).H(i2, (zzff) zzfeVar2.m());
                        arrayList.set(i, (zzfd) zzfcVar.m());
                    }
                    i2++;
                    zzpgVar = zzpgVar2;
                    zzgkVar2 = zzgkVar3;
                }
            }
            com.google.android.gms.internal.measurement.zzgk zzgkVar4 = zzgkVar2;
            zzpg zzpgVar3 = zzpgVar;
            if (((zzfd) zzfcVar.b).B() != 0) {
                for (int i4 = 0; i4 < ((zzfd) zzfcVar.b).B(); i4++) {
                    zzfn C = ((zzfd) zzfcVar.b).C(i4);
                    String b3 = zzlt.b(C.A(), zzjo.a, zzjo.b);
                    if (b3 != null) {
                        zzfm zzfmVar = (zzfm) C.q();
                        zzfmVar.k();
                        ((zzfn) zzfmVar.b).H(b3);
                        zzfcVar.k();
                        ((zzfd) zzfcVar.b).G(i4, (zzfn) zzfmVar.m());
                        arrayList.set(i, (zzfd) zzfcVar.m());
                    }
                }
            }
            i++;
            dh0Var = dh0Var2;
            zzpgVar = zzpgVar3;
            zzgkVar2 = zzgkVar4;
        }
        com.google.android.gms.internal.measurement.zzgk zzgkVar5 = zzgkVar2;
        dh0 dh0Var3 = dh0Var;
        zzpg zzpgVar4 = zzpgVar;
        hknVar2.R();
        hknVar2.Q();
        Preconditions.f(str);
        SQLiteDatabase H0 = hknVar2.H0();
        H0.beginTransaction();
        try {
            hknVar2.R();
            hknVar2.Q();
            Preconditions.f(str);
            SQLiteDatabase H02 = hknVar2.H0();
            H02.delete("property_filters", "app_id=?", new String[]{str});
            H02.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzfd zzfdVar = (zzfd) it.next();
                hknVar2.R();
                hknVar2.Q();
                Preconditions.f(str);
                Preconditions.i(zzfdVar);
                if (zzfdVar.y()) {
                    int z3 = zzfdVar.z();
                    Iterator<E> it2 = zzfdVar.D().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!((zzff) it2.next()).y()) {
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzguVar.j.c(zzgu.U(str), Integer.valueOf(z3), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                            break;
                        }
                    }
                } else {
                    zzgu zzguVar2 = zzicVar.f;
                    zzic.m(zzguVar2);
                    zzguVar2.j.b(zzgu.U(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = H0;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                zzfd zzfdVar2 = (zzfd) it3.next();
                arrayList2.add(zzfdVar2.y() ? Integer.valueOf(zzfdVar2.z()) : null);
            }
            Preconditions.f(str);
            hknVar2.R();
            hknVar2.Q();
            SQLiteDatabase H03 = hknVar2.H0();
            try {
                long m0 = hknVar2.m0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, zzicVar.d.Z(str, zzfy.U)));
                if (m0 > max) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            String join = TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
                            sb.append("(");
                            sb.append(join);
                            sb.append(")");
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(sb2.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            H03.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e) {
                zzgu zzguVar3 = zzicVar.f;
                zzic.m(zzguVar3);
                zzguVar3.g.c(zzgu.U(str), e, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                zzgkVar5.k();
                zzgkVar = zzgkVar5;
                try {
                    ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).S();
                    bArr2 = ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.m()).h();
                } catch (RuntimeException e2) {
                    e = e2;
                    zzgu zzguVar4 = ((zzic) this.b).f;
                    zzic.m(zzguVar4);
                    zzguVar4.j.c(zzgu.U(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArr2 = bArr;
                    hknVar = zzpgVar4.c;
                    zzpg.U(hknVar);
                    zzic zzicVar2 = (zzic) hknVar.b;
                    Preconditions.f(str);
                    hknVar.Q();
                    hknVar.R();
                    contentValues = new ContentValues();
                    contentValues.put("remote_config", bArr2);
                    contentValues.put("config_last_modified_time", str2);
                    contentValues.put("e_tag", str3);
                    if (hknVar.H0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    }
                    zzgkVar.k();
                    ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).T();
                    dh0Var3.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.m());
                }
            } catch (RuntimeException e3) {
                e = e3;
                zzgkVar = zzgkVar5;
            }
            hknVar = zzpgVar4.c;
            zzpg.U(hknVar);
            zzic zzicVar22 = (zzic) hknVar.b;
            Preconditions.f(str);
            hknVar.Q();
            hknVar.R();
            contentValues = new ContentValues();
            contentValues.put("remote_config", bArr2);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (hknVar.H0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    zzgu zzguVar5 = zzicVar22.f;
                    zzic.m(zzguVar5);
                    zzguVar5.g.b(zzgu.U(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e4) {
                zzgu zzguVar6 = zzicVar22.f;
                zzic.m(zzguVar6);
                zzguVar6.g.c(zzgu.U(str), e4, "Error storing remote config. appId");
            }
            zzgkVar.k();
            ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.b).T();
            dh0Var3.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.m());
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = H0;
        }
    }

    public final boolean f0(String str, String str2) {
        Boolean bool;
        Q();
        W(str);
        if ("1".equals(zza(str, "measurement.upload.blacklist_internal")) && zzpp.u0(str2)) {
            return true;
        }
        if ("1".equals(zza(str, "measurement.upload.blacklist_public")) && zzpp.Q0(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean g0(String str, String str2) {
        Boolean bool;
        Q();
        W(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.h.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List h0(String str) {
        Q();
        W(str);
        return (List) this.i.get(str);
    }

    public final int i0(String str, String str2) {
        Integer num;
        Q();
        W(str);
        Map map = (Map) this.k.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean j0(String str) {
        Q();
        W(str);
        dh0 dh0Var = this.f;
        if (dh0Var.get(str) != null) {
            return ((Set) dh0Var.get(str)).contains("os_version") || ((Set) dh0Var.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean k0(String str) {
        Q();
        W(str);
        dh0 dh0Var = this.f;
        return dh0Var.get(str) != null && ((Set) dh0Var.get(str)).contains("app_instance_id");
    }

    public final boolean l0(String str, zzjk zzjkVar) {
        Q();
        W(str);
        com.google.android.gms.internal.measurement.zzgf m0 = m0(str);
        if (m0 == null) {
            return false;
        }
        for (zzfu zzfuVar : m0.y()) {
            if (zzjkVar == b0(zzfuVar.y())) {
                return zzfuVar.z() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.zzgf m0(String str) {
        Q();
        W(str);
        com.google.android.gms.internal.measurement.zzgl c0 = c0(str);
        if (c0 == null || !c0.K()) {
            return null;
        }
        return c0.L();
    }

    @Override // defpackage.lgn
    public final String zza(String str, String str2) {
        Q();
        W(str);
        Map map = (Map) this.e.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // defpackage.p0p
    public final void T() {
    }
}
