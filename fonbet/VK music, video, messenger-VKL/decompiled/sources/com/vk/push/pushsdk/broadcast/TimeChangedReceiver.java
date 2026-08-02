package com.vk.push.pushsdk.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.base.SdkInitAwaiter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.e5w0;
import xsna.epx;
import xsna.gzs;
import xsna.hpj;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.v6g0;
import xsna.whn0;
import xsna.wzs;
import xsna.yvj;
import xsna.yvz;
import xsna.zvj;

/* compiled from: TimeChangedReceiver.kt */
/* loaded from: classes5.dex */
public final class TimeChangedReceiver extends BroadcastReceiver {
    public final hpj a = zvj.a(bdn.b.plus(whn0.a()));
    public final bpn0 b = new bpn0(a.i);

    /* compiled from: TimeChangedReceiver.kt */
    public static final class a extends Lambda implements gzs<AnalyticsSender> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final AnalyticsSender invoke() {
            Logger logger = v6g0.a;
            return v6g0.a();
        }
    }

    /* compiled from: TimeChangedReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.broadcast.TimeChangedReceiver$onReceive$1", f = "TimeChangedReceiver.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BroadcastReceiver.PendingResult pendingResult, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$pendingResult = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return TimeChangedReceiver.this.new b(this.$pendingResult, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                    return s3q0.a;
                }
                ((AnalyticsSender) TimeChangedReceiver.this.b.getValue()).send(new yvz("vkcm_sdk_local_time_changed_event"));
                this.$pendingResult.finish();
                return s3q0.a;
            } finally {
                this.$pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (epx.f(intent.getAction(), "android.intent.action.TIME_SET")) {
            myc0.h(this.a, null, null, new b(goAsync(), null), 3);
        }
    }
}
