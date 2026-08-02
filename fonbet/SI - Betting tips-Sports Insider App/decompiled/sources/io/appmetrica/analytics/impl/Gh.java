package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Gh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f12272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0183gi f12273c;

    public Gh(C0183gi c0183gi, String str, List list) {
        this.f12273c = c0183gi;
        this.f12271a = str;
        this.f12272b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f12273c;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).reportEvent(this.f12271a, CollectionUtils.getMapFromList(this.f12272b));
    }
}
