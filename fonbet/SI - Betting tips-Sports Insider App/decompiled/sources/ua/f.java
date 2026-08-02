package ua;

import com.google.android.gms.internal.measurement.y3;
import gh.r0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.v;
import kotlin.jvm.internal.Ref;
import r3.e0;
import v3.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends ci.c {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q0(String str, String str2, String str3, String str4, mf.c cVar) {
        a aVar;
        int i5;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f24129e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24129e = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f24127c;
                Object obj2 = lf.a.f20034a;
                i5 = aVar.f24129e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    aVar.f24125a = str;
                    aVar.f24126b = str2;
                    aVar.f24129e = 1;
                    obj = d(str3, str4, aVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return new Integer(((h) obj).getStatusCode());
                    }
                    str2 = aVar.f24126b;
                    str = aVar.f24125a;
                    h8.b.B(obj);
                }
                aVar.f24125a = null;
                aVar.f24126b = null;
                aVar.f24129e = 2;
                obj = ((e0) obj).i(str, str2, aVar);
            }
        }
        aVar = new a(this, cVar);
        Object obj3 = aVar.f24127c;
        Object obj22 = lf.a.f20034a;
        i5 = aVar.f24129e;
        if (i5 != 0) {
        }
        aVar.f24125a = null;
        aVar.f24126b = null;
        aVar.f24129e = 2;
        obj3 = ((e0) obj3).i(str, str2, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0068, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x006a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0059, code lost:
    
        if (r6 == r3) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(String str, String str2, String str3, String str4, mf.c cVar) {
        b bVar;
        int i5;
        String str5;
        String str6;
        Object d10;
        Object obj;
        Object obj2;
        T t3;
        T t5;
        T t10;
        T t11;
        T t12;
        T t13;
        T t14;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f24134e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f24134e = i10 - Integer.MIN_VALUE;
                Object obj3 = bVar.f24132c;
                Object obj4 = lf.a.f20034a;
                i5 = bVar.f24134e;
                Object obj5 = null;
                if (i5 != 0) {
                    h8.b.B(obj3);
                    str5 = str;
                    bVar.f24130a = str5;
                    str6 = str2;
                    bVar.f24131b = str6;
                    bVar.f24134e = 1;
                    d10 = d(str3, str4, bVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj3);
                        x3.e eVar = (x3.e) obj3;
                        if (eVar.getStatusCode() == 200) {
                            try {
                                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                                List<x3.d> adverts = eVar.getAdverts();
                                if (adverts != null) {
                                    for (x3.d dVar : adverts) {
                                        if (dVar.getBottomNavigation() != null) {
                                            List<x3.c> bottomNavigation = dVar.getBottomNavigation();
                                            if (bottomNavigation != null) {
                                                ArrayList arrayList = new ArrayList(v.k(bottomNavigation, 10));
                                                for (x3.c cVar2 : bottomNavigation) {
                                                    obj = obj5;
                                                    try {
                                                        arrayList.add(new ga.a(cVar2.getId(), cVar2.getUrl(), cVar2.getImage()));
                                                        obj5 = obj;
                                                    } catch (Exception unused) {
                                                        return obj;
                                                    }
                                                }
                                                obj2 = obj5;
                                                t14 = arrayList;
                                            } else {
                                                obj2 = obj5;
                                                t14 = obj2;
                                            }
                                            objectRef.element = t14;
                                        } else {
                                            obj2 = obj5;
                                        }
                                        if (dVar.getHeader() != null) {
                                            List<x3.c> header = dVar.getHeader();
                                            if (header != null) {
                                                t13 = new ArrayList(v.k(header, 10));
                                                for (x3.c cVar3 : header) {
                                                    t13.add(new ga.a(cVar3.getId(), cVar3.getUrl(), cVar3.getImage()));
                                                }
                                            } else {
                                                t13 = obj2;
                                            }
                                            objectRef2.element = t13;
                                        }
                                        if (dVar.getStatusForecasts() != null) {
                                            List<x3.c> statusForecasts = dVar.getStatusForecasts();
                                            if (statusForecasts != null) {
                                                t12 = new ArrayList(v.k(statusForecasts, 10));
                                                for (x3.c cVar4 : statusForecasts) {
                                                    t12.add(new ga.a(cVar4.getId(), cVar4.getUrl(), cVar4.getImage()));
                                                }
                                            } else {
                                                t12 = obj2;
                                            }
                                            objectRef3.element = t12;
                                        }
                                        if (dVar.getBottomForecasts() != null) {
                                            List<x3.c> bottomForecasts = dVar.getBottomForecasts();
                                            if (bottomForecasts != null) {
                                                t11 = new ArrayList(v.k(bottomForecasts, 10));
                                                for (x3.c cVar5 : bottomForecasts) {
                                                    t11.add(new ga.a(cVar5.getId(), cVar5.getUrl(), cVar5.getImage()));
                                                }
                                            } else {
                                                t11 = obj2;
                                            }
                                            objectRef4.element = t11;
                                        }
                                        if (dVar.getExpressForecasts() != null) {
                                            List<x3.c> expressForecasts = dVar.getExpressForecasts();
                                            if (expressForecasts != null) {
                                                t10 = new ArrayList(v.k(expressForecasts, 10));
                                                for (x3.c cVar6 : expressForecasts) {
                                                    t10.add(new ga.a(cVar6.getId(), cVar6.getUrl(), cVar6.getImage()));
                                                }
                                            } else {
                                                t10 = obj2;
                                            }
                                            objectRef5.element = t10;
                                        }
                                        if (dVar.getLiveButton() != null) {
                                            List<x3.c> liveButton = dVar.getLiveButton();
                                            if (liveButton != null) {
                                                t5 = new ArrayList(v.k(liveButton, 10));
                                                for (x3.c cVar7 : liveButton) {
                                                    t5.add(new ga.a(cVar7.getId(), cVar7.getUrl(), cVar7.getImage()));
                                                }
                                            } else {
                                                t5 = obj2;
                                            }
                                            objectRef6.element = t5;
                                        }
                                        if (dVar.getAfterPaymentCp() != null) {
                                            List<x3.c> afterPaymentCp = dVar.getAfterPaymentCp();
                                            if (afterPaymentCp != null) {
                                                t3 = new ArrayList(v.k(afterPaymentCp, 10));
                                                for (x3.c cVar8 : afterPaymentCp) {
                                                    t3.add(new ga.a(cVar8.getId(), cVar8.getUrl(), cVar8.getImage()));
                                                }
                                            } else {
                                                t3 = obj2;
                                            }
                                            objectRef7.element = t3;
                                        }
                                        obj5 = obj2;
                                    }
                                }
                                obj = obj5;
                                List list = (List) objectRef.element;
                                List list2 = (List) objectRef2.element;
                                List list3 = (List) objectRef3.element;
                                List list4 = (List) objectRef4.element;
                                List list5 = (List) objectRef5.element;
                                List list6 = (List) objectRef6.element;
                                List list7 = (List) objectRef7.element;
                                ga.b bVar2 = new ga.b();
                                bVar2.f9912a = list;
                                bVar2.f9913b = list2;
                                bVar2.f9914c = list3;
                                bVar2.f9915d = list4;
                                bVar2.f9916e = list5;
                                bVar2.f9917f = list6;
                                bVar2.f9918g = list7;
                                return bVar2;
                            } catch (Exception unused2) {
                            }
                        }
                        return obj5;
                    }
                    str6 = bVar.f24131b;
                    String str7 = bVar.f24130a;
                    h8.b.B(obj3);
                    d10 = obj3;
                    str5 = str7;
                }
                bVar.f24130a = null;
                bVar.f24131b = null;
                bVar.f24134e = 2;
                obj3 = ((e0) d10).e(str5, str6, bVar);
            }
        }
        bVar = new b(this, cVar);
        Object obj32 = bVar.f24132c;
        Object obj42 = lf.a.f20034a;
        i5 = bVar.f24134e;
        Object obj52 = null;
        if (i5 != 0) {
        }
        bVar.f24130a = null;
        bVar.f24131b = null;
        bVar.f24134e = 2;
        obj32 = ((e0) d10).e(str5, str6, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable s0(String str, String str2, String str3, String str4, mf.c cVar) {
        c cVar2;
        int i5;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f24139e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f24139e = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f24137c;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f24139e;
                String str5 = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    cVar2.f24135a = str;
                    cVar2.f24136b = str2;
                    cVar2.f24139e = 1;
                    obj = d(str3, str4, cVar2);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        h hVar = (h) obj;
                        if (hVar.getStatusCode() == 200) {
                            try {
                                r0 a7 = hVar.a();
                                if (a7 != null) {
                                    str5 = a7.r();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        return new Pair(new Integer(hVar.getStatusCode()), str5);
                    }
                    str2 = cVar2.f24136b;
                    str = cVar2.f24135a;
                    h8.b.B(obj);
                }
                cVar2.f24135a = null;
                cVar2.f24136b = null;
                cVar2.f24139e = 2;
                obj = ((e0) obj).D(str, str2, cVar2);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f24137c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f24139e;
        String str52 = null;
        if (i5 != 0) {
        }
        cVar2.f24135a = null;
        cVar2.f24136b = null;
        cVar2.f24139e = 2;
        obj2 = ((e0) obj2).D(str, str2, cVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (((r3.e0) r9).c(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t0(int i5, String str, mf.c cVar) {
        d dVar;
        int i10;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f24144e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f24144e = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f24142c;
                lf.a aVar = lf.a.f20034a;
                i10 = dVar.f24144e;
                if (i10 != 0) {
                    h8.b.B(obj);
                    dVar.f24141b = str;
                    dVar.f24140a = i5;
                    dVar.f24144e = 1;
                    obj = ((ea.e) y3.m(ea.e.class, null, 6)).b(dVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    i5 = dVar.f24140a;
                    str = dVar.f24141b;
                    h8.b.B(obj);
                }
                dVar.f24141b = null;
                dVar.f24140a = i5;
                dVar.f24144e = 2;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f24142c;
        lf.a aVar2 = lf.a.f20034a;
        i10 = dVar.f24144e;
        if (i10 != 0) {
        }
        dVar.f24141b = null;
        dVar.f24140a = i5;
        dVar.f24144e = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (((r3.e0) r9).d(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u0(int i5, String str, mf.c cVar) {
        e eVar;
        int i10;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f24149e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f24149e = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f24147c;
                lf.a aVar = lf.a.f20034a;
                i10 = eVar.f24149e;
                if (i10 != 0) {
                    h8.b.B(obj);
                    eVar.f24146b = str;
                    eVar.f24145a = i5;
                    eVar.f24149e = 1;
                    obj = ((ea.e) y3.m(ea.e.class, null, 6)).b(eVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    i5 = eVar.f24145a;
                    str = eVar.f24146b;
                    h8.b.B(obj);
                }
                eVar.f24146b = null;
                eVar.f24145a = i5;
                eVar.f24149e = 2;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f24147c;
        lf.a aVar2 = lf.a.f20034a;
        i10 = eVar.f24149e;
        if (i10 != 0) {
        }
        eVar.f24146b = null;
        eVar.f24145a = i5;
        eVar.f24149e = 2;
    }
}
