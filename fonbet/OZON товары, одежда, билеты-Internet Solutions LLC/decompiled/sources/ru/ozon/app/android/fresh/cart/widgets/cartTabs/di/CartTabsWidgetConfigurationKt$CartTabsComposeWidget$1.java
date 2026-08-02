package ru.ozon.app.android.fresh.cart.widgets.cartTabs.di;

import d00.C6018d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.data.CartTabsConfigKt;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.data.CartTabsDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.di.CartTabsDIComponent;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsViewMapperKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CartTabsWidgetConfigurationKt$CartTabsComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<CartTabsDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTabsWidgetConfigurationKt$CartTabsComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<CartTabsDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<CartTabsDTO> FreshComposeWidget) {
        Intrinsics.checkNotNullParameter(FreshComposeWidget, "$this$FreshComposeWidget");
        final CartTabsDIComponent.Companion companion = CartTabsDIComponent.INSTANCE;
        FreshComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTabs.di.CartTabsWidgetConfigurationKt$CartTabsComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CartTabsDIComponent.Companion.this.create(it);
            }
        });
        CartTabsConfigKt.cartTabsConfig(FreshComposeWidget, this.$jsonDeserializer);
        CartTabsViewMapperKt.cartTabsViewMapper(FreshComposeWidget);
    }
}
