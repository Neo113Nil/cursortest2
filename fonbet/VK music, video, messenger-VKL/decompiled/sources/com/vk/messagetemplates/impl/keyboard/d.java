package com.vk.messagetemplates.impl.keyboard;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.messagetemplates.impl.common.TemplateArgs;
import com.vk.messagetemplates.impl.keyboard.a;
import com.vkontakte.android.data.b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.arb0;
import xsna.b25;
import xsna.b6l;
import xsna.b9o0;
import xsna.bl50;
import xsna.bwj;
import xsna.cn;
import xsna.dwj;
import xsna.e1e0;
import xsna.e1w;
import xsna.e43;
import xsna.el50;
import xsna.ezv;
import xsna.f9o0;
import xsna.g3q;
import xsna.g9o0;
import xsna.h9o0;
import xsna.i9o0;
import xsna.j040;
import xsna.j9o0;
import xsna.jl50;
import xsna.ksr;
import xsna.lj50;
import xsna.ll50;
import xsna.lsr;
import xsna.mjg;
import xsna.on50;
import xsna.qtd0;
import xsna.rdi;
import xsna.s3q0;
import xsna.sj50;
import xsna.spj;
import xsna.sxp;
import xsna.wze0;
import xsna.wzs;
import xsna.xzv;
import xsna.yvj;

/* compiled from: TemplatesKeyboardInlineActor.kt */
/* loaded from: classes3.dex */
public final class d extends bl50<TemplatesKeyboardState, j9o0, on50, bwj, dwj, com.vk.messagetemplates.impl.keyboard.a> {
    public final sj50<TemplatesKeyboardState, on50, ll50<on50, bwj, dwj>, jl50<TemplatesKeyboardState>, com.vk.messagetemplates.impl.keyboard.a> c;
    public final b9o0 d;
    public final ezv e;
    public final xzv f;
    public final mjg g;
    public final b25 h;

