package r3;

import androidx.appcompat.widget.c1;
import bet.prediction.request.Pushes;
import bet.prediction.response.GamesInfoData;
import bet.prediction.response.MHttpException;
import bet.prediction.response.PredictionApi;
import bet.prediction.response.PredictionsApi;
import bet.prediction.response.SportsApi;
import bet.prediction.response.news.PostNews;
import bet.prediction.response.news.PostsNews;
import bet.prediction.response.support.SupportFrequentQuestionsApi;
import bet.prediction.response.support.SupportMessageApi;
import bet.prediction.response.support.SupportMessagesApi;
import bet.prediction.response.vtenth.AdvertApi;
import bet.prediction.response.vtenth.IdentifyApi;
import com.google.gson.reflect.TypeToken;
import com.sports.insider.data.room.general.table.AccountTable;
import eg.f0;
import gh.l0;
import gh.m0;
import gh.r0;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public c f22226a;

    /* renamed from: b, reason: collision with root package name */
    public String f22227b;

    /* renamed from: c, reason: collision with root package name */
    public String f22228c;

    public static HashMap B(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y3.a aVar = (y3.a) it.next();
            arrayList2.add(new Pushes(aVar.getId(), aVar.getType(), aVar.getCreatedAt()));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        HashMap hashMap = new HashMap();
        s3.d[] dVarArr = s3.d.f22620a;
        hashMap.put("pushes", new com.google.gson.j().f(arrayList3, new TypeToken<ArrayList<Pushes>>() { // from class: bet.prediction.api.ServiceBetImpl$pushParams$1$1
        }.getType()).toString());
        return hashMap;
    }

    public static HashMap F(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        s3.a[] aVarArr = s3.a.f22617a;
        hashMap.put("product_id", str);
        hashMap.put(AccountTable.tokenColumn, str2);
        if (str3 != null) {
            hashMap.put("subscription_id", str3);
        }
        return hashMap;
    }

    public static HashMap H(List list) {
        HashMap hashMap = new HashMap();
        s3.c[] cVarArr = s3.c.f22619a;
        int[] V = CollectionsKt.V(list);
        Intrinsics.checkNotNullParameter(V, "<this>");
        Intrinsics.checkNotNullParameter(StringUtils.COMMA, "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(V, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(StringUtils.COMMA, "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "[");
        int i5 = 0;
        for (int i10 : V) {
            i5++;
            if (i5 > 1) {
                buffer.append((CharSequence) StringUtils.COMMA);
            }
            buffer.append((CharSequence) String.valueOf(i10));
        }
        buffer.append((CharSequence) "]");
        hashMap.put("message_id", buffer.toString());
        return hashMap;
    }

    public static HashMap h(long j, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        s3.a[] aVarArr = s3.a.f22617a;
        hashMap.put("currency", str);
        hashMap.put("amount", Long.valueOf(j));
        hashMap.put("product_id", str2);
        hashMap.put(AccountTable.tokenColumn, str3);
        return hashMap;
    }

    public static HashMap w(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pa.b bVar = (pa.b) it.next();
                jSONArray.put(new JSONObject().put("event", bVar.f21570a).put("event_value", bVar.f21571b).put("created_at", bVar.f21572c));
            }
        }
        s3.d[] dVarArr = s3.d.f22620a;
        hashMap.put("metrics", jSONArray.toString());
        return hashMap;
    }

    public static HashMap y(int i5, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("limit", Integer.valueOf(i5));
        hashMap.put("offset", Integer.valueOf(i10));
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String str, String str2, mf.c cVar) {
        z zVar;
        int i5;
        try {
            if (cVar instanceof z) {
                zVar = (z) cVar;
                int i10 = zVar.f22290c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zVar.f22290c = i10 - Integer.MIN_VALUE;
                    Object obj = zVar.f22288a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = zVar.f22290c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        c cVar2 = this.f22226a;
                        String p10 = p();
                        HashMap<String, Object> hashMap = new HashMap<>();
                        if (str2 != null) {
                            hashMap.put("google_token", str2);
                        }
                        f0<IdentifyApi> f6 = cVar2.f(p10, str, hashMap);
                        zVar.f22290c = 1;
                        obj = f6.R(zVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((IdentifyApi) obj).map();
                }
            }
            if (i5 != 0) {
            }
            return ((IdentifyApi) obj).map();
        } catch (MHttpException e7) {
            return new x3.g(e7);
        } catch (oi.q e9) {
            return new x3.f(e9);
        }
        zVar = new z(this, cVar);
        Object obj2 = zVar.f22288a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = zVar.f22290c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(String str, ArrayList arrayList, mf.c cVar) {
        a0 a0Var;
        int i5;
        try {
            if (cVar instanceof a0) {
                a0Var = (a0) cVar;
                int i10 = a0Var.f22210c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    a0Var.f22210c = i10 - Integer.MIN_VALUE;
                    Object obj = a0Var.f22208a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = a0Var.f22210c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<v3.e> v5 = this.f22226a.v(p(), str, B(arrayList));
                        a0Var.f22210c = 1;
                        obj = v5.R(a0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (v3.e) obj;
                }
            }
            if (i5 != 0) {
            }
            return (v3.e) obj;
        } catch (MHttpException e7) {
            return new v3.d((v3.b) e7);
        } catch (oi.q e9) {
            return new v3.d(e9);
        }
        a0Var = new a0(this, cVar);
        Object obj2 = a0Var.f22208a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = a0Var.f22210c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(String str, String str2, mf.c cVar) {
        b0 b0Var;
        int i5;
        try {
            if (cVar instanceof b0) {
                b0Var = (b0) cVar;
                int i10 = b0Var.f22213c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    b0Var.f22213c = i10 - Integer.MIN_VALUE;
                    Object obj = b0Var.f22211a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = b0Var.f22213c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        c cVar2 = this.f22226a;
                        String p10 = p();
                        HashMap<String, Object> hashMap = new HashMap<>();
                        if (str2 != null) {
                            s3.d[] dVarArr = s3.d.f22620a;
                            hashMap.put("region", str2);
                        }
                        f0<r0> e7 = cVar2.e(p10, str, hashMap);
                        b0Var.f22213c = 1;
                        obj = e7.R(b0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return new f((r0) obj, 3);
                }
            }
            if (i5 != 0) {
            }
            return new f((r0) obj, 3);
        } catch (MHttpException e9) {
            return new v3.g(e9);
        } catch (oi.q e10) {
            return new v3.f(e10);
        }
        b0Var = new b0(this, cVar);
        Object obj2 = b0Var.f22211a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = b0Var.f22213c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(String str, String str2, String str3, String str4, mf.c cVar) {
        c0 c0Var;
        int i5;
        try {
            if (cVar instanceof c0) {
                c0Var = (c0) cVar;
                int i10 = c0Var.f22216c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0Var.f22216c = i10 - Integer.MIN_VALUE;
                    Object obj = c0Var.f22214a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = c0Var.f22216c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<IdentifyApi> i11 = this.f22226a.i(p(), str, F(str2, str4, str3));
                        c0Var.f22216c = 1;
                        obj = i11.R(c0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (x3.h) obj;
                }
            }
            if (i5 != 0) {
            }
            return (x3.h) obj;
        } catch (MHttpException e7) {
            return new x3.g(e7);
        } catch (oi.q e9) {
            return new x3.f(e9);
        }
        c0Var = new c0(this, cVar);
        Object obj2 = c0Var.f22214a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = c0Var.f22216c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(String str, List list, mf.c cVar) {
        d0 d0Var;
        int i5;
        try {
            if (cVar instanceof d0) {
                d0Var = (d0) cVar;
                int i10 = d0Var.f22222c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    d0Var.f22222c = i10 - Integer.MIN_VALUE;
                    Object obj = d0Var.f22220a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = d0Var.f22222c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<v3.e> q = this.f22226a.q(p(), str, H(list));
                        d0Var.f22222c = 1;
                        obj = q.R(d0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (v3.e) obj;
                }
            }
            if (i5 != 0) {
            }
            return (v3.e) obj;
        } catch (MHttpException e7) {
            return new v3.d((v3.b) e7);
        } catch (oi.q e9) {
            return new v3.d(e9);
        }
        d0Var = new d0(this, cVar);
        Object obj2 = d0Var.f22220a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = d0Var.f22222c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, mf.c cVar) {
        d dVar;
        int i5;
        try {
            if (cVar instanceof d) {
                dVar = (d) cVar;
                int i10 = dVar.f22219c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    dVar.f22219c = i10 - Integer.MIN_VALUE;
                    Object obj = dVar.f22217a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = dVar.f22219c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<v3.e> w10 = this.f22226a.w(p(), str, str2);
                        dVar.f22219c = 1;
                        obj = w10.R(dVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (v3.e) obj;
                }
            }
            if (i5 != 0) {
            }
            return (v3.e) obj;
        } catch (MHttpException e7) {
            return new v3.d((v3.b) e7);
        } catch (oi.q e9) {
            return new v3.d(e9);
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f22217a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = dVar.f22219c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, mf.c cVar) {
        e eVar;
        int i5;
        try {
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i10 = eVar.f22225c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    eVar.f22225c = i10 - Integer.MIN_VALUE;
                    Object obj = eVar.f22223a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = eVar.f22225c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<r0> k6 = this.f22226a.k(p(), str);
                        eVar.f22225c = 1;
                        obj = k6.R(eVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return new f((r0) obj, 0);
                }
            }
            if (i5 != 0) {
            }
            return new f((r0) obj, 0);
        } catch (MHttpException e7) {
            return new v3.g(e7);
        } catch (oi.q e9) {
            return new v3.f(e9);
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f22223a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = eVar.f22225c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i5, String str, mf.c cVar) {
        g gVar;
        int i10;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f22233c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f22233c = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f22231a;
                lf.a aVar = lf.a.f20034a;
                i10 = gVar.f22233c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    f0<r0> d10 = this.f22226a.d(str, new Integer(i5));
                    gVar.f22233c = 1;
                    if (d10.R(gVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f22231a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = gVar.f22233c;
        if (i10 != 0) {
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i5, String str, mf.c cVar) {
        h hVar;
        int i10;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.f22236c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f22236c = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f22234a;
                lf.a aVar = lf.a.f20034a;
                i10 = hVar.f22236c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    f0<r0> y5 = this.f22226a.y(str, new Integer(i5));
                    hVar.f22236c = 1;
                    if (y5.R(hVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f22234a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = hVar.f22236c;
        if (i10 != 0) {
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, mf.c cVar) {
        i iVar;
        int i5;
        try {
            if (cVar instanceof i) {
                iVar = (i) cVar;
                int i10 = iVar.f22239c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    iVar.f22239c = i10 - Integer.MIN_VALUE;
                    Object obj = iVar.f22237a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = iVar.f22239c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        HashMap<String, Object> hashMap = new HashMap<>();
                        s3.b[] bVarArr = s3.b.f22618a;
                        hashMap.put("device_id", str2);
                        f0<AdvertApi> l6 = this.f22226a.l(p(), str, hashMap);
                        iVar.f22239c = 1;
                        obj = l6.R(iVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((AdvertApi) obj).map();
                }
            }
            if (i5 != 0) {
            }
            return ((AdvertApi) obj).map();
        } catch (MHttpException e7) {
            return new x3.b(e7);
        } catch (oi.q e9) {
            return new x3.a(e9);
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f22237a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = iVar.f22239c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i5, String str, mf.c cVar) {
        j jVar;
        int i10;
        try {
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i11 = jVar.f22242c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    jVar.f22242c = i11 - Integer.MIN_VALUE;
                    Object obj = jVar.f22240a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = jVar.f22242c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        f0<r0> s8 = this.f22226a.s(p(), str, new Integer(i5));
                        jVar.f22242c = 1;
                        obj = s8.R(jVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return new f((r0) obj, 1);
                }
            }
            if (i10 != 0) {
            }
            return new f((r0) obj, 1);
        } catch (MHttpException e7) {
            return new v3.g(e7);
        } catch (oi.q e9) {
            return new v3.f(e9);
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f22240a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = jVar.f22242c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, int i5, boolean z5, String str2, long j, String str3, String str4, mf.c cVar) {
        k kVar;
        int i10;
        c cVar2 = this.f22226a;
        try {
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i11 = kVar.f22245c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    kVar.f22245c = i11 - Integer.MIN_VALUE;
                    Object obj = kVar.f22243a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = kVar.f22245c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        f0<PredictionApi> u10 = z5 ? cVar2.u(p(), str, String.valueOf(i5)) : cVar2.h(p(), str, String.valueOf(i5), h(j, str2, str3, str4));
                        kVar.f22245c = 1;
                        obj = u10.R(kVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((PredictionApi) obj).m70map();
                }
            }
            if (i10 != 0) {
            }
            return ((PredictionApi) obj).m70map();
        } catch (MHttpException e7) {
            return new a4.k(e7);
        } catch (oi.q e9) {
            return new a4.j(e9);
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f22243a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = kVar.f22245c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, mf.c cVar) {
        l lVar;
        int i5;
        try {
            if (cVar instanceof l) {
                lVar = (l) cVar;
                int i10 = lVar.f22248c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    lVar.f22248c = i10 - Integer.MIN_VALUE;
                    Object obj = lVar.f22246a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = lVar.f22248c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        c cVar2 = this.f22226a;
                        String p10 = p();
                        HashMap<String, Object> hashMap = new HashMap<>();
                        if (str2 != null) {
                            s3.d[] dVarArr = s3.d.f22620a;
                            hashMap.put("region", str2);
                        }
                        f0<r0> p11 = cVar2.p(p10, str, hashMap);
                        lVar.f22248c = 1;
                        obj = p11.R(lVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return new f((r0) obj, 2);
                }
            }
            if (i5 != 0) {
            }
            return new f((r0) obj, 2);
        } catch (MHttpException e7) {
            return new v3.g(e7);
        } catch (oi.q e9) {
            return new v3.f(e9);
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f22246a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = lVar.f22248c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, mf.c cVar) {
        m mVar;
        int i5;
        Object bVar;
        try {
            if (cVar instanceof m) {
                mVar = (m) cVar;
                int i10 = mVar.f22251c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    mVar.f22251c = i10 - Integer.MIN_VALUE;
                    Object obj = mVar.f22249a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = mVar.f22251c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<SupportFrequentQuestionsApi> b10 = this.f22226a.b(p(), str);
                        mVar.f22251c = 1;
                        obj = b10.R(mVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((SupportFrequentQuestionsApi) obj).m88map();
                }
            }
            if (i5 != 0) {
            }
            return ((SupportFrequentQuestionsApi) obj).m88map();
        } catch (MHttpException e7) {
            bVar = new b4.c(e7);
            return bVar;
        } catch (oi.q e9) {
            bVar = new b4.b(e9);
            return bVar;
        } catch (Exception unused) {
            return new b4.a();
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f22249a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = mVar.f22251c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(int i5, String str, mf.c cVar) {
        n nVar;
        int i10;
        try {
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i11 = nVar.f22254c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    nVar.f22254c = i11 - Integer.MIN_VALUE;
                    Object obj = nVar.f22252a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = nVar.f22254c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        f0<GamesInfoData> j = this.f22226a.j(p(), str, String.valueOf(i5));
                        nVar.f22254c = 1;
                        obj = j.R(nVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((GamesInfoData) obj).m69map();
                }
            }
            if (i10 != 0) {
            }
            return ((GamesInfoData) obj).m69map();
        } catch (MHttpException e7) {
            return new a4.b(e7);
        } catch (oi.q e9) {
            return new a4.a(e9);
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f22252a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = nVar.f22254c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(int i5, String str, mf.c cVar) {
        o oVar;
        int i10;
        try {
            if (cVar instanceof o) {
                oVar = (o) cVar;
                int i11 = oVar.f22257c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    oVar.f22257c = i11 - Integer.MIN_VALUE;
                    Object obj = oVar.f22255a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = oVar.f22257c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        f0<PredictionApi> a7 = this.f22226a.a(p(), str, String.valueOf(i5));
                        oVar.f22257c = 1;
                        obj = a7.R(oVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((PredictionApi) obj).m70map();
                }
            }
            if (i10 != 0) {
            }
            return ((PredictionApi) obj).m70map();
        } catch (MHttpException e7) {
            return new a4.k(e7);
        } catch (oi.q e9) {
            return new a4.j(e9);
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.f22255a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = oVar.f22257c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(int i5, String str, mf.c cVar) {
        p pVar;
        int i10;
        try {
            if (cVar instanceof p) {
                pVar = (p) cVar;
                int i11 = pVar.f22260c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    pVar.f22260c = i11 - Integer.MIN_VALUE;
                    Object obj = pVar.f22258a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = pVar.f22260c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        f0<PredictionApi> r5 = this.f22226a.r(p(), str, String.valueOf(i5));
                        pVar.f22260c = 1;
                        obj = r5.R(pVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((PredictionApi) obj).m70map();
                }
            }
            if (i10 != 0) {
            }
            return ((PredictionApi) obj).m70map();
        } catch (MHttpException e7) {
            return new a4.k(e7);
        } catch (oi.q e9) {
            return new a4.j(e9);
        }
        pVar = new p(this, cVar);
        Object obj2 = pVar.f22258a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = pVar.f22260c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Integer num, String str, String str2, String str3, mf.c cVar) {
        q qVar;
        int i5;
        try {
            if (cVar instanceof q) {
                qVar = (q) cVar;
                int i10 = qVar.f22263c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    qVar.f22263c = i10 - Integer.MIN_VALUE;
                    Object obj = qVar.f22261a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = qVar.f22263c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        c cVar2 = this.f22226a;
                        String p10 = p();
                        if (num != null && num.intValue() == 0) {
                            num = null;
                        }
                        f0<PredictionsApi> c2 = cVar2.c(p10, str, num, str2, str3);
                        qVar.f22263c = 1;
                        obj = c2.R(qVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((PredictionsApi) obj).m71map();
                }
            }
            if (i5 != 0) {
            }
            return ((PredictionsApi) obj).m71map();
        } catch (MHttpException e7) {
            return new a4.k(e7);
        } catch (oi.q e9) {
            return new a4.j(e9);
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.f22261a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = qVar.f22263c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, mf.c cVar) {
        r rVar;
        int i5;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i10 = rVar.f22266c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    rVar.f22266c = i10 - Integer.MIN_VALUE;
                    Object obj = rVar.f22264a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = rVar.f22266c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<SportsApi> g10 = this.f22226a.g(p(), str);
                        rVar.f22266c = 1;
                        obj = g10.R(rVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((SportsApi) obj).m72map();
                }
            }
            if (i5 != 0) {
            }
            return ((SportsApi) obj).m72map();
        } catch (MHttpException e7) {
            return new u3.b(e7);
        } catch (oi.q e9) {
            return new u3.a(e9);
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f22264a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = rVar.f22266c;
    }

    public final String p() {
        String str;
        String l6;
        String str2 = this.f22228c;
        if (str2 == null) {
            return this.f22227b;
        }
        String str3 = this.f22227b;
        if (str2 == null || (l6 = kotlin.text.z.l(str2, '_', '-', false)) == null || (str = c1.n(", ", l6, ";q=0.8")) == null) {
            str = "";
        }
        return str3.concat(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, String str2, String str3, String str4, int i5, String str5, String str6, String str7, String str8, mf.c cVar) {
        s sVar;
        int i10;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i11 = sVar.f22269c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    sVar.f22269c = i11 - Integer.MIN_VALUE;
                    Object obj = sVar.f22267a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = sVar.f22269c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        f0<IdentifyApi> n9 = this.f22226a.n(p(), str, r(str2, str3, i5, str4, str5, str6, str7, str8));
                        sVar.f22269c = 1;
                        obj = n9.R(sVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((IdentifyApi) obj).map();
                }
            }
            if (i10 != 0) {
            }
            return ((IdentifyApi) obj).map();
        } catch (MHttpException e7) {
            return new x3.g(e7);
        } catch (oi.q e9) {
            return new x3.f(e9);
        }
        sVar = new s(this, cVar);
        Object obj2 = sVar.f22267a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = sVar.f22269c;
    }

    public final HashMap r(String str, String str2, int i5, String str3, String str4, String str5, String str6, String str7) {
        HashMap hashMap = new HashMap();
        s3.b[] bVarArr = s3.b.f22618a;
        hashMap.put("device_id", str);
        hashMap.put("os", "android_google");
        hashMap.put("version_client", str2);
        hashMap.put("version_code", Integer.valueOf(i5));
        if (str3 != null && !Intrinsics.areEqual(str3, str)) {
            hashMap.put("device_id_old", str3);
        }
        if (str4 != null) {
            hashMap.put("firebase_token", str4);
        }
        if (str5 != null) {
            s3.d[] dVarArr = s3.d.f22620a;
            hashMap.put(StartupParamsCallback.APPMETRICA_DEVICE_ID, str5);
        }
        if (str6 != null) {
            hashMap.put("gaid", str6);
        }
        if (str7 != null) {
            s3.d[] dVarArr2 = s3.d.f22620a;
            hashMap.put("appsflyer_id", str7);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, mf.c cVar) {
        t tVar;
        int i5;
        try {
            if (cVar instanceof t) {
                tVar = (t) cVar;
                int i10 = tVar.f22272c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    tVar.f22272c = i10 - Integer.MIN_VALUE;
                    Object obj = tVar.f22270a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = tVar.f22272c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<IdentifyApi> x10 = this.f22226a.x(p(), str);
                        tVar.f22272c = 1;
                        obj = x10.R(tVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((IdentifyApi) obj).map();
                }
            }
            if (i5 != 0) {
            }
            return ((IdentifyApi) obj).map();
        } catch (MHttpException e7) {
            return new x3.g(e7);
        } catch (oi.q e9) {
            return new x3.f(e9);
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.f22270a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = tVar.f22272c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, String str2, String str3, m0 m0Var, Boolean bool, mf.c cVar) {
        u uVar;
        int i5;
        gh.d0 d0Var;
        try {
            if (cVar instanceof u) {
                uVar = (u) cVar;
                int i10 = uVar.f22275c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    uVar.f22275c = i10 - Integer.MIN_VALUE;
                    Object obj = uVar.f22273a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = uVar.f22275c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        l0 l0Var = null;
                        if (m0Var != null) {
                            d0Var = y4.a.o(Intrinsics.areEqual(bool, Boolean.TRUE) ? "purchase_data" : "file", str3, m0Var);
                        } else {
                            d0Var = null;
                        }
                        c cVar2 = this.f22226a;
                        String p10 = p();
                        if (str2 != null) {
                            int i11 = m0.f10243a;
                            Regex regex = gh.b0.f10117d;
                            l0Var = gh.o.c(str2, gh.a0.b("text/plain"));
                        }
                        f0<SupportMessageApi> A = cVar2.A(p10, str, l0Var, d0Var);
                        uVar.f22275c = 1;
                        obj = A.R(uVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((SupportMessageApi) obj).m89map();
                }
            }
            if (i5 != 0) {
            }
            return ((SupportMessageApi) obj).m89map();
        } catch (MHttpException e7) {
            return new b4.g(e7);
        } catch (oi.q e9) {
            return new b4.f(e9);
        }
        uVar = new u(this, cVar);
        Object obj2 = uVar.f22273a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = uVar.f22275c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Integer num, String str, mf.c cVar) {
        v vVar;
        int i5;
        try {
            if (cVar instanceof v) {
                vVar = (v) cVar;
                int i10 = vVar.f22278c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    vVar.f22278c = i10 - Integer.MIN_VALUE;
                    Object obj = vVar.f22276a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = vVar.f22278c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        HashMap<String, Object> hashMap = new HashMap<>();
                        s3.c[] cVarArr = s3.c.f22619a;
                        hashMap.put("count", new Integer(50));
                        if (num != null) {
                            s3.b[] bVarArr = s3.b.f22618a;
                            hashMap.put("time", num);
                        }
                        f0<SupportMessagesApi> o3 = this.f22226a.o(p(), str, hashMap);
                        vVar.f22278c = 1;
                        obj = o3.R(vVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((SupportMessagesApi) obj).m90map();
                }
            }
            if (i5 != 0) {
            }
            return ((SupportMessagesApi) obj).m90map();
        } catch (MHttpException e7) {
            return new b4.j(e7);
        } catch (oi.q e9) {
            return new b4.i(e9);
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.f22276a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = vVar.f22278c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, ArrayList arrayList, mf.c cVar) {
        w wVar;
        int i5;
        try {
            if (cVar instanceof w) {
                wVar = (w) cVar;
                int i10 = wVar.f22281c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    wVar.f22281c = i10 - Integer.MIN_VALUE;
                    Object obj = wVar.f22279a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = wVar.f22281c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        f0<v3.e> t3 = this.f22226a.t(p(), str, w(arrayList));
                        wVar.f22281c = 1;
                        obj = t3.R(wVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (v3.e) obj;
                }
            }
            if (i5 != 0) {
            }
            return (v3.e) obj;
        } catch (MHttpException e7) {
            return new v3.d((v3.b) e7);
        } catch (oi.q e9) {
            return new v3.d(e9);
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.f22279a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = wVar.f22281c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(String str, int i5, int i10, mf.c cVar) {
        x xVar;
        int i11;
        try {
            if (cVar instanceof x) {
                xVar = (x) cVar;
                int i12 = xVar.f22284c;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    xVar.f22284c = i12 - Integer.MIN_VALUE;
                    Object obj = xVar.f22282a;
                    lf.a aVar = lf.a.f20034a;
                    i11 = xVar.f22284c;
                    if (i11 != 0) {
                        h8.b.B(obj);
                        f0<PostsNews> z5 = this.f22226a.z(p(), str, y(i10, i5));
                        xVar.f22284c = 1;
                        obj = z5.R(xVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((PostsNews) obj).map();
                }
            }
            if (i11 != 0) {
            }
            return ((PostsNews) obj).map();
        } catch (MHttpException e7) {
            return new z3.f(e7);
        } catch (oi.q e9) {
            return new z3.e(e9);
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.f22282a;
        lf.a aVar2 = lf.a.f20034a;
        i11 = xVar.f22284c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(int i5, String str, mf.c cVar) {
        y yVar;
        int i10;
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i11 = yVar.f22287c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    yVar.f22287c = i11 - Integer.MIN_VALUE;
                    Object obj = yVar.f22285a;
                    lf.a aVar = lf.a.f20034a;
                    i10 = yVar.f22287c;
                    if (i10 != 0) {
                        h8.b.B(obj);
                        f0<PostNews> m6 = this.f22226a.m(p(), str, i5);
                        yVar.f22287c = 1;
                        obj = m6.R(yVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return ((PostNews) obj).map();
                }
            }
            if (i10 != 0) {
            }
            return ((PostNews) obj).map();
        } catch (MHttpException e7) {
            return new z3.b(e7);
        } catch (oi.q e9) {
            return new z3.a(e9);
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.f22285a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = yVar.f22287c;
    }
}
