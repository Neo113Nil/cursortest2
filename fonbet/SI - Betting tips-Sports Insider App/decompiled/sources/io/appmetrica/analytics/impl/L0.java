package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f12493a = C0040b4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C0642z0 f12494b;

    /* renamed from: c, reason: collision with root package name */
    public final Qe f12495c;

    /* renamed from: d, reason: collision with root package name */
    public final Te f12496d;

    public L0() {
        C0642z0 c0642z0 = new C0642z0();
        this.f12494b = c0642z0;
        this.f12495c = new Qe(c0642z0);
        this.f12496d = new Te();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Qe qe2 = this.f12495c;
        qe2.f12774a.a(null);
        qe2.f12775b.a(pluginErrorDetails);
        Te te2 = this.f12496d;
        Intrinsics.checkNotNull(pluginErrorDetails);
        te2.getClass();
        this.f12493a.execute(new androidx.appcompat.app.t(16, this, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Qe qe2 = this.f12495c;
        qe2.f12774a.a(null);
        qe2.f12775b.a(pluginErrorDetails);
        if (qe2.f12777d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f14527a) {
            Te te2 = this.f12496d;
            Intrinsics.checkNotNull(pluginErrorDetails);
            te2.getClass();
            this.f12493a.execute(new androidx.fragment.app.d(this, pluginErrorDetails, str, 13));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Qe qe2 = this.f12495c;
        qe2.f12774a.a(null);
        qe2.f12776c.a(str);
        Te te2 = this.f12496d;
        Intrinsics.checkNotNull(str);
        te2.getClass();
        this.f12493a.execute(new com.appsflyer.internal.o(4, this, str, str2, pluginErrorDetails));
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails, String str) {
        l02.f12494b.getClass();
        C0617y0 c0617y0 = C0617y0.f14936e;
        Intrinsics.checkNotNull(c0617y0);
        C0254jc i5 = c0617y0.f().i();
        Intrinsics.checkNotNull(i5);
        i5.f14030a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l02.f12494b.getClass();
        C0617y0 c0617y0 = C0617y0.f14936e;
        Intrinsics.checkNotNull(c0617y0);
        C0254jc i5 = c0617y0.f().i();
        Intrinsics.checkNotNull(i5);
        i5.f14030a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails) {
        l02.f12494b.getClass();
        C0617y0 c0617y0 = C0617y0.f14936e;
        Intrinsics.checkNotNull(c0617y0);
        C0254jc i5 = c0617y0.f().i();
        Intrinsics.checkNotNull(i5);
        i5.f14030a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
