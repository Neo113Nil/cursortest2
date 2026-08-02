package ru.ozon.app.android.cml.delivery.widgets.order.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import He.b;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.data.PreorderParamsStore;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.OrderWidgetAsyncUiState;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 .*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u0014H¦@¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u0004J\u0015\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/BaseOrderWidgetViewModel;", "T", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "asyncData", "Ll20/d;", "widgetInfo", "", "updateWidget", "(Ljava/lang/String;Ll20/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "actionUrl", "replaceMapParamsIfPresentInStore", "(Landroid/net/Uri;)Ljava/lang/String;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "response", "handleAsyncUpdate", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;Ll20/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "params", "fetchAsyncState", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "state", "", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/OrderWidgetUpdate;", "mapAsyncState", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "onCleared", "LAe/M0;", "Lru/ozon/app/android/cml/delivery/widgets/order/presentation/OrderWidgetAsyncUiState;", "uiStateFlow", "()LAe/M0;", "info", "setWidgetInfo", "(Ll20/d;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "Ll20/d;", "Ljava/lang/String;", "LAe/x0;", "LAe/x0;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseOrderWidgetViewModel<T> extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private String asyncData;

    @NotNull
    private final x0<OrderWidgetAsyncUiState> uiStateFlow = O0.a(null);
    private d widgetInfo;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel$2", f = "BaseOrderWidgetViewModel.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseOrderWidgetViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = baseOrderWidgetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                String str = ((BaseOrderWidgetViewModel) this.this$0).asyncData;
                d dVar = ((BaseOrderWidgetViewModel) this.this$0).widgetInfo;
                if (str != null && dVar != null) {
                    BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel = this.this$0;
                    this.label = 1;
                    if (baseOrderWidgetViewModel.updateWidget(str, dVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/presentation/BaseOrderWidgetViewModel$Companion;", "", "<init>", "()V", "OPEN_ADDRESS_MAP_ACTION_ID", "", "QUERY_REGION_FROM", "QUERY_BOX_SIZE", "EXTRA_BODY_PARAMS", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BaseOrderWidgetViewModel() {
        final M0<Boolean> shouldPerformAsyncUpdateFlow = PreorderParamsStore.INSTANCE.shouldPerformAsyncUpdateFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel$special$$inlined$filter$1$2", f = "BaseOrderWidgetViewModel.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass2(this, null)), androidx.lifecycle.x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleAsyncUpdate(ComposerAsyncWidgetResponse<T> composerAsyncWidgetResponse, d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
        OrderWidgetUpdate orderWidgetUpdate = (OrderWidgetUpdate) C7714v.M(mapAsyncState(composerAsyncWidgetResponse.getState(), dVar));
        if (orderWidgetUpdate != null) {
            Object emit = this.uiStateFlow.emit(new OrderWidgetAsyncUiState.Loaded(orderWidgetUpdate, composerAsyncWidgetResponse.getTrackingPayloads()), dVar2);
            if (emit == a.COROUTINE_SUSPENDED) {
                return emit;
            }
        }
        return Unit.f71690a;
    }

    private final String replaceMapParamsIfPresentInStore(Uri actionUrl) {
        PreorderParamsStore preorderParamsStore = PreorderParamsStore.INSTANCE;
        String sourceId = preorderParamsStore.getSourceId();
        String selectedBoxId = preorderParamsStore.getSelectedBoxId();
        Tc.d builder = new Tc.d();
        Set<String> queryParameterNames = actionUrl.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            String queryParameter = actionUrl.getQueryParameter(str);
            if (queryParameter != null) {
                builder.put(str, queryParameter);
            }
        }
        if (sourceId != null) {
        }
        if (selectedBoxId != null) {
            builder.put("box_size_catalog_id", selectedBoxId);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        Uri.Builder clearQuery = actionUrl.buildUpon().clearQuery();
        Iterator it = ((Tc.e) u11.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = clearQuery.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateWidget(String str, d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new BaseOrderWidgetViewModel$updateWidget$2(this, str, dVar, null), dVar2);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public abstract Object fetchAsyncState(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull kotlin.coroutines.d<? super ComposerAsyncWidgetResponse<T>> dVar);

    @NotNull
    public final AtomAction handleAction(@NotNull AtomAction action) {
        AtomAction.Move copy$default;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Move) {
            AtomAction.Move move = (AtomAction.Move) action;
            if (Intrinsics.d(move.getId(), "openAddressMapAction")) {
                String link = move.getLink();
                return (link == null || (copy$default = AtomAction.Move.copy$default(move, replaceMapParamsIfPresentInStore(Uri.parse(link)), null, null, null, null, 30, null)) == null) ? move : copy$default;
            }
        }
        return action;
    }

    @NotNull
    public abstract List<OrderWidgetUpdate> mapAsyncState(T state, @NotNull d widgetInfo);

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        PreorderParamsStore.INSTANCE.clear();
        this.widgetInfo = null;
        super.onCleared();
    }

    public final void setWidgetInfo(@NotNull d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        this.asyncData = info.c().a();
    }

    @NotNull
    public final M0<OrderWidgetAsyncUiState> uiStateFlow() {
        return C2399j.b(this.uiStateFlow);
    }
}
