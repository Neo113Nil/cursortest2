package ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation;

import Ae.C2399j;
import Sc.s;
import WZ.m;
import WZ.t;
import Wc.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.domain.StickyPromoBadgeVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/presentation/StickyPromoBadgeViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "<init>", "(Ll10/i;Ld20/e;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;)V", "item", "", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/stickyPromoBadge/domain/StickyPromoBadgeVO;)V", "Ll10/i;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyPromoBadgeViewHolder extends AbstractC6064a<StickyPromoBadgeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final TotalVisibilityViewModel totalVisibilityViewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeViewHolder$1", f = "StickyPromoBadgeViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.presentation.StickyPromoBadgeViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<Boolean, View, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, View view, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), view, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ((View) this.L$0).setVisibility(this.Z$0 ? 8 : 0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, View view, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = z11;
            anonymousClass1.L$0 = view;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyPromoBadgeViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull TotalVisibilityViewModel totalVisibilityViewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        this.container = container;
        this.totalVisibilityViewModel = totalVisibilityViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        C2399j.C(ExtensionsKt.onEachOutOfLayoutView$default(totalVisibilityViewModel.isVisibleFlow(), getView(), null, new AnonymousClass1(null), 2, null), K.a(container.K().f()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyPromoBadgeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getView().setVisibility(this.totalVisibilityViewModel.isVisibleFlow().getValue().booleanValue() ? 8 : 0);
        View view = getView();
        StickyPromoBadgeView stickyPromoBadgeView = view instanceof StickyPromoBadgeView ? (StickyPromoBadgeView) view : null;
        if (stickyPromoBadgeView != null) {
            stickyPromoBadgeView.bind(item, this.actionHandler);
        }
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.container.X(), tokenizedEvent, null);
        }
    }
}
