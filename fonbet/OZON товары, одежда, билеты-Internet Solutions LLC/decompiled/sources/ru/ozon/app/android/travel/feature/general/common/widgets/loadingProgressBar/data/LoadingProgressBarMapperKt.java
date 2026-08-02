package ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.data;

import Vc.a;
import WZ.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.data.LoadingProgressBarDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation.LoadingProgressBarVI;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/data/LoadingProgressBarDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI;", "toVI", "(Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/data/LoadingProgressBarDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoadingProgressBarMapperKt {
    @NotNull
    public static final LoadingProgressBarVI toVI(@NotNull LoadingProgressBarDTO loadingProgressBarDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(loadingProgressBarDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int maxLoadingTimeMs = loadingProgressBarDTO.getMaxLoadingTimeMs();
        List<LoadingProgressBarDTO.LoaderState> loaderStates = loadingProgressBarDTO.getLoaderStates();
        ArrayList arrayList = new ArrayList(C7714v.z(loaderStates, 10));
        Iterator<T> it = loaderStates.iterator();
        while (it.hasNext()) {
            arrayList.add(new LoadingProgressBarVI.LoaderState(r5.getPercent() / 100.0f, ((LoadingProgressBarDTO.LoaderState) it.next()).getTitle()));
        }
        List I02 = C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.data.LoadingProgressBarMapperKt$toVI$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(Float.valueOf(((LoadingProgressBarVI.LoaderState) t11).getPercent()), Float.valueOf(((LoadingProgressBarVI.LoaderState) t2).getPercent()));
            }
        }, arrayList);
        Map<String, TokenizedTrackingInfo> trackingInfo = loadingProgressBarDTO.getTrackingInfo();
        return new LoadingProgressBarVI(hashCode, maxLoadingTimeMs, 0.95f, I02, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }
}
