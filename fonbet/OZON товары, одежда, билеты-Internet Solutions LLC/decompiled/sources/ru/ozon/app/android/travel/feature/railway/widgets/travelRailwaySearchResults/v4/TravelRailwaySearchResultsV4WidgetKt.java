package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data.TravelRailwaySearchResultsV4Config;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.di.TravelRailwaySearchResultsV4Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.TravelRailwaySearchResultsV4ProgressViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.tracking.TravelRailwaySearchResultsV4TrackingViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "TravelRailwaySearchResultsV4Widget", "()Ln20/i;", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwaySearchResultsV4WidgetKt {
    @NotNull
    public static final i TravelRailwaySearchResultsV4Widget() {
        final long[] jArr = {4};
        final String str = "travel";
        final String str2 = "travelRailwaySearchResults";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.TravelRailwaySearchResultsV4WidgetKt$TravelRailwaySearchResultsV4Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TravelRailwaySearchResultsV4Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                TravelRailwaySearchResultsV4Component travelRailwaySearchResultsV4Component = (TravelRailwaySearchResultsV4Component) storage.getComponent(TravelRailwaySearchResultsV4Component.class);
                return new d[]{new TravelRailwaySearchResultsV4TrainViewMapper(travelRailwaySearchResultsV4Component), new TravelRailwaySearchResultsV4ProgressViewMapper(travelRailwaySearchResultsV4Component), new TravelRailwaySearchResultsV4TrackingViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TravelRailwaySearchResultsV4Component.Companion.create(storage)};
            }
        };
    }
}
