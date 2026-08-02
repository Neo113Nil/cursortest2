package j3;

import Sc.C4005g;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* renamed from: j3.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7248D {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (c(r5, r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (xe.C10727i.f(r2, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a b(@NotNull y yVar, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        z zVar;
        int i11;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i12 = zVar.f69361e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                zVar.f69361e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = zVar.f69360d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = zVar.f69361e;
                if (i11 == 0) {
                    if (i11 == 1) {
                        Sc.s.b(obj);
                        throw new C4005g();
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    throw new C4005g();
                }
                Sc.s.b(obj);
                if (Intrinsics.d(Looper.myLooper(), yVar.H())) {
                    zVar.f69361e = 1;
                } else {
                    Handler a11 = androidx.core.os.h.a(yVar.H());
                    Intrinsics.checkNotNullExpressionValue(a11, "createAsync(...)");
                    int i13 = ye.j.f106590a;
                    ye.f fVar = new ye.f(a11, null);
                    C7245A c7245a = new C7245A(yVar, function2, null);
                    zVar.f69361e = 2;
                }
                return aVar;
            }
        }
        zVar = new z(cVar);
        Object obj2 = zVar.f69360d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = zVar.f69361e;
        if (i11 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, j3.E] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a c(y yVar, Function2 function2, kotlin.coroutines.jvm.internal.c cVar) {
        C7246B frame;
        int i11;
        kotlin.jvm.internal.M m11;
        T t2;
        if (cVar instanceof C7246B) {
            frame = (C7246B) cVar;
            int i12 = frame.f68929h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f68929h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f68928g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f68929h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    m11 = new kotlin.jvm.internal.M();
                    try {
                        frame.f68925d = yVar;
                        frame.f68926e = function2;
                        frame.f68927f = m11;
                        frame.f68929h = 1;
                        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                        c10737n.o();
                        m11.f71787a = new C7249E(function2, c10737n);
                        c10737n.q(new C7247C(m11));
                        T t11 = m11.f71787a;
                        if (t11 == 0) {
                            Intrinsics.n(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        yVar.t((C7249E) t11);
                        Object n11 = c10737n.n();
                        if (n11 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (n11 == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        t2 = m11.f71787a;
                        if (t2 != 0) {
                            Intrinsics.n(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        yVar.j((C7249E) t2);
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.M m12 = frame.f68927f;
                    y yVar2 = frame.f68925d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th3) {
                        m11 = m12;
                        yVar = yVar2;
                        th = th3;
                        t2 = m11.f71787a;
                        if (t2 != 0) {
                        }
                    }
                }
                throw new C4005g();
            }
        }
        frame = new C7246B(cVar);
        Object obj2 = frame.f68928g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f68929h;
        if (i11 != 0) {
        }
        throw new C4005g();
    }
}
