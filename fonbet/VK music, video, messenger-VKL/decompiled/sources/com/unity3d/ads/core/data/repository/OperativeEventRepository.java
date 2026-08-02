package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.baj0;
import xsna.caj0;
import xsna.lyd;
import xsna.rsr;
import xsna.sh50;

/* compiled from: OperativeEventRepository.kt */
/* loaded from: classes14.dex */
public final class OperativeEventRepository {
    private final sh50<OperativeEventRequestOuterClass.OperativeEventRequest> _operativeEvents;
    private final baj0<OperativeEventRequestOuterClass.OperativeEventRequest> operativeEvents;

    public OperativeEventRepository() {
        caj0 a = lyd.a(10, 10, BufferOverflow.DROP_OLDEST);
        this._operativeEvents = a;
        this.operativeEvents = rsr.e(a);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        this._operativeEvents.e(operativeEventRequest);
    }

    public final baj0<OperativeEventRequestOuterClass.OperativeEventRequest> getOperativeEvents() {
        return this.operativeEvents;
    }
}
