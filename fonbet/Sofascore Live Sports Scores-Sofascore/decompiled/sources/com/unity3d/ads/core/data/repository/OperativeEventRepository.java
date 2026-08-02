package com.unity3d.ads.core.data.repository;

import defpackage.a62;
import defpackage.aeh;
import defpackage.b1d;
import defpackage.beh;
import defpackage.un0;
import defpackage.xdh;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "", "<init>", "()V", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;", "operativeEventRequest", "", "addOperativeEvent", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;)V", "Lb1d;", "_operativeEvents", "Lb1d;", "Lxdh;", "operativeEvents", "Lxdh;", "getOperativeEvents", "()Lxdh;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OperativeEventRepository {

    @NotNull
    private final b1d _operativeEvents;

    @NotNull
    private final xdh operativeEvents;

    public OperativeEventRepository() {
        aeh a = beh.a(10, 10, a62.b);
        this._operativeEvents = a;
        this.operativeEvents = un0.t(a);
    }

    public final void addOperativeEvent(@NotNull OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        operativeEventRequest.getClass();
        this._operativeEvents.b(operativeEventRequest);
    }

    @NotNull
    public final xdh getOperativeEvents() {
        return this.operativeEvents;
    }
}
