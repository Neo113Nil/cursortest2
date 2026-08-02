package com.vk.im.sync.impl;

import com.vk.im.engine.models.ImBgSyncState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.u180;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class DeferredSyncWorker$awaitSync$$inlined$map$1 implements ksr<ImBgSyncState> {
    public final /* synthetic */ DeferredSyncWorker$awaitSync$$inlined$filterIsInstance$1 b;

    /* compiled from: Emitters.kt */
    /* renamed from: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        public final /* synthetic */ lsr b;

        @b6l(c = "com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$1$2", f = "DeferredSyncWorker.kt", l = {50}, m = "emit")
        /* renamed from: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(spj spjVar) {
                super(spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(lsr lsrVar) {
            this.b = lsrVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, spj spjVar) {
            AnonymousClass1 anonymousClass1;
            int i;
            if (spjVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) spjVar;
                int i2 = anonymousClass1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        ImBgSyncState imBgSyncState = ((u180) obj).b.a;
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (this.b.emit(imBgSyncState, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                    }
                    return s3q0.a;
                }
            }
            anonymousClass1 = new AnonymousClass1(spjVar);
            Object obj22 = anonymousClass1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = anonymousClass1.label;
            if (i != 0) {
            }
            return s3q0.a;
        }
    }

    public DeferredSyncWorker$awaitSync$$inlined$map$1(DeferredSyncWorker$awaitSync$$inlined$filterIsInstance$1 deferredSyncWorker$awaitSync$$inlined$filterIsInstance$1) {
        this.b = deferredSyncWorker$awaitSync$$inlined$filterIsInstance$1;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super ImBgSyncState> lsrVar, spj spjVar) {
        Object collect = this.b.collect(new AnonymousClass2(lsrVar), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
