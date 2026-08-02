package rl0;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.IntentFilter;
import gm0.C6752a;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import org.jetbrains.annotations.NotNull;
import rl0.C9306q;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import sl0.InterfaceC9702a;
import tl0.InterfaceC9885a;

/* renamed from: rl0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9291b implements InterfaceC9885a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f83666a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArraySet<InterfaceC9702a> f83667b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C9300k f83668c;

    /* renamed from: d, reason: collision with root package name */
    public AppUpdateOptions f83669d;

    public C9291b(Context applicationContext) {
        C9306q c9306q;
        Intrinsics.checkNotNullParameter(applicationContext, "context");
        this.f83666a = Sc.k.b(new e0(applicationContext));
        this.f83667b = new CopyOnWriteArraySet<>();
        Z z11 = new Z();
        new C9306q.a();
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        synchronized (C9306q.a.class) {
            c9306q = C9306q.f83705h;
            if (c9306q == null) {
                c9306q = new C9306q(applicationContext);
                C9306q.f83705h = c9306q;
            }
        }
        C9300k c9300k = (C9300k) c9306q.f83707b.getValue();
        this.f83668c = c9300k;
        c9300k.getClass();
        C9313y event = new C9313y("sdkInfo", (Map) c9300k.f83690e.getValue());
        N n11 = c9300k.f83686a;
        n11.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        E source = new E(n11, event);
        Intrinsics.checkNotNullParameter(source, "source");
        AbstractC7971a a11 = lm0.h.a(new lm0.i(source), new H(n11));
        int i11 = jm0.e.f70218e;
        lm0.q.a(lm0.p.a(lm0.t.a(a11, jm0.e.c()), K.f83624b), jm0.j.a(), C9310v.f83718b);
        km0.f.a(km0.c.a(z11.f83663b.a(new C6752a()), jm0.e.d()), new g0(this));
        androidx.core.content.a.registerReceiver(applicationContext, new a0(z11), new IntentFilter("rustore_app_downloading_state_" + applicationContext.getPackageName()), 2);
    }
}
