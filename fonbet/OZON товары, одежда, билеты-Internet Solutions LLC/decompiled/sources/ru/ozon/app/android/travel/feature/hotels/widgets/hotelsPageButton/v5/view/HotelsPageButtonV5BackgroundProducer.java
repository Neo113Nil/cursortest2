package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.view;

import Pk0.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonV5BackgroundProducer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "roundedBackgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "backgroundCache", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonV5BackgroundProducer$BackgroundKey;", "Landroid/graphics/drawable/Drawable;", "produce", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$State;", "createSolidBackground", "Landroid/graphics/drawable/ShapeDrawable;", "backgroundColor", "", "radius", "", "createBorderedBackground", "BackgroundKey", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5BackgroundProducer {

    @NotNull
    private final Map<BackgroundKey, Drawable> backgroundCache;

    @NotNull
    private final Context context;

    @NotNull
    private final RoundedBackgroundProducer roundedBackgroundProducer;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/view/HotelsPageButtonV5BackgroundProducer$BackgroundKey;", "", "", "backgroundColor", "", "radius", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "backgroundType", "<init>", "(IFLru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "F", "getRadius", "()F", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "getBackgroundType", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5VO$BackgroundType;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class BackgroundKey {
        private final int backgroundColor;

        @NotNull
        private final HotelsPageButtonV5VO.BackgroundType backgroundType;
        private final float radius;

        public BackgroundKey(int i11, float f7, @NotNull HotelsPageButtonV5VO.BackgroundType backgroundType) {
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            this.backgroundColor = i11;
            this.radius = f7;
            this.backgroundType = backgroundType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundKey)) {
                return false;
            }
            BackgroundKey backgroundKey = (BackgroundKey) other;
            return this.backgroundColor == backgroundKey.backgroundColor && Float.compare(this.radius, backgroundKey.radius) == 0 && Intrinsics.d(this.backgroundType, backgroundKey.backgroundType);
        }

        public int hashCode() {
            return this.backgroundType.hashCode() + b.a(this.radius, Integer.hashCode(this.backgroundColor) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "BackgroundKey(backgroundColor=" + this.backgroundColor + ", radius=" + this.radius + ", backgroundType=" + this.backgroundType + ")";
        }
    }

    public HotelsPageButtonV5BackgroundProducer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.roundedBackgroundProducer = new RoundedBackgroundProducer();
        this.backgroundCache = new LinkedHashMap();
    }

    private final Drawable createBorderedBackground(int backgroundColor, float radius) {
        return new HotelsPageButtonV5BorderedBackgroundDrawable(backgroundColor, ThemeExtKt.themeColor(this.context, R$attr.graphicDisabled), ResourceExtKt.toPxF(1, this.context), radius);
    }

    private final ShapeDrawable createSolidBackground(int backgroundColor, float radius) {
        return this.roundedBackgroundProducer.produce(backgroundColor, radius, radius, 0.0f, 0.0f);
    }

    @NotNull
    public final Drawable produce(@NotNull HotelsPageButtonV5VO.State item) {
        Intrinsics.checkNotNullParameter(item, "item");
        float topCornerRadius = item.getTopCornerRadius();
        int parseColor = StyleParser.INSTANCE.parseColor(this.context, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        BackgroundKey backgroundKey = new BackgroundKey(parseColor, topCornerRadius, item.getBackgroundType());
        Map<BackgroundKey, Drawable> map = this.backgroundCache;
        Drawable drawable = map.get(backgroundKey);
        if (drawable == null) {
            drawable = item.getBackgroundType() instanceof HotelsPageButtonV5VO.BackgroundType.BorderedBackground ? createBorderedBackground(parseColor, topCornerRadius) : createSolidBackground(parseColor, topCornerRadius);
            map.put(backgroundKey, drawable);
        }
        return drawable;
    }
}
