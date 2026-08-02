package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import A00.a;
import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.data.CartTabsDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.di.CartTabsDIComponent;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CartTabsViewMapperKt$cartTabsViewMapper$1 extends AbstractC7737t implements Function1<j<CartTabsDTO, CartTabsVO>, Unit> {
    public static final CartTabsViewMapperKt$cartTabsViewMapper$1 INSTANCE = new CartTabsViewMapperKt$cartTabsViewMapper$1();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "invoke", "(Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;Ll20/d;)Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsViewMapperKt$cartTabsViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<CartTabsDTO, d, CartTabsVO> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final CartTabsVO invoke(CartTabsDTO state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return CartTabsMapperKt.toVO(state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsViewMapperKt$cartTabsViewMapper$1$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<CartTabsVO>, Unit> {
        final /* synthetic */ InterfaceC4008j<CartTabsDIComponent> $diComponent$delegate;
        final /* synthetic */ j<CartTabsDTO, CartTabsVO> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsViewMapperKt$cartTabsViewMapper$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CartTabsVO>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ InterfaceC4008j<CartTabsDIComponent> $diComponent$delegate;
            final /* synthetic */ j<CartTabsDTO, CartTabsVO> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(j<CartTabsDTO, CartTabsVO> jVar, InterfaceC4008j<? extends CartTabsDIComponent> interfaceC4008j) {
                super(4);
                this.$this_viewMapper = jVar;
                this.$diComponent$delegate = interfaceC4008j;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<CartTabsVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<CartTabsVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                } else {
                    CartTabsWidgetHolderKt.m707CartTabsWidgetHolder8LwENs(null, content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12 & 14, 14)), CartTabsViewMapperKt$cartTabsViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getController(), CartTabsViewMapperKt$cartTabsViewMapper$1.invoke$lambda$0(this.$diComponent$delegate).getTokenizedAnalytics(), 0L, 0L, 0.0f, null, interfaceC3967k, 0, 481);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(j<CartTabsDTO, CartTabsVO> jVar, InterfaceC4008j<? extends CartTabsDIComponent> interfaceC4008j) {
            super(1);
            this.$this_viewMapper = jVar;
            this.$diComponent$delegate = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<CartTabsVO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<CartTabsVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, -522756401, new AnonymousClass1(this.$this_viewMapper, this.$diComponent$delegate)));
        }
    }

    CartTabsViewMapperKt$cartTabsViewMapper$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartTabsDIComponent invoke$lambda$0(InterfaceC4008j<? extends CartTabsDIComponent> interfaceC4008j) {
        return interfaceC4008j.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<CartTabsDTO, CartTabsVO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<CartTabsDTO, CartTabsVO> viewMapper) {
        Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new CartTabsViewMapperKt$cartTabsViewMapper$1$diComponent$2(viewMapper));
        c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
        viewMapper.c().put(TabChangedEvent.class, new c.a() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsViewMapperKt$cartTabsViewMapper$1$invoke$$inlined$update$1
            @Override // ru.ozon.composer.compose.widget.c.a
            public final I handle(a.J.InterfaceC0007a update, I old) {
                Intrinsics.checkNotNullParameter(update, "update");
                Intrinsics.checkNotNullParameter(old, "old");
                TabChangedEvent tabChangedEvent = (TabChangedEvent) update;
                CartTabsVO cartTabsVO = (CartTabsVO) old;
                ArrayList W02 = C7714v.W0(cartTabsVO.getItems());
                W02.set(tabChangedEvent.getPreviousTab(), CartTabsVO.CartTabItem.m700copy2lqI77k$default((CartTabsVO.CartTabItem) W02.get(tabChangedEvent.getPreviousTab()), AspectDTO.copy$default(((CartTabsVO.CartTabItem) W02.get(tabChangedEvent.getPreviousTab())).getWrapper(), null, AspectDTO.AspectState.ENABLED, null, null, null, 29, null), null, null, 0.0f, null, 30, null));
                W02.set(tabChangedEvent.getSelectedTab(), CartTabsVO.CartTabItem.m700copy2lqI77k$default((CartTabsVO.CartTabItem) W02.get(tabChangedEvent.getSelectedTab()), AspectDTO.copy$default(((CartTabsVO.CartTabItem) W02.get(tabChangedEvent.getSelectedTab())).getWrapper(), null, AspectDTO.AspectState.SELECTED, null, null, null, 29, null), null, null, 0.0f, null, 30, null));
                Unit unit = Unit.f71690a;
                return CartTabsVO.copy$default(cartTabsVO, 0L, W02, null, null, tabChangedEvent.getSelectedTab(), 13, null);
            }
        });
        viewMapper.G(new AnonymousClass3(viewMapper, unsafeLazy));
    }
}
