package k60;

import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayAddCardRequest;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayAddCardResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import sa0.C9646a;
import ta0.InterfaceC9791a;

/* loaded from: classes3.dex */
public final class g extends V50.a<MirPayAddCardRequest> implements U50.n<C7596a> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f70950b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f70951c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f70952d;

    /* renamed from: e, reason: collision with root package name */
    private U50.j f70953e;

    /* renamed from: f, reason: collision with root package name */
    private String f70954f;

    /* renamed from: g, reason: collision with root package name */
    private MirPayAddCardRequest f70955g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f70956a;

        /* renamed from: b, reason: collision with root package name */
        private final String f70957b;

        /* renamed from: c, reason: collision with root package name */
        private final String f70958c;

        /* renamed from: d, reason: collision with root package name */
        private final String f70959d;

        /* renamed from: e, reason: collision with root package name */
        private final String f70960e;

        /* renamed from: f, reason: collision with root package name */
        private final String f70961f;

        /* renamed from: g, reason: collision with root package name */
        private final String f70962g;

        public a(String str, boolean z11, String str2, String str3, String str4, String str5, int i11, String str6) {
            str = (i11 & 2) != 0 ? null : str;
            str2 = (i11 & 4) != 0 ? null : str2;
            str3 = (i11 & 8) != 0 ? null : str3;
            str4 = (i11 & 16) != 0 ? null : str4;
            str5 = (i11 & 32) != 0 ? null : str5;
            str6 = (i11 & 64) != 0 ? null : str6;
            this.f70956a = z11;
            this.f70957b = str;
            this.f70958c = str2;
            this.f70959d = str3;
            this.f70960e = str4;
            this.f70961f = str5;
            this.f70962g = str6;
        }

        public final String a() {
            return this.f70957b;
        }

        public final String b() {
            return this.f70959d;
        }

        public final String c() {
            return this.f70958c;
        }

        public final String d() {
            return this.f70962g;
        }

        public final String e() {
            return this.f70961f;
        }

        public final String f() {
            return this.f70960e;
        }

        public final boolean g() {
            return this.f70956a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull InterfaceC9791a mirPayWalletManager, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f70950b = mirPayWalletManager;
        this.f70951c = fintechSettings;
        this.f70952d = fintechAnalyticInteractor;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, sa0.a] */
    public static Unit e(M m11, g gVar, C7596a c7596a, b bVar) {
        try {
            m11.f71787a = gVar.f70950b.k(c7596a.a());
        } catch (MirPayWalletException e11) {
            bVar.invoke(e11);
        }
        return Unit.f71690a;
    }

    public static Unit f(MirPayWalletException mirPayWalletException, g gVar, MirPayWalletException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        L80.a.c("MirPayAddCardBridgeInterface", null, exception);
        L80.a.g(mirPayWalletException);
        String c11 = Sh.b.c("Ошибка распаковки результата, ", exception.getType().name(), ", ", exception.getMessage());
        gVar.k(new NativeResult.Error(c11, NativeResult.Error.a.SDK_ERROR), new a(null, false, null, null, null, c11, 30, exception.getType().name()));
        return Unit.f71690a;
    }

    public static Unit g(g gVar, MirPayAddCardRequest mirPayAddCardRequest, U50.j jVar, sa0.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        gVar.f70950b.c(false);
        L80.a.b("MirPayAddCardBridgeInterface", status.name());
        String b11 = Nk.a.b("Ошибка установки соединения с SDK Mir Pay. Статус: ", status.name());
        NativeResult.Error.a aVar = NativeResult.Error.a.SDK_ERROR;
        gVar.j(new a(mirPayAddCardRequest.getBankId(), false, mirPayAddCardRequest.getEncryptedData(), null, null, b11, 24, aVar.name()));
        jVar.invoke(new NativeResult.Error(b11, aVar));
        return Unit.f71690a;
    }

    public static Unit h(g gVar, sa0.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        L80.a.b("MirPayAddCardBridgeInterface", status.name());
        String b11 = Nk.a.b("Ошибка установки соединения с SDK Mir Pay. Статус: ", status.name());
        NativeResult.Error.a aVar = NativeResult.Error.a.SDK_ERROR;
        gVar.k(new NativeResult.Error(b11, aVar), new a(null, false, null, null, null, b11, 30, aVar.name()));
        return Unit.f71690a;
    }

    public static Unit i(WeakReference weakReference, g gVar, MirPayAddCardRequest mirPayAddCardRequest, U50.j jVar) {
        androidx.fragment.app.r parentFragmentActivity;
        if (weakReference != null) {
            try {
                FintechWebView fintechWebView = (FintechWebView) weakReference.get();
                if (fintechWebView != null && (parentFragmentActivity = fintechWebView.getParentFragmentActivity()) != null) {
                    gVar.f70950b.c(true);
                    gVar.f70950b.h(parentFragmentActivity, gVar.f70951c.getTokenizationRequestCode(), mirPayAddCardRequest.getEncryptedData());
                    gVar.f70954f = mirPayAddCardRequest.getBankId();
                    gVar.f70953e = jVar;
                }
            } catch (MirPayWalletException e11) {
                gVar.f70950b.c(false);
                L80.a.c("MirPayAddCardBridgeInterface", null, e11);
                L80.a.g(e11);
                String c11 = Sh.b.c("Ошибка при получении статуса карт, ", e11.getType().name(), " ", e11.getMessage());
                NativeResult.Error.a aVar = NativeResult.Error.a.IS_NOT_AVAILABLE;
                gVar.j(new a(mirPayAddCardRequest.getBankId(), false, mirPayAddCardRequest.getEncryptedData(), null, null, c11, 24, aVar.name()));
                jVar.invoke(new NativeResult.Error(c11, aVar));
            }
        }
        return Unit.f71690a;
    }

    private final void j(a aVar) {
        MirPayAddCardRequest mirPayAddCardRequest;
        MirPayAddCardRequest mirPayAddCardRequest2;
        boolean g10 = aVar.g();
        Integer num = null;
        InterfaceC6618a interfaceC6618a = this.f70952d;
        if (g10) {
            String a11 = aVar.a();
            if (a11 == null) {
                a11 = this.f70954f;
            }
            String c11 = aVar.c();
            if (c11 != null || ((mirPayAddCardRequest2 = this.f70955g) != null && (c11 = mirPayAddCardRequest2.getEncryptedData()) != null)) {
                num = Integer.valueOf(c11.length());
            }
            interfaceC6618a.O(a11, aVar.f(), num, aVar.b());
            return;
        }
        String a12 = aVar.a();
        if (a12 == null) {
            a12 = this.f70954f;
        }
        String c12 = aVar.c();
        if (c12 != null || ((mirPayAddCardRequest = this.f70955g) != null && (c12 = mirPayAddCardRequest.getEncryptedData()) != null)) {
            num = Integer.valueOf(c12.length());
        }
        interfaceC6618a.u1(a12, aVar.d(), num, aVar.e());
    }

    private final void k(NativeResult nativeResult, a aVar) {
        U50.j jVar = this.f70953e;
        if (jVar != null) {
            jVar.invoke(nativeResult);
        }
        if (this.f70953e != null) {
            j(aVar);
        }
        this.f70953e = null;
        this.f70955g = null;
        this.f70954f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, sa0.a] */
    @Override // U50.n
    public final void a(C7596a c7596a) {
        final C7596a result = c7596a;
        Intrinsics.checkNotNullParameter(result, "result");
        InterfaceC9791a interfaceC9791a = this.f70950b;
        interfaceC9791a.c(false);
        String str = "";
        if (result.b() != -1 || result.a() == null) {
            Moshi c11 = c();
            try {
                str = c11.c(MirPayAddCardResult.class).toJson(new MirPayAddCardResult("", "CANCELED"));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            k(new NativeResult.Success(str), new a(null, true, null, "CANCELED", "", null, 102, null));
            return;
        }
        final M m11 = new M();
        try {
            try {
                m11.f71787a = interfaceC9791a.k(result.a());
            } catch (MirPayWalletException e11) {
                final b bVar = new b(0, e11, this);
                if (e11.getType() == MirPayWalletException.a.NO_CONNECTION) {
                    try {
                        String str2 = this.f70954f;
                        if (str2 != null) {
                            va0.b.a(interfaceC9791a, str2, new Function0() { // from class: k60.c
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.e(M.this, this, result, bVar);
                                }
                            }, new d(this, 0));
                            Unit unit = Unit.f71690a;
                        }
                    } catch (MirPayWalletException e12) {
                        bVar.invoke(e12);
                        Unit unit2 = Unit.f71690a;
                    }
                } else {
                    bVar.invoke(e11);
                }
            }
            C9646a c9646a = (C9646a) m11.f71787a;
            if (c9646a != null) {
                Moshi c12 = c();
                try {
                    str = c12.c(MirPayAddCardResult.class).toJson(new MirPayAddCardResult(c9646a.b(), c9646a.a()));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                k(new NativeResult.Success(str), new a(null, true, null, "ok", ((C9646a) m11.f71787a).b(), null, 102, null));
            }
        } finally {
            interfaceC9791a.closeConnection();
        }
    }

    @Override // V50.a
    @NotNull
    public final Class<MirPayAddCardRequest> b() {
        return MirPayAddCardRequest.class;
    }

    @Override // V50.a
    public final void d(final WeakReference weakReference, Object obj, final U50.j callback) {
        final MirPayAddCardRequest value = (MirPayAddCardRequest) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70955g = value;
        va0.b.a(this.f70950b, value.getBankId(), new Function0() { // from class: k60.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.i(weakReference, this, value, callback);
            }
        }, new Function1() { // from class: k60.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                MirPayAddCardRequest mirPayAddCardRequest = value;
                return g.g(g.this, mirPayAddCardRequest, callback, (sa0.d) obj2);
            }
        });
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "add_card";
    }
}
