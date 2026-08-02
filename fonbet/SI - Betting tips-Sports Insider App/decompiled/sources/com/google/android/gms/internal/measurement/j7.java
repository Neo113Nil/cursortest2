package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j7 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public static final l4 f5104a;

    /* renamed from: b, reason: collision with root package name */
    public static final l4 f5105b;

    static {
        com.android.billingclient.api.u0 u0Var = new com.android.billingclient.api.u0(k4.a(), true, true);
        u0Var.o("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        u0Var.o("measurement.set_default_event_parameters_with_backfill.service", true);
        u0Var.n(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        f5104a = u0Var.o("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f5105b = u0Var.o("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        u0Var.o("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
