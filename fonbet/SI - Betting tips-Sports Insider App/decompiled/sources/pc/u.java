package pc;

import android.app.Activity;
import android.text.TextUtils;
import androidx.appcompat.widget.c1;
import c4.w;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.a0;
import com.android.billingclient.api.y0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.play_billing.p1;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.t1;
import hg.d1;
import hg.t0;
import hg.u0;
import ic.h0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.x;
import me.y;
import org.json.JSONArray;
import org.json.JSONObject;
import rc.b0;
import wc.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final gf.t f21701a = gf.k.b(new id.a(20));

    /* renamed from: b, reason: collision with root package name */
    public final gf.t f21702b = gf.k.b(new id.a(21));

    /* renamed from: c, reason: collision with root package name */
    public final gf.t f21703c = gf.k.b(new id.a(22));

    /* renamed from: d, reason: collision with root package name */
    public final gf.t f21704d = gf.k.b(new id.a(23));

    /* renamed from: e, reason: collision with root package name */
    public final gf.t f21705e = gf.k.b(new id.a(24));

    /* renamed from: f, reason: collision with root package name */
    public final t0 f21706f;

    /* renamed from: g, reason: collision with root package name */
    public final t0 f21707g;

    /* renamed from: h, reason: collision with root package name */
    public final d1 f21708h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f21709i;
    public final d1 j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f21710k;

    /* renamed from: l, reason: collision with root package name */
    public volatile d1 f21711l;

    /* renamed from: m, reason: collision with root package name */
    public volatile d1 f21712m;

    /* renamed from: n, reason: collision with root package name */
    public volatile d1 f21713n;

    /* renamed from: o, reason: collision with root package name */
    public volatile d1 f21714o;

    /* renamed from: p, reason: collision with root package name */
    public volatile d1 f21715p;
    public volatile d1 q;

    /* renamed from: r, reason: collision with root package name */
    public volatile d1 f21716r;

    /* renamed from: s, reason: collision with root package name */
    public String f21717s;

    /* renamed from: t, reason: collision with root package name */
    public t1 f21718t;

    /* renamed from: u, reason: collision with root package name */
    public t1 f21719u;

    /* renamed from: v, reason: collision with root package name */
    public final d1 f21720v;

    /* renamed from: w, reason: collision with root package name */
    public final w f21721w;

    public u() {
        gg.a aVar = gg.a.f10049b;
        this.f21706f = u0.a(0, 1, aVar);
        this.f21707g = u0.a(0, 1, aVar);
        Boolean bool = Boolean.FALSE;
        this.f21708h = u0.b(bool);
        this.f21709i = u0.b(bool);
        this.j = u0.b(bool);
        this.f21710k = u0.b(bool);
        this.f21711l = u0.b(new ArrayList());
        this.f21712m = u0.b(null);
        this.f21713n = u0.b(null);
        this.f21714o = u0.b(null);
        this.f21715p = u0.b(null);
        this.q = u0.b(null);
        this.f21716r = u0.b(null);
        this.f21720v = u0.b(-1);
        this.f21721w = new w(this);
    }

    public static final String a(u uVar, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = purchase.f3959c;
            JSONObject jSONObject3 = purchase.f3959c;
            jSONObject.put("developerPayload", jSONObject2.optString("developerPayload"));
            String optString = jSONObject3.optString("orderId");
            if (TextUtils.isEmpty(optString)) {
                optString = null;
            }
            jSONObject.put("orderId", optString);
            jSONObject.put("originalJson", purchase.f3957a);
            jSONObject.put("packageName", jSONObject2.optString("packageName"));
            jSONObject.put("purchaseToken", purchase.c());
            jSONObject.put("signature", purchase.f3958b);
            jSONObject.put("isAcknowledged", jSONObject3.optBoolean("acknowledged", true));
            jSONObject.put("isAutoRenewing", jSONObject3.optBoolean("autoRenewing"));
            jSONObject.put("purchaseState", jSONObject3.optInt("purchaseState", 1) != 4 ? 1 : 2);
            jSONObject.put("quantity", jSONObject3.optInt("quantity", 1));
            jSONObject.put("purchaseTime", purchase.b());
            JSONArray jSONArray2 = new JSONArray();
            ArrayList a7 = purchase.a();
            Intrinsics.checkNotNullExpressionValue(a7, "getProducts(...)");
            Iterator it2 = a7.iterator();
            while (it2.hasNext()) {
                jSONArray2.put((String) it2.next());
            }
            jSONObject.put("skus", jSONArray2);
            String optString2 = jSONObject2.optString("obfuscatedAccountId");
            String optString3 = jSONObject2.optString("obfuscatedProfileId");
            d7.e eVar = (optString2 == null && optString3 == null) ? null : new d7.e(3, optString2, optString3);
            if (eVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("obfuscatedAccountId", (String) eVar.f8268b);
                jSONObject4.put("obfuscatedProfileId", (String) eVar.f8269c);
                jSONObject.put("accountIdentifiers", jSONObject4);
            }
            jSONArray.put(jSONObject);
        }
        String jSONArray3 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray3, "toString(...)");
        return jSONArray3;
    }

    public static final String b(u uVar, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = purchaseHistoryRecord.f3962c;
            JSONObject jSONObject3 = purchaseHistoryRecord.f3962c;
            jSONObject.put("developerPayload", jSONObject2.optString("developerPayload"));
            jSONObject.put("originalJson", purchaseHistoryRecord.f3960a);
            jSONObject.put("purchaseTime", jSONObject3.optLong("purchaseTime"));
            jSONObject.put("purchaseToken", purchaseHistoryRecord.b());
            jSONObject.put("quantity", jSONObject3.optInt("quantity", 1));
            jSONObject.put("signature", purchaseHistoryRecord.f3961b);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList a7 = purchaseHistoryRecord.a();
            Intrinsics.checkNotNullExpressionValue(a7, "getProducts(...)");
            Iterator it2 = a7.iterator();
            while (it2.hasNext()) {
                jSONArray2.put((String) it2.next());
            }
            jSONObject.put("skus", jSONArray2);
            jSONArray.put(jSONObject);
        }
        String jSONArray3 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray3, "toString(...)");
        return jSONArray3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (r10 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004b, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(u uVar, List list, mf.c cVar) {
        k kVar;
        int i5;
        List list2;
        Iterator it;
        Object obj;
        Purchase purchase;
        Object obj2;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f21658d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f21658d = i10 - Integer.MIN_VALUE;
                Object obj3 = kVar.f21656b;
                Object obj4 = lf.a.f20034a;
                i5 = kVar.f21658d;
                if (i5 != 0) {
                    h8.b.B(obj3);
                    w0 q = uVar.q();
                    kVar.f21655a = list;
                    kVar.f21658d = 1;
                    obj3 = q.d(kVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = kVar.f21655a;
                        h8.b.B(obj3);
                        List list3 = (List) obj3;
                        if (list3 != null && !list3.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                if (list3.contains(((Purchase) obj2).a().get(0))) {
                                    break;
                                }
                            }
                            Purchase purchase2 = (Purchase) obj2;
                            if (purchase2 != null) {
                                d1 d1Var = uVar.f21712m;
                                h0 w10 = uVar.w(purchase2);
                                d1Var.getClass();
                                d1Var.k(null, w10);
                            }
                        }
                        return Unit.f19194a;
                    }
                    list = kVar.f21655a;
                    h8.b.B(obj3);
                }
                list2 = (List) obj3;
                if (list2 != null && !list2.isEmpty()) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (list2.contains(((Purchase) obj).a().get(0))) {
                            break;
                        }
                    }
                    purchase = (Purchase) obj;
                    if (purchase != null) {
                        d1 d1Var2 = uVar.f21713n;
                        h0 w11 = uVar.w(purchase);
                        d1Var2.getClass();
                        d1Var2.k(null, w11);
                    }
                }
                w0 q3 = uVar.q();
                kVar.f21655a = list;
                kVar.f21658d = 2;
                obj3 = q3.c(kVar);
            }
        }
        kVar = new k(uVar, cVar);
        Object obj32 = kVar.f21656b;
        Object obj42 = lf.a.f20034a;
        i5 = kVar.f21658d;
        if (i5 != 0) {
        }
        list2 = (List) obj32;
        if (list2 != null) {
            it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            purchase = (Purchase) obj;
            if (purchase != null) {
            }
        }
        w0 q32 = uVar.q();
        kVar.f21655a = list;
        kVar.f21658d = 2;
        obj32 = q32.c(kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x007e, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(u uVar, List list, mf.c cVar) {
        l lVar;
        Serializable serializable;
        int i5;
        List list2;
        Serializable h10;
        List list3;
        List list4;
        Serializable f6;
        List list5;
        List list6;
        List list7;
        Serializable e7;
        List list8;
        List list9;
        List list10;
        List list11;
        Serializable g10;
        List list12;
        List list13;
        List list14;
        List list15;
        List list16;
        Iterator it;
        Object obj;
        Iterator it2;
        Object obj2;
        Iterator it3;
        Object obj3;
        Iterator it4;
        Object obj4;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f21666h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f21666h = i10 - Integer.MIN_VALUE;
                Object obj5 = lVar.f21664f;
                serializable = lf.a.f20034a;
                i5 = lVar.f21666h;
                if (i5 != 0) {
                    h8.b.B(obj5);
                    w0 q = uVar.q();
                    lVar.f21659a = list;
                    lVar.f21666h = 1;
                    obj5 = q.m(lVar);
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            List list17 = lVar.f21660b;
                            List list18 = lVar.f21659a;
                            h8.b.B(obj5);
                            list3 = list17;
                            list = list18;
                            list4 = (List) obj5;
                            if (list4 == null) {
                                list4 = e0.f19204a;
                            }
                            w0 q3 = uVar.q();
                            lVar.f21659a = list;
                            lVar.f21660b = list3;
                            lVar.f21661c = list4;
                            lVar.f21666h = 3;
                            f6 = q3.f(lVar);
                            if (f6 != serializable) {
                                list5 = list;
                                list6 = list4;
                                obj5 = f6;
                                list7 = (List) obj5;
                                if (list7 == null) {
                                }
                                w0 q10 = uVar.q();
                                lVar.f21659a = list5;
                                lVar.f21660b = list3;
                                lVar.f21661c = list6;
                                lVar.f21662d = list7;
                                lVar.f21666h = 4;
                                e7 = q10.e(lVar);
                                if (e7 != serializable) {
                                }
                            }
                            return serializable;
                        }
                        if (i5 == 3) {
                            list6 = lVar.f21661c;
                            list3 = lVar.f21660b;
                            list5 = lVar.f21659a;
                            h8.b.B(obj5);
                            list7 = (List) obj5;
                            if (list7 == null) {
                                list7 = e0.f19204a;
                            }
                            w0 q102 = uVar.q();
                            lVar.f21659a = list5;
                            lVar.f21660b = list3;
                            lVar.f21661c = list6;
                            lVar.f21662d = list7;
                            lVar.f21666h = 4;
                            e7 = q102.e(lVar);
                            if (e7 != serializable) {
                                List list19 = list3;
                                list8 = list6;
                                list9 = list7;
                                obj5 = e7;
                                list10 = list19;
                                list11 = (List) obj5;
                                if (list11 == null) {
                                }
                                w0 q11 = uVar.q();
                                lVar.f21659a = list5;
                                lVar.f21660b = list10;
                                lVar.f21661c = list8;
                                lVar.f21662d = list9;
                                lVar.f21663e = list11;
                                lVar.f21666h = 5;
                                g10 = q11.g(lVar);
                                if (g10 != serializable) {
                                }
                            }
                            return serializable;
                        }
                        if (i5 == 4) {
                            list9 = lVar.f21662d;
                            list8 = lVar.f21661c;
                            list10 = lVar.f21660b;
                            list5 = lVar.f21659a;
                            h8.b.B(obj5);
                            list11 = (List) obj5;
                            if (list11 == null) {
                                list11 = e0.f19204a;
                            }
                            w0 q112 = uVar.q();
                            lVar.f21659a = list5;
                            lVar.f21660b = list10;
                            lVar.f21661c = list8;
                            lVar.f21662d = list9;
                            lVar.f21663e = list11;
                            lVar.f21666h = 5;
                            g10 = q112.g(lVar);
                            if (g10 != serializable) {
                                list12 = list9;
                                list13 = list11;
                                obj5 = g10;
                                list14 = list10;
                                list15 = list5;
                                list16 = (List) obj5;
                                if (list16 == null) {
                                }
                                ArrayList arrayList = new ArrayList();
                                while (r0.hasNext()) {
                                }
                                ArrayList x10 = uVar.x(arrayList);
                                it = x10.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                h0 h0Var = (h0) obj;
                                if (h0Var == null) {
                                }
                                d1 d1Var = uVar.j;
                                Boolean valueOf = Boolean.valueOf(r1);
                                d1Var.getClass();
                                d1Var.k(null, valueOf);
                                uVar.f21714o.j(h0Var);
                                it2 = x10.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                    }
                                }
                                h0 h0Var2 = (h0) obj2;
                                if (h0Var2 == null) {
                                }
                                d1 d1Var2 = uVar.f21709i;
                                Boolean valueOf2 = Boolean.valueOf(r1);
                                d1Var2.getClass();
                                d1Var2.k(null, valueOf2);
                                uVar.f21715p.j(h0Var2);
                                it3 = x10.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                    }
                                }
                                h0 h0Var3 = (h0) obj3;
                                if (h0Var3 == null) {
                                }
                                d1 d1Var3 = uVar.f21708h;
                                Boolean valueOf3 = Boolean.valueOf(r11);
                                d1Var3.getClass();
                                d1Var3.k(null, valueOf3);
                                uVar.q.j(h0Var3);
                                it4 = x10.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                    }
                                }
                                h0 h0Var4 = (h0) obj4;
                                if (h0Var4 != null) {
                                }
                                d1 d1Var4 = uVar.f21710k;
                                Boolean valueOf4 = Boolean.valueOf(r7);
                                d1Var4.getClass();
                                d1Var4.k(null, valueOf4);
                                uVar.f21716r.j(h0Var4);
                                d1 d1Var5 = uVar.f21711l;
                                d1Var5.getClass();
                                d1Var5.k(null, x10);
                                return Unit.f19194a;
                            }
                            return serializable;
                        }
                        if (i5 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list13 = lVar.f21663e;
                        list12 = lVar.f21662d;
                        list8 = lVar.f21661c;
                        list14 = lVar.f21660b;
                        list15 = lVar.f21659a;
                        h8.b.B(obj5);
                        list16 = (List) obj5;
                        if (list16 == null) {
                            list16 = e0.f19204a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj6 : list15) {
                            Object obj7 = ((Purchase) obj6).a().get(0);
                            Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                            if (list14.contains((String) obj7)) {
                                arrayList2.add(obj6);
                            }
                        }
                        ArrayList x102 = uVar.x(arrayList2);
                        it = x102.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (list12.contains(((h0) obj).f11122b)) {
                                break;
                            }
                        }
                        h0 h0Var5 = (h0) obj;
                        boolean z5 = h0Var5 == null;
                        d1 d1Var6 = uVar.j;
                        Boolean valueOf5 = Boolean.valueOf(z5);
                        d1Var6.getClass();
                        d1Var6.k(null, valueOf5);
                        uVar.f21714o.j(h0Var5);
                        it2 = x102.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (list8.contains(((h0) obj2).f11122b)) {
                                break;
                            }
                        }
                        h0 h0Var22 = (h0) obj2;
                        boolean z7 = h0Var22 == null;
                        d1 d1Var22 = uVar.f21709i;
                        Boolean valueOf22 = Boolean.valueOf(z7);
                        d1Var22.getClass();
                        d1Var22.k(null, valueOf22);
                        uVar.f21715p.j(h0Var22);
                        it3 = x102.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it3.next();
                            if (list13.contains(((h0) obj3).f11122b)) {
                                break;
                            }
                        }
                        h0 h0Var32 = (h0) obj3;
                        boolean z10 = h0Var32 == null;
                        d1 d1Var32 = uVar.f21708h;
                        Boolean valueOf32 = Boolean.valueOf(z10);
                        d1Var32.getClass();
                        d1Var32.k(null, valueOf32);
                        uVar.q.j(h0Var32);
                        it4 = x102.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it4.next();
                            if (list16.contains(((h0) obj4).f11122b)) {
                                break;
                            }
                        }
                        h0 h0Var42 = (h0) obj4;
                        boolean z11 = h0Var42 != null;
                        d1 d1Var42 = uVar.f21710k;
                        Boolean valueOf42 = Boolean.valueOf(z11);
                        d1Var42.getClass();
                        d1Var42.k(null, valueOf42);
                        uVar.f21716r.j(h0Var42);
                        d1 d1Var52 = uVar.f21711l;
                        d1Var52.getClass();
                        d1Var52.k(null, x102);
                        return Unit.f19194a;
                    }
                    list = lVar.f21659a;
                    h8.b.B(obj5);
                }
                list2 = (List) obj5;
                if (list2 == null) {
                    list2 = e0.f19204a;
                }
                w0 q12 = uVar.q();
                lVar.f21659a = list;
                lVar.f21660b = list2;
                lVar.f21666h = 2;
                h10 = q12.h(lVar);
                if (h10 != serializable) {
                    list3 = list2;
                    obj5 = h10;
                    list4 = (List) obj5;
                    if (list4 == null) {
                    }
                    w0 q32 = uVar.q();
                    lVar.f21659a = list;
                    lVar.f21660b = list3;
                    lVar.f21661c = list4;
                    lVar.f21666h = 3;
                    f6 = q32.f(lVar);
                    if (f6 != serializable) {
                    }
                }
                return serializable;
            }
        }
        lVar = new l(uVar, cVar);
        Object obj52 = lVar.f21664f;
        serializable = lf.a.f20034a;
        i5 = lVar.f21666h;
        if (i5 != 0) {
        }
        list2 = (List) obj52;
        if (list2 == null) {
        }
        w0 q122 = uVar.q();
        lVar.f21659a = list;
        lVar.f21660b = list2;
        lVar.f21666h = 2;
        h10 = q122.h(lVar);
        if (h10 != serializable) {
        }
        return serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(u uVar, List list, mf.c cVar) {
        m mVar;
        int i5;
        List list2;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f21670d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f21670d = i10 - Integer.MIN_VALUE;
                Object obj = mVar.f21668b;
                Object obj2 = lf.a.f20034a;
                i5 = mVar.f21670d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    w0 q = uVar.q();
                    mVar.f21667a = list;
                    mVar.f21670d = 1;
                    obj = q.m(mVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = mVar.f21667a;
                    h8.b.B(obj);
                }
                list2 = (List) obj;
                if (list2 == null) {
                    list2 = e0.f19204a;
                }
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (list2.contains(((Purchase) obj3).a().get(0))) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Purchase purchase = (Purchase) it.next();
                        rc.g gVar = (rc.g) uVar.f21704d.getValue();
                        Object obj4 = purchase.a().get(0);
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        String productId = (String) obj4;
                        String originalJson = purchase.f3957a;
                        Intrinsics.checkNotNullExpressionValue(originalJson, "getOriginalJson(...)");
                        long b10 = purchase.b();
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        Intrinsics.checkNotNullParameter(originalJson, "originalJson");
                        c0.t(MyApp.f6830c, b0.b(), null, new rc.f(productId, gVar, originalJson, b10, (Continuation) null), 2);
                    }
                }
                return Unit.f19194a;
            }
        }
        mVar = new m(uVar, cVar);
        Object obj5 = mVar.f21668b;
        Object obj22 = lf.a.f20034a;
        i5 = mVar.f21670d;
        if (i5 != 0) {
        }
        list2 = (List) obj5;
        if (list2 == null) {
        }
        if (list != null) {
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x011e, code lost:
    
        if (r13 != r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00da, code lost:
    
        if (r13 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00a0, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(u uVar, List list, mf.c cVar) {
        n nVar;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        Object c2;
        List list16;
        List list17;
        List list18;
        List list19;
        List list20;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        Object obj;
        h0 h0Var;
        Iterator it3;
        Object obj2;
        h0 h0Var2;
        Iterator it4;
        Object obj3;
        h0 h0Var3;
        Iterator it5;
        Object obj4;
        h0 h0Var4;
        Iterator it6;
        Object obj5;
        h0 h0Var5;
        Iterator it7;
        Object obj6;
        h0 h0Var6;
        Object obj7;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i5 = nVar.j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nVar.j = i5 - Integer.MIN_VALUE;
                Object obj8 = nVar.f21678h;
                Object obj9 = lf.a.f20034a;
                switch (nVar.j) {
                    case 0:
                        h8.b.B(obj8);
                        if (list == null) {
                            return Unit.f19194a;
                        }
                        w0 q = uVar.q();
                        nVar.f21671a = list;
                        nVar.j = 1;
                        obj8 = q.m(nVar);
                        break;
                    case 1:
                        list = nVar.f21671a;
                        h8.b.B(obj8);
                        List list21 = (List) obj8;
                        if (list21 == null) {
                            list21 = e0.f19204a;
                        }
                        w0 q3 = uVar.q();
                        nVar.f21671a = list;
                        nVar.f21672b = list21;
                        nVar.j = 2;
                        Object h10 = q3.h(nVar);
                        if (h10 != obj9) {
                            list2 = list21;
                            obj8 = h10;
                            list3 = list;
                            List list22 = (List) obj8;
                            list4 = list22 != null ? e0.f19204a : list22;
                            w0 q10 = uVar.q();
                            nVar.f21671a = list3;
                            nVar.f21672b = list2;
                            nVar.f21673c = list4;
                            nVar.j = 3;
                            obj8 = q10.f(nVar);
                            break;
                        }
                        return obj9;
                    case 2:
                        List list23 = nVar.f21672b;
                        List list24 = nVar.f21671a;
                        h8.b.B(obj8);
                        list3 = list24;
                        list2 = list23;
                        List list222 = (List) obj8;
                        if (list222 != null) {
                        }
                        w0 q102 = uVar.q();
                        nVar.f21671a = list3;
                        nVar.f21672b = list2;
                        nVar.f21673c = list4;
                        nVar.j = 3;
                        obj8 = q102.f(nVar);
                        break;
                    case 3:
                        list4 = nVar.f21673c;
                        list2 = nVar.f21672b;
                        list3 = nVar.f21671a;
                        h8.b.B(obj8);
                        List list25 = (List) obj8;
                        if (list25 == null) {
                            list25 = e0.f19204a;
                        }
                        w0 q11 = uVar.q();
                        nVar.f21671a = list3;
                        nVar.f21672b = list2;
                        nVar.f21673c = list4;
                        nVar.f21674d = list25;
                        nVar.j = 4;
                        Object e7 = q11.e(nVar);
                        if (e7 != obj9) {
                            List list26 = list2;
                            list5 = list25;
                            obj8 = e7;
                            list6 = list26;
                            list7 = list3;
                            list8 = list4;
                            List list27 = (List) obj8;
                            list9 = list27 != null ? e0.f19204a : list27;
                            w0 q12 = uVar.q();
                            nVar.f21671a = list7;
                            nVar.f21672b = list6;
                            nVar.f21673c = list8;
                            nVar.f21674d = list5;
                            nVar.f21675e = list9;
                            nVar.j = 5;
                            obj8 = q12.g(nVar);
                            break;
                        }
                        return obj9;
                    case 4:
                        List list28 = nVar.f21674d;
                        List list29 = nVar.f21673c;
                        List list30 = nVar.f21672b;
                        List list31 = nVar.f21671a;
                        h8.b.B(obj8);
                        list7 = list31;
                        list6 = list30;
                        list8 = list29;
                        list5 = list28;
                        List list272 = (List) obj8;
                        if (list272 != null) {
                        }
                        w0 q122 = uVar.q();
                        nVar.f21671a = list7;
                        nVar.f21672b = list6;
                        nVar.f21673c = list8;
                        nVar.f21674d = list5;
                        nVar.f21675e = list9;
                        nVar.j = 5;
                        obj8 = q122.g(nVar);
                        break;
                    case 5:
                        list9 = nVar.f21675e;
                        list5 = nVar.f21674d;
                        list8 = nVar.f21673c;
                        list6 = nVar.f21672b;
                        list7 = nVar.f21671a;
                        h8.b.B(obj8);
                        List list32 = (List) obj8;
                        if (list32 == null) {
                            list32 = e0.f19204a;
                        }
                        w0 q13 = uVar.q();
                        nVar.f21671a = list7;
                        nVar.f21672b = list6;
                        nVar.f21673c = list8;
                        nVar.f21674d = list5;
                        nVar.f21675e = list9;
                        nVar.f21676f = list32;
                        nVar.j = 6;
                        Object d10 = q13.d(nVar);
                        if (d10 != obj9) {
                            List list33 = list5;
                            list10 = list9;
                            list11 = list32;
                            obj8 = d10;
                            list12 = list6;
                            list13 = list8;
                            list14 = list33;
                            list15 = (List) obj8;
                            if (list15 == null) {
                                list15 = e0.f19204a;
                            }
                            w0 q14 = uVar.q();
                            nVar.f21671a = list7;
                            nVar.f21672b = list12;
                            nVar.f21673c = list13;
                            nVar.f21674d = list14;
                            nVar.f21675e = list10;
                            nVar.f21676f = list11;
                            nVar.f21677g = list15;
                            nVar.j = 7;
                            c2 = q14.c(nVar);
                            if (c2 != obj9) {
                                list16 = list11;
                                list17 = list15;
                                obj8 = c2;
                                list18 = list7;
                                list19 = list12;
                                list20 = (List) obj8;
                                if (list20 == null) {
                                    list20 = e0.f19204a;
                                }
                                ArrayList x10 = uVar.x(list18);
                                arrayList = new ArrayList();
                                it = x10.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (list19.contains(((h0) next).f11122b)) {
                                        arrayList.add(next);
                                    }
                                }
                                it2 = x10.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = null;
                                    } else {
                                        obj = it2.next();
                                        if (list17.contains(((h0) obj).f11122b)) {
                                        }
                                    }
                                }
                                h0Var = (h0) obj;
                                if (h0Var != null) {
                                    d1 d1Var = uVar.f21713n;
                                    d1Var.getClass();
                                    d1Var.k(null, h0Var);
                                }
                                it3 = x10.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj2 = null;
                                    } else {
                                        obj2 = it3.next();
                                        if (list20.contains(((h0) obj2).f11122b)) {
                                        }
                                    }
                                }
                                h0Var2 = (h0) obj2;
                                if (h0Var2 != null) {
                                    d1 d1Var2 = uVar.f21712m;
                                    d1Var2.getClass();
                                    d1Var2.k(null, h0Var2);
                                }
                                it4 = arrayList.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj3 = null;
                                    } else {
                                        obj3 = it4.next();
                                        if (list14.contains(((h0) obj3).f11122b)) {
                                        }
                                    }
                                }
                                h0Var3 = (h0) obj3;
                                if (h0Var3 != null) {
                                    d1 d1Var3 = uVar.f21714o;
                                    d1Var3.getClass();
                                    d1Var3.k(null, h0Var3);
                                    d1 d1Var4 = uVar.j;
                                    Boolean bool = Boolean.TRUE;
                                    d1Var4.getClass();
                                    d1Var4.k(null, bool);
                                }
                                it5 = arrayList.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj4 = null;
                                    } else {
                                        obj4 = it5.next();
                                        if (list13.contains(((h0) obj4).f11122b)) {
                                        }
                                    }
                                }
                                h0Var4 = (h0) obj4;
                                if (h0Var4 != null) {
                                    d1 d1Var5 = uVar.f21715p;
                                    d1Var5.getClass();
                                    d1Var5.k(null, h0Var4);
                                    d1 d1Var6 = uVar.f21709i;
                                    Boolean bool2 = Boolean.TRUE;
                                    d1Var6.getClass();
                                    d1Var6.k(null, bool2);
                                }
                                it6 = arrayList.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = it6.next();
                                        if (list10.contains(((h0) obj5).f11122b)) {
                                        }
                                    }
                                }
                                h0Var5 = (h0) obj5;
                                if (h0Var5 != null) {
                                    d1 d1Var7 = uVar.q;
                                    d1Var7.getClass();
                                    d1Var7.k(null, h0Var5);
                                    d1 d1Var8 = uVar.f21708h;
                                    Boolean bool3 = Boolean.TRUE;
                                    d1Var8.getClass();
                                    d1Var8.k(null, bool3);
                                }
                                it7 = arrayList.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        obj6 = null;
                                    } else {
                                        obj6 = it7.next();
                                        if (list16.contains(((h0) obj6).f11122b)) {
                                        }
                                    }
                                }
                                h0Var6 = (h0) obj6;
                                if (h0Var6 != null) {
                                    d1 d1Var9 = uVar.f21716r;
                                    d1Var9.getClass();
                                    d1Var9.k(null, h0Var6);
                                    d1 d1Var10 = uVar.f21710k;
                                    Boolean bool4 = Boolean.TRUE;
                                    d1Var10.getClass();
                                    d1Var10.k(null, bool4);
                                }
                                if (!arrayList.isEmpty()) {
                                    List list34 = (List) uVar.f21711l.getValue();
                                    if (list34 == null || list34.isEmpty()) {
                                        uVar.f21711l.j(CollectionsKt.W(arrayList));
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj10 : list34) {
                                            h0 h0Var7 = (h0) obj10;
                                            Iterator it8 = arrayList.iterator();
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    obj7 = it8.next();
                                                    if (Intrinsics.areEqual(h0Var7.f11122b, ((h0) obj7).f11122b)) {
                                                    }
                                                } else {
                                                    obj7 = null;
                                                }
                                            }
                                            if (((h0) obj7) == null) {
                                                arrayList2.add(obj10);
                                            }
                                        }
                                        ArrayList X = CollectionsKt.X(arrayList2);
                                        X.addAll(arrayList);
                                        uVar.f21711l.j(CollectionsKt.W(X));
                                    }
                                }
                                return Unit.f19194a;
                            }
                        }
                        return obj9;
                    case 6:
                        list11 = nVar.f21676f;
                        list10 = nVar.f21675e;
                        list14 = nVar.f21674d;
                        list13 = nVar.f21673c;
                        List list35 = nVar.f21672b;
                        List list36 = nVar.f21671a;
                        h8.b.B(obj8);
                        list12 = list35;
                        list7 = list36;
                        list15 = (List) obj8;
                        if (list15 == null) {
                        }
                        w0 q142 = uVar.q();
                        nVar.f21671a = list7;
                        nVar.f21672b = list12;
                        nVar.f21673c = list13;
                        nVar.f21674d = list14;
                        nVar.f21675e = list10;
                        nVar.f21676f = list11;
                        nVar.f21677g = list15;
                        nVar.j = 7;
                        c2 = q142.c(nVar);
                        if (c2 != obj9) {
                        }
                        return obj9;
                    case 7:
                        list17 = nVar.f21677g;
                        list16 = nVar.f21676f;
                        list10 = nVar.f21675e;
                        list14 = nVar.f21674d;
                        list13 = nVar.f21673c;
                        list19 = nVar.f21672b;
                        list18 = nVar.f21671a;
                        h8.b.B(obj8);
                        list20 = (List) obj8;
                        if (list20 == null) {
                        }
                        ArrayList x102 = uVar.x(list18);
                        arrayList = new ArrayList();
                        it = x102.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = x102.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                            }
                        }
                        h0Var = (h0) obj;
                        if (h0Var != null) {
                        }
                        it3 = x102.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                            }
                        }
                        h0Var2 = (h0) obj2;
                        if (h0Var2 != null) {
                        }
                        it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                            }
                        }
                        h0Var3 = (h0) obj3;
                        if (h0Var3 != null) {
                        }
                        it5 = arrayList.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                            }
                        }
                        h0Var4 = (h0) obj4;
                        if (h0Var4 != null) {
                        }
                        it6 = arrayList.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                            }
                        }
                        h0Var5 = (h0) obj5;
                        if (h0Var5 != null) {
                        }
                        it7 = arrayList.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                            }
                        }
                        h0Var6 = (h0) obj6;
                        if (h0Var6 != null) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        nVar = new n(uVar, cVar);
        Object obj82 = nVar.f21678h;
        Object obj92 = lf.a.f20034a;
        switch (nVar.j) {
        }
    }

    public static final long g(u uVar, com.android.billingclient.api.q qVar) {
        com.android.billingclient.api.p pVar;
        Object obj;
        com.android.billingclient.api.m mVar;
        ArrayList arrayList;
        com.android.billingclient.api.o oVar;
        com.android.billingclient.api.m mVar2;
        ArrayList arrayList2;
        com.android.billingclient.api.o oVar2;
        Object obj2;
        String str = qVar.f4070d;
        ArrayList arrayList3 = qVar.j;
        if (Intrinsics.areEqual(str, "subs")) {
            Object obj3 = null;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    com.android.billingclient.api.p pVar2 = (com.android.billingclient.api.p) obj2;
                    if (Intrinsics.areEqual(pVar2.f4063b, "introprice") || Intrinsics.areEqual(pVar2.f4063b, "freetrial-introprice")) {
                        break;
                    }
                }
                pVar = (com.android.billingclient.api.p) obj2;
            } else {
                pVar = null;
            }
            if (pVar != null) {
                ArrayList arrayList4 = pVar.f4065d.f4046a;
                Intrinsics.checkNotNullExpressionValue(arrayList4, "getPricingPhaseList(...)");
                Iterator it2 = arrayList4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((com.android.billingclient.api.o) obj).f4057b > 0) {
                        break;
                    }
                }
                com.android.billingclient.api.o oVar3 = (com.android.billingclient.api.o) obj;
                if (oVar3 != null) {
                    return oVar3.f4057b;
                }
                if (arrayList3 != null) {
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        if (((com.android.billingclient.api.p) next).f4063b == null) {
                            obj3 = next;
                            break;
                        }
                    }
                    com.android.billingclient.api.p pVar3 = (com.android.billingclient.api.p) obj3;
                    if (pVar3 != null && (mVar = pVar3.f4065d) != null && (arrayList = mVar.f4046a) != null && (oVar = (com.android.billingclient.api.o) CollectionsKt.firstOrNull(arrayList)) != null) {
                        return oVar.f4057b;
                    }
                }
            } else if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    if (((com.android.billingclient.api.p) next2).f4063b == null) {
                        obj3 = next2;
                        break;
                    }
                }
                com.android.billingclient.api.p pVar4 = (com.android.billingclient.api.p) obj3;
                if (pVar4 != null && (mVar2 = pVar4.f4065d) != null && (arrayList2 = mVar2.f4046a) != null && (oVar2 = (com.android.billingclient.api.o) CollectionsKt.firstOrNull(arrayList2)) != null) {
                    return oVar2.f4057b;
                }
            }
        } else {
            com.android.billingclient.api.n a7 = qVar.a();
            if (a7 != null) {
                return a7.f4049b;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(u uVar, String str, mf.c cVar) {
        r rVar;
        int i5;
        com.android.billingclient.api.u uVar2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f21693c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f21693c = i10 - Integer.MIN_VALUE;
                Object obj = rVar.f21691a;
                lf.a aVar = lf.a.f20034a;
                i5 = rVar.f21693c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (n().d()) {
                        yb.i n9 = n();
                        rVar.f21693c = 1;
                        obj = n9.f(str, rVar);
                    } else {
                        yb.i n10 = n();
                        rVar.f21693c = 2;
                        obj = n10.g(str, rVar);
                    }
                    return aVar;
                }
                if (i5 == 1) {
                    h8.b.B(obj);
                    uVar2 = (com.android.billingclient.api.u) obj;
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    uVar2 = (com.android.billingclient.api.u) obj;
                }
                if (uVar2.f4104a.f4037a == 0) {
                    return e0.f19204a;
                }
                List list = uVar2.f4105b;
                return list == null ? e0.f19204a : list;
            }
        }
        rVar = new r(uVar, cVar);
        Object obj2 = rVar.f21691a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = rVar.f21693c;
        if (i5 != 0) {
        }
        if (uVar2.f4104a.f4037a == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:10:0x0023, B:11:0x003b, B:13:0x0043, B:16:0x0046, B:21:0x0032), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:10:0x0023, B:11:0x003b, B:13:0x0043, B:16:0x0046, B:21:0x0032), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(u uVar, String str, boolean z5, mf.c cVar) {
        s sVar;
        int i5;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i10 = sVar.f21696c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    sVar.f21696c = i10 - Integer.MIN_VALUE;
                    Object obj = sVar.f21694a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = sVar.f21696c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        sVar.f21696c = 1;
                        obj = v(str, z5, sVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    com.android.billingclient.api.w wVar = (com.android.billingclient.api.w) obj;
                    return wVar.f4110a.f4037a != 0 ? wVar.f4111b : e0.f19204a;
                }
            }
            if (i5 != 0) {
            }
            com.android.billingclient.api.w wVar2 = (com.android.billingclient.api.w) obj;
            if (wVar2.f4110a.f4037a != 0) {
            }
        } catch (Exception unused) {
            return e0.f19204a;
        }
        sVar = new s(uVar, cVar);
        Object obj2 = sVar.f21694a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = sVar.f21696c;
    }

    public static yb.i n() {
        return (yb.i) y3.m(yb.i.class, null, 6);
    }

    public static void r(Throwable ex, String nameFunTag, io.sentry.e breadcrumb) {
        Intrinsics.checkNotNullParameter(ex, "e");
        Intrinsics.checkNotNullParameter(nameFunTag, "nameFunTag");
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Intrinsics.checkNotNullParameter(ex, "ex");
        jg.d dVar = MyApp.f6830c;
        jg.d dVar2 = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        c0.t(dVar2, lg.d.f20063c, null, new ge.f((Object) ex, (Comparable) breadcrumb, nameFunTag, (Continuation) null, 18), 2);
    }

    public static Object v(String str, boolean z5, mf.c cVar) {
        return z5 ? n().h(str, cVar) : n().i(str, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if (r1 == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(mf.c cVar) {
        c cVar2;
        int i5;
        String str;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f21616d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f21616d = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f21614b;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f21616d;
                int i11 = 3;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    yb.i n9 = n();
                    cVar2.f21616d = 1;
                    n9.getClass();
                    com.android.billingclient.api.d dVar = yb.i.f25817e;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar = null;
                    }
                    if (dVar.f("ggg").f4037a == 0) {
                        eg.r a7 = c0.a();
                        Intrinsics.checkNotNullExpressionValue(new io.sentry.hints.j(8), "build(...)");
                        cc.b bVar = new cc.b(a7, i11);
                        com.android.billingclient.api.d dVar2 = yb.i.f25817e;
                        if (dVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                            dVar2 = null;
                        }
                        int i12 = 13;
                        if (!dVar2.b()) {
                            p1.g("BillingClient", "Service disconnected.");
                            com.android.billingclient.api.k kVar = com.android.billingclient.api.t0.f4090l;
                            dVar2.I(2, 13, kVar);
                            bVar.a(kVar);
                        } else if (!dVar2.f4000v) {
                            p1.g("BillingClient", "Current client doesn't support get billing config.");
                            com.android.billingclient.api.k kVar2 = com.android.billingclient.api.t0.f4103z;
                            dVar2.I(32, 13, kVar2);
                            bVar.a(kVar2);
                        } else if (com.android.billingclient.api.d.k(new y0(dVar2, bVar), 30000L, new g8.a(i12, dVar2, bVar), dVar2.E(), dVar2.o()) == null) {
                            com.android.billingclient.api.k l6 = dVar2.l();
                            dVar2.I(25, 13, l6);
                            bVar.a(l6);
                        }
                        obj = a7.m(cVar2);
                    } else {
                        obj = null;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = cVar2.f21613a;
                        h8.b.B(obj);
                        return obj2;
                    }
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str != null) {
                    lg.e eVar = m0.f9201a;
                    fg.e eVar2 = jg.q.f18523a;
                    y yVar = new y(this, str, continuation, i11);
                    cVar2.f21613a = obj;
                    cVar2.f21616d = 2;
                    if (c0.A(eVar2, yVar, cVar2) == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj3 = cVar2.f21614b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f21616d;
        int i112 = 3;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        str = (String) obj3;
        if (str != null) {
        }
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, mf.c cVar) {
        d dVar;
        int i5;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f21619c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f21619c = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f21617a;
                lf.a aVar = lf.a.f20034a;
                i5 = dVar.f21619c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (str == null) {
                        return null;
                    }
                    yb.i n9 = n();
                    dVar.f21619c = 1;
                    obj = n9.b(str, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return new Integer(((com.android.billingclient.api.k) obj).f4037a);
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f21617a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = dVar.f21619c;
        if (i5 != 0) {
        }
        return new Integer(((com.android.billingclient.api.k) obj2).f4037a);
    }

    public final String l(int i5) {
        if (i5 == 6) {
            return "Fatal error during the API action. This is an internal Google Play error that may be transient or due to an unexpected condition during processing. You can automatically retry (e.g. with exponential back off) for this case and contact Google Play if issues persist. ";
        }
        if (i5 == 7) {
            return "The purchase failed because the item is already owned. ";
        }
        if (i5 == 8) {
            return "Requested action on the item failed since it is not owned by the user. ";
        }
        if (i5 == 12) {
            return "A network error occurred during the operation. This error indicates that there was a problem with the network connection between the device and Play systems. This could potentially also be due to the user not having an active network connection.";
        }
        switch (i5) {
            case -3:
                return "The request has reached the maximum timeout before Google Play responds.";
            case -2:
                return "The requested feature is not supported by the Play Store on the current device. ";
            case -1:
                return "The app is not connected to the Play Store service via the Google Play Billing Library.\nThe Play Store could have been updated in the background while your app was still running and the library lost connection.";
            case 0:
                return "Success. ";
            case 1:
                return "Transaction was canceled by the user. ";
            case 2:
                return "The Google Play Billing service is currently unavailable. ";
            case 3:
                return "\nA user billing error occurred during processing.\nExamples where this error may occur:\n* The google billing system requires the Play Store app to work!!!\n* The Play Store app on the user's device is out of date.\n* The user is in an unsupported country.\n* The user is an enterprise user and their enterprise admin has disabled users from making purchases.\n* Google Play is unable to charge the user’s payment method.\n* Letting the user retry may succeed if the condition causing the error has changed (e.g. An enterprise user's admin has allowed purchases for the organization).";
            case 4:
                return "The requested product is not available for purchase. The product is not available in the user's country or may be due to a delay in distribution.";
            default:
                return "Error resulting from incorrect usage of the API. ";
        }
    }

    public final String m(int i5) {
        if (i5 == 7) {
            return "ITEM_ALREADY_OWNED";
        }
        if (i5 == 8) {
            return "ITEM_NOT_OWNED";
        }
        if (i5 == 12) {
            return "NETWORK_ERROR";
        }
        switch (i5) {
            case -3:
                return "SERVICE_TIMEOUT";
            case -2:
                return "FEATURE_NOT_SUPPORTED";
            case -1:
                return "SERVICE_DISCONNECTED";
            case 0:
                return "OK";
            case 1:
                return "USER_CANCELED";
            case 2:
                return "SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_UNAVAILABLE";
            case 4:
                return "ITEM_UNAVAILABLE";
            case 5:
                return "DEVELOPER_ERROR";
            default:
                return c1.i(i5, "ERROR ");
        }
    }

    public final rc.a o() {
        return (rc.a) this.f21705e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, mf.c cVar) {
        g gVar;
        int i5;
        Purchase purchase;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f21634c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f21634c = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f21632a;
                lf.a aVar = lf.a.f20034a;
                i5 = gVar.f21634c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    boolean d10 = n().d();
                    gVar.f21634c = 1;
                    obj = c0.i(new x(this, d10, str, null), gVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                purchase = (Purchase) obj;
                if (purchase != null) {
                    return null;
                }
                return w(purchase);
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f21632a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = gVar.f21634c;
        if (i5 != 0) {
        }
        purchase = (Purchase) obj2;
        if (purchase != null) {
        }
    }

    public final w0 q() {
        return (w0) this.f21703c.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(2:(1:(1:(1:(4:13|14|15|16)(2:18|19))(8:20|21|22|23|24|(4:27|(3:29|30|31)(1:33)|32|25)|34|35))(4:42|43|44|45))(10:70|71|72|73|74|(4:77|(2:79|80)(1:82)|81|75)|83|84|(2:86|45)|37)|69)(4:93|(1:(8:97|98|(4:101|(2:103|104)(1:106)|105|99)|107|108|109|110|(2:112|37)(7:113|74|(1:75)|83|84|(0)|37))(1:96))|15|16)|(8:47|48|49|(4:52|(3:54|55|56)(1:58)|57|50)|59|60|(5:62|24|(1:25)|34|35)|37)|15|16))|118|6|7|(0)(0)|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0045, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01b5, code lost:
    
        if (r0.e(r6) != r5) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018f A[Catch: Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:14:0x0040, B:24:0x017a, B:25:0x0189, B:27:0x018f, B:30:0x01a2, B:35:0x01a6), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb A[Catch: Exception -> 0x0102, TryCatch #4 {Exception -> 0x0102, blocks: (B:74:0x00d6, B:75:0x00e5, B:77:0x00eb, B:79:0x00fe, B:84:0x0106, B:110:0x00c2), top: B:109:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i5, ArrayList arrayList, List list, mf.c cVar) {
        i iVar;
        u uVar;
        int i10;
        List<SkuDetails> list2;
        eb.m mVar;
        ArrayList arrayList2;
        int i11;
        eb.m mVar2;
        ArrayList arrayList3;
        List list3;
        Collection collection;
        int i12;
        int i13;
        int i14;
        int i15;
        List<SkuDetails> list4;
        int i16;
        int i17;
        ?? r12 = i5;
        ArrayList<com.android.billingclient.api.q> arrayList4 = arrayList;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i18 = iVar.f21646g;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                iVar.f21646g = i18 - Integer.MIN_VALUE;
                uVar = this;
                Object obj = iVar.f21644e;
                lf.a aVar = lf.a.f20034a;
                i10 = iVar.f21646g;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (r12 == 0) {
                        if (arrayList4 != null) {
                            try {
                                mVar = (eb.m) y3.m(eb.m.class, null, 6);
                                arrayList2 = new ArrayList();
                                Iterator it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    com.android.billingclient.api.q qVar = (com.android.billingclient.api.q) it.next();
                                    uVar.o().getClass();
                                    ic.a a7 = rc.a.a(qVar);
                                    if (a7 != null) {
                                        arrayList2.add(a7);
                                    }
                                }
                                list2 = list;
                                try {
                                    iVar.f21642c = list2;
                                    iVar.f21643d = arrayList4;
                                    iVar.f21640a = r12;
                                    iVar.f21641b = 0;
                                    iVar.f21646g = 1;
                                } catch (Exception e7) {
                                    e = e7;
                                    i12 = r12;
                                    collection = arrayList4;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                list2 = list;
                                i12 = r12;
                                collection = arrayList4;
                            }
                            if (mVar.a(arrayList2) == aVar) {
                                return aVar;
                            }
                            i11 = 0;
                            r12 = r12;
                            arrayList4 = arrayList4;
                            mVar2 = (eb.m) y3.m(eb.m.class, null, 6);
                            arrayList3 = new ArrayList();
                            while (r15.hasNext()) {
                            }
                            iVar.f21642c = list2;
                            iVar.f21643d = arrayList4;
                            iVar.f21640a = r12;
                            iVar.f21641b = i11;
                            iVar.f21646g = 2;
                            if (mVar2.e(arrayList3) != aVar) {
                            }
                            return aVar;
                        }
                        list2 = list;
                        i13 = r12;
                    }
                    return Unit.f19194a;
                }
                if (i10 == 1) {
                    int i19 = iVar.f21641b;
                    int i20 = iVar.f21640a;
                    ?? r6 = iVar.f21643d;
                    List list5 = iVar.f21642c;
                    try {
                        h8.b.B(obj);
                        i11 = i19;
                        r12 = i20;
                        arrayList4 = r6;
                        list2 = list5;
                        mVar2 = (eb.m) y3.m(eb.m.class, null, 6);
                        arrayList3 = new ArrayList();
                        for (com.android.billingclient.api.q qVar2 : arrayList4) {
                            uVar.o().getClass();
                            ic.e0 e10 = rc.a.e(qVar2);
                            if (e10 != null) {
                                arrayList3.add(e10);
                            }
                        }
                        iVar.f21642c = list2;
                        iVar.f21643d = arrayList4;
                        iVar.f21640a = r12;
                        iVar.f21641b = i11;
                        iVar.f21646g = 2;
                        if (mVar2.e(arrayList3) != aVar) {
                            list3 = list2;
                            i17 = r12;
                            list2 = list3;
                            i13 = i17;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        i12 = i20;
                        collection = r6;
                        list2 = list5;
                    }
                    return aVar;
                }
                if (i10 == 2) {
                    int i21 = iVar.f21640a;
                    Collection collection2 = iVar.f21643d;
                    list3 = iVar.f21642c;
                    try {
                        h8.b.B(obj);
                        i17 = i21;
                        list2 = list3;
                        i13 = i17;
                    } catch (Exception e12) {
                        e = e12;
                        list2 = list3;
                        i12 = i21;
                        collection = collection2;
                    }
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        List list6 = iVar.f21643d;
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    int i22 = iVar.f21641b;
                    i15 = iVar.f21640a;
                    List list7 = iVar.f21643d;
                    try {
                        h8.b.B(obj);
                        i14 = i22;
                        list4 = list7;
                        i16 = 6;
                        eb.m mVar3 = (eb.m) y3.m(eb.m.class, null, i16);
                        ArrayList arrayList5 = new ArrayList();
                        for (SkuDetails skuDetails : list4) {
                            uVar.o().getClass();
                            ic.e0 f6 = rc.a.f(skuDetails);
                            if (f6 != null) {
                                arrayList5.add(f6);
                            }
                        }
                        iVar.f21642c = null;
                        iVar.f21643d = list4;
                        iVar.f21640a = i15;
                        iVar.f21641b = i14;
                        iVar.f21646g = 4;
                    } catch (Exception e13) {
                        e = e13;
                        r12 = list7;
                        r(e, "handleProductInfoResult()", new io.sentry.e("addSkuDetails " + r12));
                        return Unit.f19194a;
                    }
                }
                r(e, "handleProductInfoResult()", new io.sentry.e("addSkuDetails " + collection));
                i13 = i12;
                if (list2 != null) {
                    try {
                        eb.m mVar4 = (eb.m) y3.m(eb.m.class, null, 6);
                        ArrayList arrayList6 = new ArrayList();
                        for (SkuDetails skuDetails2 : list2) {
                            uVar.o().getClass();
                            ic.a b10 = rc.a.b(skuDetails2);
                            if (b10 != null) {
                                arrayList6.add(b10);
                            }
                        }
                        iVar.f21642c = null;
                        iVar.f21643d = list2;
                        iVar.f21640a = i13;
                        i14 = 0;
                        iVar.f21641b = 0;
                        iVar.f21646g = 3;
                        if (mVar4.a(arrayList6) != aVar) {
                            i15 = i13;
                            list4 = list2;
                            i16 = 6;
                            eb.m mVar32 = (eb.m) y3.m(eb.m.class, null, i16);
                            ArrayList arrayList52 = new ArrayList();
                            while (r7.hasNext()) {
                            }
                            iVar.f21642c = null;
                            iVar.f21643d = list4;
                            iVar.f21640a = i15;
                            iVar.f21641b = i14;
                            iVar.f21646g = 4;
                        }
                        return aVar;
                    } catch (Exception e14) {
                        e = e14;
                        r12 = list2;
                        r(e, "handleProductInfoResult()", new io.sentry.e("addSkuDetails " + r12));
                        return Unit.f19194a;
                    }
                }
                return Unit.f19194a;
            }
        }
        uVar = this;
        iVar = new i(uVar, cVar);
        Object obj2 = iVar.f21644e;
        lf.a aVar2 = lf.a.f20034a;
        i10 = iVar.f21646g;
        if (i10 != 0) {
        }
        if (list2 != null) {
        }
        return Unit.f19194a;
    }

    public final Object t(Activity activity, String str, int i5, int i10, String str2, String str3, mf.i iVar) {
        Object i11 = c0.i(new j(i5, this, str, i10, activity, str2, str3, null), iVar);
        return i11 == lf.a.f20034a ? i11 : Unit.f19194a;
    }

    public final void u(String str) {
        rc.g gVar = (rc.g) this.f21704d.getValue();
        gVar.getClass();
        c0.t(MyApp.f6830c, b0.b(), null, new y(gVar, str, null, 20), 2);
    }

    public final h0 w(Purchase purchase) {
        o().getClass();
        return rc.a.g(purchase);
    }

    public final ArrayList x(List list) {
        ArrayList arrayList = new ArrayList(v.k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            o().getClass();
            arrayList.add(rc.a.g(purchase));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0167, code lost:
    
        if (s(r2, r11, r14, r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0150, code lost:
    
        if (r14 != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0137, code lost:
    
        if (r14 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        if (s(r2, r14, r11, r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
    
        if (r14 != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r14 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (r14 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        if (r14 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007b, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.coroutines.Continuation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(mf.c cVar) {
        t tVar;
        List list;
        u uVar;
        u uVar2;
        List list2;
        List list3;
        List list4;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i5 = tVar.f21700d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                tVar.f21700d = i5 - Integer.MIN_VALUE;
                Object obj = tVar.f21698b;
                Object obj2 = lf.a.f20034a;
                String str = "inapp";
                switch (tVar.f21700d) {
                    case 0:
                        h8.b.B(obj);
                        w0 q = q();
                        tVar.f21700d = 1;
                        obj = q.b(tVar);
                        break;
                    case 1:
                        h8.b.B(obj);
                        List list5 = (List) obj;
                        if (list5 == null) {
                            list5 = e0.f19204a;
                        }
                        list = list5;
                        w0 q3 = q();
                        tVar.f21697a = list;
                        tVar.f21700d = 2;
                        obj = q3.m(tVar);
                        break;
                    case 2:
                        list = tVar.f21697a;
                        h8.b.B(obj);
                        List list6 = (List) obj;
                        if (list6 == null) {
                            list6 = e0.f19204a;
                        }
                        List list7 = list6;
                        String str2 = "subs";
                        if (!n().d()) {
                            uVar = this;
                            ?? r11 = 0;
                            tVar.f21697a = list;
                            tVar.f21700d = 7;
                            lg.e eVar = m0.f9201a;
                            obj = c0.A(lg.d.f20063c, new h(list7, uVar, str2, r11, 1), tVar);
                            arrayList = r11;
                            break;
                        } else {
                            tVar.f21697a = list;
                            tVar.f21700d = 3;
                            lg.e eVar2 = m0.f9201a;
                            ?? r112 = 0;
                            uVar2 = this;
                            obj = c0.A(lg.d.f20063c, new h(list7, this, str2, r112, 0), tVar);
                            list2 = r112;
                            break;
                        }
                        return obj2;
                    case 3:
                        list = tVar.f21697a;
                        h8.b.B(obj);
                        uVar2 = this;
                        list2 = null;
                        com.android.billingclient.api.s sVar = (com.android.billingclient.api.s) obj;
                        list3 = list2;
                        if (sVar != null) {
                            int i10 = sVar.f4078a.f4037a;
                            ArrayList arrayList4 = sVar.f4079b;
                            tVar.f21697a = list;
                            tVar.f21700d = 4;
                            Object s8 = s(i10, arrayList4, list2, tVar);
                            list3 = list2;
                            break;
                        }
                        tVar.f21697a = list3;
                        tVar.f21700d = 5;
                        lg.e eVar3 = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new h(list, uVar2, str, list3, 0), tVar);
                        list4 = list3;
                        break;
                    case 4:
                        list = tVar.f21697a;
                        h8.b.B(obj);
                        uVar2 = this;
                        list3 = null;
                        tVar.f21697a = list3;
                        tVar.f21700d = 5;
                        lg.e eVar32 = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new h(list, uVar2, str, list3, 0), tVar);
                        list4 = list3;
                        break;
                    case 5:
                        h8.b.B(obj);
                        list4 = null;
                        com.android.billingclient.api.s sVar2 = (com.android.billingclient.api.s) obj;
                        if (sVar2 != null) {
                            int i11 = sVar2.f4078a.f4037a;
                            ArrayList arrayList5 = sVar2.f4079b;
                            tVar.f21697a = list4;
                            tVar.f21700d = 6;
                            break;
                        }
                        return Unit.f19194a;
                    case 6:
                    case 10:
                        h8.b.B(obj);
                        return Unit.f19194a;
                    case 7:
                        list = tVar.f21697a;
                        h8.b.B(obj);
                        uVar = this;
                        arrayList = null;
                        a0 a0Var = (a0) obj;
                        arrayList2 = arrayList;
                        if (a0Var != null) {
                            int i12 = a0Var.f3967a.f4037a;
                            List list8 = a0Var.f3968b;
                            tVar.f21697a = list;
                            tVar.f21700d = 8;
                            Object s10 = s(i12, arrayList, list8, tVar);
                            arrayList2 = arrayList;
                            break;
                        }
                        tVar.f21697a = arrayList2;
                        tVar.f21700d = 9;
                        lg.e eVar4 = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new h(list, uVar, str, arrayList2, 1), tVar);
                        arrayList3 = arrayList2;
                        break;
                    case 8:
                        list = tVar.f21697a;
                        h8.b.B(obj);
                        uVar = this;
                        arrayList2 = null;
                        tVar.f21697a = arrayList2;
                        tVar.f21700d = 9;
                        lg.e eVar42 = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new h(list, uVar, str, arrayList2, 1), tVar);
                        arrayList3 = arrayList2;
                        break;
                    case 9:
                        h8.b.B(obj);
                        arrayList3 = null;
                        a0 a0Var2 = (a0) obj;
                        if (a0Var2 != null) {
                            int i13 = a0Var2.f3967a.f4037a;
                            List list9 = a0Var2.f3968b;
                            tVar.f21697a = arrayList3;
                            tVar.f21700d = 10;
                            break;
                        }
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        tVar = new t(this, cVar);
        Object obj3 = tVar.f21698b;
        Object obj22 = lf.a.f20034a;
        String str3 = "inapp";
        switch (tVar.f21700d) {
        }
    }
}
