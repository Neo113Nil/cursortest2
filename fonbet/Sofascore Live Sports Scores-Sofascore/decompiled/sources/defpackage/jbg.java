package defpackage;

import android.content.Context;
import com.appsflyer.internal.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jbg {
    public final y3g a;
    public final v9f b;
    public final Function1 c;

    public jbg(y3g y3gVar) {
        v9f v9fVar = new v9f(1);
        j9g j9gVar = new j9g(25);
        this.a = y3gVar;
        this.b = v9fVar;
        this.c = j9gVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:3|(18:5|6|(1:(1:(3:10|11|(2:13|14)(2:16|17))(2:18|19))(1:20))(3:82|(2:86|87)|91)|21|22|23|24|25|26|27|28|(4:31|(2:33|34)(2:36|37)|35|29)|38|39|(7:42|(1:44)(1:52)|45|46|(2:48|49)(1:51)|50|40)|53|54|(3:56|(3:59|11|(0)(0))|58)(2:60|61)))|22|23|24|25|26|27|28|(1:29)|38|39|(1:40)|53|54|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d2, code lost:
    
        if (r15.isEmpty() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f6, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f9, code lost:
    
        r4 = (defpackage.qgg) r4;
        r12 = r4.b;
        r2 = r0.toString();
        r6 = r4.g;
        r7 = r4.h;
        r8 = r4.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0209, code lost:
    
        if (r8 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r3 = defpackage.yfa.O(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020f, code lost:
    
        r13 = r12.a("Ad response JSON parsing error", r5, "ad_response_json_parsing_error", r4.d, r4.c(new defpackage.meg(r2, r6, r7, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0231, code lost:
    
        if (r13 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0233, code lost:
    
        r12.e(r13, r4.e, r4.f, r4.a, r4.q, r4.p, r4.r, r4.t, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0265, code lost:
    
        throw new defpackage.ieg("The received ad response is invalid. Please check your placement programmation. \nDetailed error: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00a5, code lost:
    
        if (r0 == r7) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hbg hbgVar, zjg zjgVar, List list, pgg pggVar, bka bkaVar, sq3 sq3Var) {
        ibg ibgVar;
        int i;
        List list2;
        ArrayList arrayList;
        Iterator it;
        rbg rbgVar;
        List list3;
        jbg jbgVar = this;
        hbg hbgVar2 = hbgVar;
        zjg zjgVar2 = zjgVar;
        pgg pggVar2 = pggVar;
        bkg bkgVar = bkg.ERROR;
        try {
            if (sq3Var instanceof ibg) {
                ibgVar = (ibg) sq3Var;
                int i2 = ibgVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ibgVar.y = i2 - Integer.MIN_VALUE;
                    Object obj = ibgVar.w;
                    lu3 lu3Var = lu3.a;
                    i = ibgVar.y;
                    if (i != 0) {
                        y6a.M(obj);
                        bkaVar.getClass();
                        b10 b10Var = (b10) bkaVar.b;
                        Context context = (Context) ((WeakReference) b10Var.d).get();
                        en0 n = b10Var.n();
                        if (n != null && n.b) {
                            try {
                                n.h(context);
                            } catch (cjg e) {
                                fjg c = fjg.c();
                                e.getMessage();
                                c.f(3);
                            }
                        }
                        qbg qbgVar = new qbg(hbgVar2);
                        ibgVar.r = jbgVar;
                        ibgVar.s = hbgVar2;
                        ibgVar.t = zjgVar2;
                        list2 = list;
                        ibgVar.u = list2;
                        ibgVar.v = pggVar2;
                        ibgVar.y = 1;
                        obj = jbgVar.a.x(qbgVar, zjgVar2, pggVar2, ibgVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rbgVar = (rbg) ibgVar.s;
                            hbgVar2 = (hbg) ibgVar.r;
                            y6a.M(obj);
                            list3 = (List) obj;
                            if (!list3.isEmpty()) {
                                throw new geg("None of the received VAST ads are valid. Please check logging output for details.", rbgVar.b);
                            }
                            hbgVar2.getClass();
                            return new rbg(list3, rbgVar.b);
                        }
                        pgg pggVar3 = ibgVar.v;
                        List list4 = ibgVar.u;
                        zjgVar2 = ibgVar.t;
                        hbg hbgVar3 = (hbg) ibgVar.s;
                        jbg jbgVar2 = (jbg) ibgVar.r;
                        y6a.M(obj);
                        list2 = list4;
                        hbgVar2 = hbgVar3;
                        pggVar2 = pggVar3;
                        jbgVar = jbgVar2;
                    }
                    String str = (String) obj;
                    v9f v9fVar = jbgVar.b;
                    cdg[] cdgVarArr = cdg.a;
                    str.getClass();
                    pggVar2.getClass();
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("noAdUrl");
                    ArrayList p = v9f.p(jSONObject);
                    p.add(v9f.n(jSONObject));
                    optString = null;
                    List S0 = CollectionsKt.S0(p);
                    rbg rbgVar2 = new rbg(S0, optString);
                    arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : S0) {
                        if (list2.contains(((jag) obj2).b)) {
                            arrayList.add(obj2);
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        jag jagVar = (jag) it.next();
                        rag ragVar = jagVar.b;
                        qgg qggVar = (qgg) pggVar2;
                        ngg nggVar = qggVar.b;
                        ragVar.getClass();
                        zjg zjgVar3 = zjgVar2;
                        String str2 = qggVar.g;
                        bkg bkgVar2 = bkgVar;
                        String str3 = qggVar.h;
                        Iterator it2 = it;
                        Map map = qggVar.i;
                        ckg a = nggVar.a("Ad response invalid format error", bkgVar2, "ad_response_invalid_format_error", qggVar.d, a.c(new meg("Ad response invalid format error", str2, str3, map != null ? yfa.O(map) : null)));
                        bkgVar = bkgVar2;
                        if (a != null) {
                            nggVar.e(a, qggVar.e, qggVar.f, qggVar.a, ragVar, qggVar.p, qggVar.r, qggVar.t, false);
                        }
                        jeg jegVar = jeg.d;
                        Objects.toString(jagVar.b);
                        Objects.toString(list2);
                        jegVar.f(3);
                        zjgVar2 = zjgVar3;
                        it = it2;
                    }
                    zjg zjgVar4 = zjgVar2;
                    if (!arrayList.isEmpty()) {
                        throw new heg(i.i("None of the received ads is of expected ", " format type(s). Check console for details.", list2), rbgVar2.b);
                    }
                    vgg vggVar = (vgg) jbgVar.c.invoke(zjgVar4.b());
                    ibgVar.r = hbgVar2;
                    ibgVar.s = rbgVar2;
                    ibgVar.t = null;
                    ibgVar.u = null;
                    ibgVar.v = null;
                    ibgVar.y = 2;
                    Object a2 = vggVar.a(arrayList, pggVar2, ibgVar);
                    if (a2 != lu3Var) {
                        rbgVar = rbgVar2;
                        obj = a2;
                        list3 = (List) obj;
                        if (!list3.isEmpty()) {
                        }
                    }
                    return lu3Var;
                }
            }
            JSONObject jSONObject2 = new JSONObject(str);
            String optString2 = jSONObject2.optString("noAdUrl");
            ArrayList p2 = v9f.p(jSONObject2);
            p2.add(v9f.n(jSONObject2));
            optString2 = null;
            List S02 = CollectionsKt.S0(p2);
            rbg rbgVar22 = new rbg(S02, optString2);
            arrayList = new ArrayList();
            ArrayList arrayList22 = new ArrayList();
            while (r8.hasNext()) {
            }
            it = arrayList22.iterator();
            while (it.hasNext()) {
            }
            zjg zjgVar42 = zjgVar2;
            if (!arrayList.isEmpty()) {
            }
        } catch (JSONException e2) {
            e = e2;
            String str4 = null;
        }
        ibgVar = new ibg(jbgVar, sq3Var);
        Object obj3 = ibgVar.w;
        lu3 lu3Var2 = lu3.a;
        i = ibgVar.y;
        if (i != 0) {
        }
        String str5 = (String) obj3;
        v9f v9fVar2 = jbgVar.b;
        cdg[] cdgVarArr2 = cdg.a;
        str5.getClass();
        pggVar2.getClass();
    }
}
