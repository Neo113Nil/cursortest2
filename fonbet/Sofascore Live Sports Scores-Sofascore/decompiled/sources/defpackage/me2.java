package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class me2 implements ff2 {
    public final ny b = new ny(0, vy2.a, vy2.class, "now", "now()Lkotlin/time/Instant;", 0, 1);

    @Override // defpackage.ff2
    public final Object a(zad zadVar, mad madVar, zad zadVar2, tvd tvdVar, cad cadVar) {
        return (wkn.H(zadVar2.d).b || wkn.H(madVar.c).b) ? ef2.b : ff2.a.a(zadVar, madVar, zadVar2, tvdVar, cadVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00a2, code lost:
    
        if (r8 > 0) goto L33;
     */
    @Override // defpackage.ff2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final df2 b(zad zadVar, mad madVar, tvd tvdVar, aad aadVar) {
        String str;
        String str2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        String str3;
        int i;
        o5a o5aVar = (o5a) this.b.invoke();
        le2 le2Var = new le2(zadVar, madVar, o5aVar);
        ke2 ke2Var = le2Var.b;
        boolean z = ke2Var.b;
        int i2 = ke2Var.c;
        if (!z) {
            ke2 ke2Var2 = le2Var.c;
            if (!ke2Var2.b) {
                if (!ke2Var2.a) {
                    fad fadVar = madVar.c;
                    if (fadVar.a("If-Modified-Since") == null && fadVar.a("If-None-Match") == null) {
                        o5a b = le2Var.b();
                        long j6 = le2Var.k;
                        if (b != null) {
                            str = "If-Modified-Since";
                            str2 = "If-None-Match";
                            j = Math.max(0L, j6 - b.d());
                        } else {
                            str = "If-Modified-Since";
                            str2 = "If-None-Match";
                            j = 0;
                        }
                        int i3 = le2Var.m;
                        if (i3 != -1) {
                            j2 = j6;
                            j = Math.max(j, i3 * 1000);
                        } else {
                            j2 = j6;
                        }
                        long max = j + Math.max(0L, j2 - le2Var.j) + Math.max(0L, o5aVar.d() - j2);
                        if (i2 != -1) {
                            j3 = i2 * 1000;
                        } else {
                            o5a a = le2Var.a();
                            if (a != null) {
                                o5a b2 = le2Var.b();
                                if (b2 != null) {
                                    j2 = b2.d();
                                }
                                j3 = a.d() - j2;
                            }
                            j3 = 0;
                        }
                        int i4 = ke2Var2.c;
                        if (i4 != -1) {
                            j3 = Math.min(j3, i4 * 1000);
                        }
                        int i5 = ke2Var2.f;
                        long j7 = i5 != -1 ? i5 * 1000 : 0L;
                        if (ke2Var.d || (i = ke2Var2.e) == -1) {
                            j4 = j3;
                            j5 = 0;
                        } else {
                            j4 = j3;
                            j5 = i * 1000;
                        }
                        if (!ke2Var.a) {
                            long j8 = j7 + max;
                            if (j8 < j4 + j5) {
                                fad fadVar2 = zadVar.d;
                                fadVar2.getClass();
                                Map map = fadVar2.a;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : map.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), CollectionsKt.U0((Collection) entry.getValue()));
                                }
                                if (j8 >= j4) {
                                    String lowerCase = "Warning".toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    Object obj = linkedHashMap.get(lowerCase);
                                    if (obj == null) {
                                        obj = wv8.n(linkedHashMap, lowerCase);
                                    }
                                    ((List) obj).add("110 HttpURLConnection \"Response is stale\"");
                                }
                                if (max > 86400000 && i2 == -1 && le2Var.a() == null) {
                                    String lowerCase2 = "Warning".toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                    Object obj2 = linkedHashMap.get(lowerCase2);
                                    if (obj2 == null) {
                                        obj2 = wv8.n(linkedHashMap, lowerCase2);
                                    }
                                    ((List) obj2).add("113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                return new df2(zad.a(le2Var.a, new fad(tub.p(linkedHashMap)), 55));
                            }
                        }
                        String str4 = le2Var.l;
                        if (str4 != null) {
                            str3 = str2;
                        } else {
                            o5a o5aVar2 = le2Var.g;
                            String str5 = le2Var.f;
                            if (o5aVar2 == null) {
                                if (str5 != null) {
                                    o5a o5aVar3 = o5a.c;
                                    o5aVar2 = q5a.L(str5, djk.a);
                                    le2Var.g = o5aVar2;
                                } else {
                                    o5aVar2 = null;
                                }
                            }
                            if (o5aVar2 != null) {
                                str3 = str;
                                str4 = str5;
                            } else {
                                if (le2Var.b() == null) {
                                    return new df2(madVar);
                                }
                                str4 = le2Var.d;
                                str3 = str;
                            }
                        }
                        Map map2 = fadVar.a;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            linkedHashMap2.put(entry2.getKey(), CollectionsKt.U0((Collection) entry2.getValue()));
                        }
                        str4.getClass();
                        String lowerCase3 = str3.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        Object obj3 = linkedHashMap2.get(lowerCase3);
                        if (obj3 == null) {
                            obj3 = wv8.n(linkedHashMap2, lowerCase3);
                        }
                        ((List) obj3).add(str4);
                        return new df2(new mad(madVar.a, madVar.b, new fad(tub.p(linkedHashMap2)), madVar.d));
                    }
                }
                return new df2(madVar);
            }
        }
        return new df2(madVar);
    }
}
