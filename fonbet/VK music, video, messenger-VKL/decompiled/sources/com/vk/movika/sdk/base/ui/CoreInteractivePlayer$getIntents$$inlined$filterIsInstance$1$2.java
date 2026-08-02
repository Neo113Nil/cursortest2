package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.model.EventTag;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;

/* loaded from: classes3.dex */
public final class CoreInteractivePlayer$getIntents$$inlined$filterIsInstance$1$2<T> implements lsr {
    public final /* synthetic */ lsr b;

    @b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$getIntents$$inlined$filterIsInstance$1$2", f = "CoreInteractivePlayer.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "emit")
    /* renamed from: com.vk.movika.sdk.base.ui.CoreInteractivePlayer$getIntents$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public AnonymousClass1(spj spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return CoreInteractivePlayer$getIntents$$inlined$filterIsInstance$1$2.this.emit(null, this);
        }
    }

    public CoreInteractivePlayer$getIntents$$inlined$filterIsInstance$1$2(lsr lsrVar) {
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
            int i2 = anonymousClass1.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.b = i2 - Integer.MIN_VALUE;
                Object obj2 = anonymousClass1.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.b;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    if (obj instanceof EventTag) {
                        anonymousClass1.b = 1;
                        if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        Object obj22 = anonymousClass1.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anonymousClass1.b;
        if (i != 0) {
        }
        return s3q0.a;
    }
}
