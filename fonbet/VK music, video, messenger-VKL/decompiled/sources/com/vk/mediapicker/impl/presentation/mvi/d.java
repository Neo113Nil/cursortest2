package com.vk.mediapicker.impl.presentation.mvi;

import com.vk.mediastore.system.AlbumEntry;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import xsna.b6l;
import xsna.bu10;
import xsna.el50;
import xsna.fu10;
import xsna.j5g;
import xsna.ln50;
import xsna.lsr;
import xsna.lu10;
import xsna.mu10;
import xsna.nu10;
import xsna.pqz;
import xsna.rdi;
import xsna.rf4;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.vu10;
import xsna.wu10;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;

/* compiled from: MediaPickerMviActor.kt */
@b6l(c = "com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviActor$observeAlbums$1$1", f = "MediaPickerMviActor.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ com.vk.mediapicker.impl.presentation.mvi.b this$0;

    /* compiled from: MediaPickerMviActor.kt */
    @b6l(c = "com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviActor$observeAlbums$1$1$1", f = "MediaPickerMviActor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<lsr<? super List<? extends AlbumEntry>>, Throwable, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ com.vk.mediapicker.impl.presentation.mvi.b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.vk.mediapicker.impl.presentation.mvi.b bVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.this$0 = bVar;
        }

        @Override // xsna.yzs
        public final Object invoke(lsr<? super List<? extends AlbumEntry>> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
            return new a(this.this$0, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (((MediaPickerMviState) this.this$0.b.getCurrentState()).c == 0) {
                rdi.y(this.this$0, new pqz(3));
            }
            return s3q0.a;
        }
    }

    /* compiled from: MediaPickerMviActor.kt */
    public static final class b<T> implements lsr {
        public final /* synthetic */ com.vk.mediapicker.impl.presentation.mvi.b b;

        public b(com.vk.mediapicker.impl.presentation.mvi.b bVar) {
            this.b = bVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            com.vk.mediapicker.impl.presentation.mvi.b bVar;
            T t;
            List list = (List) obj;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                bVar = this.b;
                if (!hasNext) {
                    t = (T) null;
                    break;
                }
                t = it.next();
                if (((AlbumEntry) t).b == ((MediaPickerMviState) bVar.b.getCurrentState()).c) {
                    break;
                }
            }
            AlbumEntry albumEntry = t;
            int i = albumEntry != null ? albumEntry.b : ((AlbumEntry) j5g.Y(list)).b;
            bVar.getClass();
            rdi.y(bVar, new rf4(i, list));
            bVar.g(wu10.a);
            el50.a.a(bVar, vu10.a, ln50.a.c, new fu10(bVar, i, 0));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.vk.mediapicker.impl.presentation.mvi.b bVar, spj<? super d> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bu10 b2 = this.this$0.c.b();
            com.vk.mediapicker.impl.presentation.mvi.b bVar = this.this$0;
            int m = com.vk.mediapicker.impl.presentation.mvi.b.m(bVar, bVar.c.getConfig().d);
            nu10 nu10Var = b2.a;
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(rsr.i(new lu10(nu10Var, m, null)), new mu10(nu10Var, m, null)), new a(this.this$0, null));
            b bVar2 = new b(this.this$0);
            this.label = 1;
            if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(bVar2, this) == coroutineSingletons) {
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
