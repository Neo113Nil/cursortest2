package com.vk.push.pushsdk.work.multiprocess;

import android.content.Context;
import android.os.Bundle;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.vk.push.common.Logger;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bpn0;
import xsna.gzs;
import xsna.ovx0;
import xsna.spj;
import xsna.v6g0;
import xsna.wvx0;

/* compiled from: MultiProcessWorker.kt */
/* loaded from: classes5.dex */
public final class MultiProcessWorker extends CoroutineWorker {
    public final bpn0 b;

    /* compiled from: MultiProcessWorker.kt */
    @b6l(c = "com.vk.push.pushsdk.work.multiprocess.MultiProcessWorker", f = "MultiProcessWorker.kt", l = {30}, m = "doWork")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessWorker.this.doWork(this);
        }
    }

    /* compiled from: MultiProcessWorker.kt */
    public static final class b extends Lambda implements gzs<wvx0> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final wvx0 invoke() {
            Logger logger = v6g0.a;
            return (wvx0) v6g0.u.getValue();
        }
    }

    public MultiProcessWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = new bpn0(b.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(spj<? super b.a> spjVar) {
        a aVar;
        int i;
        Object n;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    String d = getInputData().d("WORK_NAME_KEY");
                    if (d == null) {
                        return new b.a.C0092a();
                    }
                    ovx0 ovx0Var = (ovx0) ((wvx0) this.b.getValue()).d.getValue();
                    WorkModel.KeepExistingWork keepExistingWork = WorkModel.KeepExistingWork.YES;
                    Bundle bundle = new Bundle();
                    bundle.putInt("retry_attempt_count", getRunAttemptCount());
                    Data inputData = getInputData();
                    inputData.getClass();
                    Data data = Data.b;
                    bundle.putByteArray("input_data", Data.b.b(inputData));
                    WorkModel workModel = new WorkModel(d, keepExistingWork, bundle);
                    aVar.label = 1;
                    n = ovx0Var.n(workModel, aVar);
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    n = ((Result) obj).d();
                }
                return Result.a(n) != null ? ((WorkResult) n).toListenableWorkerResult() : new b.a.C0092a();
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        if (Result.a(n) != null) {
        }
    }
}
