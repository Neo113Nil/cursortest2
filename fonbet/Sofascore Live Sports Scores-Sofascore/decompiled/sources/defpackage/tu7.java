package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ltu7;", "Lq8;", "lu7", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class tu7 extends q8 {
    public final umd e;
    public final amd f;
    public final cg4 g;
    public final boolean h;
    public final fdi i;
    public final jof j;
    public final fdi k;
    public final jof l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu7(Application application, umd umdVar, amd amdVar, cg4 cg4Var, fqg fqgVar) {
        super(application);
        umdVar.getClass();
        amdVar.getClass();
        cg4Var.getClass();
        fqgVar.getClass();
        this.e = umdVar;
        this.f = amdVar;
        this.g = cg4Var;
        Boolean bool = (Boolean) fqgVar.a("HAS_BRANDED_ODDS");
        this.h = bool != null ? bool.booleanValue() : false;
        tnb tnbVar = tnb.a;
        fdi a = gdi.a(tnbVar);
        this.i = a;
        this.j = un0.u(a);
        fdi a2 = gdi.a(tnbVar);
        this.k = a2;
        this.l = un0.u(a2);
        this.m = rld.t(i());
        this.n = rld.a(ke0.c);
        Set set = aef.a;
        this.o = aef.h(i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r13 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        if (r13 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(OddsCountryProvider oddsCountryProvider, int i, boolean z, sq3 sq3Var) {
        ru7 ru7Var;
        Object obj;
        int i2;
        int i3;
        boolean z2;
        OddsCountryProvider oddsCountryProvider2;
        int i4;
        boolean booleanValue;
        boolean z3;
        boolean z4;
        if (sq3Var instanceof ru7) {
            ru7Var = (ru7) sq3Var;
            int i5 = ru7Var.y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ru7Var.y = i5 - Integer.MIN_VALUE;
                obj = ru7Var.w;
                Object obj2 = lu3.a;
                i2 = ru7Var.y;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (this.o) {
                        int oddsDisplayProviderId$default = OddsProvider.getOddsDisplayProviderId$default(oddsCountryProvider.getProvider(), null, 1, null);
                        ru7Var.r = oddsCountryProvider;
                        ru7Var.s = i;
                        ru7Var.u = z;
                        ru7Var.y = 1;
                        obj = this.e.c(i, oddsDisplayProviderId$default, ru7Var);
                    }
                    boolean z5 = z;
                    i3 = i;
                    z2 = z5;
                    oddsCountryProvider2 = oddsCountryProvider;
                    i4 = 0;
                    ru7Var.r = oddsCountryProvider2;
                    ru7Var.s = i3;
                    ru7Var.u = z2;
                    ru7Var.t = i4;
                    ru7Var.y = 2;
                    obj = this.f.d(oddsCountryProvider2, ru7Var);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z4 = ru7Var.v;
                            i4 = ru7Var.t;
                            y6a.M(obj);
                            z3 = ((Boolean) obj).booleanValue();
                            booleanValue = z4;
                            return new tld(booleanValue, i4 != 0, z3);
                        }
                        i4 = ru7Var.t;
                        z2 = ru7Var.u;
                        i3 = ru7Var.s;
                        oddsCountryProvider2 = ru7Var.r;
                        y6a.M(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue || i4 == 0) {
                            z3 = false;
                            return new tld(booleanValue, i4 != 0, z3);
                        }
                        ru7Var.r = null;
                        ru7Var.s = i3;
                        ru7Var.u = z2;
                        ru7Var.t = i4;
                        ru7Var.v = booleanValue;
                        ru7Var.y = 3;
                        Object m = m(oddsCountryProvider2, z2, ru7Var);
                        if (m != obj2) {
                            obj = m;
                            z4 = booleanValue;
                            z3 = ((Boolean) obj).booleanValue();
                            booleanValue = z4;
                            return new tld(booleanValue, i4 != 0, z3);
                        }
                        return obj2;
                    }
                    z = ru7Var.u;
                    i = ru7Var.s;
                    oddsCountryProvider = ru7Var.r;
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    boolean z6 = z;
                    i3 = i;
                    z2 = z6;
                    oddsCountryProvider2 = oddsCountryProvider;
                    i4 = 1;
                    ru7Var.r = oddsCountryProvider2;
                    ru7Var.s = i3;
                    ru7Var.u = z2;
                    ru7Var.t = i4;
                    ru7Var.y = 2;
                    obj = this.f.d(oddsCountryProvider2, ru7Var);
                }
                boolean z52 = z;
                i3 = i;
                z2 = z52;
                oddsCountryProvider2 = oddsCountryProvider;
                i4 = 0;
                ru7Var.r = oddsCountryProvider2;
                ru7Var.s = i3;
                ru7Var.u = z2;
                ru7Var.t = i4;
                ru7Var.y = 2;
                obj = this.f.d(oddsCountryProvider2, ru7Var);
            }
        }
        ru7Var = new ru7(this, sq3Var);
        obj = ru7Var.w;
        Object obj22 = lu3.a;
        i2 = ru7Var.y;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        boolean z522 = z;
        i3 = i;
        z2 = z522;
        oddsCountryProvider2 = oddsCountryProvider;
        i4 = 0;
        ru7Var.r = oddsCountryProvider2;
        ru7Var.s = i3;
        ru7Var.u = z2;
        ru7Var.t = i4;
        ru7Var.y = 2;
        obj = this.f.d(oddsCountryProvider2, ru7Var);
    }

    public final void l(zkd zkdVar) {
        if (!zkdVar.equals(zkd.a)) {
            zzl.b();
        } else {
            xw3.L(un0.z(this), null, null, new d17(this, null, 16), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r9.h("pref_bet_boost_first_showed_timestamp", r7, r2) != r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(OddsCountryProvider oddsCountryProvider, boolean z, sq3 sq3Var) {
        su7 su7Var;
        Object obj;
        lu3 lu3Var;
        int i;
        boolean z2;
        OddsCountryProvider oddsCountryProvider2;
        OddsCountryProvider oddsCountryProvider3;
        long j;
        OddsCountryProvider oddsCountryProvider4;
        int i2;
        Context i3;
        Context i4;
        if (sq3Var instanceof su7) {
            su7Var = (su7) sq3Var;
            int i5 = su7Var.x;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                su7Var.x = i5 - Integer.MIN_VALUE;
                obj = su7Var.v;
                lu3Var = lu3.a;
                i = su7Var.x;
                cg4 cg4Var = this.g;
                if (i != 0) {
                    y6a.M(obj);
                    su7Var.r = oddsCountryProvider;
                    z2 = z;
                    su7Var.s = z2;
                    su7Var.x = 1;
                    Object d = cg4Var.d("pref_bet_boost_first_showed_timestamp", su7Var);
                    if (d != lu3Var) {
                        oddsCountryProvider2 = oddsCountryProvider;
                        obj = d;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = su7Var.u;
                        y6a.M(obj);
                        return Boolean.valueOf(i2 != 0);
                    }
                    j = su7Var.t;
                    z2 = su7Var.s;
                    oddsCountryProvider3 = su7Var.r;
                    y6a.M(obj);
                    long longValue = ((Number) obj).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    LocalDate o = vxd.o(Instant.ofEpochMilli(j));
                    LocalDate o2 = vxd.o(Instant.ofEpochMilli(currentTimeMillis));
                    ChronoUnit chronoUnit = ChronoUnit.DAYS;
                    oddsCountryProvider4 = oddsCountryProvider3;
                    boolean z3 = ((int) chronoUnit.between(o, o2)) >= 30;
                    boolean z4 = ((int) chronoUnit.between(vxd.o(Instant.ofEpochMilli(longValue)), Instant.ofEpochMilli(System.currentTimeMillis()).atZone(ZoneId.systemDefault()).toLocalDate())) >= 30;
                    if (this.o && z2) {
                        i3 = i();
                        if (!xld.e(i3) && xld.g(i3) && rld.t(i3)) {
                            i4 = i();
                            String slug = oddsCountryProvider4.getProvider().getSlug();
                            boolean branded = oddsCountryProvider4.getBranded();
                            slug.getClass();
                            if (rld.p(i4) && branded && rld.r(slug) && (j == 0 || z3 || z4)) {
                                i2 = 1;
                                if (i2 != 0 && j == 0) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    su7Var.r = null;
                                    su7Var.s = z2;
                                    su7Var.t = j;
                                    su7Var.u = i2;
                                    su7Var.x = 3;
                                }
                                return Boolean.valueOf(i2 != 0);
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                        long currentTimeMillis22 = System.currentTimeMillis();
                        su7Var.r = null;
                        su7Var.s = z2;
                        su7Var.t = j;
                        su7Var.u = i2;
                        su7Var.x = 3;
                    }
                    return Boolean.valueOf(i2 != 0);
                }
                z2 = su7Var.s;
                oddsCountryProvider2 = su7Var.r;
                y6a.M(obj);
                long longValue2 = ((Number) obj).longValue();
                su7Var.r = oddsCountryProvider2;
                su7Var.s = z2;
                su7Var.t = longValue2;
                su7Var.x = 2;
                obj = cg4Var.d("pref_bet_boost_last_interaction_timestamp", su7Var);
                if (obj != lu3Var) {
                    oddsCountryProvider3 = oddsCountryProvider2;
                    j = longValue2;
                    long longValue3 = ((Number) obj).longValue();
                    long currentTimeMillis3 = System.currentTimeMillis();
                    LocalDate o3 = vxd.o(Instant.ofEpochMilli(j));
                    LocalDate o22 = vxd.o(Instant.ofEpochMilli(currentTimeMillis3));
                    ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
                    oddsCountryProvider4 = oddsCountryProvider3;
                    if (((int) chronoUnit2.between(o3, o22)) >= 30) {
                    }
                    if (((int) chronoUnit2.between(vxd.o(Instant.ofEpochMilli(longValue3)), Instant.ofEpochMilli(System.currentTimeMillis()).atZone(ZoneId.systemDefault()).toLocalDate())) >= 30) {
                    }
                    if (this.o) {
                        i3 = i();
                        if (!xld.e(i3)) {
                            i4 = i();
                            String slug2 = oddsCountryProvider4.getProvider().getSlug();
                            boolean branded2 = oddsCountryProvider4.getBranded();
                            slug2.getClass();
                            if (rld.p(i4)) {
                                i2 = 1;
                                if (i2 != 0) {
                                }
                                return Boolean.valueOf(i2 != 0);
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                    }
                    return Boolean.valueOf(i2 != 0);
                }
                return lu3Var;
            }
        }
        su7Var = new su7(this, sq3Var);
        obj = su7Var.v;
        lu3Var = lu3.a;
        i = su7Var.x;
        cg4 cg4Var2 = this.g;
        if (i != 0) {
        }
        long longValue22 = ((Number) obj).longValue();
        su7Var.r = oddsCountryProvider2;
        su7Var.s = z2;
        su7Var.t = longValue22;
        su7Var.x = 2;
        obj = cg4Var2.d("pref_bet_boost_last_interaction_timestamp", su7Var);
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
