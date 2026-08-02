package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Oe implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Re f12689a = new Re();

    /* renamed from: b, reason: collision with root package name */
    public final Se f12690b = new Se();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f12691c = C0040b4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f12692d;

    public Oe(@NonNull Provider<Ra> provider) {
        this.f12692d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
        Re re2 = this.f12689a;
        re2.f12815a.a(pluginErrorDetails);
        if (re2.f12817c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f14527a) {
            this.f12690b.getClass();
            this.f12691c.execute(new Me(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f12689a.f12815a.a(pluginErrorDetails);
        this.f12690b.getClass();
        this.f12691c.execute(new Le(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f12689a.f12816b.a(str);
        this.f12690b.getClass();
        this.f12691c.execute(new Ne(this, str, str2, pluginErrorDetails));
    }
}
