package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$layout;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/view/TravelRailwaySearchResultsV4SkeletonView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4SkeletonView extends ConstraintLayoutWithBorder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV4SkeletonView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.view_travel_railway_search_result_skeleton_v4, this);
        setRadius(ResourceExtKt.toPxF(24, context));
        int px = ResourceExtKt.toPx(16, context);
        setPadding(px, px, px, px);
    }
}
