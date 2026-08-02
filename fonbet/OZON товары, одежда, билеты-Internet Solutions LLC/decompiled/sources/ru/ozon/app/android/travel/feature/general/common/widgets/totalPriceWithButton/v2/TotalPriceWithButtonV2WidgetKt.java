package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.noUi.TotalPriceWithButtonV2NoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky.TotalPriceWithButtonV2StickyViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "TotalPriceWithButtonV2Widget", "()Ln20/i;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TotalPriceWithButtonV2WidgetKt {
    @NotNull
    public static final i TotalPriceWithButtonV2Widget() {
        final long[] supportedVersions = TotalPriceWithButtonV2Config.INSTANCE.getSupportedVersions();
        final String str = "travel";
        final String str2 = "totalPriceWithButton";
        return new i(str, str2, supportedVersions) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.TotalPriceWithButtonV2WidgetKt$TotalPriceWithButtonV2Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TotalPriceWithButtonV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                TotalPriceWithButtonV2Component totalPriceWithButtonV2Component = (TotalPriceWithButtonV2Component) storage.getComponent(TotalPriceWithButtonV2Component.class);
                return new d[]{new TotalPriceWithButtonV2NoUiViewMapper(totalPriceWithButtonV2Component), new TotalPriceWithButtonV2ViewMapper(totalPriceWithButtonV2Component), new TotalPriceWithButtonV2StickyViewMapper(totalPriceWithButtonV2Component)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TotalPriceWithButtonV2Component.Companion.create(storage)};
            }
        };
    }
}
