package androidx.media3.common;

import com.ironsource.X3;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class PriorityTaskManager {
    public final Object a = new Object();
    public final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    public int c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public final void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public final void b() throws InterruptedException {
        synchronized (this.a) {
            while (this.c != -4000) {
                try {
                    this.a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(int i) throws PriorityTooLowException {
        synchronized (this.a) {
            try {
                if (this.c != i) {
                    throw new PriorityTooLowException("Priority too low [priority=" + i + ", highest=" + this.c + X3.j.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i) {
        int intValue;
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            if (this.b.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                Integer peek = this.b.peek();
                String str = y2r0.a;
                intValue = peek.intValue();
            }
            this.c = intValue;
            this.a.notifyAll();
        }
    }
}
