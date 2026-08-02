package ru.ozon.tracker.sendEvent;

import Qj0.u0;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import fi0.s;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.hardwareinfo.BuildInfoManager;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.db.entities.EventType;
import ru.ozon.tracker.db.entities.UserData;
import ru.ozon.tracker.model.CustomEventEntity;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityAttributes;
import ru.ozon.tracker.model.TrinityEventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.model.TrinityPage;
import ru.ozon.tracker.model.TrinityUser;
import ru.ozon.tracker.sendEvent.Cell;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJÎ\u0001\u00103\u001a\u0002022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010-2\b\u00101\u001a\u0004\u0018\u000100H\u0083@¢\u0006\u0004\b3\u00104JF\u00107\u001a\u0002062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u000105H\u0083@¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\u000e2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u000105H\u0003¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\u000e2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u000105H\u0003¢\u0006\u0004\b;\u0010:J\u000f\u0010=\u001a\u00020<H\u0003¢\u0006\u0004\b=\u0010>J(\u0010B\u001a\u00020A2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000eH\u0083@¢\u0006\u0004\bB\u0010CJ\u0089\u0001\u0010L\u001a\u00020K2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010D\u001a\u0004\u0018\u00010\u001f2\b\u0010E\u001a\u0004\u0018\u00010\u000e2\b\u0010F\u001a\u0004\u0018\u00010\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u000e2\b\u0010H\u001a\u0004\u0018\u00010\u000e2\b\u0010I\u001a\u0004\u0018\u00010\u000e2\b\u0010J\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000eH\u0003¢\u0006\u0004\bO\u0010PJÖ\u0001\u0010S\u001a\u00020R2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010-2\n\b\u0002\u00101\u001a\u0004\u0018\u000100H\u0087@¢\u0006\u0004\bS\u0010TJ4\u0010U\u001a\u00020R2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u000105H\u0087@¢\u0006\u0004\bU\u0010VJ\u008d\u0001\u0010X\u001a\u00020R2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010WH\u0007¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010]R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010^R \u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lru/ozon/tracker/sendEvent/EventMapper;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "Lfi0/s;", "attrsManager", "Lru/ozon/android/hardwareinfo/DeviceInfoManager;", "deviceInfoManager", "Lru/ozon/android/hardwareinfo/BuildInfoManager;", "buildInfoManager", "LQj0/u0;", "userDataController", "<init>", "(Lcom/squareup/moshi/Moshi;Lfi0/s;Lru/ozon/android/hardwareinfo/DeviceInfoManager;Lru/ozon/android/hardwareinfo/BuildInfoManager;LQj0/u0;)V", "", "version", "id", "Lorg/joda/time/DateTime;", "timestamp", "timestampMs", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "trackCampaignUuid", "Lru/ozon/tracker/model/EventEntity$Obj;", "obj", "Lru/ozon/tracker/model/EventEntity$Properties;", "properties", "Lru/ozon/tracker/sendEvent/Cell$CustomCell;", "custom", "Lru/ozon/tracker/model/EventEntity$Widget;", "widget", "Lru/ozon/tracker/sendEvent/Page;", "page", "Lru/ozon/tracker/model/EventEntity$Form;", DynamicElementDTO.FORM, "Lru/ozon/tracker/model/EventEntity$EventError;", "eventError", "Lru/ozon/tracker/model/EventEntity$Posting;", "posting", "Lru/ozon/tracker/model/EventEntity$Filter;", "filter", "Lru/ozon/tracker/model/EventEntity$Sale;", "sale", "Lru/ozon/tracker/model/EventEntity$Review;", "review", "", "discountRequestId", "advertisementCampaignId", "Lru/ozon/tracker/model/EventEntity$Courier;", "courier", "Lru/ozon/tracker/model/EventEntity;", "createEventBody", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lru/ozon/tracker/sendEvent/ActionType;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/sendEvent/Page;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/tracker/model/EventEntity$Courier;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lru/ozon/tracker/model/CustomEventEntity;", "createCustomEventBody", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "extractPageId", "(Ljava/util/Map;)Ljava/lang/String;", "extractAchievementId", "Lru/ozon/tracker/model/EventEntity$Attributes;", "getAttributes", "()Lru/ozon/tracker/model/EventEntity$Attributes;", "marketplaceId", "achievementId", "Lru/ozon/tracker/model/EventEntity$User;", "getUser", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "composerPage", "pageToken", "widgetToken", "sliceToken", "cellToken", "userToken", "pageTimestamp", "Lru/ozon/tracker/model/TrinityEventEntity;", "createTrinityEventBody", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lru/ozon/tracker/sendEvent/ActionType;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)Lru/ozon/tracker/model/TrinityEventEntity;", "pageViewId", "getNumber", "(Ljava/lang/String;)Ljava/lang/String;", "uuid", "Lru/ozon/tracker/db/entities/DbEvent;", "createEventEntity", "(Ljava/lang/String;Lru/ozon/tracker/sendEvent/ActionType;Ljava/lang/String;Lru/ozon/tracker/model/EventEntity$Obj;Lru/ozon/tracker/model/EventEntity$Properties;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/model/EventEntity$Widget;Lru/ozon/tracker/sendEvent/Page;Lru/ozon/tracker/model/EventEntity$Form;Lru/ozon/tracker/model/EventEntity$EventError;Lru/ozon/tracker/model/EventEntity$Posting;Lru/ozon/tracker/model/EventEntity$Filter;Lru/ozon/tracker/model/EventEntity$Sale;Lru/ozon/tracker/model/EventEntity$Review;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/tracker/model/EventEntity$Courier;Lkotlin/coroutines/d;)Ljava/lang/Object;", "createCustomEventEntity", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "createTrinityEvent", "(Ljava/lang/String;Lru/ozon/tracker/sendEvent/ActionType;Ljava/lang/String;Lru/ozon/tracker/sendEvent/Cell$CustomCell;Lru/ozon/tracker/sendEvent/Page;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lru/ozon/tracker/db/entities/DbEvent;", "Lcom/squareup/moshi/Moshi;", "Lfi0/s;", "Lru/ozon/android/hardwareinfo/DeviceInfoManager;", "Lru/ozon/android/hardwareinfo/BuildInfoManager;", "LQj0/u0;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicLong;", "eventCounters", "Ljava/util/concurrent/ConcurrentHashMap;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventMapper {

    @NotNull
    private final s attrsManager;

    @NotNull
    private final BuildInfoManager buildInfoManager;

    @NotNull
    private final DeviceInfoManager deviceInfoManager;

    @NotNull
    private final ConcurrentHashMap<String, AtomicLong> eventCounters;

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final u0 userDataController;

    public EventMapper(@NotNull Moshi moshi, @NotNull s attrsManager, @NotNull DeviceInfoManager deviceInfoManager, @NotNull BuildInfoManager buildInfoManager, @NotNull u0 userDataController) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(attrsManager, "attrsManager");
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        Intrinsics.checkNotNullParameter(buildInfoManager, "buildInfoManager");
        Intrinsics.checkNotNullParameter(userDataController, "userDataController");
        this.moshi = moshi;
        this.attrsManager = attrsManager;
        this.deviceInfoManager = deviceInfoManager;
        this.buildInfoManager = buildInfoManager;
        this.userDataController = userDataController;
        this.eventCounters = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCustomEventBody(String str, String str2, DateTime dateTime, DateTime dateTime2, Map<String, ? extends Object> map, d<? super CustomEventEntity> dVar) {
        EventMapper$createCustomEventBody$1 eventMapper$createCustomEventBody$1;
        int i11;
        String str3;
        Map<String, ? extends Object> map2;
        EventEntity.Attributes attributes;
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        String str5;
        if (dVar instanceof EventMapper$createCustomEventBody$1) {
            eventMapper$createCustomEventBody$1 = (EventMapper$createCustomEventBody$1) dVar;
            int i12 = eventMapper$createCustomEventBody$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventMapper$createCustomEventBody$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                EventMapper$createCustomEventBody$1 eventMapper$createCustomEventBody$12 = eventMapper$createCustomEventBody$1;
                Object obj = eventMapper$createCustomEventBody$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = eventMapper$createCustomEventBody$12.label;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String extractPageId = extractPageId(map);
                    String extractAchievementId = extractAchievementId(map);
                    String number = getNumber(extractPageId);
                    EventEntity.Attributes attributes2 = getAttributes();
                    eventMapper$createCustomEventBody$12.L$0 = str;
                    str3 = str2;
                    eventMapper$createCustomEventBody$12.L$1 = str3;
                    eventMapper$createCustomEventBody$12.L$2 = dateTime;
                    eventMapper$createCustomEventBody$12.L$3 = dateTime2;
                    eventMapper$createCustomEventBody$12.L$4 = map;
                    eventMapper$createCustomEventBody$12.L$5 = number;
                    eventMapper$createCustomEventBody$12.L$6 = attributes2;
                    eventMapper$createCustomEventBody$12.label = 1;
                    obj = getUser$default(this, null, extractAchievementId, eventMapper$createCustomEventBody$12, 1, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                    map2 = map;
                    attributes = attributes2;
                    str4 = str;
                    dateTime3 = dateTime2;
                    dateTime4 = dateTime;
                    str5 = number;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    EventEntity.Attributes attributes3 = (EventEntity.Attributes) eventMapper$createCustomEventBody$12.L$6;
                    String str6 = (String) eventMapper$createCustomEventBody$12.L$5;
                    Map<String, ? extends Object> map3 = (Map) eventMapper$createCustomEventBody$12.L$4;
                    DateTime dateTime5 = (DateTime) eventMapper$createCustomEventBody$12.L$3;
                    DateTime dateTime6 = (DateTime) eventMapper$createCustomEventBody$12.L$2;
                    String str7 = (String) eventMapper$createCustomEventBody$12.L$1;
                    String str8 = (String) eventMapper$createCustomEventBody$12.L$0;
                    Sc.s.b(obj);
                    attributes = attributes3;
                    str4 = str8;
                    str5 = str6;
                    map2 = map3;
                    dateTime3 = dateTime5;
                    dateTime4 = dateTime6;
                    str3 = str7;
                }
                return new CustomEventEntity(str3, str5, dateTime4, dateTime3, str4, attributes, (EventEntity.User) obj, map2);
            }
        }
        eventMapper$createCustomEventBody$1 = new EventMapper$createCustomEventBody$1(this, dVar);
        EventMapper$createCustomEventBody$1 eventMapper$createCustomEventBody$122 = eventMapper$createCustomEventBody$1;
        Object obj2 = eventMapper$createCustomEventBody$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = eventMapper$createCustomEventBody$122.label;
        if (i11 != 0) {
        }
        return new CustomEventEntity(str3, str5, dateTime4, dateTime3, str4, attributes, (EventEntity.User) obj2, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object createCustomEventEntity$default(EventMapper eventMapper, String str, Map map, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            map = null;
        }
        return eventMapper.createCustomEventEntity(str, map, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createEventBody(String str, String str2, DateTime dateTime, DateTime dateTime2, ActionType actionType, String str3, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, EventEntity.Courier courier, d<? super EventEntity> dVar) {
        EventMapper$createEventBody$1 eventMapper$createEventBody$1;
        int i11;
        String str4;
        Object user$default;
        EventEntity.Obj obj2;
        EventEntity.Properties properties2;
        Cell.CustomCell customCell2;
        EventEntity.Widget widget2;
        EventEntity.Form form2;
        EventEntity.EventError eventError2;
        EventEntity.Posting posting2;
        EventEntity.Filter filter2;
        EventEntity.Sale sale2;
        EventEntity.Review review2;
        Integer num3;
        Integer num4;
        EventEntity.Courier courier2;
        String str5;
        EventEntity.Attributes attributes;
        EventEntity.Page page2;
        DateTime dateTime3;
        String str6;
        String str7;
        DateTime dateTime4;
        String str8;
        Page previousPage;
        Page previousPage2;
        Page previousPage3;
        if (dVar instanceof EventMapper$createEventBody$1) {
            eventMapper$createEventBody$1 = (EventMapper$createEventBody$1) dVar;
            int i12 = eventMapper$createEventBody$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventMapper$createEventBody$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                EventMapper$createEventBody$1 eventMapper$createEventBody$12 = eventMapper$createEventBody$1;
                Object obj3 = eventMapper$createEventBody$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = eventMapper$createEventBody$12.label;
                if (i11 != 0) {
                    Sc.s.b(obj3);
                    String pageId = page != null ? page.getPageId() : null;
                    if (pageId == null) {
                        pageId = "";
                    }
                    String number = getNumber(pageId);
                    String type = actionType.getType();
                    EventEntity.Attributes attributes2 = getAttributes();
                    String name = page != null ? page.getName() : null;
                    String name2 = (page == null || (previousPage3 = page.getPreviousPage()) == null) ? null : previousPage3.getName();
                    String url = page != null ? page.getUrl() : null;
                    String url2 = (page == null || (previousPage2 = page.getPreviousPage()) == null) ? null : previousPage2.getUrl();
                    String nextUrl = page != null ? page.getNextUrl() : null;
                    String pageId2 = page != null ? page.getPageId() : null;
                    String pageId3 = (page == null || (previousPage = page.getPreviousPage()) == null) ? null : previousPage.getPageId();
                    EventEntity.Page page3 = new EventEntity.Page(name, name2, url, url2, nextUrl, page != null ? page.getRuleId() : null, page != null ? page.getLayoutId() : null, page != null ? page.getLayoutVersion() : null, pageId2, pageId3, page != null ? page.getComposerPageType() : null, page != null ? page.getCategoryId() : null, page != null ? page.getTagId() : null, page != null ? page.getSku() : null, page != null ? page.getHighlightId() : null, page != null ? page.getSellerId() : null, page != null ? page.getBrandId() : null, page != null ? page.getMiniapp() : null, page != null ? page.getTeensMode() : null);
                    String marketplaceId = page != null ? page.getMarketplaceId() : null;
                    eventMapper$createEventBody$12.L$0 = str;
                    str4 = str2;
                    eventMapper$createEventBody$12.L$1 = str4;
                    eventMapper$createEventBody$12.L$2 = dateTime;
                    eventMapper$createEventBody$12.L$3 = dateTime2;
                    eventMapper$createEventBody$12.L$4 = str3;
                    eventMapper$createEventBody$12.L$5 = obj;
                    eventMapper$createEventBody$12.L$6 = properties;
                    eventMapper$createEventBody$12.L$7 = customCell;
                    eventMapper$createEventBody$12.L$8 = widget;
                    eventMapper$createEventBody$12.L$9 = form;
                    eventMapper$createEventBody$12.L$10 = eventError;
                    eventMapper$createEventBody$12.L$11 = posting;
                    eventMapper$createEventBody$12.L$12 = filter;
                    eventMapper$createEventBody$12.L$13 = sale;
                    eventMapper$createEventBody$12.L$14 = review;
                    eventMapper$createEventBody$12.L$15 = num;
                    eventMapper$createEventBody$12.L$16 = num2;
                    eventMapper$createEventBody$12.L$17 = courier;
                    eventMapper$createEventBody$12.L$18 = number;
                    eventMapper$createEventBody$12.L$19 = type;
                    eventMapper$createEventBody$12.L$20 = attributes2;
                    eventMapper$createEventBody$12.L$21 = page3;
                    eventMapper$createEventBody$12.label = 1;
                    user$default = getUser$default(this, marketplaceId, null, eventMapper$createEventBody$12, 2, null);
                    if (user$default == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    properties2 = properties;
                    customCell2 = customCell;
                    widget2 = widget;
                    form2 = form;
                    eventError2 = eventError;
                    posting2 = posting;
                    filter2 = filter;
                    sale2 = sale;
                    review2 = review;
                    num3 = num;
                    num4 = num2;
                    courier2 = courier;
                    str5 = type;
                    attributes = attributes2;
                    page2 = page3;
                    dateTime3 = dateTime2;
                    str6 = str3;
                    str7 = str;
                    dateTime4 = dateTime;
                    str8 = number;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    EventEntity.Page page4 = (EventEntity.Page) eventMapper$createEventBody$12.L$21;
                    EventEntity.Attributes attributes3 = (EventEntity.Attributes) eventMapper$createEventBody$12.L$20;
                    String str9 = (String) eventMapper$createEventBody$12.L$19;
                    String str10 = (String) eventMapper$createEventBody$12.L$18;
                    EventEntity.Courier courier3 = (EventEntity.Courier) eventMapper$createEventBody$12.L$17;
                    Integer num5 = (Integer) eventMapper$createEventBody$12.L$16;
                    Integer num6 = (Integer) eventMapper$createEventBody$12.L$15;
                    EventEntity.Review review3 = (EventEntity.Review) eventMapper$createEventBody$12.L$14;
                    EventEntity.Sale sale3 = (EventEntity.Sale) eventMapper$createEventBody$12.L$13;
                    EventEntity.Filter filter3 = (EventEntity.Filter) eventMapper$createEventBody$12.L$12;
                    EventEntity.Posting posting3 = (EventEntity.Posting) eventMapper$createEventBody$12.L$11;
                    EventEntity.EventError eventError3 = (EventEntity.EventError) eventMapper$createEventBody$12.L$10;
                    EventEntity.Form form3 = (EventEntity.Form) eventMapper$createEventBody$12.L$9;
                    EventEntity.Widget widget3 = (EventEntity.Widget) eventMapper$createEventBody$12.L$8;
                    Cell.CustomCell customCell3 = (Cell.CustomCell) eventMapper$createEventBody$12.L$7;
                    EventEntity.Properties properties3 = (EventEntity.Properties) eventMapper$createEventBody$12.L$6;
                    EventEntity.Obj obj4 = (EventEntity.Obj) eventMapper$createEventBody$12.L$5;
                    String str11 = (String) eventMapper$createEventBody$12.L$4;
                    DateTime dateTime5 = (DateTime) eventMapper$createEventBody$12.L$3;
                    DateTime dateTime6 = (DateTime) eventMapper$createEventBody$12.L$2;
                    String str12 = (String) eventMapper$createEventBody$12.L$1;
                    String str13 = (String) eventMapper$createEventBody$12.L$0;
                    Sc.s.b(obj3);
                    widget2 = widget3;
                    customCell2 = customCell3;
                    properties2 = properties3;
                    obj2 = obj4;
                    str6 = str11;
                    dateTime3 = dateTime5;
                    page2 = page4;
                    attributes = attributes3;
                    str5 = str9;
                    courier2 = courier3;
                    num4 = num5;
                    num3 = num6;
                    review2 = review3;
                    sale2 = sale3;
                    filter2 = filter3;
                    posting2 = posting3;
                    eventError2 = eventError3;
                    form2 = form3;
                    dateTime4 = dateTime6;
                    str4 = str12;
                    str7 = str13;
                    str8 = str10;
                    user$default = obj3;
                }
                EventEntity eventEntity = new EventEntity(str4, str8, dateTime4, str7, str5, attributes, (EventEntity.User) user$default, page2, obj2, properties2, widget2, form2, eventError2, posting2, customCell2, filter2, sale2, review2, num3, num4, dateTime3, courier2);
                eventEntity.setTrackCampaignUuid(str6);
                return eventEntity;
            }
        }
        eventMapper$createEventBody$1 = new EventMapper$createEventBody$1(this, dVar);
        EventMapper$createEventBody$1 eventMapper$createEventBody$122 = eventMapper$createEventBody$1;
        Object obj32 = eventMapper$createEventBody$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = eventMapper$createEventBody$122.label;
        if (i11 != 0) {
        }
        EventEntity eventEntity2 = new EventEntity(str4, str8, dateTime4, str7, str5, attributes, (EventEntity.User) user$default, page2, obj2, properties2, widget2, form2, eventError2, posting2, customCell2, filter2, sale2, review2, num3, num4, dateTime3, courier2);
        eventEntity2.setTrackCampaignUuid(str6);
        return eventEntity2;
    }

    public static /* synthetic */ DbEvent createTrinityEvent$default(EventMapper eventMapper, String str, ActionType actionType, String str2, Cell.CustomCell customCell, Page page, String str3, String str4, String str5, String str6, String str7, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            customCell = null;
        }
        if ((i11 & 16) != 0) {
            page = null;
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
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str7 = null;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            l11 = null;
        }
        return eventMapper.createTrinityEvent(str, actionType, str2, customCell, page, str3, str4, str5, str6, str7, l11);
    }

    private final TrinityEventEntity createTrinityEventBody(String id2, DateTime timestamp, DateTime timestampMs, ActionType actionType, String trackCampaignUuid, Cell.CustomCell custom, Page composerPage, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, DateTime pageTimestamp) {
        Page previousPage;
        Page previousPage2;
        Page previousPage3;
        String pageId = composerPage != null ? composerPage.getPageId() : null;
        if (pageId == null) {
            pageId = "";
        }
        return new TrinityEventEntity(id2, getNumber(pageId), timestamp, timestampMs, actionType.getType(), trackCampaignUuid, new TrinityAttributes(this.attrsManager.f(), this.buildInfoManager.getAppVersion(), this.deviceInfoManager.getScreenResolution().e().intValue(), this.deviceInfoManager.getScreenResolution().f().intValue(), this.attrsManager.i(), this.buildInfoManager.getBuildNumber(), this.attrsManager.g(), this.attrsManager.b(), this.attrsManager.h(), this.attrsManager.e(), this.deviceInfoManager.getOsVersion(), this.deviceInfoManager.getDeviceModel(), this.attrsManager.c(), this.deviceInfoManager.getDeviceType().getType(), this.attrsManager.a(), this.deviceInfoManager.getScreenDensity(), "TrackerSDK_Android v9.1.4"), new TrinityPage(composerPage != null ? composerPage.getName() : null, (composerPage == null || (previousPage3 = composerPage.getPreviousPage()) == null) ? null : previousPage3.getName(), composerPage != null ? composerPage.getUrl() : null, (composerPage == null || (previousPage2 = composerPage.getPreviousPage()) == null) ? null : previousPage2.getUrl(), composerPage != null ? composerPage.getNextUrl() : null, composerPage != null ? composerPage.getPageId() : null, (composerPage == null || (previousPage = composerPage.getPreviousPage()) == null) ? null : previousPage.getPageId(), composerPage != null ? composerPage.getComposerPageType() : null, composerPage != null ? composerPage.getCategoryId() : null, null, null, null, null, null, 15872, null), pageToken, custom, widgetToken, sliceToken, cellToken, userToken, new TrinityUser(this.attrsManager.e(), this.attrsManager.c(), Integer.valueOf(this.buildInfoManager.getBuildNumber()), this.attrsManager.b(), this.attrsManager.h()), pageTimestamp);
    }

    private final String extractAchievementId(Map<String, ? extends Object> custom) {
        Object obj = custom != null ? custom.get("user") : null;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("achievement_id") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        return str == null ? "" : str;
    }

    private final String extractPageId(Map<String, ? extends Object> custom) {
        Object obj = custom != null ? custom.get("page") : null;
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("pageId") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        return str == null ? "" : str;
    }

    private final EventEntity.Attributes getAttributes() {
        Namespace f7 = this.attrsManager.f();
        String appVersion = this.buildInfoManager.getAppVersion();
        int buildNumber = this.buildInfoManager.getBuildNumber();
        int intValue = this.deviceInfoManager.getScreenResolution().e().intValue();
        int intValue2 = this.deviceInfoManager.getScreenResolution().f().intValue();
        float screenDensity = this.deviceInfoManager.getScreenDensity();
        return new EventEntity.Attributes(f7, appVersion, buildNumber, intValue, intValue2, this.attrsManager.i(), null, this.deviceInfoManager.getDeviceType().getType(), this.deviceInfoManager.getOsVersion(), this.deviceInfoManager.getDeviceModel(), this.deviceInfoManager.getDeviceModel(), this.attrsManager.g(), this.attrsManager.a(), Float.valueOf(screenDensity), "TrackerSDK_Android v9.1.4", 64, null);
    }

    private final String getNumber(String pageViewId) {
        AtomicLong atomicLong = new AtomicLong(1L);
        AtomicLong putIfAbsent = this.eventCounters.putIfAbsent(pageViewId, atomicLong);
        if (putIfAbsent != null) {
            atomicLong = putIfAbsent;
        }
        return String.valueOf(atomicLong.getAndIncrement());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUser(String str, String str2, d<? super EventEntity.User> dVar) {
        EventMapper$getUser$1 eventMapper$getUser$1;
        int i11;
        String str3;
        EventMapper eventMapper;
        String str4;
        String str5;
        if (dVar instanceof EventMapper$getUser$1) {
            eventMapper$getUser$1 = (EventMapper$getUser$1) dVar;
            int i12 = eventMapper$getUser$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventMapper$getUser$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventMapper$getUser$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = eventMapper$getUser$1.label;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    u0 u0Var = this.userDataController;
                    eventMapper$getUser$1.L$0 = this;
                    str3 = str;
                    eventMapper$getUser$1.L$1 = str3;
                    eventMapper$getUser$1.L$2 = str2;
                    eventMapper$getUser$1.label = 1;
                    obj = u0Var.e(eventMapper$getUser$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    eventMapper = this;
                    str4 = str2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (String) eventMapper$getUser$1.L$2;
                    str3 = (String) eventMapper$getUser$1.L$1;
                    eventMapper = (EventMapper) eventMapper$getUser$1.L$0;
                    Sc.s.b(obj);
                }
                String str6 = str3;
                UserData userData = (UserData) obj;
                int buildNumber = eventMapper.buildInfoManager.getBuildNumber();
                String e11 = eventMapper.attrsManager.e();
                String b11 = eventMapper.attrsManager.b();
                String c11 = eventMapper.attrsManager.c();
                String h11 = eventMapper.attrsManager.h();
                String userId = userData.getUserId();
                String str7 = userId.length() != 0 ? null : userId;
                int abGroup = userData.getAbGroup();
                Integer companyId = userData.getCompanyId();
                String userRoles = userData.getUserRoles();
                if (str4 == null) {
                    if (str4.length() == 0) {
                        str4 = null;
                    }
                    str5 = str4;
                } else {
                    str5 = null;
                }
                return new EventEntity.User(new Integer(abGroup), null, str7, companyId, new Integer(buildNumber), e11, b11, c11, h11, userRoles, str6, str5, 2, null);
            }
        }
        eventMapper$getUser$1 = new EventMapper$getUser$1(this, dVar);
        Object obj2 = eventMapper$getUser$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = eventMapper$getUser$1.label;
        if (i11 != 0) {
        }
        String str62 = str3;
        UserData userData2 = (UserData) obj2;
        int buildNumber2 = eventMapper.buildInfoManager.getBuildNumber();
        String e112 = eventMapper.attrsManager.e();
        String b112 = eventMapper.attrsManager.b();
        String c112 = eventMapper.attrsManager.c();
        String h112 = eventMapper.attrsManager.h();
        String userId2 = userData2.getUserId();
        if (userId2.length() != 0) {
        }
        int abGroup2 = userData2.getAbGroup();
        Integer companyId2 = userData2.getCompanyId();
        String userRoles2 = userData2.getUserRoles();
        if (str4 == null) {
        }
        return new EventEntity.User(new Integer(abGroup2), null, str7, companyId2, new Integer(buildNumber2), e112, b112, c112, h112, userRoles2, str62, str5, 2, null);
    }

    static /* synthetic */ Object getUser$default(EventMapper eventMapper, String str, String str2, d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return eventMapper.getUser(str, str2, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCustomEventEntity(String str, Map<String, ? extends Object> map, @NotNull d<? super DbEvent> dVar) {
        EventMapper$createCustomEventEntity$1 eventMapper$createCustomEventEntity$1;
        int i11;
        String uuid;
        DateTime dateTime;
        EventMapper eventMapper;
        String str2;
        EventType eventType;
        String str3;
        if (dVar instanceof EventMapper$createCustomEventEntity$1) {
            eventMapper$createCustomEventEntity$1 = (EventMapper$createCustomEventEntity$1) dVar;
            int i12 = eventMapper$createCustomEventEntity$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventMapper$createCustomEventEntity$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                EventMapper$createCustomEventEntity$1 eventMapper$createCustomEventEntity$12 = eventMapper$createCustomEventEntity$1;
                Object obj = eventMapper$createCustomEventEntity$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = eventMapper$createCustomEventEntity$12.label;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    String str4 = str == null ? uuid : str;
                    dateTime = new DateTime();
                    EventType eventType2 = EventType.USUAL;
                    eventMapper$createCustomEventEntity$12.L$0 = this;
                    eventMapper$createCustomEventEntity$12.L$1 = uuid;
                    eventMapper$createCustomEventEntity$12.L$2 = str4;
                    eventMapper$createCustomEventEntity$12.L$3 = "2";
                    eventMapper$createCustomEventEntity$12.L$4 = dateTime;
                    eventMapper$createCustomEventEntity$12.L$5 = eventType2;
                    eventMapper$createCustomEventEntity$12.label = 1;
                    Object createCustomEventBody = createCustomEventBody("2", str4, dateTime, dateTime, map, eventMapper$createCustomEventEntity$12);
                    if (createCustomEventBody == aVar) {
                        return aVar;
                    }
                    eventMapper = this;
                    str2 = "2";
                    obj = createCustomEventBody;
                    eventType = eventType2;
                    str3 = str4;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    EventType eventType3 = (EventType) eventMapper$createCustomEventEntity$12.L$5;
                    dateTime = (DateTime) eventMapper$createCustomEventEntity$12.L$4;
                    String str5 = (String) eventMapper$createCustomEventEntity$12.L$3;
                    String str6 = (String) eventMapper$createCustomEventEntity$12.L$2;
                    String str7 = (String) eventMapper$createCustomEventEntity$12.L$1;
                    EventMapper eventMapper2 = (EventMapper) eventMapper$createCustomEventEntity$12.L$0;
                    Sc.s.b(obj);
                    eventType = eventType3;
                    str2 = str5;
                    str3 = str6;
                    eventMapper = eventMapper2;
                    uuid = str7;
                }
                DateTime dateTime2 = dateTime;
                String json = eventMapper.moshi.d(D.e(Map.class, String.class, Object.class)).toJson(((CustomEventEntity) obj).getEventMap());
                Intrinsics.f(dateTime2);
                Intrinsics.f(json);
                return new DbEvent(uuid, str3, str2, json, eventType, null, dateTime2, 32, null);
            }
        }
        eventMapper$createCustomEventEntity$1 = new EventMapper$createCustomEventEntity$1(this, dVar);
        EventMapper$createCustomEventEntity$1 eventMapper$createCustomEventEntity$122 = eventMapper$createCustomEventEntity$1;
        Object obj2 = eventMapper$createCustomEventEntity$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = eventMapper$createCustomEventEntity$122.label;
        if (i11 != 0) {
        }
        DateTime dateTime22 = dateTime;
        String json2 = eventMapper.moshi.d(D.e(Map.class, String.class, Object.class)).toJson(((CustomEventEntity) obj2).getEventMap());
        Intrinsics.f(dateTime22);
        Intrinsics.f(json2);
        return new DbEvent(uuid, str3, str2, json2, eventType, null, dateTime22, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createEventEntity(String str, @NotNull ActionType actionType, String str2, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, EventEntity.Courier courier, @NotNull d<? super DbEvent> dVar) {
        EventMapper$createEventEntity$1 eventMapper$createEventEntity$1;
        int i11;
        String str3;
        String str4;
        JsonAdapter jsonAdapter;
        String str5;
        DateTime dateTime;
        EventType eventType;
        if (dVar instanceof EventMapper$createEventEntity$1) {
            eventMapper$createEventEntity$1 = (EventMapper$createEventEntity$1) dVar;
            int i12 = eventMapper$createEventEntity$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventMapper$createEventEntity$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = eventMapper$createEventEntity$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = eventMapper$createEventEntity$1.label;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    String str6 = str == null ? uuid : str;
                    DateTime dateTime2 = new DateTime();
                    EventType eventType2 = EventType.USUAL;
                    JsonAdapter c11 = this.moshi.c(EventEntity.class);
                    eventMapper$createEventEntity$1.L$0 = uuid;
                    eventMapper$createEventEntity$1.L$1 = str6;
                    eventMapper$createEventEntity$1.L$2 = "2";
                    eventMapper$createEventEntity$1.L$3 = dateTime2;
                    eventMapper$createEventEntity$1.L$4 = eventType2;
                    eventMapper$createEventEntity$1.L$5 = c11;
                    eventMapper$createEventEntity$1.label = 1;
                    String str7 = str6;
                    Object createEventBody = createEventBody("2", str7, dateTime2, dateTime2, actionType, str2, obj, properties, customCell, widget, page, form, eventError, posting, filter, sale, review, num, num2, courier, eventMapper$createEventEntity$1);
                    if (createEventBody == aVar) {
                        return aVar;
                    }
                    str3 = "2";
                    str4 = str7;
                    obj2 = createEventBody;
                    jsonAdapter = c11;
                    str5 = uuid;
                    dateTime = dateTime2;
                    eventType = eventType2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jsonAdapter = (JsonAdapter) eventMapper$createEventEntity$1.L$5;
                    eventType = (EventType) eventMapper$createEventEntity$1.L$4;
                    dateTime = (DateTime) eventMapper$createEventEntity$1.L$3;
                    str3 = (String) eventMapper$createEventEntity$1.L$2;
                    str4 = (String) eventMapper$createEventEntity$1.L$1;
                    str5 = (String) eventMapper$createEventEntity$1.L$0;
                    Sc.s.b(obj2);
                }
                String json = jsonAdapter.toJson(obj2);
                Intrinsics.f(dateTime);
                Intrinsics.f(json);
                return new DbEvent(str5, str4, str3, json, eventType, null, dateTime, 32, null);
            }
        }
        eventMapper$createEventEntity$1 = new EventMapper$createEventEntity$1(this, dVar);
        Object obj22 = eventMapper$createEventEntity$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = eventMapper$createEventEntity$1.label;
        if (i11 != 0) {
        }
        String json2 = jsonAdapter.toJson(obj22);
        Intrinsics.f(dateTime);
        Intrinsics.f(json2);
        return new DbEvent(str5, str4, str3, json2, eventType, null, dateTime, 32, null);
    }

    @NotNull
    public final DbEvent createTrinityEvent(String uuid, @NotNull ActionType actionType, String trackCampaignUuid, Cell.CustomCell custom, Page composerPage, String pageToken, String widgetToken, String sliceToken, String cellToken, String userToken, Long pageTimestamp) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
        String str = uuid == null ? uuid2 : uuid;
        DateTime dateTime = new DateTime();
        String json = this.moshi.c(TrinityEventEntity.class).toJson(createTrinityEventBody(str, dateTime, dateTime, actionType, trackCampaignUuid, custom, composerPage, pageToken, widgetToken, sliceToken, cellToken, userToken, pageTimestamp != null ? new DateTime(pageTimestamp.longValue()) : null));
        EventType eventType = EventType.TRINITY_EVENT;
        Intrinsics.f(json);
        return new DbEvent(uuid2, str, "2", json, eventType, null, dateTime, 32, null);
    }
}
