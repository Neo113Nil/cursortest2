package J7;

import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5954c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f5955a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f5956b = new HashMap();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long c(Long l10, long j10) {
            if (l10 != null) {
                return j10 - l10.longValue();
            }
            return -1L;
        }

        public final long d() {
            return SystemClock.uptimeMillis();
        }

        public a() {
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public synchronized void onProducerEvent(String requestId, String producerName, String producerEventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        if (E6.a.w(2)) {
            Long l10 = (Long) this.f5955a.get(Pair.create(requestId, producerName));
            a aVar = f5954c;
            E6.a.F("RequestLoggingListener", "time %d: onProducerEvent: {requestId: %s, stage: %s, eventName: %s; elapsedTime: %d ms}", Long.valueOf(aVar.d()), requestId, producerName, producerEventName, Long.valueOf(aVar.c(l10, aVar.d())));
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public synchronized void onProducerFinishWithCancellation(String requestId, String producerName, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (E6.a.w(2)) {
            Long l10 = (Long) this.f5955a.remove(Pair.create(requestId, producerName));
            a aVar = f5954c;
            long d10 = aVar.d();
            E6.a.F("RequestLoggingListener", "time %d: onProducerFinishWithCancellation: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(d10), requestId, producerName, Long.valueOf(aVar.c(l10, d10)), map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public synchronized void onProducerFinishWithFailure(String requestId, String producerName, Throwable throwable, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (E6.a.w(5)) {
            Long l10 = (Long) this.f5955a.remove(Pair.create(requestId, producerName));
            a aVar = f5954c;
            long d10 = aVar.d();
            E6.a.N("RequestLoggingListener", throwable, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", Long.valueOf(d10), requestId, producerName, Long.valueOf(aVar.c(l10, d10)), map, throwable.toString());
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public synchronized void onProducerFinishWithSuccess(String requestId, String producerName, Map map) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (E6.a.w(2)) {
            Long l10 = (Long) this.f5955a.remove(Pair.create(requestId, producerName));
            a aVar = f5954c;
            long d10 = aVar.d();
            E6.a.F("RequestLoggingListener", "time %d: onProducerFinishWithSuccess: {requestId: %s, producer: %s, elapsedTime: %d ms, extraMap: %s}", Long.valueOf(d10), requestId, producerName, Long.valueOf(aVar.c(l10, d10)), map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public synchronized void onProducerStart(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (E6.a.w(2)) {
            Pair create = Pair.create(requestId, producerName);
            long d10 = f5954c.d();
            this.f5955a.put(create, Long.valueOf(d10));
            E6.a.D("RequestLoggingListener", "time %d: onProducerStart: {requestId: %s, producer: %s}", Long.valueOf(d10), requestId, producerName);
        }
    }

    @Override // J7.e
    public synchronized void onRequestCancellation(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (E6.a.w(2)) {
            Long l10 = (Long) this.f5956b.remove(requestId);
            a aVar = f5954c;
            long d10 = aVar.d();
            E6.a.D("RequestLoggingListener", "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(d10), requestId, Long.valueOf(aVar.c(l10, d10)));
        }
    }

    @Override // J7.e
    public synchronized void onRequestFailure(com.facebook.imagepipeline.request.b request, String requestId, Throwable throwable, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (E6.a.w(5)) {
            Long l10 = (Long) this.f5956b.remove(requestId);
            a aVar = f5954c;
            long d10 = aVar.d();
            E6.a.M("RequestLoggingListener", "time %d: onRequestFailure: {requestId: %s, elapsedTime: %d ms, throwable: %s}", Long.valueOf(d10), requestId, Long.valueOf(aVar.c(l10, d10)), throwable.toString());
        }
    }

    @Override // J7.e
    public synchronized void onRequestStart(com.facebook.imagepipeline.request.b request, Object callerContextObject, String requestId, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContextObject, "callerContextObject");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (E6.a.w(2)) {
            a aVar = f5954c;
            E6.a.E("RequestLoggingListener", "time %d: onRequestSubmit: {requestId: %s, callerContext: %s, isPrefetch: %b}", Long.valueOf(aVar.d()), requestId, callerContextObject, Boolean.valueOf(z10));
            this.f5956b.put(requestId, Long.valueOf(aVar.d()));
        }
    }

    @Override // J7.e
    public synchronized void onRequestSuccess(com.facebook.imagepipeline.request.b request, String requestId, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (E6.a.w(2)) {
            Long l10 = (Long) this.f5956b.remove(requestId);
            a aVar = f5954c;
            long d10 = aVar.d();
            E6.a.D("RequestLoggingListener", "time %d: onRequestSuccess: {requestId: %s, elapsedTime: %d ms}", Long.valueOf(d10), requestId, Long.valueOf(aVar.c(l10, d10)));
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public synchronized void onUltimateProducerReached(String requestId, String producerName, boolean z10) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (E6.a.w(2)) {
            Long l10 = (Long) this.f5955a.remove(Pair.create(requestId, producerName));
            a aVar = f5954c;
            long d10 = aVar.d();
            E6.a.F("RequestLoggingListener", "time %d: onUltimateProducerReached: {requestId: %s, producer: %s, elapsedTime: %d ms, success: %b}", Long.valueOf(d10), requestId, producerName, Long.valueOf(aVar.c(l10, d10)), Boolean.valueOf(z10));
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean requiresExtraMap(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return E6.a.w(2);
    }
}
