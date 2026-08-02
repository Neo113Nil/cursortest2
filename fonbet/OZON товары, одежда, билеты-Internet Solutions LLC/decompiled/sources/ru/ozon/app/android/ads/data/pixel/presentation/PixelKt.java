package ru.ozon.app.android.ads.data.pixel.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "Lru/ozon/app/android/ads/common/pixel/data/PixelDTO;", "pixel_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PixelKt {
    @NotNull
    public static final Pixel toVO(@NotNull PixelDTO pixelDTO) {
        Intrinsics.checkNotNullParameter(pixelDTO, "<this>");
        return new Pixel(Pixel.ActionType.INSTANCE.stringToVoActionType(pixelDTO.getAction()), pixelDTO.getUrl());
    }
}
