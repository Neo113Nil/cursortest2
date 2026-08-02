package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ne implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f12651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Oe f12652d;

    public Ne(Oe oe2, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f12652d = oe2;
        this.f12649a = str;
        this.f12650b = str2;
        this.f12651c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f12652d.f12692d.get()).getPluginExtension().reportError(this.f12649a, this.f12650b, this.f12651c);
    }
}
