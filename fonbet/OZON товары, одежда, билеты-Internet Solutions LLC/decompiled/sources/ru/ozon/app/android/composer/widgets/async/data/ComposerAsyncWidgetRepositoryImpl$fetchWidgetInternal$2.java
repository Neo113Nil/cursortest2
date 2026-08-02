package ru.ozon.app.android.composer.widgets.async.data;

import L00.f;
import M00.a;
import O00.b;
import Qj0.r0;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.network.interceptors.LongPollingTag;
import ru.ozon.tracker.performance.MetricType;
import xe.M;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lxe/M;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepositoryImpl$fetchWidgetInternal$2", f = "ComposerAsyncWidgetRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ComposerAsyncWidgetRepositoryImpl$fetchWidgetInternal$2<T> extends j implements Function2<M, d<? super ComposerAsyncWidgetResponse<T>>, Object> {
    final /* synthetic */ Map<MetricType, Long> $additionalMetrics;
    final /* synthetic */ String $asyncData;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ Class<T> $responseType;
    int label;
    final /* synthetic */ ComposerAsyncWidgetRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerAsyncWidgetRepositoryImpl$fetchWidgetInternal$2(ComposerAsyncWidgetRepositoryImpl composerAsyncWidgetRepositoryImpl, String str, Map<String, ? extends Object> map, Class<T> cls, Map<MetricType, Long> map2, d<? super ComposerAsyncWidgetRepositoryImpl$fetchWidgetInternal$2> dVar) {
        super(2, dVar);
        this.this$0 = composerAsyncWidgetRepositoryImpl;
        this.$asyncData = str;
        this.$params = map;
        this.$responseType = cls;
        this.$additionalMetrics = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComposerAsyncWidgetRepositoryImpl$fetchWidgetInternal$2(this.this$0, this.$asyncData, this.$params, this.$responseType, this.$additionalMetrics, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        f fVar;
        b bVar;
        ComposerAsyncWidgetsAnalyticDelegate composerAsyncWidgetsAnalyticDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        Tc.d builder = new Tc.d();
        builder.put(LongPollingTag.class, LongPollingTag.INSTANCE);
        builder.put(r0.class, new r0(uuid));
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        fVar = this.this$0.baseUrl;
        a.C0334a c0334a = new a.C0334a(fVar, this.$asyncData);
        c0334a.a(this.$params);
        c0334a.d(u11);
        c0334a.f(uuid);
        M00.a b11 = c0334a.b();
        bVar = this.this$0.composerWidgetAsyncWidgetsRepository;
        M00.d a11 = bVar.a(b11, this.$responseType);
        composerAsyncWidgetsAnalyticDelegate = this.this$0.asyncWidgetsAnalyticDelegate;
        return new ComposerAsyncWidgetResponse(a11.a().b(), a11.a().c(), composerAsyncWidgetsAnalyticDelegate.getEnrichedMetrics(uuid, a11.a().a(), this.$additionalMetrics));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ComposerAsyncWidgetResponse<T>> dVar) {
        return ((ComposerAsyncWidgetRepositoryImpl$fetchWidgetInternal$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
