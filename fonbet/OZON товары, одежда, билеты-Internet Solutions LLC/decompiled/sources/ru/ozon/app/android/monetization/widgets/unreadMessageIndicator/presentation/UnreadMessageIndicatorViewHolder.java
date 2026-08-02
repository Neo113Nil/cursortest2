package ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import WZ.l;
import WZ.m;
import WZ.t;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000e0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "observeUnreadMessageUpdate", "()V", "observePageRefreshAndRestoreEvents", "LAe/h;", "LA00/a;", "filterRefreshOrRestore", "(LAe/h;)LAe/h;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/presentation/UnreadMessageIndicatorViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnreadMessageIndicatorViewHolder extends k<UnreadMessageIndicatorVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final IconButtonV3View iconButtonView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final UnreadMessageIndicatorViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadMessageIndicatorViewHolder(@NotNull IconButtonV3View iconButtonView, @NotNull UnreadMessageIndicatorViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(iconButtonView);
        Intrinsics.checkNotNullParameter(iconButtonView, "iconButtonView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.iconButtonView = iconButtonView;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        observeUnreadMessageUpdate();
        observePageRefreshAndRestoreEvents();
    }

    private final InterfaceC2395h<a> filterRefreshOrRestore(final InterfaceC2395h<? extends a> interfaceC2395h) {
        return new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewHolder$filterRefreshOrRestore$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewHolder$filterRefreshOrRestore$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewHolder$filterRefreshOrRestore$$inlined$filter$1$2", f = "UnreadMessageIndicatorViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.presentation.UnreadMessageIndicatorViewHolder$filterRefreshOrRestore$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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
                public final Object emit(Object obj, d dVar) {
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
                                a aVar2 = (a) obj;
                                boolean z11 = aVar2 instanceof a.o;
                                if ((z11 && (((a.o) aVar2).g() instanceof a.u.c)) || ((z11 && (((a.o) aVar2).g() instanceof a.u.b)) || (aVar2 instanceof a.B))) {
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
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    private final void observePageRefreshAndRestoreEvents() {
        C2399j.C(new C2408n0(filterRefreshOrRestore(this.refs.getController().getEventsFlow()), new UnreadMessageIndicatorViewHolder$observePageRefreshAndRestoreEvents$1(this, null)), K.a(this));
    }

    private final void observeUnreadMessageUpdate() {
        C2399j.C(new C2408n0(this.viewModel.getHasUnreadMessages(), new UnreadMessageIndicatorViewHolder$observeUnreadMessageUpdate$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UnreadMessageIndicatorVI item, @NotNull l20.d info) {
        String automatizationId;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        IconButtonV3HolderKt.bind(this.iconButtonView, item.getHasUnreadMessages() ? item.getUnreadStateButton() : item.getDefaultStateButton(), this.actionHandler);
        this.viewModel.setBoundAction(item.getFetchAction());
        TestInfo testInfo = item.getTestInfo();
        if (testInfo == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return;
        }
        this.iconButtonView.setContentDescription(automatizationId);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull UnreadMessageIndicatorVI item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
