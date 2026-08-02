package ru.ozon.app.android.travel.utils.asyncWidget;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import java.lang.reflect.GenericDeclaration;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel;
import ru.ozon.tracker.performance.MetricType;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1", f = "AbstractAsyncMultipleRequestsWidgetViewModel.kt", l = {88, 90, 92, 96, 102, 103}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<MetricType, Long> $additionalMetrics;
    final /* synthetic */ String $asyncData;
    final /* synthetic */ Class<DTO> $stateType;
    final /* synthetic */ Map<String, Object> $withParameters;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1(AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel, String str, Map<String, ? extends Object> map, Class<DTO> cls, Map<MetricType, Long> map2, d<? super AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1> dVar) {
        super(2, dVar);
        this.this$0 = abstractAsyncMultipleRequestsWidgetViewModel;
        this.$asyncData = str;
        this.$withParameters = map;
        this.$stateType = cls;
        this.$additionalMetrics = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = new AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1(this.this$0, this.$asyncData, this.$withParameters, this.$stateType, this.$additionalMetrics, dVar);
        abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = obj;
        return abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f8, code lost:
    
        if (r9.emit(r2, r8) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010f, code lost:
    
        if (r9.emit(r4, r8) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if (r9.emit(r4, r8) == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1;
        Object a11;
        Object obj2;
        M m11;
        w0 w0Var;
        Throwable b11;
        M m12;
        boolean z11;
        w0 w0Var2;
        w0 w0Var3;
        Map map;
        AbstractAsyncMultipleRequestsWidgetViewModel abstractAsyncMultipleRequestsWidgetViewModel;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository2;
        ComposerAsyncWidgetResponse composerAsyncWidgetResponse;
        a aVar = a.COROUTINE_SUSPENDED;
        try {
            try {
            } catch (Throwable th3) {
                th2 = th3;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                r.Companion companion = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel2 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                if (!(obj2 instanceof r.b)) {
                }
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel3 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str2 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                return Unit.f71690a;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        switch (this.label) {
            case 0:
                s.b(obj);
                Map<String, ? extends Object> map2 = this.$withParameters;
                abstractAsyncMultipleRequestsWidgetViewModel = this.this$0;
                String str3 = this.$asyncData;
                GenericDeclaration genericDeclaration = this.$stateType;
                Map<MetricType, Long> map3 = this.$additionalMetrics;
                try {
                    r.Companion companion2 = r.INSTANCE;
                } catch (Throwable th5) {
                    th = th5;
                    abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                    th2 = th;
                    r.Companion companion3 = r.INSTANCE;
                    a11 = s.a(th2);
                    obj2 = a11;
                    AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel22 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                    String str4 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                    if (!(obj2 instanceof r.b)) {
                    }
                    AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel32 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                    String str22 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                    map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                    return Unit.f71690a;
                }
                if (map2 != null && !map2.isEmpty()) {
                    composerAsyncWidgetRepository2 = abstractAsyncMultipleRequestsWidgetViewModel.asyncWidgetRepository;
                    this.L$0 = abstractAsyncMultipleRequestsWidgetViewModel;
                    this.label = 2;
                    abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                    obj = composerAsyncWidgetRepository2.fetchWidget(str3, map2, genericDeclaration, map3, abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1);
                    if (obj == aVar) {
                    }
                    composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                    abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = null;
                    abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 3;
                    obj = abstractAsyncMultipleRequestsWidgetViewModel.mapAsyncWidgetResponse(composerAsyncWidgetResponse, this);
                    if (obj == aVar) {
                    }
                    a11 = (AsyncWidgetFetchedModel) obj;
                    r.Companion companion4 = r.INSTANCE;
                    obj2 = a11;
                    AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                    String str42 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                    if (!(obj2 instanceof r.b)) {
                    }
                    AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel322 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                    String str222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                    map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                    return Unit.f71690a;
                }
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                composerAsyncWidgetRepository = abstractAsyncMultipleRequestsWidgetViewModel.asyncWidgetRepository;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = abstractAsyncMultipleRequestsWidgetViewModel;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 1;
                obj = composerAsyncWidgetRepository.fetchWidget(str3, genericDeclaration, map3, this);
                if (obj == aVar) {
                }
                composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = null;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 3;
                obj = abstractAsyncMultipleRequestsWidgetViewModel.mapAsyncWidgetResponse(composerAsyncWidgetResponse, this);
                if (obj == aVar) {
                }
                a11 = (AsyncWidgetFetchedModel) obj;
                r.Companion companion42 = r.INSTANCE;
                obj2 = a11;
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel2222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str422 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                if (!(obj2 instanceof r.b)) {
                    AsyncWidgetFetchedModel asyncWidgetFetchedModel = (AsyncWidgetFetchedModel) obj2;
                    m11 = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel2222).scope;
                    if (N.f(m11)) {
                        w0Var = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel2222).fetchingEvents;
                        AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetched onWidgetFetched = new AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetched(asyncWidgetFetchedModel, str422);
                        abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = obj2;
                        abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 4;
                        break;
                    }
                }
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel3222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str2222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                b11 = r.b(obj2);
                if (b11 != null) {
                    m12 = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel3222).scope;
                    if (N.f(m12) && !((z11 = b11 instanceof CancellationException))) {
                        if (!(b11 instanceof Q00.a)) {
                            if (!z11) {
                                w0Var2 = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel3222).fetchingEvents;
                                AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetchingFailed onWidgetFetchingFailed = new AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetchingFailed(b11, str2222);
                                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = obj2;
                                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 6;
                                break;
                            }
                        } else {
                            w0Var3 = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel3222).fetchingEvents;
                            AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetSkipped onWidgetSkipped = new AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetSkipped();
                            abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = obj2;
                            abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 5;
                            break;
                        }
                    }
                }
                map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                return Unit.f71690a;
                return aVar;
            case 1:
                abstractAsyncMultipleRequestsWidgetViewModel = (AbstractAsyncMultipleRequestsWidgetViewModel) this.L$0;
                s.b(obj);
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = null;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 3;
                obj = abstractAsyncMultipleRequestsWidgetViewModel.mapAsyncWidgetResponse(composerAsyncWidgetResponse, this);
                if (obj == aVar) {
                }
                a11 = (AsyncWidgetFetchedModel) obj;
                r.Companion companion422 = r.INSTANCE;
                obj2 = a11;
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel22222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str4222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                if (!(obj2 instanceof r.b)) {
                }
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel32222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str22222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                return Unit.f71690a;
            case 2:
                abstractAsyncMultipleRequestsWidgetViewModel = (AbstractAsyncMultipleRequestsWidgetViewModel) this.L$0;
                s.b(obj);
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.L$0 = null;
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.label = 3;
                obj = abstractAsyncMultipleRequestsWidgetViewModel.mapAsyncWidgetResponse(composerAsyncWidgetResponse, this);
                if (obj == aVar) {
                }
                a11 = (AsyncWidgetFetchedModel) obj;
                r.Companion companion4222 = r.INSTANCE;
                obj2 = a11;
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel222222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str42222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                if (!(obj2 instanceof r.b)) {
                }
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel322222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str222222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                return Unit.f71690a;
            case 3:
                s.b(obj);
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                a11 = (AsyncWidgetFetchedModel) obj;
                r.Companion companion42222 = r.INSTANCE;
                obj2 = a11;
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel2222222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str422222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                if (!(obj2 instanceof r.b)) {
                }
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel3222222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str2222222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                return Unit.f71690a;
            case 4:
                obj2 = this.L$0;
                s.b(obj);
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel32222222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0;
                String str22222222 = abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                return Unit.f71690a;
            case 5:
            case 6:
                s.b(obj);
                abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1 = this;
                map = ((AbstractAsyncMultipleRequestsWidgetViewModel) abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.this$0).fetchJobs;
                map.remove(abstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1.$asyncData);
                return Unit.f71690a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AbstractAsyncMultipleRequestsWidgetViewModel$fetchWidget$fetchJob$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
