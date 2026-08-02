package xf0;

import G.g;
import Ld0.c;
import Ld0.e;
import Sc.InterfaceC4008j;
import Sc.k;
import We.A;
import We.C4873o;
import We.E;
import We.G;
import We.InterfaceC4875q;
import We.L;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import xb0.InterfaceC10696a;
import xb0.InterfaceC10697b;

/* renamed from: xf0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10771a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f105554a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f105555b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f105556c;

    /* renamed from: xf0.a$a, reason: collision with other inner class name */
    static final class C2281a extends AbstractC7737t implements Function1<C4873o, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2281a f105557b = new C2281a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(C4873o c4873o) {
            C4873o it = c4873o;
            Intrinsics.checkNotNullParameter(it, "it");
            return g.c(it.f(), "=", it.i());
        }
    }

    /* renamed from: xf0.a$b */
    static final class b extends AbstractC7737t implements Function0<InterfaceC10697b> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC10697b invoke() {
            e d11 = C10771a.this.f105554a.d(InterfaceC10696a.class);
            if (d11 instanceof InterfaceC10697b) {
                return (InterfaceC10697b) d11;
            }
            return null;
        }
    }

    public C10771a(@NotNull c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f105554a = store;
        this.f105555b = k.b(new b());
        E.a aVar = new E.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.f(0L, timeUnit);
        aVar.X(0L, timeUnit);
        aVar.b0(0L, timeUnit);
        aVar.d(3000L, TimeUnit.MILLISECONDS);
        aVar.l(false);
        this.f105556c = new E(aVar);
    }

    private final G.a b(G.a aVar, URL toHttpUrlOrNull) {
        InterfaceC10697b interfaceC10697b;
        InterfaceC4875q cookieJar;
        List<C4873o> loadForRequest;
        A.f33515l.getClass();
        Intrinsics.checkNotNullParameter(toHttpUrlOrNull, "$this$toHttpUrlOrNull");
        String url = toHttpUrlOrNull.toString();
        Intrinsics.checkNotNullExpressionValue(url, "toString()");
        A e11 = A.b.e(url);
        if (e11 != null && (interfaceC10697b = (InterfaceC10697b) this.f105555b.getValue()) != null && (cookieJar = interfaceC10697b.getCookieJar()) != null && (loadForRequest = cookieJar.loadForRequest(e11)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : loadForRequest) {
                C4873o c4873o = (C4873o) obj;
                if (Intrinsics.d(c4873o.f(), "x-o3-app-name") || Intrinsics.d(c4873o.f(), "x-o3-app-version")) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                aVar.d("Cookie", C7714v.V(arrayList, "; ", null, null, C2281a.f105557b, 30));
            }
        }
        return aVar;
    }

    private static URL c(int i11, String str, String str2) {
        return new URL(str + "://" + str2 + ProductContainerDTO.RATIO_DELIMITER + i11);
    }

    private final EnumC9053a f(URL url) {
        try {
            G.a aVar = new G.a();
            aVar.l(url);
            aVar.f(null, "HEAD");
            aVar.d("Connection", "close");
            b(aVar, url);
            L execute = this.f105556c.a(aVar.b()).execute();
            try {
                if (execute.m() == -1) {
                    throw new IllegalArgumentException("Некорректный HTTP код ответа");
                }
                Unit unit = Unit.f71690a;
                execute.close();
                return EnumC9053a.Available;
            } finally {
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception unused) {
            return EnumC9053a.NotAvailable;
        }
    }

    @NotNull
    public final EnumC9053a d(int i11, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        return f(c(i11, "http", domain));
    }

    @NotNull
    public final EnumC9053a e(int i11, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        return f(c(i11, "https", domain));
    }
}
