package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.TravelRailwaySearchResultsV3ProgressViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.tracking.TravelRailwaySearchResultsTrackingViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.TravelRailwaySearchResultsV3TrainProViewMapper;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ln20/i;", "TravelRailwaySearchResultsV3Widget", "()Ln20/i;", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwaySearchResultsV3WidgetKt {
    @NotNull
    public static final i TravelRailwaySearchResultsV3Widget() {
        final long[] jArr = {3};
        final String str = "travel";
        final String str2 = "travelRailwaySearchResults";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data.TravelRailwaySearchResultsV3WidgetKt$TravelRailwaySearchResultsV3Widget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new TravelRailwaySearchResultsV3Config(ComposerWidgetComponentStorageKt.getJsonParser(storage));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                TravelRailwaySearchResultsV3Component travelRailwaySearchResultsV3Component = (TravelRailwaySearchResultsV3Component) storage.getComponent(TravelRailwaySearchResultsV3Component.class);
                return new d[]{new TravelRailwaySearchResultsV3TrainProViewMapper(travelRailwaySearchResultsV3Component), new TravelRailwaySearchResultsV3ProgressViewMapper(travelRailwaySearchResultsV3Component), new TravelRailwaySearchResultsTrackingViewMapper()};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{TravelRailwaySearchResultsV3Component.Companion.create(storage)};
            }
        };
    }
}
