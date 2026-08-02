package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class C4 extends Ff {

    /* renamed from: a, reason: collision with root package name */
    public final B4 f12098a;

    public C4(C0596x4 c0596x4) {
        this.f12098a = new B4(c0596x4);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final W8 a(int i5) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC0047bb.a(i5).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f12098a.f12031a);
        } else if (ordinal == 14) {
            arrayList.add(this.f12098a.f12032b);
        } else if (ordinal == 34) {
            arrayList.add(this.f12098a.f12033c);
        }
        return new V8(arrayList);
    }
}
