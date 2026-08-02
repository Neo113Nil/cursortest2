package a3;

import Q2.AbstractC1508t;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.i;
import androidx.work.impl.model.WorkSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1916a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15032a;

    /* renamed from: a3.a$a, reason: collision with other inner class name */
    public static final class C0314a implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f15033a;

        /* renamed from: a3.a$a$a, reason: collision with other inner class name */
        public static final class C0315a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f15034a;

            /* renamed from: a3.a$a$a$a, reason: collision with other inner class name */
            public static final class C0316a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f15035n;

                /* renamed from: o, reason: collision with root package name */
                public int f15036o;

                public C0316a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f15035n = obj;
                    this.f15036o |= Integer.MIN_VALUE;
                    return C0315a.this.emit(null, this);
                }
            }

            public C0315a(InterfaceC5322g interfaceC5322g) {
                this.f15034a = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C0316a c0316a;
                int i10;
                if (continuation instanceof C0316a) {
                    c0316a = (C0316a) continuation;
                    int i11 = c0316a.f15036o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0316a.f15036o = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0316a.f15035n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = c0316a.f15036o;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC5322g interfaceC5322g = this.f15034a;
                            if (obj instanceof b.C0420b) {
                                c0316a.f15036o = 1;
                                if (interfaceC5322g.emit(obj, c0316a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c0316a = new C0316a(continuation);
                Object obj22 = c0316a.f15035n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0316a.f15036o;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public C0314a(InterfaceC5321f interfaceC5321f) {
            this.f15033a = interfaceC5321f;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object collect = this.f15033a.collect(new C0315a(interfaceC5322g), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* renamed from: a3.a$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f15038n;

        /* renamed from: o, reason: collision with root package name */
        public int f15039o;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15038n = obj;
            this.f15039o |= Integer.MIN_VALUE;
            return AbstractC1916a.c(null, null, this);
        }
    }

    /* renamed from: a3.a$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f15040n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f15041o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WorkSpec workSpec, Continuation continuation) {
            super(2, continuation);
            this.f15041o = workSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f15041o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.work.impl.constraints.b bVar, Continuation continuation) {
            return ((c) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15040n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = AbstractC1916a.f15032a;
            WorkSpec workSpec = this.f15041o;
            AbstractC1508t.e().a(str, "Constraints changed for " + workSpec);
            return Unit.INSTANCE;
        }
    }

    static {
        String i10 = AbstractC1508t.i("ConstraintTrkngWrkr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f15032a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(i iVar, WorkSpec workSpec, Continuation continuation) {
        b bVar;
        int i10;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f15039o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f15039o = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f15038n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f15039o;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C0314a c0314a = new C0314a(AbstractC5323h.F(iVar.b(workSpec), new c(workSpec, null)));
                    bVar.f15039o = 1;
                    obj = AbstractC5323h.r(c0314a, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxInt(((b.C0420b) obj).a());
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f15038n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f15039o;
        if (i10 != 0) {
        }
        return Boxing.boxInt(((b.C0420b) obj2).a());
    }
}
