package d70;

import A30.m;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import ei0.InterfaceC6369b;
import g30.InterfaceC6618a;
import ij0.InterfaceC7087b;

/* loaded from: classes3.dex */
public final class l implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61261a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f61262b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f61263c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f61264d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a f61265e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a f61266f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a f61267g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a f61268h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a f61269i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a f61270j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a f61271k;

    public l(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8, Pc.a aVar9, Pc.a aVar10) {
        this.f61262b = aVar;
        this.f61263c = aVar2;
        this.f61264d = aVar3;
        this.f61265e = aVar4;
        this.f61266f = aVar5;
        this.f61267g = aVar6;
        this.f61268h = aVar7;
        this.f61269i = aVar8;
        this.f61270j = aVar9;
        this.f61271k = aVar10;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f61261a) {
            case 0:
                return new k((S80.b) this.f61262b.get(), (V60.a) this.f61263c.get(), (Q90.c) this.f61264d.get(), (R30.a) this.f61265e.get(), (c30.j) this.f61266f.get(), (InterfaceC6618a) this.f61267g.get(), (K80.b) this.f61268h.get(), (SharedPreferences) this.f61269i.get(), (Moshi) this.f61270j.get(), (m) this.f61271k.get());
            default:
                return new oi0.e((InterfaceC6369b) ((Jb.f) this.f61270j).get(), (InterfaceC7087b) this.f61262b.get(), Jb.d.a((Pa0.e) this.f61271k), Jb.d.a(this.f61263c), Jb.d.a(this.f61264d), Jb.d.a(this.f61265e), Jb.d.a(this.f61266f), Jb.d.a(this.f61267g), Jb.d.a(this.f61268h), Jb.d.a(this.f61269i));
        }
    }

    public l(Jb.f fVar, Pc.a aVar, Pa0.e eVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8) {
        this.f61270j = fVar;
        this.f61262b = aVar;
        this.f61271k = eVar;
        this.f61263c = aVar2;
        this.f61264d = aVar3;
        this.f61265e = aVar4;
        this.f61266f = aVar5;
        this.f61267g = aVar6;
        this.f61268h = aVar7;
        this.f61269i = aVar8;
    }
}
