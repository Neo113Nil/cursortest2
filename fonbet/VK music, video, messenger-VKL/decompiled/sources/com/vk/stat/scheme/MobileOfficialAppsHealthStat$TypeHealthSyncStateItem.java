package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.ms9;
import xsna.mu20;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsHealthStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsHealthStat$TypeHealthSyncStateItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("amount_of_days")
    private final int amountOfDays;

    @pmi0("are_permissions_requested")
    private final Boolean arePermissionsRequested;
    public final transient String b;

    @pmi0("data_source")
    private final DataSource dataSource;

    @pmi0("device_info_item")
    private final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem deviceInfoItem;

    @pmi0("end_time")
    private final long endTime;

    @pmi0("error_description")
    private final FilteredString filteredErrorDescription;

    @pmi0("sdk_version")
    private final FilteredString filteredSdkVersion;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final List<MobileOfficialAppsHealthStat$TypeHealthPermission> permissions;

    @pmi0("start_time")
    private final long startTime;

    @pmi0("state")
    private final State state;

    @pmi0("sync_reason")
    private final SyncReason syncReason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsHealthStat.kt */
    /* loaded from: classes5.dex */
    public static final class DataSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DataSource[] $VALUES;

        @pmi0("google_fit")
        public static final DataSource GOOGLE_FIT;

        @pmi0("health_connect")
        public static final DataSource HEALTH_CONNECT;

        @pmi0("health_kit")
        public static final DataSource HEALTH_KIT;

        @pmi0("huawei_health")
        public static final DataSource HUAWEI_HEALTH;

        @pmi0(StringUtils.UNDEFINED)
        public static final DataSource UNDEFINED;

        static {
            DataSource dataSource = new DataSource("GOOGLE_FIT", 0);
            GOOGLE_FIT = dataSource;
            DataSource dataSource2 = new DataSource("HEALTH_CONNECT", 1);
            HEALTH_CONNECT = dataSource2;
            DataSource dataSource3 = new DataSource("HUAWEI_HEALTH", 2);
            HUAWEI_HEALTH = dataSource3;
            DataSource dataSource4 = new DataSource("HEALTH_KIT", 3);
            HEALTH_KIT = dataSource4;
            DataSource dataSource5 = new DataSource("UNDEFINED", 4);
            UNDEFINED = dataSource5;
            DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4, dataSource5};
            $VALUES = dataSourceArr;
            $ENTRIES = new asp(dataSourceArr);
        }

        private DataSource(String str, int i) {
        }

        public static zrp<DataSource> h() {
            return $ENTRIES;
        }

        public static DataSource valueOf(String str) {
            return (DataSource) Enum.valueOf(DataSource.class, str);
        }

        public static DataSource[] values() {
            return (DataSource[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsHealthStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsHealthStat$TypeHealthSyncStateItem>, a9y<MobileOfficialAppsHealthStat$TypeHealthSyncStateItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            State state = (State) dq.f(x9yVar, "state", tru.a(), State.class);
            long q = fai.q(x9yVar, "start_time");
            long q2 = fai.q(x9yVar, "end_time");
            int p = fai.p(x9yVar, "amount_of_days");
            SyncReason syncReason = (SyncReason) dq.f(x9yVar, "sync_reason", tru.a(), SyncReason.class);
            DataSource dataSource = (DataSource) dq.f(x9yVar, "data_source", tru.a(), DataSource.class);
            MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = (MobileOfficialAppsCoreDeviceStat$DeviceInfoItem) dq.f(x9yVar, "device_info_item", tru.a(), MobileOfficialAppsCoreDeviceStat$DeviceInfoItem.class);
            String C = fai.C(x9yVar, "error_description");
            String C2 = fai.C(x9yVar, "sdk_version");
            Boolean y = fai.y(x9yVar, "are_permissions_requested");
            Gson a = tru.a();
            b9y q3 = x9yVar.q(SignalingProtocol.KEY_PERMISSIONS);
            return new MobileOfficialAppsHealthStat$TypeHealthSyncStateItem(state, q, q2, p, syncReason, dataSource, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, C, C2, y, (List) ((q3 == null || (q3 instanceof u9y)) ? null : a.fromJson(x9yVar.q(SignalingProtocol.KEY_PERMISSIONS).k(), new mu20().getType())));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsHealthStat$TypeHealthSyncStateItem mobileOfficialAppsHealthStat$TypeHealthSyncStateItem = (MobileOfficialAppsHealthStat$TypeHealthSyncStateItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("state", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.h()));
            x9yVar.n("start_time", Long.valueOf(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.g()));
            x9yVar.n("end_time", Long.valueOf(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.e()));
            x9yVar.n("amount_of_days", Integer.valueOf(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.a()));
            x9yVar.o("sync_reason", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.i()));
            x9yVar.o("data_source", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.c()));
            x9yVar.o("device_info_item", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.d()));
            x9yVar.o("error_description", mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.a);
            x9yVar.o("sdk_version", mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.b);
            x9yVar.m(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.b(), "are_permissions_requested");
            x9yVar.o(SignalingProtocol.KEY_PERMISSIONS, tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.f()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsHealthStat.kt */
    /* loaded from: classes5.dex */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @pmi0("api_sync_error")
        public static final State API_SYNC_ERROR;

        @pmi0("health_provider_error")
        public static final State HEALTH_PROVIDER_ERROR;

        @pmi0("no_data_changes")
        public static final State NO_DATA_CHANGES;

        @pmi0("success")
        public static final State SUCCESS;

        static {
            State state = new State("SUCCESS", 0);
            SUCCESS = state;
            State state2 = new State("HEALTH_PROVIDER_ERROR", 1);
            HEALTH_PROVIDER_ERROR = state2;
            State state3 = new State("API_SYNC_ERROR", 2);
            API_SYNC_ERROR = state3;
            State state4 = new State("NO_DATA_CHANGES", 3);
            NO_DATA_CHANGES = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        private State(String str, int i) {
        }

        public static zrp<State> h() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsHealthStat.kt */
    /* loaded from: classes5.dex */
    public static final class SyncReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SyncReason[] $VALUES;

        @pmi0("app_start")
        public static final SyncReason APP_START;

        @pmi0("background_sync")
        public static final SyncReason BACKGROUND_SYNC;

        @pmi0("bridge_event_get")
        public static final SyncReason BRIDGE_EVENT_GET;

        @pmi0("bridge_event_stat")
        public static final SyncReason BRIDGE_EVENT_STAT;

        @pmi0("notification_event")
        public static final SyncReason NOTIFICATION_EVENT;

        @pmi0("other")
        public static final SyncReason OTHER;

        @pmi0("widget_update")
        public static final SyncReason WIDGET_UPDATE;

        static {
            SyncReason syncReason = new SyncReason("BRIDGE_EVENT_STAT", 0);
            BRIDGE_EVENT_STAT = syncReason;
            SyncReason syncReason2 = new SyncReason("BRIDGE_EVENT_GET", 1);
            BRIDGE_EVENT_GET = syncReason2;
            SyncReason syncReason3 = new SyncReason("BACKGROUND_SYNC", 2);
            BACKGROUND_SYNC = syncReason3;
            SyncReason syncReason4 = new SyncReason("WIDGET_UPDATE", 3);
            WIDGET_UPDATE = syncReason4;
            SyncReason syncReason5 = new SyncReason("APP_START", 4);
            APP_START = syncReason5;
            SyncReason syncReason6 = new SyncReason("NOTIFICATION_EVENT", 5);
            NOTIFICATION_EVENT = syncReason6;
            SyncReason syncReason7 = new SyncReason(NativeAdContent.ViewTag.OTHER, 6);
            OTHER = syncReason7;
            SyncReason[] syncReasonArr = {syncReason, syncReason2, syncReason3, syncReason4, syncReason5, syncReason6, syncReason7};
            $VALUES = syncReasonArr;
            $ENTRIES = new asp(syncReasonArr);
        }

        private SyncReason(String str, int i) {
        }

        public static zrp<SyncReason> h() {
            return $ENTRIES;
        }

        public static SyncReason valueOf(String str) {
            return (SyncReason) Enum.valueOf(SyncReason.class, str);
        }

        public static SyncReason[] values() {
            return (SyncReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsHealthStat$TypeHealthSyncStateItem(State state, long j, long j2, int i, SyncReason syncReason, DataSource dataSource, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, String str, String str2, Boolean bool, List<? extends MobileOfficialAppsHealthStat$TypeHealthPermission> list) {
        this.state = state;
        this.startTime = j;
        this.endTime = j2;
        this.amountOfDays = i;
        this.syncReason = syncReason;
        this.dataSource = dataSource;
        this.deviceInfoItem = mobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
        this.a = str;
        this.b = str2;
        this.arePermissionsRequested = bool;
        this.permissions = list;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredErrorDescription = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(64));
        this.filteredSdkVersion = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final int a() {
        return this.amountOfDays;
    }

    public final Boolean b() {
        return this.arePermissionsRequested;
    }

    public final DataSource c() {
        return this.dataSource;
    }

    public final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem d() {
        return this.deviceInfoItem;
    }

    public final long e() {
        return this.endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsHealthStat$TypeHealthSyncStateItem)) {
            return false;
        }
        MobileOfficialAppsHealthStat$TypeHealthSyncStateItem mobileOfficialAppsHealthStat$TypeHealthSyncStateItem = (MobileOfficialAppsHealthStat$TypeHealthSyncStateItem) obj;
        return this.state == mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.state && this.startTime == mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.startTime && this.endTime == mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.endTime && this.amountOfDays == mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.amountOfDays && this.syncReason == mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.syncReason && this.dataSource == mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.dataSource && epx.f(this.deviceInfoItem, mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.deviceInfoItem) && epx.f(this.a, mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.a) && epx.f(this.b, mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.b) && epx.f(this.arePermissionsRequested, mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.arePermissionsRequested) && epx.f(this.permissions, mobileOfficialAppsHealthStat$TypeHealthSyncStateItem.permissions);
    }

    public final List<MobileOfficialAppsHealthStat$TypeHealthPermission> f() {
        return this.permissions;
    }

    public final long g() {
        return this.startTime;
    }

    public final State h() {
        return this.state;
    }

    public final int hashCode() {
        int hashCode = (this.deviceInfoItem.hashCode() + ((this.dataSource.hashCode() + ((this.syncReason.hashCode() + shy.a(this.amountOfDays, bh10.a(bh10.a(this.state.hashCode() * 31, 31, this.startTime), 31, this.endTime), 31)) * 31)) * 31)) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.arePermissionsRequested;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MobileOfficialAppsHealthStat$TypeHealthPermission> list = this.permissions;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final SyncReason i() {
        return this.syncReason;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeHealthSyncStateItem(state=");
        sb.append(this.state);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", amountOfDays=");
        sb.append(this.amountOfDays);
        sb.append(", syncReason=");
        sb.append(this.syncReason);
        sb.append(", dataSource=");
        sb.append(this.dataSource);
        sb.append(", deviceInfoItem=");
        sb.append(this.deviceInfoItem);
        sb.append(", errorDescription=");
        sb.append(this.a);
        sb.append(", sdkVersion=");
        sb.append(this.b);
        sb.append(", arePermissionsRequested=");
        sb.append(this.arePermissionsRequested);
        sb.append(", permissions=");
        return ms9.a(')', sb, this.permissions);
    }

    public /* synthetic */ MobileOfficialAppsHealthStat$TypeHealthSyncStateItem(State state, long j, long j2, int i, SyncReason syncReason, DataSource dataSource, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, String str, String str2, Boolean bool, List list, int i2, zcl zclVar) {
        this(state, j, j2, i, syncReason, dataSource, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : list);
    }
}
