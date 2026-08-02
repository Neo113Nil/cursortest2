package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2Config;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.di.TimeoutAndActionV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2ViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "TimeoutAndActionV2Widget", "()Ln20/i;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeoutAndActionV2WidgetKt {
    @NotNull
    public static final i TimeoutAndActionV2Widget() {
        final long[] jArr = {2};
        final String str = "travel";
        final String str2 = "timeoutAndAction";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.TimeoutAndActionV2WidgetKt$TimeoutAndActionV2Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TimeoutAndActionV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TimeoutAndActionV2ViewMapper[]{new TimeoutAndActionV2ViewMapper((TimeoutAndActionV2Component) storage.getComponent(TimeoutAndActionV2Component.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TimeoutAndActionV2Component.Companion.create(storage)};
            }
        };
    }
}
