package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import S0.InterfaceC3967k;
import WZ.l;
import a1.C4912a;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.G;
import v0.InterfaceC10165e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ List<CartTabsVO.CartTabItem> $elements;
    final /* synthetic */ CartTabsVO $item;
    final /* synthetic */ l $tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Integer, Object> {
        final /* synthetic */ List<CartTabsVO.CartTabItem> $elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<CartTabsVO.CartTabItem> list) {
            super(1);
            this.$elements = list;
        }

        public final Object invoke(int i11) {
            return this.$elements.get(i11).getTitle();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv0/e;", "", "position", "", "invoke", "(Lv0/e;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ InterfaceC7851b $controller;
        final /* synthetic */ List<CartTabsVO.CartTabItem> $elements;
        final /* synthetic */ CartTabsVO $item;
        final /* synthetic */ l $tokenizedAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<CartTabsVO.CartTabItem> list, CartTabsVO cartTabsVO, InterfaceC7851b interfaceC7851b, Function1<? super AtomAction, Unit> function1, l lVar) {
            super(4);
            this.$elements = list;
            this.$item = cartTabsVO;
            this.$controller = interfaceC7851b;
            this.$actionHandler = function1;
            this.$tokenizedAnalytics = lVar;
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
            invoke(interfaceC10165e, num.intValue(), interfaceC3967k, num2.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC10165e items, int i11, InterfaceC3967k interfaceC3967k, int i12) {
            int i13;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i12 & 48) == 0) {
                i13 = i12 | (interfaceC3967k.r(i11) ? 32 : 16);
            } else {
                i13 = i12;
            }
            if ((i13 & 145) == 144 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            CartTabsVO.CartTabItem cartTabItem = this.$elements.get(i11);
            interfaceC3967k.o(1092881146);
            int i14 = i13 & 112;
            boolean F11 = (i14 == 32) | interfaceC3967k.F(this.$item) | interfaceC3967k.F(this.$controller) | interfaceC3967k.n(this.$actionHandler) | interfaceC3967k.F(this.$elements) | interfaceC3967k.F(this.$tokenizedAnalytics);
            CartTabsVO cartTabsVO = this.$item;
            InterfaceC7851b interfaceC7851b = this.$controller;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            List<CartTabsVO.CartTabItem> list = this.$elements;
            l lVar = this.$tokenizedAnalytics;
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$1$1 cartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$1$1 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$1$1(cartTabsVO, interfaceC7851b, i11, function1, list, lVar);
                interfaceC3967k.x(cartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$1$1);
                C11 = cartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$1$1;
            }
            Function2 function2 = (Function2) C11;
            interfaceC3967k.k();
            l lVar2 = this.$tokenizedAnalytics;
            interfaceC3967k.o(1092901147);
            boolean F12 = interfaceC3967k.F(lVar2);
            Object C12 = interfaceC3967k.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1$2$2$1(lVar2);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            CartTabKt.m699CartTabPRecIgQ(null, i11, cartTabItem, function2, (Function1) C12, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, 0L, interfaceC3967k, i14, 0, 4065);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTabsWidgetHolderKt$CartTabsWidgetHolder$3$1$1(List<CartTabsVO.CartTabItem> list, CartTabsVO cartTabsVO, InterfaceC7851b interfaceC7851b, Function1<? super AtomAction, Unit> function1, l lVar) {
        super(1);
        this.$elements = list;
        this.$item = cartTabsVO;
        this.$controller = interfaceC7851b;
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        G.c(LazyRow, this.$elements.size(), new AnonymousClass1(this.$elements), new C4912a(true, 1355385020, new AnonymousClass2(this.$elements, this.$item, this.$controller, this.$actionHandler, this.$tokenizedAnalytics)), 4);
    }
}
