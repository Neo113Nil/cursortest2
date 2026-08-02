package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2;

import I00.d;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.data.HotelsGalleryFeedV2Config;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.di.HotelsGalleryFeedV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2ViewMapper;
import ru.ozon.app.android.travel.utils.listtracking.ListTrackingViewMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;", "listTrackingViewMapper", "Ln20/i;", "HotelsGalleryFeedV2Widget", "(Lru/ozon/app/android/travel/utils/listtracking/ListTrackingViewMapper;)Ln20/i;", "hotels_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryFeedV2WidgetKt {
    @NotNull
    public static final i HotelsGalleryFeedV2Widget(@NotNull final ListTrackingViewMapper listTrackingViewMapper) {
        Intrinsics.checkNotNullParameter(listTrackingViewMapper, "listTrackingViewMapper");
        final long[] jArr = {2};
        final String str = "travel";
        final String str2 = "hotelsGalleryFeed";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.HotelsGalleryFeedV2WidgetKt$HotelsGalleryFeedV2Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new HotelsGalleryFeedV2Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new d[]{new HotelsGalleryFeedV2ViewMapper((HotelsGalleryFeedV2Component) storage.getComponent(HotelsGalleryFeedV2Component.class)), listTrackingViewMapper};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(final C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{new C7473e(N.b(HotelsGalleryFeedV2Component.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.HotelsGalleryFeedV2WidgetKt$HotelsGalleryFeedV2Widget$3$1
                    @Override // k20.InterfaceC7469a
                    public final HotelsGalleryFeedV2Component component() {
                        return new HotelsGalleryFeedV2Component(C7475g.this);
                    }
                })};
            }
        };
    }
}
