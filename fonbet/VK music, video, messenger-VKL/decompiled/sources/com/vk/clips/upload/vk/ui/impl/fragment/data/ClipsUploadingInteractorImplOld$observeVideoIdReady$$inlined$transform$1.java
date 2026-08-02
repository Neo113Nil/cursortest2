package com.vk.clips.upload.vk.ui.impl.fragment.data;

import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.eed;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.ted;
import xsna.ulf;
import xsna.wzs;

/* compiled from: Emitters.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1", f = "ClipsUploadingInteractorImplOld.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1 extends SuspendLambda implements wzs<lsr<? super ulf.a>, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr $this_transform;
    final /* synthetic */ int $uploadId$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Emitters.kt */
    /* renamed from: com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements lsr {
        public final /* synthetic */ lsr<ulf.a> b;
        public final /* synthetic */ int c;

        @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1$1", f = "ClipsUploadingInteractorImplOld.kt", l = {45}, m = "emit")
        /* renamed from: com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07051 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;
            /* synthetic */ Object result;

            public C07051(spj spjVar) {
                super(spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(lsr lsrVar, int i) {
            this.c = i;
            this.b = lsrVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            C07051 c07051;
            int i;
            T t2;
            if (spjVar instanceof C07051) {
                c07051 = (C07051) spjVar;
                int i2 = c07051.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c07051.label = i2 - Integer.MIN_VALUE;
                    Object obj = c07051.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c07051.label;
                    if (i != 0) {
                        a.a(obj);
                        Iterator<T> it = ((List) t).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = (T) null;
                                break;
                            }
                            t2 = it.next();
                            Pair pair = (Pair) t2;
                            if ((pair.j() instanceof ted) && ((eed) pair.j()).a.a == this.c) {
                                break;
                            }
                        }
                        Pair pair2 = t2;
                        if (pair2 != null) {
                            ted tedVar = (ted) pair2.j();
                            ulf.a aVar = new ulf.a(tedVar.b, new UserId(tedVar.c));
                            c07051.L$0 = null;
                            c07051.L$1 = null;
                            c07051.L$2 = null;
                            c07051.L$3 = null;
                            c07051.L$4 = null;
                            c07051.L$5 = null;
                            c07051.I$0 = 0;
                            c07051.label = 1;
                            if (this.b.emit(aVar, c07051) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                    }
                    return s3q0.a;
                }
            }
            c07051 = new C07051(spjVar);
            Object obj2 = c07051.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c07051.label;
            if (i != 0) {
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1(ksr ksrVar, spj spjVar, int i) {
        super(2, spjVar);
        this.$this_transform = ksrVar;
        this.$uploadId$inlined = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1 clipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1 = new ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1(this.$this_transform, spjVar, this.$uploadId$inlined);
        clipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1.L$0 = obj;
        return clipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super ulf.a> lsrVar, spj<? super s3q0> spjVar) {
        return ((ClipsUploadingInteractorImplOld$observeVideoIdReady$$inlined$transform$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            ksr ksrVar = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lsrVar, this.$uploadId$inlined);
            this.L$0 = null;
            this.label = 1;
            if (ksrVar.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return s3q0.a;
    }
}
