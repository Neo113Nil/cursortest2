package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n8 implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final l4 f5152a;

    /* renamed from: b, reason: collision with root package name */
    public static final l4 f5153b;

    /* renamed from: c, reason: collision with root package name */
    public static final l4 f5154c;

    /* renamed from: d, reason: collision with root package name */
    public static final l4 f5155d;

    /* renamed from: e, reason: collision with root package name */
    public static final l4 f5156e;

    /* renamed from: f, reason: collision with root package name */
    public static final l4 f5157f;

    static {
        com.android.billingclient.api.u0 u0Var = new com.android.billingclient.api.u0(k4.a(), true, true);
        f5152a = u0Var.o("measurement.test.boolean_flag", false);
        f5153b = u0Var.n(-1L, "measurement.test.cached_long_flag");
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = l4.f5117g;
        f5154c = new l4(u0Var, "measurement.test.double_flag", valueOf, 2);
        f5155d = u0Var.n(-2L, "measurement.test.int_flag");
        f5156e = u0Var.n(-1L, "measurement.test.long_flag");
        f5157f = u0Var.p("measurement.test.string_flag", "---");
    }
}
