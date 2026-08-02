package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/CatalogueTabsDrawableCache;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundColor", "", "cache", "", "", "Landroid/graphics/drawable/GradientDrawable;", "getCatalogueTabsDrawableByRadius", "radius", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsDrawableCache {
    private final int backgroundColor;

    @NotNull
    private final Map<Float, GradientDrawable> cache;

    public CatalogueTabsDrawableCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary);
        this.cache = new LinkedHashMap();
    }

    @NotNull
    public final GradientDrawable getCatalogueTabsDrawableByRadius(float radius) {
        GradientDrawable gradientDrawable = this.cache.get(Float.valueOf(radius));
        if (gradientDrawable != null) {
            return gradientDrawable;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(this.backgroundColor);
        gradientDrawable2.setCornerRadii(new float[]{radius, radius, radius, radius, 0.0f, 0.0f, 0.0f, 0.0f});
        this.cache.put(Float.valueOf(radius), gradientDrawable2);
        return gradientDrawable2;
    }
}
