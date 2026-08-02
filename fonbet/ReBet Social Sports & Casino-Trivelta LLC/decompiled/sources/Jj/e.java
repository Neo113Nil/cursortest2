package Jj;

import Ej.j;
import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class e implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f6196a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f6197b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f6198c;

    /* renamed from: d, reason: collision with root package name */
    public final Gg.e f6199d;

    /* renamed from: e, reason: collision with root package name */
    public final Gg.e f6200e;

    public e(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4, Gg.e eVar5) {
        this.f6196a = eVar;
        this.f6197b = eVar2;
        this.f6198c = eVar3;
        this.f6199d = eVar4;
        this.f6200e = eVar5;
    }

    public static e a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3, Gg.e eVar4, Gg.e eVar5) {
        return new e(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static d c(TelephonyManager telephonyManager, j jVar, Context context, Xj.a aVar, ExecutorService executorService) {
        return new d(telephonyManager, jVar, context, aVar, executorService);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((TelephonyManager) this.f6196a.get(), (j) this.f6197b.get(), (Context) this.f6198c.get(), (Xj.a) this.f6199d.get(), (ExecutorService) this.f6200e.get());
    }
}
