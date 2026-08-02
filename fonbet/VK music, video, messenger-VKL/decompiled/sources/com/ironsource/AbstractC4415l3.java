package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.AbstractC4415l3;
import com.ironsource.C5;
import com.ironsource.D7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.i5s;

/* renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4415l3 implements C7 {
    static boolean O = false;
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private A5 K;
    private C4243ba L;
    private We M;
    private boolean l;
    private C4 p;
    private AbstractC4286e q;
    private ArrayList<C4632x5> r;
    private int t;
    private J8 u;
    private Context v;
    private int[] z;
    final int a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final String g = "supersonic_sdk.db";
    final String h = IronSourceConstants.EVENTS_PROVIDER;
    final String i = "placement";
    private final String j = "abt";
    private final String k = O6.b1;
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* renamed from: com.ironsource.l3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4415l3.this.a();
        }
    }

    /* renamed from: com.ironsource.l3$b */
    public class b implements Runnable {
        final /* synthetic */ C4632x5 a;
        final /* synthetic */ IronSource.a b;

        public b(C4632x5 c4632x5, IronSource.a aVar) {
            this.a = c4632x5;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a("eventSessionId", AbstractC4415l3.this.u.b());
            this.a.a("essn", Integer.valueOf(AbstractC4415l3.this.u.c()));
            String a = IronSourceUtils.a(AbstractC4415l3.this.v);
            if (AbstractC4415l3.this.g(this.a)) {
                this.a.a("connectionType", a);
            }
            if (AbstractC4415l3.q(AbstractC4415l3.this, this.a, a)) {
                C4632x5 c4632x5 = this.a;
                c4632x5.a(AbstractC4415l3.this.b(c4632x5));
            }
            String d = U3.d(AbstractC4415l3.this.v);
            if (d != null) {
                this.a.a("rawConnectionType", d);
            }
            int a2 = AbstractC4415l3.this.a(this.a.c(), this.b);
            if (a2 != e.NOT_SUPPORTED.b()) {
                this.a.a("adUnit", Integer.valueOf(a2));
            }
            AbstractC4415l3.this.a(this.a, "reason");
            AbstractC4415l3.this.a(this.a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC4415l3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC4415l3.this.E.entrySet()) {
                    if (!this.a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC4415l3.this.i(this.a)) {
                if (AbstractC4415l3.this.h(this.a) && !AbstractC4415l3.this.e(this.a)) {
                    this.a.a("sessionDepth", Integer.valueOf(AbstractC4415l3.this.c(this.a)));
                }
                if (AbstractC4415l3.this.j(this.a)) {
                    AbstractC4415l3.this.f(this.a);
                }
                long a3 = AbstractC4415l3.this.u.a();
                if (a3 > 0) {
                    this.a.a("firstSessionTimestamp", Long.valueOf(a3));
                }
                IronLog.EVENT.verbose(this.a.toString());
                AbstractC4415l3.this.r.add(this.a);
                AbstractC4415l3.this.t++;
            }
            AbstractC4415l3 abstractC4415l3 = AbstractC4415l3.this;
            boolean a4 = abstractC4415l3.a(abstractC4415l3.B) ? AbstractC4415l3.this.a(this.a.c(), AbstractC4415l3.this.B) : AbstractC4415l3.this.d(this.a);
            AbstractC4415l3 abstractC4415l32 = AbstractC4415l3.this;
            if (!abstractC4415l32.m && a4) {
                abstractC4415l32.m = true;
            }
            if (abstractC4415l32.p != null) {
                if (abstractC4415l32.g()) {
                    AbstractC4415l3.this.f();
                    return;
                }
                AbstractC4415l3 abstractC4415l33 = AbstractC4415l3.this;
                if (abstractC4415l33.b((ArrayList<C4632x5>) abstractC4415l33.r) || a4) {
                    AbstractC4415l3.this.a();
                }
            }
        }
    }

    /* renamed from: com.ironsource.l3$c */
    public class c implements D7 {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(D7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC4415l3 abstractC4415l3 = AbstractC4415l3.this;
                    ArrayList<C4632x5> a = abstractC4415l3.p.a(abstractC4415l3.I);
                    AbstractC4415l3.this.t = a.size() + AbstractC4415l3.this.r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC4415l3.this.a(AbstractC4415l3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e) {
                C4452n4.d().a(e);
            }
            a(aVar.b());
        }

        public void a(ArrayList<C4632x5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C4452n4.d().a(e);
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.ironsource.D7
        public synchronized void a(final D7.a aVar) {
            AbstractC4415l3.this.K.a(new Runnable() { // from class: com.ironsource.ih
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4415l3.c.this.b(aVar);
                }
            });
        }
    }

    /* renamed from: com.ironsource.l3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4415l3.this.f();
        }
    }

    /* renamed from: com.ironsource.l3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);

        private int a;

        e(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    public static /* bridge */ /* synthetic */ boolean q(AbstractC4415l3 abstractC4415l3, C4632x5 c4632x5, String str) {
        return abstractC4415l3.a(str, c4632x5);
    }

    public abstract int c(C4632x5 c4632x5);

    public abstract void d();

    public abstract boolean d(C4632x5 c4632x5);

    public abstract String e(int i);

    public abstract void f(C4632x5 c4632x5);

    public abstract boolean j(C4632x5 c4632x5);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C4632x5 c4632x5) {
        return c4632x5.c() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<C4632x5> a2;
        try {
            this.m = false;
            ArrayList<C4632x5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    a2 = this.p.a(this.I);
                    this.p.b(this.I);
                }
                C5.c cVar = new C5.c(new C5.a(a2, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                C4452n4.d().a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject b2 = L6.a().b();
                try {
                    a(b2);
                    String b3 = b();
                    if (!TextUtils.isEmpty(b3)) {
                        b2.put("abt", b3);
                    }
                    String k = com.ironsource.mediationsdk.p.h().k();
                    if (!TextUtils.isEmpty(k)) {
                        b2.put(O6.b1, k);
                    }
                    Map<String, String> c2 = c();
                    if (!c2.isEmpty()) {
                        for (Map.Entry<String, String> entry : c2.entrySet()) {
                            if (!b2.has(entry.getKey())) {
                                b2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject a3 = new H5().a();
                    Iterator<String> keys = a3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b2.put(next, a3.get(next));
                    }
                } catch (Throwable th2) {
                    C4452n4.d().a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String a4 = this.q.a(arrayList, b2);
                if (TextUtils.isEmpty(a4)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.l && a(arrayList, EnumC4650y5.FIRST_INSTANCE.b())) {
                    IronLog.INTERNAL.verbose("events data: " + a4);
                    O = true;
                }
                if (this.n) {
                    try {
                        a4 = Base64.encodeToString(R9.a(a4, this.o), 0);
                    } catch (Exception e2) {
                        C4452n4.d().a(e2);
                    }
                }
                Jf.a.b(new I5(new c(), a4, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            C4452n4.d().a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C4632x5 c4632x5) {
        if (c4632x5 == null) {
            return false;
        }
        if (a(this.z)) {
            return !a(c4632x5.c(), this.z);
        }
        if (a(this.A)) {
            return a(c4632x5.c(), this.A);
        }
        return true;
    }

    public synchronized void a(Context context, C4243ba c4243ba) {
        String a2 = IronSourceUtils.a(context, this.I, this.H);
        this.H = a2;
        b(a2);
        this.q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.p = C4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c4243ba;
        this.v = context;
    }

    @Override // com.ironsource.C7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    @Override // com.ironsource.C7
    public void d(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    public void e() {
        this.r = new ArrayList<>();
        this.t = 0;
        this.q = F5.a(this.H, this.G);
        A5 a5 = new A5(i5s.a(new StringBuilder(), this.I, "EventThread"));
        this.K = a5;
        a5.start();
        this.K.a();
        this.u = Kb.Y().m();
        this.J = new HashSet();
        d();
    }

    public void h() {
        this.K.a(new d());
    }

    private void b(String str) {
        AbstractC4286e abstractC4286e = this.q;
        if (abstractC4286e == null || !abstractC4286e.c().equals(str)) {
            this.q = F5.a(str, this.G);
        }
    }

    @Override // com.ironsource.C7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    public boolean g(C4632x5 c4632x5) {
        return (c4632x5.c() == EnumC4650y5.CONSENT_TRUE_CODE.b() || c4632x5.c() == EnumC4650y5.CONSENT_FALSE_CODE.b() || c4632x5.c() == EnumC4650y5.SET_META_DATA.b() || c4632x5.c() == EnumC4650y5.SET_META_DATA_AFTER_INIT.b() || c4632x5.c() == EnumC4650y5.SET_USER_ID.b()) ? false : true;
    }

    public boolean h(C4632x5 c4632x5) {
        return (c4632x5.c() == EnumC4650y5.FIRST_INSTANCE.b() || c4632x5.c() == EnumC4650y5.FIRST_INSTANCE_RESULT.b() || c4632x5.c() == EnumC4650y5.INIT_COMPLETE.b() || c4632x5.c() == EnumC4650y5.SDK_INIT_FAILED.b() || c4632x5.c() == EnumC4650y5.SDK_INIT_SUCCESS.b() || c4632x5.c() == EnumC4650y5.USING_CACHE_FOR_INIT_EVENT.b() || c4632x5.c() == EnumC4650y5.CONSENT_TRUE_CODE.b() || c4632x5.c() == EnumC4650y5.CONSENT_FALSE_CODE.b() || c4632x5.c() == EnumC4650y5.SET_META_DATA.b() || c4632x5.c() == EnumC4650y5.SET_META_DATA_AFTER_INIT.b() || c4632x5.c() == EnumC4650y5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.C7
    public void c(int i) {
        this.o = i;
    }

    @Override // com.ironsource.C7
    public void b(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public void c(boolean z) {
        this.l = z;
    }

    @Override // com.ironsource.C7
    public void b(int[] iArr, Context context) {
        this.z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.C7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC4286e abstractC4286e = this.q;
        if (abstractC4286e != null) {
            abstractC4286e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    @Override // com.ironsource.C7
    public void b(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C4632x5> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    public synchronized void a(We we) {
        this.M = we;
    }

    public String b() {
        return this.F;
    }

    private synchronized boolean a(String str, C4632x5 c4632x5) {
        boolean contains;
        try {
            if (!str.equalsIgnoreCase("none")) {
                return false;
            }
            if (a(this.C)) {
                contains = a(c4632x5.c(), this.C);
            } else {
                contains = this.J.contains(Integer.valueOf(c4632x5.c()));
            }
            return contains;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C4632x5 c4632x5) {
        JSONObject b2 = c4632x5.b();
        if (b2 == null) {
            return false;
        }
        return b2.has("sessionDepth");
    }

    @Override // com.ironsource.C7
    public synchronized void a(C4632x5 c4632x5) {
        a(c4632x5, (IronSource.a) null);
    }

    public synchronized void a(C4632x5 c4632x5, IronSource.a aVar) {
        if (c4632x5 != null) {
            if (this.s) {
                this.K.a(new b(c4632x5, aVar));
            }
        }
    }

    private boolean a(ArrayList<C4632x5> arrayList, int i) {
        Iterator<C4632x5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C4632x5> a(ArrayList<C4632x5> arrayList, String str) {
        String a2 = a(str, 1024);
        Iterator<C4632x5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(a2);
        }
        return arrayList;
    }

    public void a(ArrayList<C4632x5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    @Override // com.ironsource.C7
    public void a(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.ironsource.C7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.C7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.C7
    public void a(boolean z) {
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        if (a(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        try {
            C4243ba c4243ba = this.L;
            if (c4243ba != null) {
                if (c4243ba.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C4243ba.n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            We we = this.M;
            if (we != null) {
                String b2 = we.b();
                if (!TextUtils.isEmpty(b2)) {
                    jSONObject.put("segmentId", b2);
                }
                JSONObject a2 = this.M.a();
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, a2.get(next));
                }
            }
        } catch (JSONException e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public int f(int i) {
        return a(i, (IronSource.a) null);
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(C4632x5 c4632x5, String str, int i) {
        JSONObject b2 = c4632x5.b();
        if (b2 == null || !b2.has(str)) {
            return;
        }
        try {
            c4632x5.a(str, a(b2.optString(str, null), i));
        } catch (Exception e2) {
            C4452n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public String a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C4632x5 c4632x5, String str) {
        a(c4632x5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, IronSource.a aVar) {
        int b2 = e.NOT_SUPPORTED.b();
        if (aVar != IronSource.a.REWARDED_VIDEO && ((i < 1000 || i >= 2000) && (i < 91000 || i >= 92000))) {
            if (aVar != IronSource.a.INTERSTITIAL && ((i < 2000 || i >= 3000) && (i < 92000 || i >= 93000))) {
                if (aVar == IronSource.a.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
                    return e.BANNER.b();
                }
                return (aVar == IronSource.a.NATIVE_AD || (i >= 4000 && i < 5000) || (i >= 94000 && i < 95000)) ? e.NATIVE_AD.b() : b2;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(C4243ba c4243ba) {
        this.L = c4243ba;
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }
}
