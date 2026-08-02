package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f15332a;

    public V(InterfaceC0674i interfaceC0674i) {
        this.f15332a = interfaceC0674i.a();
    }

    public final void a(C0677l c0677l) {
        for (T t3 : this.f15332a) {
            C0678m c0678m = null;
            if (c0677l != null) {
                C0677l c0677l2 = c0677l.f15378a ? c0677l : null;
                if (c0677l2 != null) {
                    c0678m = c0677l2.f15379b;
                }
            }
            t3.a(c0678m);
        }
    }
}
