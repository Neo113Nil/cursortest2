package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.a70;
import defpackage.ljg;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0007\bJ!\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/ServiceLocator;", "", "T", "Ljava/lang/Class;", "serviceClass", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", "com/vungle/ads/internal/v1", "com/vungle/ads/internal/w1", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class ServiceLocator {

    @Nullable
    private static volatile ServiceLocator INSTANCE;
    public static final v1 d = new v1();
    public final Context a;
    public final HashMap b;
    public final HashMap c;

    public ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new HashMap();
        this.c = new HashMap();
        b();
    }

    public final Object a(Class cls) {
        for (Class cls2 : this.b.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                Object obj = this.c.get(cls2);
                if (obj != null) {
                    return obj;
                }
                w1 w1Var = (w1) this.b.get(cls2);
                if (w1Var == null) {
                    a70.p("Unknown class");
                    return null;
                }
                Object a = w1Var.a();
                if (w1Var.a) {
                    this.c.put(cls2, a);
                }
                return a;
            }
        }
        a70.p(ljg.l(cls, "Unknown dependency for "));
        return null;
    }

    public final void b() {
        this.b.put(com.vungle.ads.internal.task.e.class, new d2(this));
        this.b.put(com.vungle.ads.internal.task.h.class, new e2(this));
        this.b.put(VungleApiClient.class, new f2(this));
        this.b.put(com.vungle.ads.internal.platform.f.class, new g2(this));
        this.b.put(com.vungle.ads.internal.executor.a.class, new h2());
        this.b.put(com.vungle.ads.internal.omsdk.c.class, new i2(this));
        this.b.put(com.vungle.ads.internal.omsdk.d.class, new j2());
        this.b.put(FilePreferences.class, new k2(this));
        this.b.put(com.vungle.ads.internal.locale.a.class, new l2());
        this.b.put(com.vungle.ads.internal.bidding.e.class, new x1(this));
        this.b.put(PathProvider.class, new y1(this));
        this.b.put(com.vungle.ads.internal.downloader.m.class, new z1(this));
        this.b.put(com.vungle.ads.internal.util.k.class, new a2());
        this.b.put(com.vungle.ads.internal.signals.j.class, new b2(this));
        this.b.put(com.vungle.ads.internal.network.r.class, new c2(this));
    }

    public final synchronized <T> T getService(@NotNull Class<T> serviceClass) {
        serviceClass.getClass();
        return (T) a(serviceClass);
    }

    public /* synthetic */ ServiceLocator(Context context, int i) {
        this(context);
    }
}
