package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class J7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12420b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12421c;

    public J7(String str, HashMap hashMap, String str2) {
        this.f12420b = str;
        this.f12419a = hashMap;
        this.f12421c = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeferredDeeplinkState{mParameters=");
        sb2.append(this.f12419a);
        sb2.append(", mDeeplink='");
        sb2.append(this.f12420b);
        sb2.append("', mUnparsedReferrer='");
        return d9.e.l(sb2, this.f12421c, "'}");
    }
}
