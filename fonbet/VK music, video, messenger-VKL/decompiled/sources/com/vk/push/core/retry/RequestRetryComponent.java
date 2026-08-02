package com.vk.push.core.retry;

import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.backoff.ExponentialBackOff;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.izs;
import xsna.ms9;
import xsna.spj;
import xsna.zcl;

/* compiled from: RequestRetryComponent.kt */
/* loaded from: classes5.dex */
public abstract class RequestRetryComponent {
    public static final Companion Companion = new Companion(null);
    public static final long b;
    public static final long c;
    public final BackOff a;

    /* compiled from: RequestRetryComponent.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BackOff createDefaultBackOffForRequest() {
            return new ExponentialBackOff.Builder().initialBackOff(RequestRetryComponent.b).maxBackOff(RequestRetryComponent.c).scaleFactor(2.0d).build();
        }

        public Companion() {
        }
    }

    /* compiled from: RequestRetryComponent.kt */
    @b6l(c = "com.vk.push.core.retry.RequestRetryComponent", f = "RequestRetryComponent.kt", l = {17, 39, 41}, m = "invoke-gIAlu-s")
    public static final class a<T> extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object m110invokegIAlus = RequestRetryComponent.this.m110invokegIAlus(null, this);
            return m110invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m110invokegIAlus : new Result(m110invokegIAlus);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = timeUnit.toMillis(1L);
        c = timeUnit.toMillis(32L);
    }

    public RequestRetryComponent(BackOff backOff) {
        this.a = backOff;
    }

    public abstract Logger getLogger();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        if (xsna.qsl.b(r12, r1) == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        if (r0 == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0104 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /* renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object m110invokegIAlus(izs<? super spj<? super Result<? extends T>>, ? extends Object> izsVar, spj<? super Result<? extends T>> spjVar) {
        a aVar;
        RequestRetryComponent requestRetryComponent;
        int i;
        izs<? super spj<? super Result<? extends T>>, ? extends Object> izsVar2;
        RequestRetryComponent requestRetryComponent2;
        int i2;
        RequestRetryComponent requestRetryComponent3;
        izs<? super spj<? super Result<? extends T>>, ? extends Object> izsVar3;
        Throwable a2;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i3 = aVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.label = i3 - Integer.MIN_VALUE;
                requestRetryComponent = this;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                int i4 = 1;
                if (i != 0) {
                    kotlin.a.a(obj);
                    izsVar2 = izsVar;
                    requestRetryComponent2 = requestRetryComponent;
                    i2 = 1;
                    if (i2 >= 6) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return ((Result) obj).d();
                    }
                    i2 = aVar.I$0;
                    izsVar3 = (izs) aVar.L$1;
                    requestRetryComponent3 = (RequestRetryComponent) aVar.L$0;
                    kotlin.a.a(obj);
                    int i5 = 1;
                    izsVar2 = izsVar3;
                    requestRetryComponent2 = requestRetryComponent3;
                    i2++;
                    i4 = i5;
                    if (i2 >= 6) {
                        Logger.DefaultImpls.info$default(requestRetryComponent2.getLogger(), "Trying to invoke the request", null, 2, null);
                        aVar.L$0 = requestRetryComponent2;
                        aVar.L$1 = izsVar2;
                        aVar.I$0 = i2;
                        aVar.label = i4;
                        Object invoke = izsVar2.invoke(aVar);
                        if (invoke != coroutineSingletons) {
                            RequestRetryComponent requestRetryComponent4 = requestRetryComponent2;
                            izsVar3 = izsVar2;
                            obj = invoke;
                            requestRetryComponent3 = requestRetryComponent4;
                            Object d = ((Result) obj).d();
                            a2 = Result.a(d);
                            if (a2 != null) {
                                requestRetryComponent3.a.resetBackOff();
                                Logger.DefaultImpls.info$default(requestRetryComponent3.getLogger(), "Request completed successfully", null, 2, null);
                                return d;
                            }
                            boolean isRetryableError = requestRetryComponent3.isRetryableError(a2);
                            BackOff backOff = requestRetryComponent3.a;
                            if (!isRetryableError) {
                                backOff.resetBackOff();
                                Logger.DefaultImpls.info$default(requestRetryComponent3.getLogger(), ms9.b("Request completed with not retryable error: ", a2), null, 2, null);
                                return d;
                            }
                            if (i2 >= 5) {
                                backOff.resetBackOff();
                                Logger.DefaultImpls.info$default(requestRetryComponent3.getLogger(), ms9.b("Attempts have exceeded the maximum number: 5 with error: ", a2), null, 2, null);
                                return d;
                            }
                            long nextBackOff = backOff.getNextBackOff();
                            Logger logger = requestRetryComponent3.getLogger();
                            StringBuilder sb = new StringBuilder("Retry request after ");
                            i5 = i4;
                            sb.append(TimeUnit.MILLISECONDS.toSeconds(nextBackOff));
                            sb.append(" seconds because it completed with an error: ");
                            sb.append(a2);
                            Logger.DefaultImpls.warn$default(logger, sb.toString(), null, 2, null);
                            aVar.L$0 = requestRetryComponent3;
                            aVar.L$1 = izsVar3;
                            aVar.I$0 = i2;
                            aVar.label = 2;
                        }
                    } else {
                        aVar.L$0 = null;
                        aVar.L$1 = null;
                        aVar.label = 3;
                        obj = izsVar2.invoke(aVar);
                    }
                    return coroutineSingletons;
                }
                i2 = aVar.I$0;
                izsVar3 = (izs) aVar.L$1;
                requestRetryComponent3 = (RequestRetryComponent) aVar.L$0;
                kotlin.a.a(obj);
                Object d2 = ((Result) obj).d();
                a2 = Result.a(d2);
                if (a2 != null) {
                }
            }
        }
        requestRetryComponent = this;
        aVar = requestRetryComponent.new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        int i42 = 1;
        if (i != 0) {
        }
    }

    public abstract boolean isRetryableError(Throwable th);
}
