package ru.ozon.app.android.geo.map;

import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.DetailsSheetManager;
import ru.ozon.app.android.geo.map.utils.BottomSheetActionParams;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/geo/map/DetailsSheetManagerImpl;", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "<init>", "()V", "Li10/h$c;", "pageRef", "Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "params", "", "show", "(Li10/h$c;Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;)V", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/geo/map/DetailsSheetManager$Action;", "action", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailsSheetManagerImpl implements DetailsSheetManager {

    @NotNull
    private final BroadcastSingleLiveEvent<DetailsSheetManager.Action> action = new BroadcastSingleLiveEvent<>();

    @Override // ru.ozon.app.android.geo.map.DetailsSheetManager
    public void show(@NotNull h.c pageRef, @NotNull BottomSheetActionParams params) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(params, "params");
        getAction().setValue(new DetailsSheetManager.Action.Open(pageRef, params));
    }

    @Override // ru.ozon.app.android.geo.map.DetailsSheetManager
    @NotNull
    public BroadcastSingleLiveEvent<DetailsSheetManager.Action> getAction() {
        return this.action;
    }
}
