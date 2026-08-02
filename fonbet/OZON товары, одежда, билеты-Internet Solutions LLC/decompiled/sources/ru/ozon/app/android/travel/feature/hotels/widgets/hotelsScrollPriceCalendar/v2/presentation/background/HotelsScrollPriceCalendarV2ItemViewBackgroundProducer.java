package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.background;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2VI;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u000bH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002J\f\u0010\u0013\u001a\u00020\u0011*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/background/HotelsScrollPriceCalendarV2ItemViewBackgroundProducer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "roundedBackgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "lastConfig", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI$Background;", "produce", "background", "createDrawable", "updateDrawable", "getBackgroundColor", "", "getStrokeColor", "getStrokeWidth", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2ItemViewBackgroundProducer {

    @NotNull
    private final Context context;
    private GradientDrawable drawable;
    private HotelsScrollPriceCalendarV2VI.Background lastConfig;

    @NotNull
    private final RoundedBackgroundProducer roundedBackgroundProducer;

    public HotelsScrollPriceCalendarV2ItemViewBackgroundProducer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.roundedBackgroundProducer = new RoundedBackgroundProducer();
    }

    private final GradientDrawable createDrawable(HotelsScrollPriceCalendarV2VI.Background background) {
        GradientDrawable produce = this.roundedBackgroundProducer.produce(getBackgroundColor(background), getStrokeColor(background), getStrokeWidth(background), background.getCornerRadius(), background.getCornerRadius(), background.getCornerRadius(), background.getCornerRadius());
        this.lastConfig = background;
        this.drawable = produce;
        return produce;
    }

    private final int getBackgroundColor(HotelsScrollPriceCalendarV2VI.Background background) {
        Integer parseColor = StyleParser.INSTANCE.parseColor(this.context, background.getBackgroundColor());
        return parseColor != null ? parseColor.intValue() : ThemeExtKt.themeColor(this.context, R$attr.layerFloor1);
    }

    private final int getStrokeColor(HotelsScrollPriceCalendarV2VI.Background background) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.context;
        HotelsScrollPriceCalendarV2VI.Stroke stroke = background.getStroke();
        Integer parseColor = styleParser.parseColor(context, stroke != null ? stroke.getColor() : null);
        if (parseColor != null) {
            return parseColor.intValue();
        }
        return 0;
    }

    private final int getStrokeWidth(HotelsScrollPriceCalendarV2VI.Background background) {
        HotelsScrollPriceCalendarV2VI.Stroke stroke = background.getStroke();
        if (stroke != null) {
            return stroke.getWidth();
        }
        return 0;
    }

    private final GradientDrawable updateDrawable(HotelsScrollPriceCalendarV2VI.Background background) {
        GradientDrawable gradientDrawable = this.drawable;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(getBackgroundColor(background));
            gradientDrawable.setStroke(getStrokeWidth(background), getStrokeColor(background));
            gradientDrawable.setCornerRadius(background.getCornerRadius());
        } else {
            gradientDrawable = null;
        }
        this.lastConfig = background;
        return gradientDrawable;
    }

    @NotNull
    public final GradientDrawable produce(@NotNull HotelsScrollPriceCalendarV2VI.Background background) {
        Intrinsics.checkNotNullParameter(background, "background");
        if (Intrinsics.d(this.lastConfig, background)) {
            GradientDrawable gradientDrawable = this.drawable;
            return gradientDrawable == null ? createDrawable(background) : gradientDrawable;
        }
        GradientDrawable updateDrawable = updateDrawable(background);
        return updateDrawable == null ? createDrawable(background) : updateDrawable;
    }
}
