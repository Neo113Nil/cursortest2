package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastoreImpl;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.qkr;
import xsna.s3q0;
import xsna.spj;
import xsna.uyc0;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class SessionDatastoreImpl$special$$inlined$map$1 implements ksr<qkr> {
    public final /* synthetic */ FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 b;
    public final /* synthetic */ SessionDatastoreImpl c;

    /* compiled from: Emitters.kt */
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        public final /* synthetic */ lsr b;

        /* compiled from: Emitters.kt */
        @b6l(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
        /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
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

        public AnonymousClass2(lsr lsrVar, SessionDatastoreImpl sessionDatastoreImpl) {
            this.b = lsrVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
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
                        a.a(obj2);
                        qkr qkrVar = new qkr((String) ((uyc0) obj).b(SessionDatastoreImpl.b.a));
                        anonymousClass1.label = 1;
                        if (this.b.emit(qkrVar, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj2);
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

    public SessionDatastoreImpl$special$$inlined$map$1(FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, SessionDatastoreImpl sessionDatastoreImpl) {
        this.b = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        this.c = sessionDatastoreImpl;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super qkr> lsrVar, spj spjVar) {
        Object collect = this.b.collect(new AnonymousClass2(lsrVar, this.c), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
