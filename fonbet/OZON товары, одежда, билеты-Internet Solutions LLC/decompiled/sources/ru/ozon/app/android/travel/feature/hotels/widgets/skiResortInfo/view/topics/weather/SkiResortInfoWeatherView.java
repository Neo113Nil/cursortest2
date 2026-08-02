package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.topics.weather;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/weather/SkiResortInfoWeatherView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp6", "cachedWeatherItemViews", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/view/topics/weather/SkiResortInfoWeatherItemView;", "cachedSeparatorViews", "Landroid/view/View;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoVO$WeatherVO;", "bind-LWEc1jk", "(Ljava/util/List;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoWeatherView extends LinearLayout {

    @NotNull
    private final Map<Integer, View> cachedSeparatorViews;

    @NotNull
    private final Map<Integer, SkiResortInfoWeatherItemView> cachedWeatherItemViews;
    private final int dp1;
    private final int dp6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkiResortInfoWeatherView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp1 = ResourceExtKt.toPx(1, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.cachedWeatherItemViews = new LinkedHashMap();
        this.cachedSeparatorViews = new LinkedHashMap();
        setOrientation(1);
    }

    /* renamed from: bind-LWEc1jk, reason: not valid java name */
    public final void m1439bindLWEc1jk(@NotNull List<? extends SkiResortInfoVO.WeatherVO.WeatherItemVO> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.cachedWeatherItemViews.size() != item.size()) {
            removeAllViews();
            this.cachedWeatherItemViews.clear();
            this.cachedSeparatorViews.clear();
        }
        int i11 = 0;
        for (Object obj : item) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SkiResortInfoVO.WeatherVO.WeatherItemVO weatherItemVO = (SkiResortInfoVO.WeatherVO.WeatherItemVO) obj;
            if (this.cachedWeatherItemViews.get(Integer.valueOf(i11)) == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                SkiResortInfoWeatherItemView skiResortInfoWeatherItemView = new SkiResortInfoWeatherItemView(context);
                skiResortInfoWeatherItemView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.cachedWeatherItemViews.put(Integer.valueOf(i11), skiResortInfoWeatherItemView);
                addView(skiResortInfoWeatherItemView);
                skiResortInfoWeatherItemView.bind(weatherItemVO);
                Unit unit = Unit.f71690a;
            }
            if (i11 != C7714v.P(item) && this.cachedSeparatorViews.get(Integer.valueOf(i11)) == null) {
                View view = new View(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.dp1);
                int i13 = this.dp6;
                layoutParams.topMargin = i13;
                layoutParams.bottomMargin = i13;
                view.setLayoutParams(layoutParams);
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                view.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.graphicNeutral));
                this.cachedSeparatorViews.put(Integer.valueOf(i11), view);
                addView(view);
            }
            i11 = i12;
        }
    }
}
