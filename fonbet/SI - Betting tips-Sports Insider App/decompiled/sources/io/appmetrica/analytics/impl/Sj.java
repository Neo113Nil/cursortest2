package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Sj {

    /* renamed from: a, reason: collision with root package name */
    public final String f12880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12881b;

    public Sj(String str, String str2) {
        this.f12880a = str;
        this.f12881b = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb2.append(this.f12880a);
        sb2.append("', eventValue='");
        return d9.e.l(sb2, this.f12881b, "')");
    }
}
