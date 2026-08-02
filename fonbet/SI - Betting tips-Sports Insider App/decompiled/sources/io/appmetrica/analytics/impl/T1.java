package io.appmetrica.analytics.impl;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f12896a;

    /* renamed from: b, reason: collision with root package name */
    public final C0594x2 f12897b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12898c;

    public T1(List list, C0594x2 c0594x2, List list2) {
        this.f12896a = list;
        this.f12897b = c0594x2;
        this.f12898c = list2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppPermissionsState{mPermissionStateList=");
        sb2.append(this.f12896a);
        sb2.append(", mBackgroundRestrictionsState=");
        sb2.append(this.f12897b);
        sb2.append(", mAvailableProviders=");
        return androidx.appcompat.widget.c1.p(sb2, this.f12898c, '}');
    }
}
