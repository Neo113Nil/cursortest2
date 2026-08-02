package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.MonitoringEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/MonitoringEventKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonitoringEventKt {

    @NotNull
    public static final MonitoringEventKt INSTANCE = new MonitoringEventKt();

    private MonitoringEventKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0010J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000e¨\u0006)"}, d2 = {"Lgatewayprotocol/v1/MonitoringEventKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent$Builder;", "<init>", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent$Builder;)V", "_build", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent;", U3.i.X, "", "impressionNumber", "getImpressionNumber", "()J", "setImpressionNumber", "(J)V", "clearImpressionNumber", "", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventType;", "eventType", "getEventType", "()Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventType;", "setEventType", "(Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEventType;)V", "", "eventTypeValue", "getEventTypeValue", "()I", "setEventTypeValue", "(I)V", "clearEventType", "monitoringId", "getMonitoringId", "setMonitoringId", "clearMonitoringId", "durationMs", "getDurationMs", "setDurationMs", "clearDurationMs", "hasDurationMs", "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final MonitoringEventRequestOuterClass.MonitoringEvent.Builder _builder;

        private Dsl(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MonitoringEventRequestOuterClass.MonitoringEvent _build() {
            MonitoringEventRequestOuterClass.MonitoringEvent build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearDurationMs() {
            this._builder.clearDurationMs();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionNumber() {
            this._builder.clearImpressionNumber();
        }

        public final void clearMonitoringId() {
            this._builder.clearMonitoringId();
        }

        public final long getDurationMs() {
            return this._builder.getDurationMs();
        }

        @NotNull
        public final MonitoringEventRequestOuterClass.MonitoringEventType getEventType() {
            MonitoringEventRequestOuterClass.MonitoringEventType eventType = this._builder.getEventType();
            eventType.getClass();
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final long getImpressionNumber() {
            return this._builder.getImpressionNumber();
        }

        public final int getMonitoringId() {
            return this._builder.getMonitoringId();
        }

        public final boolean hasDurationMs() {
            return this._builder.hasDurationMs();
        }

        public final void setDurationMs(long j) {
            this._builder.setDurationMs(j);
        }

        public final void setEventType(@NotNull MonitoringEventRequestOuterClass.MonitoringEventType monitoringEventType) {
            monitoringEventType.getClass();
            this._builder.setEventType(monitoringEventType);
        }

        public final void setEventTypeValue(int i) {
            this._builder.setEventTypeValue(i);
        }

        public final void setImpressionNumber(long j) {
            this._builder.setImpressionNumber(j);
        }

        public final void setMonitoringId(int i) {
            this._builder.setMonitoringId(i);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/MonitoringEventKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/MonitoringEventKt$Dsl;", "builder", "Lgatewayprotocol/v1/MonitoringEventRequestOuterClass$MonitoringEvent$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(MonitoringEventRequestOuterClass.MonitoringEvent.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
