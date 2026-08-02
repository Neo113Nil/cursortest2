package ru.ozon.tracker.sendEvent;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$sendEvent$1", f = "EventManager.kt", l = {347, 366}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class EventManagerImpl$sendEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionType $actionType;
    final /* synthetic */ Integer $advertisementCampaignId;
    final /* synthetic */ EventEntity.Courier $courier;
    final /* synthetic */ Cell.CustomCell $custom;
    final /* synthetic */ Integer $discountRequestId;
    final /* synthetic */ EventEntity.EventError $eventError;
    final /* synthetic */ EventEntity.Filter $filter;
    final /* synthetic */ EventEntity.Form $form;
    final /* synthetic */ EventEntity.Obj $obj;
    final /* synthetic */ Page $page;
    final /* synthetic */ EventEntity.Posting $posting;
    final /* synthetic */ EventEntity.Properties $properties;
    final /* synthetic */ EventEntity.Review $review;
    final /* synthetic */ EventEntity.Sale $sale;
    final /* synthetic */ String $uuid;
    final /* synthetic */ EventEntity.Widget $widget;
    int label;
    final /* synthetic */ EventManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$sendEvent$1(EventManagerImpl eventManagerImpl, ActionType actionType, String str, EventEntity.Obj obj, EventEntity.Properties properties, Cell.CustomCell customCell, EventEntity.Widget widget, Page page, EventEntity.Form form, EventEntity.EventError eventError, EventEntity.Posting posting, EventEntity.Filter filter, EventEntity.Sale sale, EventEntity.Review review, Integer num, Integer num2, EventEntity.Courier courier, d<? super EventManagerImpl$sendEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = eventManagerImpl;
        this.$actionType = actionType;
        this.$uuid = str;
        this.$obj = obj;
        this.$properties = properties;
        this.$custom = customCell;
        this.$widget = widget;
        this.$page = page;
        this.$form = form;
        this.$eventError = eventError;
        this.$posting = posting;
        this.$filter = filter;
        this.$sale = sale;
        this.$review = review;
        this.$discountRequestId = num;
        this.$advertisementCampaignId = num2;
        this.$courier = courier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EventManagerImpl$sendEvent$1(this.this$0, this.$actionType, this.$uuid, this.$obj, this.$properties, this.$custom, this.$widget, this.$page, this.$form, this.$eventError, this.$posting, this.$filter, this.$sale, this.$review, this.$discountRequestId, this.$advertisementCampaignId, this.$courier, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        if (r3.saveEvent((ru.ozon.tracker.db.entities.DbEvent) r1, r2) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (r1 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EventMapper eventMapper;
        String takeTrackCampaignUuid;
        a aVar;
        Object createEventEntity;
        EventManagerImpl$sendEvent$1 eventManagerImpl$sendEvent$1;
        a aVar2 = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.updateTrackCampaignUuid(this.$actionType, this.$uuid);
            eventMapper = this.this$0.eventMapper;
            takeTrackCampaignUuid = this.this$0.takeTrackCampaignUuid(this.$actionType);
            String str = this.$uuid;
            ActionType actionType = this.$actionType;
            EventEntity.Obj obj2 = this.$obj;
            EventEntity.Properties properties = this.$properties;
            Cell.CustomCell customCell = this.$custom;
            EventEntity.Widget widget = this.$widget;
            Page page = this.$page;
            EventEntity.Form form = this.$form;
            EventEntity.EventError eventError = this.$eventError;
            EventEntity.Posting posting = this.$posting;
            EventEntity.Filter filter = this.$filter;
            EventEntity.Sale sale = this.$sale;
            EventEntity.Review review = this.$review;
            Integer num = this.$discountRequestId;
            Integer num2 = this.$advertisementCampaignId;
            EventEntity.Courier courier = this.$courier;
            this.label = 1;
            aVar = aVar2;
            createEventEntity = eventMapper.createEventEntity(str, actionType, takeTrackCampaignUuid, obj2, properties, customCell, widget, page, form, eventError, posting, filter, sale, review, num, num2, courier, this);
            eventManagerImpl$sendEvent$1 = this;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            eventManagerImpl$sendEvent$1 = this;
            aVar = aVar2;
            createEventEntity = obj;
        }
        EventRepository eventRepository = eventManagerImpl$sendEvent$1.this$0.getEventRepository();
        eventManagerImpl$sendEvent$1.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EventManagerImpl$sendEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
