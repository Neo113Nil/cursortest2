package m60;

import C.o0;
import U30.d;
import We.E;
import We.G;
import We.L;
import android.util.Base64InputStream;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.NavigationViewFileData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* renamed from: m60.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8093A implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f74478a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f74479b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f74480c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M f74481d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74482e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final U30.a f74483f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<U30.d> f74484g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f74485h;

    /* renamed from: m60.A$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f74486a;

        /* renamed from: b, reason: collision with root package name */
        private final String f74487b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f74488c;

        /* renamed from: d, reason: collision with root package name */
        private final String f74489d;

        public a() {
            this(15, null, null, null, null);
        }

        public final String a() {
            return this.f74487b;
        }

        public final String b() {
            return this.f74486a;
        }

        public final Integer c() {
            return this.f74488c;
        }

        public final String d() {
            return this.f74489d;
        }

        public final boolean e() {
            return this.f74488c == null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f74486a, aVar.f74486a) && Intrinsics.d(this.f74487b, aVar.f74487b) && Intrinsics.d(this.f74488c, aVar.f74488c) && Intrinsics.d(this.f74489d, aVar.f74489d);
        }

        public final int hashCode() {
            String str = this.f74486a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f74487b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f74488c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f74489d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HeadersResult(contentType=");
            sb2.append(this.f74486a);
            sb2.append(", contentDeposition=");
            sb2.append(this.f74487b);
            sb2.append(", errorCode=");
            sb2.append(this.f74488c);
            sb2.append(", errorDesc=");
            return o0.c(sb2, this.f74489d, ")");
        }

        public a(int i11, Integer num, String str, String str2, String str3) {
            str = (i11 & 1) != 0 ? null : str;
            str2 = (i11 & 2) != 0 ? null : str2;
            num = (i11 & 4) != 0 ? null : num;
            str3 = (i11 & 8) != 0 ? null : str3;
            this.f74486a = str;
            this.f74487b = str2;
            this.f74488c = num;
            this.f74489d = str3;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.NavigationViewFile$handle$1", f = "NavigationViewFile.kt", l = {126}, m = "invokeSuspend")
    /* renamed from: m60.A$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        NavigationViewFileData f74490d;

        /* renamed from: e, reason: collision with root package name */
        String f74491e;

        /* renamed from: f, reason: collision with root package name */
        int f74492f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f74494h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ U50.j f74495i;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.NavigationViewFile$handle$1$1", f = "NavigationViewFile.kt", l = {}, m = "invokeSuspend")
        /* renamed from: m60.A$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C8093A f74496d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Base64InputStream f74497e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f74498f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C8093A c8093a, Base64InputStream base64InputStream, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f74496d = c8093a;
                this.f74497e = base64InputStream;
                this.f74498f = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f74496d, this.f74497e, this.f74498f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                return Boolean.valueOf(this.f74496d.f74483f.k(this.f74497e, this.f74498f));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, U50.j jVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f74494h = str;
            this.f74495i = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8093A.this.new b(this.f74494h, this.f74495i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x01e5 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:6:0x001c, B:8:0x01b4, B:10:0x01bc, B:13:0x01e5, B:14:0x020c, B:18:0x01fd, B:22:0x0031, B:24:0x0041, B:26:0x0047, B:28:0x004d, B:30:0x005b, B:32:0x0061, B:34:0x0067, B:35:0x0074, B:37:0x0083, B:38:0x00ac, B:40:0x00c6, B:41:0x0101, B:43:0x0126, B:45:0x0155, B:47:0x015b, B:49:0x0161, B:51:0x019d, B:56:0x0229, B:58:0x022d, B:61:0x0237), top: B:2:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x01fd A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:6:0x001c, B:8:0x01b4, B:10:0x01bc, B:13:0x01e5, B:14:0x020c, B:18:0x01fd, B:22:0x0031, B:24:0x0041, B:26:0x0047, B:28:0x004d, B:30:0x005b, B:32:0x0061, B:34:0x0067, B:35:0x0074, B:37:0x0083, B:38:0x00ac, B:40:0x00c6, B:41:0x0101, B:43:0x0126, B:45:0x0155, B:47:0x015b, B:49:0x0161, B:51:0x019d, B:56:0x0229, B:58:0x022d, B:61:0x0237), top: B:2:0x0014 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NavigationViewFileData navigationViewFileData;
            String base64;
            boolean z11;
            String str;
            Object f7;
            String str2;
            String url;
            String str3;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74492f;
            U50.j jVar = this.f74495i;
            C8093A c8093a = C8093A.this;
            try {
            } catch (Exception e11) {
                L80.a.c("NavigationViewFile", null, e11);
                jVar.invoke(new NativeResult.Error("Не найден компонент превью для файла типа ", null, 2, null));
            }
            if (i11 == 0) {
                Sc.s.b(obj);
                navigationViewFileData = (NavigationViewFileData) H30.q.a(c8093a.f74478a, this.f74494h, NavigationViewFileData.class);
                if (navigationViewFileData != null && (url = navigationViewFileData.getUrl()) != null && url.length() > 0) {
                    a c11 = C8093A.c(c8093a, navigationViewFileData.getUrl());
                    if (c11.e()) {
                        String b11 = c11.b();
                        if (b11 == null) {
                            b11 = navigationViewFileData.getMimeType();
                        }
                        if (b11 != null) {
                            str3 = b11.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                        } else {
                            str3 = null;
                        }
                        U30.d.Companion.getClass();
                        if (C7714v.A(d.a.b(), str3)) {
                            c8093a.f74479b.t0(-1, C7714v.a0(navigationViewFileData.getUrl()), null);
                            NativeResult.Success.INSTANCE.getClass();
                            jVar.invoke(NativeResult.Success.Companion.a("Открыт компонент превью для файла типа " + str3, null));
                        } else if (C7714v.A(C7714v.p0(d.a.e(), C7714v.p0(d.a.f(), d.a.a())), str3)) {
                            c8093a.f74479b.v0(navigationViewFileData.getFileName(), navigationViewFileData.getUrl(), -1L, String.valueOf(c11.a()), str3, false, navigationViewFileData.getButtonText());
                            NativeResult.Success.INSTANCE.getClass();
                            jVar.invoke(NativeResult.Success.Companion.a("Открыт компонент превью для файла типа " + str3, null));
                        } else {
                            String str4 = "Не найден компонент превью для файла типа " + str3;
                            jVar.invoke(new NativeResult.Error(str4, null, 2, null));
                            c8093a.f74482e.l(c11.c(), navigationViewFileData.getUrl(), str4);
                        }
                    } else {
                        jVar.invoke(new NativeResult.Error("Не найден компонент превью для файла типа " + navigationViewFileData.getMimeType(), null, 2, null));
                        c8093a.f74482e.l(c11.c(), navigationViewFileData.getUrl(), c11.d());
                    }
                } else if (navigationViewFileData == null || (base64 = navigationViewFileData.getBase64()) == null || base64.length() <= 0) {
                    String mimeType = navigationViewFileData != null ? navigationViewFileData.getMimeType() : null;
                    if (mimeType == null) {
                        mimeType = "";
                    }
                    jVar.invoke(new NativeResult.Error("Не найден компонент превью для файла типа ".concat(mimeType), null, 2, null));
                } else {
                    byte[] bytes = navigationViewFileData.getBase64().getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    Base64InputStream base64InputStream = new Base64InputStream(new ByteArrayInputStream(bytes), 2);
                    d.a aVar2 = U30.d.Companion;
                    String mimeType2 = navigationViewFileData.getMimeType();
                    aVar2.getClass();
                    U30.d c12 = d.a.c(mimeType2);
                    String p11 = c8093a.f74483f.p(navigationViewFileData.getFileName(), c12);
                    if (c8093a.f74484g.contains(c12)) {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        He.b bVar = He.b.f10879b;
                        a aVar3 = new a(c8093a, base64InputStream, p11, null);
                        this.f74490d = navigationViewFileData;
                        this.f74491e = p11;
                        this.f74492f = 1;
                        f7 = C10727i.f(bVar, aVar3, this);
                        if (f7 == aVar) {
                            return aVar;
                        }
                        str2 = p11;
                    } else {
                        z11 = false;
                        str = p11;
                        if (z11) {
                            c8093a.f74479b.t0(-1, null, C7714v.a0(navigationViewFileData.getBase64()));
                        } else {
                            c8093a.f74479b.v0(str, "", -1L, "", navigationViewFileData.getMimeType(), true, navigationViewFileData.getButtonText());
                        }
                        NativeResult.Success.Companion companion = NativeResult.Success.INSTANCE;
                        String str5 = "Открыт компонент превью для файла типа " + navigationViewFileData.getMimeType();
                        companion.getClass();
                        jVar.invoke(NativeResult.Success.Companion.a(str5, null));
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f74491e;
            navigationViewFileData = this.f74490d;
            Sc.s.b(obj);
            f7 = obj;
            z11 = ((Boolean) f7).booleanValue();
            if (!z11) {
                String str6 = "Не удалось декодировать base64 и создать файла типа " + navigationViewFileData.getMimeType();
                jVar.invoke(new NativeResult.Error(str6, null, 2, null));
                c8093a.f74482e.E1(str2, navigationViewFileData.getMimeType(), str6);
            }
            str = str2;
            if (z11) {
            }
            NativeResult.Success.Companion companion2 = NativeResult.Success.INSTANCE;
            String str52 = "Открыт компонент превью для файла типа " + navigationViewFileData.getMimeType();
            companion2.getClass();
            jVar.invoke(NativeResult.Success.Companion.a(str52, null));
            return Unit.f71690a;
        }
    }

    public C8093A(@NotNull Moshi moshi, @NotNull S80.b navigation, @NotNull E okHttpClient, @NotNull M coroutineScope, @NotNull InterfaceC6618a analyticInteractor, @NotNull U30.a fileManager) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        this.f74478a = moshi;
        this.f74479b = navigation;
        this.f74480c = okHttpClient;
        this.f74481d = coroutineScope;
        this.f74482e = analyticInteractor;
        this.f74483f = fileManager;
        U30.d[] elements = {U30.d.PDF, U30.d.ZIP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f74484g = C7705l.j0(elements);
        this.f74485h = "view_file";
    }

    public static final a c(C8093A c8093a, String str) {
        Exception exc;
        Throwable th2;
        a aVar;
        c8093a.getClass();
        L l11 = null;
        l11 = null;
        r1 = null;
        L l12 = null;
        try {
            try {
                G.a aVar2 = new G.a();
                try {
                    aVar2.f(null, "HEAD");
                    aVar2.k(str);
                    L execute = c8093a.f74480c.a(aVar2.b()).execute();
                    try {
                        if (execute.v()) {
                            aVar = new a(12, null, L.q(execute, "content-type"), L.q(execute, "content-disposition"), null);
                        } else {
                            Integer valueOf = Integer.valueOf(execute.m());
                            We.M c11 = execute.c();
                            aVar = new a(3, valueOf, null, null, c11 != null ? c11.string() : null);
                        }
                        execute.close();
                        return aVar;
                    } catch (Exception e11) {
                        exc = e11;
                        l11 = execute;
                        L80.a.g(exc);
                        a aVar3 = new a(3, -1, null, null, exc.getLocalizedMessage());
                        if (l11 != null) {
                            l11.close();
                        }
                        return aVar3;
                    } catch (Throwable th3) {
                        th2 = th3;
                        l12 = execute;
                        if (l12 == null) {
                            throw th2;
                        }
                        l12.close();
                        throw th2;
                    }
                } catch (Exception e12) {
                    exc = e12;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Throwable th5) {
                th2 = th5;
            }
        } catch (Exception e13) {
            exc = e13;
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f74485h;
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10727i.c(this.f74481d, null, null, new b(parameterJson, (U50.j) callback, null), 3);
    }
}
