package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0394p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f14449c;

    public RunnableC0394p1(C0493t1 c0493t1, String str, List list) {
        this.f14449c = c0493t1;
        this.f14447a = str;
        this.f14448b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f14449c).reportEvent(this.f14447a, CollectionUtils.getMapFromList(this.f14448b));
    }
}
