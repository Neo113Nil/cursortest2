package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6l;
import xsna.bay;
import xsna.bdn;
import xsna.eyx;
import xsna.f5z;
import xsna.ge00;
import xsna.ie00;
import xsna.lq9;
import xsna.myc0;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.ui50;
import xsna.wi50;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: RepeatOnLifecycle.kt */
@b6l(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
/* loaded from: classes12.dex */
public final class t extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: RepeatOnLifecycle.kt */
    @b6l(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yvj $$this$coroutineScope;
        final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* compiled from: RepeatOnLifecycle.kt */
        /* renamed from: androidx.lifecycle.t$a$a, reason: collision with other inner class name */
        public static final class C0040a implements l {
            public final /* synthetic */ Lifecycle.Event b;
            public final /* synthetic */ Ref$ObjectRef<eyx> c;
            public final /* synthetic */ yvj d;
            public final /* synthetic */ Lifecycle.Event e;
            public final /* synthetic */ lq9 f;
            public final /* synthetic */ wi50 g;
            public final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> h;

            /* compiled from: RepeatOnLifecycle.kt */
            @b6l(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.lifecycle.t$a$a$a, reason: collision with other inner class name */
            public static final class C0041a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> $block;
                final /* synthetic */ ui50 $mutex;
                Object L$0;
                Object L$1;
                int label;

                /* compiled from: RepeatOnLifecycle.kt */
                @b6l(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend", v = 1)
                /* renamed from: androidx.lifecycle.t$a$a$a$a, reason: collision with other inner class name */
                public static final class C0042a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                    final /* synthetic */ wzs<yvj, spj<? super s3q0>, Object> $block;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0042a(wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super C0042a> spjVar) {
                        super(2, spjVar);
                        this.$block = wzsVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                        C0042a c0042a = new C0042a(this.$block, spjVar);
                        c0042a.L$0 = obj;
                        return c0042a;
                    }

                    @Override // xsna.wzs
                    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                        return ((C0042a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            kotlin.a.a(obj);
                            yvj yvjVar = (yvj) this.L$0;
                            wzs<yvj, spj<? super s3q0>, Object> wzsVar = this.$block;
                            this.label = 1;
                            if (wzsVar.invoke(yvjVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                        }
                        return s3q0.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0041a(ui50 ui50Var, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super C0041a> spjVar) {
                    super(2, spjVar);
                    this.$mutex = ui50Var;
                    this.$block = wzsVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C0041a(this.$mutex, this.$block, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((C0041a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
                
                    if (r7.b(r6) == r0) goto L19;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    ui50 ui50Var;
                    wzs<yvj, spj<? super s3q0>, Object> wzsVar;
                    ui50 ui50Var2;
                    Throwable th;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    try {
                        if (i == 0) {
                            kotlin.a.a(obj);
                            ui50Var = this.$mutex;
                            wzsVar = this.$block;
                            this.L$0 = ui50Var;
                            this.L$1 = wzsVar;
                            this.label = 1;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ui50Var2 = (ui50) this.L$0;
                                try {
                                    kotlin.a.a(obj);
                                    s3q0 s3q0Var = s3q0.a;
                                    ui50Var2.c(null);
                                    return s3q0.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ui50Var2.c(null);
                                    throw th;
                                }
                            }
                            wzsVar = (wzs) this.L$1;
                            ui50 ui50Var3 = (ui50) this.L$0;
                            kotlin.a.a(obj);
                            ui50Var = ui50Var3;
                        }
                        C0042a c0042a = new C0042a(wzsVar, null);
                        this.L$0 = ui50Var;
                        this.L$1 = null;
                        this.label = 2;
                        if (zvj.d(c0042a, this) != coroutineSingletons) {
                            ui50Var2 = ui50Var;
                            s3q0 s3q0Var2 = s3q0.a;
                            ui50Var2.c(null);
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        ui50Var2 = ui50Var;
                        th = th3;
                        ui50Var2.c(null);
                        throw th;
                    }
                }
            }

            public C0040a(Lifecycle.Event event, Ref$ObjectRef ref$ObjectRef, yvj yvjVar, Lifecycle.Event event2, lq9 lq9Var, wi50 wi50Var, wzs wzsVar) {
                this.b = event;
                this.c = ref$ObjectRef;
                this.d = yvjVar;
                this.e = event2;
                this.f = lq9Var;
                this.g = wi50Var;
                this.h = wzsVar;
            }

            /* JADX WARN: Type inference failed for: r4v8, types: [T, xsna.yok0] */
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                Lifecycle.Event event2 = this.b;
                Ref$ObjectRef<eyx> ref$ObjectRef = this.c;
                if (event == event2) {
                    ref$ObjectRef.element = myc0.h(this.d, null, null, new C0041a(this.g, this.h, null), 3);
                    return;
                }
                if (event == this.e) {
                    eyx eyxVar = ref$ObjectRef.element;
                    if (eyxVar != null) {
                        eyxVar.b(null);
                    }
                    ref$ObjectRef.element = null;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.f.resumeWith(s3q0.a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Lifecycle lifecycle, Lifecycle.State state, yvj yvjVar, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = yvjVar;
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r3v3, types: [T, androidx.lifecycle.t$a$a, xsna.e5z] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            Ref$ObjectRef ref$ObjectRef2;
            eyx eyxVar;
            l lVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$this_repeatOnLifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    return s3q0.a;
                }
                Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                ref$ObjectRef = new Ref$ObjectRef();
                try {
                    Lifecycle.State state = this.$state;
                    Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                    yvj yvjVar = this.$$this$coroutineScope;
                    wzs<yvj, spj<? super s3q0>, Object> wzsVar = this.$block;
                    this.L$0 = ref$ObjectRef3;
                    this.L$1 = ref$ObjectRef;
                    this.L$2 = state;
                    this.L$3 = lifecycle;
                    this.L$4 = yvjVar;
                    this.L$5 = wzsVar;
                    this.label = 1;
                    lq9 lq9Var = new lq9(1, s7s0.c(this));
                    lq9Var.o();
                    Lifecycle.Event.Companion.getClass();
                    ?? c0040a = new C0040a(Lifecycle.Event.a.b(state), ref$ObjectRef3, yvjVar, Lifecycle.Event.a.a(state), lq9Var, bay.a(), wzsVar);
                    ref$ObjectRef.element = c0040a;
                    lifecycle.addObserver(c0040a);
                    if (lq9Var.n() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef3;
                } catch (Throwable th2) {
                    th = th2;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    eyxVar = (eyx) ref$ObjectRef2.element;
                    if (eyxVar != null) {
                    }
                    lVar = (l) ref$ObjectRef.element;
                    if (lVar != null) {
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Throwable th3) {
                    th = th3;
                    eyxVar = (eyx) ref$ObjectRef2.element;
                    if (eyxVar != null) {
                        eyxVar.b(null);
                    }
                    lVar = (l) ref$ObjectRef.element;
                    if (lVar != null) {
                        throw th;
                    }
                    this.$this_repeatOnLifecycle.removeObserver(lVar);
                    throw th;
                }
            }
            eyx eyxVar2 = (eyx) ref$ObjectRef2.element;
            if (eyxVar2 != null) {
                eyxVar2.b(null);
            }
            l lVar2 = (l) ref$ObjectRef.element;
            if (lVar2 != null) {
                this.$this_repeatOnLifecycle.removeObserver(lVar2);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Lifecycle lifecycle, Lifecycle.State state, wzs<? super yvj, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super t> spjVar) {
        super(2, spjVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        t tVar = new t(this.$this_repeatOnLifecycle, this.$state, this.$block, spjVar);
        tVar.L$0 = obj;
        return tVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((t) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            bdn bdnVar = bdn.a;
            ge00 U = ie00.a.U();
            a aVar = new a(this.$this_repeatOnLifecycle, this.$state, yvjVar, this.$block, null);
            this.label = 1;
            if (myc0.k(U, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
