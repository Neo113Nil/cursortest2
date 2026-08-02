package defpackage;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cy extends ci9 {
    public final p00 d;
    public final Set e = ph0.a0(new di9[]{al9.a, olg.a});

    public cy(p00 p00Var) {
        this.d = p00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        if (r5.getConnectTimeout() > r16) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e7 A[LOOP:2: B:64:0x01e1->B:66:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.net.HttpURLConnection, kotlin.coroutines.CoroutineContext, lu8, swd, zj9] */
    @Override // defpackage.ci9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zj9 zj9Var, sq3 sq3Var) {
        zx zxVar;
        int i;
        zj9 zj9Var2;
        Object obj;
        w89 w89Var;
        swd swdVar;
        ij9 ij9Var;
        HttpURLConnection httpURLConnection;
        bl9 bl9Var;
        Object obj2;
        lu8 lu8Var;
        Set set;
        Object obj3;
        Iterator it;
        up3 b;
        String str;
        Long a;
        String str2;
        lu8 lu8Var2;
        lu3 lu3Var;
        zj9 zj9Var3;
        CoroutineContext coroutineContext;
        HttpURLConnection httpURLConnection2;
        swd swdVar2;
        lu8 lu8Var3;
        CoroutineContext coroutineContext2;
        if (sq3Var instanceof zx) {
            zxVar = (zx) sq3Var;
            int i2 = zxVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zxVar.y = i2 - Integer.MIN_VALUE;
                Object obj4 = zxVar.w;
                lu3 lu3Var2 = lu3.a;
                i = zxVar.y;
                if (i != 0) {
                    y6a.M(obj4);
                    zj9Var2 = zj9Var;
                    zxVar.r = zj9Var2;
                    zxVar.y = 1;
                    Set set2 = ejk.a;
                    CoroutineContext.Element element = zxVar.getContext().get(kka.b);
                    element.getClass();
                    obj = ((kka) element).a;
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                y6a.M(obj4);
                                return obj4;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        httpURLConnection2 = zxVar.v;
                        swdVar2 = zxVar.u;
                        lu8 lu8Var4 = zxVar.t;
                        coroutineContext = zxVar.s;
                        zj9Var3 = zxVar.r;
                        y6a.M(obj4);
                        lu3Var = lu3Var2;
                        lu8Var2 = lu8Var4;
                        obj3 = null;
                        httpURLConnection = httpURLConnection2;
                        swdVar = swdVar2;
                        coroutineContext2 = coroutineContext;
                        zj9Var2 = zj9Var3;
                        lu8Var3 = lu8Var2;
                        fa faVar = new fa(coroutineContext2, zj9Var2, swdVar, lu8Var3);
                        ?? r10 = obj3;
                        zxVar.r = r10;
                        zxVar.s = r10;
                        zxVar.t = r10;
                        zxVar.u = r10;
                        zxVar.v = r10;
                        zxVar.y = 3;
                        Object J = pd0.J(httpURLConnection, zj9Var2, faVar, zxVar);
                        return J == lu3Var ? lu3Var : J;
                    }
                    zj9 zj9Var4 = zxVar.r;
                    y6a.M(obj4);
                    obj = obj4;
                    zj9Var2 = zj9Var4;
                }
                CoroutineContext coroutineContext3 = (CoroutineContext) obj;
                lu8 a2 = xg4.a(null);
                lek lekVar = zj9Var2.a;
                w89Var = zj9Var2.c;
                swdVar = zj9Var2.d;
                ij9Var = zj9Var2.b;
                String str3 = lekVar.f;
                List list = zi9.a;
                String str4 = w89Var.get("Content-Length");
                Long l = str4 == null ? new Long(Long.parseLong(str4)) : swdVar.a();
                URL url = new URL(str3);
                p00 p00Var = this.d;
                p00Var.getClass();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                uRLConnection.getClass();
                httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setConnectTimeout(DefaultOggSeeker.MATCH_BYTE_RANGE);
                httpURLConnection.setReadTimeout(DefaultOggSeeker.MATCH_BYTE_RANGE);
                Map map = (Map) zj9Var2.f.d(ei9.a);
                bl9Var = (bl9) (map == null ? map.get(al9.a) : null);
                if (bl9Var != null) {
                    Long l2 = bl9Var.b;
                    if (l2 != null) {
                        httpURLConnection.setConnectTimeout(dl9.a(l2.longValue()));
                    }
                    Long l3 = bl9Var.c;
                    if (l3 != null) {
                        httpURLConnection.setReadTimeout(dl9.a(l3.longValue()));
                    }
                    Long l4 = bl9Var.a;
                    if (l4 != null) {
                        long longValue = l4.longValue();
                        if (longValue != Long.MAX_VALUE) {
                            if (httpURLConnection.getConnectTimeout() != 0) {
                                obj2 = null;
                                lu8Var = a2;
                            } else {
                                obj2 = null;
                                lu8Var = a2;
                            }
                            httpURLConnection.setConnectTimeout(dl9.a(longValue));
                            if (httpURLConnection instanceof HttpsURLConnection) {
                                p00Var.a.invoke(httpURLConnection);
                            }
                            httpURLConnection.setRequestMethod(ij9Var.a);
                            int i3 = 0;
                            httpURLConnection.setUseCaches(false);
                            httpURLConnection.setInstanceFollowRedirects(false);
                            set = jj9.a;
                            obj3 = obj2;
                            ay ayVar = new ay(!set.contains(ij9Var) && (swdVar instanceof dm5), httpURLConnection, i3);
                            Set set3 = ejk.a;
                            t89 t89Var = new t89(8);
                            t89Var.j(w89Var);
                            swdVar.c();
                            t89Var.j(gm5.c);
                            Unit unit = Unit.a;
                            Map map2 = (Map) t89Var.b;
                            rl2 rl2Var = new rl2();
                            it = map2.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                String str5 = (String) entry.getKey();
                                Iterator it2 = it;
                                List list2 = (List) entry.getValue();
                                Long l5 = l;
                                int size = list2.size();
                                lu3 lu3Var3 = lu3Var2;
                                ArrayList arrayList = new ArrayList(size);
                                CoroutineContext coroutineContext4 = coroutineContext3;
                                for (int i4 = 0; i4 < size; i4++) {
                                    arrayList.add((String) list2.get(i4));
                                }
                                rl2Var.put(str5, arrayList);
                                l = l5;
                                it = it2;
                                lu3Var2 = lu3Var3;
                                coroutineContext3 = coroutineContext4;
                            }
                            lu3 lu3Var4 = lu3Var2;
                            CoroutineContext coroutineContext5 = coroutineContext3;
                            Long l6 = l;
                            lqj lqjVar = new lqj(ayVar, 10);
                            for (Map.Entry entry2 : rl2Var.entrySet()) {
                                lqjVar.invoke((String) entry2.getKey(), (List) entry2.getValue());
                            }
                            if (w89Var.get(Command.HTTP_HEADER_USER_AGENT) == null) {
                                swdVar.c();
                                int i5 = xje.a;
                                ayVar.invoke(Command.HTTP_HEADER_USER_AGENT, "ktor-client");
                            }
                            b = swdVar.b();
                            if (b != null) {
                                str = b.toString();
                            } else {
                                swdVar.c();
                                str = w89Var.get("Content-Type");
                            }
                            a = swdVar.a();
                            if (a != null || (str2 = a.toString()) == null) {
                                swdVar.c();
                                str2 = w89Var.get("Content-Length");
                            }
                            if (str != null) {
                                ayVar.invoke("Content-Type", str);
                            }
                            if (str2 != null) {
                                ayVar.invoke("Content-Length", str2);
                            }
                            p00Var.b.invoke(httpURLConnection);
                            if (!set.contains(ij9Var)) {
                                if (l6 == null && httpURLConnection.getRequestProperty("Transfer-Encoding") == null) {
                                    httpURLConnection.addRequestProperty("Transfer-Encoding", "chunked");
                                }
                                if (l6 != null) {
                                    httpURLConnection.setFixedLengthStreamingMode(l6.longValue());
                                } else {
                                    httpURLConnection.setChunkedStreamingMode(0);
                                }
                                httpURLConnection.setDoOutput(true);
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                outputStream.getClass();
                                zxVar.r = zj9Var2;
                                zxVar.s = coroutineContext5;
                                lu8Var2 = lu8Var;
                                zxVar.t = lu8Var2;
                                zxVar.u = swdVar;
                                zxVar.v = httpURLConnection;
                                zxVar.y = 2;
                                lu3Var = lu3Var4;
                                if (tol.D(swdVar, outputStream, zxVar) == lu3Var) {
                                    return lu3Var;
                                }
                                zj9Var3 = zj9Var2;
                                coroutineContext = coroutineContext5;
                                httpURLConnection2 = httpURLConnection;
                                swdVar2 = swdVar;
                                httpURLConnection = httpURLConnection2;
                                swdVar = swdVar2;
                                coroutineContext2 = coroutineContext;
                                zj9Var2 = zj9Var3;
                                lu8Var3 = lu8Var2;
                                fa faVar2 = new fa(coroutineContext2, zj9Var2, swdVar, lu8Var3);
                                ?? r102 = obj3;
                                zxVar.r = r102;
                                zxVar.s = r102;
                                zxVar.t = r102;
                                zxVar.u = r102;
                                zxVar.v = r102;
                                zxVar.y = 3;
                                Object J2 = pd0.J(httpURLConnection, zj9Var2, faVar2, zxVar);
                                if (J2 == lu3Var) {
                                }
                            } else {
                                if (!(swdVar instanceof dm5)) {
                                    pvd.p(ij9Var, " couldn't send a body with the [Android] engine.", "Request of type ");
                                    return obj3;
                                }
                                lu8Var3 = lu8Var;
                                lu3Var = lu3Var4;
                                coroutineContext2 = coroutineContext5;
                                fa faVar22 = new fa(coroutineContext2, zj9Var2, swdVar, lu8Var3);
                                ?? r1022 = obj3;
                                zxVar.r = r1022;
                                zxVar.s = r1022;
                                zxVar.t = r1022;
                                zxVar.u = r1022;
                                zxVar.v = r1022;
                                zxVar.y = 3;
                                Object J22 = pd0.J(httpURLConnection, zj9Var2, faVar22, zxVar);
                                if (J22 == lu3Var) {
                                }
                            }
                        }
                    }
                }
                obj2 = null;
                lu8Var = a2;
                if (httpURLConnection instanceof HttpsURLConnection) {
                }
                httpURLConnection.setRequestMethod(ij9Var.a);
                int i32 = 0;
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(false);
                set = jj9.a;
                obj3 = obj2;
                ay ayVar2 = new ay(!set.contains(ij9Var) && (swdVar instanceof dm5), httpURLConnection, i32);
                Set set32 = ejk.a;
                t89 t89Var2 = new t89(8);
                t89Var2.j(w89Var);
                swdVar.c();
                t89Var2.j(gm5.c);
                Unit unit2 = Unit.a;
                Map map22 = (Map) t89Var2.b;
                rl2 rl2Var2 = new rl2();
                it = map22.entrySet().iterator();
                while (it.hasNext()) {
                }
                lu3 lu3Var42 = lu3Var2;
                CoroutineContext coroutineContext52 = coroutineContext3;
                Long l62 = l;
                lqj lqjVar2 = new lqj(ayVar2, 10);
                while (r4.hasNext()) {
                }
                if (w89Var.get(Command.HTTP_HEADER_USER_AGENT) == null) {
                }
                b = swdVar.b();
                if (b != null) {
                }
                a = swdVar.a();
                if (a != null) {
                }
                swdVar.c();
                str2 = w89Var.get("Content-Length");
                if (str != null) {
                }
                if (str2 != null) {
                }
                p00Var.b.invoke(httpURLConnection);
                if (!set.contains(ij9Var)) {
                }
            }
        }
        zxVar = new zx(this, sq3Var);
        Object obj42 = zxVar.w;
        lu3 lu3Var22 = lu3.a;
        i = zxVar.y;
        if (i != 0) {
        }
        CoroutineContext coroutineContext32 = (CoroutineContext) obj;
        lu8 a22 = xg4.a(null);
        lek lekVar2 = zj9Var2.a;
        w89Var = zj9Var2.c;
        swdVar = zj9Var2.d;
        ij9Var = zj9Var2.b;
        String str32 = lekVar2.f;
        List list3 = zi9.a;
        String str42 = w89Var.get("Content-Length");
        if (str42 == null) {
        }
        URL url2 = new URL(str32);
        p00 p00Var2 = this.d;
        p00Var2.getClass();
        URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection());
        uRLConnection2.getClass();
        httpURLConnection = (HttpURLConnection) uRLConnection2;
        httpURLConnection.setConnectTimeout(DefaultOggSeeker.MATCH_BYTE_RANGE);
        httpURLConnection.setReadTimeout(DefaultOggSeeker.MATCH_BYTE_RANGE);
        Map map3 = (Map) zj9Var2.f.d(ei9.a);
        bl9Var = (bl9) (map3 == null ? map3.get(al9.a) : null);
        if (bl9Var != null) {
        }
        obj2 = null;
        lu8Var = a22;
        if (httpURLConnection instanceof HttpsURLConnection) {
        }
        httpURLConnection.setRequestMethod(ij9Var.a);
        int i322 = 0;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        set = jj9.a;
        obj3 = obj2;
        ay ayVar22 = new ay(!set.contains(ij9Var) && (swdVar instanceof dm5), httpURLConnection, i322);
        Set set322 = ejk.a;
        t89 t89Var22 = new t89(8);
        t89Var22.j(w89Var);
        swdVar.c();
        t89Var22.j(gm5.c);
        Unit unit22 = Unit.a;
        Map map222 = (Map) t89Var22.b;
        rl2 rl2Var22 = new rl2();
        it = map222.entrySet().iterator();
        while (it.hasNext()) {
        }
        lu3 lu3Var422 = lu3Var22;
        CoroutineContext coroutineContext522 = coroutineContext32;
        Long l622 = l;
        lqj lqjVar22 = new lqj(ayVar22, 10);
        while (r4.hasNext()) {
        }
        if (w89Var.get(Command.HTTP_HEADER_USER_AGENT) == null) {
        }
        b = swdVar.b();
        if (b != null) {
        }
        a = swdVar.a();
        if (a != null) {
        }
        swdVar.c();
        str2 = w89Var.get("Content-Length");
        if (str != null) {
        }
        if (str2 != null) {
        }
        p00Var2.b.invoke(httpURLConnection);
        if (!set.contains(ij9Var)) {
        }
    }

    @Override // defpackage.ci9
    public final p00 h() {
        return this.d;
    }
}
