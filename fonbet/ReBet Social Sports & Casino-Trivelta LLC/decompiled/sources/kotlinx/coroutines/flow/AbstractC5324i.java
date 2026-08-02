package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: kotlinx.coroutines.flow.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC5324i {

    /* renamed from: kotlinx.coroutines.flow.i$a */
    public static final class a implements InterfaceC5321f {
        final /* synthetic */ Object[] $elements$inlined;

        /* renamed from: kotlinx.coroutines.flow.i$a$a, reason: collision with other inner class name */
        public static final class C0789a extends ContinuationImpl {

            /* renamed from: n, reason: collision with root package name */
            public /* synthetic */ Object f54689n;

            /* renamed from: o, reason: collision with root package name */
            public int f54690o;

            /* renamed from: q, reason: collision with root package name */
            public Object f54692q;

            /* renamed from: r, reason: collision with root package name */
            public Object f54693r;

            /* renamed from: s, reason: collision with root package name */
            public int f54694s;

            /* renamed from: t, reason: collision with root package name */
            public int f54695t;

            public C0789a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f54689n = obj;
                this.f54690o |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(Object[] objArr) {
            this.$elements$inlined = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            C0789a c0789a;
            int i10;
            int i11;
            InterfaceC5322g interfaceC5322g2;
            int length;
            a aVar;
            if (continuation instanceof C0789a) {
                c0789a = (C0789a) continuation;
                int i12 = c0789a.f54690o;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c0789a.f54690o = i12 - Integer.MIN_VALUE;
                    Object obj = c0789a.f54689n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0789a.f54690o;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        i11 = 0;
                        interfaceC5322g2 = interfaceC5322g;
                        length = this.$elements$inlined.length;
                        aVar = this;
                        if (i11 < length) {
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        length = c0789a.f54695t;
                        i11 = c0789a.f54694s;
                        InterfaceC5322g interfaceC5322g3 = (InterfaceC5322g) c0789a.f54693r;
                        aVar = (a) c0789a.f54692q;
                        ResultKt.throwOnFailure(obj);
                        interfaceC5322g2 = interfaceC5322g3;
                        i11++;
                        if (i11 < length) {
                            Object obj2 = aVar.$elements$inlined[i11];
                            c0789a.f54692q = aVar;
                            c0789a.f54693r = interfaceC5322g2;
                            c0789a.f54694s = i11;
                            c0789a.f54695t = length;
                            c0789a.f54690o = 1;
                            if (interfaceC5322g2.emit(obj2, c0789a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i11++;
                            if (i11 < length) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
            c0789a = new C0789a(continuation);
            Object obj3 = c0789a.f54689n;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i10 = c0789a.f54690o;
            if (i10 != 0) {
            }
        }
    }

    /* renamed from: kotlinx.coroutines.flow.i$b */
    public static final class b implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f54696a;

        public b(Object obj) {
            this.f54696a = obj;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object emit = interfaceC5322g.emit(this.f54696a, continuation);
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
        }
    }

    public static final InterfaceC5321f a(Function2 function2) {
        return new C5317b(function2, null, 0, null, 14, null);
    }

    public static final InterfaceC5321f b(Function2 function2) {
        return new B(function2);
    }

    public static final InterfaceC5321f c(Object obj) {
        return new b(obj);
    }

    public static final InterfaceC5321f d(Object... objArr) {
        return new a(objArr);
    }
}
