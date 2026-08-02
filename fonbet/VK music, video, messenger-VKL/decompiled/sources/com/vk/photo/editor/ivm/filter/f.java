package com.vk.photo.editor.ivm.filter;

import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.photo.editor.ivm.filter.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.e43;
import xsna.g5g;
import xsna.iyx;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.v900;
import xsna.w900;
import xsna.wzs;
import xsna.y900;
import xsna.yvj;
import xsna.zvj;

/* compiled from: FilterStore.kt */
@b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$updatePreviewRepository$1", f = "FilterStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements wzs<List<? extends y900>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* compiled from: FilterStore.kt */
    @b6l(c = "com.vk.photo.editor.ivm.filter.FilterStore$updatePreviewRepository$1$1", f = "FilterStore.kt", l = {57}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ FilterUiModel $filterUiModel;
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, FilterUiModel filterUiModel, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = iVar;
            this.$filterUiModel = filterUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$filterUiModel, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                i iVar = this.this$0;
                FilterUiModel filterUiModel = this.$filterUiModel;
                this.label = 1;
                if (i.a(iVar, filterUiModel, this) == coroutineSingletons) {
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
    public f(i iVar, spj<? super f> spjVar) {
        super(2, spjVar);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        f fVar = new f(this.this$0, spjVar);
        fVar.L$0 = obj;
        return fVar;
    }

    @Override // xsna.wzs
    public final Object invoke(List<? extends y900> list, spj<? super s3q0> spjVar) {
        return ((f) create(list, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? o;
        List<y900> list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        i iVar = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (y900 y900Var : list) {
            iVar.getClass();
            if (y900Var instanceof v900) {
                o = Collections.singletonList(iVar.c((v900) y900Var, false, null, null));
            } else {
                if (!(y900Var instanceof w900)) {
                    throw new NoWhenBranchMatchedException();
                }
                w900 w900Var = (w900) y900Var;
                String valueOf = String.valueOf(w900Var.c);
                List<v900> list2 = w900Var.f;
                FilterUiModel c = iVar.c(list2.get(0), true, valueOf, 0);
                o = e43.o(new FilterUiModel(String.valueOf(w900Var.c), w900Var.d, c.c, false, c.e, FilterUiModel.Type.GROUP_ENTRY_POINT, null, w900Var.e, null), c);
                int size = list2.size();
                for (int i = 1; i < size; i++) {
                    o.add(iVar.c(list2.get(i), true, valueOf, Integer.valueOf(i)));
                }
            }
            g5g.y((Iterable) o, arrayList);
        }
        this.this$0.a.d(new a.d(arrayList, FilterMessage.Source.Synthetic, false));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FilterUiModel filterUiModel = (FilterUiModel) it.next();
            if (this.this$0.j.contains(filterUiModel.a)) {
                myc0.h(zvj.a(getContext().plus(iyx.a())), null, null, new a(this.this$0, filterUiModel, null), 3);
            }
        }
        return s3q0.a;
    }
}
