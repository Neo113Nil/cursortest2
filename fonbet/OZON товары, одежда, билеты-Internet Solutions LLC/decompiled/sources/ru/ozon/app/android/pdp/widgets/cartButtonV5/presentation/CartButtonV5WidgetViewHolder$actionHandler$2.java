package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5WidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$actionHandler$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<Long, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, SubscribeViewModel.class, "onSubscribeClick", "onSubscribeClick(J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
            invoke(l11.longValue());
            return Unit.f71690a;
        }

        public final void invoke(long j11) {
            ((SubscribeViewModel) this.receiver).onSubscribeClick(j11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder$actionHandler$2$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Long, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, SubscribeViewModel.class, "onUnsubscribeClick", "onUnsubscribeClick(J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
            invoke(l11.longValue());
            return Unit.f71690a;
        }

        public final void invoke(long j11) {
            ((SubscribeViewModel) this.receiver).onUnsubscribeClick(j11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5WidgetViewHolder$actionHandler$2(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder) {
        super(1);
        this.this$0 = cartButtonV5WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        SubscribeViewModel subscribeViewModel;
        SubscribeViewModel subscribeViewModel2;
        Intrinsics.checkNotNullParameter(it, "it");
        CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder = this.this$0;
        subscribeViewModel = this.this$0.subscribeViewModel;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(subscribeViewModel);
        subscribeViewModel2 = this.this$0.subscribeViewModel;
        cartButtonV5WidgetViewHolder.handleClick(it, anonymousClass1, new AnonymousClass2(subscribeViewModel2));
    }
}
