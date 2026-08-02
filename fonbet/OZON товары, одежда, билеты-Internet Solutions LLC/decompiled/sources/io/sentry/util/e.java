package io.sentry.util;

import androidx.recyclerview.widget.m;
import io.sentry.C7141f;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7126b0;
import io.sentry.W2;
import io.sentry.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes10.dex */
public final class e {
    private static boolean a(@NotNull C7230z2 c7230z2, @NotNull W2 w22) {
        long j11;
        InterfaceC7126b0 serializer = w22.getSerializer();
        ILogger logger = w22.getLogger();
        int i11 = k.f68587b;
        try {
            k.a aVar = new k.a();
            serializer.a(aVar, c7230z2);
            j11 = aVar.c();
        } catch (Throwable th2) {
            logger.a(I2.ERROR, "Could not calculate size of serializable", th2);
            j11 = 0;
        }
        return j11 <= W2.MAX_EVENT_SIZE_BYTES;
    }

    public static C7230z2 b(@NotNull C7230z2 c7230z2, @NotNull W2 w22) {
        try {
            if (w22.isEnableEventSizeLimiting() && !a(c7230z2, w22)) {
                w22.getLogger().c(I2.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", c7230z2.G(), Long.valueOf(W2.MAX_EVENT_SIZE_BYTES));
                w22.getOnOversizedEvent();
                List<C7141f> B11 = c7230z2.B();
                if (B11 != null && !B11.isEmpty()) {
                    c7230z2.Q(null);
                    w22.getLogger().c(I2.DEBUG, "Removed breadcrumbs to reduce size of event %s", c7230z2.G());
                }
                if (!a(c7230z2, w22)) {
                    c(c7230z2, w22);
                    if (!a(c7230z2, w22)) {
                        w22.getLogger().c(I2.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", c7230z2.G());
                        return c7230z2;
                    }
                }
            }
            return c7230z2;
        } catch (Throwable th2) {
            w22.getLogger().a(I2.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            return c7230z2;
        }
    }

    @NotNull
    private static void c(@NotNull C7230z2 c7230z2, @NotNull W2 w22) {
        ArrayList n02 = c7230z2.n0();
        if (n02 != null) {
            Iterator it = n02.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.y i11 = ((io.sentry.protocol.s) it.next()).i();
                if (i11 != null) {
                    d(i11, c7230z2, w22, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList s02 = c7230z2.s0();
        if (s02 != null) {
            Iterator it2 = s02.iterator();
            while (it2.hasNext()) {
                io.sentry.protocol.y n11 = ((io.sentry.protocol.z) it2.next()).n();
                if (n11 != null) {
                    d(n11, c7230z2, w22, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    private static void d(@NotNull io.sentry.protocol.y yVar, @NotNull C7230z2 c7230z2, @NotNull W2 w22, @NotNull String str) {
        List<io.sentry.protocol.x> e11 = yVar.e();
        if (e11 == null || e11.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(CounterView.COUNTER_MAX_DEFAULT);
        arrayList.addAll(e11.subList(0, m.e.DEFAULT_SWIPE_ANIMATION_DURATION));
        arrayList.addAll(e11.subList(e11.size() - m.e.DEFAULT_SWIPE_ANIMATION_DURATION, e11.size()));
        yVar.f(arrayList);
        w22.getLogger().c(I2.DEBUG, str, c7230z2.G());
    }
}
