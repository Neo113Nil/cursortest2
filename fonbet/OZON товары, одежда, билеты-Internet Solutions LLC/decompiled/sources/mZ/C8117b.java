package mZ;

import De.C2862e;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.J;
import xe.N;
import xe.X0;
import xe.Y;

/* renamed from: mZ.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8117b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2862e f74681a;

    /* renamed from: mZ.b$a */
    public static final class a extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            C8116a.f74679a.c("CDN chooser coroutine error", th2);
        }
    }

    static {
        a aVar = new a(J.f105405n0);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        f74681a = N.a(CoroutineContext.Element.a.d(He.b.f10879b, (H0) b11).plus(aVar));
    }

    @NotNull
    public static final C2862e a() {
        return f74681a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:12|(3:13|14|15)|16|17|18|19|20|(2:30|31)(3:23|(2:25|26)|28)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(10:5|6|7|(1:(1:(1:(10:12|13|14|15|16|17|18|19|20|(2:30|31)(3:23|(2:25|26)|28))(2:40|41))(2:42|26))(4:43|44|45|46))(2:56|(2:58|(2:60|(5:62|63|64|(1:66)|28)(2:69|70))(2:71|72))(2:73|74))|47|48|20|(0)|30|31))|7|(0)(0)|47|48|20|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
    
        if (r0 != r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        r15 = r9;
        r9 = r6;
        r6 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0108 -> B:16:0x010b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(int i11, long j11, double d11, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C8118c c8118c;
        Object obj;
        int i12;
        int i13;
        Function1 function12;
        int i14;
        boolean z11;
        int i15;
        long j12;
        double d12;
        int i16;
        int i17 = i11;
        long j13 = j11;
        double d13 = d11;
        Function1 function13 = function1;
        try {
            if (cVar instanceof C8118c) {
                c8118c = (C8118c) cVar;
                int i18 = c8118c.f74688j;
                if ((i18 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c8118c.f74688j = i18 - LinearLayoutManager.INVALID_OFFSET;
                    obj = c8118c.f74687i;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i12 = c8118c.f74688j;
                    boolean z12 = true;
                    if (i12 != 0) {
                        s.b(obj);
                        if (i17 <= 0) {
                            throw new IllegalArgumentException("maxRetries must be positive");
                        }
                        if (j13 <= 0) {
                            throw new IllegalArgumentException("baseDelay must be positive");
                        }
                        if (d13 <= 1.0d) {
                            throw new IllegalArgumentException("delayFactor must be > 1");
                        }
                        i13 = 0;
                        try {
                            r.Companion companion = r.INSTANCE;
                            c8118c.f74686h = function13;
                            c8118c.f74682d = i17;
                            c8118c.f74684f = j13;
                            c8118c.f74685g = d13;
                            c8118c.f74683e = 0;
                            c8118c.f74688j = 1;
                            obj = function13.invoke(c8118c);
                            if (obj != aVar) {
                                function12 = function13;
                                i14 = 0;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r.Companion companion2 = r.INSTANCE;
                            obj = s.a(th);
                            int i19 = i13;
                            function12 = function13;
                            i14 = i19;
                            r.Companion companion3 = r.INSTANCE;
                            if (obj instanceof r.b) {
                            }
                            s.b(obj);
                            return obj;
                        }
                        return aVar;
                    }
                    if (i12 == 1) {
                        int i21 = c8118c.f74683e;
                        double d14 = c8118c.f74685g;
                        long j14 = c8118c.f74684f;
                        int i22 = c8118c.f74682d;
                        function12 = c8118c.f74686h;
                        try {
                            s.b(obj);
                            i14 = i21;
                            i17 = i22;
                            d13 = d14;
                            j13 = j14;
                        } catch (Throwable th3) {
                            th = th3;
                            i13 = i21;
                            i17 = i22;
                            function13 = function12;
                            d13 = d14;
                            j13 = j14;
                            r.Companion companion22 = r.INSTANCE;
                            obj = s.a(th);
                            int i192 = i13;
                            function12 = function13;
                            i14 = i192;
                            r.Companion companion32 = r.INSTANCE;
                            if (obj instanceof r.b) {
                            }
                            s.b(obj);
                            return obj;
                        }
                    } else {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i16 = c8118c.f74683e;
                            d12 = c8118c.f74685g;
                            j12 = c8118c.f74684f;
                            i15 = c8118c.f74682d;
                            function12 = c8118c.f74686h;
                            try {
                                try {
                                    s.b(obj);
                                    z11 = true;
                                } catch (CancellationException e11) {
                                    throw e11;
                                }
                            } catch (Throwable th4) {
                                Throwable th5 = th4;
                                z11 = true;
                                r.Companion companion4 = r.INSTANCE;
                                obj = s.a(th5);
                                long j15 = j12;
                                d13 = d12;
                                j13 = j15;
                                int i23 = i15;
                                i14 = i16 + 1;
                                i17 = i23;
                                z12 = z11;
                                r.Companion companion322 = r.INSTANCE;
                                if (obj instanceof r.b) {
                                }
                                s.b(obj);
                                return obj;
                            }
                            r.Companion companion5 = r.INSTANCE;
                            long j152 = j12;
                            d13 = d12;
                            j13 = j152;
                            int i232 = i15;
                            i14 = i16 + 1;
                            i17 = i232;
                            z12 = z11;
                            r.Companion companion3222 = r.INSTANCE;
                            if ((obj instanceof r.b) || i14 >= i17) {
                                s.b(obj);
                                return obj;
                            }
                            z11 = z12;
                            double pow = Math.pow(d13, i14);
                            c8118c.f74686h = function12;
                            c8118c.f74682d = i17;
                            c8118c.f74684f = j13;
                            c8118c.f74685g = d13;
                            c8118c.f74683e = i14;
                            c8118c.f74688j = 2;
                            if (Y.b((long) (pow * j13), c8118c) != aVar) {
                                int i24 = i14;
                                i15 = i17;
                                i16 = i24;
                                double d15 = d13;
                                j12 = j13;
                                d12 = d15;
                                r.Companion companion6 = r.INSTANCE;
                                c8118c.f74686h = function12;
                                c8118c.f74682d = i15;
                                c8118c.f74684f = j12;
                                c8118c.f74685g = d12;
                                c8118c.f74683e = i16;
                                c8118c.f74688j = 3;
                                obj = function12.invoke(c8118c);
                            }
                            return aVar;
                        }
                        i16 = c8118c.f74683e;
                        d12 = c8118c.f74685g;
                        j12 = c8118c.f74684f;
                        i15 = c8118c.f74682d;
                        function12 = c8118c.f74686h;
                        s.b(obj);
                        z11 = true;
                        r.Companion companion62 = r.INSTANCE;
                        c8118c.f74686h = function12;
                        c8118c.f74682d = i15;
                        c8118c.f74684f = j12;
                        c8118c.f74685g = d12;
                        c8118c.f74683e = i16;
                        c8118c.f74688j = 3;
                        obj = function12.invoke(c8118c);
                    }
                    r.Companion companion7 = r.INSTANCE;
                    r.Companion companion32222 = r.INSTANCE;
                    if (obj instanceof r.b) {
                    }
                    s.b(obj);
                    return obj;
                }
            }
            if (i12 != 0) {
            }
            r.Companion companion72 = r.INSTANCE;
            r.Companion companion322222 = r.INSTANCE;
            if (obj instanceof r.b) {
            }
            s.b(obj);
            return obj;
        } catch (CancellationException e12) {
            throw e12;
        }
        c8118c = new C8118c(cVar);
        obj = c8118c.f74687i;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = c8118c.f74688j;
        boolean z122 = true;
    }
}
