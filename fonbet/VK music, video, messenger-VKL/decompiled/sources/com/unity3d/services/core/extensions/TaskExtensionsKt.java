package com.unity3d.services.core.extensions;

import com.unity3d.services.core.log.DeviceLog;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.qsl;
import xsna.spj;
import xsna.wzs;

/* compiled from: TaskExtensions.kt */
/* loaded from: classes14.dex */
public final class TaskExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0112 -> B:11:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012f -> B:12:0x013a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withRetry(long j, int i, double d, Exception exc, wzs<? super Integer, ? super spj<? super T>, ? extends Object> wzsVar, spj<? super T> spjVar) {
        TaskExtensionsKt$withRetry$1 taskExtensionsKt$withRetry$1;
        int i2;
        long j2;
        double d2;
        wzs<? super Integer, ? super spj<? super T>, ? extends Object> wzsVar2;
        Ref$LongRef ref$LongRef;
        TaskExtensionsKt$withRetry$1 taskExtensionsKt$withRetry$12;
        int i3;
        int i4;
        Exception exc2;
        Exception exc3;
        wzs<? super Integer, ? super spj<? super T>, ? extends Object> wzsVar3;
        Ref$LongRef ref$LongRef2;
        long j3;
        int i5;
        double d3;
        int i6;
        int i7;
        Throwable th;
        int i8;
        int i9;
        boolean z;
        if (spjVar instanceof TaskExtensionsKt$withRetry$1) {
            taskExtensionsKt$withRetry$1 = (TaskExtensionsKt$withRetry$1) spjVar;
            int i10 = taskExtensionsKt$withRetry$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                taskExtensionsKt$withRetry$1.label = i10 - Integer.MIN_VALUE;
                Object obj = taskExtensionsKt$withRetry$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = taskExtensionsKt$withRetry$1.label;
                int i11 = 1;
                if (i2 != 0) {
                    a.a(obj);
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    j2 = j;
                    ref$LongRef3.element = j2;
                    d2 = d;
                    wzsVar2 = wzsVar;
                    ref$LongRef = ref$LongRef3;
                    taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                    i3 = 0;
                    i4 = i;
                    exc2 = exc;
                    if (i3 >= i4) {
                    }
                } else if (i2 == 1) {
                    i7 = taskExtensionsKt$withRetry$1.I$2;
                    i6 = taskExtensionsKt$withRetry$1.I$1;
                    d3 = taskExtensionsKt$withRetry$1.D$0;
                    i5 = taskExtensionsKt$withRetry$1.I$0;
                    j3 = taskExtensionsKt$withRetry$1.J$0;
                    ref$LongRef2 = (Ref$LongRef) taskExtensionsKt$withRetry$1.L$2;
                    wzsVar3 = (wzs) taskExtensionsKt$withRetry$1.L$1;
                    exc3 = (Exception) taskExtensionsKt$withRetry$1.L$0;
                    try {
                        a.a(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Failure failure = new Result.Failure(th);
                        int i12 = i6;
                        i8 = i7;
                        i9 = i12;
                        obj = failure;
                        z = obj instanceof Result.Failure;
                        if (!z) {
                        }
                    }
                    int i13 = i6;
                    i8 = i7;
                    i9 = i13;
                    z = obj instanceof Result.Failure;
                    if (!z) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i9 = taskExtensionsKt$withRetry$1.I$1;
                    double d4 = taskExtensionsKt$withRetry$1.D$0;
                    int i14 = taskExtensionsKt$withRetry$1.I$0;
                    long j4 = taskExtensionsKt$withRetry$1.J$0;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) taskExtensionsKt$withRetry$1.L$2;
                    wzs<? super Integer, ? super spj<? super T>, ? extends Object> wzsVar4 = (wzs) taskExtensionsKt$withRetry$1.L$1;
                    Exception exc4 = (Exception) taskExtensionsKt$withRetry$1.L$0;
                    a.a(obj);
                    int i15 = 1;
                    ref$LongRef4.element = (long) (j4 * d4);
                    Ref$LongRef ref$LongRef5 = ref$LongRef4;
                    taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                    i4 = i14;
                    wzs<? super Integer, ? super spj<? super T>, ? extends Object> wzsVar5 = wzsVar4;
                    ref$LongRef2 = ref$LongRef5;
                    wzsVar2 = wzsVar5;
                    d2 = d4;
                    j2 = j4;
                    int i16 = i9 + 1;
                    i11 = i15;
                    exc2 = exc4;
                    ref$LongRef = ref$LongRef2;
                    i3 = i16;
                    if (i3 >= i4) {
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            exc3 = exc2;
                            i7 = i3;
                            ref$LongRef2 = ref$LongRef;
                            wzsVar3 = wzsVar2;
                            i5 = i4;
                            taskExtensionsKt$withRetry$1 = taskExtensionsKt$withRetry$12;
                            j3 = j2;
                            d3 = d2;
                            i6 = i7;
                            Result.Failure failure2 = new Result.Failure(th);
                            int i122 = i6;
                            i8 = i7;
                            i9 = i122;
                            obj = failure2;
                            z = obj instanceof Result.Failure;
                            if (!z) {
                            }
                        }
                        Integer num = new Integer(i3);
                        taskExtensionsKt$withRetry$12.L$0 = exc2;
                        taskExtensionsKt$withRetry$12.L$1 = wzsVar2;
                        taskExtensionsKt$withRetry$12.L$2 = ref$LongRef;
                        taskExtensionsKt$withRetry$12.J$0 = j2;
                        taskExtensionsKt$withRetry$12.I$0 = i4;
                        taskExtensionsKt$withRetry$12.D$0 = d2;
                        taskExtensionsKt$withRetry$12.I$1 = i3;
                        taskExtensionsKt$withRetry$12.I$2 = i3;
                        taskExtensionsKt$withRetry$12.label = i11;
                        obj = wzsVar2.invoke(num, taskExtensionsKt$withRetry$12);
                        if (obj != coroutineSingletons) {
                            exc3 = exc2;
                            i7 = i3;
                            ref$LongRef2 = ref$LongRef;
                            wzsVar3 = wzsVar2;
                            i5 = i4;
                            taskExtensionsKt$withRetry$1 = taskExtensionsKt$withRetry$12;
                            j3 = j2;
                            d3 = d2;
                            i6 = i7;
                            int i132 = i6;
                            i8 = i7;
                            i9 = i132;
                            z = obj instanceof Result.Failure;
                            if (!z) {
                                a.a(obj);
                                return obj;
                            }
                            if (z) {
                                Throwable a = Result.a(obj);
                                if (a instanceof AbortRetryException) {
                                    throw a;
                                }
                                if (i8 + i11 == i5) {
                                    throw exc3;
                                }
                                StringBuilder sb = new StringBuilder("Unity Ads init: retrying in ");
                                i15 = i11;
                                sb.append(ref$LongRef2.element);
                                sb.append(" milliseconds");
                                DeviceLog.debug(sb.toString());
                                long j5 = ref$LongRef2.element;
                                taskExtensionsKt$withRetry$1.L$0 = exc3;
                                taskExtensionsKt$withRetry$1.L$1 = wzsVar3;
                                taskExtensionsKt$withRetry$1.L$2 = ref$LongRef2;
                                taskExtensionsKt$withRetry$1.J$0 = j3;
                                taskExtensionsKt$withRetry$1.I$0 = i5;
                                taskExtensionsKt$withRetry$1.D$0 = d3;
                                taskExtensionsKt$withRetry$1.I$1 = i9;
                                taskExtensionsKt$withRetry$1.label = 2;
                                if (qsl.b(j5, taskExtensionsKt$withRetry$1) != coroutineSingletons) {
                                    d4 = d3;
                                    i14 = i5;
                                    j4 = j3;
                                    ref$LongRef4 = ref$LongRef2;
                                    wzsVar4 = wzsVar3;
                                    exc4 = exc3;
                                    ref$LongRef4.element = (long) (j4 * d4);
                                    Ref$LongRef ref$LongRef52 = ref$LongRef4;
                                    taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                                    i4 = i14;
                                    wzs<? super Integer, ? super spj<? super T>, ? extends Object> wzsVar52 = wzsVar4;
                                    ref$LongRef2 = ref$LongRef52;
                                    wzsVar2 = wzsVar52;
                                    d2 = d4;
                                    j2 = j4;
                                    int i162 = i9 + 1;
                                    i11 = i15;
                                    exc2 = exc4;
                                    ref$LongRef = ref$LongRef2;
                                    i3 = i162;
                                    if (i3 >= i4) {
                                        throw new IllegalStateException("Unknown exception from withRetry");
                                    }
                                }
                            } else {
                                i15 = i11;
                                taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                                i4 = i5;
                                d2 = d3;
                                j2 = j3;
                                wzsVar2 = wzsVar3;
                                exc4 = exc3;
                                int i1622 = i9 + 1;
                                i11 = i15;
                                exc2 = exc4;
                                ref$LongRef = ref$LongRef2;
                                i3 = i1622;
                                if (i3 >= i4) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        taskExtensionsKt$withRetry$1 = new TaskExtensionsKt$withRetry$1(spjVar);
        Object obj2 = taskExtensionsKt$withRetry$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = taskExtensionsKt$withRetry$1.label;
        int i112 = 1;
        if (i2 != 0) {
        }
    }

    public static /* synthetic */ Object withRetry$default(long j, int i, double d, Exception exc, wzs wzsVar, spj spjVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = 5000;
        }
        if ((i2 & 2) != 0) {
            i = 6;
        }
        if ((i2 & 4) != 0) {
            d = 2.0d;
        }
        int i3 = i;
        return withRetry(j, i3, d, exc, wzsVar, spjVar);
    }
}
