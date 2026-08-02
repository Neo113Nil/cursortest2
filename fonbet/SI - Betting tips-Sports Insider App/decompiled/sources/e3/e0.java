package e3;

import android.os.Trace;
import android.view.View;
import androidx.lifecycle.p0;
import io.sentry.ILogger;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.b5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8502c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8505f;

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f8500a = i5;
        this.f8501b = obj;
        this.f8502c = obj2;
        this.f8503d = obj3;
        this.f8504e = obj4;
        this.f8505f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f8500a;
        Object obj = this.f8505f;
        Object obj2 = this.f8504e;
        Object obj3 = this.f8503d;
        Object obj4 = this.f8502c;
        Object obj5 = this.f8501b;
        switch (i5) {
            case 0:
                String label = (String) obj4;
                Function0 function0 = (Function0) obj3;
                p0 p0Var = (p0) obj2;
                u.h hVar = (u.h) obj;
                ((l) obj5).getClass();
                boolean r5 = m4.g.r();
                if (r5) {
                    try {
                        Intrinsics.checkNotNullParameter(label, "label");
                        Trace.beginSection(m4.g.B(label));
                    } finally {
                        if (r5) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    function0.invoke();
                    c0 c0Var = l.f8537c;
                    p0Var.h(c0Var);
                    hVar.a(c0Var);
                } catch (Throwable th2) {
                    p0Var.h(new b0(th2));
                    hVar.b(th2);
                }
                Unit unit = Unit.f19194a;
                if (r5) {
                    return;
                } else {
                    return;
                }
            default:
                AtomicReference atomicReference = (AtomicReference) obj5;
                View view = (View) obj4;
                List list = (List) obj3;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                ILogger iLogger = (ILogger) obj;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    io.sentry.protocol.j0 j0Var = new io.sentry.protocol.j0("android_view_system", arrayList);
                    io.sentry.protocol.k0 b10 = ViewHierarchyEventProcessor.b(view);
                    arrayList.add(b10);
                    ViewHierarchyEventProcessor.a(view, b10, list);
                    atomicReference.set(j0Var);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th3) {
                    iLogger.e(b5.ERROR, "Failed to process view hierarchy.", th3);
                    return;
                }
        }
    }
}
