package com.vk.push.pushsdk.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.work.WorkModel;
import com.vk.push.pushsdk.VkpnsPushConfig;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bdn;
import xsna.bk10;
import xsna.bpn0;
import xsna.e5w0;
import xsna.epx;
import xsna.fzs;
import xsna.g9i;
import xsna.gzs;
import xsna.hpj;
import xsna.kp9;
import xsna.myc0;
import xsna.nhe0;
import xsna.nj10;
import xsna.qxi;
import xsna.s3q0;
import xsna.spj;
import xsna.spk0;
import xsna.v6g0;
import xsna.whn0;
import xsna.wzs;
import xsna.ycx;
import xsna.yfq0;
import xsna.yvj;
import xsna.zr;
import xsna.zvj;

/* compiled from: FullyPackageRemovedReceiver.kt */
/* loaded from: classes5.dex */
public final class FullyPackageRemovedReceiver extends BroadcastReceiver {
    public final bpn0 a = new bpn0(c.i);
    public final hpj b = zvj.a(bdn.b.plus(whn0.a()));
    public final bpn0 c = new bpn0(d.i);
    public final bpn0 d = new bpn0(e.i);
    public final bpn0 e = new bpn0(g.i);
    public final bpn0 f = new bpn0(b.i);
    public final bpn0 g = new bpn0(h.i);
    public final bpn0 h = new bpn0(a.i);

