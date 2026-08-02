package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026ag implements Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0129eg f13356a;

    public C0026ag(C0129eg c0129eg) {
        this.f13356a = c0129eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        C0129eg c0129eg = this.f13356a;
        ArrayList arrayList = c0129eg.f13696g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C0359ng c0359ng = (C0359ng) next;
            c0129eg.f13692c.getClass();
            String str = c0359ng != null ? c0359ng.f14361a : null;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        c0129eg.a(c0129eg.f13692c.a(CollectionsKt.D(arrayList2)));
    }
}
