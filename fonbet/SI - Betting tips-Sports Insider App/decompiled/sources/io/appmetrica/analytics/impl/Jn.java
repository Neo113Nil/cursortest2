package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Jn implements Gi {

    /* renamed from: a, reason: collision with root package name */
    public final int f12451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12452b;

    /* renamed from: c, reason: collision with root package name */
    public int f12453c = 0;

    public Jn(int i5, int i10) {
        this.f12451a = i5;
        this.f12452b = i10;
    }

    public final int a() {
        return this.f12452b;
    }

    public final boolean b() {
        int i5 = this.f12453c;
        this.f12453c = i5 + 1;
        return i5 < this.f12451a;
    }

    public final void c() {
        this.f12453c = 0;
    }
}
