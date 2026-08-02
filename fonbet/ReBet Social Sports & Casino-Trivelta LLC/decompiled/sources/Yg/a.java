package Yg;

import Ph.C1483w0;
import io.ktor.utils.io.h;
import io.ktor.utils.io.i;
import io.ktor.utils.io.n;
import io.ktor.utils.io.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import mh.AbstractC5585a;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Yg.a$a, reason: collision with other inner class name */
    public static final class C0300a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f14238n;

        /* renamed from: o, reason: collision with root package name */
        public Object f14239o;

        /* renamed from: p, reason: collision with root package name */
        public Object f14240p;

        /* renamed from: q, reason: collision with root package name */
        public Object f14241q;

        /* renamed from: r, reason: collision with root package name */
        public Object f14242r;

        /* renamed from: s, reason: collision with root package name */
        public long f14243s;

        /* renamed from: t, reason: collision with root package name */
        public long f14244t;

        /* renamed from: u, reason: collision with root package name */
        public int f14245u;

        /* renamed from: v, reason: collision with root package name */
        public int f14246v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f14247w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Long f14248x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.f f14249y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function3 f14250z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0300a(Long l10, io.ktor.utils.io.f fVar, Function3 function3, Continuation continuation) {
            super(2, continuation);
            this.f14248x = l10;
            this.f14249y = fVar;
            this.f14250z = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0300a c0300a = new C0300a(this.f14248x, this.f14249y, this.f14250z, continuation);
            c0300a.f14247w = obj;
            return c0300a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r rVar, Continuation continuation) {
            return ((C0300a) create(rVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x019c, code lost:
        
            if (r11.invoke(r6, r4, r22) == r0) goto L63;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f3 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:10:0x019f, B:23:0x00ed, B:25:0x00f3, B:29:0x010d, B:42:0x016f, B:46:0x0180), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x016f A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:10:0x019f, B:23:0x00ed, B:25:0x00f3, B:29:0x010d, B:42:0x016f, B:46:0x0180), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [mh.f] */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v14, types: [mh.f] */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v2, types: [mh.f] */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v8, types: [mh.f] */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0161 -> B:21:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r32;
            long j10;
            io.ktor.utils.io.f fVar;
            long longValue;
            Function3 function3;
            byte[] bArr;
            r rVar;
            Object obj2;
            long j11;
            long j12;
            Object obj3;
            io.ktor.utils.io.f fVar2;
            long j13;
            mh.f fVar3;
            int i10;
            long j14;
            Long boxLong;
            Long boxLong2;
            Object obj4;
            mh.f fVar4;
            Object obj5;
            int intValue;
            i d10;
            mh.f fVar5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r22 = this.f14246v;
            int i11 = 1;
            try {
                if (r22 == 0) {
                    j10 = 0;
                    ResultKt.throwOnFailure(obj);
                    r rVar2 = (r) this.f14247w;
                    r32 = AbstractC5585a.a();
                    Long l10 = this.f14248x;
                    io.ktor.utils.io.f fVar6 = this.f14249y;
                    Function3 function32 = this.f14250z;
                    Object V02 = r32.V0();
                    try {
                        byte[] bArr2 = (byte[]) V02;
                        fVar = fVar6;
                        longValue = l10 != null ? l10.longValue() : -1L;
                        function3 = function32;
                        bArr = bArr2;
                        rVar = rVar2;
                        obj2 = V02;
                        j11 = 0;
                        fVar5 = r32;
                        if (!fVar.j()) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th2) {
                        th = th2;
                        r22 = V02;
                    }
                } else if (r22 == 1) {
                    j10 = 0;
                    long j15 = this.f14244t;
                    longValue = this.f14243s;
                    bArr = (byte[]) this.f14242r;
                    Object obj6 = this.f14241q;
                    function3 = (Function3) this.f14240p;
                    fVar = (io.ktor.utils.io.f) this.f14239o;
                    mh.f fVar7 = (mh.f) this.f14238n;
                    rVar = (r) this.f14247w;
                    try {
                        ResultKt.throwOnFailure(obj);
                        j11 = j15;
                        obj5 = obj6;
                        fVar4 = fVar7;
                        obj4 = obj;
                        intValue = ((Number) obj4).intValue();
                        d10 = rVar.d();
                        this.f14247w = rVar;
                        this.f14238n = fVar4;
                        this.f14239o = fVar;
                        this.f14240p = function3;
                        this.f14241q = obj5;
                        this.f14242r = bArr;
                        this.f14243s = longValue;
                        this.f14244t = j11;
                        this.f14245u = intValue;
                        this.f14246v = 2;
                        if (d10.h(bArr, 0, intValue, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        r22 = obj6;
                        r32 = fVar7;
                    }
                } else if (r22 == 2) {
                    j10 = 0;
                    i10 = this.f14245u;
                    long j16 = this.f14244t;
                    long j17 = this.f14243s;
                    byte[] bArr3 = (byte[]) this.f14242r;
                    obj3 = this.f14241q;
                    Function3 function33 = (Function3) this.f14240p;
                    io.ktor.utils.io.f fVar8 = (io.ktor.utils.io.f) this.f14239o;
                    mh.f fVar9 = (mh.f) this.f14238n;
                    r rVar3 = (r) this.f14247w;
                    try {
                        ResultKt.throwOnFailure(obj);
                        j12 = j16;
                        fVar2 = fVar8;
                        rVar = rVar3;
                        fVar3 = fVar9;
                        j13 = j17;
                        bArr = bArr3;
                        function3 = function33;
                        j14 = j12 + i10;
                        boxLong = Boxing.boxLong(j14);
                        boxLong2 = Boxing.boxLong(j13);
                        this.f14247w = rVar;
                        this.f14238n = fVar3;
                        this.f14239o = fVar2;
                        this.f14240p = function3;
                        this.f14241q = obj3;
                        this.f14242r = bArr;
                        this.f14243s = j13;
                        this.f14244t = j14;
                        this.f14246v = 3;
                        if (function3.invoke(boxLong, boxLong2, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (Throwable th4) {
                        th = th4;
                        r22 = obj3;
                        r32 = fVar9;
                    }
                } else {
                    if (r22 != 3) {
                        if (r22 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj7 = this.f14238n;
                        mh.f fVar10 = (mh.f) this.f14247w;
                        ResultKt.throwOnFailure(obj);
                        r22 = obj7;
                        r32 = fVar10;
                        Unit unit = Unit.INSTANCE;
                        r32.O1(r22);
                        return Unit.INSTANCE;
                    }
                    long j18 = this.f14244t;
                    long j19 = this.f14243s;
                    byte[] bArr4 = (byte[]) this.f14242r;
                    Object obj8 = this.f14241q;
                    Function3 function34 = (Function3) this.f14240p;
                    io.ktor.utils.io.f fVar11 = (io.ktor.utils.io.f) this.f14239o;
                    j10 = 0;
                    r32 = (mh.f) this.f14238n;
                    r rVar4 = (r) this.f14247w;
                    try {
                        ResultKt.throwOnFailure(obj);
                        rVar = rVar4;
                        longValue = j19;
                        function3 = function34;
                        fVar = fVar11;
                        long j20 = j18;
                        bArr = bArr4;
                        Object obj9 = obj8;
                        mh.f fVar12 = r32;
                        j11 = j20;
                        i11 = 1;
                        obj2 = obj9;
                        fVar5 = fVar12;
                        if (!fVar.j()) {
                            this.f14247w = rVar;
                            this.f14238n = fVar5;
                            this.f14239o = fVar;
                            this.f14240p = function3;
                            this.f14241q = obj2;
                            this.f14242r = bArr;
                            this.f14243s = longValue;
                            this.f14244t = j11;
                            this.f14246v = i11;
                            obj4 = h.b(fVar, bArr, this);
                            obj5 = obj2;
                            fVar4 = fVar5;
                            if (obj4 == coroutine_suspended) {
                            }
                            intValue = ((Number) obj4).intValue();
                            d10 = rVar.d();
                            this.f14247w = rVar;
                            this.f14238n = fVar4;
                            this.f14239o = fVar;
                            this.f14240p = function3;
                            this.f14241q = obj5;
                            this.f14242r = bArr;
                            this.f14243s = longValue;
                            this.f14244t = j11;
                            this.f14245u = intValue;
                            this.f14246v = 2;
                            if (d10.h(bArr, 0, intValue, this) != coroutine_suspended) {
                                try {
                                    j12 = j11;
                                    fVar2 = fVar;
                                    obj3 = obj5;
                                    j13 = longValue;
                                    i10 = intValue;
                                    fVar3 = fVar4;
                                    boxLong = Boxing.boxLong(j14);
                                    boxLong2 = Boxing.boxLong(j13);
                                    this.f14247w = rVar;
                                    this.f14238n = fVar3;
                                    this.f14239o = fVar2;
                                    this.f14240p = function3;
                                    this.f14241q = obj3;
                                    this.f14242r = bArr;
                                    this.f14243s = j13;
                                    this.f14244t = j14;
                                    this.f14246v = 3;
                                    if (function3.invoke(boxLong, boxLong2, this) != coroutine_suspended) {
                                        j20 = j14;
                                        fVar12 = fVar3;
                                        longValue = j13;
                                        obj9 = obj3;
                                        fVar = fVar2;
                                        j11 = j20;
                                        i11 = 1;
                                        obj2 = obj9;
                                        fVar5 = fVar12;
                                        if (!fVar.j()) {
                                            Throwable c10 = fVar.c();
                                            rVar.d().a(c10);
                                            r22 = obj2;
                                            r32 = fVar5;
                                            if (c10 == null) {
                                                r22 = obj2;
                                                r32 = fVar5;
                                                if (j11 == j10) {
                                                    Long boxLong3 = Boxing.boxLong(j11);
                                                    Long boxLong4 = Boxing.boxLong(longValue);
                                                    this.f14247w = fVar5;
                                                    this.f14238n = obj2;
                                                    this.f14239o = null;
                                                    this.f14240p = null;
                                                    this.f14241q = null;
                                                    this.f14242r = null;
                                                    this.f14246v = 4;
                                                    r22 = obj2;
                                                    r32 = fVar5;
                                                }
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                            r32.O1(r22);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r32 = fVar3;
                                    r22 = obj3;
                                }
                                j14 = j12 + i10;
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        th = th6;
                        r22 = obj8;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
            r32.O1(r22);
            throw th;
        }
    }

    public static final io.ktor.utils.io.f a(io.ktor.utils.io.f fVar, CoroutineContext context, Long l10, Function3 listener) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return n.b(C1483w0.f9135a, context, true, new C0300a(l10, fVar, listener, null)).d();
    }
}
