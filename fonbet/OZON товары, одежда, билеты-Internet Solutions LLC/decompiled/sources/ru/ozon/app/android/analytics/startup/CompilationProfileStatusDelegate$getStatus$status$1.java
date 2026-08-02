package ru.ozon.app.android.analytics.startup;

import Ce.b;
import Sc.s;
import Wc.a;
import androidx.concurrent.futures.c;
import androidx.profileinstaller.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)I"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.analytics.startup.CompilationProfileStatusDelegate$getStatus$status$1", f = "CompilationProfileStatusDelegate.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CompilationProfileStatusDelegate$getStatus$status$1 extends j implements Function2<M, d<? super Integer>, Object> {
    int label;

    CompilationProfileStatusDelegate$getStatus$status$1(d<? super CompilationProfileStatusDelegate$getStatus$status$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CompilationProfileStatusDelegate$getStatus$status$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            c a11 = i.a();
            Intrinsics.checkNotNullExpressionValue(a11, "getCompilationStatusAsync(...)");
            this.label = 1;
            obj = b.a(a11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return new Integer(((i.c) obj).a());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Integer> dVar) {
        return ((CompilationProfileStatusDelegate$getStatus$status$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
