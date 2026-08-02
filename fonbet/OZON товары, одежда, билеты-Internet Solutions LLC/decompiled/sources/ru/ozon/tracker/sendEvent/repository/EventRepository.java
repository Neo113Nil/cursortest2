package ru.ozon.tracker.sendEvent.repository;

import Ae.InterfaceC2395h;
import H3.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.json.JSONObject;
import ru.ozon.tracker.db.entities.DbEvent;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001:\u0001 J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0011\u0010\rJ\u001e\u0010\u0012\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001d\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/tracker/sendEvent/repository/EventRepository;", "", "", "Lru/ozon/tracker/db/entities/DbEvent;", "events", "Lru/ozon/tracker/sendEvent/repository/EventRepository$SendEventResult;", "sendEvents", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "", "onChangedEvents", "()LAe/h;", "getAllEvents", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getCountNotPendingEvents", "", "resetPendingStatus", "saveEvents", "event", "saveEvent", "(Lru/ozon/tracker/db/entities/DbEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "deleteEvents", "clear", "Lorg/joda/time/DateTime;", "date", "clearUnderDate", "(Lorg/joda/time/DateTime;Lkotlin/coroutines/d;)Ljava/lang/Object;", "batchSize", "getBatch", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "SendEventResult", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EventRepository {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/tracker/sendEvent/repository/EventRepository$SendEventResult;", "", "body", "", "Lorg/json/JSONObject;", "<init>", "(Ljava/util/List;)V", "getBody", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendEventResult {

        @NotNull
        private final List<JSONObject> body;

        /* JADX WARN: Multi-variable type inference failed */
        public SendEventResult(@NotNull List<? extends JSONObject> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendEventResult copy$default(SendEventResult sendEventResult, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = sendEventResult.body;
            }
            return sendEventResult.copy(list);
        }

        @NotNull
        public final List<JSONObject> component1() {
            return this.body;
        }

        @NotNull
        public final SendEventResult copy(@NotNull List<? extends JSONObject> body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return new SendEventResult(body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendEventResult) && Intrinsics.d(this.body, ((SendEventResult) other).body);
        }

        @NotNull
        public final List<JSONObject> getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("SendEventResult(body=", ")", this.body);
        }
    }

    Object clear(@NotNull d<? super Unit> dVar);

    Object clearUnderDate(@NotNull DateTime dateTime, @NotNull d<? super Unit> dVar);

    Object deleteEvents(@NotNull List<DbEvent> list, @NotNull d<? super Integer> dVar);

    Object getAllEvents(@NotNull d<? super List<DbEvent>> dVar);

    Object getBatch(int i11, @NotNull d<? super List<DbEvent>> dVar);

    Object getCountNotPendingEvents(@NotNull d<? super Long> dVar);

    @NotNull
    InterfaceC2395h<String> onChangedEvents();

    Object resetPendingStatus(@NotNull d<? super Unit> dVar);

    Object saveEvent(@NotNull DbEvent dbEvent, @NotNull d<? super Unit> dVar);

    Object saveEvents(@NotNull List<DbEvent> list, @NotNull d<? super Unit> dVar);

    Object sendEvents(@NotNull List<DbEvent> list, @NotNull d<? super SendEventResult> dVar);
}
