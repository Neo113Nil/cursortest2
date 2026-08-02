package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.aeh;
import defpackage.au3;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bu3;
import defpackage.c00;
import defpackage.d38;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.gu3;
import defpackage.i5h;
import defpackage.km5;
import defpackage.ku3;
import defpackage.oh0;
import defpackage.s9a;
import defpackage.un0;
import defpackage.xdh;
import defpackage.xw3;
import defpackage.z0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R8\u0010&\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010#0# $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010#0#\u0018\u00010%0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R8\u0010(\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010#0# $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010#0#\u0018\u00010%0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001eR \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001c0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001c0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "flushTimer", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "getDiagnosticEventRequest", "Lau3;", "dispatcher", "<init>", "(Lcom/unity3d/ads/core/utils/CoroutineTimer;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;Lau3;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "diagnosticEvent", "", "addDiagnosticEvent", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;)V", "flush", "()V", "clear", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "diagnosticsEventsConfiguration", "configure", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;)V", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "Lku3;", "coroutineScope", "Lku3;", "Lf1d;", "", "batch", "Lf1d;", "", "maxBatchSize", "I", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "kotlin.jvm.PlatformType", "", "allowedEvents", "Ljava/util/Set;", "blockedEvents", "", "enabled", "configured", "Lb1d;", "_diagnosticEvents", "Lb1d;", "Lxdh;", "diagnosticEvents", "Lxdh;", "getDiagnosticEvents", "()Lxdh;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {

    @NotNull
    private final b1d _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;

    @NotNull
    private final f1d batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;

    @NotNull
    private final f1d configured;

    @NotNull
    private final ku3 coroutineScope;

    @NotNull
    private final xdh diagnosticEvents;

    @NotNull
    private final f1d enabled;

    @NotNull
    private final CoroutineTimer flushTimer;

    @NotNull
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(@NotNull CoroutineTimer coroutineTimer, @NotNull GetDiagnosticEventRequest getDiagnosticEventRequest, @NotNull au3 au3Var) {
        coroutineTimer.getClass();
        getDiagnosticEventRequest.getClass();
        au3Var.getClass();
        this.flushTimer = coroutineTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = s9a.F(s9a.F(s9a.c(au3Var), new gu3("DiagnosticEventRepository")), new AndroidDiagnosticEventRepository$special$$inlined$CoroutineExceptionHandler$1(bu3.a));
        this.batch = gdi.a(km5.a);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = gdi.a(bool);
        this.configured = gdi.a(bool);
        aeh b = beh.b(100, 0, null, 6);
        this._diagnosticEvents = b;
        this.diagnosticEvents = un0.t(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configure$lambda$9(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        androidDiagnosticEventRepository.flush();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        DiagnosticEventRequestOuterClass.DiagnosticEvent invoke;
        if (diagnosticEvent != null) {
            return diagnosticEvent;
        }
        invoke = androidDiagnosticEventRepository.getDiagnosticEventRequest.invoke(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM, "null_diagnostic_event", null, null, null, null, null, null, null, null, (r25 & 1024) != 0 ? null : null);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean flush$lambda$5(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        diagnosticEvent.getClass();
        return androidDiagnosticEventRepository.allowedEvents.isEmpty() || androidDiagnosticEventRepository.allowedEvents.contains(diagnosticEvent.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean flush$lambda$6(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        diagnosticEvent.getClass();
        return !androidDiagnosticEventRepository.blockedEvents.contains(diagnosticEvent.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flush$lambda$7(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List list) {
        return "Unity Ads Sending diagnostic batch enabled: " + ((Boolean) ((fdi) androidDiagnosticEventRepository.enabled).getValue()).booleanValue() + " size: " + list.size() + " :: " + list;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        fdi fdiVar;
        Object value;
        fdi fdiVar2;
        Object value2;
        diagnosticEvent.getClass();
        if (!((Boolean) ((fdi) this.configured).getValue()).booleanValue()) {
            f1d f1dVar = this.batch;
            do {
                fdiVar2 = (fdi) f1dVar;
                value2 = fdiVar2.getValue();
            } while (!fdiVar2.k(value2, CollectionsKt.x0((List) value2, diagnosticEvent)));
            return;
        }
        if (((Boolean) ((fdi) this.enabled).getValue()).booleanValue()) {
            f1d f1dVar2 = this.batch;
            do {
                fdiVar = (fdi) f1dVar2;
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, CollectionsKt.x0((List) value, diagnosticEvent)));
            if (((List) ((fdi) this.batch).getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        fdi fdiVar;
        Object value;
        f1d f1dVar = this.batch;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, km5.a));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        diagnosticsEventsConfiguration.getClass();
        f1d f1dVar = this.configured;
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        f1d f1dVar2 = this.enabled;
        Boolean valueOf = Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled());
        fdi fdiVar2 = (fdi) f1dVar2;
        fdiVar2.getClass();
        fdiVar2.m(null, valueOf);
        if (!((Boolean) ((fdi) this.enabled).getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        allowedEventsList.getClass();
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        blockedEventsList.getClass();
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new z0(this, 8));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        fdi fdiVar;
        Object value;
        if (((Boolean) ((fdi) this.enabled).getValue()).booleanValue()) {
            f1d f1dVar = this.batch;
            do {
                fdiVar = (fdi) f1dVar;
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, km5.a));
            oh0 N = CollectionsKt.N((Iterable) value);
            final int i = 0;
            final int i2 = 1;
            d38 g = i5h.g(i5h.n(N, new Function1(this) { // from class: b00
                public final /* synthetic */ AndroidDiagnosticEventRepository b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
                    boolean flush$lambda$5;
                    int i3 = i;
                    AndroidDiagnosticEventRepository androidDiagnosticEventRepository = this.b;
                    DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj;
                    switch (i3) {
                        case 0:
                            flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4(androidDiagnosticEventRepository, diagnosticEvent);
                            return flush$lambda$4;
                        case 1:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5(androidDiagnosticEventRepository, diagnosticEvent);
                            break;
                        default:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$6(androidDiagnosticEventRepository, diagnosticEvent);
                            break;
                    }
                    return Boolean.valueOf(flush$lambda$5);
                }
            }), new Function1(this) { // from class: b00
                public final /* synthetic */ AndroidDiagnosticEventRepository b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
                    boolean flush$lambda$5;
                    int i3 = i2;
                    AndroidDiagnosticEventRepository androidDiagnosticEventRepository = this.b;
                    DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj;
                    switch (i3) {
                        case 0:
                            flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4(androidDiagnosticEventRepository, diagnosticEvent);
                            return flush$lambda$4;
                        case 1:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5(androidDiagnosticEventRepository, diagnosticEvent);
                            break;
                        default:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$6(androidDiagnosticEventRepository, diagnosticEvent);
                            break;
                    }
                    return Boolean.valueOf(flush$lambda$5);
                }
            });
            final int i3 = 2;
            List q = i5h.q(i5h.g(g, new Function1(this) { // from class: b00
                public final /* synthetic */ AndroidDiagnosticEventRepository b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DiagnosticEventRequestOuterClass.DiagnosticEvent flush$lambda$4;
                    boolean flush$lambda$5;
                    int i32 = i3;
                    AndroidDiagnosticEventRepository androidDiagnosticEventRepository = this.b;
                    DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent = (DiagnosticEventRequestOuterClass.DiagnosticEvent) obj;
                    switch (i32) {
                        case 0:
                            flush$lambda$4 = AndroidDiagnosticEventRepository.flush$lambda$4(androidDiagnosticEventRepository, diagnosticEvent);
                            return flush$lambda$4;
                        case 1:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$5(androidDiagnosticEventRepository, diagnosticEvent);
                            break;
                        default:
                            flush$lambda$5 = AndroidDiagnosticEventRepository.flush$lambda$6(androidDiagnosticEventRepository, diagnosticEvent);
                            break;
                    }
                    return Boolean.valueOf(flush$lambda$5);
                }
            }));
            if (q.isEmpty()) {
                return;
            }
            DeviceLog.debug(new c00(i, this, q));
            xw3.L(this.coroutineScope, null, null, new AndroidDiagnosticEventRepository$flush$2(this, q, null), 3);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    @NotNull
    public xdh getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
