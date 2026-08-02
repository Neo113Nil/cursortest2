package l6;

import E0.C2942q;
import V5.l;
import V5.q;
import V5.v;
import Z5.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.d;
import e6.C6305c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import q6.AbstractC8993d;

/* loaded from: classes.dex */
public final class j<R> implements InterfaceC7882e, m6.g {

    /* renamed from: D, reason: collision with root package name */
    private static final boolean f72870D = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    private int f72871A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f72872B;

    /* renamed from: C, reason: collision with root package name */
    private RuntimeException f72873C;

    /* renamed from: a, reason: collision with root package name */
    private final String f72874a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8993d f72875b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f72876c;

    /* renamed from: d, reason: collision with root package name */
    private final h<R> f72877d;

    /* renamed from: e, reason: collision with root package name */
    private final f f72878e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f72879f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.f f72880g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f72881h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<R> f72882i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC7878a<?> f72883j;

    /* renamed from: k, reason: collision with root package name */
    private final int f72884k;

    /* renamed from: l, reason: collision with root package name */
    private final int f72885l;

    /* renamed from: m, reason: collision with root package name */
    private final com.bumptech.glide.i f72886m;

    /* renamed from: n, reason: collision with root package name */
    private final m6.h<R> f72887n;

    /* renamed from: o, reason: collision with root package name */
    private final List<h<R>> f72888o;

    /* renamed from: p, reason: collision with root package name */
    private final n6.d<? super R> f72889p;

    /* renamed from: q, reason: collision with root package name */
    private final Executor f72890q;

    /* renamed from: r, reason: collision with root package name */
    private v<R> f72891r;

    /* renamed from: s, reason: collision with root package name */
    private l.d f72892s;

    /* renamed from: t, reason: collision with root package name */
    private long f72893t;

    /* renamed from: u, reason: collision with root package name */
    private volatile l f72894u;

    /* renamed from: v, reason: collision with root package name */
    private a f72895v;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f72896w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f72897x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f72898y;

    /* renamed from: z, reason: collision with root package name */
    private int f72899z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLEARED;
        public static final a COMPLETE;
        public static final a FAILED;
        public static final a PENDING;
        public static final a RUNNING;
        public static final a WAITING_FOR_SIZE;

