package v9;

import android.widget.TextView;
import com.google.firebase.messaging.x;
import com.logrocket.core.LogRocketCore;
import com.logrocket.core.f0;
import com.sports.insider.data.repository.room.live.LiveTable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LogRocketCore f24473a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24474b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24475c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24476d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f24477e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24478f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f24479g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f24480h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f24481i;
    public final AtomicBoolean j;

    /* renamed from: k, reason: collision with root package name */
    public final ba.d f24482k;

    /* renamed from: l, reason: collision with root package name */
    public Double f24483l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f24484m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f24485n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f24486o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f24487p;
    public final HashMap q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f24488r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f24489s;

    public d(LogRocketCore logRocketCore, JSONObject jSONObject, int i5) {
        ArrayList arrayList = new ArrayList();
        this.f24475c = arrayList;
        this.f24476d = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f24477e = arrayList2;
        this.f24478f = new ArrayList();
        this.f24479g = new HashMap();
        this.f24480h = new HashMap();
        this.f24481i = new HashMap();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.j = atomicBoolean;
        this.f24482k = new ba.d("FilterManager");
        this.f24484m = new HashMap();
        this.f24485n = Boolean.FALSE;
        this.f24486o = new HashMap();
        this.f24487p = new HashMap();
        this.q = new HashMap();
        this.f24488r = new HashMap();
        this.f24489s = new Object();
        this.f24473a = logRocketCore;
        this.f24474b = i5;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("f")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("f");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        g(jSONArray.getJSONObject(i10));
                    }
                }
                if (jSONObject.has("rct")) {
                    this.f24483l = Double.valueOf(jSONObject.getDouble("rct"));
                }
                if (jSONObject.has("rc")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("rc");
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        j(jSONArray2.getJSONObject(i11));
                    }
                    l();
                }
                k(jSONObject);
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                atomicBoolean.set(false);
            } catch (JSONException e7) {
                this.f24482k.e("Error while parsing hydrated data", e7);
                this.f24475c.clear();
                synchronized (this.f24489s) {
                    this.f24479g.clear();
                }
            }
        }
    }

    public static boolean h(int i5, b bVar) {
        switch (c.f24472a[v.f.d(i5)]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public final ArrayList a(int i5, int i10, long j, Object obj) {
        ArrayList arrayList;
        boolean z5;
        HashMap hashMap;
        ArrayList arrayList2;
        int i11;
        HashMap hashMap2 = this.f24481i;
        ArrayList arrayList3 = this.f24475c;
        if (arrayList3.isEmpty() || this.j.get()) {
            return null;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            try {
                z5 = bVar.f24470b;
                hashMap = this.f24479g;
            } catch (Exception e7) {
                e = e7;
                arrayList = arrayList4;
            }
            if (!z5 || !hashMap.containsKey(bVar.f24469a)) {
                String str = bVar.f24469a;
                int i12 = bVar.f24471c;
                if (i12 == 2) {
                    try {
                        p pVar = (p) bVar;
                        int intValue = hashMap.containsKey(str) ? ((Integer) hashMap.get(str)).intValue() : 0;
                        if (hashMap2.containsKey(str) && pVar.f24534e.a(i5, i10, obj) && h(i10, bVar)) {
                            arrayList2 = arrayList4;
                            long longValue = j - ((Long) hashMap2.get(str)).longValue();
                            try {
                                hashMap2.remove(str);
                                hashMap.put(str, Integer.valueOf((hashMap.containsKey(str) ? ((Integer) hashMap.get(str)).intValue() : 0) + 1));
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(str);
                                double d10 = longValue;
                                i11 = intValue;
                                f(arrayList5, d10, j);
                            } catch (Exception e9) {
                                e = e9;
                                arrayList = arrayList2;
                                this.f24482k.e("Error while testing filter: " + bVar.f24469a, e);
                                arrayList4 = arrayList;
                            }
                        } else {
                            i11 = intValue;
                            arrayList2 = arrayList4;
                        }
                        if (i11 < 100 && pVar.f24533d.a(i5, i10, obj) && h(i10, bVar)) {
                            hashMap2.put(str, Long.valueOf(j));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        arrayList2 = arrayList4;
                    }
                } else {
                    arrayList2 = arrayList4;
                    if (i12 == 1 && ((q) bVar).a(i5, i10, obj) && (i(bVar, obj) || h(i10, bVar))) {
                        arrayList = arrayList2;
                        try {
                            arrayList.add(str);
                        } catch (Exception e11) {
                            e = e11;
                            this.f24482k.e("Error while testing filter: " + bVar.f24469a, e);
                            arrayList4 = arrayList;
                        }
                        arrayList4 = arrayList;
                    }
                }
                arrayList4 = arrayList2;
            }
        }
        ArrayList arrayList6 = arrayList4;
        if (arrayList6.isEmpty()) {
            return null;
        }
        return b(arrayList6);
    }

    public final ArrayList b(ArrayList arrayList) {
        HashMap hashMap;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f24479g;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            if ((hashMap.containsKey(str) ? ((Integer) hashMap.get(str)).intValue() : 0) < 100) {
                arrayList2.add(str);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            hashMap.put(str2, Integer.valueOf((hashMap.containsKey(str2) ? ((Integer) hashMap.get(str2)).intValue() : 0) + 1));
        }
        return arrayList2;
    }

    public final void c(int i5, int i10, long j, Object obj) {
        f0 f0Var;
        if (this.f24483l != null) {
            LogRocketCore logRocketCore = this.f24473a;
            if (logRocketCore.n().booleanValue()) {
                return;
            }
            Iterator it = this.f24477e.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar.f24521b > this.f24483l.doubleValue()) {
                    Iterator it2 = kVar.f24522c.iterator();
                    boolean z5 = true;
                    while (it2.hasNext()) {
                        q qVar = (q) it2.next();
                        String str = qVar.f24469a;
                        HashMap hashMap = this.f24481i;
                        if (!hashMap.containsKey(str)) {
                            if (qVar.a(i10, i5, obj) && h(i5, qVar)) {
                                hashMap.put(str, Long.valueOf(j));
                            } else {
                                z5 = false;
                            }
                        }
                    }
                    if (z5) {
                        String str2 = kVar.f24520a;
                        ba.d dVar = logRocketCore.f6382e;
                        if (!logRocketCore.f6400y.get()) {
                            String valueOf = String.valueOf(logRocketCore.N.f6447c);
                            if (!logRocketCore.f6463b.containsKey(valueOf) || !((Boolean) logRocketCore.f6463b.get(valueOf)).booleanValue()) {
                                if (logRocketCore.f6465d == 2 && logRocketCore.P != null) {
                                    dVar.a("Session confirmed for limited lookback conditional recording");
                                    logRocketCore.P.d();
                                }
                                dVar.a("Conditional recording started");
                                logRocketCore.f6463b.put(valueOf, Boolean.TRUE);
                                logRocketCore.f6464c.add(Integer.valueOf(logRocketCore.N.f6447c));
                                logRocketCore.N.j = true;
                                logRocketCore.m();
                                x h10 = x.h();
                                h10.getClass();
                                if (LogRocketCore.maybeGetInstance(true) != null && (f0Var = (f0) ((WeakReference) h10.f6184c).get()) != null) {
                                    try {
                                        x.h().j(new com.logrocket.core.webview.a(f0Var));
                                    } catch (JSONException unused) {
                                    }
                                }
                                if (!str2.isEmpty()) {
                                    wg.i q = wg.j.q();
                                    q.d();
                                    wg.j.p((wg.j) q.f6816b, str2);
                                    logRocketCore.a(30, q);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void d(int i5, com.logrocket.protobuf.x xVar, long j) {
        synchronized (this.f24489s) {
            try {
                if (!this.f24484m.isEmpty() && this.f24485n.booleanValue()) {
                    String[] strArr = (String[]) this.f24484m.keySet().toArray(new String[0]);
                    double d10 = this.f24473a.N.q;
                    boolean z5 = false;
                    for (String str : strArr) {
                        Double d11 = (Double) this.f24484m.get(str);
                        if (d11 != null && j >= d11.doubleValue() + d10) {
                            this.f24481i.put(str, Long.valueOf(j));
                            this.f24484m.remove(str);
                            z5 = true;
                        }
                    }
                    if (z5) {
                        c(i5, 0, j, xVar);
                    }
                }
            } finally {
            }
        }
    }

    public final void e(int i5, com.logrocket.protobuf.x xVar, long j, int i10) {
        d dVar;
        if (this.j.get()) {
            return;
        }
        if (i5 == 8) {
            xVar.getClass();
            throw new ClassCastException();
        }
        long j6 = j;
        ArrayList a7 = a(i10, i5, j6, xVar);
        if (a7 == null || a7.isEmpty()) {
            dVar = this;
        } else {
            dVar = this;
            dVar.f(a7, 0.0d, j6);
            j6 = j6;
        }
        dVar.c(i5, i10, j6, xVar);
    }

    public final void f(ArrayList arrayList, double d10, long j) {
        ArrayList b10 = b(arrayList);
        bh.d r5 = bh.e.r();
        r5.d();
        bh.e.q((bh.e) r5.f6816b, b10);
        r5.d();
        bh.e.p((bh.e) r5.f6816b, d10);
        this.f24473a.b(16, r5, null, false, Long.valueOf(j));
    }

    public final void g(JSONObject jSONObject) {
        try {
            b o3 = h8.b.o(jSONObject);
            if (o3 != null) {
                this.f24475c.add(o3);
                this.f24476d.add(jSONObject);
            }
        } catch (JSONException e7) {
            this.f24482k.f("Filter data could not be parsed: " + jSONObject.toString(), e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(b bVar, Object obj) {
        String str;
        String str2;
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            String str3 = aVar.f24468g;
            int i5 = aVar.f24524f;
            boolean z5 = this.f24474b == 1;
            if (i5 == 5 && str3 != null) {
                if (!z5) {
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else if (obj instanceof TextView) {
                        str = ((TextView) obj).getText().toString();
                    } else if (obj instanceof t9.d) {
                        str = ((t9.d) obj).f23792d;
                    }
                    bh.b t3 = bh.c.t();
                    t3.d();
                    bh.c.p((bh.c) t3.f6816b, str3);
                    switch (l.f24523a[v.f.d(i5)]) {
                        case 1:
                            str2 = "href";
                            break;
                        case 2:
                            str2 = LiveTable.messageColumn;
                            break;
                        case 3:
                            str2 = "nestedClick";
                            break;
                        case 4:
                            str2 = "networkRequest";
                            break;
                        case 5:
                            str2 = "visibleElement";
                            break;
                        case 6:
                            str2 = "customEvent";
                            break;
                        case 7:
                            str2 = "sessionDuration";
                            break;
                        default:
                            str2 = null;
                            break;
                    }
                    t3.d();
                    bh.c.q((bh.c) t3.f6816b, str2);
                    LogRocketCore logRocketCore = this.f24473a;
                    String c2 = logRocketCore.f6462a.c();
                    t3.d();
                    bh.c.r((bh.c) t3.f6816b, c2);
                    t3.d();
                    bh.c.s((bh.c) t3.f6816b, str);
                    logRocketCore.a(17, t3);
                    return true;
                }
                str = "";
                bh.b t32 = bh.c.t();
                t32.d();
                bh.c.p((bh.c) t32.f6816b, str3);
                switch (l.f24523a[v.f.d(i5)]) {
                }
                t32.d();
                bh.c.q((bh.c) t32.f6816b, str2);
                LogRocketCore logRocketCore2 = this.f24473a;
                String c22 = logRocketCore2.f6462a.c();
                t32.d();
                bh.c.r((bh.c) t32.f6816b, c22);
                t32.d();
                bh.c.s((bh.c) t32.f6816b, str);
                logRocketCore2.a(17, t32);
                return true;
            }
        }
        return false;
    }

    public final void j(JSONObject jSONObject) {
        try {
            k s8 = h8.b.s(jSONObject);
            if (s8 != null) {
                this.f24477e.add(s8);
                this.f24478f.add(jSONObject);
            }
        } catch (JSONException e7) {
            this.f24482k.f("Recording condition data could not be parsed: " + jSONObject.toString(), e7);
        }
    }

    public final void k(JSONObject jSONObject) {
        if (jSONObject.has("mc")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mc");
            Iterator<String> keys = jSONObject2.keys();
            synchronized (this.f24489s) {
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        this.f24479g.put(next, Integer.valueOf(jSONObject2.getInt(next)));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc A[Catch: Exception -> 0x00e6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e6, blocks: (B:25:0x0074, B:53:0x00c6, B:54:0x00d1, B:55:0x00dc, B:56:0x00a1, B:59:0x00aa, B:62:0x00b4), top: B:24:0x0074 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        double parseDouble;
        String lowerCase;
        int hashCode;
        if (this.f24477e.isEmpty() || this.f24483l == null) {
            return;
        }
        Iterator it = this.f24477e.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.f24521b > this.f24483l.doubleValue()) {
                Iterator it2 = kVar.f24522c.iterator();
                while (it2.hasNext()) {
                    m mVar = (m) it2.next();
                    if (mVar.f24524f == 7) {
                        for (Map.Entry entry : mVar.f24536e.entrySet()) {
                            if (entry.getKey() == j.f24518s) {
                                char c2 = 0;
                                String str = (String) ((n) entry.getValue()).a().get(0);
                                Double d10 = null;
                                try {
                                    parseDouble = Double.parseDouble(str.substring(0, str.length() - 1));
                                    lowerCase = str.substring(str.length() - 1).toLowerCase();
                                    hashCode = lowerCase.hashCode();
                                } catch (Exception unused) {
                                }
                                if (hashCode == 104) {
                                    if (lowerCase.equals("h")) {
                                        c2 = 2;
                                        if (c2 != 0) {
                                        }
                                        if (d10 == null) {
                                        }
                                    }
                                    c2 = 65535;
                                    if (c2 != 0) {
                                    }
                                    if (d10 == null) {
                                    }
                                } else if (hashCode != 109) {
                                    if (hashCode == 115 && lowerCase.equals("s")) {
                                        if (c2 != 0) {
                                            d10 = Double.valueOf(parseDouble * 1000.0d);
                                        } else if (c2 == 1) {
                                            d10 = Double.valueOf(parseDouble * 60000.0d);
                                        } else if (c2 == 2) {
                                            d10 = Double.valueOf(parseDouble * 3600000.0d);
                                        }
                                        if (d10 == null) {
                                            synchronized (this.f24489s) {
                                                this.f24484m.put(mVar.f24469a, d10);
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    c2 = 65535;
                                    if (c2 != 0) {
                                    }
                                    if (d10 == null) {
                                    }
                                } else {
                                    if (lowerCase.equals("m")) {
                                        c2 = 1;
                                        if (c2 != 0) {
                                        }
                                        if (d10 == null) {
                                        }
                                    }
                                    c2 = 65535;
                                    if (c2 != 0) {
                                    }
                                    if (d10 == null) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
