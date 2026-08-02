package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113e0 implements Cn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0139f0 f13632a;

    public C0113e0(C0139f0 c0139f0) {
        this.f13632a = c0139f0;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    @NotNull
    public final Thread a() {
        return this.f13632a.f13713b;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    @Nullable
    public final StackTraceElement[] b() {
        C0139f0 c0139f0 = this.f13632a;
        return (StackTraceElement[]) c0139f0.f13712a.get(c0139f0.f13713b);
    }

    @Override // io.appmetrica.analytics.impl.Cn
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f13632a.f13712a;
    }
}
