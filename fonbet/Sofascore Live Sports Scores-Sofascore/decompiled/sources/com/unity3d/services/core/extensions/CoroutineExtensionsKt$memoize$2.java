package com.unity3d.services.core.extensions;

import defpackage.a70;
import defpackage.h2d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zu4;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lku3;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CoroutineExtensionsKt$memoize$2<T> extends hoi implements Function2<ku3, rq3<? super T>, Object> {
    final /* synthetic */ Function1<rq3<? super T>, Object> $action;
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2(Object obj, Function1<? super rq3<? super T>, ? extends Object> function1, rq3<? super CoroutineExtensionsKt$memoize$2> rq3Var) {
        super(2, rq3Var);
        this.$key = obj;
        this.$action = function1;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(this.$key, this.$action, rq3Var);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super T> rq3Var) {
        return ((CoroutineExtensionsKt$memoize$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        h2d mutex;
        Function1<rq3<? super T>, Object> function1;
        Object obj2;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        try {
            if (i == 0) {
                y6a.M(obj);
                ku3Var = (ku3) this.L$0;
                mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                function1 = this.$action;
                this.L$0 = ku3Var;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = function1;
                this.label = 1;
                if (mutex.e(this) != lu3Var) {
                    obj2 = obj3;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function1 = (Function1) this.L$3;
            obj2 = this.L$2;
            mutex = (h2d) this.L$1;
            ku3Var = (ku3) this.L$0;
            y6a.M(obj);
            LinkedHashMap<Object, zu4> deferreds = CoroutineExtensionsKt.getDeferreds();
            zu4 zu4Var = deferreds.get(obj2);
            if (zu4Var == null) {
                zu4Var = xw3.t(ku3Var, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3);
                deferreds.put(obj2, zu4Var);
            }
            zu4 zu4Var2 = zu4Var;
            mutex.f(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            Object T = zu4Var2.T(this);
            return T == lu3Var ? lu3Var : T;
        } catch (Throwable th) {
            mutex.f(null);
            throw th;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        ku3 ku3Var = (ku3) this.L$0;
        h2d mutex = CoroutineExtensionsKt.getMutex();
        Object obj2 = this.$key;
        Function1<rq3<? super T>, Object> function1 = this.$action;
        mutex.e(this);
        try {
            LinkedHashMap<Object, zu4> deferreds = CoroutineExtensionsKt.getDeferreds();
            zu4 zu4Var = deferreds.get(obj2);
            if (zu4Var == null) {
                zu4Var = xw3.t(ku3Var, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(function1, null), 3);
                deferreds.put(obj2, zu4Var);
            }
            zu4 zu4Var2 = zu4Var;
            mutex.f(null);
            return zu4Var2.T(this);
        } catch (Throwable th) {
            mutex.f(null);
            throw th;
        }
    }
}
