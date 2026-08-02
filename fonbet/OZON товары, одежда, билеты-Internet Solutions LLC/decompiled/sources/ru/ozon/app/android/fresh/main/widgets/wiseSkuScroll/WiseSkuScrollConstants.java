package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll;

import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/WiseSkuScrollConstants;", "", "<init>", "()V", "FRESH_TILE_WIDTH", "", "getFRESH_TILE_WIDTH", "()I", "BANNER_HEIGHT", "getBANNER_HEIGHT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseSkuScrollConstants {

    @NotNull
    public static final WiseSkuScrollConstants INSTANCE = new WiseSkuScrollConstants();
    private static final int FRESH_TILE_WIDTH = ResourceExtKt.toPx(130);
    private static final int BANNER_HEIGHT = ResourceExtKt.toPx(m.e.DEFAULT_SWIPE_ANIMATION_DURATION);

    private WiseSkuScrollConstants() {
    }

    public final int getBANNER_HEIGHT() {
        return BANNER_HEIGHT;
    }

    public final int getFRESH_TILE_WIDTH() {
        return FRESH_TILE_WIDTH;
    }
}
