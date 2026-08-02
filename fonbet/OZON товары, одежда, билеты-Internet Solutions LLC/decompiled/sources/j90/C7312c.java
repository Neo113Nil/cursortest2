package j90;

import Jb.e;
import android.content.Context;
import ru.ozon.fintech.notifications.network.FintechNotificationApi;
import w30.m;

/* renamed from: j90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7312c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69521a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f69522b;

    public /* synthetic */ C7312c(Pc.a aVar, int i11) {
        this.f69521a = i11;
        this.f69522b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f69521a) {
            case 0:
                return new C7311b((FintechNotificationApi) this.f69522b.get());
            default:
                return new m((Context) this.f69522b.get());
        }
    }
}
