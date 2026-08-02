package com.unity3d.services.core.extensions;

import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lku3;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1<T> extends hoi implements Function2<ku3, rq3<? super T>, Object> {
    final /* synthetic */ Function1<rq3<? super T>, Object> $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(Function1<? super rq3<? super T>, ? extends Object> function1, rq3<? super CoroutineExtensionsKt$memoize$2$deferred$1$1$1> rq3Var) {
        super(2, rq3Var);
        this.$action = function1;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super T> rq3Var) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        Function1<rq3<? super T>, Object> function1 = this.$action;
        this.label = 1;
        Object invoke = function1.invoke(this);
        return invoke == lu3Var ? lu3Var : invoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }
}
