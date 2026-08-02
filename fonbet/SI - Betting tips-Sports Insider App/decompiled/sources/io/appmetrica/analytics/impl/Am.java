package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Am {

    /* renamed from: a, reason: collision with root package name */
    public final Bm f12010a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f12011b;

    public Am(@NotNull Bm bm) {
        this.f12010a = bm;
    }

    @NotNull
    public final Context b() {
        return this.f12010a.f12071a;
    }

    @Nullable
    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f12011b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C0058bm d10 = d();
                    Vd vd2 = Vd.f13036a;
                    Xl xl = new Xl(new C0179ge(), C0353na.I.p());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d10);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C0398p5(this.f12010a.f12071a), new AllHostsExponentialBackoffPolicy(Vd.f13036a.a(Td.STARTUP)), new C0639ym(this, new Rl(), new FullUrlFormer(xl, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), kotlin.collections.e0.f19204a, Vd.f13038c);
                        this.f12011b = networkTask2;
                        networkTask = networkTask2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @NotNull
    public final C0058bm d() {
        return (C0058bm) this.f12010a.f12081l.a();
    }

    @NotNull
    public final C0161fm e() {
        C0161fm c0161fm;
        Il il = this.f12010a.f12081l;
        synchronized (il) {
            c0161fm = il.f14397c.f12506a;
        }
        return c0161fm;
    }

    public final void f() {
        C0161fm c0161fm;
        Il il = this.f12010a.f12081l;
        synchronized (il) {
            c0161fm = il.f14397c.f12506a;
        }
        C0264jm c0264jm = c0161fm.f13755c;
        C0238im a7 = c0264jm.a(c0264jm.f14067m);
        String str = c0161fm.f13753a;
        String str2 = c0161fm.f13754b;
        po poVar = this.f12010a.f12083n;
        String str3 = c0161fm.f13756d;
        poVar.getClass();
        if (!po.a(str3)) {
            a7.f13956a = this.f12010a.f12082m.a().f15009id;
        }
        String str4 = c0161fm.f13753a;
        if (str4 == null || str4.length() == 0) {
            str = this.f12010a.f12078h.a();
            str2 = "";
        }
        List<String> list = this.f12010a.f12073c.f13320e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a7.f13962g = list;
        C0161fm c0161fm2 = new C0161fm(str, str2, new C0264jm(a7));
        b(c0161fm2);
        a(c0161fm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:9:0x0010, B:11:0x001b, B:16:0x0035, B:18:0x003d, B:20:0x0045, B:23:0x004e), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z5;
        try {
            boolean z7 = false;
            if (C0353na.I.h().isRestrictedForSdk()) {
                return false;
            }
            C0161fm e7 = e();
            Set set = AbstractC0084cm.f13542a;
            boolean z10 = true;
            if (!e7.f13773w) {
                if (AbstractC0084cm.f13543b.currentTimeSeconds() <= e7.f13766o + e7.f13776z.f12119a) {
                    z5 = false;
                    if (!z5) {
                        if (AbstractC0084cm.a(e7.f13756d) && AbstractC0084cm.a(e7.f13753a) && AbstractC0084cm.a(e7.f13754b)) {
                            z7 = true;
                        }
                        z5 = !z7;
                        C3 c32 = this.f12010a.f12080k;
                        Map map = d().f13467h;
                        C0645z3 c0645z3 = this.f12010a.j;
                        c32.getClass();
                        boolean a7 = C3.a(map, e7, c0645z3);
                        if (z7) {
                        }
                    }
                    z10 = z5;
                    return z10;
                }
            }
            z5 = true;
            if (!z5) {
            }
            z10 = z5;
            return z10;
        } finally {
        }
    }

    public final synchronized void h() {
        this.f12011b = null;
    }

    @NotNull
    public final Q4 a() {
        return this.f12010a.f12076f;
    }

    public final synchronized void b(C0161fm c0161fm) {
        this.f12010a.f12081l.a(c0161fm);
        C0135em c0135em = this.f12010a.f12077g;
        c0135em.f13708b.a(c0161fm.f13753a);
        c0135em.f13708b.b(c0161fm.f13754b);
        c0135em.f13707a.save(c0161fm.f13755c);
        this.f12010a.f12075e.a(c0161fm);
    }

    public final synchronized boolean a(@Nullable List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC0084cm.a(e(), list, map, new C0664zm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0161fm a(@NotNull C0110dm c0110dm, @NotNull C0058bm c0058bm, long j) {
        String str;
        boolean equals;
        String a7 = Fm.a(c0058bm.f13467h);
        Map map = c0058bm.f13468i.f14541a;
        String str2 = c0110dm.j;
        String str3 = e().f13762k;
        if (!Fm.a(Fm.a(str2))) {
            str2 = Fm.a(Fm.a(str3)) ? str3 : null;
        }
        String str4 = e().f13753a;
        if (str4 != null) {
            str = StringsKt.H(str4) ? null : str4;
        }
        str = c0110dm.f13606h;
        C0238im c0238im = new C0238im(c0110dm.f13600b);
        String str5 = c0110dm.f13607i;
        c0238im.f13969o = this.f12010a.f12079i.currentTimeSeconds();
        c0238im.f13956a = e().f13756d;
        c0238im.f13958c = c0110dm.f13602d;
        c0238im.f13961f = c0110dm.f13601c;
        c0238im.f13962g = c0058bm.f13464e;
        c0238im.f13957b = c0110dm.f13603e;
        c0238im.f13959d = c0110dm.f13604f;
        c0238im.f13960e = c0110dm.f13605g;
        c0238im.f13963h = c0110dm.f13611n;
        c0238im.f13964i = c0110dm.f13612o;
        c0238im.j = str2;
        c0238im.f13965k = a7;
        this.f12010a.f12080k.getClass();
        HashMap a10 = Fm.a(str2);
        if (lo.a(map)) {
            equals = lo.a((Map) a10);
        } else {
            equals = a10.equals(map);
        }
        c0238im.q = equals;
        c0238im.f13966l = Fm.a(map);
        c0238im.f13971r = c0110dm.f13610m;
        c0238im.f13968n = c0110dm.f13608k;
        c0238im.f13972s = c0110dm.f13613p;
        c0238im.f13970p = true;
        c0238im.f13973t = j;
        C0058bm d10 = d();
        if (d10.f13472n == 0) {
            d10.f13472n = j;
        }
        c0238im.f13974u = d10.f13472n;
        c0238im.f13975v = false;
        c0238im.f13976w = c0110dm.q;
        c0238im.f13977x = c0110dm.f13614r;
        c0238im.f13978y = c0110dm.f13615s;
        c0238im.f13979z = c0110dm.f13616t;
        c0238im.A = c0110dm.f13617u;
        c0238im.B = c0110dm.f13618v;
        return new C0161fm(str, str5, new C0264jm(c0238im));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull C0110dm c0110dm, @NotNull C0058bm c0058bm, @Nullable Map<String, ? extends List<String>> map) {
        Long l6;
        C0161fm a7;
        synchronized (this) {
            if (!lo.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!lo.a((Collection) list)) {
                    try {
                        l6 = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l6 == null ? l6.longValue() : 0L;
                    Wj.f13112a.a(longValue, c0110dm.f13609l);
                    a7 = a(c0110dm, c0058bm, longValue);
                    h();
                    b(a7);
                    Unit unit = Unit.f19194a;
                }
            }
            l6 = null;
            if (l6 == null) {
            }
            Wj.f13112a.a(longValue, c0110dm.f13609l);
            a7 = a(c0110dm, c0058bm, longValue);
            h();
            b(a7);
            Unit unit2 = Unit.f19194a;
        }
        a(a7);
    }

    public final void a(C0161fm c0161fm) {
        ArrayList arrayList;
        Bm bm = this.f12010a;
        Fl fl = bm.f12074d;
        String str = bm.f12072b;
        synchronized (fl.f12239a.f12328b) {
            try {
                Hl hl = fl.f12239a;
                hl.f12329c = c0161fm;
                Collection collection = (Collection) hl.f12327a.f14468a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ql) it.next()).a(c0161fm);
        }
    }

    public final void a(@NotNull Jl jl) {
        synchronized (this) {
            this.f12011b = null;
        }
        Bm bm = this.f12010a;
        bm.f12074d.a(bm.f12076f.f12770a, jl, e());
    }

    public final synchronized void a(@NotNull Zl zl) {
        try {
            this.f12010a.f12081l.a(zl);
            C0058bm d10 = d();
            if (d10.f13469k) {
                List list = d10.j;
                if (list != null && !list.isEmpty()) {
                    if (!lo.a(list, d10.f13464e)) {
                        C0161fm e7 = e();
                        C0264jm c0264jm = e7.f13755c;
                        C0238im a7 = c0264jm.a(c0264jm.f14067m);
                        String str = e7.f13753a;
                        String str2 = e7.f13754b;
                        a7.f13962g = list;
                        C0161fm c0161fm = new C0161fm(str, str2, new C0264jm(a7));
                        b(c0161fm);
                        a(c0161fm);
                    }
                }
                if (d10.f13464e != null && (!r5.isEmpty())) {
                    C0161fm e9 = e();
                    C0264jm c0264jm2 = e9.f13755c;
                    C0238im a10 = c0264jm2.a(c0264jm2.f14067m);
                    String str3 = e9.f13753a;
                    String str4 = e9.f13754b;
                    a10.f13962g = null;
                    C0161fm c0161fm2 = new C0161fm(str3, str4, new C0264jm(a10));
                    b(c0161fm2);
                    a(c0161fm2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
