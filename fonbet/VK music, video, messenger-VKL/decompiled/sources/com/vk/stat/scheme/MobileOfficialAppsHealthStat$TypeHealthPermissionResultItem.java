package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ku20;
import xsna.lhg;
import xsna.lu20;
import xsna.pmi0;
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
public final class MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("are_permissions_requested")
    private final Boolean arePermissionsRequested;

    @pmi0("data_source")
    private final DataSource dataSource;

    @pmi0("device_info_item")
    private final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem deviceInfoItem;

    @pmi0("end_time")
    private final long endTime;

    @pmi0("error_description")
    private final FilteredString filteredErrorDescription;

    @pmi0("granted_permissions")
    private final List<MobileOfficialAppsHealthStat$TypeHealthPermission> grantedPermissions;

    @pmi0("health_connect_info")
    private final MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem healthConnectInfo;

    @pmi0("new_granted_permissions")
    private final List<MobileOfficialAppsHealthStat$TypeHealthPermission> newGrantedPermissions;

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

        public static DataSource valueOf(String str) {
            return (DataSource) Enum.valueOf(DataSource.class, str);
        }

        public static DataSource[] values() {
            return (DataSource[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsHealthStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem>, a9y<MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            State state = (State) dq.f(x9yVar, "state", tru.a(), State.class);
            long q = fai.q(x9yVar, "start_time");
            long q2 = fai.q(x9yVar, "end_time");
            DataSource dataSource = (DataSource) dq.f(x9yVar, "data_source", tru.a(), DataSource.class);
            MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = (MobileOfficialAppsCoreDeviceStat$DeviceInfoItem) dq.f(x9yVar, "device_info_item", tru.a(), MobileOfficialAppsCoreDeviceStat$DeviceInfoItem.class);
            String C = fai.C(x9yVar, "error_description");
            Gson a = tru.a();
            b9y q3 = x9yVar.q("sync_reason");
            SyncReason syncReason = (SyncReason) ((q3 == null || (q3 instanceof u9y)) ? null : a.fromJson(q3.k(), SyncReason.class));
            Boolean y = fai.y(x9yVar, "are_permissions_requested");
            Gson a2 = tru.a();
            b9y q4 = x9yVar.q("granted_permissions");
            List list = (List) ((q4 == null || (q4 instanceof u9y)) ? null : a2.fromJson(x9yVar.q("granted_permissions").k(), new ku20().getType()));
            Gson a3 = tru.a();
            b9y q5 = x9yVar.q("new_granted_permissions");
            List list2 = (List) ((q5 == null || (q5 instanceof u9y)) ? null : a3.fromJson(x9yVar.q("new_granted_permissions").k(), new lu20().getType()));
            Gson a4 = tru.a();
            b9y q6 = x9yVar.q("health_connect_info");
            return new MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem(state, q, q2, dataSource, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, C, syncReason, y, list, list2, (MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem) ((q6 == null || (q6 instanceof u9y)) ? null : a4.fromJson(q6.k(), MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem = (MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("state", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.i()));
            x9yVar.n("start_time", Long.valueOf(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.h()));
            x9yVar.n("end_time", Long.valueOf(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.d()));
            x9yVar.o("data_source", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.b()));
            x9yVar.o("device_info_item", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.c()));
            x9yVar.o("error_description", mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.a);
            x9yVar.o("sync_reason", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.j()));
            x9yVar.m(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.a(), "are_permissions_requested");
            x9yVar.o("granted_permissions", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.e()));
            x9yVar.o("new_granted_permissions", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.g()));
            x9yVar.o("health_connect_info", tru.a().toJson(mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.f()));
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

        @pmi0("all_permissions_granted")
        public static final State ALL_PERMISSIONS_GRANTED;

        @pmi0("error")
        public static final State ERROR;

        @pmi0("some_permissions_disabled")
        public static final State SOME_PERMISSIONS_DISABLED;

        static {
            State state = new State("ALL_PERMISSIONS_GRANTED", 0);
            ALL_PERMISSIONS_GRANTED = state;
            State state2 = new State("SOME_PERMISSIONS_DISABLED", 1);
            SOME_PERMISSIONS_DISABLED = state2;
            State state3 = new State("ERROR", 2);
            ERROR = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        private State(String str, int i) {
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

        @pmi0("chekStepsPermissionsCommand")
        public static final SyncReason CHEKSTEPSPERMISSIONSCOMMAND;

        @pmi0("getStepsCommand")
        public static final SyncReason GETSTEPSCOMMAND;

        static {
            SyncReason syncReason = new SyncReason("CHEKSTEPSPERMISSIONSCOMMAND", 0);
            CHEKSTEPSPERMISSIONSCOMMAND = syncReason;
            SyncReason syncReason2 = new SyncReason("GETSTEPSCOMMAND", 1);
            GETSTEPSCOMMAND = syncReason2;
            SyncReason[] syncReasonArr = {syncReason, syncReason2};
            $VALUES = syncReasonArr;
            $ENTRIES = new asp(syncReasonArr);
        }

        private SyncReason(String str, int i) {
        }

        public static SyncReason valueOf(String str) {
            return (SyncReason) Enum.valueOf(SyncReason.class, str);
        }

        public static SyncReason[] values() {
            return (SyncReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem(State state, long j, long j2, DataSource dataSource, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, String str, SyncReason syncReason, Boolean bool, List<? extends MobileOfficialAppsHealthStat$TypeHealthPermission> list, List<? extends MobileOfficialAppsHealthStat$TypeHealthPermission> list2, MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem) {
        this.state = state;
        this.startTime = j;
        this.endTime = j2;
        this.dataSource = dataSource;
        this.deviceInfoItem = mobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
        this.a = str;
        this.syncReason = syncReason;
        this.arePermissionsRequested = bool;
        this.grantedPermissions = list;
        this.newGrantedPermissions = list2;
        this.healthConnectInfo = mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredErrorDescription = filteredString;
        filteredString.a(str);
    }

    public final Boolean a() {
        return this.arePermissionsRequested;
    }

    public final DataSource b() {
        return this.dataSource;
    }

    public final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem c() {
        return this.deviceInfoItem;
    }

    public final long d() {
        return this.endTime;
    }

    public final List<MobileOfficialAppsHealthStat$TypeHealthPermission> e() {
        return this.grantedPermissions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem)) {
            return false;
        }
        MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem = (MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem) obj;
        return this.state == mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.state && this.startTime == mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.startTime && this.endTime == mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.endTime && this.dataSource == mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.dataSource && epx.f(this.deviceInfoItem, mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.deviceInfoItem) && epx.f(this.a, mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.a) && this.syncReason == mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.syncReason && epx.f(this.arePermissionsRequested, mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.arePermissionsRequested) && epx.f(this.grantedPermissions, mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.grantedPermissions) && epx.f(this.newGrantedPermissions, mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.newGrantedPermissions) && epx.f(this.healthConnectInfo, mobileOfficialAppsHealthStat$TypeHealthPermissionResultItem.healthConnectInfo);
    }

    public final MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem f() {
        return this.healthConnectInfo;
    }

    public final List<MobileOfficialAppsHealthStat$TypeHealthPermission> g() {
        return this.newGrantedPermissions;
    }

    public final long h() {
        return this.startTime;
    }

    public final int hashCode() {
        int hashCode = (this.deviceInfoItem.hashCode() + ((this.dataSource.hashCode() + bh10.a(bh10.a(this.state.hashCode() * 31, 31, this.startTime), 31, this.endTime)) * 31)) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SyncReason syncReason = this.syncReason;
        int hashCode3 = (hashCode2 + (syncReason == null ? 0 : syncReason.hashCode())) * 31;
        Boolean bool = this.arePermissionsRequested;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MobileOfficialAppsHealthStat$TypeHealthPermission> list = this.grantedPermissions;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<MobileOfficialAppsHealthStat$TypeHealthPermission> list2 = this.newGrantedPermissions;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem = this.healthConnectInfo;
        return hashCode6 + (mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem != null ? mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem.hashCode() : 0);
    }

    public final State i() {
        return this.state;
    }

    public final SyncReason j() {
        return this.syncReason;
    }

    public final String toString() {
        return "TypeHealthPermissionResultItem(state=" + this.state + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", dataSource=" + this.dataSource + ", deviceInfoItem=" + this.deviceInfoItem + ", errorDescription=" + this.a + ", syncReason=" + this.syncReason + ", arePermissionsRequested=" + this.arePermissionsRequested + ", grantedPermissions=" + this.grantedPermissions + ", newGrantedPermissions=" + this.newGrantedPermissions + ", healthConnectInfo=" + this.healthConnectInfo + ')';
    }

    public /* synthetic */ MobileOfficialAppsHealthStat$TypeHealthPermissionResultItem(State state, long j, long j2, DataSource dataSource, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, String str, SyncReason syncReason, Boolean bool, List list, List list2, MobileOfficialAppsHealthStat$TypeHealthConnectInfoItem mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem, int i, zcl zclVar) {
        this(state, j, j2, dataSource, mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : syncReason, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : mobileOfficialAppsHealthStat$TypeHealthConnectInfoItem);
    }
}
