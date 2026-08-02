package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import com.logrocket.core.LogRocketCore;
import com.sports.insider.R;
import com.sports.insider.data.room.general.table.AccountTable;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.h5;
import io.sentry.i5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class a0 implements b3.a, io.sentry.metrics.a, aa.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f679a;

    /* renamed from: b, reason: collision with root package name */
    public Object f680b;

    /* renamed from: c, reason: collision with root package name */
    public Object f681c;

    /* renamed from: d, reason: collision with root package name */
    public Object f682d;

    /* renamed from: e, reason: collision with root package name */
    public Object f683e;

    /* renamed from: f, reason: collision with root package name */
    public Object f684f;

    /* renamed from: g, reason: collision with root package name */
    public Object f685g;

    public /* synthetic */ a0(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, int i5) {
        this.f679a = i5;
        this.f680b = viewGroup;
        this.f681c = view;
        this.f682d = view2;
        this.f683e = view3;
        this.f684f = view4;
        this.f685g = view5;
    }

    public static void C(Drawable drawable, int i5, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = b0.f701b;
        }
        mutate.setColorFilter(b0.c(i5, mode));
    }

    public static boolean l(int[] iArr, int i5) {
        for (int i10 : iArr) {
            if (i10 == i5) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList s(Context context, int i5) {
        int c2 = y3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{y3.f1012b, y3.f1014d, y3.f1013c, y3.f1016f}, new int[]{y3.b(context, R.attr.colorButtonNormal), g0.c.c(c2, i5), g0.c.c(c2, i5), i5});
    }

    public static LayerDrawable w(a3 a3Var, Context context, int i5) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i5);
        Drawable f6 = a3Var.f(context, R.drawable.abc_star_black_48dp);
        Drawable f10 = a3Var.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f6 instanceof BitmapDrawable) && f6.getIntrinsicWidth() == dimensionPixelSize && f6.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f6;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f6.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public oi.m A(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f683e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = indexOf; i5 < size; i5++) {
            oi.m b10 = ((oi.l) list.get(i5)).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((oi.l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(String str, String str2, Bundle bundle) {
        int i5;
        String str3;
        y8.f fVar;
        int a7;
        PackageInfo i10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        h8.g gVar = (h8.g) this.f680b;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f10403c.f10416b);
        androidx.core.view.f fVar2 = (androidx.core.view.f) this.f681c;
        synchronized (fVar2) {
            try {
                if (fVar2.f1311c == 0 && (i10 = fVar2.i("com.google.android.gms")) != null) {
                    fVar2.f1311c = i10.versionCode;
                }
                i5 = fVar2.f1311c;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i5));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((androidx.core.view.f) this.f681c).f());
        bundle.putString("app_ver_name", ((androidx.core.view.f) this.f681c).g());
        h8.g gVar2 = (h8.g) this.f680b;
        gVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f10402b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((b9.a) d5.a(((b9.d) ((b9.e) this.f685g)).e())).f3092a;
            if (TextUtils.isEmpty(str4)) {
                io.sentry.android.core.w0.m("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e7) {
            e = e7;
            io.sentry.android.core.w0.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) d5.a(((b9.d) ((b9.e) this.f685g)).d()));
            bundle.putString("cliv", "fcm-25.0.1");
            fVar = (y8.f) ((a9.a) this.f684f).get();
            h9.b bVar = (h9.b) ((a9.a) this.f683e).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e9) {
            e = e9;
            io.sentry.android.core.w0.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) d5.a(((b9.d) ((b9.e) this.f685g)).d()));
            bundle.putString("cliv", "fcm-25.0.1");
            fVar = (y8.f) ((a9.a) this.f684f).get();
            h9.b bVar2 = (h9.b) ((a9.a) this.f683e).get();
            if (fVar == null) {
            }
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) d5.a(((b9.d) ((b9.e) this.f685g)).d()));
        bundle.putString("cliv", "fcm-25.0.1");
        fVar = (y8.f) ((a9.a) this.f684f).get();
        h9.b bVar22 = (h9.b) ((a9.a) this.f683e).get();
        if (fVar == null || bVar22 == null || (a7 = ((y8.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(v.f.d(a7)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public synchronized void D(u9.f fVar, MotionEvent motionEvent) {
        try {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            LinkedList<View> linkedList = fVar.f24096h;
            LinkedList linkedList2 = new LinkedList();
            for (View view : linkedList) {
                if (!(view instanceof AbsListView) && !(view instanceof HorizontalScrollView) && !(view instanceof ScrollView)) {
                    Class cls = (Class) this.f684f;
                    if ((cls == null || ((Method) this.f685g) == null || !cls.isInstance(view)) ? false : true) {
                        linkedList2.add(new WeakReference(view));
                    }
                }
                linkedList2.add(new WeakReference(view));
            }
            if (!linkedList2.isEmpty()) {
                if (!((WeakHashMap) this.f681c).isEmpty()) {
                    com.logrocket.core.e0.a();
                }
                ((HashMap) this.f683e).put(Integer.valueOf(pointerId), linkedList2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Task E(String str, String str2, Bundle bundle) {
        int i5;
        try {
            B(str, str2, bundle);
            b6.b bVar = (b6.b) this.f682d;
            b6.g gVar = b6.g.f3048c;
            b6.q qVar = bVar.f3036c;
            if (qVar.b() < 12000000) {
                return qVar.c() != 0 ? bVar.a(bundle).h(gVar, new d7.e(2, bVar, bundle)) : d5.p(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            b6.p h10 = b6.p.h(bVar.f3035b);
            synchronized (h10) {
                i5 = h10.f3078a;
                h10.f3078a = i5 + 1;
            }
            return h10.i(new b6.n(i5, 1, bundle, 1)).g(gVar, b6.d.f3042b);
        } catch (InterruptedException | ExecutionException e7) {
            return d5.p(e7);
        }
    }

    public void F(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f683e;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((oi.l) list.get(i5)).getClass();
        }
    }

    public synchronized void G(MotionEvent motionEvent) {
        try {
            Deque deque = (Deque) ((HashMap) this.f683e).remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            if (deque == null) {
                return;
            }
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null && !((WeakHashMap) this.f681c).containsKey(view)) {
                    if (!(view instanceof ScrollView) && !(view instanceof HorizontalScrollView)) {
                        if (view instanceof AbsListView) {
                            ((WeakHashMap) this.f681c).put(view, new com.logrocket.core.graphics.h(0, ((AbsListView) view).getFirstVisiblePosition()));
                        } else if (e(view) == 1) {
                            ((WeakHashMap) this.f681c).put(view, new com.logrocket.core.graphics.h(0, 0));
                        }
                    }
                    ((WeakHashMap) this.f681c).put(view, new com.logrocket.core.graphics.h(view.getScrollX(), view.getScrollY()));
                }
            }
            if (!((WeakHashMap) this.f681c).isEmpty()) {
                ExecutorService executorService = com.logrocket.core.e0.f6424a;
                LogRocketCore maybeGetInstance = LogRocketCore.maybeGetInstance();
                if (maybeGetInstance != null) {
                    com.logrocket.core.x xVar = maybeGetInstance.f6386i;
                    if (xVar.f6655l.compareAndSet(false, true)) {
                        xVar.b();
                    }
                }
                if (((aa.g) this.f682d) == null) {
                    aa.g gVar = new aa.g(aa.j.a("lr-scroll-buffer"), new aa.c(15, this), null, 200, 200);
                    this.f682d = gVar;
                    gVar.c();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.sentry.metrics.a
    public void a(boolean z5) {
        com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f683e;
        if (z5) {
            y(true);
            xVar.submit(new io.sentry.android.core.f(11, this));
        } else {
            xVar.d(((b6) this.f680b).getShutdownTimeoutMillis());
            while (!((ConcurrentLinkedQueue) this.f682d).isEmpty()) {
                v();
            }
        }
    }

    @Override // io.sentry.metrics.a
    public void b(long j) {
        y(true);
        try {
            i2.d dVar = (i2.d) this.f685g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.getClass();
            ((io.sentry.transport.p) dVar.f10882b).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e7) {
            ((b6) this.f680b).getLogger().e(b5.ERROR, "Failed to flush metrics events", e7);
            Thread.currentThread().interrupt();
        }
    }

    @Override // aa.f
    public void c() {
        if (((Boolean) this.f685g).booleanValue()) {
            return;
        }
        Runtime runtime = aa.h.f103a;
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        long j6 = j - freeMemory;
        long maxMemory = runtime.maxMemory();
        if (freeMemory > 0 && j > 0 && j6 > 0) {
            String c2 = ((LogRocketCore) this.f682d).f6462a.c();
            if (((String) this.f684f) == null) {
                this.f684f = c2;
            }
            if (!c2.equals((String) this.f684f)) {
                h();
                this.f684f = c2;
            }
            long currentTimeMillis = System.currentTimeMillis();
            eh.l r5 = eh.m.r();
            r5.d();
            eh.m.q((eh.m) r5.f6816b, currentTimeMillis);
            r5.d();
            eh.m.p((eh.m) r5.f6816b, j6);
            eh.k kVar = (eh.k) this.f683e;
            kVar.d();
            eh.n.q((eh.n) kVar.f6816b, (eh.m) r5.a());
            if (((eh.n) ((eh.k) this.f683e).f6816b).s() >= 6) {
                h();
            }
        }
        double d10 = 1.0d - (j6 / maxMemory);
        StringBuilder p10 = r4.k.p(j6, "memory used: ", ", max: ");
        p10.append(maxMemory);
        p10.append(", available percent: ");
        p10.append(d10);
        String sb2 = p10.toString();
        ba.d dVar = (ba.d) this.f680b;
        dVar.h(sb2);
        if (d10 < 0.01d) {
            dVar.d("Low memory cutoff reached! Shutting down.");
            ((LogRocketCore) this.f681c).s("lowMemoryCutoffReached");
        }
    }

    @Override // aa.f
    public void d() {
        this.f685g = Boolean.TRUE;
        eh.k kVar = (eh.k) this.f683e;
        kVar.d();
        eh.n.p((eh.n) kVar.f6816b);
    }

    public int e(View view) {
        Method method = (Method) this.f685g;
        Class cls = (Class) this.f684f;
        if (cls == null || method == null || !cls.isInstance(view)) {
            return -1;
        }
        try {
            return ((Integer) method.invoke(view, null)).intValue() == 0 ? 0 : 1;
        } catch (Throwable th2) {
            ((ba.d) this.f680b).e("Invoking getScrollState method failed", th2);
            return -1;
        }
    }

    public wg.t f(String str, Map map, Boolean bool) {
        HashSet hashSet = (HashSet) this.f680b;
        ba.d dVar = (ba.d) this.f685g;
        int intValue = ((Integer) this.f684f).intValue() + 1;
        this.f684f = Integer.valueOf(intValue);
        if (intValue > 10) {
            LogRocketCore.k("Max identify calls reached");
            return null;
        }
        if (intValue == 10) {
            dVar.j("More than 10identify calls on this page. Ignoring future calls.");
        }
        if (str.length() > 1024) {
            LogRocketCore.k("Too large userID passed to identify() (max 1024 characters)");
            dVar.d("Too large userID passed to identify() (max 1024 characters)");
            return null;
        }
        wg.t v5 = wg.v.v();
        v5.d();
        wg.v.p((wg.v) v5.f6816b, str);
        boolean booleanValue = bool.booleanValue();
        v5.d();
        wg.v.q((wg.v) v5.f6816b, booleanValue);
        boolean z5 = !hashSet.isEmpty() && hashSet.contains(str);
        v5.d();
        wg.v.s((wg.v) v5.f6816b, z5);
        if (bool.booleanValue()) {
            this.f682d = y9.d.ANONYMOUS;
        } else {
            hashSet.add(str);
            this.f681c = str;
            this.f682d = y9.d.IDENTIFIED;
            this.f683e = map;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (str3.length() > 1024) {
                    dVar.j("Ignoring large user trait value for key " + str2 + " (max 1024 characters)");
                    Map map2 = (Map) this.f683e;
                    if (map2 != null) {
                        map2.remove(str2);
                    }
                } else if (str2.getBytes(StandardCharsets.UTF_8).length > 128) {
                    dVar.j("Ignoring large user trait key ".concat(str2));
                    Map map3 = (Map) this.f683e;
                    if (map3 != null) {
                        map3.remove(str2);
                    }
                } else if (str2.equals("name")) {
                    v5.d();
                    wg.v.r((wg.v) v5.f6816b, str3);
                } else if (str2.equals(AccountTable.emailColumn)) {
                    v5.d();
                    wg.v.t((wg.v) v5.f6816b, str3);
                } else {
                    v5.d();
                    wg.v.u((wg.v) v5.f6816b).put(str2, str3);
                }
            }
        }
        return v5;
    }

    public y9.b g() {
        y9.a aVar;
        ((ba.d) this.f685g).a("Creating a new batch for " + ((com.logrocket.core.f0) this.f680b).c());
        y9.c cVar = (y9.c) this.f682d;
        synchronized (this.f681c) {
            aVar = new y9.a((com.logrocket.core.f0) this.f680b, ((AtomicInteger) this.f684f).getAndIncrement());
        }
        return cVar.h(aVar);
    }

    @Override // b3.a
    public View getRoot() {
        switch (this.f679a) {
        }
        return (LinearLayout) this.f680b;
    }

    public void h() {
        ((ba.d) this.f680b).a("Sending memory event. Total measurements: " + ((eh.n) ((eh.k) this.f683e).f6816b).s());
        if (((eh.n) ((eh.k) this.f683e).f6816b).s() == 0) {
            return;
        }
        eh.k kVar = (eh.k) this.f683e;
        String str = (String) this.f684f;
        kVar.d();
        eh.n.r((eh.n) kVar.f6816b, str);
        ((LogRocketCore) this.f682d).a(21, (eh.k) this.f683e);
        this.f683e = eh.n.t();
    }

    public synchronized void i(wg.q qVar) {
        try {
            if (((y9.b) this.f683e) == null) {
                this.f683e = g();
            }
            ((y9.b) this.f683e).a(qVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void j(String str, String str2) {
        HashMap hashMap = (HashMap) this.f685g;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public synchronized y9.b m() {
        return (y9.b) this.f683e;
    }

    public c4.v o() {
        Context context = (Context) this.f680b;
        q4.f fVar = (q4.f) this.f681c;
        c4.j jVar = (c4.j) this.f685g;
        jVar.getClass();
        q4.f a7 = q4.f.a(fVar, null, null, null, new c4.l(ci.c.b0(jVar.f3592a)), 8191);
        gf.t b10 = gf.k.b(new c4.n(0));
        gf.i iVar = (gf.e) this.f682d;
        if (iVar == null) {
            iVar = gf.k.b(new a2.q(8, this));
        }
        gf.i iVar2 = (gf.e) this.f683e;
        if (iVar2 == null) {
            iVar2 = gf.k.b(new c4.n(1));
        }
        c4.e eVar = (c4.e) this.f684f;
        if (eVar == null) {
            kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
            eVar = new c4.e(e0Var, e0Var, e0Var, e0Var, e0Var);
        }
        return new c4.v(new c4.r(context, a7, b10, iVar, iVar2, eVar));
    }

    public e5.h p() {
        String str = ((String) this.f680b) == null ? " transportName" : "";
        if (((e5.l) this.f682d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f683e) == null) {
            str = r4.k.l(str, " eventMillis");
        }
        if (((Long) this.f684f) == null) {
            str = r4.k.l(str, " uptimeMillis");
        }
        if (((HashMap) this.f685g) == null) {
            str = r4.k.l(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new e5.h((String) this.f680b, (Integer) this.f681c, (e5.l) this.f682d, ((Long) this.f683e).longValue(), ((Long) this.f684f).longValue(), (HashMap) this.f685g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public oi.f q(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f684f;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = indexOf; i5 < size; i5++) {
            oi.f a7 = ((oi.e) list.get(i5)).a(type, annotationArr, this);
            if (a7 != null) {
                return a7;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((oi.e) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public synchronized y9.b r() {
        y9.b bVar = (y9.b) this.f683e;
        if (bVar != null) {
            if (bVar.f25741b == 0) {
                return null;
            }
        }
        this.f683e = g();
        if (bVar != null) {
            bVar.d();
        }
        return bVar;
    }

    public synchronized void t() {
        try {
            ((ba.d) this.f685g).a("Replacing current batch with new batch");
            y9.b bVar = (y9.b) this.f683e;
            if (bVar != null) {
                bVar.d();
            }
            this.f683e = g();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Task u(Task task) {
        return task.g(new o.a(1), new com.google.firebase.messaging.k(this));
    }

    public void v() {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f682d;
        ArrayList arrayList = new ArrayList(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        do {
            h5 h5Var = (h5) concurrentLinkedQueue.poll();
            if (h5Var != null) {
                arrayList.add(h5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        com.android.billingclient.api.x0 x0Var = (com.android.billingclient.api.x0) this.f681c;
        i5 i5Var = new i5(arrayList);
        x0Var.getClass();
        try {
            x0Var.x(x0Var.q(i5Var), null);
        } catch (IOException e7) {
            ((b6) x0Var.f4116b).getLogger().b(b5.WARNING, e7, "Capturing metrics failed.", new Object[0]);
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            io.sentry.transport.p pVar = (io.sentry.transport.p) ((i2.d) this.f685g).f10882b;
            int i10 = io.sentry.transport.p.f17143a;
            pVar.releaseShared(1);
        }
    }

    public ColorStateList x(Context context, int i5) {
        if (i5 == R.drawable.abc_edit_text_material) {
            return d0.c.c(context, R.color.abc_tint_edittext);
        }
        if (i5 == 2131230849) {
            return d0.c.c(context, R.color.abc_tint_switch_track);
        }
        if (i5 != R.drawable.abc_switch_thumb_material) {
            if (i5 == R.drawable.abc_btn_default_mtrl_shape) {
                return s(context, y3.c(context, R.attr.colorButtonNormal));
            }
            if (i5 == R.drawable.abc_btn_borderless_material) {
                return s(context, 0);
            }
            if (i5 == R.drawable.abc_btn_colored_material) {
                return s(context, y3.c(context, R.attr.colorAccent));
            }
            if (i5 == 2131230844 || i5 == R.drawable.abc_spinner_textfield_background_material) {
                return d0.c.c(context, R.color.abc_tint_spinner);
            }
            if (l((int[]) this.f681c, i5)) {
                return y3.d(context, R.attr.colorControlNormal);
            }
            if (l((int[]) this.f684f, i5)) {
                return d0.c.c(context, R.color.abc_tint_default);
            }
            if (l((int[]) this.f685g, i5)) {
                return d0.c.c(context, R.color.abc_tint_btn_checkable);
            }
            if (i5 == R.drawable.abc_seekbar_thumb_material) {
                return d0.c.c(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d10 = y3.d(context, R.attr.colorSwitchThumbNormal);
        if (d10 == null || !d10.isStateful()) {
            iArr[0] = y3.f1012b;
            iArr2[0] = y3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = y3.f1015e;
            iArr2[1] = y3.c(context, R.attr.colorControlActivated);
            iArr[2] = y3.f1016f;
            iArr2[2] = y3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = y3.f1012b;
            iArr[0] = iArr3;
            iArr2[0] = d10.getColorForState(iArr3, 0);
            iArr[1] = y3.f1015e;
            iArr2[1] = y3.c(context, R.attr.colorControlActivated);
            iArr[2] = y3.f1016f;
            iArr2[2] = d10.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void y(boolean z5) {
        io.sentry.r a7 = ((io.sentry.util.a) this.f684f).a();
        try {
            try {
                ((com.google.firebase.messaging.x) this.f683e).l(new androidx.core.widget.b(17, this), z5 ? 0 : 5000);
            } catch (RejectedExecutionException e7) {
                ((b6) this.f680b).getLogger().e(b5.WARNING, "Metrics batch processor flush task rejected", e7);
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public oi.m z(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f683e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = indexOf; i5 < size; i5++) {
            oi.m a7 = ((oi.l) list.get(i5)).a(type);
            if (a7 != null) {
                return a7;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((oi.l) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public a0(LogRocketCore logRocketCore, LogRocketCore logRocketCore2) {
        this.f679a = 14;
        this.f680b = new ba.d("MemoryTracker");
        this.f685g = Boolean.FALSE;
        this.f681c = logRocketCore;
        this.f682d = logRocketCore2;
        this.f683e = eh.n.t();
    }

    public a0(com.logrocket.core.f0 f0Var, y9.c cVar, int i5) {
        this.f679a = 15;
        this.f681c = new Object();
        this.f683e = null;
        this.f685g = new ba.d("persistence");
        this.f680b = f0Var;
        this.f682d = cVar;
        this.f684f = new AtomicInteger(i5);
    }

    public a0(HashSet hashSet, String str, y9.d dVar, Map map) {
        this.f679a = 5;
        this.f684f = 0;
        this.f685g = new ba.d("LogRocketIdentify");
        this.f680b = hashSet;
        this.f681c = str;
        this.f682d = dVar;
        this.f683e = map;
    }

    public a0(Set set, String str, String str2) {
        this.f679a = 11;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f680b = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f682d = str;
        this.f683e = str2;
        this.f684f = t7.a.f23751a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f681c = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public a0(io.sentry.config.a logger, ji.a scope, ag.c clazz, gi.a aVar, fi.a aVar2) {
        this.f679a = 3;
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.f680b = logger;
        this.f681c = scope;
        this.f682d = clazz;
        this.f683e = aVar;
        this.f684f = aVar2;
        this.f685g = "t:'" + li.a.a(clazz) + "' - q:'" + aVar + '\'';
    }

    public a0(b6 b6Var, com.android.billingclient.api.x0 x0Var) {
        this.f679a = 12;
        this.f684f = new io.sentry.util.a();
        this.f685g = new i2.d((byte) 0, 9);
        this.f680b = b6Var;
        this.f681c = x0Var;
        this.f682d = new ConcurrentLinkedQueue();
        this.f683e = new com.google.firebase.messaging.x(b6Var);
    }

    public a0(int i5) {
        Class<RecyclerView> cls;
        this.f679a = i5;
        switch (i5) {
            case 6:
                this.f680b = new ba.d("ScrollTracker");
                this.f681c = new WeakHashMap();
                this.f683e = new HashMap();
                Method method = aa.k.f110a;
                Method method2 = null;
                try {
                    cls = RecyclerView.class;
                    int i10 = RecyclerView.HORIZONTAL;
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                this.f684f = cls;
                try {
                    method2 = aa.k.b(cls, "getScrollState", new Class[0]);
                } catch (Throwable unused2) {
                }
                this.f685g = method2;
                break;
            case 7:
                break;
            default:
                this.f680b = new int[]{2131230859, 2131230857, 2131230783};
                this.f681c = new int[]{2131230807, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f682d = new int[]{2131230856, 2131230858, 2131230800, R.drawable.abc_text_cursor_material, 2131230853, 2131230854, 2131230855};
                this.f683e = new int[]{2131230832, R.drawable.abc_cab_background_internal_bg, 2131230831};
                this.f684f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f685g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public a0(Context context) {
        this.f679a = 2;
        this.f680b = context.getApplicationContext();
        this.f681c = q4.f.f21953o;
        this.f682d = null;
        this.f683e = null;
        this.f684f = null;
        this.f685g = new c4.j();
    }

    public a0(gh.d dVar, gh.y yVar, List list, List list2, Executor executor) {
        this.f679a = 13;
        this.f680b = new ConcurrentHashMap();
        this.f681c = dVar;
        this.f682d = yVar;
        this.f683e = list;
        this.f684f = list2;
        this.f685g = executor;
    }

    public a0(androidx.lifecycle.i liveData, androidx.lifecycle.p block, jg.d scope, a2.q onDone) {
        this.f679a = 1;
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.f680b = liveData;
        this.f681c = block;
        this.f682d = scope;
        this.f683e = onDone;
    }

    public a0(h8.g gVar, androidx.core.view.f fVar, a9.a aVar, a9.a aVar2, b9.e eVar) {
        this.f679a = 4;
        gVar.a();
        b6.b bVar = new b6.b(gVar.f10401a);
        this.f680b = gVar;
        this.f681c = fVar;
        this.f682d = bVar;
        this.f683e = aVar;
        this.f684f = aVar2;
        this.f685g = eVar;
    }
}
