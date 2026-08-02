package ru.ozon.app.android.pdp.ui.configurators.pdp.tab;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Bi.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/PdpTabsSelectionState;", "", "<init>", "()V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/PdpTabsSelectionState$TabGroup;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "()Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/PdpTabsSelectionState$TabGroup;", "LAe/h;", "observeChanges", "()LAe/h;", "", "selectedGroupId", "", "groupIds", "", "onTabSelected", "(Ljava/lang/String;Ljava/util/List;)V", "LAe/x0;", "stateFlow", "LAe/x0;", "TabGroup", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTabsSelectionState {

    @NotNull
    public static final PdpTabsSelectionState INSTANCE = new PdpTabsSelectionState();

    @NotNull
    private static final x0<TabGroup> stateFlow = O0.a(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/PdpTabsSelectionState$TabGroup;", "", "", "", "groupIds", "selectedGroupId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGroupIds", "()Ljava/util/List;", "Ljava/lang/String;", "getSelectedGroupId", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabGroup {
        public static final int $stable = 8;

        @NotNull
        private final List<String> groupIds;

        @NotNull
        private final String selectedGroupId;

        public TabGroup(@NotNull List<String> groupIds, @NotNull String selectedGroupId) {
            Intrinsics.checkNotNullParameter(groupIds, "groupIds");
            Intrinsics.checkNotNullParameter(selectedGroupId, "selectedGroupId");
            this.groupIds = groupIds;
            this.selectedGroupId = selectedGroupId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabGroup)) {
                return false;
            }
            TabGroup tabGroup = (TabGroup) other;
            return Intrinsics.d(this.groupIds, tabGroup.groupIds) && Intrinsics.d(this.selectedGroupId, tabGroup.selectedGroupId);
        }

        @NotNull
        public final List<String> getGroupIds() {
            return this.groupIds;
        }

        @NotNull
        public final String getSelectedGroupId() {
            return this.selectedGroupId;
        }

        public int hashCode() {
            return this.selectedGroupId.hashCode() + (this.groupIds.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return b.e("TabGroup(groupIds=", ", selectedGroupId=", this.selectedGroupId, ")", this.groupIds);
        }
    }

    private PdpTabsSelectionState() {
    }

    @NotNull
    public final InterfaceC2395h<TabGroup> observeChanges() {
        return C2399j.l(new C2406m0(stateFlow), 20L);
    }

    public final void onTabSelected(@NotNull String selectedGroupId, @NotNull List<String> groupIds) {
        Intrinsics.checkNotNullParameter(selectedGroupId, "selectedGroupId");
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        stateFlow.setValue(new TabGroup(groupIds, selectedGroupId));
    }

    public final TabGroup value() {
        return stateFlow.getValue();
    }
}
