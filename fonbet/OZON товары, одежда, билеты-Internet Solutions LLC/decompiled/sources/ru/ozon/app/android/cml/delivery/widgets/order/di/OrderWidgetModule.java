package ru.ozon.app.android.cml.delivery.widgets.order.di;

import I00.d;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.data.OrderWidgetV1Config;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.data.OrderWidgetV1Parser;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.di.OrderWidgetV1Component;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.presentation.OrderParamsGroupsV1ViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.presentation.StickyButtonSubwidgetV1ViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.data.OrderWidgetV2Config;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.data.OrderWidgetV2Parser;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation.OrderParamsGroupsV2ViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.presentation.StickyButtonSubwidgetV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/order/di/OrderWidgetModule;", "", "<init>", "()V", "Ln20/i;", "provideOrderWidgetV1", "()Ln20/i;", "provideOrderWidgetV2", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderWidgetModule {

    @NotNull
    public static final OrderWidgetModule INSTANCE = new OrderWidgetModule();

    private OrderWidgetModule() {
    }

    @NotNull
    public final i provideOrderWidgetV1() {
        final long[] jArr = {1};
        final String str = "cml";
        final String str2 = "order";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.cml.delivery.widgets.order.di.OrderWidgetModule$provideOrderWidgetV1$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new OrderWidgetV1Config(new OrderWidgetV1Parser(ComposerWidgetComponentStorageKt.getJsonParser(storage)));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                OrderWidgetV1Component orderWidgetV1Component = (OrderWidgetV1Component) storage.getComponent(OrderWidgetV1Component.class);
                return new d[]{new OrderParamsGroupsV1ViewMapper(orderWidgetV1Component), new StickyButtonSubwidgetV1ViewMapper(orderWidgetV1Component)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{OrderWidgetV1Component.Companion.create(storage)};
            }
        };
    }

    @NotNull
    public final i provideOrderWidgetV2() {
        final long[] jArr = {2};
        final String str = "cml";
        final String str2 = "order";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.cml.delivery.widgets.order.di.OrderWidgetModule$provideOrderWidgetV2$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new OrderWidgetV2Config(new OrderWidgetV2Parser(ComposerWidgetComponentStorageKt.getJsonParser(storage)));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                OrderWidgetV2Component orderWidgetV2Component = (OrderWidgetV2Component) storage.getComponent(OrderWidgetV2Component.class);
                return new d[]{new OrderParamsGroupsV2ViewMapper(orderWidgetV2Component), new StickyButtonSubwidgetV2ViewMapper(orderWidgetV2Component)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{OrderWidgetV2Component.Companion.create(storage)};
            }
        };
    }
}
