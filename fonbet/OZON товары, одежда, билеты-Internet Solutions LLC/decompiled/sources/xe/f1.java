package xe;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f1 {

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {101}, m = "withTimeoutOrNull")
    static final class a<T> extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Function2 f105456d;

        /* renamed from: e, reason: collision with root package name */
        kotlin.jvm.internal.M f105457e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105458f;

        /* renamed from: g, reason: collision with root package name */
        int f105459g;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f105458f = obj;
            this.f105459g |= LinearLayoutManager.INVALID_OFFSET;
            return f1.c(0L, null, this);
        }
    }

    private static final <U, T extends U> Object a(e1<U, ? super T> e1Var, Function2<? super M, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        Object c10760z;
        Object f02;
        E0.h(e1Var, new C10728i0(Y.d(e1Var.f6652d.getContext()).k(e1Var.f105454e, e1Var, e1Var.getContext())));
        try {
            if (function2 == null) {
                c10760z = Wc.b.c(function2, e1Var, e1Var);
            } else {
                kotlin.jvm.internal.U.g(2, function2);
                c10760z = function2.invoke(e1Var, e1Var);
            }
        } catch (Throwable th2) {
            c10760z = new C10760z(false, th2);
        }
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (c10760z == aVar || (f02 = e1Var.f0(c10760z)) == I0.f105399b) {
            return aVar;
        }
        if (f02 instanceof C10760z) {
            Throwable th3 = ((C10760z) f02).f105510a;
            if (!(th3 instanceof d1)) {
                throw th3;
            }
            if (((d1) th3).f105447a != e1Var) {
                throw th3;
            }
            if (c10760z instanceof C10760z) {
                throw ((C10760z) c10760z).f105510a;
            }
        } else {
            c10760z = I0.g(f02);
        }
        return c10760z;
    }

    public static final <T> Object b(long j11, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> frame) {
        if (j11 <= 0) {
            throw new d1("Timed out immediately", null);
        }
        Object a11 = a(new e1(j11, frame), function2);
        if (a11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, xe.e1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(long j11, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        a frame;
        int i11;
        kotlin.jvm.internal.M m11;
        if (dVar instanceof a) {
            frame = (a) dVar;
            int i12 = frame.f105459g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f105459g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f105458f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f105459g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (j11 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                    try {
                        frame.f105456d = function2;
                        frame.f105457e = m12;
                        frame.f105459g = 1;
                        ?? r22 = (T) new e1(j11, frame);
                        m12.f71787a = r22;
                        Object a11 = a(r22, function2);
                        if (a11 == aVar) {
                            try {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            } catch (d1 e11) {
                                e = e11;
                                m11 = m12;
                                if (e.f105447a == m11.f71787a) {
                                }
                            }
                        }
                        return a11 == aVar ? aVar : a11;
                    } catch (d1 e12) {
                        e = e12;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m11 = frame.f105457e;
                    try {
                        Sc.s.b(obj);
                        return obj;
                    } catch (d1 e13) {
                        e = e13;
                    }
                }
                if (e.f105447a == m11.f71787a) {
                    return null;
                }
                throw e;
            }
        }
        frame = new a(dVar);
        Object obj2 = frame.f105458f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f105459g;
        if (i11 != 0) {
        }
        if (e.f105447a == m11.f71787a) {
        }
    }
}
