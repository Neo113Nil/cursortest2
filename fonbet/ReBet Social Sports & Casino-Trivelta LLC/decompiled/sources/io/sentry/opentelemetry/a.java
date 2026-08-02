package io.sentry.opentelemetry;

import io.sentry.EnumC4788n3;
import io.sentry.EnumC4877z3;
import io.sentry.F3;
import io.sentry.U0;
import io.sentry.util.C;
import io.sentry.util.s;
import io.sentry.util.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a {
    public static void a(F3 f32) {
        if (y.c()) {
            Iterator it = b(f32).iterator();
            while (it.hasNext()) {
                f32.addIgnoredSpanOrigin((String) it.next());
            }
        }
    }

    public static List b(F3 f32) {
        EnumC4877z3 openTelemetryMode = f32.getOpenTelemetryMode();
        return EnumC4877z3.OFF.equals(openTelemetryMode) ? Collections.EMPTY_LIST : C.a(openTelemetryMode);
    }

    public static void c(F3 f32, s sVar) {
        if (y.c()) {
            if (EnumC4877z3.AUTO.equals(f32.getOpenTelemetryMode())) {
                if (sVar.c("io.sentry.opentelemetry.agent.AgentMarker", U0.e())) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    f32.setOpenTelemetryMode(EnumC4877z3.AGENT);
                } else if (sVar.c("io.sentry.opentelemetry.agent.AgentlessMarker", U0.e())) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    f32.setOpenTelemetryMode(EnumC4877z3.AGENTLESS);
                } else if (sVar.c("io.sentry.opentelemetry.agent.AgentlessSpringMarker", U0.e())) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    f32.setOpenTelemetryMode(EnumC4877z3.AGENTLESS_SPRING);
                }
            }
        }
    }
}
