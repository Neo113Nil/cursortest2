package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import androidx.appcompat.app.t;
import com.google.firebase.messaging.u;
import io.sentry.b5;
import io.sentry.b6;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15736c;

    public /* synthetic */ k(int i5, Object obj, Object obj2) {
        this.f15734a = i5;
        this.f15735b = obj;
        this.f15736c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i5) {
        switch (this.f15734a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f15735b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f15736c;
                atomicBoolean.set(i5 == 0);
                countDownLatch.countDown();
                break;
            default:
                io.sentry.android.replay.screenshot.g gVar = (io.sentry.android.replay.screenshot.g) this.f15735b;
                View view = (View) this.f15736c;
                AtomicBoolean atomicBoolean2 = gVar.f16106m;
                AtomicBoolean atomicBoolean3 = gVar.j;
                b6 b6Var = gVar.f16096b;
                if (!atomicBoolean2.get()) {
                    if (i5 == 0) {
                        if (!gVar.f16105l.get()) {
                            io.sentry.android.replay.viewhierarchy.f h10 = u6.h.h(view, null, b6Var);
                            u.n(view, h10, b6Var);
                            gVar.f16098d.submit(new io.sentry.android.replay.util.g(new t(gVar, h10, view), "screenshot_recorder.mask"));
                            break;
                        } else {
                            b6Var.getLogger().h(b5.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                            atomicBoolean3.set(false);
                            break;
                        }
                    } else {
                        b6Var.getLogger().h(b5.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i5));
                        atomicBoolean3.set(false);
                        break;
                    }
                } else {
                    b6Var.getLogger().h(b5.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                    break;
                }
        }
    }
}
