package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit;

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
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.data.ModalCheckoutTimeLimitConfig;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.ModalCheckoutTimeLimitViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.noUi.ModalCheckoutTimeLimitNoUiViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "ModalCheckoutTimeLimitWidget", "()Ln20/i;", "booking_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModalCheckoutTimeLimitWidgetKt {
    @NotNull
    public static final i ModalCheckoutTimeLimitWidget() {
        final long[] supportedVersions = ModalCheckoutTimeLimitConfig.INSTANCE.getSupportedVersions();
        final String str = "travel";
        final String str2 = "modalCheckoutTimeLimit";
        return new i(str, str2, supportedVersions) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.ModalCheckoutTimeLimitWidgetKt$ModalCheckoutTimeLimitWidget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ModalCheckoutTimeLimitConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                ModalCheckoutTimeLimitComponent modalCheckoutTimeLimitComponent = (ModalCheckoutTimeLimitComponent) storage.getComponent(ModalCheckoutTimeLimitComponent.class);
                return new d[]{new ModalCheckoutTimeLimitNoUiViewMapper(modalCheckoutTimeLimitComponent), new ModalCheckoutTimeLimitViewMapper(modalCheckoutTimeLimitComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{ModalCheckoutTimeLimitComponent.Companion.create(storage)};
            }
        };
    }
}
