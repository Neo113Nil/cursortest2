package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: kotlinx.coroutines.flow.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC5328j {

    /* renamed from: kotlinx.coroutines.flow.j$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54792n;

        /* renamed from: o, reason: collision with root package name */
        public Object f54793o;

        /* renamed from: p, reason: collision with root package name */
        public Object f54794p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f54795q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f54796r;

        /* renamed from: s, reason: collision with root package name */
        public int f54797s;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54796r = obj;
            this.f54797s |= Integer.MIN_VALUE;
            return AbstractC5328j.d(null, null, false, this);
        }
    }

    public static final InterfaceC5321f b(Rh.A a10) {
        return new C5318c(a10, true, null, 0, null, 28, null);
    }

    public static final Object c(InterfaceC5322g interfaceC5322g, Rh.A a10, Continuation continuation) {
        Object d10 = d(interfaceC5322g, a10, true, continuation);
        return d10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d10 : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:20:0x0077, B:22:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(InterfaceC5322g interfaceC5322g, Rh.A a10, boolean z10, Continuation continuation) {
        a aVar;
        int i10;
        Rh.l it;
        Rh.l lVar;
        InterfaceC5322g interfaceC5322g2;
        Object b10;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54797s;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54797s = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f54796r;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54797s;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        AbstractC5323h.q(interfaceC5322g);
                        it = a10.iterator();
                        aVar.f54792n = interfaceC5322g;
                        aVar.f54793o = a10;
                        aVar.f54794p = it;
                        aVar.f54795q = z10;
                        aVar.f54797s = 1;
                        b10 = it.b(aVar);
                        if (b10 != coroutine_suspended) {
                        }
                    } else if (i10 == 1) {
                        z10 = aVar.f54795q;
                        lVar = (Rh.l) aVar.f54794p;
                        a10 = (Rh.A) aVar.f54793o;
                        interfaceC5322g2 = (InterfaceC5322g) aVar.f54792n;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = aVar.f54795q;
                        lVar = (Rh.l) aVar.f54794p;
                        a10 = (Rh.A) aVar.f54793o;
                        interfaceC5322g2 = (InterfaceC5322g) aVar.f54792n;
                        ResultKt.throwOnFailure(obj);
                        it = lVar;
                        interfaceC5322g = interfaceC5322g2;
                        aVar.f54792n = interfaceC5322g;
                        aVar.f54793o = a10;
                        aVar.f54794p = it;
                        aVar.f54795q = z10;
                        aVar.f54797s = 1;
                        b10 = it.b(aVar);
                        if (b10 != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC5322g2 = interfaceC5322g;
                        lVar = it;
                        obj = b10;
                        if (((Boolean) obj).booleanValue()) {
                            if (z10) {
                                Rh.p.a(a10, null);
                            }
                            return Unit.INSTANCE;
                        }
                        Object next = lVar.next();
                        aVar.f54792n = interfaceC5322g2;
                        aVar.f54793o = a10;
                        aVar.f54794p = lVar;
                        aVar.f54795q = z10;
                        aVar.f54797s = 2;
                    }
                }
            }
            if (i10 != 0) {
            }
        } finally {
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f54796r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f54797s;
    }
}
