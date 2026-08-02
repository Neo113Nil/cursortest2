package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class e {
    public static final a d = new a(null);
    public static final int e = 8;
    public static final String f = "CompositeEventHandler";
    public final Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> a;
    public final MetricsRecorder b;
    public final Lazy c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = eventHandlers;
        this.b = metricsRecorder;
        this.c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(e.this);
            }
        });
    }

    public final Map<String, List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a>> a() {
        return (Map) this.c.getValue();
    }

    public static final Map a(e eVar) {
        Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set = eVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            Set<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> set2 = eVar.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj2).a().contains(str)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(obj, arrayList2);
        }
        return linkedHashMap;
    }

    public final void a(String event) {
        TimerEvent timerEvent;
        String str;
        TimerEvent timerEvent2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar;
        TimerEvent timerEvent3;
        MetricsRecorder metricsRecorder;
        String c;
        Intrinsics.checkNotNullParameter(event, "event");
        TimerEvent startTimerEvent = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.s.c());
        JSONObject jSONObject = new JSONObject(event);
        String string = jSONObject.getString("event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, f, "Event received: " + string, false, 4, null);
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> list = a().get(string);
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                timerEvent = startTimerEvent;
                str = LoginLogger.EVENT_EXTRAS_FAILURE;
                MolocoLogger.warn$default(molocoLogger, f, "Found multiple event handlers for event: " + string + ", using first one", null, false, 12, null);
                MetricsRecorder metricsRecorder2 = this.b;
                CountEvent withTag = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.L.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), str);
                Intrinsics.checkNotNull(string);
                metricsRecorder2.recordCountEvent(withTag.withTag("event", string));
            } else {
                timerEvent = startTimerEvent;
                str = LoginLogger.EVENT_EXTRAS_FAILURE;
            }
            TimerEvent startTimerEvent2 = this.b.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.t.c());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) CollectionsKt.first((List) list);
            try {
                aVar2.a(jSONObject);
                timerEvent2 = startTimerEvent2;
            } catch (Exception e2) {
                e = e2;
                timerEvent2 = startTimerEvent2;
            }
            try {
                aVar = aVar2;
            } catch (Exception e3) {
                e = e3;
                aVar = aVar2;
                timerEvent3 = timerEvent;
                Exception exc = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, f, "Event handling failed: " + string, exc, false, 8, null);
                MetricsRecorder metricsRecorder3 = this.b;
                Intrinsics.checkNotNull(string);
                TimerEvent withTag2 = timerEvent2.withTag("event", string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
                String c2 = dVar.c();
                String simpleName = exc.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                TimerEvent withTag3 = withTag2.withTag(c2, simpleName);
                com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder3.recordTimerEvent(withTag3.withTag(dVar2.c(), str));
                MetricsRecorder metricsRecorder4 = this.b;
                CountEvent withTag4 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar2.c(), str);
                String c3 = dVar.c();
                String simpleName2 = exc.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                metricsRecorder4.recordCountEvent(withTag4.withTag(c3, simpleName2).withTag("handler", aVar.b()).withTag("event", string));
                MetricsRecorder metricsRecorder5 = this.b;
                TimerEvent withTag5 = timerEvent3.withTag(dVar2.c(), str);
                String c4 = dVar.c();
                String simpleName3 = exc.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
                metricsRecorder5.recordTimerEvent(withTag5.withTag(c4, simpleName3).withTag("handler", aVar.b()).withTag("event", string));
                return;
            }
            try {
                MolocoLogger.info$default(molocoLogger, f, "Event handled: " + string, null, false, 12, null);
                MetricsRecorder metricsRecorder6 = this.b;
                Intrinsics.checkNotNull(string);
                TimerEvent withTag6 = timerEvent2.withTag("event", string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder6.recordTimerEvent(withTag6.withTag(dVar3.c(), "success"));
                this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar3.c(), "success").withTag("handler", aVar.b()).withTag("event", string));
                metricsRecorder = this.b;
                c = dVar3.c();
                timerEvent3 = timerEvent;
            } catch (Exception e4) {
                e = e4;
                timerEvent3 = timerEvent;
                Exception exc2 = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, f, "Event handling failed: " + string, exc2, false, 8, null);
                MetricsRecorder metricsRecorder32 = this.b;
                Intrinsics.checkNotNull(string);
                TimerEvent withTag22 = timerEvent2.withTag("event", string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
                String c22 = dVar4.c();
                String simpleName4 = exc2.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName4, "getSimpleName(...)");
                TimerEvent withTag32 = withTag22.withTag(c22, simpleName4);
                com.moloco.sdk.internal.client_metrics_data.d dVar22 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder32.recordTimerEvent(withTag32.withTag(dVar22.c(), str));
                MetricsRecorder metricsRecorder42 = this.b;
                CountEvent withTag42 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar22.c(), str);
                String c32 = dVar4.c();
                String simpleName22 = exc2.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName22, "getSimpleName(...)");
                metricsRecorder42.recordCountEvent(withTag42.withTag(c32, simpleName22).withTag("handler", aVar.b()).withTag("event", string));
                MetricsRecorder metricsRecorder52 = this.b;
                TimerEvent withTag52 = timerEvent3.withTag(dVar22.c(), str);
                String c42 = dVar4.c();
                String simpleName32 = exc2.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName32, "getSimpleName(...)");
                metricsRecorder52.recordTimerEvent(withTag52.withTag(c42, simpleName32).withTag("handler", aVar.b()).withTag("event", string));
                return;
            }
            try {
                metricsRecorder.recordTimerEvent(timerEvent3.withTag(c, "success").withTag("handler", aVar.b()).withTag("event", string));
                return;
            } catch (Exception e5) {
                e = e5;
                Exception exc22 = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, f, "Event handling failed: " + string, exc22, false, 8, null);
                MetricsRecorder metricsRecorder322 = this.b;
                Intrinsics.checkNotNull(string);
                TimerEvent withTag222 = timerEvent2.withTag("event", string).withTag("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.d dVar42 = com.moloco.sdk.internal.client_metrics_data.d.b;
                String c222 = dVar42.c();
                String simpleName42 = exc22.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName42, "getSimpleName(...)");
                TimerEvent withTag322 = withTag222.withTag(c222, simpleName42);
                com.moloco.sdk.internal.client_metrics_data.d dVar222 = com.moloco.sdk.internal.client_metrics_data.d.d;
                metricsRecorder322.recordTimerEvent(withTag322.withTag(dVar222.c(), str));
                MetricsRecorder metricsRecorder422 = this.b;
                CountEvent withTag422 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c()).withTag(dVar222.c(), str);
                String c322 = dVar42.c();
                String simpleName222 = exc22.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName222, "getSimpleName(...)");
                metricsRecorder422.recordCountEvent(withTag422.withTag(c322, simpleName222).withTag("handler", aVar.b()).withTag("event", string));
                MetricsRecorder metricsRecorder522 = this.b;
                TimerEvent withTag522 = timerEvent3.withTag(dVar222.c(), str);
                String c422 = dVar42.c();
                String simpleName322 = exc22.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName322, "getSimpleName(...)");
                metricsRecorder522.recordTimerEvent(withTag522.withTag(c422, simpleName322).withTag("handler", aVar.b()).withTag("event", string));
                return;
            }
        }
        MolocoLogger.error$default(molocoLogger, f, "Event not handled: " + string, null, false, 12, null);
        MetricsRecorder metricsRecorder7 = this.b;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.K.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.d;
        CountEvent withTag7 = countEvent.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar6 = com.moloco.sdk.internal.client_metrics_data.d.b;
        CountEvent withTag8 = withTag7.withTag(dVar6.c(), "no_handler");
        Intrinsics.checkNotNull(string);
        metricsRecorder7.recordCountEvent(withTag8.withTag("event", string));
        this.b.recordTimerEvent(startTimerEvent.withTag(dVar5.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar6.c(), "no_handler").withTag("event", string));
    }
}
