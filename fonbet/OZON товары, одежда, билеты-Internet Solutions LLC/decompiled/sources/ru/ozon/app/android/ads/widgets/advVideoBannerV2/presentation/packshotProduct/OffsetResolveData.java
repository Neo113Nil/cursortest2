package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/OffsetResolveData;", "", "<init>", "()V", "", "TARGET_SCREEN_WIDTH", "I", "getTARGET_SCREEN_WIDTH", "()I", "TARGET_START_MARGIN", "getTARGET_START_MARGIN", "TARGET_END_MARGIN", "getTARGET_END_MARGIN", "NEW_TARGET_END_MARGIN", "getNEW_TARGET_END_MARGIN", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OffsetResolveData {

    @NotNull
    public static final OffsetResolveData INSTANCE = new OffsetResolveData();
    private static final int TARGET_SCREEN_WIDTH = UiExtKt.toPx(375);
    private static final int TARGET_START_MARGIN = UiExtKt.toPx(48);
    private static final int TARGET_END_MARGIN = UiExtKt.toPx(40);
    private static final int NEW_TARGET_END_MARGIN = UiExtKt.toPx(36);

    private OffsetResolveData() {
    }

    public final int getTARGET_END_MARGIN() {
        return TARGET_END_MARGIN;
    }

    public final int getTARGET_SCREEN_WIDTH() {
        return TARGET_SCREEN_WIDTH;
    }

    public final int getTARGET_START_MARGIN() {
        return TARGET_START_MARGIN;
    }
}
