package com.google.android.play.core.appupdate;

import android.os.RemoteException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends y7.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w7.g f6002c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, w7.g gVar, w7.g gVar2, Object obj2, int i5) {
        super(gVar);
        this.f6001b = i5;
        this.f6004e = obj;
        this.f6002c = gVar2;
        this.f6003d = obj2;
    }

    @Override // y7.k
    public final void a() {
        switch (this.f6001b) {
            case 0:
                w7.g gVar = this.f6002c;
                k kVar = (k) this.f6004e;
                String str = (String) this.f6003d;
                try {
                    kVar.f6011a.f25718m.z(kVar.f6012b, k.a(kVar, str), new j(kVar, gVar, str));
                    return;
                } catch (RemoteException e7) {
                    k.f6009e.f(e7, "requestUpdateInfo(%s)", str);
                    gVar.c(new RuntimeException(e7));
                    return;
                }
            case 1:
                w7.g gVar2 = this.f6002c;
                k kVar2 = (k) this.f6004e;
                try {
                    kVar2.f6011a.f25718m.o(kVar2.f6012b, k.b(), new i(kVar2, new com.android.billingclient.api.a("OnCompleteUpdateCallback"), gVar2));
                    return;
                } catch (RemoteException e9) {
                    k.f6009e.f(e9, "completeUpdate(%s)", (String) this.f6003d);
                    gVar2.c(new RuntimeException(e9));
                    return;
                }
            default:
                synchronized (((y7.n) this.f6004e).f25712f) {
                    try {
                        y7.n nVar = (y7.n) this.f6004e;
                        w7.g gVar3 = this.f6002c;
                        nVar.f25711e.add(gVar3);
                        gVar3.f24979a.addOnCompleteListener(new io.sentry.util.network.b(15, nVar, gVar3));
                        if (((y7.n) this.f6004e).f25716k.getAndIncrement() > 0) {
                            ((y7.n) this.f6004e).f25708b.g("Already connected to the service.", new Object[0]);
                        }
                        y7.n.b((y7.n) this.f6004e, (y7.k) this.f6003d);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, w7.g gVar, String str, w7.g gVar2) {
        super(gVar);
        this.f6001b = 0;
        this.f6004e = kVar;
        this.f6003d = str;
        this.f6002c = gVar2;
    }
}
