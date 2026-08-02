package yg0;

import B90.C2613o;
import Dj.EnumC2873a;
import F3.D;
import Sc.o;
import Sc.s;
import android.app.Application;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.K1;
import io.sentry.U;
import io.sentry.android.core.k0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg0.InterfaceC9693a;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import yg0.AbstractC10901d;
import yg0.AbstractC10902e;

/* renamed from: yg0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10900c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f106628a;

    /* renamed from: b, reason: collision with root package name */
    private final Bb0.a f106629b;

    /* renamed from: c, reason: collision with root package name */
    private final String f106630c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final I f106631d;

    public C10900c(Application application, Bb0.a aVar, String str) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f106628a = application;
        this.f106629b = aVar;
        this.f106630c = str;
        this.f106631d = dispatcher;
    }

    public static final void a(C10900c c10900c, AbstractC10902e abstractC10902e, U u11, String str, String str2) {
        c10900c.getClass();
        K1.d().b(3000L);
        C2613o c2613o = new C2613o(str2, 7);
        Application application = c10900c.f106628a;
        k0.c(application, c2613o);
        K1.d().m(new D(c10900c, u11, str2));
        if (abstractC10902e instanceof AbstractC10902e.b) {
            K1.d().y(((AbstractC10902e.b) abstractC10902e).a());
        } else {
            if (!(abstractC10902e instanceof AbstractC10902e.a)) {
                throw new o();
            }
            K1.d().u(new IllegalStateException(((AbstractC10902e.a) abstractC10902e).a()));
        }
        K1.d().b(3000L);
        k0.c(application, new C2613o(str, 7));
        K1.d().m(new D(c10900c, u11, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull AbstractC10902e abstractC10902e, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10898a c10898a;
        int i11;
        try {
            if (cVar instanceof C10898a) {
                c10898a = (C10898a) cVar;
                int i12 = c10898a.f106622f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c10898a.f106622f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c10898a.f106620d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c10898a.f106622f;
                    if (i11 != 0) {
                        s.b(obj);
                        Bb0.a aVar2 = this.f106629b;
                        if (aVar2 == null) {
                            return new AbstractC10901d.a("OzonIdApi is null");
                        }
                        if (!aVar2.a().a().a()) {
                            return AbstractC10901d.C2305d.f106635a;
                        }
                        U clone = K1.d().t().clone();
                        Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
                        String dsn = clone.getOptions().getDsn();
                        if (dsn == null) {
                            return AbstractC10901d.b.f106633a;
                        }
                        String str = this.f106630c;
                        if (str == null) {
                            InterfaceC9693a.f98765a.e("Используется DSN дефолтного STG-проекта Sentry");
                            str = "https://311ff205f89aeebbab6bb9a7f6cbb548@sentry-stage.s.o3.ru/620";
                        }
                        String str2 = str;
                        I i13 = this.f106631d;
                        C10899b c10899b = new C10899b(this, abstractC10902e, clone, dsn, str2, null);
                        c10898a.f106622f = 1;
                        if (C10727i.f(i13, c10899b, c10898a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return AbstractC10901d.c.f106634a;
                }
            }
            if (i11 != 0) {
            }
            return AbstractC10901d.c.f106634a;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            InterfaceC9693a.f98765a.f(EnumC2873a.ERROR, "SendTestSentryEventUseCase: Ошибка при отправке ивента тестового ивента", e12);
            String localizedMessage = e12.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            return new AbstractC10901d.a(localizedMessage);
        }
        c10898a = new C10898a(this, cVar);
        Object obj2 = c10898a.f106620d;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10898a.f106622f;
    }
}
