package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class m04 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ m04(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0249, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029e  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        p75 p75Var;
        float f;
        String str;
        List list;
        String str2;
        String str3;
        Object u2gVar;
        String str4;
        String str5;
        int i = this.a;
        Object obj3 = null;
        Context context = this.b;
        switch (i) {
            case 0:
                PlayerData playerData = (PlayerData) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                playerData.getClass();
                int id = playerData.getPlayer().getId();
                Set set = d9b.a;
                return new p9b(id, d9b.c(playerData), null, false, null, null, null, null, null, dti.u(context, playerData.getPlayer().getGender(), Sports.CRICKET, playerData.getPosition(), false), !booleanValue, 1532);
            case 1:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.e0(-534706435);
                    Object k = av8Var.k(bh3.c);
                    if (k == null) {
                        yhk.s("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                        return null;
                    }
                    p0d p0dVar = (p0d) k;
                    av8Var.s(false);
                    n6l n6lVar = n6l.a;
                    Integer num = (Integer) p0dVar.c(n6l.h);
                    if (num != null) {
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num != null) {
                            p75Var = new p75(num.intValue());
                            if (p75Var != null) {
                                av8Var.d0(2013191149);
                                f = s75.b(((s75) av8Var.k(bh3.a)).a);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(2013189227);
                                av8Var.s(false);
                                f = p75Var.a;
                            }
                            y7l.a.getClass();
                            y7l y7lVar = p75.a(f, 240.0f) >= 0 ? y7l.b : p75.a(f, 312.0f) < 0 ? y7l.c : y7l.d;
                            context.getClass();
                            str = (String) p0dVar.c(n6l.d);
                            if (str != null) {
                                bga bgaVar = vga.a;
                                if (str.length() != 0) {
                                    try {
                                        p2g p2gVar = w2g.b;
                                        bgaVar.getClass();
                                        u2gVar = bgaVar.b(new xg0(v6l.Companion.serializer(), 0), str);
                                    } catch (Throwable th) {
                                        p2g p2gVar2 = w2g.b;
                                        u2gVar = new u2g(th);
                                    }
                                    Throwable a = w2g.a(u2gVar);
                                    if (a != null) {
                                        s38.a().c(a);
                                    }
                                    if (!(u2gVar instanceof u2g)) {
                                        obj3 = u2gVar;
                                    }
                                }
                                list = (List) obj3;
                                break;
                            }
                            list = Collections.EMPTY_LIST;
                            list.getClass();
                            tee X = l6g.X(n6l.b(context, list));
                            Boolean bool = (Boolean) p0dVar.c(n6l.b);
                            boolean booleanValue2 = bool != null ? bool.booleanValue() : true;
                            str2 = (String) p0dVar.c(n6l.c);
                            if (str2 == null) {
                                str2 = "NOTIFICATION_DISABLED";
                            }
                            String str6 = str2;
                            str3 = (String) p0dVar.c(n6l.f);
                            if (str3 == null) {
                                str3 = "";
                            }
                            String str7 = str3;
                            boolean c = Intrinsics.c(p0dVar.c(n6l.e), Boolean.TRUE);
                            Boolean bool2 = (Boolean) p0dVar.c(n6l.k);
                            boolean booleanValue3 = bool2 == null ? bool2.booleanValue() : false;
                            Boolean bool3 = (Boolean) p0dVar.c(n6l.l);
                            o6a.g(y7lVar, booleanValue2, str6, str7, c, X, booleanValue3, bool3 != null ? bool3.booleanValue() : false, null, av8Var, 0);
                        }
                    }
                    p75Var = null;
                    if (p75Var != null) {
                    }
                    y7l.a.getClass();
                    y7l y7lVar2 = p75.a(f, 240.0f) >= 0 ? y7l.b : p75.a(f, 312.0f) < 0 ? y7l.c : y7l.d;
                    context.getClass();
                    str = (String) p0dVar.c(n6l.d);
                    if (str != null) {
                    }
                    list = Collections.EMPTY_LIST;
                    list.getClass();
                    tee X2 = l6g.X(n6l.b(context, list));
                    Boolean bool4 = (Boolean) p0dVar.c(n6l.b);
                    boolean booleanValue22 = bool4 != null ? bool4.booleanValue() : true;
                    str2 = (String) p0dVar.c(n6l.c);
                    if (str2 == null) {
                    }
                    String str62 = str2;
                    str3 = (String) p0dVar.c(n6l.f);
                    if (str3 == null) {
                    }
                    String str72 = str3;
                    boolean c2 = Intrinsics.c(p0dVar.c(n6l.e), Boolean.TRUE);
                    Boolean bool22 = (Boolean) p0dVar.c(n6l.k);
                    if (bool22 == null) {
                    }
                    Boolean bool32 = (Boolean) p0dVar.c(n6l.l);
                    o6a.g(y7lVar2, booleanValue22, str62, str72, c2, X2, booleanValue3, bool32 != null ? bool32.booleanValue() : false, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 2:
                ((Integer) obj).getClass();
                z1j z1jVar = (z1j) obj2;
                z1jVar.getClass();
                if (z1jVar instanceof t1j) {
                    return SearchResponseKt.MANAGER_ENTITY;
                }
                if (z1jVar instanceof y1j) {
                    str4 = ((y1j) z1jVar).a.b(context);
                    str5 = "value_";
                } else if (z1jVar instanceof v1j) {
                    str4 = ((v1j) z1jVar).a;
                    str5 = "section_";
                } else {
                    if (z1jVar instanceof u1j) {
                        return ljg.j(((u1j) z1jVar).a.a, "player_");
                    }
                    if (z1jVar instanceof x1j) {
                        return "staff_section";
                    }
                    if (z1jVar instanceof w1j) {
                        c2j c2jVar = ((w1j) z1jVar).a;
                        return dmi.l(c2jVar.a, "staff_", c2jVar.b, "_");
                    }
                    if (z1jVar instanceof q1j) {
                        return "depth_chart";
                    }
                    if (!(z1jVar instanceof r1j)) {
                        if (z1jVar instanceof s1j) {
                            return "ice_hockey_legend";
                        }
                        zzl.b();
                        return null;
                    }
                    str4 = ((r1j) z1jVar).a;
                    str5 = "ice_hockey_depth_chart_";
                }
                return dmi.q(str5, str4);
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc e0 = l98.e0(utcVar, 12.0f, 8.0f, 16.0f, 8.0f);
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, e0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    kq9.b(s6a.N(R.drawable.ic_predictions_menu, 6, av8Var2), "", bkh.l(utcVar, 18.0f), lz.D(R.color.surface_1, av8Var2), av8Var2, 432, 0);
                    xtc f0 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    String string = context.getString(R.string.vote);
                    string.getClass();
                    yf8 yf8Var = xth.a;
                    udj.c(string, f0, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 48, 0, 131064);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }
}
