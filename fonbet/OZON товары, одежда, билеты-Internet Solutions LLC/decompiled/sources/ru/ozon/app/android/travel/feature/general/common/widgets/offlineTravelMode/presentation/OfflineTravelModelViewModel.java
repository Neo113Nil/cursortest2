package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelWidget;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelWidgetsStateDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation.OfflineModelResponse;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse;", "response", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "mapNewState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse;)Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$OfflineModelWidget;", "item", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "mapWidget", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$OfflineModelWidget;)Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModeVI;", "", "widgetsHash", "", "downloadWidgetStates", "(Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModeVI;Ljava/lang/String;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "currentHash", "Ljava/lang/String;", "Lxe/B0;", "downloadJob", "Lxe/B0;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel$Data;", "_serializedWidgets", "LAe/w0;", "LAe/B0;", "serializableWidgets", "LAe/B0;", "getSerializableWidgets", "()LAe/B0;", "Data", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfflineTravelModelViewModel extends w0 {

    @NotNull
    private final Ae.w0<Data> _serializedWidgets;
    private String currentHash;

    @NotNull
    private final CoroutineDispatcherProvider dispatchersProvider;
    private B0 downloadJob;

    @NotNull
    private final ActionV2Repository repository;

    @NotNull
    private final Ae.B0<Data> serializableWidgets;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineTravelModelViewModel$Data;", "", "", "widgetsHash", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "widgetsState", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWidgetsHash", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "getWidgetsState", "()Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {

        @NotNull
        private final String widgetsHash;

        @NotNull
        private final OfflineTravelWidgetsStateDTO widgetsState;

        public Data(@NotNull String widgetsHash, @NotNull OfflineTravelWidgetsStateDTO widgetsState) {
            Intrinsics.checkNotNullParameter(widgetsHash, "widgetsHash");
            Intrinsics.checkNotNullParameter(widgetsState, "widgetsState");
            this.widgetsHash = widgetsHash;
            this.widgetsState = widgetsState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.widgetsHash, data.widgetsHash) && Intrinsics.d(this.widgetsState, data.widgetsState);
        }

        @NotNull
        public final String getWidgetsHash() {
            return this.widgetsHash;
        }

        @NotNull
        public final OfflineTravelWidgetsStateDTO getWidgetsState() {
            return this.widgetsState;
        }

        public int hashCode() {
            return this.widgetsState.hashCode() + (this.widgetsHash.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Data(widgetsHash=" + this.widgetsHash + ", widgetsState=" + this.widgetsState + ")";
        }
    }

    public OfflineTravelModelViewModel(@NotNull ActionV2Repository repository, @NotNull CoroutineDispatcherProvider dispatchersProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.repository = repository;
        this.dispatchersProvider = dispatchersProvider;
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._serializedWidgets = b11;
        this.serializableWidgets = C2399j.a(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OfflineTravelWidgetsStateDTO mapNewState(OfflineModelResponse response) {
        String widgetsHash;
        List<OfflineModelResponse.OfflineModelWidget> widgets;
        if (response == null || response.getState() != OfflineModelResponse.State.STATE_NEW || (widgetsHash = response.getWidgetsHash()) == null || h.K(widgetsHash) || (widgets = response.getWidgets()) == null || widgets.isEmpty() || response.getCacheLifetime() == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.SECONDS.toMillis((long) response.getCacheLifetime().doubleValue());
        List<OfflineModelResponse.OfflineModelWidget> widgets2 = response.getWidgets();
        ArrayList arrayList = new ArrayList(C7714v.z(widgets2, 10));
        Iterator<T> it = widgets2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapWidget((OfflineModelResponse.OfflineModelWidget) it.next()));
        }
        return new OfflineTravelWidgetsStateDTO(millis, arrayList, currentTimeMillis);
    }

    private final OfflineTravelWidget mapWidget(OfflineModelResponse.OfflineModelWidget item) {
        return new OfflineTravelWidget(item.getVertical(), item.getName(), item.getVersion(), item.getStateJson());
    }

    public final void downloadWidgetStates(@NotNull OfflineTravelModeVI item, String widgetsHash) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomAction action = item.getAction();
        if (Intrinsics.d(this.currentHash, widgetsHash) || !(action instanceof AtomAction.ComposerAction)) {
            return;
        }
        this.currentHash = widgetsHash;
        B0 b02 = this.downloadJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.downloadJob = C10727i.c(x0.a(this), this.dispatchersProvider.getIO(), null, new OfflineTravelModelViewModel$downloadWidgetStates$1(item, widgetsHash, action, this, null), 2);
    }

    @NotNull
    public final Ae.B0<Data> getSerializableWidgets() {
        return this.serializableWidgets;
    }
}
