package com.vk.messagetemplates.impl.details;

import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.messagetemplates.impl.common.Template;
import com.vk.messagetemplates.impl.details.a;
import com.vk.messagetemplates.impl.details.b;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ak2;
import xsna.b6l;
import xsna.bl50;
import xsna.bwj;
import xsna.dwj;
import xsna.ezv;
import xsna.g3q;
import xsna.g8o0;
import xsna.h8o0;
import xsna.i040;
import xsna.i8o0;
import xsna.j5b0;
import xsna.jl50;
import xsna.ksg0;
import xsna.lj50;
import xsna.ll50;
import xsna.mdm0;
import xsna.on50;
import xsna.rdi;
import xsna.s3q0;
import xsna.sj50;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: TemplateDetailsInlineActor.kt */
/* loaded from: classes3.dex */
public final class c extends bl50<TemplateDetailsState, com.vk.messagetemplates.impl.details.a, on50, bwj, dwj, b> {
    public final sj50<TemplateDetailsState, on50, ll50<on50, bwj, dwj>, jl50<TemplateDetailsState>, b> c;
    public final ezv d;

    /* compiled from: TemplateDetailsInlineActor.kt */
    @b6l(c = "com.vk.messagetemplates.impl.details.TemplateDetailsInlineActor$init$1", f = "TemplateDetailsInlineActor.kt", l = {26}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int I$0;
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
                Integer num = ((TemplateDetailsState) c.this.b.getCurrentState()).b;
                if (num == null) {
                    return s3q0.a;
                }
                int intValue = num.intValue();
                ezv ezvVar = c.this.d;
                i040 i040Var = new i040(intValue);
                this.L$0 = null;
                this.I$0 = intValue;
                this.label = 1;
                obj = ezvVar.a(yvjVar, i040Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            rdi.y(c.this, new mdm0((MsgTemplate) ((Optional) obj).orElse(null), 6));
            return s3q0.a;
        }
    }

    public c(sj50<TemplateDetailsState, on50, ll50<on50, bwj, dwj>, jl50<TemplateDetailsState>, b> sj50Var, ezv ezvVar) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = ezvVar;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<TemplateDetailsState, on50, ll50<on50, bwj, dwj>, jl50<TemplateDetailsState>, b> W() {
        return this.c;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new a(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        com.vk.messagetemplates.impl.details.a aVar = (com.vk.messagetemplates.impl.details.a) lj50Var;
        if (aVar.equals(h8o0.b)) {
            g3q.a(this, new d(this, null));
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (aVar instanceof g8o0) {
            c(b.a.a);
            s3q0 s3q0Var2 = s3q0.a;
        } else if (aVar instanceof i8o0) {
            rdi.y(this, new ak2(((Template) Template.h().get(((i8o0) aVar).b)).getFormat(), 3));
        } else if (aVar instanceof a.b) {
            rdi.y(this, new ksg0(aVar, 12));
        } else {
            if (!(aVar instanceof a.C1271a)) {
                throw new NoWhenBranchMatchedException();
            }
            rdi.y(this, new j5b0(aVar, 19));
        }
    }
}
