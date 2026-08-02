package ru.ozon.app.android.ads.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/presentation/CornerMaxRadius;", "", "<init>", "()V", "", "newRadius", "getRadius", "(F)F", "maxRadius", "F", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CornerMaxRadius {

    @NotNull
    public static final CornerMaxRadius INSTANCE = new CornerMaxRadius();
    private static final float maxRadius = ResourceExtKt.toPxF(60);

    private CornerMaxRadius() {
    }

    public final float getRadius(float newRadius) {
        return Math.min(newRadius, maxRadius);
    }
}
