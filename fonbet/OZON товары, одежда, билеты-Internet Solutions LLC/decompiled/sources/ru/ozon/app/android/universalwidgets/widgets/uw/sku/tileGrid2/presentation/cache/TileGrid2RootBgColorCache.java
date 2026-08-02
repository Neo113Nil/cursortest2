package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bJ\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/TileGrid2RootBgColorCache;", "", "<init>", "()V", "backgroundColorTokens", "", "", "backgroundColors", "", "", "isDarkTheme", "", "Ljava/lang/Boolean;", "getBackgroundColor", "context", "Landroid/content/Context;", "color", "cacheColor", "", "checkChangeTheme", "isDarkThemeActive", "parseAndSaveBackgroundColor", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2RootBgColorCache {

    @NotNull
    private final List<String> backgroundColorTokens = new ArrayList();

    @NotNull
    private final Map<String, Integer> backgroundColors = new LinkedHashMap();
    private Boolean isDarkTheme;

    private final int parseAndSaveBackgroundColor(Context context, String color) {
        this.backgroundColorTokens.add(color);
        int parseColor = StyleParser.INSTANCE.parseColor(context, color, R$color.layer_floor_0);
        this.backgroundColors.put(color, Integer.valueOf(parseColor));
        return parseColor;
    }

    public final void cacheColor(@NotNull Context context, String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.backgroundColorTokens.contains(color)) {
            return;
        }
        parseAndSaveBackgroundColor(context, color);
    }

    public final void checkChangeTheme(boolean isDarkThemeActive) {
        if (Intrinsics.d(this.isDarkTheme, Boolean.valueOf(isDarkThemeActive))) {
            return;
        }
        this.isDarkTheme = Boolean.valueOf(isDarkThemeActive);
        this.backgroundColorTokens.clear();
        this.backgroundColors.clear();
    }

    public final int getBackgroundColor(@NotNull Context context, String color) {
        Integer num;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.backgroundColorTokens.contains(color) && (num = this.backgroundColors.get(color)) != null) {
            return num.intValue();
        }
        return parseAndSaveBackgroundColor(context, color);
    }
}
