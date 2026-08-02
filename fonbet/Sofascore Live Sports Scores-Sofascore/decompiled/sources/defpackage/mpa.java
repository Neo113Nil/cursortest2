package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mpa implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ mpa(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        int id;
        String str3;
        switch (this.a) {
            case 0:
                qpa qpaVar = (qpa) obj2;
                break;
            case 1:
                ksa ksaVar = (ksa) obj2;
                break;
            case 2:
                Map e = ((ssa) obj2).e();
                if (e.isEmpty()) {
                }
                break;
            case 3:
                ((Integer) obj).intValue();
                jrj jrjVar = (jrj) obj2;
                jrjVar.getClass();
                break;
            case 4:
                ((Integer) obj).intValue();
                u2f u2fVar = (u2f) obj2;
                u2fVar.getClass();
                break;
            case 5:
                ((Integer) obj2).getClass();
                jgb.d(aba.K(1), (of3) obj);
                break;
            case 6:
                ((Integer) obj2).getClass();
                jgb.e(aba.K(1), (of3) obj);
                break;
            case 7:
                ((Integer) obj2).getClass();
                jgb.b(aba.K(1), (of3) obj);
                break;
            case 8:
                ((Integer) obj2).getClass();
                jgb.a(aba.K(1), (of3) obj);
                break;
            case 9:
                ((Integer) obj2).getClass();
                u0a.h(aba.K(1), (of3) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                u0a.i(aba.K(1), (of3) obj);
                break;
            case 12:
                ((Integer) obj).getClass();
                g6c g6cVar = (g6c) obj2;
                g6cVar.getClass();
                if (!(g6cVar instanceof r5c)) {
                    if (!(g6cVar instanceof o5c)) {
                        if (!(g6cVar instanceof n5c)) {
                            if (!(g6cVar instanceof w5c)) {
                                if (!(g6cVar instanceof e6c)) {
                                    if (!(g6cVar instanceof a6c)) {
                                        if (!(g6cVar instanceof f5c)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        str = ((a6c) g6cVar).a.a;
                                        str2 = "rss_";
                                    }
                                } else {
                                    str = ((e6c) g6cVar).a.a;
                                    str2 = "x_";
                                }
                            } else {
                                id = ((w5c) g6cVar).a.getId();
                                str3 = "news_";
                            }
                        } else {
                            str = ((n5c) g6cVar).a.getId();
                            str2 = "clip_";
                        }
                    } else {
                        str = ((o5c) g6cVar).a.getId();
                        str2 = "clipUrl_";
                    }
                    break;
                } else {
                    id = ((r5c) g6cVar).a.getId();
                    str3 = "highlight_";
                }
                break;
            case 13:
                break;
            case 14:
                ((Integer) obj).getClass();
                fhd fhdVar = (fhd) obj2;
                fhdVar.getClass();
                break;
            case 16:
                uae uaeVar = (uae) obj;
                uaeVar.getClass();
                ((s18) obj2).getClass();
                break;
            case 17:
                ((Integer) obj2).getClass();
                krd.b(aba.K(1), (of3) obj);
                break;
            case 18:
                ((Integer) obj2).getClass();
                t62.K(aba.K(1), (of3) obj);
                break;
            case 23:
                ((Integer) obj2).getClass();
                cga.e(aba.K(1), (of3) obj);
                break;
            case 24:
                ((Integer) obj2).getClass();
                mha.a(aba.K(1), (of3) obj);
                break;
            case 25:
                ((Integer) obj2).getClass();
                nce.a(aba.K(1), (of3) obj);
                break;
            case 26:
                obb obbVar = (obb) obj2;
                obbVar.getClass();
                break;
            case 27:
                obb obbVar2 = (obb) obj2;
                obbVar2.getClass();
                break;
        }
        return Boolean.valueOf(Intrinsics.c(obj, obj2));
    }

    public /* synthetic */ mpa(int i, int i2) {
        this.a = i2;
    }
}
