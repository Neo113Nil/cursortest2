package io.sentry;

import com.google.android.gms.common.Scopes;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum H2 implements InterfaceC7220x0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements InterfaceC7174n0<H2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final H2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return H2.valueOfLabel(interfaceC7131c1.nextString().toLowerCase(Locale.ROOT));
        }
    }

    H2(String str) {
        this.itemType = str;
    }

    public static H2 resolve(Object obj) {
        return obj instanceof C7230z2 ? ((C7230z2) obj).C().g() == null ? Event : Feedback : obj instanceof io.sentry.protocol.A ? Transaction : obj instanceof h3 ? Session : obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    @NotNull
    public static H2 valueOfLabel(String str) {
        for (H2 h22 : values()) {
            if (h22.itemType.equals(str)) {
                return h22;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC7220x0
    public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        ((C7212v0) interfaceC7135d1).p(this.itemType);
    }
}
