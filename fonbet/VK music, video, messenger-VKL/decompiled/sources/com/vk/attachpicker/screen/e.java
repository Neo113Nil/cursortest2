package com.vk.attachpicker.screen;

import com.vk.attachpicker.screen.i;
import com.vk.photo.editor.PhotoEditorView;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.utk0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CollageEditorScreen.kt */
@b6l(c = "com.vk.attachpicker.screen.CollageEditorScreen$setListeners$5", f = "CollageEditorScreen.kt", l = {350}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ PhotoEditorView $this_setListeners;
    int label;
    final /* synthetic */ f this$0;

    /* compiled from: CollageEditorScreen.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ f b;

        public a(f fVar) {
            this.b = fVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            f fVar = this.b;
            i iVar = fVar.q;
            if (iVar instanceof i.a) {
                ((i.a) iVar).getClass();
                fVar.q = new i.a(booleanValue);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PhotoEditorView photoEditorView, f fVar, spj<? super e> spjVar) {
        super(2, spjVar);
        this.$this_setListeners = photoEditorView;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e(this.$this_setListeners, this.this$0, spjVar);
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
            utk0 utk0Var = this.$this_setListeners.L;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (utk0Var.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
