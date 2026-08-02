package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.H3;
import io.sentry.ILogger;
import io.sentry.android.replay.viewhierarchy.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l implements n {

    /* renamed from: s, reason: collision with root package name */
    public static final a f51725s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f51726t = 8;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.android.replay.r f51727a;

    /* renamed from: b, reason: collision with root package name */
    public final F3 f51728b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.android.replay.s f51729c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.replay.util.c f51730d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f51731e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f51732f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.android.replay.util.h f51733g;

    /* renamed from: h, reason: collision with root package name */
    public final Bitmap f51734h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f51735i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f51736j;

    /* renamed from: k, reason: collision with root package name */
    public final io.sentry.android.replay.util.i f51737k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f51738l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f51739m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f51740n;

    /* renamed from: o, reason: collision with root package name */
    public final Lazy f51741o;

    /* renamed from: p, reason: collision with root package name */
    public final Lazy f51742p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f51743q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f51744r;

    @NotNull
    private final int[] svLocation;

    @NotNull
    private final int[] windowLocation;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f51745a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51746b;

        /* renamed from: c, reason: collision with root package name */
        public final int f51747c;

        public b(Bitmap bitmap, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f51745a = bitmap;
            this.f51746b = i10;
            this.f51747c = i11;
        }

        public final Bitmap a() {
            return this.f51745a;
        }

        public final int b() {
            return this.f51746b;
        }

        public final int c() {
            return this.f51747c;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f51748d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
            return paint;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            l lVar = l.this;
            matrix.preScale(lVar.f51729c.e(), lVar.f51729c.f());
            return matrix;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(l.this.f51734h);
        }
    }

    public l(io.sentry.android.replay.b executorProvider, io.sentry.android.replay.r rVar, F3 options, io.sentry.android.replay.s config, io.sentry.android.replay.util.c debugOverlayDrawable, Function0 markContentChanged) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        Intrinsics.checkNotNullParameter(markContentChanged, "markContentChanged");
        this.f51727a = rVar;
        this.f51728b = options;
        this.f51729c = config;
        this.f51730d = debugOverlayDrawable;
        this.f51731e = markContentChanged;
        this.f51732f = executorProvider.r();
        this.f51733g = executorProvider.k();
        Bitmap createBitmap = Bitmap.createBitmap(config.d(), config.c(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f51734h = createBitmap;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f51735i = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new d());
        this.f51736j = new AtomicBoolean(false);
        this.f51737k = new io.sentry.android.replay.util.i();
        this.f51738l = new AtomicBoolean(false);
        this.f51739m = new AtomicInteger(0);
        this.f51740n = new AtomicBoolean(false);
        this.f51741o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) c.f51748d);
        this.f51742p = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e());
        this.f51743q = new Rect();
        this.f51744r = new RectF();
        this.windowLocation = new int[2];
        this.svLocation = new int[2];
    }

    public static final void m(l lVar, View view, List list) {
        if (lVar.f51730d.getCallback() == null) {
            view.getOverlay().add(lVar.f51730d);
        }
        lVar.f51730d.b(list);
        view.postInvalidate();
    }

    public static final void n(final l lVar, final View view, int i10) {
        if (lVar.f51740n.get()) {
            lVar.f51728b.getLogger().c(EnumC4788n3.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 != 0) {
            lVar.f51728b.getLogger().c(EnumC4788n3.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
            lVar.f51739m.set(0);
            lVar.f51736j.set(false);
            return;
        }
        final boolean z10 = lVar.f51738l.get();
        if (z10 && lVar.z()) {
            return;
        }
        c.a aVar = io.sentry.android.replay.viewhierarchy.c.f51833m;
        H3 sessionReplay = lVar.f51728b.getSessionReplay();
        Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
        final io.sentry.android.replay.viewhierarchy.c a10 = aVar.a(view, null, 0, sessionReplay);
        ArrayList arrayList = lVar.f51728b.getSessionReplay().B() ? new ArrayList() : null;
        H3 sessionReplay2 = lVar.f51728b.getSessionReplay();
        Intrinsics.checkNotNullExpressionValue(sessionReplay2, "getSessionReplay(...)");
        ILogger logger = lVar.f51728b.getLogger();
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        io.sentry.android.replay.util.r.k(view, a10, sessionReplay2, logger, arrayList);
        if (arrayList == null || arrayList.isEmpty()) {
            lVar.f51732f.submit(new io.sentry.android.replay.util.m("screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.screenshot.h
                @Override // java.lang.Runnable
                public final void run() {
                    l.o(l.this, view, a10, z10);
                }
            }));
        } else {
            lVar.f51731e.invoke();
            lVar.p(view, arrayList, a10, !z10);
        }
    }

    public static final void o(l lVar, View view, io.sentry.android.replay.viewhierarchy.c cVar, boolean z10) {
        lVar.l(view, cVar, !z10);
    }

    public static final void q(l lVar, Bitmap bitmap, b[] bVarArr, int i10, int i11, int i12, AtomicInteger atomicInteger, View view, io.sentry.android.replay.viewhierarchy.c cVar, int i13, int i14, boolean z10, int i15) {
        if (lVar.f51740n.get()) {
            bitmap.recycle();
            r(atomicInteger, lVar, view, bVarArr, cVar, i13, i14, z10);
            return;
        }
        if (i15 == 0) {
            bVarArr[i10] = new b(bitmap, i11, i12);
        } else {
            bitmap.recycle();
            lVar.f51728b.getLogger().c(EnumC4788n3.INFO, "Failed to capture SurfaceView: %d", Integer.valueOf(i15));
        }
        r(atomicInteger, lVar, view, bVarArr, cVar, i13, i14, z10);
    }

    public static final void r(AtomicInteger atomicInteger, l lVar, View view, b[] bVarArr, io.sentry.android.replay.viewhierarchy.c cVar, int i10, int i11, boolean z10) {
        if (atomicInteger.decrementAndGet() == 0) {
            lVar.t(view, bVarArr, cVar, i10, i11, z10);
        }
    }

    public static final void s(l lVar) {
        if (!lVar.f51734h.isRecycled()) {
            synchronized (lVar.f51734h) {
                try {
                    if (!lVar.f51734h.isRecycled()) {
                        lVar.f51734h.recycle();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        lVar.f51737k.close();
    }

    public static final void u(l lVar, b[] bVarArr, int i10, int i11, View view, io.sentry.android.replay.viewhierarchy.c cVar, boolean z10) {
        if (lVar.f51740n.get() || lVar.f51734h.isRecycled()) {
            lVar.f51728b.getLogger().c(EnumC4788n3.DEBUG, "PixelCopyStrategy is closed, skipping compositing", new Object[0]);
            lVar.y(bVarArr);
            return;
        }
        for (b bVar : bVarArr) {
            if (bVar != null && !bVar.a().isRecycled()) {
                m.a(lVar.x(), lVar.v(), lVar.f51743q, lVar.f51744r, bVar.a(), bVar.b(), bVar.c(), i10, i11, lVar.f51729c.e(), lVar.f51729c.f());
                bVar.a().recycle();
            }
        }
        lVar.l(view, cVar, z10);
    }

    private final Matrix w() {
        return (Matrix) this.f51735i.getValue();
    }

    @Override // io.sentry.android.replay.screenshot.n
    public boolean a() {
        return this.f51736j.get();
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void b() {
        io.sentry.android.replay.r rVar;
        if (!a() || this.f51734h.isRecycled() || (rVar = this.f51727a) == null) {
            return;
        }
        rVar.w0(this.f51734h);
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void c(final View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Window a10 = io.sentry.android.replay.z.a(root);
        if (a10 == null) {
            this.f51728b.getLogger().c(EnumC4788n3.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.f51740n.get()) {
            this.f51728b.getLogger().c(EnumC4788n3.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f51738l.set(false);
            PixelCopy.request(a10, this.f51734h, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.f
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i10) {
                    l.n(l.this, root, i10);
                }
            }, this.f51733g.a());
        } catch (Throwable th2) {
            this.f51728b.getLogger().b(EnumC4788n3.WARNING, "Failed to capture replay recording", th2);
            this.f51739m.set(0);
            this.f51736j.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void close() {
        this.f51740n.set(true);
        this.f51739m.set(0);
        this.f51732f.submit(new io.sentry.android.replay.util.m("PixelCopyStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.g
            @Override // java.lang.Runnable
            public final void run() {
                l.s(l.this);
            }
        }));
    }

    public final void l(final View view, io.sentry.android.replay.viewhierarchy.c cVar, boolean z10) {
        if (this.f51740n.get() || this.f51734h.isRecycled()) {
            this.f51728b.getLogger().c(EnumC4788n3.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        final List w02 = this.f51737k.w0(this.f51734h, cVar, w());
        if (this.f51728b.getReplayController().m1()) {
            this.f51733g.b(new Runnable() { // from class: io.sentry.android.replay.screenshot.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.m(l.this, view, w02);
                }
            });
        }
        io.sentry.android.replay.r rVar = this.f51727a;
        if (rVar != null) {
            rVar.w0(this.f51734h);
        }
        this.f51736j.set(true);
        this.f51738l.set(false);
        if (z10) {
            this.f51739m.set(0);
        }
    }

    @Override // io.sentry.android.replay.screenshot.n
    public void onContentChanged() {
        this.f51738l.set(true);
    }

    public final void p(final View view, List list, final io.sentry.android.replay.viewhierarchy.c cVar, final boolean z10) {
        b[] bVarArr;
        AtomicInteger atomicInteger;
        final l lVar;
        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener;
        SurfaceHolder holder;
        l lVar2 = this;
        view.getLocationOnScreen(lVar2.windowLocation);
        int[] iArr = lVar2.windowLocation;
        char c10 = 0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        b[] bVarArr2 = new b[list.size()];
        AtomicInteger atomicInteger2 = new AtomicInteger(list.size());
        Iterator it = list.iterator();
        final b[] bVarArr3 = bVarArr2;
        final int i12 = 0;
        while (it.hasNext()) {
            int i13 = i12 + 1;
            SurfaceView surfaceView = (SurfaceView) ((c.d) it.next()).j().get();
            final Bitmap bitmap = null;
            Surface surface = (surfaceView == null || (holder = surfaceView.getHolder()) == null) ? null : holder.getSurface();
            if (surfaceView == null || surface == null) {
                lVar2 = this;
            } else if (surface.isValid()) {
                try {
                    bitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    try {
                        surfaceView.getLocationOnScreen(lVar2.svLocation);
                        int[] iArr2 = lVar2.svLocation;
                        try {
                            final int i14 = iArr2[c10];
                            final int i15 = iArr2[1];
                            final int i16 = i10;
                            final int i17 = i11;
                            final AtomicInteger atomicInteger3 = atomicInteger2;
                            lVar = this;
                            try {
                                onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.i
                                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                    public final void onPixelCopyFinished(int i18) {
                                        l.q(l.this, bitmap, bVarArr3, i12, i14, i15, atomicInteger3, view, cVar, i16, i17, z10, i18);
                                    }
                                };
                                atomicInteger = atomicInteger3;
                                i10 = i16;
                                i11 = i17;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicInteger = atomicInteger3;
                                i10 = i16;
                                i11 = i17;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            atomicInteger = atomicInteger2;
                            lVar = this;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        atomicInteger = atomicInteger2;
                        lVar = lVar2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    atomicInteger = atomicInteger2;
                    lVar = lVar2;
                }
                try {
                    PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, lVar.f51733g.a());
                    atomicInteger2 = atomicInteger;
                } catch (Throwable th6) {
                    th = th6;
                    bitmap = bitmap;
                    lVar.f51728b.getLogger().b(EnumC4788n3.WARNING, "Failed to capture SurfaceView", th);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    l lVar3 = lVar;
                    atomicInteger2 = atomicInteger;
                    bVarArr = bVarArr3;
                    r(atomicInteger2, lVar3, view, bVarArr, cVar, i10, i11, z10);
                    bVarArr3 = bVarArr;
                    c10 = 0;
                    lVar2 = this;
                    i12 = i13;
                }
                c10 = 0;
                lVar2 = this;
                i12 = i13;
            }
            bVarArr = bVarArr3;
            r(atomicInteger2, lVar2, view, bVarArr, cVar, i10, i11, z10);
            bVarArr3 = bVarArr;
            c10 = 0;
            lVar2 = this;
            i12 = i13;
        }
    }

    public final void t(final View view, final b[] bVarArr, final io.sentry.android.replay.viewhierarchy.c cVar, final int i10, final int i11, final boolean z10) {
        this.f51732f.submit(new io.sentry.android.replay.util.m("screenshot_recorder.composite", new Runnable() { // from class: io.sentry.android.replay.screenshot.k
            @Override // java.lang.Runnable
            public final void run() {
                l.u(l.this, bVarArr, i10, i11, view, cVar, z10);
            }
        }));
    }

    public final Paint v() {
        return (Paint) this.f51741o.getValue();
    }

    public final Canvas x() {
        return (Canvas) this.f51742p.getValue();
    }

    public final void y(b[] bVarArr) {
        for (b bVar : bVarArr) {
            if (bVar != null && !bVar.a().isRecycled()) {
                bVar.a().recycle();
            }
        }
    }

    public final boolean z() {
        if (this.f51739m.incrementAndGet() > 1) {
            return false;
        }
        this.f51728b.getLogger().c(EnumC4788n3.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
        this.f51736j.set(false);
        return true;
    }
}
