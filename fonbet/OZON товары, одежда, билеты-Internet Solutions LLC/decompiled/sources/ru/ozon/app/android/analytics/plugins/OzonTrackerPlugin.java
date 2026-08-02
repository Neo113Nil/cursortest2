package ru.ozon.app.android.analytics.plugins;

import P4.f;
import Sg.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ei0.InterfaceC6369b;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.datalayer.data.tracker.TrinityOzonTrackerEvent;
import ru.ozon.app.android.analytics.extensions.AnalyticsExtensionsKt;
import ru.ozon.app.android.analytics.modules.EventsContainer;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;
import ru.ozon.app.android.analytics.plugins.base.PluginType;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u00012B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/analytics/plugins/OzonTrackerPlugin;", "Lru/ozon/app/android/analytics/plugins/base/AnalyticsPlugin;", "Lei0/b;", "ozonTracker", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "applicationAnalyticsScreenStorage", "<init>", "(Lei0/b;LSg/a;)V", "Lru/ozon/app/android/analytics/modules/EventsContainer;", "eventsContainer", "", "trackCampaign", "(Lru/ozon/app/android/analytics/modules/EventsContainer;)V", "", "uuid", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;", "event", "LRg/a;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsScreen;", "screen", "trackEvent", "(Ljava/lang/String;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer$OzonTrackerEvent;LRg/a;)V", "Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;", "trackTrinityEvent", "(Ljava/lang/String;Lru/ozon/app/android/analytics/datalayer/data/tracker/TrinityOzonTrackerEvent;LRg/a;)V", "Lru/ozon/app/android/analytics/Event;", "", "canHandle", "(Lru/ozon/app/android/analytics/Event;)Z", "isImportant", "(Lru/ozon/app/android/analytics/Event;Lru/ozon/app/android/analytics/modules/EventsContainer;)Z", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "isSupportedActionType", "(Lru/ozon/tracker/sendEvent/ActionType;)Z", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "send", "(Lru/ozon/app/android/analytics/Event;Lru/ozon/app/android/analytics/modules/EventsContainer;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;)V", "Lei0/b;", "LSg/a;", "Lru/ozon/app/android/analytics/plugins/base/PluginType;", "pluginType", "Lru/ozon/app/android/analytics/plugins/base/PluginType;", "getPluginType", "()Lru/ozon/app/android/analytics/plugins/base/PluginType;", "getId", "()Ljava/lang/String;", "id", "Companion", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonTrackerPlugin implements AnalyticsPlugin {

    @NotNull
    private static final Set<Event> AVAILABLE_EVENTS;

    @NotNull
    private static final Map<Event, ActionType> IMPORTANT_EVENTS;

    @NotNull
    private static final Set<String> UNSUPPORTED_ACTION_TYPES;

    @NotNull
    private final a applicationAnalyticsScreenStorage;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final PluginType pluginType;

    static {
        Event event = Event.SCREEN_VIEW;
        Event event2 = Event.CAMPAIGN;
        Event event3 = Event.TRACKER_V2_EVENT;
        AVAILABLE_EVENTS = e0.a(event, event2, event3, Event.TAB_CLICK);
        UNSUPPORTED_ACTION_TYPES = e0.a(ActionType.WIDGET_VIEW.INSTANCE.getType());
        IMPORTANT_EVENTS = U.f(new Pair(event, null), new Pair(event3, ActionType.LOGOUT.INSTANCE));
    }

    public OzonTrackerPlugin(@NotNull InterfaceC6369b ozonTracker, @NotNull a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.ozonTracker = ozonTracker;
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
        this.pluginType = PluginType.OZONTRACKER;
        ozonTracker.k(new Ll.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LoggerExtKt.sendNonFatal$default(null, message, "tracker_connection_type", null, 9, null);
    }

    private final boolean canHandle(Event event) {
        return C7714v.A(AVAILABLE_EVENTS, event);
    }

    private final boolean isImportant(Event event, EventsContainer eventsContainer) {
        ActionType actionType;
        Map<Event, ActionType> map = IMPORTANT_EVENTS;
        ActionType actionType2 = map.get(event);
        if (!map.containsKey(event)) {
            return false;
        }
        if (actionType2 == null) {
            return true;
        }
        String type = actionType2.getType();
        AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent = eventsContainer.getOzonTrackerEvent();
        return Intrinsics.d(type, (ozonTrackerEvent == null || (actionType = ozonTrackerEvent.getActionType()) == null) ? null : actionType.getType());
    }

    private final boolean isSupportedActionType(ActionType actionType) {
        return !UNSUPPORTED_ACTION_TYPES.contains(actionType.getType());
    }

    private final void trackCampaign(EventsContainer eventsContainer) {
        Page page;
        Map<String, Object> custom;
        Rg.a h11;
        InterfaceC6369b interfaceC6369b = this.ozonTracker;
        String uuid = UUID.randomUUID().toString();
        ActionType.TRACK_CAMPAIGN track_campaign = ActionType.TRACK_CAMPAIGN.INSTANCE;
        Rg.a screen = eventsContainer.getScreen();
        String f7 = screen != null ? screen.f() : null;
        Rg.a screen2 = eventsContainer.getScreen();
        String c11 = screen2 != null ? screen2.c() : null;
        String str = c11 == null ? "" : c11;
        Rg.a screen3 = eventsContainer.getScreen();
        if (screen3 == null || (h11 = screen3.h()) == null) {
            page = null;
        } else {
            String f11 = h11.f();
            String c12 = h11.c();
            page = new Page(f11, null, c12 == null ? "" : c12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null);
        }
        Page page2 = new Page(f7, null, str, null, null, null, null, page, null, null, null, null, null, null, null, null, null, null, 262008, null);
        AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent = eventsContainer.getOzonTrackerEvent();
        EventEntity.Obj obj = ozonTrackerEvent != null ? ozonTrackerEvent.getObj() : null;
        AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent2 = eventsContainer.getOzonTrackerEvent();
        Cell.CustomCell customCell = (ozonTrackerEvent2 == null || (custom = ozonTrackerEvent2.getCustom()) == null) ? null : new Cell.CustomCell(custom);
        AnalyticsDataLayer.OzonTrackerEvent ozonTrackerEvent3 = eventsContainer.getOzonTrackerEvent();
        interfaceC6369b.sendEvent(track_campaign, (r27 & 2) != 0 ? null : obj, (r27 & 4) != 0 ? null : ozonTrackerEvent3 != null ? ozonTrackerEvent3.getProperties() : null, (r27 & 8) != 0 ? null : customCell, (r27 & 16) != 0 ? null : null, page2, (r27 & 64) != 0 ? null : uuid, null, null, null, null, null, null, null, null, null);
        this.ozonTracker.g();
    }

    private final void trackEvent(String uuid, AnalyticsDataLayer.OzonTrackerEvent event, Rg.a screen) {
        ActionType actionType = event != null ? event.getActionType() : null;
        if (actionType == null || !isSupportedActionType(actionType)) {
            return;
        }
        InterfaceC6369b interfaceC6369b = this.ozonTracker;
        EventEntity.Obj obj = event.getObj();
        EventEntity.Properties properties = event.getProperties();
        EventEntity.Widget widget = event.getWidget();
        Map<String, Object> custom = event.getCustom();
        if (custom == null) {
            custom = U.c();
        }
        interfaceC6369b.sendEvent(actionType, (r27 & 2) != 0 ? null : obj, (r27 & 4) != 0 ? null : properties, (r27 & 8) != 0 ? null : new Cell.CustomCell(custom), (r27 & 16) != 0 ? null : widget, screen != null ? AnalyticsExtensionsKt.toPage(screen) : null, (r27 & 64) != 0 ? null : uuid, null, null, null, null, null, null, null, null, null);
    }

    private final void trackTrinityEvent(String uuid, TrinityOzonTrackerEvent event, Rg.a screen) {
        String str;
        String actionType = event != null ? event.getActionType() : null;
        if (actionType != null) {
            InterfaceC6369b interfaceC6369b = this.ozonTracker;
            ActionType.Custom custom = new ActionType.Custom(actionType);
            Map<String, Object> custom2 = event.getCustom();
            if (custom2 == null) {
                custom2 = U.c();
            }
            Cell.CustomCell customCell = new Cell.CustomCell(custom2);
            String pageToken = event.getPageToken();
            String widgetToken = event.getWidgetToken();
            String sliceToken = event.getSliceToken();
            String cellToken = event.getCellToken();
            if (cellToken != null) {
                if (cellToken.length() == 0) {
                    cellToken = null;
                }
                str = cellToken;
            } else {
                str = null;
            }
            InterfaceC6369b.C0979b.b(interfaceC6369b, custom, customCell, screen != null ? AnalyticsExtensionsKt.toPage(screen) : null, pageToken, widgetToken, sliceToken, str, event.getUserToken(), uuid, event.getPageTimestamp(), UserVerificationMethods.USER_VERIFY_ALL);
        }
    }

    @Override // ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin
    public String getId() {
        return null;
    }

    @Override // ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin
    @NotNull
    public PluginType getPluginType() {
        return this.pluginType;
    }

    @Override // ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin
    public void send(@NotNull Event event, @NotNull EventsContainer eventsContainer, @NotNull AnalyticsDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(eventsContainer, "eventsContainer");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        if (canHandle(event)) {
            if (event == Event.CAMPAIGN) {
                trackCampaign(eventsContainer);
            }
            if (event == Event.SCREEN_VIEW) {
                Rg.a screen = eventsContainer.getScreen();
                if (screen != null) {
                    this.applicationAnalyticsScreenStorage.e(screen);
                    this.ozonTracker.sendPageView(AnalyticsExtensionsKt.toPage(screen));
                }
            } else {
                TrinityOzonTrackerEvent trinityOzonTrackerEvent = eventsContainer.getTrinityOzonTrackerEvent();
                String b11 = f.b("toString(...)");
                trackEvent(b11, eventsContainer.getOzonTrackerEvent(), eventsContainer.getScreen());
                if (trinityOzonTrackerEvent != null) {
                    trackTrinityEvent(b11, trinityOzonTrackerEvent, eventsContainer.getScreen());
                }
            }
            if (isImportant(event, eventsContainer)) {
                this.ozonTracker.g();
            }
        }
    }
}
