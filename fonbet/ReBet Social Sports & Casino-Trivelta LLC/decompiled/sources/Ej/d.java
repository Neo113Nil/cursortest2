package Ej;

import android.bluetooth.BluetoothManager;
import android.content.Context;

/* loaded from: classes5.dex */
public final class d implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f3139a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3140b;

    public d(a aVar, Gg.e eVar) {
        this.f3139a = aVar;
        this.f3140b = eVar;
    }

    public static d a(a aVar, Gg.e eVar) {
        return new d(aVar, eVar);
    }

    public static BluetoothManager c(a aVar, Context context) {
        return aVar.c(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothManager get() {
        return c(this.f3139a, (Context) this.f3140b.get());
    }
}
