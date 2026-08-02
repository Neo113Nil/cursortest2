package com.google.android.flexbox;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public int f4228a;

    /* renamed from: b, reason: collision with root package name */
    public int f4229b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        int i5 = this.f4229b;
        int i10 = eVar.f4229b;
        return i5 != i10 ? i5 - i10 : this.f4228a - eVar.f4228a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Order{order=");
        sb2.append(this.f4229b);
        sb2.append(", index=");
        return d9.e.i(sb2, this.f4228a, '}');
    }
}
