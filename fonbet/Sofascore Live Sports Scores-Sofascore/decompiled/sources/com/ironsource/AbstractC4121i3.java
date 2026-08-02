package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.A5;
import com.ironsource.InterfaceC4429z7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4121i3 implements InterfaceC4411y7 {
    static boolean O = false;
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private HandlerThreadC4409y5 K;
    private C3959aa L;
    private Ue M;
    private boolean l;
    private C4426z4 p;
    private AbstractC4045e q;
    private ArrayList<C4355v5> r;
    private int t;
    private G8 u;
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
    private final String k = L6.b1;
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4121i3.this.a();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i3$b */
    public class b implements Runnable {
        final /* synthetic */ C4355v5 a;
        final /* synthetic */ IronSource.a b;

        public b(C4355v5 c4355v5, IronSource.a aVar) {
            this.a = c4355v5;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a("eventSessionId", AbstractC4121i3.this.u.b());
            this.a.a("essn", Integer.valueOf(AbstractC4121i3.this.u.c()));
            String a = IronSourceUtils.a(AbstractC4121i3.this.v);
            if (AbstractC4121i3.this.g(this.a)) {
                this.a.a("connectionType", a);
            }
            if (AbstractC4121i3.q(AbstractC4121i3.this, this.a, a)) {
                C4355v5 c4355v5 = this.a;
                c4355v5.a(AbstractC4121i3.this.b(c4355v5));
            }
            String d = R3.d(AbstractC4121i3.this.v);
            if (d != null) {
                this.a.a("rawConnectionType", d);
            }
            int a2 = AbstractC4121i3.this.a(this.a.c(), this.b);
            if (a2 != e.NOT_SUPPORTED.b()) {
                this.a.a("adUnit", Integer.valueOf(a2));
            }
            AbstractC4121i3.this.a(this.a, "reason");
            AbstractC4121i3.this.a(this.a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC4121i3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC4121i3.this.E.entrySet()) {
                    if (!this.a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC4121i3.this.i(this.a)) {
                if (AbstractC4121i3.this.h(this.a) && !AbstractC4121i3.this.e(this.a)) {
                    this.a.a("sessionDepth", Integer.valueOf(AbstractC4121i3.this.c(this.a)));
                }
                if (AbstractC4121i3.this.j(this.a)) {
                    AbstractC4121i3.this.f(this.a);
                }
                long a3 = AbstractC4121i3.this.u.a();
                if (a3 > 0) {
                    this.a.a("firstSessionTimestamp", Long.valueOf(a3));
                }
                IronLog.EVENT.verbose(this.a.toString());
                AbstractC4121i3.this.r.add(this.a);
                AbstractC4121i3.this.t++;
            }
            AbstractC4121i3 abstractC4121i3 = AbstractC4121i3.this;
            boolean a4 = abstractC4121i3.a(abstractC4121i3.B);
            AbstractC4121i3 abstractC4121i32 = AbstractC4121i3.this;
            C4355v5 c4355v52 = this.a;
            boolean a5 = a4 ? abstractC4121i32.a(c4355v52.c(), AbstractC4121i3.this.B) : abstractC4121i32.d(c4355v52);
            AbstractC4121i3 abstractC4121i33 = AbstractC4121i3.this;
            if (!abstractC4121i33.m && a5) {
                abstractC4121i33.m = true;
            }
            if (abstractC4121i33.p != null) {
                boolean g = abstractC4121i33.g();
                AbstractC4121i3 abstractC4121i34 = AbstractC4121i3.this;
                if (g) {
                    abstractC4121i34.f();
                } else if (abstractC4121i34.b((ArrayList<C4355v5>) abstractC4121i34.r) || a5) {
                    AbstractC4121i3.this.a();
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4121i3.this.f();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i3$e */
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

    private void a(JSONObject jSONObject) {
        try {
            C3959aa c3959aa = this.L;
            if (c3959aa != null) {
                if (c3959aa.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C3959aa.n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            Ue ue = this.M;
            if (ue != null) {
                String b2 = ue.b();
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
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    private void b(String str) {
        AbstractC4045e abstractC4045e = this.q;
        if (abstractC4045e == null || !abstractC4045e.c().equals(str)) {
            this.q = D5.a(str, this.G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<C4355v5> a2;
        try {
            this.m = false;
            ArrayList<C4355v5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    a2 = this.p.a(this.I);
                    this.p.b(this.I);
                }
                A5.c cVar = new A5.c(new A5.a(a2, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                C4157k4.d().a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                JSONObject b2 = I6.a().b();
                try {
                    a(b2);
                    String b3 = b();
                    if (!TextUtils.isEmpty(b3)) {
                        b2.put("abt", b3);
                    }
                    String j = com.ironsource.mediationsdk.p.g().j();
                    if (!TextUtils.isEmpty(j)) {
                        b2.put(L6.b1, j);
                    }
                    Map<String, String> c2 = c();
                    if (!c2.isEmpty()) {
                        for (Map.Entry<String, String> entry : c2.entrySet()) {
                            if (!b2.has(entry.getKey())) {
                                b2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject a3 = new F5().a();
                    Iterator<String> keys = a3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b2.put(next, a3.get(next));
                    }
                } catch (Throwable th2) {
                    C4157k4.d().a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String a4 = this.q.a(arrayList, b2);
                if (TextUtils.isEmpty(a4)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.l && a(arrayList, EnumC4373w5.FIRST_INSTANCE.b())) {
                    IronLog.INTERNAL.verbose("events data: " + a4);
                    O = true;
                }
                if (this.n) {
                    try {
                        a4 = Base64.encodeToString(Q9.a(a4, this.o), 0);
                    } catch (Exception e2) {
                        C4157k4.d().a(e2);
                    }
                }
                Hf.a.b(new G5(new c(), a4, this.q.b(), arrayList));
            }
        } catch (Throwable th3) {
            C4157k4.d().a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C4355v5 c4355v5) {
        if (c4355v5 == null) {
            return false;
        }
        if (a(this.z)) {
            return !a(c4355v5.c(), this.z);
        }
        if (a(this.A)) {
            return a(c4355v5.c(), this.A);
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ boolean q(AbstractC4121i3 abstractC4121i3, C4355v5 c4355v5, String str) {
        return abstractC4121i3.a(str, c4355v5);
    }

    public abstract int c(C4355v5 c4355v5);

    @Override // com.ironsource.InterfaceC4411y7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    public abstract void d();

    @Override // com.ironsource.InterfaceC4411y7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    public abstract boolean d(C4355v5 c4355v5);

    public abstract String e(int i);

    public void e() {
        this.r = new ArrayList<>();
        this.t = 0;
        this.q = D5.a(this.H, this.G);
        HandlerThreadC4409y5 handlerThreadC4409y5 = new HandlerThreadC4409y5(mz1.o(new StringBuilder(), this.I, "EventThread"));
        this.K = handlerThreadC4409y5;
        handlerThreadC4409y5.start();
        this.K.a();
        this.u = Ib.a0().m();
        this.J = new HashSet();
        d();
    }

    public abstract void f(C4355v5 c4355v5);

    public boolean g(C4355v5 c4355v5) {
        return (c4355v5.c() == EnumC4373w5.CONSENT_TRUE_CODE.b() || c4355v5.c() == EnumC4373w5.CONSENT_FALSE_CODE.b() || c4355v5.c() == EnumC4373w5.SET_META_DATA.b() || c4355v5.c() == EnumC4373w5.SET_META_DATA_AFTER_INIT.b() || c4355v5.c() == EnumC4373w5.SET_USER_ID.b()) ? false : true;
    }

    public boolean h(C4355v5 c4355v5) {
        return (c4355v5.c() == EnumC4373w5.FIRST_INSTANCE.b() || c4355v5.c() == EnumC4373w5.FIRST_INSTANCE_RESULT.b() || c4355v5.c() == EnumC4373w5.INIT_COMPLETE.b() || c4355v5.c() == EnumC4373w5.SDK_INIT_FAILED.b() || c4355v5.c() == EnumC4373w5.SDK_INIT_SUCCESS.b() || c4355v5.c() == EnumC4373w5.USING_CACHE_FOR_INIT_EVENT.b() || c4355v5.c() == EnumC4373w5.CONSENT_TRUE_CODE.b() || c4355v5.c() == EnumC4373w5.CONSENT_FALSE_CODE.b() || c4355v5.c() == EnumC4373w5.SET_META_DATA.b() || c4355v5.c() == EnumC4373w5.SET_META_DATA_AFTER_INIT.b() || c4355v5.c() == EnumC4373w5.SET_USER_ID.b()) ? false : true;
    }

    public abstract boolean j(C4355v5 c4355v5);

    @Override // com.ironsource.InterfaceC4411y7
    public void d(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void c(int i) {
        this.o = i;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public Map<String, String> c() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C4355v5 c4355v5) {
        return c4355v5.c() + 90000;
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void b(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void b(int[] iArr, Context context) {
        this.z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC4045e abstractC4045e = this.q;
        if (abstractC4045e != null) {
            abstractC4045e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void b(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C4355v5> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    public String b() {
        return this.F;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.i3$c */
    public class c implements InterfaceC4429z7 {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(InterfaceC4429z7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC4121i3 abstractC4121i3 = AbstractC4121i3.this;
                    ArrayList<C4355v5> a = abstractC4121i3.p.a(abstractC4121i3.I);
                    AbstractC4121i3.this.t = a.size() + AbstractC4121i3.this.r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC4121i3.this.a(AbstractC4121i3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e) {
                C4157k4.d().a(e);
            }
            a(aVar.b());
        }

        public void a(ArrayList<C4355v5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C4157k4.d().a(e);
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.ironsource.InterfaceC4429z7
        public synchronized void a(InterfaceC4429z7.a aVar) {
            AbstractC4121i3.this.K.a(new hh(3, this, aVar));
        }
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C4355v5 c4355v5) {
        JSONObject b2 = c4355v5.b();
        if (b2 == null) {
            return false;
        }
        return b2.has("sessionDepth");
    }

    public void h() {
        this.K.a(new d());
    }

    public synchronized void a(Context context, C3959aa c3959aa) {
        String a2 = IronSourceUtils.a(context, this.I, this.H);
        this.H = a2;
        b(a2);
        this.q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.p = C4426z4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c3959aa;
        this.v = context;
    }

    public synchronized void a(Ue ue) {
        this.M = ue;
    }

    private synchronized boolean a(String str, C4355v5 c4355v5) {
        boolean contains;
        try {
            if (!str.equalsIgnoreCase("none")) {
                return false;
            }
            if (a(this.C)) {
                contains = a(c4355v5.c(), this.C);
            } else {
                contains = this.J.contains(Integer.valueOf(c4355v5.c()));
            }
            return contains;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC4411y7
    public synchronized void a(C4355v5 c4355v5) {
        a(c4355v5, (IronSource.a) null);
    }

    public synchronized void a(C4355v5 c4355v5, @Nullable IronSource.a aVar) {
        if (c4355v5 != null) {
            if (this.s) {
                this.K.a(new b(c4355v5, aVar));
            }
        }
    }

    private boolean a(ArrayList<C4355v5> arrayList, int i) {
        Iterator<C4355v5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C4355v5> a(ArrayList<C4355v5> arrayList, String str) {
        String a2 = a(str, 1024);
        Iterator<C4355v5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(a2);
        }
        return arrayList;
    }

    public void a(ArrayList<C4355v5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void a(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.InterfaceC4411y7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.InterfaceC4411y7
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

    private void a(C4355v5 c4355v5, String str, int i) {
        JSONObject b2 = c4355v5.b();
        if (b2 == null || !b2.has(str)) {
            return;
        }
        try {
            c4355v5.a(str, a(b2.optString(str, null), i));
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public String a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C4355v5 c4355v5, String str) {
        a(c4355v5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, @Nullable IronSource.a aVar) {
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

    public void a(C3959aa c3959aa) {
        this.L = c3959aa;
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }

    public int f(int i) {
        return a(i, (IronSource.a) null);
    }
}
