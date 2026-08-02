package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Ad implements InterfaceC0137eo, InterfaceC0219i2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11992b;

    /* renamed from: c, reason: collision with root package name */
    public final so f11993c;

    /* renamed from: d, reason: collision with root package name */
    public final J2 f11994d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f11995e = PublicLogger.getAnonymousInstance();

    public Ad(int i5, String str, so soVar, J2 j22) {
        this.f11992b = i5;
        this.f11991a = str;
        this.f11993c = soVar;
        this.f11994d = j22;
    }

    @NonNull
    public final C0163fo a() {
        C0163fo c0163fo = new C0163fo();
        c0163fo.f13786b = this.f11992b;
        c0163fo.f13785a = this.f11991a.getBytes();
        c0163fo.f13788d = new C0215ho();
        c0163fo.f13787c = new C0189go();
        return c0163fo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0137eo
    public abstract /* synthetic */ void a(@NonNull Cdo cdo);

    @NonNull
    public final J2 b() {
        return this.f11994d;
    }

    @NonNull
    public final String c() {
        return this.f11991a;
    }

    @NonNull
    public final so d() {
        return this.f11993c;
    }

    public final int e() {
        return this.f11992b;
    }

    public final boolean f() {
        qo a7 = this.f11993c.a(this.f11991a);
        if (a7.f14527a) {
            return true;
        }
        this.f11995e.warning("Attribute " + this.f11991a + " of type " + ((String) On.f12715a.get(this.f11992b)) + " is skipped because " + a7.f14528b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0137eo
    public final void a(@NonNull PublicLogger publicLogger) {
        this.f11995e = publicLogger;
    }
}
