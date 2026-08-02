package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u20 implements r5f, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long h;
    public final View a;
    public boolean c;
    public boolean f;
    public long g;
    public final PriorityQueue b = new PriorityQueue(11, new z(1));
    public final Choreographer d = Choreographer.getInstance();
    public final yli e = new yli();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u20(View view) {
        float f;
        this.a = view;
        if (h == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            h = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f = true;
        }
    }

    @Override // defpackage.r5f
    public final void a(q5f q5fVar) {
        this.b.add(new n7f(1, q5fVar));
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.post(this);
    }

    public final boolean b() {
        yli yliVar = this.e;
        long a = yliVar.a();
        eq3.a0(a, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.b;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((n7f) peek).b.c(yliVar)) {
                priorityQueue.poll();
                z = false;
            }
            yliVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.g = j;
            this.a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.c && this.f) {
            View view = this.a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * h) + nanos;
                yli yliVar = this.e;
                yliVar.a = z;
                yliVar.b = Math.max(this.g, nanos) + h;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (yliVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = b();
                    }
                }
                if (z2) {
                    this.d.postFrameCallback(this);
                } else {
                    this.c = false;
                }
                eq3.a0(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.c = false;
    }
}
