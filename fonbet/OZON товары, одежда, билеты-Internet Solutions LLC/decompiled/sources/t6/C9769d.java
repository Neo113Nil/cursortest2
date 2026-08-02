package t6;

import ru.ozon.fintech.wallet.manager.domain.mpay.a;
import v6.ServiceConnectionC10259c;

/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9769d implements ServiceConnectionC10259c.InterfaceC2223c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f99209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.b f99210b;

    C9769d(String str, a.b bVar) {
        this.f99209a = str;
        this.f99210b = bVar;
    }

    @Override // v6.ServiceConnectionC10259c.InterfaceC2223c
    public final void a(final ServiceConnectionC10259c serviceConnectionC10259c) {
        final a.b bVar = this.f99210b;
        final String str = this.f99209a;
        new Thread(new Runnable() { // from class: t6.c
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC10259c serviceConnectionC10259c2 = ServiceConnectionC10259c.this;
                String str2 = str;
                a.b bVar2 = bVar;
                try {
                    bVar2.a(C9771f.d(serviceConnectionC10259c2, str2));
                } catch (C9772g e11) {
                    bVar2.b(e11);
                }
            }
        }).start();
    }
}
