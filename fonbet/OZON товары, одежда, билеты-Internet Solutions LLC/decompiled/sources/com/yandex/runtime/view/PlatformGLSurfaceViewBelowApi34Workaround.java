package com.yandex.runtime.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class PlatformGLSurfaceViewBelowApi34Workaround extends PlatformGLSurfaceView {
    private final BufferedRunnable mBufferedRunnable;

    public static final class BufferedRunnable {
        private final List<StampedRunnable> mBuffer = new ArrayList();
        private long mGeneration = 0;

        private final class Commit implements Runnable {
            private final long mGeneration;

            Commit(long j11) {
                this.mGeneration = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                synchronized (BufferedRunnable.this.mBuffer) {
                    try {
                        Iterator it = BufferedRunnable.this.mBuffer.iterator();
                        while (it.hasNext()) {
                            StampedRunnable stampedRunnable = (StampedRunnable) it.next();
                            if (stampedRunnable.stamp > this.mGeneration) {
                                break;
                            }
                            arrayList.add(stampedRunnable);
                            it.remove();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            }
        }

        private static final class StampedRunnable implements Runnable {

            @NonNull
            private final Runnable mWrapped;
            public final long stamp;

            StampedRunnable(@NonNull Runnable runnable, long j11) {
                this.mWrapped = runnable;
                this.stamp = j11;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mWrapped.run();
            }
        }

        @NonNull
        public Runnable add(@NonNull Runnable runnable) {
            long j11;
            synchronized (this.mBuffer) {
                j11 = this.mGeneration + 1;
                this.mGeneration = j11;
                this.mBuffer.add(new StampedRunnable(runnable, j11));
            }
            return new Commit(j11);
        }
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context) {
        this(context, null, 0, false);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        super.surfaceRedrawNeededAsync(surfaceHolder, this.mBufferedRunnable.add(runnable));
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, boolean z11) {
        this(context, null, 0, z11);
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, false);
    }

    public PlatformGLSurfaceViewBelowApi34Workaround(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11, z11);
        this.mBufferedRunnable = new BufferedRunnable();
    }
}
