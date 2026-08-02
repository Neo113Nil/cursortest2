package io.ktor.utils.io;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import lh.C5466a;

/* loaded from: classes3.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f49437a = a.f49438a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f49438a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Lazy f49439b = LazyKt.lazy(C0730a.f49440d);

        /* renamed from: io.ktor.utils.io.f$a$a, reason: collision with other inner class name */
        public static final class C0730a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final C0730a f49440d = new C0730a();

            public C0730a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke() {
                c b10 = e.b(false, 1, null);
                j.a(b10);
                return b10;
            }
        }

        public final f a() {
            return (f) f49439b.getValue();
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(f fVar, long j10, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
            }
            if ((i10 & 1) != 0) {
                j10 = LongCompanionObject.MAX_VALUE;
            }
            return fVar.b(j10, continuation);
        }
    }

    Object b(long j10, Continuation continuation);

    Throwable c();

    boolean cancel(Throwable th2);

    int d();

    Object e(C5466a c5466a, Continuation continuation);

    Object f(byte[] bArr, int i10, int i11, Continuation continuation);

    boolean j();
}
