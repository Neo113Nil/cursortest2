package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Le implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f12538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Oe f12539b;

    public Le(Oe oe2, PluginErrorDetails pluginErrorDetails) {
        this.f12539b = oe2;
        this.f12538a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f12539b.f12692d.get()).getPluginExtension().reportUnhandledException(this.f12538a);
    }
}
