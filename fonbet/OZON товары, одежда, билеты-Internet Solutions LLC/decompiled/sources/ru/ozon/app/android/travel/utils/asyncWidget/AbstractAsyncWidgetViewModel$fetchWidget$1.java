package ru.ozon.app.android.travel.utils.asyncWidget;

import Sc.r;
import Sc.s;
import Wc.a;
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
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel$fetchWidget$1", f = "AbstractAsyncWidgetViewModel.kt", l = {116, 121, 127}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbstractAsyncWidgetViewModel$fetchWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ Class<DTO> $stateType;
    final /* synthetic */ Map<String, Object> $withParameters;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractAsyncWidgetViewModel<DTO, VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractAsyncWidgetViewModel$fetchWidget$1(Map<String, ? extends Object> map, AbstractAsyncWidgetViewModel<DTO, VO> abstractAsyncWidgetViewModel, String str, Class<DTO> cls, d<? super AbstractAsyncWidgetViewModel$fetchWidget$1> dVar) {
        super(2, dVar);
        this.$withParameters = map;
        this.this$0 = abstractAsyncWidgetViewModel;
        this.$asyncData = str;
        this.$stateType = cls;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbstractAsyncWidgetViewModel$fetchWidget$1 abstractAsyncWidgetViewModel$fetchWidget$1 = new AbstractAsyncWidgetViewModel$fetchWidget$1(this.$withParameters, this.this$0, this.$asyncData, this.$stateType, dVar);
        abstractAsyncWidgetViewModel$fetchWidget$1.L$0 = obj;
        return abstractAsyncWidgetViewModel$fetchWidget$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r0 == r8) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        M m11;
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        M m12;
        SingleLiveEvent singleLiveEvent3;
        AbstractAsyncWidgetViewModel abstractAsyncWidgetViewModel;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Object fetchWidget$default;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository2;
        Object fetchWidget$default2;
        ComposerAsyncWidgetResponse composerAsyncWidgetResponse;
        Object mapAsyncWidgetResponse;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            Map<String, Object> map = this.$withParameters;
            abstractAsyncWidgetViewModel = this.this$0;
            String str = this.$asyncData;
            Class<DTO> cls = this.$stateType;
            r.Companion companion2 = r.INSTANCE;
            if (map == null || map.isEmpty()) {
                composerAsyncWidgetRepository = abstractAsyncWidgetViewModel.asyncWidgetRepository;
                this.L$0 = abstractAsyncWidgetViewModel;
                this.label = 1;
                fetchWidget$default = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, cls, null, this, 4, null);
                if (fetchWidget$default == aVar) {
                }
                composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) fetchWidget$default;
            } else {
                composerAsyncWidgetRepository2 = abstractAsyncWidgetViewModel.asyncWidgetRepository;
                this.L$0 = abstractAsyncWidgetViewModel;
                this.label = 2;
                fetchWidget$default2 = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository2, str, map, cls, null, this, 8, null);
                if (fetchWidget$default2 == aVar) {
                }
                composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) fetchWidget$default2;
            }
            return aVar;
        }
        if (i11 == 1) {
            AbstractAsyncWidgetViewModel abstractAsyncWidgetViewModel2 = (AbstractAsyncWidgetViewModel) this.L$0;
            s.b(obj);
            abstractAsyncWidgetViewModel = abstractAsyncWidgetViewModel2;
            fetchWidget$default = obj;
            composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) fetchWidget$default;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                mapAsyncWidgetResponse = obj;
                a11 = (AsyncWidgetFetchedModel) mapAsyncWidgetResponse;
                r.Companion companion3 = r.INSTANCE;
                AbstractAsyncWidgetViewModel<DTO, VO> abstractAsyncWidgetViewModel3 = this.this$0;
                if (!(a11 instanceof r.b)) {
                    AsyncWidgetFetchedModel asyncWidgetFetchedModel = (AsyncWidgetFetchedModel) a11;
                    m12 = ((AbstractAsyncWidgetViewModel) abstractAsyncWidgetViewModel3).scope;
                    if (N.f(m12)) {
                        singleLiveEvent3 = ((AbstractAsyncWidgetViewModel) abstractAsyncWidgetViewModel3).eventsLiveData;
                        singleLiveEvent3.setValue(new AbstractAsyncWidgetViewModel.Event.OnWidgetFetched(asyncWidgetFetchedModel));
                    }
                }
                AbstractAsyncWidgetViewModel<DTO, VO> abstractAsyncWidgetViewModel4 = this.this$0;
                Throwable b11 = r.b(a11);
                if (b11 != null) {
                    m11 = ((AbstractAsyncWidgetViewModel) abstractAsyncWidgetViewModel4).scope;
                    if (N.f(m11)) {
                        if (b11 instanceof Q00.a) {
                            singleLiveEvent2 = ((AbstractAsyncWidgetViewModel) abstractAsyncWidgetViewModel4).eventsLiveData;
                            singleLiveEvent2.setValue(new AbstractAsyncWidgetViewModel.Event.OnWidgetSkipped());
                        } else if (!(b11 instanceof CancellationException)) {
                            singleLiveEvent = ((AbstractAsyncWidgetViewModel) abstractAsyncWidgetViewModel4).eventsLiveData;
                            singleLiveEvent.setValue(new AbstractAsyncWidgetViewModel.Event.OnWidgetFetchingFailed(b11));
                        }
                    }
                }
                return Unit.f71690a;
            }
            AbstractAsyncWidgetViewModel abstractAsyncWidgetViewModel5 = (AbstractAsyncWidgetViewModel) this.L$0;
            s.b(obj);
            abstractAsyncWidgetViewModel = abstractAsyncWidgetViewModel5;
            fetchWidget$default2 = obj;
            composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) fetchWidget$default2;
        }
        this.L$0 = null;
        this.label = 3;
        mapAsyncWidgetResponse = abstractAsyncWidgetViewModel.mapAsyncWidgetResponse(composerAsyncWidgetResponse, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AbstractAsyncWidgetViewModel$fetchWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
