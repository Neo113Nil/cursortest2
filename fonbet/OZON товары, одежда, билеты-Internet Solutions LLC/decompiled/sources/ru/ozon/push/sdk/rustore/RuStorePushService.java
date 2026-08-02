package ru.ozon.push.sdk.rustore;

import Sc.InterfaceC4008j;
import Sc.k;
import Wh0.e;
import Yg0.a;
import hh0.InterfaceC6956a;
import jh0.b;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/push/sdk/rustore/RuStorePushService;", "LUl0/a;", "<init>", "()V", "rustore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class RuStorePushService extends Ul0.a {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97729i;

    static final class a extends AbstractC7737t implements Function0<InterfaceC6956a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f97730b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC6956a invoke() {
            Yg0.a.f35038y.getClass();
            return a.C0652a.b().q();
        }
    }

    public RuStorePushService() {
        InterfaceC4008j b11 = k.b(a.f97730b);
        this.f97729i = b11;
        ((InterfaceC6956a) b11.getValue()).a(e.a(this));
    }

    @Override // Ul0.a
    public final void g() {
        ((InterfaceC6956a) this.f97729i.getValue()).e(e.a(this));
    }

    @Override // Ul0.a
    public final void h(@NotNull Tl0.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ((InterfaceC6956a) this.f97729i.getValue()).c(new RemoteMessage(message.b(), U.u(message.a())), b.RUSTORE, e.a(this));
    }

    @Override // Ul0.a
    public final void i(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        ((InterfaceC6956a) this.f97729i.getValue()).b(token, b.RUSTORE);
    }

    @Override // Ul0.a, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((InterfaceC6956a) this.f97729i.getValue()).d(this);
    }
}
