package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.tasks.Task;
import defpackage.e3c;
import defpackage.z2n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zat extends GoogleApi implements TelemetryLoggingClient {
    public static final Api l = new Api("ClientTelemetry.API", new z2n(), new Api.ClientKey());

    public final Task i(TelemetryData telemetryData) {
        TaskApiCall.Builder a = TaskApiCall.a();
        a.c = new Feature[]{zad.a};
        a.b = false;
        a.a = new e3c(telemetryData, 21);
        return h(2, a.a());
    }
}