    /* compiled from: TemplatesKeyboardInlineActor.kt */
    @b6l(c = "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardInlineActor$init$1", f = "TemplatesKeyboardInlineActor.kt", l = {40, 41}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = d.this.new a(spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        
            if (r8 == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TemplateArgs templateArgs;
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                d dVar = d.this;
                this.L$0 = yvjVar;
                this.label = 1;
                obj = d.m(dVar, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    templateArgs = (TemplateArgs) this.L$1;
                    kotlin.a.a(obj);
                    d dVar2 = d.this;
                    wze0 wze0Var = new wze0(5, templateArgs, (List) obj);
                    dVar2.getClass();
                    el50.a.b(dVar2, wze0Var);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            TemplateArgs templateArgs2 = (TemplateArgs) obj;
            ezv ezvVar = d.this.e;
            j040 j040Var = new j040(Source.ACTUAL);
            this.L$0 = null;
            this.L$1 = templateArgs2;
            this.label = 2;
            Object a = ezvVar.a(yvjVar, j040Var, this);
            if (a != coroutineSingletons) {
                templateArgs = templateArgs2;
                obj = a;
                d dVar22 = d.this;
                wze0 wze0Var2 = new wze0(5, templateArgs, (List) obj);
                dVar22.getClass();
                el50.a.b(dVar22, wze0Var2);
                return s3q0.a;
            }
            return coroutineSingletons;
        }
    }

    /* compiled from: TemplatesKeyboardInlineActor.kt */
    @b6l(c = "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardInlineActor$init$2", f = "TemplatesKeyboardInlineActor.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: TemplatesKeyboardInlineActor.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ d b;
            public final /* synthetic */ yvj c;

            public a(d dVar, yvj yvjVar) {
                this.b = dVar;
                this.c = yvjVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(spj spjVar) {
                e eVar;
                int i;
                if (spjVar instanceof e) {
                    eVar = (e) spjVar;
                    int i2 = eVar.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        eVar.label = i2 - Integer.MIN_VALUE;
                        Object obj = eVar.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = eVar.label;
                        d dVar = this.b;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            ezv ezvVar = dVar.e;
                            j040 j040Var = new j040(Source.CACHE);
                            eVar.L$0 = null;
                            eVar.label = 1;
                            obj = ezvVar.a(this.c, j040Var, eVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                        }
                        rdi.y(dVar, new arb0((List) obj, 26));
                        return s3q0.a;
                    }
                }
                eVar = new e(this, spjVar);
                Object obj2 = eVar.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.label;
                d dVar2 = this.b;
                if (i != 0) {
                }
                rdi.y(dVar2, new arb0((List) obj2, 26));
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
            b bVar = d.this.new b(spjVar);
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
                ksr<sxp> a2 = d.this.f.a();
                a aVar = new a(d.this, yvjVar);
                this.L$0 = null;
                this.label = 1;
                Object collect = a2.collect(new TemplatesKeyboardInlineActor$init$2$invokeSuspend$$inlined$filterIsInstance$1$2(aVar), this);
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

    public d(sj50<TemplatesKeyboardState, on50, ll50<on50, bwj, dwj>, jl50<TemplatesKeyboardState>, com.vk.messagetemplates.impl.keyboard.a> sj50Var, b9o0 b9o0Var, ezv ezvVar, xzv xzvVar, mjg mjgVar, b25 b25Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = b9o0Var;
        this.e = ezvVar;
        this.f = xzvVar;
        this.g = mjgVar;
        this.h = b25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(d dVar, ContinuationImpl continuationImpl) {
        f fVar;
        int i;
        String d6;
        b9o0 b9o0Var = dVar.d;
        long j = b9o0Var.a;
        long j2 = b9o0Var.b;
        if (continuationImpl instanceof f) {
            fVar = (f) continuationImpl;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    e1w<ProfilesInfo> d = dVar.g.d(new e1e0(e43.l(Peer.a.b(j2), Peer.a.b(j)), Source.CACHE, false));
                    ezv ezvVar = dVar.e;
                    fVar.L$0 = null;
                    fVar.L$1 = null;
                    fVar.label = 1;
                    obj = ezvVar.a(dVar, d, fVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ProfilesInfo profilesInfo = (ProfilesInfo) obj;
                qtd0 Cb = profilesInfo.Cb(new Long(j2));
                qtd0 Cb2 = profilesInfo.Cb(new Long(j));
                cn o = dVar.h.o();
                String a2 = o.a();
                String str = (String) o.n.getValue();
                d6 = Cb == null ? Cb.d6(UserNameCase.NOM) : null;
                if (d6 == null) {
                    d6 = "";
                }
                String H5 = Cb == null ? Cb.H5(UserNameCase.NOM) : null;
                String str2 = H5 != null ? "" : H5;
                String name = Cb2 != null ? Cb2.name() : null;
                return new TemplateArgs(a2, str, d6, str2, name != null ? "" : name);
            }
        }
        fVar = new f(dVar, continuationImpl);
        Object obj2 = fVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.label;
        if (i != 0) {
        }
        ProfilesInfo profilesInfo2 = (ProfilesInfo) obj2;
        qtd0 Cb3 = profilesInfo2.Cb(new Long(j2));
        qtd0 Cb22 = profilesInfo2.Cb(new Long(j));
        cn o2 = dVar.h.o();
        String a22 = o2.a();
        String str3 = (String) o2.n.getValue();
        if (Cb3 == null) {
        }
        if (d6 == null) {
        }
        if (Cb3 == null) {
        }
        if (H5 != null) {
        }
        if (Cb22 != null) {
        }
        return new TemplateArgs(a22, str3, d6, str2, name != null ? "" : name);
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<TemplatesKeyboardState, on50, ll50<on50, bwj, dwj>, jl50<TemplatesKeyboardState>, com.vk.messagetemplates.impl.keyboard.a> W() {
        return this.c;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new a(null));
        g3q.a(this, new b(null));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        j9o0 j9o0Var = (j9o0) lj50Var;
        if (j9o0Var.equals(h9o0.b)) {
            c(new a.b(null));
            return;
        }
        if (!(j9o0Var instanceof i9o0)) {
            if (j9o0Var instanceof g9o0) {
                c(new a.b(Integer.valueOf(((g9o0) j9o0Var).b)));
                return;
            } else {
                if (!(j9o0Var instanceof f9o0)) {
                    throw new NoWhenBranchMatchedException();
                }
                g3q.a(this, new c(this, ((f9o0) j9o0Var).b, null));
                return;
            }
        }
        i9o0 i9o0Var = (i9o0) j9o0Var;
        int i = i9o0Var.b;
        b.d dVar = new b.d("message_template_use");
        dVar.b(Long.valueOf(this.d.a), "group_id");
        dVar.b(Integer.valueOf(i), "template_id");
        dVar.e();
        c(new a.c(i9o0Var.c));
    }
}
