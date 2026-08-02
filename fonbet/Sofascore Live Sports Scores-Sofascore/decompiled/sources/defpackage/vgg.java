package defpackage;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vgg {
    public final Function2 a;
    public final Function2 b;

    public vgg(String str) {
        tk1 tk1Var = new tk1(str, 10);
        i58 i58Var = new i58(2, null, 5);
        this.a = tk1Var;
        this.b = i58Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|15|(5:17|(5:19|(1:224)(1:24)|25|(6:204|(1:206)(1:223)|207|(4:210|(2:214|(1:216)(1:218))|219|208)|222|217)(3:27|(1:(2:202|203)(2:29|(1:200)(2:33|34)))|35)|(1:(3:38|(4:41|(1:51)(2:43|(2:49|50)(1:47))|48|39)|52)(3:53|(4:56|(1:66)(2:58|(2:64|65)(1:62))|63|54)|67)))(1:225)|(1:198)(32:71|(4:75|(5:77|(7:93|94|(4:96|(2:99|(1:101))(1:98)|80|(2:90|(2:92|(1:88)(1:89)))(2:82|(2:86|(0)(0))))|102|(0)(0)|80|(0)(0))|79|80|(0)(0))|105|(0)(0))|106|(1:108)|109|(1:111)|112|(1:114)|115|(1:117)(1:197)|118|(1:120)|121|(1:123)|124|(4:127|(2:129|130)(1:132)|131|125)|133|134|(1:136)|137|(3:139|(2:142|140)|143)|144|(1:146)|147|(1:149)|150|(1:152)(1:196)|153|(1:155)(1:195)|156|(1:158)(1:194)|159)|(1:161)(1:193)|162)(3:226|(1:228)|229)|163|164|165|(2:167|(5:190|191|164|165|(1:192)(0))(4:171|(3:178|179|(1:181)(8:182|14|15|(0)(0)|163|164|165|(0)(0)))|173|(1:175)(10:177|12|13|14|15|(0)(0)|163|164|165|(0)(0))))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x00e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x00e3, code lost:
    
        r7 = r11;
        r11 = r12;
        r12 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x00c5 -> B:12:0x00cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0094 -> B:14:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x00e6 -> B:16:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0485 -> B:151:0x0488). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, pgg pggVar, sq3 sq3Var) {
        ugg uggVar;
        vgg vggVar;
        int i;
        List u;
        Iterator it;
        ugg uggVar2;
        pgg pggVar2;
        jkg jkgVar;
        vgg vggVar2;
        pgg pggVar3;
        fsf fsfVar;
        lu3 lu3Var;
        int i2;
        ugg uggVar3;
        int i3;
        vkg vkgVar;
        jag jagVar;
        String str;
        int i4;
        int i5;
        int C;
        int D;
        if (sq3Var instanceof ugg) {
            uggVar = (ugg) sq3Var;
            int i6 = uggVar.B;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                uggVar.B = i6 - Integer.MIN_VALUE;
                vggVar = this;
                Object obj = uggVar.z;
                lu3 lu3Var2 = lu3.a;
                i = uggVar.B;
                jkg jkgVar2 = null;
                int i7 = 1;
                if (i != 0) {
                    u = fc6.u(obj);
                    it = list.iterator();
                    uggVar2 = uggVar;
                    pggVar2 = pggVar;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsf fsfVar2 = uggVar.y;
                    fsf fsfVar3 = uggVar.x;
                    fsf fsfVar4 = uggVar.w;
                    jag jagVar2 = uggVar.v;
                    it = uggVar.u;
                    u = uggVar.t;
                    pgg pggVar4 = uggVar.s;
                    vgg vggVar3 = uggVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Exception e) {
                        e = e;
                        fsfVar3.a = e;
                        jkgVar = jkgVar2;
                        vggVar2 = vggVar3;
                        pggVar3 = pggVar4;
                        fsfVar = fsfVar4;
                        if (jkgVar == null) {
                        }
                        uggVar2 = uggVar3;
                        pggVar2 = pggVar3;
                        vggVar = vggVar2;
                        i7 = i2;
                        lu3Var2 = lu3Var;
                        jkgVar2 = null;
                        if (!it.hasNext()) {
                        }
                    }
                    vggVar2 = vggVar3;
                    pggVar3 = pggVar4;
                    fsfVar = fsfVar4;
                    String str2 = (String) obj;
                    fsfVar2.a = str2;
                    jkgVar = ((ukg) vggVar2.a.invoke(fsfVar.a, pggVar3)).b();
                    if (jkgVar == null) {
                        String str3 = (String) fsfVar.a;
                        jagVar2.getClass();
                        str3.getClass();
                        rkg[] rkgVarArr = jkgVar.g;
                        rkgVarArr.getClass();
                        rkg rkgVar = (rkg) ph0.A(rkgVarArr);
                        if (rkgVar != null) {
                            List asList = Arrays.asList(rkgVar.h);
                            Collections.sort(asList);
                            Collections.reverse(asList);
                            int i8 = qha.B().a;
                            int i9 = (i8 == i7 || i8 == 2 || i8 == 3 || i8 == 0) ? i7 : 0;
                            if (i9 == 0) {
                                int i10 = hkg.c ? 5000 : TTAdConstant.STYLE_SIZE_RADIO_3_2;
                                i3 = 0;
                                vkg vkgVar2 = null;
                                for (int i11 = 0; i11 < asList.size(); i11++) {
                                    if (((vkg) asList.get(i11)).c != -1.0f && ((vkg) asList.get(i11)).a()) {
                                        vkgVar2 = (vkg) asList.get(i11);
                                        if (vkgVar2.c <= i10) {
                                            break;
                                        }
                                    }
                                }
                                vkgVar = vkgVar2;
                            } else {
                                int size = asList.size() - 1;
                                while (true) {
                                    if (size <= 0) {
                                        vkgVar = null;
                                        break;
                                    }
                                    if (((vkg) asList.get(size)).c != -1.0f && ((vkg) asList.get(size)).a()) {
                                        vkgVar = (vkg) asList.get(size);
                                        break;
                                    }
                                    size--;
                                }
                                i3 = 0;
                            }
                            if (vkgVar == null) {
                                if (i9 != 0) {
                                    float f = -1.0f;
                                    for (int i12 = i3; i12 < asList.size(); i12++) {
                                        vkg vkgVar3 = (vkg) asList.get(i12);
                                        if (vkgVar3.a()) {
                                            float f2 = vkgVar3.e * vkgVar3.d;
                                            if (f2 < f || f == -1.0f) {
                                                vkgVar = vkgVar3;
                                                f = f2;
                                            }
                                        }
                                    }
                                } else {
                                    float f3 = -1.0f;
                                    for (int i13 = i3; i13 < asList.size(); i13++) {
                                        vkg vkgVar4 = (vkg) asList.get(i13);
                                        if (vkgVar4.a()) {
                                            float f4 = vkgVar4.e * vkgVar4.d;
                                            if (f4 > f3 || f3 == -1.0f) {
                                                vkgVar = vkgVar4;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i3 = 0;
                            vkgVar = null;
                        }
                        if (vkgVar == null || (str = vkgVar.g) == null) {
                            uggVar3 = uggVar;
                            lu3Var = lu3Var2;
                            jagVar = null;
                        } else {
                            Integer num = jagVar2.u;
                            Integer num2 = jagVar2.C;
                            if (num2 != null && num2.intValue() == 2) {
                                String str4 = rkgVar.f;
                                if (str4 != null) {
                                    if (!str4.isEmpty()) {
                                        int E = vha.E(str4);
                                        if (E != -1) {
                                            i4 = (int) (E / 100.0d);
                                            if (i4 != -1) {
                                                i5 = 1;
                                            } else if (vha.D(str4) != -1) {
                                                i5 = 2;
                                            }
                                            C = wt3.C(i5);
                                            if (C == 0) {
                                                int E2 = vha.E(str4);
                                                if (E2 > -1) {
                                                    num = Integer.valueOf(E2 * (-1));
                                                    num2 = num != null ? Integer.valueOf(i3) : 1;
                                                }
                                            } else if (C == 1 && (D = vha.D(str4)) > -1) {
                                                num = Integer.valueOf(D);
                                                if (num != null) {
                                                }
                                            }
                                        }
                                        i4 = -1;
                                        if (i4 != -1) {
                                        }
                                        C = wt3.C(i5);
                                        if (C == 0) {
                                        }
                                    }
                                    i5 = 3;
                                    C = wt3.C(i5);
                                    if (C == 0) {
                                    }
                                }
                                num = null;
                                if (num != null) {
                                }
                            }
                            Integer num3 = num;
                            Integer num4 = num2;
                            Collection collection = jagVar2.h;
                            if (collection == null) {
                                collection = km5.a;
                            }
                            ArrayList arrayList = jkgVar.e;
                            arrayList.getClass();
                            ArrayList w0 = CollectionsKt.w0(arrayList, collection);
                            Collection collection2 = jagVar2.k;
                            if (collection2 == null) {
                                collection2 = km5.a;
                            }
                            Iterable iterable = (ArrayList) rkgVar.b;
                            if (iterable == null) {
                                iterable = km5.a;
                            }
                            ArrayList w02 = CollectionsKt.w0(iterable, collection2);
                            ArrayList arrayList2 = w02.isEmpty() ? null : w02;
                            String str5 = jagVar2.l;
                            if (str5 == null) {
                                str5 = (String) rkgVar.c;
                            }
                            String str6 = str5;
                            Collection collection3 = jagVar2.m;
                            if (collection3 == null) {
                                collection3 = km5.a;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = jkgVar.k;
                            arrayList4.getClass();
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                zkg zkgVar = (zkg) it2.next();
                                ugg uggVar4 = uggVar;
                                if (lig.VIEWABLE == lig.a(zkgVar.a)) {
                                    String str7 = zkgVar.a;
                                    str7.getClass();
                                    String str8 = zkgVar.b;
                                    str8.getClass();
                                    arrayList3.add(new ihg(str7, str8, 2000L, 0.5d));
                                }
                                uggVar = uggVar4;
                            }
                            uggVar3 = uggVar;
                            ArrayList w03 = CollectionsKt.w0(arrayList3, collection3);
                            Collection collection4 = jagVar2.n;
                            if (collection4 == null) {
                                collection4 = km5.a;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            rkg[] rkgVarArr2 = jkgVar.g;
                            rkgVarArr2.getClass();
                            rkg rkgVar2 = (rkg) ph0.A(rkgVarArr2);
                            if (rkgVar2 != null) {
                                ArrayList arrayList6 = (ArrayList) rkgVar2.a;
                                arrayList6.getClass();
                                c38 c38Var = new c38(i5h.g(new oh0(arrayList6, 1), new gfg(7)));
                                while (c38Var.hasNext()) {
                                    xkg xkgVar = (xkg) c38Var.next();
                                    String str9 = xkgVar.a;
                                    str9.getClass();
                                    lu3 lu3Var3 = lu3Var2;
                                    String str10 = xkgVar.b;
                                    str10.getClass();
                                    arrayList5.add(new ghg(str9, str10, hl3.a.contains(xkgVar.a)));
                                    str = str;
                                    lu3Var2 = lu3Var3;
                                }
                            }
                            lu3Var = lu3Var2;
                            String str11 = str;
                            ArrayList w04 = CollectionsKt.w0(arrayList5, collection4);
                            Collection collection5 = jagVar2.z;
                            if (collection5 == null) {
                                collection5 = km5.a;
                            }
                            ArrayList arrayList7 = jkgVar.j;
                            arrayList7.getClass();
                            ArrayList w05 = CollectionsKt.w0(arrayList7, collection5);
                            String str12 = jagVar2.A;
                            if (str12 == null) {
                                str12 = rkgVar.g;
                            }
                            String str13 = str12;
                            ArrayList arrayList8 = jkgVar.f;
                            ArrayList arrayList9 = arrayList8.isEmpty() ? null : arrayList8;
                            Integer num5 = jagVar2.o;
                            int intValue = num5 != null ? num5.intValue() : (int) vkgVar.d;
                            Integer num6 = jagVar2.p;
                            int intValue2 = num6 != null ? num6.intValue() : (int) vkgVar.e;
                            Integer valueOf = Integer.valueOf(intValue);
                            Integer valueOf2 = Integer.valueOf(intValue2);
                            String str14 = jagVar2.a;
                            rag ragVar = jagVar2.b;
                            Integer num7 = jagVar2.c;
                            String str15 = jagVar2.d;
                            String str16 = jagVar2.e;
                            String str17 = jagVar2.f;
                            String str18 = jagVar2.g;
                            Boolean bool = jagVar2.i;
                            List list2 = jagVar2.j;
                            Integer num8 = jagVar2.q;
                            Integer num9 = jagVar2.r;
                            Integer num10 = jagVar2.s;
                            Boolean bool2 = jagVar2.t;
                            String str19 = jagVar2.w;
                            Boolean bool3 = jagVar2.B;
                            Integer num11 = jagVar2.D;
                            Integer num12 = jagVar2.E;
                            Boolean bool4 = jagVar2.F;
                            Map map = jagVar2.G;
                            String str20 = jagVar2.H;
                            Integer num13 = jagVar2.I;
                            Integer num14 = jagVar2.J;
                            Integer num15 = jagVar2.K;
                            Integer num16 = jagVar2.L;
                            Integer num17 = jagVar2.M;
                            Map map2 = jagVar2.N;
                            String str21 = jagVar2.O;
                            Integer num18 = jagVar2.P;
                            String str22 = jagVar2.Q;
                            String str23 = jagVar2.R;
                            Integer num19 = jagVar2.S;
                            String str24 = jagVar2.T;
                            String str25 = jagVar2.U;
                            String str26 = jagVar2.V;
                            String str27 = jagVar2.W;
                            Double d = jagVar2.X;
                            String str28 = jagVar2.Y;
                            Integer num20 = jagVar2.Z;
                            Integer num21 = jagVar2.a0;
                            String str29 = jagVar2.b0;
                            Integer num22 = jagVar2.c0;
                            Integer num23 = jagVar2.d0;
                            Double d2 = jagVar2.e0;
                            String str30 = jagVar2.f0;
                            jgg jggVar = jagVar2.g0;
                            str14.getClass();
                            ragVar.getClass();
                            jagVar = new jag(str14, ragVar, num7, str15, str16, str17, str18, w0, bool, list2, arrayList2, str6, w03, w04, valueOf, valueOf2, num8, num9, num10, bool2, num3, str11, str19, str3, arrayList9, w05, str13, bool3, num4, num11, num12, bool4, map, str20, num13, num14, num15, num16, num17, map2, str21, num18, str22, str23, num19, str24, str25, str26, str27, d, str28, num20, num21, str29, num22, num23, d2, str30, jggVar);
                        }
                        if (jagVar != null) {
                            u.add(jagVar);
                        } else {
                            jeg.d.f(1);
                        }
                        i2 = 1;
                    } else {
                        uggVar3 = uggVar;
                        lu3Var = lu3Var2;
                        Exception exc = (Exception) fsfVar3.a;
                        if (exc != null) {
                            exc.getMessage();
                        }
                        i2 = 1;
                        jeg.d.f(1);
                    }
                    uggVar2 = uggVar3;
                    pggVar2 = pggVar3;
                    vggVar = vggVar2;
                    i7 = i2;
                    lu3Var2 = lu3Var;
                    jkgVar2 = null;
                    if (!it.hasNext()) {
                        jagVar2 = (jag) it.next();
                        String str31 = jagVar2.w;
                        str2 = jagVar2.x;
                        if ((str31 == null || StringsKt.R(str31)) && (str2 == null || StringsKt.R(str2))) {
                            lu3Var = lu3Var2;
                            i2 = i7;
                            u.add(jagVar2);
                            i7 = i2;
                            lu3Var2 = lu3Var;
                            jkgVar2 = null;
                            if (!it.hasNext()) {
                                return u;
                            }
                        } else {
                            fsfVar = new fsf();
                            fsfVar.a = "";
                            fsf fsfVar5 = new fsf();
                            if (str2 != null) {
                                try {
                                } catch (Exception e2) {
                                    e = e2;
                                    fsfVar4 = fsfVar;
                                    pggVar4 = pggVar2;
                                    uggVar = uggVar2;
                                    fsfVar3 = fsfVar5;
                                    vggVar3 = vggVar;
                                    fsfVar3.a = e;
                                    jkgVar = jkgVar2;
                                    vggVar2 = vggVar3;
                                    pggVar3 = pggVar4;
                                    fsfVar = fsfVar4;
                                    if (jkgVar == null) {
                                    }
                                    uggVar2 = uggVar3;
                                    pggVar2 = pggVar3;
                                    vggVar = vggVar2;
                                    i7 = i2;
                                    lu3Var2 = lu3Var;
                                    jkgVar2 = null;
                                    if (!it.hasNext()) {
                                    }
                                }
                                if (!StringsKt.R(str2)) {
                                    pggVar3 = pggVar2;
                                    uggVar = uggVar2;
                                    fsfVar3 = fsfVar5;
                                    vggVar2 = vggVar;
                                    fsfVar2 = fsfVar;
                                    fsfVar2.a = str2;
                                    jkgVar = ((ukg) vggVar2.a.invoke(fsfVar.a, pggVar3)).b();
                                    if (jkgVar == null) {
                                    }
                                    uggVar2 = uggVar3;
                                    pggVar2 = pggVar3;
                                    vggVar = vggVar2;
                                    i7 = i2;
                                    lu3Var2 = lu3Var;
                                    jkgVar2 = null;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                            Function2 function2 = vggVar.b;
                            String str32 = jagVar2.w;
                            str32.getClass();
                            uggVar2.r = vggVar;
                            uggVar2.s = pggVar2;
                            uggVar2.t = u;
                            uggVar2.u = it;
                            uggVar2.v = jagVar2;
                            uggVar2.w = fsfVar;
                            uggVar2.x = fsfVar5;
                            uggVar2.y = fsfVar;
                            uggVar2.B = i7;
                            obj = function2.invoke(str32, uggVar2);
                            if (obj == lu3Var2) {
                                return lu3Var2;
                            }
                            fsfVar4 = fsfVar;
                            pggVar4 = pggVar2;
                            uggVar = uggVar2;
                            fsfVar3 = fsfVar5;
                            vggVar3 = vggVar;
                            fsfVar2 = fsfVar4;
                            vggVar2 = vggVar3;
                            pggVar3 = pggVar4;
                            fsfVar = fsfVar4;
                            String str210 = (String) obj;
                            fsfVar2.a = str210;
                            jkgVar = ((ukg) vggVar2.a.invoke(fsfVar.a, pggVar3)).b();
                            if (jkgVar == null) {
                            }
                            uggVar2 = uggVar3;
                            pggVar2 = pggVar3;
                            vggVar = vggVar2;
                            i7 = i2;
                            lu3Var2 = lu3Var;
                            jkgVar2 = null;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        vggVar = this;
        uggVar = new ugg(vggVar, sq3Var);
        Object obj2 = uggVar.z;
        lu3 lu3Var22 = lu3.a;
        i = uggVar.B;
        jkg jkgVar22 = null;
        int i72 = 1;
        if (i != 0) {
        }
    }
}
