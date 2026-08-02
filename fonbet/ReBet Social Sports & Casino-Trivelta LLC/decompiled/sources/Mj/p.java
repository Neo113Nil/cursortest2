package Mj;

import Dj.q;
import zendesk.talk.android.internal.call.setup.TalkCallSetupViewModel;

/* loaded from: classes5.dex */
public final class p implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f7766a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f7767b;

    public p(Gg.e eVar, Gg.e eVar2) {
        this.f7766a = eVar;
        this.f7767b = eVar2;
    }

    public static p a(Gg.e eVar, Gg.e eVar2) {
        return new p(eVar, eVar2);
    }

    public static TalkCallSetupViewModel c(zendesk.talk.android.internal.call.setup.d dVar, q qVar) {
        return new TalkCallSetupViewModel(dVar, qVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TalkCallSetupViewModel get() {
        return c((zendesk.talk.android.internal.call.setup.d) this.f7766a.get(), (q) this.f7767b.get());
    }
}
