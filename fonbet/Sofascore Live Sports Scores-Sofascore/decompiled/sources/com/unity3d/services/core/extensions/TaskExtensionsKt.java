package com.unity3d.services.core.extensions;

import com.unity3d.services.core.log.DeviceLog;
import defpackage.a70;
import defpackage.esf;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ad\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "", "retryDelay", "", "retries", "", "scalingFactor", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fallbackException", "Lkotlin/Function2;", "Lrq3;", "", "block", "withRetry", "(JIDLjava/lang/Exception;Lkotlin/jvm/functions/Function2;Lrq3;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TaskExtensionsKt {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
    
        if (defpackage.n4o.y(r5, r1) == r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x011a -> B:11:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x012e -> B:12:0x0122). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withRetry(long j, int i, double d, @NotNull Exception exc, @NotNull Function2<? super Integer, ? super rq3<? super T>, ? extends Object> function2, @NotNull rq3<? super T> rq3Var) {
        TaskExtensionsKt$withRetry$1 taskExtensionsKt$withRetry$1;
        int i2;
        esf esfVar;
        long j2;
        double d2;
        Function2<? super Integer, ? super rq3<? super T>, ? extends Object> function22;
        TaskExtensionsKt$withRetry$1 taskExtensionsKt$withRetry$12;
        int i3;
        int i4;
        Exception exc2;
        Exception exc3;
        Function2<? super Integer, ? super rq3<? super T>, ? extends Object> function23;
        esf esfVar2;
        long j3;
        int i5;
        double d3;
        int i6;
        int i7;
        Throwable th;
        Object obj;
        int i8;
        double d4;
        int i9;
        long j4;
        esf esfVar3;
        Function2<? super Integer, ? super rq3<? super T>, ? extends Object> function24;
        Exception exc4;
        boolean z;
        if (rq3Var instanceof TaskExtensionsKt$withRetry$1) {
            taskExtensionsKt$withRetry$1 = (TaskExtensionsKt$withRetry$1) rq3Var;
            int i10 = taskExtensionsKt$withRetry$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                taskExtensionsKt$withRetry$1.label = i10 - Integer.MIN_VALUE;
                Object obj2 = taskExtensionsKt$withRetry$1.result;
                lu3 lu3Var = lu3.a;
                i2 = taskExtensionsKt$withRetry$1.label;
                Object obj3 = null;
                char c = 2;
                int i11 = 1;
                if (i2 != 0) {
                    y6a.M(obj2);
                    esfVar = new esf();
                    j2 = j;
                    esfVar.a = j2;
                    d2 = d;
                    function22 = function2;
                    taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                    i3 = 0;
                    i4 = i;
                    exc2 = exc;
                    esf esfVar4 = esfVar;
                    if (i3 < i4) {
                    }
                } else if (i2 == 1) {
                    i7 = taskExtensionsKt$withRetry$1.I$2;
                    i6 = taskExtensionsKt$withRetry$1.I$1;
                    d3 = taskExtensionsKt$withRetry$1.D$0;
                    i5 = taskExtensionsKt$withRetry$1.I$0;
                    j3 = taskExtensionsKt$withRetry$1.J$0;
                    esfVar2 = (esf) taskExtensionsKt$withRetry$1.L$2;
                    function23 = (Function2) taskExtensionsKt$withRetry$1.L$1;
                    exc3 = (Exception) taskExtensionsKt$withRetry$1.L$0;
                    try {
                        y6a.M(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        p2g p2gVar = w2g.b;
                        obj = obj3;
                        obj2 = new u2g(th);
                        int i12 = i7;
                        i8 = i6;
                        d4 = d3;
                        i9 = i5;
                        j4 = j3;
                        esfVar3 = esfVar2;
                        function24 = function23;
                        exc4 = exc3;
                        z = obj2 instanceof u2g;
                        if (!z) {
                        }
                    }
                    p2g p2gVar2 = w2g.b;
                    obj = obj3;
                    int i122 = i7;
                    i8 = i6;
                    d4 = d3;
                    i9 = i5;
                    j4 = j3;
                    esfVar3 = esfVar2;
                    function24 = function23;
                    exc4 = exc3;
                    z = obj2 instanceof u2g;
                    if (!z) {
                    }
                } else {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i8 = taskExtensionsKt$withRetry$1.I$1;
                    d4 = taskExtensionsKt$withRetry$1.D$0;
                    i9 = taskExtensionsKt$withRetry$1.I$0;
                    j4 = taskExtensionsKt$withRetry$1.J$0;
                    esfVar3 = (esf) taskExtensionsKt$withRetry$1.L$2;
                    function24 = (Function2) taskExtensionsKt$withRetry$1.L$1;
                    exc4 = (Exception) taskExtensionsKt$withRetry$1.L$0;
                    y6a.M(obj2);
                    obj = null;
                    char c2 = 2;
                    int i13 = 1;
                    esfVar3.a = (long) (j4 * d4);
                    esfVar = esfVar3;
                    taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                    i4 = i9;
                    function22 = function24;
                    d2 = d4;
                    j2 = j4;
                    i3 = i8 + 1;
                    c = c2;
                    exc2 = exc4;
                    i11 = i13;
                    obj3 = obj;
                    esf esfVar42 = esfVar;
                    if (i3 < i4) {
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            exc3 = exc2;
                            i7 = i3;
                            esfVar2 = esfVar42;
                            function23 = function22;
                            i5 = i4;
                            taskExtensionsKt$withRetry$1 = taskExtensionsKt$withRetry$12;
                            j3 = j2;
                            d3 = d2;
                            i6 = i7;
                            p2g p2gVar3 = w2g.b;
                            obj = obj3;
                            obj2 = new u2g(th);
                            int i1222 = i7;
                            i8 = i6;
                            d4 = d3;
                            i9 = i5;
                            j4 = j3;
                            esfVar3 = esfVar2;
                            function24 = function23;
                            exc4 = exc3;
                            z = obj2 instanceof u2g;
                            if (!z) {
                            }
                        }
                        p2g p2gVar4 = w2g.b;
                        Integer num = new Integer(i3);
                        taskExtensionsKt$withRetry$12.L$0 = exc2;
                        taskExtensionsKt$withRetry$12.L$1 = function22;
                        taskExtensionsKt$withRetry$12.L$2 = esfVar42;
                        taskExtensionsKt$withRetry$12.J$0 = j2;
                        taskExtensionsKt$withRetry$12.I$0 = i4;
                        taskExtensionsKt$withRetry$12.D$0 = d2;
                        taskExtensionsKt$withRetry$12.I$1 = i3;
                        taskExtensionsKt$withRetry$12.I$2 = i3;
                        taskExtensionsKt$withRetry$12.label = i11;
                        obj2 = function22.invoke(num, taskExtensionsKt$withRetry$12);
                        if (obj2 != lu3Var) {
                            exc3 = exc2;
                            i7 = i3;
                            esfVar2 = esfVar42;
                            function23 = function22;
                            i5 = i4;
                            taskExtensionsKt$withRetry$1 = taskExtensionsKt$withRetry$12;
                            j3 = j2;
                            d3 = d2;
                            i6 = i7;
                            p2g p2gVar22 = w2g.b;
                            obj = obj3;
                            int i12222 = i7;
                            i8 = i6;
                            d4 = d3;
                            i9 = i5;
                            j4 = j3;
                            esfVar3 = esfVar2;
                            function24 = function23;
                            exc4 = exc3;
                            z = obj2 instanceof u2g;
                            if (!z) {
                                y6a.M(obj2);
                                return obj2;
                            }
                            if (z) {
                                Throwable a = w2g.a(obj2);
                                if (a instanceof AbortRetryException) {
                                    throw a;
                                }
                                if (i12222 + i11 == i9) {
                                    throw exc4;
                                }
                                StringBuilder sb = new StringBuilder("Unity Ads init: retrying in ");
                                i13 = i11;
                                sb.append(esfVar3.a);
                                sb.append(" milliseconds");
                                DeviceLog.debug(sb.toString());
                                long j5 = esfVar3.a;
                                taskExtensionsKt$withRetry$1.L$0 = exc4;
                                taskExtensionsKt$withRetry$1.L$1 = function24;
                                taskExtensionsKt$withRetry$1.L$2 = esfVar3;
                                taskExtensionsKt$withRetry$1.J$0 = j4;
                                taskExtensionsKt$withRetry$1.I$0 = i9;
                                taskExtensionsKt$withRetry$1.D$0 = d4;
                                taskExtensionsKt$withRetry$1.I$1 = i8;
                                c2 = 2;
                                taskExtensionsKt$withRetry$1.label = 2;
                            } else {
                                c2 = c;
                                i13 = i11;
                                esfVar = esfVar3;
                                taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                                i4 = i9;
                                function22 = function24;
                                d2 = d4;
                                j2 = j4;
                                i3 = i8 + 1;
                                c = c2;
                                exc2 = exc4;
                                i11 = i13;
                                obj3 = obj;
                                esf esfVar422 = esfVar;
                                if (i3 < i4) {
                                    Object obj4 = obj3;
                                    a70.r("Unknown exception from withRetry");
                                    return obj4;
                                }
                            }
                        }
                        return lu3Var;
                    }
                }
            }
        }
        taskExtensionsKt$withRetry$1 = new TaskExtensionsKt$withRetry$1(rq3Var);
        Object obj22 = taskExtensionsKt$withRetry$1.result;
        lu3 lu3Var2 = lu3.a;
        i2 = taskExtensionsKt$withRetry$1.label;
        Object obj32 = null;
        char c3 = 2;
        int i112 = 1;
        if (i2 != 0) {
        }
    }

    public static /* synthetic */ Object withRetry$default(long j, int i, double d, Exception exc, Function2 function2, rq3 rq3Var, int i2, Object obj) {
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
        return withRetry(j, i3, d, exc, function2, rq3Var);
    }
}
