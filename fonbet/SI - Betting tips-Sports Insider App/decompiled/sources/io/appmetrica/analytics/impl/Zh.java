package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f13313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13314b;

    public Zh(C0183gi c0183gi, List list) {
        this.f13314b = c0183gi;
        this.f13313a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13314b;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportAnr(CollectionUtils.getMapFromList(this.f13313a));
    }
}
