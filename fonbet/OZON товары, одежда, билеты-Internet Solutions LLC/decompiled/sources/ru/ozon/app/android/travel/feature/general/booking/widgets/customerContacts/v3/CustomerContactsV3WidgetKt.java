package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3;

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
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.data.CustomerContactsV3Config;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3ViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "CustomerContactsV3Widget", "()Ln20/i;", "booking_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerContactsV3WidgetKt {
    @NotNull
    public static final i CustomerContactsV3Widget() {
        final long[] supportedVersions = CustomerContactsV3Config.INSTANCE.getSupportedVersions();
        final String str = "travel";
        final String str2 = "customerContacts";
        return new i(str, str2, supportedVersions) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.CustomerContactsV3WidgetKt$CustomerContactsV3Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new CustomerContactsV3Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new CustomerContactsV3ViewMapper[]{new CustomerContactsV3ViewMapper((CustomerContactsV3Component) storage.getComponent(CustomerContactsV3Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{CustomerContactsV3Component.Companion.create(storage)};
            }
        };
    }
}
