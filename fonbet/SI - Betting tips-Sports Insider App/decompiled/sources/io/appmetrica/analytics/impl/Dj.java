package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Dj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f12152c;

    public Dj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f12150a = str;
        this.f12151b = str2;
        this.f12152c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.getPluginExtension().reportError(this.f12150a, this.f12151b, this.f12152c);
    }
}
