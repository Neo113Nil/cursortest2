package io.sentry;

import com.twilio.voice.EventGroupType;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4783m3 implements G0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback(EventGroupType.FEEDBACK_EVENT_GROUP),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    /* renamed from: io.sentry.m3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC4783m3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            return EnumC4783m3.valueOfLabel(interfaceC4809q1.M0().toLowerCase(Locale.ROOT));
        }
    }

    EnumC4783m3(String str) {
        this.itemType = str;
    }

    public static EnumC4783m3 resolve(Object obj) {
        return obj instanceof C4733c3 ? ((C4733c3) obj).C().g() == null ? Event : Feedback : obj instanceof io.sentry.protocol.B ? Transaction : obj instanceof V3 ? Session : obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    @NotNull
    public static EnumC4783m3 valueOfLabel(String str) {
        for (EnumC4783m3 enumC4783m3 : values()) {
            if (enumC4783m3.itemType.equals(str)) {
                return enumC4783m3;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.G0
    public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
        interfaceC4813r1.e(this.itemType);
    }
}
