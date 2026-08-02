package Fj;

import zendesk.talk.android.internal.call.TalkCallViewModel;

/* loaded from: classes5.dex */
public final class I implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f3727a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3728b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f3729c;

    /* renamed from: d, reason: collision with root package name */
    public final Gg.e f3730d;

    public I(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4) {
        this.f3727a = eVar;
        this.f3728b = eVar2;
        this.f3729c = eVar3;
        this.f3730d = eVar4;
    }

    public static I a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4) {
        return new I(eVar, eVar2, eVar3, eVar4);
    }

    public static TalkCallViewModel c(Kj.b bVar, t tVar, C1160f c1160f, C1155a c1155a) {
        return new TalkCallViewModel(bVar, tVar, c1160f, c1155a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TalkCallViewModel get() {
        return c((Kj.b) this.f3727a.get(), (t) this.f3728b.get(), (C1160f) this.f3729c.get(), (C1155a) this.f3730d.get());
    }
}