        static {
            a aVar = new a("PENDING", 0);
            PENDING = aVar;
            a aVar2 = new a("RUNNING", 1);
            RUNNING = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            WAITING_FOR_SIZE = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            COMPLETE = aVar4;
            a aVar5 = new a("FAILED", 4);
            FAILED = aVar5;
            a aVar6 = new a("CLEARED", 5);
            CLEARED = aVar6;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private j(Context context, com.bumptech.glide.f fVar, @NonNull Object obj, Object obj2, Class<R> cls, AbstractC7878a<?> abstractC7878a, int i11, int i12, com.bumptech.glide.i iVar, m6.h<R> hVar, h<R> hVar2, List<h<R>> list, f fVar2, l lVar, n6.d<? super R> dVar, Executor executor) {
        this.f72874a = f72870D ? String.valueOf(hashCode()) : null;
        this.f72875b = AbstractC8993d.a();
        this.f72876c = obj;
        this.f72879f = context;
        this.f72880g = fVar;
        this.f72881h = obj2;
        this.f72882i = cls;
        this.f72883j = abstractC7878a;
        this.f72884k = i11;
        this.f72885l = i12;
        this.f72886m = iVar;
        this.f72887n = hVar;
        this.f72877d = hVar2;
        this.f72888o = list;
        this.f72878e = fVar2;
        this.f72894u = lVar;
        this.f72889p = dVar;
        this.f72890q = executor;
        this.f72895v = a.PENDING;
        if (this.f72873C == null && fVar.g().a(d.c.class)) {
            this.f72873C = new RuntimeException("Glide request origin trace");
        }
    }

    private Drawable f() {
        if (this.f72898y == null) {
            AbstractC7878a<?> abstractC7878a = this.f72883j;
            Drawable fallbackDrawable = abstractC7878a.getFallbackDrawable();
            this.f72898y = fallbackDrawable;
            if (fallbackDrawable == null && abstractC7878a.getFallbackId() > 0) {
                this.f72898y = i(abstractC7878a.getFallbackId());
            }
        }
        return this.f72898y;
    }

    private Drawable h() {
        if (this.f72897x == null) {
            AbstractC7878a<?> abstractC7878a = this.f72883j;
            Drawable placeholderDrawable = abstractC7878a.getPlaceholderDrawable();
            this.f72897x = placeholderDrawable;
            if (placeholderDrawable == null && abstractC7878a.getPlaceholderId() > 0) {
                this.f72897x = i(abstractC7878a.getPlaceholderId());
            }
        }
        return this.f72897x;
    }

    private Drawable i(int i11) {
        AbstractC7878a<?> abstractC7878a = this.f72883j;
        Resources.Theme theme = abstractC7878a.getTheme();
        Context context = this.f72879f;
        return C6305c.a(context, i11, theme != null ? abstractC7878a.getTheme() : context.getTheme());
    }

    private void k(String str) {
        StringBuilder e11 = C2942q.e(str, " this: ");
        e11.append(this.f72874a);
        Log.v("GlideRequest", e11.toString());
    }

    public static <R> j<R> l(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class<R> cls, AbstractC7878a<?> abstractC7878a, int i11, int i12, com.bumptech.glide.i iVar, m6.h<R> hVar, h<R> hVar2, List<h<R>> list, f fVar2, l lVar, n6.d<? super R> dVar, Executor executor) {
        return new j<>(context, fVar, obj, obj2, cls, abstractC7878a, i11, i12, iVar, hVar, hVar2, list, fVar2, lVar, dVar, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:15:0x005d, B:17:0x0061, B:18:0x0066, B:20:0x006c, B:22:0x007a, B:27:0x0088, B:31:0x0091, B:33:0x0095, B:35:0x009d, B:39:0x00ab, B:42:0x00b3, B:44:0x00b7), top: B:14:0x005d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void n(q qVar, int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        this.f72875b.c();
        synchronized (this.f72876c) {
            try {
                qVar.getClass();
                int h11 = this.f72880g.h();
                if (h11 <= i11) {
                    Log.w("Glide", "Load failed for [" + this.f72881h + "] with dimensions [" + this.f72899z + "x" + this.f72871A + "]", qVar);
                    if (h11 <= 4) {
                        qVar.f();
                    }
                }
                this.f72892s = null;
                this.f72895v = a.FAILED;
                f fVar = this.f72878e;
                if (fVar != null) {
                    fVar.g(this);
                }
                boolean z14 = true;
                this.f72872B = true;
                try {
                    List<h<R>> list = this.f72888o;
                    if (list != null) {
                        z11 = false;
                        for (h<R> hVar : list) {
                            Object obj = this.f72881h;
                            m6.h<R> hVar2 = this.f72887n;
                            f fVar2 = this.f72878e;
                            if (fVar2 != null && fVar2.getRoot().a()) {
                                z13 = false;
                                z11 |= hVar.onLoadFailed(qVar, obj, hVar2, z13);
                            }
                            z13 = true;
                            z11 |= hVar.onLoadFailed(qVar, obj, hVar2, z13);
                        }
                    } else {
                        z11 = false;
                    }
                    h<R> hVar3 = this.f72877d;
                    if (hVar3 != null) {
                        Object obj2 = this.f72881h;
                        m6.h<R> hVar4 = this.f72887n;
                        f fVar3 = this.f72878e;
                        if (fVar3 != null && fVar3.getRoot().a()) {
                            z12 = false;
                            if (hVar3.onLoadFailed(qVar, obj2, hVar4, z12)) {
                                if (!(z11 | z14)) {
                                    q();
                                }
                                this.f72872B = false;
                            }
                        }
                        z12 = true;
                        if (hVar3.onLoadFailed(qVar, obj2, hVar4, z12)) {
                        }
                    }
                    z14 = false;
                    if (!(z11 | z14)) {
                    }
                    this.f72872B = false;
                } catch (Throwable th2) {
                    this.f72872B = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void p(v<R> vVar, R r11, T5.a aVar, boolean z11) {
        boolean z12;
        boolean z13 = true;
        f fVar = this.f72878e;
        boolean z14 = fVar == null || !fVar.getRoot().a();
        this.f72895v = a.COMPLETE;
        this.f72891r = vVar;
        if (this.f72880g.h() <= 3) {
            Log.d("Glide", "Finished loading " + r11.getClass().getSimpleName() + " from " + aVar + " for " + this.f72881h + " with size [" + this.f72899z + "x" + this.f72871A + "] in " + p6.g.a(this.f72893t) + " ms");
        }
        if (fVar != null) {
            fVar.c(this);
        }
        this.f72872B = true;
        try {
            List<h<R>> list = this.f72888o;
            if (list != null) {
                z12 = false;
                for (h<R> hVar : list) {
                    R r12 = r11;
                    T5.a aVar2 = aVar;
                    boolean onResourceReady = hVar.onResourceReady(r12, this.f72881h, this.f72887n, aVar2, z14) | z12;
                    if (hVar instanceof AbstractC7880c) {
                        onResourceReady |= ((AbstractC7880c) hVar).a();
                    }
                    z12 = onResourceReady;
                    r11 = r12;
                    aVar = aVar2;
                }
            } else {
                z12 = false;
            }
            R r13 = r11;
            T5.a aVar3 = aVar;
            h<R> hVar2 = this.f72877d;
            if (hVar2 == null || !hVar2.onResourceReady(r13, this.f72881h, this.f72887n, aVar3, z14)) {
                z13 = false;
            }
            if (!(z12 | z13)) {
                this.f72887n.onResourceReady(r13, this.f72889p.a(aVar3));
            }
            this.f72872B = false;
        } catch (Throwable th2) {
            this.f72872B = false;
            throw th2;
        }
    }

    private void q() {
        f fVar = this.f72878e;
        if (fVar == null || fVar.i(this)) {
            Drawable f7 = this.f72881h == null ? f() : null;
            if (f7 == null) {
                if (this.f72896w == null) {
                    AbstractC7878a<?> abstractC7878a = this.f72883j;
                    Drawable errorPlaceholder = abstractC7878a.getErrorPlaceholder();
                    this.f72896w = errorPlaceholder;
                    if (errorPlaceholder == null && abstractC7878a.getErrorId() > 0) {
                        this.f72896w = i(abstractC7878a.getErrorId());
                    }
                }
                f7 = this.f72896w;
            }
            if (f7 == null) {
                f7 = h();
            }
            this.f72887n.onLoadFailed(f7);
        }
    }

    @Override // l6.InterfaceC7882e
    public final boolean a() {
        boolean z11;
        synchronized (this.f72876c) {
            z11 = this.f72895v == a.COMPLETE;
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean b(InterfaceC7882e interfaceC7882e) {
        int i11;
        int i12;
        Object obj;
        Class<R> cls;
        AbstractC7878a<?> abstractC7878a;
        com.bumptech.glide.i iVar;
        int size;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        AbstractC7878a<?> abstractC7878a2;
        com.bumptech.glide.i iVar2;
        int size2;
        if (!(interfaceC7882e instanceof j)) {
            return false;
        }
        synchronized (this.f72876c) {
            try {
                i11 = this.f72884k;
                i12 = this.f72885l;
                obj = this.f72881h;
                cls = this.f72882i;
                abstractC7878a = this.f72883j;
                iVar = this.f72886m;
                List<h<R>> list = this.f72888o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        j jVar = (j) interfaceC7882e;
        synchronized (jVar.f72876c) {
            try {
                i13 = jVar.f72884k;
                i14 = jVar.f72885l;
                obj2 = jVar.f72881h;
                cls2 = jVar.f72882i;
                abstractC7878a2 = jVar.f72883j;
                iVar2 = jVar.f72886m;
                List<h<R>> list2 = jVar.f72888o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i11 != i13 || i12 != i14) {
            return false;
        }
        int i15 = p6.l.f80283d;
        if ((obj == null ? obj2 == null : obj instanceof m ? ((m) obj).a() : obj.equals(obj2)) && cls.equals(cls2)) {
            return (abstractC7878a == null ? abstractC7878a2 == null : abstractC7878a.isEquivalentTo(abstractC7878a2)) && iVar == iVar2 && size == size2;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m6.g
    public final void c(int i11, int i12) {
        int i13;
        int i14;
        Class<?> resourceClass;
        Class<R> cls;
        com.bumptech.glide.i iVar;
        V5.k diskCacheStrategy;
        Map<Class<?>, T5.m<?>> transformations;
        boolean isTransformationRequired;
        boolean isScaleOnlyOrNoTransform;
        T5.i options;
        boolean isMemoryCacheable;
        boolean useUnlimitedSourceGeneratorsPool;
        boolean useAnimationPool;
        boolean onlyRetrieveFromCache;
        Executor executor;
        j<R> jVar = this;
        int i15 = i11;
        jVar.f72875b.c();
        Object obj = jVar.f72876c;
        synchronized (obj) {
            try {
                try {
                    boolean z11 = f72870D;
                    if (z11) {
                        jVar.k("Got onSizeReady in " + p6.g.a(jVar.f72893t));
                    }
                    if (jVar.f72895v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        jVar.f72895v = aVar;
                        float sizeMultiplier = jVar.f72883j.getSizeMultiplier();
                        if (i15 != Integer.MIN_VALUE) {
                            i15 = Math.round(i15 * sizeMultiplier);
                        }
                        jVar.f72899z = i15;
                        jVar.f72871A = i12 == Integer.MIN_VALUE ? i12 : Math.round(sizeMultiplier * i12);
                        if (z11) {
                            jVar.k("finished setup for calling load in " + p6.g.a(jVar.f72893t));
                        }
                        l lVar = jVar.f72894u;
                        com.bumptech.glide.f fVar = jVar.f72880g;
                        Object obj2 = jVar.f72881h;
                        T5.f signature = jVar.f72883j.getSignature();
                        try {
                            i13 = jVar.f72899z;
                            i14 = jVar.f72871A;
                            resourceClass = jVar.f72883j.getResourceClass();
                            cls = jVar.f72882i;
                            try {
                                iVar = jVar.f72886m;
                                diskCacheStrategy = jVar.f72883j.getDiskCacheStrategy();
                                transformations = jVar.f72883j.getTransformations();
                                isTransformationRequired = jVar.f72883j.isTransformationRequired();
                                isScaleOnlyOrNoTransform = jVar.f72883j.isScaleOnlyOrNoTransform();
                                options = jVar.f72883j.getOptions();
                                isMemoryCacheable = jVar.f72883j.isMemoryCacheable();
                                useUnlimitedSourceGeneratorsPool = jVar.f72883j.getUseUnlimitedSourceGeneratorsPool();
                                useAnimationPool = jVar.f72883j.getUseAnimationPool();
                                onlyRetrieveFromCache = jVar.f72883j.getOnlyRetrieveFromCache();
                                executor = jVar.f72890q;
                                jVar = obj;
                            } catch (Throwable th2) {
                                th = th2;
                                jVar = obj;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            jVar = obj;
                        }
                        try {
                            jVar.f72892s = lVar.a(fVar, obj2, signature, i13, i14, resourceClass, cls, iVar, diskCacheStrategy, transformations, isTransformationRequired, isScaleOnlyOrNoTransform, options, isMemoryCacheable, useUnlimitedSourceGeneratorsPool, useAnimationPool, onlyRetrieveFromCache, jVar, executor);
                            if (jVar.f72895v != aVar) {
                                jVar.f72892s = null;
                            }
                            if (z11) {
                                jVar.k("finished onSizeReady in " + p6.g.a(jVar.f72893t));
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                jVar = obj;
            }
        }
    }

    @Override // l6.InterfaceC7882e
    public final void clear() {
        synchronized (this.f72876c) {
            try {
                if (this.f72872B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f72875b.c();
                a aVar = this.f72895v;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                if (this.f72872B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f72875b.c();
                this.f72887n.removeCallback(this);
                l.d dVar = this.f72892s;
                v<R> vVar = null;
                if (dVar != null) {
                    dVar.a();
                    this.f72892s = null;
                }
                v<R> vVar2 = this.f72891r;
                if (vVar2 != null) {
                    this.f72891r = null;
                    vVar = vVar2;
                }
                f fVar = this.f72878e;
                if (fVar == null || fVar.f(this)) {
                    this.f72887n.onLoadCleared(h());
                }
                this.f72895v = aVar2;
                if (vVar != null) {
                    this.f72894u.getClass();
                    l.h(vVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l6.InterfaceC7882e
    public final boolean d() {
        boolean z11;
        synchronized (this.f72876c) {
            z11 = this.f72895v == a.CLEARED;
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean e() {
        boolean z11;
        synchronized (this.f72876c) {
            z11 = this.f72895v == a.COMPLETE;
        }
        return z11;
    }

    public final Object g() {
        this.f72875b.c();
        return this.f72876c;
    }

    @Override // l6.InterfaceC7882e
    public final boolean isRunning() {
        boolean z11;
        synchronized (this.f72876c) {
            try {
                a aVar = this.f72895v;
                z11 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final void j() {
        synchronized (this.f72876c) {
            try {
                if (this.f72872B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f72875b.c();
                int i11 = p6.g.f80269b;
                this.f72893t = SystemClock.elapsedRealtimeNanos();
                if (this.f72881h == null) {
                    if (p6.l.i(this.f72884k, this.f72885l)) {
                        this.f72899z = this.f72884k;
                        this.f72871A = this.f72885l;
                    }
                    n(new q("Received null model"), f() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f72895v;
                if (aVar == a.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    o(this.f72891r, T5.a.MEMORY_CACHE, false);
                    return;
                }
                List<h<R>> list = this.f72888o;
                if (list != null) {
                    for (h<R> hVar : list) {
                        if (hVar instanceof AbstractC7880c) {
                            ((AbstractC7880c) hVar).getClass();
                        }
                    }
                }
                a aVar2 = a.WAITING_FOR_SIZE;
                this.f72895v = aVar2;
                if (p6.l.i(this.f72884k, this.f72885l)) {
                    c(this.f72884k, this.f72885l);
                } else {
                    this.f72887n.getSize(this);
                }
                a aVar3 = this.f72895v;
                if (aVar3 == a.RUNNING || aVar3 == aVar2) {
                    f fVar = this.f72878e;
                    if (fVar == null || fVar.i(this)) {
                        this.f72887n.onLoadStarted(h());
                    }
                }
                if (f72870D) {
                    k("finished run method in " + p6.g.a(this.f72893t));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(q qVar) {
        n(qVar, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(v<?> vVar, T5.a aVar, boolean z11) {
        this.f72875b.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f72876c) {
                try {
                    this.f72892s = null;
                    if (vVar == null) {
                        n(new q("Expected to receive a Resource<R> with an object of " + this.f72882i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f72882i.isAssignableFrom(obj.getClass())) {
                            f fVar = this.f72878e;
                            if (fVar == null || fVar.h(this)) {
                                p(vVar, obj, aVar, z11);
                                return;
                            }
                            this.f72891r = null;
                            this.f72895v = a.COMPLETE;
                            this.f72894u.getClass();
                            l.h(vVar);
                        }
                        this.f72891r = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f72882i);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(vVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        n(new q(sb2.toString()), 5);
                        this.f72894u.getClass();
                        l.h(vVar);
                    } catch (Throwable th2) {
                        vVar2 = vVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f72894u.getClass();
                l.h(vVar2);
            }
            throw th4;
        }
    }

    @Override // l6.InterfaceC7882e
    public final void pause() {
        synchronized (this.f72876c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f72876c) {
            obj = this.f72881h;
            cls = this.f72882i;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[model=");
        sb2.append(obj);
        sb2.append(", transcodeClass=");
        return Fj.c.c(sb2, cls, "]");
    }
}
