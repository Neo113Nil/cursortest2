package Hj;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes5.dex */
public final class b implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5023a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f5024b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f5025c;

    /* renamed from: d, reason: collision with root package name */
    public final Gg.e f5026d;

    /* renamed from: e, reason: collision with root package name */
    public final Gg.e f5027e;

    /* renamed from: f, reason: collision with root package name */
    public final Gg.e f5028f;

    /* renamed from: g, reason: collision with root package name */
    public final Gg.e f5029g;

    /* renamed from: h, reason: collision with root package name */
    public final Gg.e f5030h;

    /* renamed from: i, reason: collision with root package name */
    public final Gg.e f5031i;

    public b(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4, Gg.e eVar5, Gg.e eVar6, Gg.e eVar7, Gg.e eVar8, Gg.e eVar9) {
        this.f5023a = eVar;
        this.f5024b = eVar2;
        this.f5025c = eVar3;
        this.f5026d = eVar4;
        this.f5027e = eVar5;
        this.f5028f = eVar6;
        this.f5029g = eVar7;
        this.f5030h = eVar8;
        this.f5031i = eVar9;
    }

    public static b a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4, Gg.e eVar5, Gg.e eVar6, Gg.e eVar7, Gg.e eVar8, Gg.e eVar9) {
        return new b(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9);
    }

    public static a c(g gVar, c cVar, k kVar, e eVar, i iVar, AudioManager audioManager, Ej.j jVar, BluetoothManager bluetoothManager, Context context) {
        return new a(gVar, cVar, kVar, eVar, iVar, audioManager, jVar, bluetoothManager, context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((g) this.f5023a.get(), (c) this.f5024b.get(), (k) this.f5025c.get(), (e) this.f5026d.get(), (i) this.f5027e.get(), (AudioManager) this.f5028f.get(), (Ej.j) this.f5029g.get(), (BluetoothManager) this.f5030h.get(), (Context) this.f5031i.get());
    }
}
