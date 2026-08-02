package defpackage;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzahn;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpk;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n4n extends t6d {
    public final /* synthetic */ int g;
    public final /* synthetic */ t9n h;
    public final zzadu i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4n(t9n t9nVar, String str, int i, zzadu zzaduVar, int i2) {
        super(str, i);
        this.g = i2;
        this.h = t9nVar;
        this.i = zzaduVar;
    }

    @Override // defpackage.t6d
    public final int c() {
        int i = this.g;
        zzadu zzaduVar = this.i;
        switch (i) {
            case 0:
                return ((zzff) zzaduVar).z();
            default:
                return ((zzfn) zzaduVar).z();
        }
    }

    @Override // defpackage.t6d
    public final boolean d() {
        switch (this.g) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.t6d
    public final boolean e() {
        switch (this.g) {
            case 0:
                return ((zzff) this.i).E();
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c9 A[EDGE_INSN: B:160:0x03c9->B:52:0x03c9 BREAK  A[LOOP:3: B:132:0x0246->B:157:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(Long l, Long l2, zzhs zzhsVar, long j, emn emnVar, boolean z) {
        boolean z2;
        zzgu zzguVar;
        Boolean bool;
        Boolean bool2;
        long j2;
        Boolean bool3;
        Boolean bool4;
        int i;
        zzahn.a();
        t9n t9nVar = this.h;
        zzic zzicVar = (zzic) t9nVar.b;
        zzal zzalVar = zzicVar.d;
        zzgu zzguVar2 = zzicVar.f;
        zzgn zzgnVar = zzicVar.j;
        zzfx zzfxVar = zzfy.F0;
        String str = this.a;
        boolean b0 = zzalVar.b0(str, zzfxVar);
        zzff zzffVar = (zzff) this.i;
        long j3 = zzffVar.J() ? emnVar.e : j;
        zzic.m(zzguVar2);
        zzgs zzgsVar = zzguVar2.o;
        zzgs zzgsVar2 = zzguVar2.j;
        boolean isLoggable = Log.isLoggable(zzguVar2.W(), 2);
        int i2 = this.b;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        Boolean bool5 = null;
        if (isLoggable) {
            zzic.m(zzguVar2);
            zzgsVar.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null, zzgnVar.a(zzffVar.A()));
            zzic.m(zzguVar2);
            zzpk zzpkVar = t9nVar.c.g;
            zzpg.U(zzpkVar);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (zzffVar.y()) {
                i = 0;
                zzpk.l0(sb, 0, "filter_id", Integer.valueOf(zzffVar.z()));
            } else {
                i = 0;
            }
            zzpk.l0(sb, i, "event_name", ((zzic) zzpkVar.b).j.a(zzffVar.A()));
            String h0 = zzpk.h0(zzffVar.G(), zzffVar.H(), zzffVar.J());
            if (!h0.isEmpty()) {
                zzpk.l0(sb, 0, "filter_type", h0);
            }
            if (zzffVar.E()) {
                zzpk.m0(sb, 1, "event_count_filter", zzffVar.F());
            }
            if (zzffVar.C() > 0) {
                sb.append("  filters {\n");
                Iterator it = zzffVar.B().iterator();
                while (it.hasNext()) {
                    zzpkVar.e0(sb, 2, (zzfh) it.next());
                }
            }
            zzpk.f0(1, sb);
            sb.append("}\n}\n");
            zzgsVar.b(sb.toString(), "Filter definition");
        }
        if (!zzffVar.y() || zzffVar.z() > 256) {
            zzic.m(zzguVar2);
            zzgsVar2.c(zzgu.U(str), String.valueOf(zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = zzffVar.G() || zzffVar.H() || zzffVar.J();
        if (z && !z3) {
            zzic.m(zzguVar2);
            zzgsVar.c(Integer.valueOf(i2), zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String D = zzhsVar.D();
        if (zzffVar.E()) {
            try {
                bool4 = t6d.h(new BigDecimal(j3), zzffVar.F(), 0.0d);
            } catch (NumberFormatException unused) {
                bool4 = null;
            }
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    bool5 = Boolean.FALSE;
                }
            }
            z2 = b0;
            zzguVar = zzguVar2;
            zzic.m(zzguVar);
            zzgsVar.b(bool5 == null ? "null" : bool5, "Event filter result");
            if (bool5 == null) {
                return false;
            }
            Boolean bool6 = Boolean.TRUE;
            this.c = bool6;
            if (!bool5.booleanValue()) {
                return true;
            }
            this.d = bool6;
            if (!z3 || !zzhsVar.E()) {
                return true;
            }
            Long valueOf = Long.valueOf(zzhsVar.F());
            if (zzffVar.H()) {
                if (z2 && zzffVar.E()) {
                    valueOf = l;
                }
                this.f = valueOf;
                return true;
            }
            if (z2 && zzffVar.E()) {
                valueOf = l2;
            }
            this.e = valueOf;
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = zzffVar.B().iterator();
        while (true) {
            if (!it2.hasNext()) {
                dh0 dh0Var = new dh0(0);
                Iterator it3 = zzhsVar.A().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = zzffVar.B().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z2 = b0;
                                zzguVar = zzguVar2;
                                bool5 = Boolean.TRUE;
                                break;
                            }
                            zzfh zzfhVar = (zzfh) it4.next();
                            boolean z4 = zzfhVar.C() && zzfhVar.D();
                            String F = zzfhVar.F();
                            if (F.isEmpty()) {
                                zzic.m(zzguVar2);
                                zzgsVar2.b(zzgnVar.a(D), "Event has empty param name. event");
                                break;
                            }
                            Object obj = dh0Var.get(F);
                            if (obj instanceof Long) {
                                if (!zzfhVar.A()) {
                                    zzic.m(zzguVar2);
                                    zzgsVar2.c(zzgnVar.a(D), zzgnVar.b(F), "No number filter for long param. event, param");
                                    break;
                                }
                                try {
                                    bool = t6d.h(new BigDecimal(((Long) obj).longValue()), zzfhVar.B(), 0.0d);
                                } catch (NumberFormatException unused2) {
                                    bool = null;
                                }
                                if (bool == null) {
                                    break;
                                }
                                if (bool.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!zzfhVar.A()) {
                                    zzic.m(zzguVar2);
                                    zzgsVar2.c(zzgnVar.a(D), zzgnVar.b(F), "No number filter for double param. event, param");
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                try {
                                    bool2 = t6d.h(new BigDecimal(doubleValue), zzfhVar.B(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused3) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!zzfhVar.y()) {
                                    if (!zzfhVar.A()) {
                                        z2 = b0;
                                        zzguVar = zzguVar2;
                                        zzic.m(zzguVar);
                                        zzgsVar2.c(zzgnVar.a(D), zzgnVar.b(F), "No filter for String param. event, param");
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!zzpk.u0(str2)) {
                                        z2 = b0;
                                        zzguVar = zzguVar2;
                                        zzic.m(zzguVar);
                                        zzgsVar2.c(zzgnVar.a(D), zzgnVar.b(F), "Invalid param value for number filter. event, param");
                                        break;
                                    }
                                    zzfl B = zzfhVar.B();
                                    if (zzpk.u0(str2)) {
                                        try {
                                            z2 = b0;
                                            zzguVar = zzguVar2;
                                            j2 = 0;
                                        } catch (NumberFormatException unused4) {
                                            z2 = b0;
                                            zzguVar = zzguVar2;
                                            j2 = 0;
                                        }
                                        try {
                                            bool3 = t6d.h(new BigDecimal(str2), B, 0.0d);
                                        } catch (NumberFormatException unused5) {
                                            bool3 = null;
                                            if (bool3 == null) {
                                            }
                                            zzic.m(zzguVar);
                                            zzgsVar.b(bool5 == null ? "null" : bool5, "Event filter result");
                                            if (bool5 == null) {
                                            }
                                        }
                                        if (bool3 == null) {
                                            break;
                                        }
                                        if (bool3.booleanValue() == z4) {
                                            bool5 = Boolean.FALSE;
                                            break;
                                        }
                                        zzguVar2 = zzguVar;
                                        b0 = z2;
                                    } else {
                                        z2 = b0;
                                        zzguVar = zzguVar2;
                                        bool3 = null;
                                    }
                                } else {
                                    zzfr z5 = zzfhVar.z();
                                    zzic.m(zzguVar2);
                                    bool3 = t6d.g((String) obj, z5, zzguVar2);
                                    z2 = b0;
                                    zzguVar = zzguVar2;
                                }
                                j2 = 0;
                                if (bool3 == null) {
                                }
                            } else {
                                z2 = b0;
                                zzguVar = zzguVar2;
                                if (obj == null) {
                                    zzic.m(zzguVar);
                                    zzgsVar.c(zzgnVar.a(D), zzgnVar.b(F), "Missing param for filter. event, param");
                                    bool5 = Boolean.FALSE;
                                } else {
                                    zzic.m(zzguVar);
                                    zzgsVar2.c(zzgnVar.a(D), zzgnVar.b(F), "Unknown param type. event, param");
                                }
                            }
                        }
                    } else {
                        zzhw zzhwVar = (zzhw) it3.next();
                        if (hashSet.contains(zzhwVar.z())) {
                            if (!zzhwVar.C()) {
                                if (!zzhwVar.G()) {
                                    if (!zzhwVar.A()) {
                                        zzic.m(zzguVar2);
                                        zzgsVar2.c(zzgnVar.a(D), zzgnVar.b(zzhwVar.z()), "Unknown value for param. event, param");
                                        break;
                                    }
                                    dh0Var.put(zzhwVar.z(), zzhwVar.B());
                                } else {
                                    dh0Var.put(zzhwVar.z(), zzhwVar.G() ? Double.valueOf(zzhwVar.H()) : null);
                                }
                            } else {
                                dh0Var.put(zzhwVar.z(), zzhwVar.C() ? Long.valueOf(zzhwVar.D()) : null);
                            }
                        }
                    }
                }
            } else {
                zzfh zzfhVar2 = (zzfh) it2.next();
                if (zzfhVar2.F().isEmpty()) {
                    zzic.m(zzguVar2);
                    zzgsVar2.b(zzgnVar.a(D), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(zzfhVar2.F());
            }
        }
        zzic.m(zzguVar);
        zzgsVar.b(bool5 == null ? "null" : bool5, "Event filter result");
        if (bool5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(Long l, Long l2, zziu zziuVar, boolean z) {
        boolean z2;
        Boolean f;
        Boolean h;
        Boolean bool;
        Boolean bool2;
        zzahn.a();
        zzic zzicVar = (zzic) this.h.b;
        zzal zzalVar = zzicVar.d;
        zzgn zzgnVar = zzicVar.j;
        zzgu zzguVar = zzicVar.f;
        boolean b0 = zzalVar.b0(this.a, zzfy.D0);
        zzfn zzfnVar = (zzfn) this.i;
        boolean C = zzfnVar.C();
        boolean D = zzfnVar.D();
        boolean F = zzfnVar.F();
        boolean z3 = C || D || F;
        if (z && !z3) {
            zzic.m(zzguVar);
            zzguVar.o.c(Integer.valueOf(this.b), zzfnVar.y() ? Integer.valueOf(zzfnVar.z()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        zzfh B = zzfnVar.B();
        boolean D2 = B.D();
        if (!zziuVar.D()) {
            z2 = F;
            if (!zziuVar.H()) {
                if (zziuVar.B()) {
                    if (B.y()) {
                        String C2 = zziuVar.C();
                        zzfr z4 = B.z();
                        zzic.m(zzguVar);
                        f = t6d.f(t6d.g(C2, z4, zzguVar), D2);
                    } else if (!B.A()) {
                        zzic.m(zzguVar);
                        zzguVar.j.b(zzgnVar.c(zziuVar.A()), "No string or number filter defined. property");
                    } else if (zzpk.u0(zziuVar.C())) {
                        String C3 = zziuVar.C();
                        zzfl B2 = B.B();
                        if (zzpk.u0(C3)) {
                            try {
                                h = t6d.h(new BigDecimal(C3), B2, 0.0d);
                            } catch (NumberFormatException unused) {
                            }
                            f = t6d.f(h, D2);
                        }
                        h = null;
                        f = t6d.f(h, D2);
                    } else {
                        zzic.m(zzguVar);
                        zzguVar.j.c(zzgnVar.c(zziuVar.A()), zziuVar.C(), "Invalid user property value for Numeric number filter. property, value");
                    }
                    zzic.m(zzguVar);
                    zzguVar.o.b(f != null ? "null" : f, "Property filter result");
                    if (f != null) {
                    }
                } else {
                    zzic.m(zzguVar);
                    zzguVar.j.b(zzgnVar.c(zziuVar.A()), "User property has no value, property");
                }
                f = null;
                zzic.m(zzguVar);
                zzguVar.o.b(f != null ? "null" : f, "Property filter result");
                if (f != null) {
                }
            } else if (B.A()) {
                double I = zziuVar.I();
                try {
                    bool = t6d.h(new BigDecimal(I), B.B(), Math.ulp(I));
                } catch (NumberFormatException unused2) {
                    bool = null;
                }
                f = t6d.f(bool, D2);
                zzic.m(zzguVar);
                zzguVar.o.b(f != null ? "null" : f, "Property filter result");
                if (f != null) {
                }
            } else {
                zzic.m(zzguVar);
                zzguVar.j.b(zzgnVar.c(zziuVar.A()), "No number filter for double property. property");
                f = null;
                zzic.m(zzguVar);
                zzguVar.o.b(f != null ? "null" : f, "Property filter result");
                if (f != null) {
                }
            }
        } else {
            if (!B.A()) {
                zzic.m(zzguVar);
                zzguVar.j.b(zzgnVar.c(zziuVar.A()), "No number filter for long property. property");
                z2 = F;
                f = null;
                zzic.m(zzguVar);
                zzguVar.o.b(f != null ? "null" : f, "Property filter result");
                if (f != null) {
                    return false;
                }
                this.c = Boolean.TRUE;
                if (!z2 || f.booleanValue()) {
                    if (!z || zzfnVar.C()) {
                        this.d = f;
                    }
                    if (f.booleanValue() && z3 && zziuVar.y()) {
                        long z5 = zziuVar.z();
                        if (l != null) {
                            z5 = l.longValue();
                        }
                        if (b0 && zzfnVar.C() && !zzfnVar.D() && l2 != null) {
                            z5 = l2.longValue();
                        }
                        if (zzfnVar.D()) {
                            this.f = Long.valueOf(z5);
                        } else {
                            this.e = Long.valueOf(z5);
                        }
                    }
                }
                return true;
            }
            z2 = F;
            try {
                bool2 = t6d.h(new BigDecimal(zziuVar.E()), B.B(), 0.0d);
            } catch (NumberFormatException unused3) {
                bool2 = null;
            }
            f = t6d.f(bool2, D2);
            zzic.m(zzguVar);
            zzguVar.o.b(f != null ? "null" : f, "Property filter result");
            if (f != null) {
            }
        }
    }
}
