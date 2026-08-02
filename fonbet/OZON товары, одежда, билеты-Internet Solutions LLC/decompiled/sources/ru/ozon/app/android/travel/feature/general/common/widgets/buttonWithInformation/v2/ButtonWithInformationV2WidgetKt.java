package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.data.ButtonWithInformationV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.di.ButtonWithInformationV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2ViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "ButtonWithInformationV2Widget", "()Ln20/i;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonWithInformationV2WidgetKt {
    @NotNull
    public static final i ButtonWithInformationV2Widget() {
        final long[] jArr = {2};
        final String str = "travel";
        final String str2 = "buttonWithInformation";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.ButtonWithInformationV2WidgetKt$ButtonWithInformationV2Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ButtonWithInformationV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new ButtonWithInformationV2ViewMapper[]{new ButtonWithInformationV2ViewMapper((ButtonWithInformationV2Component) storage.getComponent(ButtonWithInformationV2Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(final C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{new C7473e(N.b(ButtonWithInformationV2Component.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.ButtonWithInformationV2WidgetKt$ButtonWithInformationV2Widget$3$1
                    @Override // k20.InterfaceC7469a
                    public final ButtonWithInformationV2Component component() {
                        return new ButtonWithInformationV2Component(C7475g.this);
                    }
                })};
            }
        };
    }
}
