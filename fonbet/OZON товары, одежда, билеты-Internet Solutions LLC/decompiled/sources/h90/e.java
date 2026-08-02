package h90;

import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import j90.InterfaceC7310a;
import ru.ozon.fintech.base.shared.FintechExportedContentProviderInteractor;

/* loaded from: classes3.dex */
public final class e implements Jb.e<C6881d> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<f> f65159a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f65160b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC7310a> f65161c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f65162d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Moshi> f65163e;

    /* renamed from: f, reason: collision with root package name */
    private final g90.e f65164f;

    public e(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, g90.e eVar) {
        this.f65159a = aVar;
        this.f65160b = aVar2;
        this.f65161c = aVar3;
        this.f65162d = aVar4;
        this.f65163e = aVar5;
        this.f65164f = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C6881d(this.f65159a.get(), this.f65160b.get(), this.f65161c.get(), this.f65162d.get(), this.f65163e.get(), (FintechExportedContentProviderInteractor) this.f65164f.get());
    }
}
