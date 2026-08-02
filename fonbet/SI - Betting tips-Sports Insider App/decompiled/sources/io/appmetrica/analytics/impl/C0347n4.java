package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.n4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347n4 extends C0013a3 {

    /* renamed from: b, reason: collision with root package name */
    public final int f14295b;

    public C0347n4(int i5, int i10) {
        super(i10);
        this.f14295b = i5;
    }

    @Override // io.appmetrica.analytics.impl.C0013a3
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb2.append(this.f14295b);
        sb2.append(", bytesTruncated=");
        return d9.e.i(sb2, this.f13333a, '}');
    }
}
