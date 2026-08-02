package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import com.vk.movika.sdk.base.observable.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.baj0;
import xsna.caj0;
import xsna.go1;
import xsna.i5g;
import xsna.j5g;
import xsna.lyd;
import xsna.myc0;
import xsna.ovj;
import xsna.pvj;
import xsna.rli0;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.t72;
import xsna.ul1;
import xsna.ulp0;
import xsna.vtk0;
import xsna.vvj;
import xsna.xh50;
import xsna.yg;
import xsna.yvj;
import xsna.zvj;

/* compiled from: AndroidDiagnosticEventRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final sh50<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final xh50<Boolean> configured;
    private final yvj coroutineScope;
    private final baj0<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    private final xh50<Boolean> enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final xh50<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch = vtk0.a(EmptyList.b);
    private int maxBatchSize = Integer.MAX_VALUE;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents = Collections.synchronizedSet(new LinkedHashSet());

    public AndroidDiagnosticEventRepository(CoroutineTimer coroutineTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, ovj ovjVar) {
        this.flushTimer = coroutineTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = zvj.g(zvj.g(zvj.a(ovjVar), new vvj("DiagnosticEventRepository")), new AndroidDiagnosticEventRepository$special$$inlined$CoroutineExceptionHandler$1(pvj.a.b));
        Boolean bool = Boolean.FALSE;
        this.enabled = vtk0.a(bool);
        this.configured = vtk0.a(bool);
        caj0 b = lyd.b(100, 0, null, 6);
        this._diagnosticEvents = b;
        this.diagnosticEvents = rsr.e(b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 configure$lambda$9(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        androidDiagnosticEventRepository.flush();
        return s3q0.a;
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
        return androidDiagnosticEventRepository.allowedEvents.isEmpty() || androidDiagnosticEventRepository.allowedEvents.contains(diagnosticEvent.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean flush$lambda$6(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        return !androidDiagnosticEventRepository.blockedEvents.contains(diagnosticEvent.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flush$lambda$7(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List list) {
        return "Unity Ads Sending diagnostic batch enabled: " + androidDiagnosticEventRepository.enabled.getValue().booleanValue() + " size: " + list.size() + " :: " + list;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        if (!this.configured.getValue().booleanValue()) {
            xh50<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> xh50Var = this.batch;
            do {
                value2 = xh50Var.getValue();
            } while (!xh50Var.compareAndSet(value2, j5g.v0(diagnosticEvent, value2)));
        } else if (this.enabled.getValue().booleanValue()) {
            xh50<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> xh50Var2 = this.batch;
            do {
                value = xh50Var2.getValue();
            } while (!xh50Var2.compareAndSet(value, j5g.v0(diagnosticEvent, value)));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        xh50<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> xh50Var = this.batch;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), EmptyList.b)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticEventsConfiguration.getMaxBatchSize();
        this.allowedEvents.addAll(diagnosticEventsConfiguration.getAllowedEventsList());
        this.blockedEvents.addAll(diagnosticEventsConfiguration.getBlockedEventsList());
        this.flushTimer.start(0L, diagnosticEventsConfiguration.getMaxBatchIntervalMs(), new yg(this, 4));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        if (this.enabled.getValue().booleanValue()) {
            xh50<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> xh50Var = this.batch;
            do {
                value = xh50Var.getValue();
            } while (!xh50Var.compareAndSet(value, EmptyList.b));
            List A = rli0.A(rli0.j(rli0.j(new ulp0(new i5g(value), new go1(this, 2)), new e(this, 4)), new ul1(this, 3)));
            if (A.isEmpty()) {
                return;
            }
            DeviceLog.debug(new t72(0, this, A));
            myc0.h(this.coroutineScope, null, null, new AndroidDiagnosticEventRepository$flush$2(this, A, null), 3);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public baj0<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
