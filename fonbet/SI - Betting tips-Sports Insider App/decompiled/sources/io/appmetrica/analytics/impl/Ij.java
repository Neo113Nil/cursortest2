package io.appmetrica.analytics.impl;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ij implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f12394a;

    public Ij(Map map) {
        this.f12394a = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportAnr(this.f12394a);
    }
}
