package ru.ozon.app.android.travel.data.storage.offline;

import Ae.M0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorage;", "", "", "hash", "", "saveWidgetsHash", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getWidgetsHash", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "state", "saveWidgetsState", "(Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/M0;", "", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "getOfflineStateObservable", "()LAe/M0;", "offlineStateObservable", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OfflineTravelStorage {
    @NotNull
    M0<List<OfflineTravelWidget>> getOfflineStateObservable();

    Object getWidgetsHash(@NotNull d<? super String> dVar);

    Object saveWidgetsHash(@NotNull String str, @NotNull d<? super Unit> dVar);

    Object saveWidgetsState(@NotNull OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO, @NotNull d<? super Unit> dVar);
}
