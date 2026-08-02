package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302l9 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final C0335mh f14190a;

    /* renamed from: b, reason: collision with root package name */
    public final C0385oh f14191b;

    /* renamed from: c, reason: collision with root package name */
    public final C0027ah f14192c;

    public C0302l9(X4 x42) {
        this.f14190a = new C0335mh(x42);
        this.f14191b = new C0385oh(x42);
        this.f14192c = new C0027ah(x42);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i5) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC0047bb.a(i5).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f14190a);
        } else if (ordinal == 3) {
            linkedList.add(this.f14192c);
        } else if (ordinal == 27) {
            linkedList.add(this.f14191b);
            linkedList.add(this.f14190a);
        }
        return new V8(linkedList);
    }
}
