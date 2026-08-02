package kotlinx.coroutines.flow.internal;

import Ph.AbstractC1459k;
import Ph.P;
import Rh.B;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public abstract class l {

    public static final class a extends SuspendLambda implements Function2 {
        final /* synthetic */ InterfaceC5321f[] $flows;

        /* renamed from: n, reason: collision with root package name */
        public Object f54757n;

        /* renamed from: o, reason: collision with root package name */
        public Object f54758o;

        /* renamed from: p, reason: collision with root package name */
        public int f54759p;

        /* renamed from: q, reason: collision with root package name */
        public int f54760q;

        /* renamed from: r, reason: collision with root package name */
        public int f54761r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f54762s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Function0 f54763t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function3 f54764u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54765v;

        /* renamed from: kotlinx.coroutines.flow.internal.l$a$a, reason: collision with other inner class name */
        public static final class C0793a extends SuspendLambda implements Function2 {
            final /* synthetic */ InterfaceC5321f[] $flows;

            /* renamed from: n, reason: collision with root package name */
            public int f54766n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ int f54767o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f54768p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Rh.j f54769q;

            /* renamed from: kotlinx.coroutines.flow.internal.l$a$a$a, reason: collision with other inner class name */
            public static final class C0794a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Rh.j f54770a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f54771b;

                /* renamed from: kotlinx.coroutines.flow.internal.l$a$a$a$a, reason: collision with other inner class name */
                public static final class C0795a extends ContinuationImpl {

                    /* renamed from: n, reason: collision with root package name */
                    public /* synthetic */ Object f54772n;

                    /* renamed from: p, reason: collision with root package name */
                    public int f54774p;

                    public C0795a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f54772n = obj;
                        this.f54774p |= Integer.MIN_VALUE;
                        return C0794a.this.emit(null, this);
                    }
                }

                public C0794a(Rh.j jVar, int i10) {
                    this.f54770a = jVar;
                    this.f54771b = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
                
                    if (Ph.n1.a(r0) != r1) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
                
                    if (r8.o(r2, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0795a c0795a;
                    int i10;
                    if (continuation instanceof C0795a) {
                        c0795a = (C0795a) continuation;
                        int i11 = c0795a.f54774p;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0795a.f54774p = i11 - Integer.MIN_VALUE;
                            Object obj2 = c0795a.f54772n;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i10 = c0795a.f54774p;
                            if (i10 != 0) {
                                ResultKt.throwOnFailure(obj2);
                                Rh.j jVar = this.f54770a;
                                IndexedValue indexedValue = new IndexedValue(this.f54771b, obj);
                                c0795a.f54774p = 1;
                            } else {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            c0795a.f54774p = 2;
                        }
                    }
                    c0795a = new C0795a(continuation);
                    Object obj22 = c0795a.f54772n;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0795a.f54774p;
                    if (i10 != 0) {
                    }
                    c0795a.f54774p = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0793a(InterfaceC5321f[] interfaceC5321fArr, int i10, AtomicInteger atomicInteger, Rh.j jVar, Continuation continuation) {
                super(2, continuation);
                this.$flows = interfaceC5321fArr;
                this.f54767o = i10;
                this.f54768p = atomicInteger;
                this.f54769q = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0793a(this.$flows, this.f54767o, this.f54768p, this.f54769q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0793a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f54766n;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC5321f[] interfaceC5321fArr = this.$flows;
                        int i11 = this.f54767o;
                        InterfaceC5321f interfaceC5321f = interfaceC5321fArr[i11];
                        C0794a c0794a = new C0794a(this.f54769q, i11);
                        this.f54766n = 1;
                        if (interfaceC5321f.collect(c0794a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        B.a.a(this.f54769q, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.f54768p.decrementAndGet() == 0) {
                        B.a.a(this.f54769q, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5321f[] interfaceC5321fArr, Function0 function0, Function3 function3, InterfaceC5322g interfaceC5322g, Continuation continuation) {
            super(2, continuation);
            this.$flows = interfaceC5321fArr;
            this.f54763t = function0;
            this.f54764u = function3;
            this.f54765v = interfaceC5322g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.$flows, this.f54763t, this.f54764u, this.f54765v, continuation);
            aVar.f54762s = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[LOOP:0: B:18:0x00c1->B:33:?, LOOP_START, PHI: r6 r10
          0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]
          0x00c1: PHI (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v12 kotlin.collections.IndexedValue) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0106 -> B:10:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0126 -> B:10:0x0129). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            int i10;
            byte[] bArr;
            Object[] objArr;
            Rh.j jVar;
            Object obj2;
            Object[] objArr2;
            byte[] bArr2;
            int i11;
            int i12;
            IndexedValue indexedValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i13 = this.f54761r;
            if (i13 == 0) {
                ResultKt.throwOnFailure(obj);
                P p10 = (P) this.f54762s;
                length = this.$flows.length;
                if (length == 0) {
                    return Unit.INSTANCE;
                }
                Object[] objArr3 = new Object[length];
                ArraysKt.fill$default(objArr3, t.f54781b, 0, 0, 6, (Object) null);
                Rh.j b10 = Rh.m.b(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                i10 = 0;
                int i14 = 0;
                while (i14 < length) {
                    AtomicInteger atomicInteger2 = atomicInteger;
                    AbstractC1459k.d(p10, null, null, new C0793a(this.$flows, i14, atomicInteger2, b10, null), 3, null);
                    i14++;
                    atomicInteger = atomicInteger2;
                }
                bArr = new byte[length];
                objArr = objArr3;
                jVar = b10;
                byte b11 = (byte) (i10 + 1);
                this.f54762s = objArr;
                this.f54757n = jVar;
                this.f54758o = bArr;
                this.f54759p = length;
                this.f54760q = b11;
                this.f54761r = 1;
                obj2 = jVar.j(this);
                if (obj2 != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i13 != 1) {
                if (i13 != 2 && i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = this.f54760q;
                i11 = this.f54759p;
                bArr2 = (byte[]) this.f54758o;
                jVar = (Rh.j) this.f54757n;
                objArr2 = (Object[]) this.f54762s;
                ResultKt.throwOnFailure(obj);
                i10 = i12;
                length = i11;
                bArr = bArr2;
                objArr = objArr2;
                byte b112 = (byte) (i10 + 1);
                this.f54762s = objArr;
                this.f54757n = jVar;
                this.f54758o = bArr;
                this.f54759p = length;
                this.f54760q = b112;
                this.f54761r = 1;
                obj2 = jVar.j(this);
                if (obj2 != coroutine_suspended) {
                    byte[] bArr3 = bArr;
                    i11 = length;
                    i12 = b112;
                    objArr2 = objArr;
                    bArr2 = bArr3;
                    indexedValue = (IndexedValue) Rh.n.f(obj2);
                    if (indexedValue != null) {
                        return Unit.INSTANCE;
                    }
                    while (true) {
                        int index = indexedValue.getIndex();
                        Object obj3 = objArr2[index];
                        objArr2[index] = indexedValue.getValue();
                        if (obj3 == t.f54781b) {
                            i11--;
                        }
                        if (bArr2[index] != i12) {
                            bArr2[index] = (byte) i12;
                            indexedValue = (IndexedValue) Rh.n.f(jVar.i());
                            if (indexedValue != null) {
                            }
                        }
                        if (i11 == 0) {
                            Object[] objArr4 = (Object[]) this.f54763t.invoke();
                            if (objArr4 == null) {
                                Function3 function3 = this.f54764u;
                                InterfaceC5322g interfaceC5322g = this.f54765v;
                                this.f54762s = objArr2;
                                this.f54757n = jVar;
                                this.f54758o = bArr2;
                                this.f54759p = i11;
                                this.f54760q = i12;
                                this.f54761r = 2;
                            } else {
                                ArraysKt.copyInto$default(objArr2, objArr4, 0, 0, 0, 14, (Object) null);
                                Function3 function32 = this.f54764u;
                                InterfaceC5322g interfaceC5322g2 = this.f54765v;
                                this.f54762s = objArr2;
                                this.f54757n = jVar;
                                this.f54758o = bArr2;
                                this.f54759p = i11;
                                this.f54760q = i12;
                                this.f54761r = 3;
                            }
                            byte b1122 = (byte) (i10 + 1);
                            this.f54762s = objArr;
                            this.f54757n = jVar;
                            this.f54758o = bArr;
                            this.f54759p = length;
                            this.f54760q = b1122;
                            this.f54761r = 1;
                            obj2 = jVar.j(this);
                            if (obj2 != coroutine_suspended) {
                            }
                        }
                    }
                    i10 = i12;
                    length = i11;
                    bArr = bArr2;
                    objArr = objArr2;
                    byte b11222 = (byte) (i10 + 1);
                    this.f54762s = objArr;
                    this.f54757n = jVar;
                    this.f54758o = bArr;
                    this.f54759p = length;
                    this.f54760q = b11222;
                    this.f54761r = 1;
                    obj2 = jVar.j(this);
                    if (obj2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            i12 = this.f54760q;
            i11 = this.f54759p;
            bArr2 = (byte[]) this.f54758o;
            jVar = (Rh.j) this.f54757n;
            objArr2 = (Object[]) this.f54762s;
            ResultKt.throwOnFailure(obj);
            obj2 = ((Rh.n) obj).k();
            indexedValue = (IndexedValue) Rh.n.f(obj2);
            if (indexedValue != null) {
            }
        }
    }

    public static final Object a(InterfaceC5322g interfaceC5322g, InterfaceC5321f[] interfaceC5321fArr, Function0 function0, Function3 function3, Continuation continuation) {
        Object a10 = o.a(new a(interfaceC5321fArr, function0, function3, interfaceC5322g, null), continuation);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
