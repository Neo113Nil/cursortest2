package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data.DeliveryWidgetV4Config;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewMapper;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/di/DeliveryWidgetV4Module;", "", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4Config;", "config", "Ln20/i;", "deliveryWidgetV4", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4Config;)Ln20/i;", "", "provideWidget", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/data/DeliveryWidgetV4Config;)Ljava/util/Set;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryWidgetV4Module {

    @NotNull
    public static final DeliveryWidgetV4Module INSTANCE = new DeliveryWidgetV4Module();

    private DeliveryWidgetV4Module() {
    }

    private final i deliveryWidgetV4(final DeliveryWidgetV4Config config) {
        final long[] jArr = {4};
        final String str = "express";
        final String str2 = "deliveryWidget";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di.DeliveryWidgetV4Module$deliveryWidgetV4$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return config;
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new DeliveryWidgetV4OverlayViewMapper[]{new DeliveryWidgetV4OverlayViewMapper((DeliveryWidgetV4Component) storage.getComponent(DeliveryWidgetV4Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{DeliveryWidgetV4Component.Companion.create(storage)};
            }
        };
    }

    @NotNull
    public final Set<i> provideWidget(@NotNull DeliveryWidgetV4Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return e0.h(deliveryWidgetV4(config));
    }
}
