package ru.ozon.tracker.sendEvent;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$sendTrinityEventInternal$job$1", f = "EventManager.kt", l = {509}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class EventManagerImpl$sendTrinityEventInternal$job$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionType $actionType;
    final /* synthetic */ String $cellToken;
    final /* synthetic */ Cell.CustomCell $custom;
    final /* synthetic */ Boolean $isFastEvent;
    final /* synthetic */ boolean $isFastEventConfirmed;
    final /* synthetic */ Page $page;
    final /* synthetic */ Long $pageTimestamp;
    final /* synthetic */ String $pageToken;
    final /* synthetic */ String $sliceToken;
    final /* synthetic */ String $userToken;
    final /* synthetic */ String $uuid;
    final /* synthetic */ String $widgetToken;
    int label;
    final /* synthetic */ EventManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$sendTrinityEventInternal$job$1(boolean z11, Cell.CustomCell customCell, EventManagerImpl eventManagerImpl, ActionType actionType, String str, Page page, String str2, String str3, String str4, String str5, String str6, Long l11, Boolean bool, d<? super EventManagerImpl$sendTrinityEventInternal$job$1> dVar) {
        super(2, dVar);
        this.$isFastEventConfirmed = z11;
        this.$custom = customCell;
        this.this$0 = eventManagerImpl;
        this.$actionType = actionType;
        this.$uuid = str;
        this.$page = page;
        this.$pageToken = str2;
        this.$widgetToken = str3;
        this.$sliceToken = str4;
        this.$cellToken = str5;
        this.$userToken = str6;
        this.$pageTimestamp = l11;
        this.$isFastEvent = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EventManagerImpl$sendTrinityEventInternal$job$1(this.$isFastEventConfirmed, this.$custom, this.this$0, this.$actionType, this.$uuid, this.$page, this.$pageToken, this.$widgetToken, this.$sliceToken, this.$cellToken, this.$userToken, this.$pageTimestamp, this.$isFastEvent, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Cell.CustomCell customCell;
        EventMapper eventMapper;
        String takeTrackCampaignUuid;
        Map<String, Object> data;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$isFastEventConfirmed) {
                Cell.CustomCell customCell2 = this.$custom;
                Boolean bool = this.$isFastEvent;
                Tc.d builder = new Tc.d();
                if (customCell2 != null && (data = customCell2.getData()) != null) {
                    builder.putAll(data);
                }
                builder.put("fastEvent", bool);
                Intrinsics.checkNotNullParameter(builder, "builder");
                customCell = new Cell.CustomCell(builder.u());
            } else {
                customCell = this.$custom;
            }
            Cell.CustomCell customCell3 = customCell;
            this.this$0.updateTrackCampaignUuid(this.$actionType, this.$uuid);
            eventMapper = this.this$0.eventMapper;
            String str = this.$uuid;
            ActionType actionType = this.$actionType;
            takeTrackCampaignUuid = this.this$0.takeTrackCampaignUuid(actionType);
            DbEvent createTrinityEvent = eventMapper.createTrinityEvent(str, actionType, takeTrackCampaignUuid, customCell3, this.$page, this.$pageToken, this.$widgetToken, this.$sliceToken, this.$cellToken, this.$userToken, this.$pageTimestamp);
            EventRepository eventRepository = this.this$0.getEventRepository();
            this.label = 1;
            if (eventRepository.saveEvent(createTrinityEvent, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EventManagerImpl$sendTrinityEventInternal$job$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
