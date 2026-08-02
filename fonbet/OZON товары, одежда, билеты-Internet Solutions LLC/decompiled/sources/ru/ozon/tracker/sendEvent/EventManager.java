package ru.ozon.tracker.sendEvent;

import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.Cell;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'JÉ\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H&¢\u0006\u0002\u0010%J½\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H'¢\u0006\u0002\u0010&J*\u0010'\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010(H&J¥\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H'¢\u0006\u0002\u0010)J\u0087\u0001\u0010*\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u000203H&¢\u0006\u0002\u00104J\u007f\u0010*\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u00100\u001a\u0004\u0018\u000101H'¢\u0006\u0002\u00105Js\u0010*\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u00100\u001a\u0004\u0018\u000101H'¢\u0006\u0002\u00106J\b\u00107\u001a\u00020\u0003H&J\b\u00108\u001a\u00020\u0003H&¨\u00069"}, d2 = {"Lru/ozon/tracker/sendEvent/EventManager;", "", "sendPageView", "", "page", "Lru/ozon/tracker/sendEvent/Page;", "setPageView", "sendEvent", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/tracker/sendEvent/ActionType;", "obj", "Lru/ozon/tracker/model/EventEntity$Obj;", "properties", "Lru/ozon/tracker/model/EventEntity$Properties;", "custom", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "widget", "Lru/ozon/tracker/model/EventEntity$Widget;", "uuid", "", DynamicElementDTO.FORM, "Lru/ozon/tracker/model/EventEntity$Form;", "eventError", "Lru/ozon/tracker/model/EventEntity$EventError;", "posting", "Lru/ozon/tracker/model/EventEntity$Posting;", "filter", "Lru/ozon/tracker/model/EventEntity$Filter;", "sale", "Lru/ozon/tracker/model/EventEntity$Sale;", "review", "Lru/ozon/tracker/model/EventEntity$Review;", "discountRequestId", "", "advertisementCampaignId", "courier", "Lru/ozon/tracker/model/EventEntity$Courier;", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/tracker/model/EventEntity$Courier;)V", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;)V", "sendCustomEvent", "", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;)V", "sendTrinityEvent", "pageToken", "widgetToken", "sliceToken", "cellToken", "userToken", "pageTimestamp", "", "isFastEvent", "", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Z)V", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "forceSendEvents", "clearAllEvents", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EventManager {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void sendCustomEvent$default(EventManager eventManager, String str, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCustomEvent");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            eventManager.sendCustomEvent(str, map);
        }

        public static /* synthetic */ void sendEvent$default(EventManager eventManager, ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, String str, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, EventEntity.Courier courier, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            eventManager.sendEvent(actionType, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? null : properties, (i11 & 8) != 0 ? null : customCell, (i11 & 16) != 0 ? null : widget, (i11 & 32) != 0 ? null : page, (i11 & 64) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : form, (i11 & 256) != 0 ? null : eventError, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : posting, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : filter, (i11 & 2048) != 0 ? null : sale, (i11 & 4096) != 0 ? null : review, (i11 & 8192) != 0 ? null : num, (i11 & 16384) != 0 ? null : num2, (i11 & 32768) != 0 ? null : courier);
        }

        public static /* synthetic */ void sendTrinityEvent$default(EventManager eventManager, ActionType actionType, Cell.CustomCell customCell, Page page, String str, String str2, String str3, String str4, String str5, String str6, Long l11, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendTrinityEvent");
            }
            if ((i11 & 2) != 0) {
                customCell = null;
            }
            if ((i11 & 4) != 0) {
                page = null;
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            if ((i11 & 16) != 0) {
                str2 = null;
            }
            if ((i11 & 32) != 0) {
                str3 = null;
            }
            if ((i11 & 64) != 0) {
                str4 = null;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str5 = null;
            }
            if ((i11 & 256) != 0) {
                str6 = null;
            }
            eventManager.sendTrinityEvent(actionType, customCell, page, str, str2, str3, str4, str5, str6, l11, z11);
        }

        public static /* synthetic */ void sendEvent$default(EventManager eventManager, ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, String str, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            eventManager.sendEvent(actionType, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? null : properties, (i11 & 8) != 0 ? null : customCell, (i11 & 16) != 0 ? null : widget, (i11 & 32) != 0 ? null : page, (i11 & 64) != 0 ? null : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : form, (i11 & 256) != 0 ? null : eventError, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : posting, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : filter, (i11 & 2048) != 0 ? null : sale, (i11 & 4096) != 0 ? null : review, (i11 & 8192) != 0 ? null : num, (i11 & 16384) != 0 ? null : num2);
        }

        public static /* synthetic */ void sendTrinityEvent$default(EventManager eventManager, ActionType actionType, Cell.CustomCell customCell, Page page, String str, String str2, String str3, String str4, String str5, String str6, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendTrinityEvent");
            }
            if ((i11 & 2) != 0) {
                customCell = null;
            }
            if ((i11 & 4) != 0) {
                page = null;
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            if ((i11 & 16) != 0) {
                str2 = null;
            }
            if ((i11 & 32) != 0) {
                str3 = null;
            }
            if ((i11 & 64) != 0) {
                str4 = null;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str5 = null;
            }
            if ((i11 & 256) != 0) {
                str6 = null;
            }
            eventManager.sendTrinityEvent(actionType, customCell, page, str, str2, str3, str4, str5, str6, l11);
        }

        public static /* synthetic */ void sendEvent$default(EventManager eventManager, ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, String str, EventEntity.Form form, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
            }
            if ((i11 & 2) != 0) {
                obj = null;
            }
            eventManager.sendEvent(actionType, obj, (i11 & 4) != 0 ? null : properties, (i11 & 8) != 0 ? null : customCell, (i11 & 16) != 0 ? null : widget, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : form, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : posting, (i11 & 256) != 0 ? null : filter, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : sale, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : review, (i11 & 2048) != 0 ? null : num, (i11 & 4096) != 0 ? null : num2);
        }

        public static /* synthetic */ void sendTrinityEvent$default(EventManager eventManager, ActionType actionType, Cell.CustomCell customCell, String str, String str2, String str3, String str4, String str5, String str6, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendTrinityEvent");
            }
            if ((i11 & 2) != 0) {
                customCell = null;
            }
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 16) != 0) {
                str3 = null;
            }
            if ((i11 & 32) != 0) {
                str4 = null;
            }
            if ((i11 & 64) != 0) {
                str5 = null;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str6 = null;
            }
            eventManager.sendTrinityEvent(actionType, customCell, str, str2, str3, str4, str5, str6, l11);
        }
    }

    void clearAllEvents();

    void forceSendEvents();

    void sendCustomEvent(String uuid, Map<String, ? extends Object> custom);

    @InterfaceC3999a
    void sendEvent(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell custom, EventEntity.Widget widget, String uuid, EventEntity.Form form, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer discountRequestId, Integer advertisementCampaignId);

    @InterfaceC3999a
    /* synthetic */ void sendEvent(ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell custom, EventEntity.Widget widget, Page page, String uuid, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer discountRequestId, Integer advertisementCampaignId);

    void sendEvent(@NotNull ActionType actionType, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell custom, EventEntity.Widget widget, Page page, String uuid, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer discountRequestId, Integer advertisementCampaignId, EventEntity.Courier courier);

    void sendPageView(@NotNull Page page);

    @InterfaceC3999a
    void sendTrinityEvent(@NotNull ActionType actionType, Cell.CustomCell custom, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, String uuid, Long pageTimestamp);

    @InterfaceC3999a
    void sendTrinityEvent(@NotNull ActionType actionType, Cell.CustomCell custom, Page page, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, String uuid, Long pageTimestamp);

    void sendTrinityEvent(@NotNull ActionType actionType, Cell.CustomCell custom, Page page, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, String uuid, Long pageTimestamp, boolean isFastEvent);

    @InterfaceC3999a
    void setPageView(@NotNull Page page);
}
