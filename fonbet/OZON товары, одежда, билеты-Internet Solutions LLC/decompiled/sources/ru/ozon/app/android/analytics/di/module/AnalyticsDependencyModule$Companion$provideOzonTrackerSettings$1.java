package ru.ozon.app.android.analytics.di.module;

import Ci0.g;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import pi0.f;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$1", f = "AnalyticsDependencyModule.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ kotlin.jvm.internal.M<f> $trackerConfig;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$1(kotlin.jvm.internal.M<f> m11, d<? super AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$1> dVar) {
        super(2, dVar);
        this.$trackerConfig = m11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$1(this.$trackerConfig, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.M<f> m11;
        T t2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            kotlin.jvm.internal.M<f> m12 = this.$trackerConfig;
            g.f5125a.getClass();
            pi0.g e11 = g.e();
            this.L$0 = m12;
            this.label = 1;
            Object a11 = e11.a(this);
            if (a11 == aVar) {
                return aVar;
            }
            m11 = m12;
            t2 = a11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (kotlin.jvm.internal.M) this.L$0;
            s.b(obj);
            t2 = obj;
        }
        m11.f71787a = t2;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AnalyticsDependencyModule$Companion$provideOzonTrackerSettings$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
