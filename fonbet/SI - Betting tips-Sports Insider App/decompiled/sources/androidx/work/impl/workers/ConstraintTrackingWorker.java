package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.lifecycle.u0;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c1.g;
import c4.d;
import com.android.billingclient.api.m;
import e3.h;
import e3.l;
import e3.s;
import e3.t;
import e3.w;
import e3.x;
import e5.p;
import eg.c0;
import f3.v;
import i3.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lf.a;
import m3.o;
import mf.c;
import org.jetbrains.annotations.NotNull;
import p3.b;
import p3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p3/a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n29#2:169\n19#2:170\n19#2:171\n19#2:172\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n*L\n65#1:169\n75#1:170\n78#1:171\n87#1:172\n*E\n"})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: g, reason: collision with root package name */
    public final WorkerParameters f2942g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f2942g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(ConstraintTrackingWorker constraintTrackingWorker, w wVar, m mVar, o oVar, c cVar) {
        b bVar;
        int i5;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f21499c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f21499c = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f21497a;
                a aVar = a.f20034a;
                i5 = bVar.f21499c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    g gVar = new g(wVar, mVar, oVar, (Continuation) null, 4);
                    bVar.f21499c = 1;
                    obj = c0.i(gVar, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "coroutineScope(...)");
                return obj;
            }
        }
        bVar = new b(constraintTrackingWorker, cVar);
        Object obj2 = bVar.f21497a;
        a aVar2 = a.f20034a;
        i5 = bVar.f21499c;
        if (i5 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "coroutineScope(...)");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(ConstraintTrackingWorker constraintTrackingWorker, c cVar) {
        p3.c cVar2;
        int i5;
        AtomicInteger atomicInteger;
        o oVar;
        w a7;
        eg.w l6;
        int i10;
        AtomicInteger atomicInteger2 = constraintTrackingWorker.f8567c;
        WorkerParameters workerParameters = constraintTrackingWorker.f2942g;
        Context context = constraintTrackingWorker.f8565a;
        WorkerParameters workerParameters2 = constraintTrackingWorker.f8566b;
        try {
            if (cVar instanceof p3.c) {
                cVar2 = (p3.c) cVar;
                int i11 = cVar2.f21503d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar2.f21503d = i11 - Integer.MIN_VALUE;
                    p3.c cVar3 = cVar2;
                    Object obj = cVar3.f21501b;
                    a aVar = a.f20034a;
                    i5 = cVar3.f21503d;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        String b10 = workerParameters2.f2918b.b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                        if (b10 == null || b10.length() == 0) {
                            x.e().c(f.f21509a, "No worker to delegate to.");
                            s sVar = new s();
                            Intrinsics.checkNotNullExpressionValue(sVar, "failure(...)");
                            return sVar;
                        }
                        v e7 = v.e(context);
                        Intrinsics.checkNotNullExpressionValue(e7, "getInstance(...)");
                        m3.s y5 = e7.f9428c.y();
                        String uuid = workerParameters2.f2917a.toString();
                        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                        o workSpec = y5.c(uuid);
                        if (workSpec == null) {
                            s sVar2 = new s();
                            Intrinsics.checkNotNullExpressionValue(sVar2, "failure(...)");
                            return sVar2;
                        }
                        d dVar = e7.j;
                        Intrinsics.checkNotNullExpressionValue(dVar, "getTrackers(...)");
                        m mVar = new m(dVar);
                        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                        ArrayList arrayList = new ArrayList();
                        Iterator it = mVar.f4046a.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((j3.d) next).c(workSpec)) {
                                arrayList.add(next);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            atomicInteger = atomicInteger2;
                            oVar = workSpec;
                        } else {
                            x e9 = x.e();
                            String str = k.f10922a;
                            atomicInteger = atomicInteger2;
                            StringBuilder sb2 = new StringBuilder("Work ");
                            sb2.append(workSpec.f20331a);
                            sb2.append(" constrained by ");
                            oVar = workSpec;
                            sb2.append(CollectionsKt.J(arrayList, null, null, null, new f1.a(26), 31));
                            e9.a(str, sb2.toString());
                        }
                        if (!arrayList.isEmpty()) {
                            String str2 = f.f21509a;
                            x.e().a(str2, "Constraints not met for delegate " + b10 + ". Requesting retry.");
                            t tVar = new t();
                            Intrinsics.checkNotNullExpressionValue(tVar, "retry(...)");
                            return tVar;
                        }
                        x.e().a(f.f21509a, "Constraints met for delegate ".concat(b10));
                        try {
                            l lVar = workerParameters2.f2923g;
                            Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                            a7 = lVar.a(context, b10, workerParameters);
                            p pVar = (p) workerParameters.f2922f.f6185d;
                            Intrinsics.checkNotNullExpressionValue(pVar, "getMainThreadExecutor(...)");
                            try {
                                l6 = c0.l(pVar);
                            } catch (CancellationException e10) {
                                e = e10;
                            }
                            try {
                                u0 u0Var = new u0(constraintTrackingWorker, a7, mVar, oVar, (Continuation) null, 12);
                                cVar3.f21500a = a7;
                                cVar3.f21503d = 1;
                                obj = c0.A(l6, u0Var, cVar3);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                a7 = a7;
                            } catch (CancellationException e11) {
                                e = e11;
                                a7 = a7;
                                if (atomicInteger.get() == -256) {
                                }
                                if (Build.VERSION.SDK_INT < 31) {
                                }
                                a7.f8567c.compareAndSet(-256, i10);
                                if (!(e instanceof p3.a)) {
                                }
                            }
                        } catch (Throwable unused) {
                            x.e().a(f.f21509a, "No worker to delegate to.");
                            e7.f9427b.getClass();
                            s sVar3 = new s();
                            Intrinsics.checkNotNullExpressionValue(sVar3, "failure(...)");
                            return sVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a7 = cVar3.f21500a;
                        try {
                            h8.b.B(obj);
                            atomicInteger = atomicInteger2;
                        } catch (CancellationException e12) {
                            e = e12;
                            atomicInteger = atomicInteger2;
                            if (atomicInteger.get() == -256) {
                            }
                            if (Build.VERSION.SDK_INT < 31) {
                            }
                            a7.f8567c.compareAndSet(-256, i10);
                            if (!(e instanceof p3.a)) {
                            }
                        }
                    }
                    return (e3.v) obj;
                }
            }
            return (e3.v) obj;
        } catch (CancellationException e13) {
            e = e13;
            if (atomicInteger.get() == -256 || (e instanceof p3.a)) {
                if (Build.VERSION.SDK_INT < 31) {
                    i10 = -512;
                } else if (atomicInteger.get() != -256) {
                    i10 = atomicInteger.get();
                } else {
                    if (!(e instanceof p3.a)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    i10 = ((p3.a) e).f21496a;
                }
                a7.f8567c.compareAndSet(-256, i10);
            }
            if (!(e instanceof p3.a)) {
                throw e;
            }
            t tVar2 = new t();
            Intrinsics.checkNotNull(tVar2);
            return tVar2;
        }
        cVar2 = new p3.c(constraintTrackingWorker, cVar);
        p3.c cVar32 = cVar2;
        Object obj2 = cVar32.f21501b;
        a aVar2 = a.f20034a;
        i5 = cVar32.f21503d;
        if (i5 != 0) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(h hVar) {
        ExecutorService executorService = this.f8566b.f2920d;
        Intrinsics.checkNotNullExpressionValue(executorService, "getBackgroundExecutor(...)");
        return c0.A(c0.l(executorService), new androidx.lifecycle.b(this, (Continuation) null, 18), hVar);
    }
}
