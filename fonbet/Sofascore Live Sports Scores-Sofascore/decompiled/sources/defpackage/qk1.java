package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.model.newNetwork.statistics.season.player.BaseballRankedStatistics;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lqk1;", "Lynb;", "Lfk1;", "Lfa1;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class qk1 extends ynb {
    public final wve l;
    public final int m;
    public BaseballRankedStatistics n;
    public ArrayList o;
    public ArrayList p;
    public g9i q;
    public g9i r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk1(wve wveVar, fqg fqgVar, Application application) {
        super(application, tnb.a);
        fqgVar.getClass();
        wveVar.getClass();
        this.l = wveVar;
        Object a = fqgVar.a("PLAYER_ID");
        if (a != null) {
            this.m = ((Number) a).intValue();
        } else {
            a70.p("Required value was null.");
            throw null;
        }
    }

    public final vl1 t(wj1 wj1Var, ll1 ll1Var, kl1 kl1Var, ql1 ql1Var, String str, String str2, Boolean bool) {
        Pair pair;
        Pair pair2;
        List list;
        int i = wj1Var == null ? -1 : ik1.a[wj1Var.ordinal()];
        if (i == 1) {
            pair = new Pair(this.o, BaseballSeasonPitchesPerspective.Pitching);
        } else {
            if (i != 2) {
                pair2 = new Pair(null, null);
                list = (List) pair2.a;
                BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective = (BaseballSeasonPitchesPerspective) pair2.b;
                if (list != null || baseballSeasonPitchesPerspective == null) {
                    return null;
                }
                return s02.F(list, baseballSeasonPitchesPerspective, ll1Var, kl1Var, ql1Var, str, str2, bool, gl1.a);
            }
            pair = new Pair(this.p, BaseballSeasonPitchesPerspective.Batting);
        }
        pair2 = pair;
        list = (List) pair2.a;
        BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective2 = (BaseballSeasonPitchesPerspective) pair2.b;
        if (list != null) {
        }
        return null;
    }

    public final void u(final fa1 fa1Var) {
        am1 am1Var;
        am1 am1Var2;
        am1 am1Var3;
        am1 am1Var4;
        Object obj;
        gv9 gv9Var;
        Object obj2;
        if (fa1Var instanceof ca1) {
            this.n = null;
            this.o = null;
            this.p = null;
            fk1 fk1Var = (fk1) l().a();
            if (fk1Var == null || (gv9Var = fk1Var.a) == null) {
                am1Var4 = null;
            } else {
                Iterator<E> it = gv9Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((am1) obj2).a == ((ca1) fa1Var).a) {
                            break;
                        }
                    }
                }
                am1Var4 = (am1) obj2;
            }
            if (am1Var4 != null) {
                gv9 gv9Var2 = am1Var4.d;
                Iterator<E> it2 = gv9Var2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((Season.SubSeasonType) obj) == ((ca1) fa1Var).b) {
                            break;
                        }
                    }
                }
                Season.SubSeasonType subSeasonType = (Season.SubSeasonType) obj;
                if (subSeasonType == null) {
                    subSeasonType = (Season.SubSeasonType) CollectionsKt.Y(gv9Var2);
                }
                n(null, new s1(14, am1Var4, subSeasonType));
                int i = am1Var4.b;
                ca1 ca1Var = (ca1) fa1Var;
                Season.SubSeasonType subSeasonType2 = subSeasonType;
                int i2 = ca1Var.a;
                wj1 wj1Var = ca1Var.c;
                g9i g9iVar = this.q;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                this.q = xw3.L(un0.z(this), null, null, new nk1(this, i2, subSeasonType2, wj1Var, i, null), 3);
                return;
            }
            return;
        }
        final int i3 = 0;
        if (fa1Var instanceof ea1) {
            this.n = null;
            this.o = null;
            this.p = null;
            n(null, new Function1() { // from class: gk1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i4 = i3;
                    fa1 fa1Var2 = fa1Var;
                    switch (i4) {
                        case 0:
                            fk1 fk1Var2 = (fk1) obj3;
                            fk1Var2.getClass();
                            return fk1.a(fk1Var2, null, null, ((ea1) fa1Var2).a, null, null, null, true, null, 187);
                        default:
                            fk1 fk1Var3 = (fk1) obj3;
                            fk1Var3.getClass();
                            return fk1.a(fk1Var3, null, null, null, null, null, null, fk1Var3.g || ((z91) fa1Var2).a, null, 191);
                    }
                }
            });
            fk1 fk1Var2 = (fk1) l().a();
            am1 am1Var5 = fk1Var2 != null ? fk1Var2.b : null;
            int m = yid.m(am1Var5 != null ? Integer.valueOf(am1Var5.b) : null);
            int m2 = yid.m(am1Var5 != null ? Integer.valueOf(am1Var5.a) : null);
            Season.SubSeasonType subSeasonType3 = ((ea1) fa1Var).a;
            g9i g9iVar2 = this.q;
            if (g9iVar2 != null) {
                g9iVar2.e(null);
            }
            this.q = xw3.L(un0.z(this), null, null, new nk1(this, m2, subSeasonType3, null, m, null), 3);
            return;
        }
        final int i4 = 2;
        if (fa1Var instanceof da1) {
            fk1 fk1Var3 = (fk1) l().a();
            Integer valueOf = (fk1Var3 == null || (am1Var3 = fk1Var3.b) == null) ? null : Integer.valueOf(am1Var3.a);
            fk1 fk1Var4 = (fk1) l().a();
            Season.SubSeasonType subSeasonType4 = fk1Var4 != null ? fk1Var4.c : null;
            if (valueOf == null || subSeasonType4 == null) {
                return;
            }
            xw3.L(un0.z(this), z45.a, null, new pk1(this.n, this, ((da1) fa1Var).a, subSeasonType4, true, valueOf.intValue(), null), 2);
            return;
        }
        final int i5 = 1;
        if (!(fa1Var instanceof z91)) {
            if (fa1Var instanceof ba1) {
                n(null, new Function1(this) { // from class: hk1
                    public final /* synthetic */ qk1 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        vl1 vl1Var;
                        vl1 vl1Var2;
                        jl1 jl1Var;
                        nl1 b;
                        jl1 jl1Var2;
                        nl1 a;
                        jl1 jl1Var3;
                        nl1 a2;
                        String str;
                        jl1 jl1Var4;
                        nl1 b2;
                        int i6 = i3;
                        ql1 ql1Var = null;
                        r1 = null;
                        r1 = null;
                        String str2 = null;
                        ql1Var = null;
                        fa1 fa1Var2 = fa1Var;
                        switch (i6) {
                            case 0:
                                fk1 fk1Var5 = (fk1) obj3;
                                fk1Var5.getClass();
                                qk1 qk1Var = this.b;
                                fk1 fk1Var6 = (fk1) qk1Var.l().a();
                                wj1 wj1Var2 = fk1Var6 != null ? fk1Var6.e : null;
                                ll1 ll1Var = ((ba1) fa1Var2).a;
                                fk1 fk1Var7 = (fk1) qk1Var.l().a();
                                kl1 kl1Var = (fk1Var7 == null || (vl1Var2 = fk1Var7.h) == null) ? null : vl1Var2.g;
                                fk1 fk1Var8 = (fk1) qk1Var.l().a();
                                if (fk1Var8 != null && (vl1Var = fk1Var8.h) != null) {
                                    ql1Var = vl1Var.h;
                                }
                                return fk1.a(fk1Var5, null, null, null, null, null, null, false, qk1Var.t(wj1Var2, ll1Var, kl1Var, ql1Var, null, null, null), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                            case 1:
                                fk1 fk1Var9 = (fk1) obj3;
                                fk1Var9.getClass();
                                qk1 qk1Var2 = this.b;
                                fk1 fk1Var10 = (fk1) qk1Var2.l().a();
                                wj1 wj1Var3 = fk1Var10 != null ? fk1Var10.e : null;
                                vl1 vl1Var3 = fk1Var9.h;
                                return fk1.a(fk1Var9, null, null, null, null, null, null, false, qk1Var2.t(wj1Var3, vl1Var3 != null ? vl1Var3.e : null, ((aa1) fa1Var2).a, vl1Var3 != null ? vl1Var3.h : null, (vl1Var3 == null || (jl1Var2 = vl1Var3.j) == null || (a = jl1Var2.a()) == null) ? null : a.c, (vl1Var3 == null || (jl1Var = vl1Var3.j) == null || (b = jl1Var.b()) == null) ? null : b.c, vl1Var3 != null ? vl1Var3.i : null), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                            default:
                                fk1 fk1Var11 = (fk1) obj3;
                                fk1Var11.getClass();
                                vl1 vl1Var4 = fk1Var11.h;
                                qk1 qk1Var3 = this.b;
                                fk1 fk1Var12 = (fk1) qk1Var3.l().a();
                                wj1 wj1Var4 = fk1Var12 != null ? fk1Var12.e : null;
                                ll1 ll1Var2 = vl1Var4 != null ? vl1Var4.e : null;
                                kl1 kl1Var2 = vl1Var4 != null ? vl1Var4.g : null;
                                ql1 ql1Var2 = vl1Var4 != null ? vl1Var4.h : null;
                                y91 y91Var = (y91) fa1Var2;
                                boolean z = y91Var.b;
                                String str3 = y91Var.a;
                                String str4 = z ? str3 : (vl1Var4 == null || (jl1Var3 = vl1Var4.j) == null || (a2 = jl1Var3.a()) == null) ? null : a2.c;
                                if (z) {
                                    if (vl1Var4 != null && (jl1Var4 = vl1Var4.j) != null && (b2 = jl1Var4.b()) != null) {
                                        str2 = b2.c;
                                    }
                                    str = str2;
                                } else {
                                    str = str3;
                                }
                                return fk1.a(fk1Var11, null, null, null, null, null, null, false, qk1Var3.t(wj1Var4, ll1Var2, kl1Var2, ql1Var2, str4, str, Boolean.valueOf(z)), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                        }
                    }
                });
                return;
            }
            if (fa1Var instanceof aa1) {
                n(null, new Function1(this) { // from class: hk1
                    public final /* synthetic */ qk1 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        vl1 vl1Var;
                        vl1 vl1Var2;
                        jl1 jl1Var;
                        nl1 b;
                        jl1 jl1Var2;
                        nl1 a;
                        jl1 jl1Var3;
                        nl1 a2;
                        String str;
                        jl1 jl1Var4;
                        nl1 b2;
                        int i6 = i5;
                        ql1 ql1Var = null;
                        str2 = null;
                        str2 = null;
                        String str2 = null;
                        ql1Var = null;
                        fa1 fa1Var2 = fa1Var;
                        switch (i6) {
                            case 0:
                                fk1 fk1Var5 = (fk1) obj3;
                                fk1Var5.getClass();
                                qk1 qk1Var = this.b;
                                fk1 fk1Var6 = (fk1) qk1Var.l().a();
                                wj1 wj1Var2 = fk1Var6 != null ? fk1Var6.e : null;
                                ll1 ll1Var = ((ba1) fa1Var2).a;
                                fk1 fk1Var7 = (fk1) qk1Var.l().a();
                                kl1 kl1Var = (fk1Var7 == null || (vl1Var2 = fk1Var7.h) == null) ? null : vl1Var2.g;
                                fk1 fk1Var8 = (fk1) qk1Var.l().a();
                                if (fk1Var8 != null && (vl1Var = fk1Var8.h) != null) {
                                    ql1Var = vl1Var.h;
                                }
                                return fk1.a(fk1Var5, null, null, null, null, null, null, false, qk1Var.t(wj1Var2, ll1Var, kl1Var, ql1Var, null, null, null), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                            case 1:
                                fk1 fk1Var9 = (fk1) obj3;
                                fk1Var9.getClass();
                                qk1 qk1Var2 = this.b;
                                fk1 fk1Var10 = (fk1) qk1Var2.l().a();
                                wj1 wj1Var3 = fk1Var10 != null ? fk1Var10.e : null;
                                vl1 vl1Var3 = fk1Var9.h;
                                return fk1.a(fk1Var9, null, null, null, null, null, null, false, qk1Var2.t(wj1Var3, vl1Var3 != null ? vl1Var3.e : null, ((aa1) fa1Var2).a, vl1Var3 != null ? vl1Var3.h : null, (vl1Var3 == null || (jl1Var2 = vl1Var3.j) == null || (a = jl1Var2.a()) == null) ? null : a.c, (vl1Var3 == null || (jl1Var = vl1Var3.j) == null || (b = jl1Var.b()) == null) ? null : b.c, vl1Var3 != null ? vl1Var3.i : null), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                            default:
                                fk1 fk1Var11 = (fk1) obj3;
                                fk1Var11.getClass();
                                vl1 vl1Var4 = fk1Var11.h;
                                qk1 qk1Var3 = this.b;
                                fk1 fk1Var12 = (fk1) qk1Var3.l().a();
                                wj1 wj1Var4 = fk1Var12 != null ? fk1Var12.e : null;
                                ll1 ll1Var2 = vl1Var4 != null ? vl1Var4.e : null;
                                kl1 kl1Var2 = vl1Var4 != null ? vl1Var4.g : null;
                                ql1 ql1Var2 = vl1Var4 != null ? vl1Var4.h : null;
                                y91 y91Var = (y91) fa1Var2;
                                boolean z = y91Var.b;
                                String str3 = y91Var.a;
                                String str4 = z ? str3 : (vl1Var4 == null || (jl1Var3 = vl1Var4.j) == null || (a2 = jl1Var3.a()) == null) ? null : a2.c;
                                if (z) {
                                    if (vl1Var4 != null && (jl1Var4 = vl1Var4.j) != null && (b2 = jl1Var4.b()) != null) {
                                        str2 = b2.c;
                                    }
                                    str = str2;
                                } else {
                                    str = str3;
                                }
                                return fk1.a(fk1Var11, null, null, null, null, null, null, false, qk1Var3.t(wj1Var4, ll1Var2, kl1Var2, ql1Var2, str4, str, Boolean.valueOf(z)), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                        }
                    }
                });
                return;
            } else if (fa1Var instanceof y91) {
                n(null, new Function1(this) { // from class: hk1
                    public final /* synthetic */ qk1 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        vl1 vl1Var;
                        vl1 vl1Var2;
                        jl1 jl1Var;
                        nl1 b;
                        jl1 jl1Var2;
                        nl1 a;
                        jl1 jl1Var3;
                        nl1 a2;
                        String str;
                        jl1 jl1Var4;
                        nl1 b2;
                        int i6 = i4;
                        ql1 ql1Var = null;
                        str2 = null;
                        str2 = null;
                        String str2 = null;
                        ql1Var = null;
                        fa1 fa1Var2 = fa1Var;
                        switch (i6) {
                            case 0:
                                fk1 fk1Var5 = (fk1) obj3;
                                fk1Var5.getClass();
                                qk1 qk1Var = this.b;
                                fk1 fk1Var6 = (fk1) qk1Var.l().a();
                                wj1 wj1Var2 = fk1Var6 != null ? fk1Var6.e : null;
                                ll1 ll1Var = ((ba1) fa1Var2).a;
                                fk1 fk1Var7 = (fk1) qk1Var.l().a();
                                kl1 kl1Var = (fk1Var7 == null || (vl1Var2 = fk1Var7.h) == null) ? null : vl1Var2.g;
                                fk1 fk1Var8 = (fk1) qk1Var.l().a();
                                if (fk1Var8 != null && (vl1Var = fk1Var8.h) != null) {
                                    ql1Var = vl1Var.h;
                                }
                                return fk1.a(fk1Var5, null, null, null, null, null, null, false, qk1Var.t(wj1Var2, ll1Var, kl1Var, ql1Var, null, null, null), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                            case 1:
                                fk1 fk1Var9 = (fk1) obj3;
                                fk1Var9.getClass();
                                qk1 qk1Var2 = this.b;
                                fk1 fk1Var10 = (fk1) qk1Var2.l().a();
                                wj1 wj1Var3 = fk1Var10 != null ? fk1Var10.e : null;
                                vl1 vl1Var3 = fk1Var9.h;
                                return fk1.a(fk1Var9, null, null, null, null, null, null, false, qk1Var2.t(wj1Var3, vl1Var3 != null ? vl1Var3.e : null, ((aa1) fa1Var2).a, vl1Var3 != null ? vl1Var3.h : null, (vl1Var3 == null || (jl1Var2 = vl1Var3.j) == null || (a = jl1Var2.a()) == null) ? null : a.c, (vl1Var3 == null || (jl1Var = vl1Var3.j) == null || (b = jl1Var.b()) == null) ? null : b.c, vl1Var3 != null ? vl1Var3.i : null), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                            default:
                                fk1 fk1Var11 = (fk1) obj3;
                                fk1Var11.getClass();
                                vl1 vl1Var4 = fk1Var11.h;
                                qk1 qk1Var3 = this.b;
                                fk1 fk1Var12 = (fk1) qk1Var3.l().a();
                                wj1 wj1Var4 = fk1Var12 != null ? fk1Var12.e : null;
                                ll1 ll1Var2 = vl1Var4 != null ? vl1Var4.e : null;
                                kl1 kl1Var2 = vl1Var4 != null ? vl1Var4.g : null;
                                ql1 ql1Var2 = vl1Var4 != null ? vl1Var4.h : null;
                                y91 y91Var = (y91) fa1Var2;
                                boolean z = y91Var.b;
                                String str3 = y91Var.a;
                                String str4 = z ? str3 : (vl1Var4 == null || (jl1Var3 = vl1Var4.j) == null || (a2 = jl1Var3.a()) == null) ? null : a2.c;
                                if (z) {
                                    if (vl1Var4 != null && (jl1Var4 = vl1Var4.j) != null && (b2 = jl1Var4.b()) != null) {
                                        str2 = b2.c;
                                    }
                                    str = str2;
                                } else {
                                    str = str3;
                                }
                                return fk1.a(fk1Var11, null, null, null, null, null, null, false, qk1Var3.t(wj1Var4, ll1Var2, kl1Var2, ql1Var2, str4, str, Boolean.valueOf(z)), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                        }
                    }
                });
                return;
            } else {
                zzl.b();
                return;
            }
        }
        if (l().a() == null) {
            g9i g9iVar3 = this.r;
            if (g9iVar3 == null || !g9iVar3.isActive()) {
                this.r = xw3.L(un0.z(this), null, null, new jk1(this, null), 3);
                return;
            }
            return;
        }
        fk1 fk1Var5 = (fk1) l().a();
        Integer valueOf2 = (fk1Var5 == null || (am1Var2 = fk1Var5.b) == null) ? null : Integer.valueOf(am1Var2.b);
        fk1 fk1Var6 = (fk1) l().a();
        Integer valueOf3 = (fk1Var6 == null || (am1Var = fk1Var6.b) == null) ? null : Integer.valueOf(am1Var.a);
        fk1 fk1Var7 = (fk1) l().a();
        Season.SubSeasonType subSeasonType5 = fk1Var7 != null ? fk1Var7.c : null;
        if (valueOf2 == null || valueOf3 == null || subSeasonType5 == null) {
            return;
        }
        int intValue = valueOf3.intValue();
        int intValue2 = valueOf2.intValue();
        n(null, new Function1() { // from class: gk1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                int i42 = i5;
                fa1 fa1Var2 = fa1Var;
                switch (i42) {
                    case 0:
                        fk1 fk1Var22 = (fk1) obj3;
                        fk1Var22.getClass();
                        return fk1.a(fk1Var22, null, null, ((ea1) fa1Var2).a, null, null, null, true, null, 187);
                    default:
                        fk1 fk1Var32 = (fk1) obj3;
                        fk1Var32.getClass();
                        return fk1.a(fk1Var32, null, null, null, null, null, null, fk1Var32.g || ((z91) fa1Var2).a, null, 191);
                }
            }
        });
        g9i g9iVar4 = this.q;
        if (g9iVar4 != null) {
            g9iVar4.e(null);
        }
        this.q = xw3.L(un0.z(this), null, null, new nk1(this, intValue, subSeasonType5, null, intValue2, null), 3);
    }
}
