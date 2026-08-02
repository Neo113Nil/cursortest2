package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434qg implements InterfaceC0284kg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f14518a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14519b;

    /* renamed from: c, reason: collision with root package name */
    public C0359ng f14520c;

    public C0434qg() {
        this(C0353na.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0284kg
    public final synchronized void a(C0359ng c0359ng) {
        if (c0359ng != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c0359ng.f14364d.f14270a, c0359ng.f14361a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14520c = c0359ng;
        this.f14519b = true;
        Iterator it = this.f14518a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0155fg) it.next()).a(this.f14520c);
        }
        this.f14518a.clear();
    }

    public C0434qg(C0309lg c0309lg) {
        this.f14518a = new HashSet();
        c0309lg.a(new C0613xl(this));
        c0309lg.a();
    }

    public final synchronized void a(@NonNull InterfaceC0155fg interfaceC0155fg) {
        this.f14518a.add(interfaceC0155fg);
        if (this.f14519b) {
            interfaceC0155fg.a(this.f14520c);
            this.f14518a.remove(interfaceC0155fg);
        }
    }
}
