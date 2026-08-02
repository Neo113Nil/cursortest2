package ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation;

import A00.a;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import Vg.d;
import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import d20.AbstractC6064a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.common.SelectedStateChangedEvent;
import ru.ozon.app.android.ugc.R$plurals;
import ru.ozon.app.android.ugc.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u0014*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010!\u001a\u0004\u0018\u00010 *\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\u0014*\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00105R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R'\u0010A\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00140\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperVI;", "Ll10/i;", "container", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "LGZ/g;", "router", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/favorites/common/SelectedProductsManager;LGZ/g;LVg/d;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "", "updateTilesSelectionState", "()V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "", "count", "limit", "bindButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;II)V", "", "", "initialState", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getButtonAction", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ILjava/util/List;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "showMaxItemsRestriction", "(I)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "execute", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperVI;)V", "onRefresh", "Ll10/i;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "LGZ/g;", "LVg/d;", "LWZ/l;", "", "isOnRefreshInvoked", "Z", "managerIsPrefetched", "Ljava/util/List;", "canShowMaxFavsRestriction", "LVg/c;", "customActionHandlersStore$delegate", "LSc/j;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateListWrapperOverlayViewHolder extends AbstractC6064a<CreateListWrapperVI> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;
    private boolean canShowMaxFavsRestriction;

    @NotNull
    private final i container;

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private List<Long> initialState;
    private boolean isOnRefreshInvoked;
    private boolean managerIsPrefetched;

    @NotNull
    private final g router;

    @NotNull
    private final SelectedProductsManager selectedProductsManager;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$2", f = "CreateListWrapperOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<a, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CreateListWrapperOverlayViewHolder.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            CreateListWrapperOverlayViewHolder.this.updateTilesSelectionState();
            CreateListWrapperOverlayViewHolder.this.isOnRefreshInvoked = false;
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$4", f = "CreateListWrapperOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements Function2<a, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass4(kotlin.coroutines.d<? super AnonymousClass4> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CreateListWrapperOverlayViewHolder.this.new AnonymousClass4(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a aVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass4) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            CreateListWrapperOverlayViewHolder.this.updateTilesSelectionState();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateListWrapperOverlayViewHolder(@NotNull i container, @NotNull SelectedProductsManager selectedProductsManager, @NotNull g router, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics, @NotNull Function1<? super LinearLayout, ? extends View> viewFactory) {
        super(container, new CreateListWrapperOverlayViewHolder$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0(viewFactory));
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.selectedProductsManager = selectedProductsManager;
        this.router = router;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.canShowMaxFavsRestriction = true;
        this.customActionHandlersStore = k.b(new CreateListWrapperOverlayViewHolder$customActionHandlersStore$2(this));
        this.actionHandler = k.b(new CreateListWrapperOverlayViewHolder$actionHandler$2(this));
        InterfaceC2395h<a> eventsFlow = container.M().getEventsFlow();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        final InterfaceC2395h a11 = C5427n.a(eventsFlow, lifecycle, bVar);
        C2399j.C(new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ CreateListWrapperOverlayViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$1$2", f = "CreateListWrapperOverlayViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CreateListWrapperOverlayViewHolder createListWrapperOverlayViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = createListWrapperOverlayViewHolder;
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
                    boolean z11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((a) obj) instanceof a.C2370k) {
                                    z11 = this.this$0.isOnRefreshInvoked;
                                    if (z11) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass2(null)), K.a(this));
        final InterfaceC2395h a12 = C5427n.a(container.M().getEventsFlow(), getLifecycle(), bVar);
        C2399j.C(new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$2$2", f = "CreateListWrapperOverlayViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$special$$inlined$filter$2$2$1, reason: invalid class name */
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
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (((a) obj) instanceof a.o) {
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass4(null)), K.a(this));
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(container.Y());
        composerContainer.setClipChildren(false);
        composerContainer.setClipToPadding(false);
        LinearLayout composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(container.Y());
        composerBottomContainer.setClipChildren(false);
        composerBottomContainer.setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(ButtonV3Atom.LargeButton largeButton, int i11, int i12) {
        ButtonV3Atom.LargeButton largeButton2;
        boolean z11 = i11 > i12;
        if (z11 && this.canShowMaxFavsRestriction) {
            this.canShowMaxFavsRestriction = false;
            showMaxItemsRestriction(i12);
        } else if (!z11) {
            this.canShowMaxFavsRestriction = true;
        }
        String string = z11 ? StringProvider.getString(R$string.create_list_items_limit, Integer.valueOf(i12)) : StringProvider.getQuantityString(R$plurals.create_list_wrapper_selected_products_pattern, i11, Integer.valueOf(i11));
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperView");
        LargeButtonView saveButton = ((CreateListWrapperView) view).getSaveButton();
        AtomActionDTO atomActionDTO = null;
        if (i11 < 0) {
            string = null;
        }
        OzonSpannableString ozonSpannableString = string != null ? OzonSpannableStringKt.toOzonSpannableString(string) : null;
        if (z11) {
            largeButton2 = largeButton;
        } else {
            largeButton2 = largeButton;
            atomActionDTO = getButtonAction(largeButton2, i11, this.initialState);
        }
        LargeButtonHolderKt.bind(saveButton, ButtonV3Atom.LargeButton.copy$default(largeButton2, null, ozonSpannableString, null, null, null, atomActionDTO, null, null, null, 477, null), new CreateListWrapperOverlayViewHolder$bindButton$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void execute(AtomAction.ComposerAction composerAction) {
        if (Intrinsics.d(composerAction.getId(), "submitSelectionFormMobile") || Intrinsics.d(composerAction.getId(), "productsUpdateAction")) {
            getActionHandler().invoke(composerAction);
        }
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final AtomActionDTO getButtonAction(ButtonV3Atom.LargeButton largeButton, int i11, List<Long> list) {
        if (list != null) {
            if (this.selectedProductsManager.getSelectedIds().size() == list.size() && this.selectedProductsManager.getSelectedIds().containsAll(list)) {
                return null;
            }
            return largeButton.getAction();
        }
        AtomActionDTO action = largeButton.getAction();
        if (action == null || i11 <= 0) {
            return null;
        }
        return action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Vg.c getCustomActionHandlersStore() {
        return (Vg.c) this.customActionHandlersStore.getValue();
    }

    private final void showMaxItemsRestriction(int limit) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup rootView = ContextExtKt.getRootView(this.container.K().a());
        if (rootView == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, new NotificationDTO(StringProvider.getString(R$string.create_list_max_items_notification_text, Integer.valueOf(limit)), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null), this.container.K().f(), getActionHandler()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTilesSelectionState() {
        Iterator<T> it = this.selectedProductsManager.getSelectedIds().iterator();
        while (it.hasNext()) {
            this.container.M().update(new SelectedStateChangedEvent(((Number) it.next()).longValue(), true));
        }
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        this.selectedProductsManager.clear();
        this.isOnRefreshInvoked = true;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CreateListWrapperVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!this.managerIsPrefetched) {
            List<Long> skus = item.getSkus();
            this.initialState = skus != null ? C7714v.H0(skus) : null;
            updateTilesSelectionState();
            this.managerIsPrefetched = true;
        }
        C2399j.C(new C(new C2408n0(this.selectedProductsManager.observeCount(), new CreateListWrapperOverlayViewHolder$bind$1(this, item, null)), new CreateListWrapperOverlayViewHolder$bind$2(null)), K.a(this.container.K().d()));
    }
}