    /* compiled from: FullyPackageRemovedReceiver.kt */
    public static final class a extends Lambda implements gzs<AnalyticsSender> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final AnalyticsSender invoke() {
            Logger logger = v6g0.a;
            return v6g0.a();
        }
    }

    /* compiled from: FullyPackageRemovedReceiver.kt */
    public static final class b extends Lambda implements gzs<kp9> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final kp9 invoke() {
            Logger logger = yfq0.a;
            Logger logger2 = v6g0.a;
            return new kp9(v6g0.g());
        }
    }

    /* compiled from: FullyPackageRemovedReceiver.kt */
    public static final class c extends Lambda implements gzs<Logger> {
        public static final c i = new c(0);

        @Override // xsna.gzs
        public final Logger invoke() {
            Logger defaultLogger;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            return defaultLogger.createLogger("PackageRemovedReceiver");
        }
    }

    /* compiled from: FullyPackageRemovedReceiver.kt */
    public static final class d extends Lambda implements gzs<nj10> {
        public static final d i = new d(0);

        @Override // xsna.gzs
        public final nj10 invoke() {
            Logger logger = ycx.a;
            return ycx.a();
        }
    }

    /* compiled from: FullyPackageRemovedReceiver.kt */
    public static final class e extends Lambda implements gzs<bk10> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final bk10 invoke() {
            Logger logger = v6g0.a;
            return v6g0.d();
        }
    }

    /* compiled from: FullyPackageRemovedReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.broadcast.FullyPackageRemovedReceiver$onReceive$1", f = "FullyPackageRemovedReceiver.kt", l = {56}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $packageName;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, BroadcastReceiver.PendingResult pendingResult, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$packageName = str;
            this.$pendingResult = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return FullyPackageRemovedReceiver.this.new f(this.$packageName, this.$pendingResult, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    FullyPackageRemovedReceiver fullyPackageRemovedReceiver = FullyPackageRemovedReceiver.this;
                    String str = this.$packageName;
                    this.label = 1;
                    if (FullyPackageRemovedReceiver.a(fullyPackageRemovedReceiver, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                this.$pendingResult.finish();
                return s3q0.a;
            } catch (Throwable th) {
                this.$pendingResult.finish();
                throw th;
            }
        }
    }

    /* compiled from: FullyPackageRemovedReceiver.kt */
    public static final class g extends Lambda implements gzs<nhe0> {
        public static final g i = new g(0);

        @Override // xsna.gzs
        public final nhe0 invoke() {
            return g9i.a();
        }
    }

    /* compiled from: FullyPackageRemovedReceiver.kt */
    public static final class h extends Lambda implements gzs<spk0> {
        public static final h i = new h(0);

        @Override // xsna.gzs
        public final spk0 invoke() {
            Logger logger = yfq0.a;
            Logger logger2 = v6g0.a;
            return new spk0(v6g0.g());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r13 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(FullyPackageRemovedReceiver fullyPackageRemovedReceiver, String str, ContinuationImpl continuationImpl) {
        com.vk.push.pushsdk.broadcast.a aVar;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        FullyPackageRemovedReceiver fullyPackageRemovedReceiver2;
        String str2;
        fullyPackageRemovedReceiver.getClass();
        if (continuationImpl instanceof com.vk.push.pushsdk.broadcast.a) {
            aVar = (com.vk.push.pushsdk.broadcast.a) continuationImpl;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                obj = aVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                        return s3q0.a;
                    }
                    fullyPackageRemovedReceiver.b(str, false, true);
                    bk10 bk10Var = (bk10) fullyPackageRemovedReceiver.d.getValue();
                    aVar.L$0 = fullyPackageRemovedReceiver;
                    aVar.L$1 = str;
                    aVar.label = 1;
                    obj = bk10Var.a(aVar);
                } else if (i == 1) {
                    str = (String) aVar.L$1;
                    fullyPackageRemovedReceiver = (FullyPackageRemovedReceiver) aVar.L$0;
                    kotlin.a.a(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (String) aVar.L$1;
                        fullyPackageRemovedReceiver2 = (FullyPackageRemovedReceiver) aVar.L$0;
                        kotlin.a.a(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Logger.DefaultImpls.info$default((Logger) fullyPackageRemovedReceiver2.a.getValue(), "This host not a master. Work can't been invoked", null, 2, null);
                            return s3q0.a;
                        }
                        bpn0 bpn0Var = fullyPackageRemovedReceiver2.a;
                        bpn0 bpn0Var2 = fullyPackageRemovedReceiver2.e;
                        Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), zr.a("Handle package ", str2, " removed from receiver"), null, 2, null);
                        if (((nhe0) bpn0Var2.getValue()).c.contains(str2)) {
                            Logger.DefaultImpls.info$default((Logger) fullyPackageRemovedReceiver2.a.getValue(), "Stop delivering pushes to ".concat(str2), null, 2, null);
                            ((nhe0) bpn0Var2.getValue()).f(str2);
                        }
                        return s3q0.a;
                    }
                    str2 = (String) aVar.L$1;
                    fullyPackageRemovedReceiver2 = (FullyPackageRemovedReceiver) aVar.L$0;
                    kotlin.a.a(obj);
                    fullyPackageRemovedReceiver2.b(str2, ((Boolean) obj).booleanValue(), false);
                    bk10 bk10Var2 = (bk10) fullyPackageRemovedReceiver2.d.getValue();
                    aVar.L$0 = fullyPackageRemovedReceiver2;
                    aVar.L$1 = str2;
                    aVar.label = 3;
                    obj = bk10Var2.b(aVar);
                }
                nj10 nj10Var = (nj10) fullyPackageRemovedReceiver.c.getValue();
                fzs fzsVar = new fzs(fullyPackageRemovedReceiver, str, (String) obj);
                aVar.L$0 = fullyPackageRemovedReceiver;
                aVar.L$1 = str;
                aVar.label = 2;
                obj = nj10Var.f(str, fzsVar, aVar);
                if (obj != coroutineSingletons) {
                    String str3 = str;
                    fullyPackageRemovedReceiver2 = fullyPackageRemovedReceiver;
                    str2 = str3;
                    fullyPackageRemovedReceiver2.b(str2, ((Boolean) obj).booleanValue(), false);
                    bk10 bk10Var22 = (bk10) fullyPackageRemovedReceiver2.d.getValue();
                    aVar.L$0 = fullyPackageRemovedReceiver2;
                    aVar.L$1 = str2;
                    aVar.label = 3;
                    obj = bk10Var22.b(aVar);
                }
                return coroutineSingletons;
            }
        }
        aVar = new com.vk.push.pushsdk.broadcast.a(fullyPackageRemovedReceiver, continuationImpl);
        obj = aVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        nj10 nj10Var2 = (nj10) fullyPackageRemovedReceiver.c.getValue();
        fzs fzsVar2 = new fzs(fullyPackageRemovedReceiver, str, (String) obj);
        aVar.L$0 = fullyPackageRemovedReceiver;
        aVar.L$1 = str;
        aVar.label = 2;
        obj = nj10Var2.f(str, fzsVar2, aVar);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void b(String str, boolean z, boolean z2) {
        Logger.DefaultImpls.info$default((Logger) this.a.getValue(), "scheduleRetryWork check that deleted app: " + str + " is host successful = " + z, null, 2, null);
        if (z) {
            ((kp9) this.f.getValue()).a.a("VKPNS_CheckThatDeletedAppIsHostWorker");
            return;
        }
        spk0 spk0Var = (spk0) this.g.getValue();
        spk0Var.getClass();
        long j = z2 ? 600000L : 0L;
        WorkModel.KeepExistingWork keepExistingWork = WorkModel.KeepExistingWork.NO;
        Bundle bundle = new Bundle(2);
        bundle.putLong("initial_delay", j);
        bundle.putString("deleted_package_name", str);
        s3q0 s3q0Var = s3q0.a;
        spk0Var.a.b(new WorkModel("VKPNS_CheckThatDeletedAppIsHostWorker", keepExistingWork, bundle));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data;
        if ((epx.f(intent.getAction(), "android.intent.action.PACKAGE_FULLY_REMOVED") || epx.f(intent.getAction(), "android.intent.action.PACKAGE_DATA_CLEARED")) && (data = intent.getData()) != null) {
            myc0.h(this.b, null, null, new f(data.getSchemeSpecificPart(), goAsync(), null), 3);
        }
    }
}
