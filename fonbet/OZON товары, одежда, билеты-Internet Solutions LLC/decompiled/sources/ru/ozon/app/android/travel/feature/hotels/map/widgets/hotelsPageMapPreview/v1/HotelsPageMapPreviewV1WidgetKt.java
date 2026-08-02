package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.data.HotelsPageMapPreviewConfig;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.data.HotelsPageMapPreviewForToursConfig;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.di.HotelsPageMapPreviewComponent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation.HotelsPageMapPreviewViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Ln20/i;", "HotelsPageMapPreviewV1Widget", "()Ln20/i;", "HotelsPageMapPreviewV1ForToursWidget", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsPageMapPreviewV1WidgetKt {
    @NotNull
    public static final i HotelsPageMapPreviewV1ForToursWidget() {
        final long[] b11 = j.b();
        final String str = "travel";
        final String str2 = "hotelsPageMapPreviewForTours";
        return new i(str, str2, b11) { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.HotelsPageMapPreviewV1WidgetKt$HotelsPageMapPreviewV1ForToursWidget$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsPageMapPreviewForToursConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsPageMapPreviewViewMapper[]{new HotelsPageMapPreviewViewMapper((HotelsPageMapPreviewComponent) storage.getComponent(HotelsPageMapPreviewComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{HotelsPageMapPreviewComponent.Companion.create(storage)};
            }
        };
    }

    @NotNull
    public static final i HotelsPageMapPreviewV1Widget() {
        final long[] b11 = j.b();
        final String str = "travel";
        final String str2 = "hotelsPageMapPreview";
        return new i(str, str2, b11) { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.HotelsPageMapPreviewV1WidgetKt$HotelsPageMapPreviewV1Widget$$inlined$WidgetFactory$default$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsPageMapPreviewConfig(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsPageMapPreviewViewMapper[]{new HotelsPageMapPreviewViewMapper((HotelsPageMapPreviewComponent) storage.getComponent(HotelsPageMapPreviewComponent.class))};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{HotelsPageMapPreviewComponent.Companion.create(storage)};
            }
        };
    }
}
