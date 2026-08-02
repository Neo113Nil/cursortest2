package ru.ozon.app.android.mapcommon.map.provider.map;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.sdk.SdkMapController;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProviderImpl;", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "<init>", "()V", "provideMapController", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "containerView", "Landroid/view/ViewGroup;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonMapProviderImpl implements OzonMapProvider {
    @Override // ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider
    @NotNull
    public OzonMapController provideMapController(@NotNull ViewGroup containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        return new SdkMapController(containerView);
    }
}
