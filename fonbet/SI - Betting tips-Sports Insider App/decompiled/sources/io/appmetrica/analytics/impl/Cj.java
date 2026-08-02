package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Cj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f12114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12115b;

    public Cj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f12114a = pluginErrorDetails;
        this.f12115b = str;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.getPluginExtension().reportError(this.f12114a, this.f12115b);
    }
}
