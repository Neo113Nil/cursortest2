package io.sentry.util;

import io.agora.rtc2.video.FaceShapeAreaOptions;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.sentry.util.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4849g {
    public static boolean a(C4733c3 c4733c3, F3 f32) {
        return o.b(f32.getSerializer(), f32.getLogger(), c4733c3) <= F3.MAX_EVENT_SIZE_BYTES;
    }

    public static C4733c3 b(C4733c3 c4733c3, io.sentry.J j10, F3 f32) {
        try {
            if (f32.isEnableEventSizeLimiting() && !a(c4733c3, f32)) {
                f32.getLogger().c(EnumC4788n3.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", c4733c3.G(), Long.valueOf(F3.MAX_EVENT_SIZE_BYTES));
                f32.getOnOversizedEvent();
                C4733c3 c10 = c(c4733c3, f32);
                if (a(c10, f32)) {
                    return c10;
                }
                C4733c3 d10 = d(c10, f32);
                if (a(d10, f32)) {
                    return d10;
                }
                f32.getLogger().c(EnumC4788n3.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", c4733c3.G());
                return d10;
            }
            return c4733c3;
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            return c4733c3;
        }
    }

    public static C4733c3 c(C4733c3 c4733c3, F3 f32) {
        List B10 = c4733c3.B();
        if (B10 != null && !B10.isEmpty()) {
            c4733c3.S(null);
            f32.getLogger().c(EnumC4788n3.DEBUG, "Removed breadcrumbs to reduce size of event %s", c4733c3.G());
        }
        return c4733c3;
    }

    public static C4733c3 d(C4733c3 c4733c3, F3 f32) {
        List p02 = c4733c3.p0();
        if (p02 != null) {
            Iterator it = p02.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.z i10 = ((io.sentry.protocol.t) it.next()).i();
                if (i10 != null) {
                    e(i10, c4733c3, f32, "Truncated exception stack frames of event %s");
                }
            }
        }
        List u02 = c4733c3.u0();
        if (u02 != null) {
            Iterator it2 = u02.iterator();
            while (it2.hasNext()) {
                io.sentry.protocol.z n10 = ((io.sentry.protocol.A) it2.next()).n();
                if (n10 != null) {
                    e(n10, c4733c3, f32, "Truncated thread stack frames for event %s");
                }
            }
        }
        return c4733c3;
    }

    public static void e(io.sentry.protocol.z zVar, C4733c3 c4733c3, F3 f32, String str) {
        List e10 = zVar.e();
        if (e10 == null || e10.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION);
        arrayList.addAll(e10.subList(0, 250));
        arrayList.addAll(e10.subList(e10.size() - 250, e10.size()));
        zVar.f(arrayList);
        f32.getLogger().c(EnumC4788n3.DEBUG, str, c4733c3.G());
    }
}
