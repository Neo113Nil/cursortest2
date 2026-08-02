package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.o1;
import com.my.tracker.obfuscated.s0;
import com.my.tracker.obfuscated.y2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import xsna.d7n;
import xsna.df6;
import xsna.fs2;
import xsna.hc3;
import xsna.i73;
import xsna.j9p;
import xsna.li0;
import xsna.ls80;
import xsna.v4h0;
import xsna.vr2;
import xsna.vyx;
import xsna.xft0;

/* loaded from: classes.dex */
public final class e0 {
    public static final DecimalFormat l;
    final y2 b;
    final Context c;
    final b d;
    f1 h;
    final Map a = new HashMap();
    protected boolean e = false;
    protected b3 f = b3.j;
    protected String g = "";
    private final q i = new q(65536);
    final g1 j = g1.b();
    long k = 0;

    public interface a {
        void b(List list);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public interface c {
        void a(List list);
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        l = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private e0(y2 y2Var, b bVar, Context context) {
        this.b = y2Var;
        this.d = bVar;
        this.c = context.getApplicationContext();
    }

    public static e0 a(y2 y2Var, b bVar, Context context) {
        return new e0(y2Var, bVar, context);
    }

    public static boolean b(Map map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (c((String) entry.getKey()) || c((String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        x2.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (a(this.h)) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.h != null) {
            x2.b("EventTracker error: tracker has already been initialized");
            return;
        }
        d1 a2 = d1.a(this.b.g(), this.c);
        if (a2 == null) {
            return;
        }
        f1 a3 = f1.a(a2);
        this.h = a3;
        if (a(a3)) {
            return;
        }
        this.k = p1.a(this.c).l();
        this.b.m().a(new s() { // from class: xsna.xsy0
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                com.my.tracker.obfuscated.e0.this.a((com.my.tracker.obfuscated.b3) obj);
            }
        }, new s() { // from class: xsna.ysy0
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                com.my.tracker.obfuscated.e0.this.c((com.my.tracker.obfuscated.b3) obj);
            }
        });
        b();
    }

    public void d() {
        a(new vyx(this, 1));
    }

    public void g() {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.qsy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(a2);
            }
        });
    }

    public static boolean a(f1 f1Var) {
        if (f1Var != null) {
            return false;
        }
        x2.b("EventTracker error: repository is null");
        return true;
    }

    public void d(Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.vsy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.b(a3, a2);
            }
        });
    }

    private static Map a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    public void b(final String str, final String str2, Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.usy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.b(a3, str, str2, a2);
            }
        });
    }

    public void c(Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.cty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(a3, a2);
            }
        });
    }

    private static void a(Runnable runnable) {
        m.a(runnable);
    }

    private static int a(r1 r1Var, f1 f1Var, y2.a aVar, boolean z, b3 b3Var, String str, g1 g1Var, String str2, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        if (!f1Var.j()) {
            return 3;
        }
        long i = f1Var.i();
        x1 b2 = f1Var.b();
        z1 c2 = f1Var.c();
        return g1Var.a(r1Var, aVar, z, b3Var, str, g0.a().a(aVar.m, aVar.g, aVar.e, z, str2, okHttpClientProvider, context), i, f1Var.f(), b2, c2);
    }

    public void d(final String str) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.wsy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(str, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j) {
        byte[] b2;
        if (a(this.h) || b(map) || (b2 = this.j.b(this.e, str, str2, map)) == null || !this.h.r(b2, j)) {
            return;
        }
        b();
    }

    public void c(List list) {
        a(new hc3(12, this, list));
    }

    public void c(final float f) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: xsna.jty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.c(currentTimeMillis, f);
            }
        });
    }

    public void d(List list) {
        a(new df6(10, this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j, float f) {
        if (a(this.h) || a(29, j)) {
            return;
        }
        long b2 = v2.b(j);
        byte[] c2 = this.j.c((long) (f * 1000.0f));
        if (c2 != null) {
            this.h.p(c2, b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, long j) {
        byte[] b2;
        if (a(this.h) || b(map) || (b2 = this.j.b(map)) == null || !this.h.k(b2, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        this.f = b3Var;
    }

    public void a() {
        a(new fs2(this, 21));
    }

    public void c(Boolean bool) {
        a(new li0(10, this, bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b3 b3Var) {
        a(new i73(9, this, b3Var));
    }

    public void a(final String str, Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.dty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(str, a3, a2);
            }
        });
    }

    public void c() {
        if (a(this.h)) {
            return;
        }
        this.d.a();
        if (!s0.a(this.c)) {
            x2.a("MyTrackerRepository: no network connection");
            return;
        }
        String a2 = a(this.e, this.f, this.g, this.h);
        if (a2 != null) {
            this.d.a(a2);
        }
        b(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, long j) {
        byte[] a2;
        if (a(this.h) || c(str) || b(map) || (a2 = this.j.a(str, map)) == null || !this.h.d(a2, j)) {
            return;
        }
        b();
    }

    public void b(final String str, final String str2, final long j, final long j2) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.ssy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.b(str, str2, j, j2, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j, long j2, long j3) {
        byte[] b2;
        if (a(this.h) || (b2 = this.j.b(str, str2, j, j2)) == null || !this.h.h(b2, j3)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j) {
        if (a(this.h)) {
            return;
        }
        boolean a2 = this.h.a(j, p1.a(this.c).n());
        if (this.h.b(j)) {
            a2 = true;
        }
        if (a2) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (a(this.h)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            a(o0Var.e(), o0Var.d(), o0Var.a(), (Map) null, o0Var.f());
            this.h.b(o0Var);
        }
        b();
    }

    public void a(final String str, final String str2, Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.kty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(a3, str, str2, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j) {
        byte[] a2;
        if (a(this.h) || b(map) || (a2 = this.j.a(this.e, str, str2, map)) == null || !this.h.m(a2, j)) {
            return;
        }
        b();
    }

    public void b(final float f, final float f2, final float f3) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: xsna.hty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.b(currentTimeMillis, f, f2, f3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j, float f, float f2, float f3) {
        if (a(this.h) || a(26, j)) {
            return;
        }
        long b2 = v2.b(j);
        byte[] b3 = this.j.b((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f));
        if (b3 != null) {
            this.h.n(b3, b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, long j) {
        byte[] a2;
        if (a(this.h) || b(map) || (a2 = this.j.a(map)) == null || !this.h.j(a2, j)) {
            return;
        }
        b();
    }

    public void b(final float f) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: xsna.ity0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.b(currentTimeMillis, f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j, float f) {
        if (a(this.h) || a(28, j)) {
            return;
        }
        long b2 = v2.b(j);
        byte[] b3 = this.j.b((long) (f * 1000.0f));
        if (b3 != null) {
            this.h.o(b3, b2);
        }
    }

    public void a(final int i, Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.tsy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(a3, i, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i, long j) {
        byte[] a2;
        if (a(this.h) || b(map) || (a2 = this.j.a(i, map)) == null || !this.h.k(a2, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar) {
        if (a(this.h)) {
            cVar.a(Collections.EMPTY_LIST);
        } else {
            cVar.a(this.h.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        if (a(this.h)) {
            aVar.b(Collections.EMPTY_LIST);
        } else {
            aVar.b(this.h.e());
        }
    }

    public void a(final long j, final String str, final o1.a aVar) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.nty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(j, str, aVar, a2);
            }
        });
    }

    public void b(Boolean bool) {
        this.e = bool.booleanValue();
    }

    public void b(String str) {
        a(new d7n(6, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, String str, o1.a aVar, long j2) {
        byte[] a2;
        if (a(this.h) || (a2 = this.j.a(j, str, aVar)) == null || !this.h.i(a2, j2)) {
            return;
        }
        p1.a(this.c).c(j2);
        this.k = j2;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b3 b3Var) {
        x2.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(b3Var.g));
        if (l.a(this.f.g, b3Var.g) != 0 && !a(this.h)) {
            b(this.e, this.f, this.g, this.h);
        }
        this.f = b3Var;
    }

    public void b(boolean z, b3 b3Var, String str, f1 f1Var) {
        x2.a("createAndStorePartialPacket: start");
        y2.a o = this.b.o();
        String h = this.b.h();
        MyTrackerConfig.OkHttpClientProvider n = this.b.n();
        this.i.a();
        int a2 = a(this.i, f1Var, o, z, b3Var, str, this.j, h, n, this.c);
        x2.a("createAndStorePartialPacket: writeResult=" + a2);
        if (a2 == 1) {
            f1Var.a();
            f1Var.a(this.i.c());
        } else if (a2 == 2) {
            f1Var.a();
        }
        this.i.d();
    }

    public void a(final String str, final String str2, final Runnable runnable) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.aty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(str, str2, a2, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j, Runnable runnable) {
        if (a(this.h)) {
            return;
        }
        byte[] b2 = this.j.b(str, str2);
        if (b2 != null && this.h.q(b2, j)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(final String str, final String str2, final long j, final long j2) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.gty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(str, str2, j, j2, a2);
            }
        });
    }

    public void b(f1 f1Var) {
        String q = this.b.q();
        MyTrackerConfig.OkHttpClientProvider n = this.b.n();
        try {
            com.my.tracker.obfuscated.b d = f1Var.d();
            try {
                if (d == null) {
                    x2.a("EventTracker error: iterator is null");
                    if (d == null) {
                        return;
                    }
                } else {
                    while (d.b()) {
                        long a2 = d.a();
                        byte[] i = d.i();
                        this.i.a();
                        this.i.b(i);
                        s0.b a3 = a(q, n, this.i);
                        if (a3 == null || !a3.c()) {
                            break;
                        }
                        String str = (String) a3.b();
                        if (!TextUtils.isEmpty(str)) {
                            this.d.a(str);
                        }
                        f1Var.a(a2);
                    }
                }
                d.close();
            } finally {
            }
        } catch (Throwable th) {
            x2.b("EventTracker error: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j, long j2, long j3) {
        byte[] a2;
        if (a(this.h) || (a2 = this.j.a(str, str2, j, j2)) == null || !this.h.a(a2, j3)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j) {
        byte[] a2;
        if (a(this.h) || (a2 = this.j.a(str)) == null || !this.h.b(a2, j)) {
            return;
        }
        b();
    }

    public void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.rsy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(str, str2, str3, str4, str5, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j) {
        byte[] a2;
        if (a(this.h) || (a2 = this.j.a(str, str2, str3, str4, str5)) == null || !this.h.s(a2, j)) {
            return;
        }
        p1.a(this.c).c(j);
        this.k = j;
        b();
    }

    public void b() {
        int f;
        if (a(this.h)) {
            return;
        }
        if (this.h.h() != 0 || ((f = this.b.f()) > 0 && v2.a() - this.k <= f)) {
            c();
        }
    }

    public void a(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.lty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(a3, jSONObject, jSONObject2, str, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        if (a(this.h) || b(map) || !a(jSONObject, jSONObject2, str, map, j)) {
            return;
        }
        b();
    }

    public void a(final JSONObject jSONObject, final String str, final String str2, final String str3, Map map) {
        final long a2 = v2.a();
        final Map a3 = a(map);
        a(new Runnable() { // from class: xsna.zsy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(a3, jSONObject, str, str2, str3, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, String str2, String str3, long j) {
        if (a(this.h) || b(map) || !a(jSONObject, str, str2, str3, map, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        String str;
        if (a(this.h)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            try {
                str = fVar.e().toString();
            } catch (Throwable th) {
                x2.a("Error: purchase data: ", th);
                str = null;
            }
            a(fVar.d(), str, fVar.a(), fVar.f(), (Map) null, fVar.h());
            this.h.b(fVar);
        }
        b();
    }

    public void a(final String str, final String str2) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.mty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(str, str2, a2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j) {
        byte[] a2;
        if (a(this.h) || (a2 = this.j.a(str, str2)) == null || !this.h.e(a2, j)) {
            return;
        }
        b();
    }

    public void a(final int i, final byte[] bArr, final boolean z, final boolean z2, final Runnable runnable) {
        final long a2 = v2.a();
        a(new Runnable() { // from class: xsna.fty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(i, bArr, z, z2, a2, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, byte[] bArr, boolean z, boolean z2, long j, Runnable runnable) {
        if (!a(this.h) && this.h.a(i, bArr, z, z2, j)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(AdEvent adEvent) {
        a(new xft0(v2.a(), this, adEvent, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEvent adEvent, long j) {
        byte[] a2;
        if (a(this.h) || (a2 = this.j.a(adEvent, l.format(adEvent.revenue))) == null || !this.h.a(adEvent.a, a2, j)) {
            return;
        }
        b();
    }

    public void a(MiniAppEvent miniAppEvent) {
        a(new j9p(v2.a(), this, miniAppEvent, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j) {
        String str;
        Map<String, String> map;
        if (a(this.h) || c(miniAppEvent.name) || b(miniAppEvent.eventParams)) {
            return;
        }
        int i = miniAppEvent.a;
        String str2 = (i == 24 || i == 22 || i == 23) ? miniAppEvent.customUserId : null;
        if (i == 24) {
            str = miniAppEvent.name;
            map = miniAppEvent.eventParams;
        } else {
            str = null;
            map = null;
        }
        byte[] a2 = this.j.a(i, str2, miniAppEvent.miniAppId, str, miniAppEvent.platformUserId, i == 20 ? miniAppEvent.query : null, map);
        if (a2 == null || !this.h.b(i, a2, j)) {
            return;
        }
        b();
    }

    public void a(final float f) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: xsna.bty0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(currentTimeMillis, f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, float f) {
        if (a(this.h) || a(25, j)) {
            return;
        }
        long b2 = v2.b(j);
        byte[] a2 = this.j.a((long) (f * 1000.0f));
        if (a2 != null) {
            this.h.l(a2, b2);
        }
    }

    public void a(final float f, final float f2, final float f3) {
        final long currentTimeMillis = System.currentTimeMillis();
        a(new Runnable() { // from class: xsna.psy0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.a(currentTimeMillis, f, f2, f3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, float f, float f2, float f3) {
        if (a(this.h) || a(27, j)) {
            return;
        }
        long b2 = v2.b(j);
        byte[] a2 = this.j.a((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f));
        if (a2 != null) {
            this.h.g(a2, b2);
        }
    }

    public void a(List list, c cVar) {
        a(new v4h0(this, cVar, list, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, List list) {
        if (a(this.h)) {
            cVar.a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.h.a((o0) it.next());
        }
        cVar.a(list);
    }

    public void a(List list, a aVar) {
        a(new ls80(this, aVar, list, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, List list) {
        if (a(this.h)) {
            aVar.b(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.h.a((f) it.next());
        }
        aVar.b(list);
    }

    public void a(final c cVar) {
        a(new Runnable() { // from class: xsna.ety0
            @Override // java.lang.Runnable
            public final void run() {
                com.my.tracker.obfuscated.e0.this.b(cVar);
            }
        });
    }

    public void a(a aVar) {
        a(new vr2(10, this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        x2.a("updateKidMode: newKidMode=" + bool);
        if (bool.booleanValue() == this.e) {
            return;
        }
        if (!a(this.h)) {
            b(this.e, this.f, this.g, this.h);
        }
        this.e = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        x2.a("setRemoteConfig: remoteConfig=" + str);
        if (this.g.equals(str)) {
            return;
        }
        if (!a(this.h)) {
            b(this.e, this.f, this.g, this.h);
        }
        this.g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(boolean z, b3 b3Var, String str, f1 f1Var) {
        String str2;
        s0.b a2;
        y2.a o = this.b.o();
        String q = this.b.q();
        String h = this.b.h();
        MyTrackerConfig.OkHttpClientProvider n = this.b.n();
        this.i.a();
        if (a(this.i, f1Var, o, z, b3Var, str, this.j, h, n, this.c) == 1 && (a2 = a(q, n, this.i)) != null) {
            if (a2.c()) {
                x2.a("Events were sent successfully");
                f1Var.a();
            }
            str2 = (String) a2.b();
        }
        str2 = null;
        this.i.d();
        return str2;
    }

    private s0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, q qVar) {
        if (this.j.a(qVar, v2.a())) {
            return s0.a(new r(qVar), okHttpClientProvider, true).a(str);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|4)|(11:28|29|30|7|8|9|10|11|12|13|(1:21)(1:19))|6|7|8|9|10|11|12|13|(1:15)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        com.my.tracker.obfuscated.x2.a("Error: wrong currency in sku details: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        com.my.tracker.obfuscated.x2.a("Error: wrong price in micros in sku details: ", r0);
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map, long j) {
        String str2;
        String jSONObject3;
        f1 f1Var;
        String str3 = null;
        try {
            str2 = jSONObject2.toString();
        } catch (Throwable th) {
            x2.a("Error: can't convert purchaseData json to string", th);
            str2 = null;
        }
        if (jSONObject != null) {
            try {
                jSONObject3 = jSONObject.toString();
            } catch (Throwable th2) {
                x2.a("Error: can't convert skuDetails json to string", th2);
            }
            String str4 = l.format(Double.parseDouble(jSONObject.optString("price_amount_micros")) / 1000000.0d);
            str3 = jSONObject.optString("price_currency_code");
            byte[] a2 = this.j.a(str, str2, jSONObject3, str4, str3, map);
            return a2 == null && (f1Var = this.h) != null && f1Var.f(a2, j);
        }
        jSONObject3 = null;
        String str42 = l.format(Double.parseDouble(jSONObject.optString("price_amount_micros")) / 1000000.0d);
        str3 = jSONObject.optString("price_currency_code");
        byte[] a22 = this.j.a(str, str2, jSONObject3, str42, str3, map);
        if (a22 == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:12|(8:31|32|33|15|16|17|18|(1:25)(1:24))|14|15|16|17|18|(2:20|26)(1:27)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        com.my.tracker.obfuscated.x2.a("Error: wrong price in micros in sku details: ", r0);
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(JSONObject jSONObject, String str, String str2, String str3, Map map, long j) {
        String str4;
        if (str == null) {
            x2.a("Error: empty data " + str);
            return false;
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(str).optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
                x2.a("Error: empty productId in data ".concat(str));
                return false;
            }
            String str5 = null;
            if (jSONObject != null) {
                try {
                    str4 = null;
                    str5 = jSONObject.toString();
                } catch (Throwable th) {
                    x2.a("Error: can't convert productInfo json to string", th);
                }
                String str6 = String.valueOf(jSONObject.optDouble("microsPrice") / 1000000.0d);
                byte[] a2 = this.j.a(str5, str, str2, str3, 0, str6, jSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY), map);
                return a2 == null ? false : false;
            }
            str4 = null;
            String str62 = String.valueOf(jSONObject.optDouble("microsPrice") / 1000000.0d);
            byte[] a22 = this.j.a(str5, str, str2, str3, 0, str62, jSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY), map);
            return a22 == null ? false : false;
        } catch (Throwable th2) {
            x2.b("Error: creating object failed", th2);
            return false;
        }
    }

    public boolean a(int i, long j) {
        Long l2 = (Long) this.a.get(Integer.valueOf(i));
        if (l2 != null && j - l2.longValue() < 800) {
            x2.a("EventTracker: event with type " + i + " was throttled");
            return true;
        }
        this.a.put(Integer.valueOf(i), Long.valueOf(j));
        return false;
    }
}
