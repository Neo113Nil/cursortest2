package io.appmetrica.analytics.impl;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Pj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f12761b;

    public Pj(String str, Map map) {
        this.f12760a = str;
        this.f12761b = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportEvent(this.f12760a, this.f12761b);
    }
}
