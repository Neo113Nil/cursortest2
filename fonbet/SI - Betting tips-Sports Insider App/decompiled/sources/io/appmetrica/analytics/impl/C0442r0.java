package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Yn f14532a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f14533b;

    /* renamed from: c, reason: collision with root package name */
    public Ba f14534c;

    /* renamed from: d, reason: collision with root package name */
    public Ca f14535d;

    public C0442r0() {
        this(new Yn());
    }

    public final synchronized Ba a(Context context, R3 r32) {
        try {
            if (this.f14534c == null) {
                if (a(context)) {
                    this.f14534c = new C0542v0();
                } else {
                    this.f14534c = new C0418q0(context, r32);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14534c;
    }

    public C0442r0(Yn yn) {
        this.f14532a = yn;
    }

    public final boolean a(Context context) {
        Boolean bool = this.f14533b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f14533b;
                    if (bool == null) {
                        this.f14532a.getClass();
                        boolean a7 = Yn.a(context);
                        bool = Boolean.valueOf(!a7);
                        this.f14533b = bool;
                        if (!a7) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }
}
