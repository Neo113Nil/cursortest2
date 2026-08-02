package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import Wc.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutgeo.checkout.utils.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.badge.BadgeHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R'\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoViewHolder;", "Ld20/a;", "Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoVO;", "Ll10/i;", "container", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoVO;)V", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyBadgeInfoViewHolder extends AbstractC6064a<StickyBadgeInfoVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final i container;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation.StickyBadgeInfoViewHolder$1", f = "StickyBadgeInfoViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation.StickyBadgeInfoViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = StickyBadgeInfoViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            StickyBadgeInfoViewHolder.this.getView().setVisibility(this.Z$0 ? 8 : 0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyBadgeInfoViewHolder(@NotNull i container, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.actionHandler = k.b(new StickyBadgeInfoViewHolder$actionHandler$2(this));
        C2399j.C(new C2408n0(totalVisibilityViewModel.isVisibleFlow(), new AnonymousClass1(null)), K.a(this));
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyBadgeInfoVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View findViewById = getView().findViewById(R$id.stickyBadgeView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        BadgeHolderKt.bind((BadgeView) findViewById, item.getBadgeInfo(), getActionHandler());
        ViewExtKt.setupPaddings$default(getView(), item.getPaddings(), 0, 0, 6, null);
    }
}
