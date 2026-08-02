package ru.ozon.id.nativeauth.account;

import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import dc0.C6145I;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/id/nativeauth/account/OzonIdAuthenticatorService;", "Landroid/app/Service;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonIdAuthenticatorService extends Service {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97189a = k.b(new a());

    static final class a extends AbstractC7737t implements Function0<C6145I> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6145I invoke() {
            OzonIdAuthenticatorService context = OzonIdAuthenticatorService.this;
            Intrinsics.checkNotNullParameter(context, "context");
            return new C6145I(context);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return ((C6145I) this.f97189a.getValue()).getIBinder();
    }
}
