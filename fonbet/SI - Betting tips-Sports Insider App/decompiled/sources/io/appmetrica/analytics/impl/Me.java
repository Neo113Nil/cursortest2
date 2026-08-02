package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Me implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f12590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Oe f12592c;

    public Me(Oe oe2, PluginErrorDetails pluginErrorDetails, String str) {
        this.f12592c = oe2;
        this.f12590a = pluginErrorDetails;
        this.f12591b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f12592c.f12692d.get()).getPluginExtension().reportError(this.f12590a, this.f12591b);
    }
}
