package ru.ozon.app.android.analytics.datalayer;

import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;", "device", "Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;", "user", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;)V", "copy", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;)Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;", "getDevice", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;", "setDevice", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;)V", "Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;", "getUser", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;", "setUser", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;)V", "OzonTrackerEvent", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnalyticsDataLayer {
    private AnalyticsDevice device;
    private AnalyticsUser user;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;", "", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/tracker/model/EventEntity$Obj;", "obj", "Lru/ozon/tracker/model/EventEntity$Properties;", "properties", "Lru/ozon/tracker/model/EventEntity$Widget;", "widget", "", "", "custom", "<init>", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/model/EventEntity$Widget;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/tracker/sendEvent/ActionType;", "getActionType", "()Lru/ozon/tracker/sendEvent/ActionType;", "setActionType", "(Lru/ozon/tracker/sendEvent/ActionType;)V", "Lru/ozon/tracker/model/EventEntity$Obj;", "getObj", "()Lru/ozon/tracker/model/EventEntity$Obj;", "setObj", "(Lru/ozon/tracker/model/EventEntity$Obj;)V", "Lru/ozon/tracker/model/EventEntity$Properties;", "getProperties", "()Lru/ozon/tracker/model/EventEntity$Properties;", "setProperties", "(Lru/ozon/tracker/model/EventEntity$Properties;)V", "Lru/ozon/tracker/model/EventEntity$Widget;", "getWidget", "()Lru/ozon/tracker/model/EventEntity$Widget;", "setWidget", "(Lru/ozon/tracker/model/EventEntity$Widget;)V", "Ljava/util/Map;", "getCustom", "()Ljava/util/Map;", "setCustom", "(Ljava/util/Map;)V", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonTrackerEvent {
        private ActionType actionType;
        private Map<String, ? extends Object> custom;
        private EventEntity.Obj obj;
        private EventEntity.Properties properties;
        private EventEntity.Widget widget;

        public OzonTrackerEvent() {
            this(null, null, null, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OzonTrackerEvent)) {
                return false;
            }
            OzonTrackerEvent ozonTrackerEvent = (OzonTrackerEvent) other;
            return Intrinsics.d(this.actionType, ozonTrackerEvent.actionType) && Intrinsics.d(this.obj, ozonTrackerEvent.obj) && Intrinsics.d(this.properties, ozonTrackerEvent.properties) && Intrinsics.d(this.widget, ozonTrackerEvent.widget) && Intrinsics.d(this.custom, ozonTrackerEvent.custom);
        }

        public final ActionType getActionType() {
            return this.actionType;
        }

        public final Map<String, Object> getCustom() {
            return this.custom;
        }

        public final EventEntity.Obj getObj() {
            return this.obj;
        }

        public final EventEntity.Properties getProperties() {
            return this.properties;
        }

        public final EventEntity.Widget getWidget() {
            return this.widget;
        }

        public int hashCode() {
            ActionType actionType = this.actionType;
            int hashCode = (actionType == null ? 0 : actionType.hashCode()) * 31;
            EventEntity.Obj obj = this.obj;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            EventEntity.Properties properties = this.properties;
            int hashCode3 = (hashCode2 + (properties == null ? 0 : properties.hashCode())) * 31;
            EventEntity.Widget widget = this.widget;
            int hashCode4 = (hashCode3 + (widget == null ? 0 : widget.hashCode())) * 31;
            Map<String, ? extends Object> map = this.custom;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ActionType actionType = this.actionType;
            EventEntity.Obj obj = this.obj;
            EventEntity.Properties properties = this.properties;
            EventEntity.Widget widget = this.widget;
            Map<String, ? extends Object> map = this.custom;
            StringBuilder sb2 = new StringBuilder("OzonTrackerEvent(actionType=");
            sb2.append(actionType);
            sb2.append(", obj=");
            sb2.append(obj);
            sb2.append(", properties=");
            sb2.append(properties);
            sb2.append(", widget=");
            sb2.append(widget);
            sb2.append(", custom=");
            return P.f(sb2, map, ")");
        }

        public OzonTrackerEvent(ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, EventEntity.Widget widget, Map<String, ? extends Object> map) {
            this.actionType = actionType;
            this.obj = obj;
            this.properties = properties;
            this.widget = widget;
            this.custom = map;
        }

        public /* synthetic */ OzonTrackerEvent(ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, EventEntity.Widget widget, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : actionType, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? null : properties, (i11 & 8) != 0 ? null : widget, (i11 & 16) != 0 ? null : map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsDataLayer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AnalyticsDataLayer copy$default(AnalyticsDataLayer analyticsDataLayer, AnalyticsDevice analyticsDevice, AnalyticsUser analyticsUser, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            analyticsDevice = analyticsDataLayer.device;
        }
        if ((i11 & 2) != 0) {
            analyticsUser = analyticsDataLayer.user;
        }
        return analyticsDataLayer.copy(analyticsDevice, analyticsUser);
    }

    @NotNull
    public final AnalyticsDataLayer copy(AnalyticsDevice device, AnalyticsUser user) {
        return new AnalyticsDataLayer(device, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsDataLayer)) {
            return false;
        }
        AnalyticsDataLayer analyticsDataLayer = (AnalyticsDataLayer) other;
        return Intrinsics.d(this.device, analyticsDataLayer.device) && Intrinsics.d(this.user, analyticsDataLayer.user);
    }

    public final AnalyticsDevice getDevice() {
        return this.device;
    }

    public final AnalyticsUser getUser() {
        return this.user;
    }

    public int hashCode() {
        AnalyticsDevice analyticsDevice = this.device;
        int hashCode = (analyticsDevice == null ? 0 : analyticsDevice.hashCode()) * 31;
        AnalyticsUser analyticsUser = this.user;
        return hashCode + (analyticsUser != null ? analyticsUser.hashCode() : 0);
    }

    public final void setDevice(AnalyticsDevice analyticsDevice) {
        this.device = analyticsDevice;
    }

    public final void setUser(AnalyticsUser analyticsUser) {
        this.user = analyticsUser;
    }

    @NotNull
    public String toString() {
        return "AnalyticsDataLayer(device=" + this.device + ", user=" + this.user + ")";
    }

    public AnalyticsDataLayer(AnalyticsDevice analyticsDevice, AnalyticsUser analyticsUser) {
        this.device = analyticsDevice;
        this.user = analyticsUser;
    }

    public /* synthetic */ AnalyticsDataLayer(AnalyticsDevice analyticsDevice, AnalyticsUser analyticsUser, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsDevice, (i11 & 2) != 0 ? null : analyticsUser);
    }
}
