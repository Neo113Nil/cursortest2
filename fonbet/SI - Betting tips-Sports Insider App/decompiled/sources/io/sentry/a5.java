package io.sentry;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum a5 implements c2 {
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
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    a5(String str) {
        this.itemType = str;
    }

    public static a5 resolve(Object obj) {
        return obj instanceof t4 ? ((io.sentry.protocol.i) ((t4) obj).f16456b.w(io.sentry.protocol.i.class, "feedback")) == null ? Event : Feedback : obj instanceof io.sentry.protocol.e0 ? Transaction : obj instanceof l6 ? Session : obj instanceof io.sentry.clientreport.c ? ClientReport : Attachment;
    }

    @NotNull
    public static a5 valueOfLabel(String str) {
        for (a5 a5Var : values()) {
            if (a5Var.itemType.equals(str)) {
                return a5Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.c2
    public void serialize(@NotNull b3 b3Var, @NotNull ILogger iLogger) throws IOException {
        ((l1.a) b3Var).K(this.itemType);
    }
}
