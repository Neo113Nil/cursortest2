package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0294l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f14161b;

    public RunnableC0294l1(C0493t1 c0493t1, List list) {
        this.f14161b = c0493t1;
        this.f14160a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f14161b).reportAnr(CollectionUtils.getMapFromList(this.f14160a));
    }
}
