package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/MapLastParamsHelper;", "", "<init>", "()V", "Lwe0/i;", "area", "", "zoom", "", "onMapReady", "(Lwe0/i;F)V", "setVisibleArea", "(Lwe0/i;)V", "getVisibleArea", "()Lwe0/i;", "setZoom", "(F)V", "getZoom", "()F", "cachedVisibleArea", "Lwe0/i;", "cachedZoom", "F", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapLastParamsHelper {
    private i cachedVisibleArea;
    private float cachedZoom;

    /* renamed from: getVisibleArea, reason: from getter */
    public final i getCachedVisibleArea() {
        return this.cachedVisibleArea;
    }

    /* renamed from: getZoom, reason: from getter */
    public final float getCachedZoom() {
        return this.cachedZoom;
    }

    public final void onMapReady(@NotNull i area, float zoom) {
        Intrinsics.checkNotNullParameter(area, "area");
        setVisibleArea(area);
        setZoom(zoom);
    }

    public final void setVisibleArea(@NotNull i area) {
        Intrinsics.checkNotNullParameter(area, "area");
        this.cachedVisibleArea = area;
    }

    public final void setZoom(float zoom) {
        this.cachedZoom = zoom;
    }
}
