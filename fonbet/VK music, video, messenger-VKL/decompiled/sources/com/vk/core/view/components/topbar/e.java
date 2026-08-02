package com.vk.core.view.components.topbar;

import com.vk.core.view.components.topbar.VkTopBar;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.caj0;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.tho0;
import xsna.vax;
import xsna.wh50;
import xsna.wzs;
import xsna.yvj;

/* compiled from: VkTopBar.kt */
@b6l(c = "com.vk.core.view.components.topbar.VkTopBar$mapMiddleSearch$1$1", f = "VkTopBar.kt", l = {568}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ VkTopBar.Middle.d $middle;
    final /* synthetic */ wh50<tho0> $text$delegate;
    int label;

    /* compiled from: VkTopBar.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ wh50<tho0> b;

        public a(wh50<tho0> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            if (vaxVar instanceof VkTopBar.k) {
                tho0 tho0Var = new tho0(((VkTopBar.k) vaxVar).a, 0L, 6);
                int i = VkTopBar.I;
                this.b.setValue(tho0Var);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VkTopBar.Middle.d dVar, wh50<tho0> wh50Var, spj<? super e> spjVar) {
        super(2, spjVar);
        this.$middle = dVar;
        this.$text$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e(this.$middle, this.$text$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 b = this.$middle.k.b();
            a aVar = new a(this.$text$delegate);
            this.label = 1;
            b.getClass();
            if (caj0.k(b, aVar, this) == coroutineSingletons) {
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
