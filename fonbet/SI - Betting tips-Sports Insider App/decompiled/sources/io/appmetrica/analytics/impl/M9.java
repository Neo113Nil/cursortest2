package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class M9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12576a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f12577b;

    /* renamed from: c, reason: collision with root package name */
    public final W2 f12578c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f12579d;

    public M9(Context context, Vm vm, W2 w22, SafePackageManager safePackageManager) {
        this.f12576a = context;
        this.f12577b = vm;
        this.f12578c = w22;
        this.f12579d = safePackageManager;
    }

    public M9(Context context) {
        this(context, new Vm(context, "io.appmetrica.analytics.build_id"), new W2(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
