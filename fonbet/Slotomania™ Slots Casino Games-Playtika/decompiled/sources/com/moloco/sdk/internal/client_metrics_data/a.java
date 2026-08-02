package com.moloco.sdk.internal.client_metrics_data;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static final C0231a c = new C0231a(null);
    public static final int d = 8;
    public static final String e = "AcmClickDeduper";
    public final MetricsRecorder a;
    public AtomicBoolean b;

    /* renamed from: com.moloco.sdk.internal.client_metrics_data.a$a, reason: collision with other inner class name */
    public static final class C0231a {
        public /* synthetic */ C0231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0231a() {
        }
    }

    public a(MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = metricsRecorder;
        this.b = new AtomicBoolean(false);
    }

    public final void a() {
        this.b.set(false);
    }

    public final void a(AdFormatType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (this.b.compareAndSet(false, true)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "Deduped click logged", null, false, 12, null);
            MetricsRecorder metricsRecorder = this.a;
            CountEvent countEvent = new CountEvent(b.E.c());
            String c2 = d.c.c();
            String lowerCase = adType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            metricsRecorder.recordCountEvent(countEvent.withTag(c2, lowerCase));
        }
        this.b.set(true);
    }
}
