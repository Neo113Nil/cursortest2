package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068c6 extends Pg {

    /* renamed from: f, reason: collision with root package name */
    public final Context f13498f;

    /* renamed from: g, reason: collision with root package name */
    public final C0559vh f13499g;

    /* renamed from: h, reason: collision with root package name */
    public final C0448r6 f13500h;

    /* renamed from: i, reason: collision with root package name */
    public final K1 f13501i;
    public final C0349n6 j;

    public C0068c6(@NotNull Context context, @NotNull C0393p0 c0393p0, @Nullable Zk zk, @NotNull C0559vh c0559vh) {
        super(c0393p0, zk, c0559vh);
        this.f13498f = context;
        this.f13499g = c0559vh;
        this.f13500h = C0040b4.l().i();
        this.f13501i = C0040b4.l().f();
        this.j = new C0349n6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh
    public final synchronized void a() {
        try {
            if (this.f14928c) {
                return;
            }
            this.f14928c = true;
            String a7 = this.f13500h.f14546a.a();
            K1 k12 = this.f13501i;
            Context context = this.f13498f;
            k12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (Intrinsics.areEqual(a7, serviceInfo != null ? serviceInfo.processName : null)) {
                this.j.a(this.f13499g);
            } else {
                this.f14926a.c();
                this.f14928c = false;
                super.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh
    public final boolean c() {
        this.j.a(this.f13499g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0609xh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f19194a;
    }
}
