package com.vk.dialogtags.impl.list;

import com.vk.dialogtags.impl.list.a;
import com.vk.dialogtags.impl.list.b;
import com.vk.dto.common.Source;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a2o0;
import xsna.b2o0;
import xsna.b6l;
import xsna.bl50;
import xsna.bwj;
import xsna.c2o0;
import xsna.dwj;
import xsna.el50;
import xsna.ezv;
import xsna.f150;
import xsna.fkm;
import xsna.g3q;
import xsna.jl50;
import xsna.ksr;
import xsna.lj50;
import xsna.ll50;
import xsna.lsr;
import xsna.on50;
import xsna.rdi;
import xsna.s3q0;
import xsna.sj50;
import xsna.spj;
import xsna.sxp;
import xsna.wzs;
import xsna.xvl0;
import xsna.xzv;
import xsna.yvj;

/* compiled from: TagsListInlineActor.kt */
/* loaded from: classes18.dex */
public final class c extends bl50<TagsListState, com.vk.dialogtags.impl.list.a, on50, bwj, dwj, com.vk.dialogtags.impl.list.b> {
    public final sj50<TagsListState, on50, ll50<on50, bwj, dwj>, jl50<TagsListState>, com.vk.dialogtags.impl.list.b> c;
    public final ezv d;
    public final xzv e;

    /* compiled from: TagsListInlineActor.kt */
    @b6l(c = "com.vk.dialogtags.impl.list.TagsListInlineActor$init$1", f = "TagsListInlineActor.kt", l = {28}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = c.this.new a(spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ezv ezvVar = c.this.d;
                fkm fkmVar = new fkm(Source.ACTUAL);
                this.L$0 = null;
                this.label = 1;
                obj = ezvVar.a(yvjVar, fkmVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            c cVar = c.this;
            xvl0 xvl0Var = new xvl0((List) obj, 5);
            cVar.getClass();
            el50.a.b(cVar, xvl0Var);
            return s3q0.a;
        }
    }

    /* compiled from: TagsListInlineActor.kt */
    @b6l(c = "com.vk.dialogtags.impl.list.TagsListInlineActor$init$2", f = "TagsListInlineActor.kt", l = {35}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: TagsListInlineActor.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ c b;
            public final /* synthetic */ yvj c;

            public a(c cVar, yvj yvjVar) {
                this.b = cVar;
                this.c = yvjVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(spj spjVar) {
                d dVar;
                int i;
                if (spjVar instanceof d) {
                    dVar = (d) spjVar;
                    int i2 = dVar.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        dVar.label = i2 - Integer.MIN_VALUE;
                        Object obj = dVar.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = dVar.label;
                        c cVar = this.b;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            ezv ezvVar = cVar.d;
                            fkm fkmVar = new fkm(Source.CACHE);
                            dVar.L$0 = null;
                            dVar.label = 1;
                            obj = ezvVar.a(this.c, fkmVar, dVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                        }
                        rdi.y(cVar, new f150((List) obj, 1));
                        return s3q0.a;
                    }
                }
                dVar = new d(this, spjVar);
                Object obj2 = dVar.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.label;
                c cVar2 = this.b;
                if (i != 0) {
                }
                rdi.y(cVar2, new f150((List) obj2, 1));
                return s3q0.a;
            }

            @Override // xsna.lsr
            public final /* bridge */ /* synthetic */ Object emit(Object obj, spj spjVar) {
                return a(spjVar);
            }
        }

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = c.this.new b(spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ksr<sxp> a2 = c.this.e.a();
                a aVar = new a(c.this, yvjVar);
                this.L$0 = null;
                this.label = 1;
                Object collect = a2.collect(new TagsListInlineActor$init$2$invokeSuspend$$inlined$filterIsInstance$1$2(aVar), this);
                if (collect != obj2) {
                    collect = s3q0.a;
                }
                if (collect == obj2) {
                    return obj2;
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

    public c(sj50<TagsListState, on50, ll50<on50, bwj, dwj>, jl50<TagsListState>, com.vk.dialogtags.impl.list.b> sj50Var, ezv ezvVar, xzv xzvVar) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = ezvVar;
        this.e = xzvVar;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<TagsListState, on50, ll50<on50, bwj, dwj>, jl50<TagsListState>, com.vk.dialogtags.impl.list.b> W() {
        return this.c;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new a(null));
        g3q.a(this, new b(null));
    }

    public final void m(int i, boolean z) {
        if (z) {
        }
        c(new b.C0899b(((TagsListState) this.b.getCurrentState()).c));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        com.vk.dialogtags.impl.list.a aVar = (com.vk.dialogtags.impl.list.a) lj50Var;
        if (aVar.equals(b2o0.b)) {
            c(b.c.a);
            return;
        }
        if (aVar instanceof a2o0) {
            m(((a2o0) aVar).b, true);
        } else if (aVar instanceof c2o0) {
            m(((c2o0) aVar).b, false);
        } else {
            if (!aVar.equals(a.C0898a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c(b.a.a);
        }
    }
}
