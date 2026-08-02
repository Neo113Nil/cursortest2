package f50;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import C.o0;
import Sc.C4001c;
import Sc.C4005g;
import Sc.s;
import U30.d;
import We.E;
import We.G;
import We.L;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.webkit.URLUtil;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d40.InterfaceC6083a;
import e50.InterfaceC6302a;
import e50.d;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2SharingAction;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2PdfDTO;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import x40.C10656a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L0;
import xe.M;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class f extends G40.a<Cbottom2PdfDTO> implements f.a {

    /* renamed from: N, reason: collision with root package name */
    private static final Pattern f62857N = Pattern.compile(".*filename\\*+=([^']*'')?([^;]*)");

    /* renamed from: A, reason: collision with root package name */
    private B0 f62858A;

    /* renamed from: B, reason: collision with root package name */
    private String f62859B;

    /* renamed from: C, reason: collision with root package name */
    private Cbottom2PdfDTO f62860C;

    /* renamed from: D, reason: collision with root package name */
    private H40.a f62861D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f62862E;

    /* renamed from: F, reason: collision with root package name */
    private AbstractC9782b f62863F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f62864G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final x0<e50.e> f62865H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final x0<H40.a> f62866I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f62867J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final x0<C9987a> f62868K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private C0 f62869L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final C0 f62870M;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f62871d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final R30.a f62872e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final S80.b f62873f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final E f62874g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final L30.l f62875h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f62876i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C10656a f62877j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC6302a f62878k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final e50.f f62879l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final U30.a f62880m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final r90.f f62881n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f62882o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Q90.c f62883p;

    /* renamed from: q, reason: collision with root package name */
    private Parcelable f62884q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f62885r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final C1003f f62886s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f62887t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private e50.d f62888u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f62889v;

    /* renamed from: w, reason: collision with root package name */
    private String f62890w;

    /* renamed from: x, reason: collision with root package name */
    private String f62891x;

    /* renamed from: y, reason: collision with root package name */
    private String f62892y;

    /* renamed from: z, reason: collision with root package name */
    private f50.c f62893z;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$1", f = "CbottomPdfPreviewViewModel.kt", l = {149}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62894d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f62895e;

        /* renamed from: f50.f$a$a, reason: collision with other inner class name */
        static final class C1002a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f62897a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f62898b;

            C1002a(f fVar, M m11) {
                this.f62897a = fVar;
                this.f62898b = m11;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (((Unit) obj) != null) {
                    final f fVar = this.f62897a;
                    if (Intrinsics.d(fVar.f62887t, a.b.f96629a)) {
                        fVar.f62889v = true;
                        String str = fVar.f62892y;
                        String str2 = fVar.f62891x;
                        final M m11 = this.f62898b;
                        E30.g.a(new Function2() { // from class: f50.d
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                String fileName = (String) obj2;
                                String fileType = (String) obj3;
                                Intrinsics.checkNotNullParameter(fileName, "fileName");
                                Intrinsics.checkNotNullParameter(fileType, "fileType");
                                return C10727i.c(m11, null, null, new e(fVar, fileName, fileType, null), 3);
                            }
                        }, str, str2);
                    }
                }
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = f.this.new a(dVar);
            aVar.f62895e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62894d;
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.f62895e;
                f fVar = f.this;
                x0<Unit> e11 = fVar.H0().e();
                C1002a c1002a = new C1002a(fVar, m11);
                this.f62894d = 1;
                if (e11.collect(c1002a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f62899a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f62900b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f62901c;

        public b(@NotNull String type, @NotNull String path, @NotNull String fileName) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.f62899a = type;
            this.f62900b = path;
            this.f62901c = fileName;
        }

        @NotNull
        public final String a() {
            return this.f62901c;
        }

        @NotNull
        public final String b() {
            return this.f62900b;
        }

        @NotNull
        public final String c() {
            return this.f62899a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f62899a, bVar.f62899a) && Intrinsics.d(this.f62900b, bVar.f62900b) && Intrinsics.d(this.f62901c, bVar.f62901c);
        }

        public final int hashCode() {
            return this.f62901c.hashCode() + G.g.a(this.f62899a.hashCode() * 31, 31, this.f62900b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DownloadingResult(type=");
            sb2.append(this.f62899a);
            sb2.append(", path=");
            sb2.append(this.f62900b);
            sb2.append(", fileName=");
            return o0.c(sb2, this.f62901c, ")");
        }
    }

    /* synthetic */ class c extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f.w0((f) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7719a implements Function1<AbstractC9781a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC9781a abstractC9781a) {
            ((w0) this.receiver).tryEmit(abstractC9781a);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class e extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((f) this.receiver).permissionUpdated(null);
            return Unit.f71690a;
        }
    }

    /* renamed from: f50.f$f, reason: collision with other inner class name */
    public static final class C1003f extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            L80.a.c("CbottomPdfPreviewViewModel", null, th2);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$startDownloadingJob$1", f = "CbottomPdfPreviewViewModel.kt", l = {188}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62902d;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new g(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String url;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62902d;
            if (i11 == 0) {
                s.b(obj);
                f fVar = f.this;
                Cbottom2PdfDTO E02 = fVar.E0();
                if (E02 != null && (url = E02.getUrl()) != null) {
                    fVar.f62859B = url;
                    this.f62902d = 1;
                    if (f.B0(fVar, url, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* synthetic */ class h extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((f) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class i extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((f) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class j extends C7735q implements Function1<ActionResult2UI, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActionResult2UI actionResult2UI) {
            ActionResult2UI p02 = actionResult2UI;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((f) this.receiver).d0(p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context, @NotNull R30.a appCoroutineScopes, @NotNull S80.b fintechNavigation, @NotNull E okHttpClient, @NotNull L30.l pdfBitmapRenderManager, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull C10656a cbottomMapper2, @NotNull InterfaceC6302a pdfDisplay, @NotNull e50.f snackCreator, @NotNull U30.a fileManager, @NotNull r90.f permissionsDelegate, @NotNull ru.ozon.fintech.settings.domain.a settings, @NotNull Q90.c featureToggles, @NotNull InterfaceC6083a exchanger) {
        super(exchanger);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(pdfBitmapRenderManager, "pdfBitmapRenderManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(pdfDisplay, "pdfDisplay");
        Intrinsics.checkNotNullParameter(snackCreator, "snackCreator");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        this.f62871d = context;
        this.f62872e = appCoroutineScopes;
        this.f62873f = fintechNavigation;
        this.f62874g = okHttpClient;
        this.f62875h = pdfBitmapRenderManager;
        this.f62876i = fintechAnalyticInteractor;
        this.f62877j = cbottomMapper2;
        this.f62878k = pdfDisplay;
        this.f62879l = snackCreator;
        this.f62880m = fileManager;
        this.f62881n = permissionsDelegate;
        this.f62882o = settings;
        this.f62883p = featureToggles;
        this.f62885r = Intrinsics.d(Build.MANUFACTURER, "Xiaomi");
        this.f62886s = new C1003f(J.f105405n0);
        this.f62887t = a.b.f96629a;
        this.f62888u = d.a.f62013a;
        this.f62864G = O0.a(null);
        this.f62865H = O0.a(null);
        this.f62866I = O0.a(null);
        this.f62867J = O0.a(null);
        this.f62868K = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_LATEST;
        this.f62869L = E0.a(0, 1, enumC11113a);
        this.f62870M = E0.a(0, 1, enumC11113a);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(14:5|6|(1:(1:(3:10|11|12)(2:14|15))(1:16))(2:109|(1:112)(1:111))|17|(1:19)|20|21|22|(1:106)(24:25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36)|37|39|40|41|42|43|(2:45|47)|48|49|(3:94|95|96)(1:51)|52|53|55|56|57|58)|59|(1:61)|(1:63)|11|12))|113|6|(0)(0)|17|(0)|20|21|22|(0)|106|59|(0)|(0)|11|12|(5:(1:87)|(1:79)|(0)|(1:92)|(1:74))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00b5, code lost:
    
        r7 = "";
        r11 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B0(f fVar, String str, kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        Object obj;
        int i11;
        f fVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object f7;
        L execute;
        Throwable th2;
        Throwable th3;
        fVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f62919h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f62919h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = kVar.f62917f;
                obj = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f62919h;
                if (i11 != 0) {
                    s.b(obj2);
                    L80.a.a("CbottomPdfPreviewViewModel", "startDownloading");
                    fVar.f62887t = a.c.f96630a;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    l lVar = new l(fVar, null);
                    kVar.f62915d = fVar;
                    kVar.f62916e = str;
                    kVar.f62919h = 1;
                    if (C10727i.f(l02, lVar, kVar) == obj) {
                        return obj;
                    }
                    fVar2 = fVar;
                    str2 = str;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return Unit.f71690a;
                    }
                    str2 = kVar.f62916e;
                    fVar2 = kVar.f62915d;
                    s.b(obj2);
                }
                str3 = fVar2.f62890w;
                if (str3 != null) {
                    C10727i.c(fVar2.f62872e.b(), null, null, new f50.j(str3, null), 3);
                }
                String str8 = "";
                G.a aVar = new G.a();
                aVar.k(str2);
                execute = fVar2.f62874g.a(aVar.b()).execute();
                We.M c11 = execute.c();
                if (execute.v() || c11 == null) {
                    str6 = "";
                    str7 = str6;
                } else {
                    L80.a.a("CbottomPdfPreviewViewModel", "response isSuccessful");
                    String q11 = L.q(execute, "content-length");
                    if (q11 != null) {
                        Long.parseLong(q11);
                    }
                    String q12 = L.q(execute, "content-disposition");
                    if (q12 == null) {
                        q12 = "";
                    }
                    String G02 = G0(D0(q12), str2);
                    String q13 = L.q(execute, "content-type");
                    if (q13 == null) {
                        q13 = "";
                    }
                    File file = new File(fVar2.f62871d.getFilesDir(), "downloads");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    File file2 = new File(file, G02);
                    InputStream a22 = c11.source().a2();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                            long j11 = 0;
                            for (int read = a22.read(bArr); read >= 0; read = a22.read(bArr)) {
                                fileOutputStream.write(bArr, 0, read);
                                j11 += read;
                            }
                            if (j11 > 0) {
                                try {
                                    String absolutePath = file2.getAbsolutePath();
                                    String str9 = q13;
                                    str6 = absolutePath;
                                    str8 = str9;
                                    str7 = G02;
                                } catch (Throwable th4) {
                                    th = th4;
                                    str4 = "";
                                    str5 = str4;
                                    th3 = th;
                                    try {
                                        throw th3;
                                    } catch (Throwable th5) {
                                        try {
                                            Vd0.b.a(fileOutputStream, th3);
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th2 = th;
                                            try {
                                                throw th2;
                                            } catch (Throwable th7) {
                                                try {
                                                    Vd0.b.a(a22, th2);
                                                    throw th7;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    str8 = q13;
                                                    L80.a.g(e);
                                                    str6 = str4;
                                                    str7 = str5;
                                                    b bVar = new b(str8, str6, str7);
                                                    fVar2.f62891x = bVar.c();
                                                    fVar2.f62890w = bVar.b();
                                                    fVar2.f62892y = bVar.a();
                                                    String a11 = bVar.a();
                                                    String c12 = bVar.c();
                                                    kVar.f62915d = null;
                                                    kVar.f62916e = null;
                                                    kVar.f62919h = 2;
                                                    C10720e0 c10720e02 = C10720e0.f105451a;
                                                    f7 = C10727i.f(De.s.f6650a.plus(fVar2.f62886s), new f50.h(fVar2, c12, a11, null), kVar);
                                                    if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                                                    }
                                                    if (f7 == obj) {
                                                    }
                                                    return Unit.f71690a;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                str6 = "";
                                str7 = str6;
                            }
                            try {
                                Unit unit = Unit.f71690a;
                                try {
                                    fileOutputStream.close();
                                    try {
                                        a22.close();
                                    } catch (Exception e12) {
                                        e = e12;
                                        str5 = str7;
                                        str4 = str6;
                                        L80.a.g(e);
                                        str6 = str4;
                                        str7 = str5;
                                        b bVar2 = new b(str8, str6, str7);
                                        fVar2.f62891x = bVar2.c();
                                        fVar2.f62890w = bVar2.b();
                                        fVar2.f62892y = bVar2.a();
                                        String a112 = bVar2.a();
                                        String c122 = bVar2.c();
                                        kVar.f62915d = null;
                                        kVar.f62916e = null;
                                        kVar.f62919h = 2;
                                        C10720e0 c10720e022 = C10720e0.f105451a;
                                        f7 = C10727i.f(De.s.f6650a.plus(fVar2.f62886s), new f50.h(fVar2, c122, a112, null), kVar);
                                        if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                                        }
                                        if (f7 == obj) {
                                        }
                                        return Unit.f71690a;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    str5 = str7;
                                    str4 = str6;
                                    q13 = str8;
                                    th2 = th;
                                    throw th2;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                str5 = str7;
                                str4 = str6;
                                q13 = str8;
                                th3 = th;
                                throw th3;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            q13 = "";
                            str4 = q13;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        q13 = "";
                        str4 = q13;
                        str5 = str4;
                    }
                }
                b bVar22 = new b(str8, str6, str7);
                fVar2.f62891x = bVar22.c();
                fVar2.f62890w = bVar22.b();
                fVar2.f62892y = bVar22.a();
                String a1122 = bVar22.a();
                String c1222 = bVar22.c();
                kVar.f62915d = null;
                kVar.f62916e = null;
                kVar.f62919h = 2;
                C10720e0 c10720e0222 = C10720e0.f105451a;
                f7 = C10727i.f(De.s.f6650a.plus(fVar2.f62886s), new f50.h(fVar2, c1222, a1122, null), kVar);
                if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                    f7 = Unit.f71690a;
                }
                if (f7 == obj) {
                    return obj;
                }
                return Unit.f71690a;
            }
        }
        kVar = new k(fVar, cVar);
        Object obj22 = kVar.f62917f;
        obj = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f62919h;
        if (i11 != 0) {
        }
        str3 = fVar2.f62890w;
        if (str3 != null) {
        }
        String str82 = "";
        G.a aVar2 = new G.a();
        aVar2.k(str2);
        execute = fVar2.f62874g.a(aVar2.b()).execute();
        We.M c112 = execute.c();
        if (execute.v()) {
        }
        str6 = "";
        str7 = str6;
        b bVar222 = new b(str82, str6, str7);
        fVar2.f62891x = bVar222.c();
        fVar2.f62890w = bVar222.b();
        fVar2.f62892y = bVar222.a();
        String a11222 = bVar222.a();
        String c12222 = bVar222.c();
        kVar.f62915d = null;
        kVar.f62916e = null;
        kVar.f62919h = 2;
        C10720e0 c10720e02222 = C10720e0.f105451a;
        f7 = C10727i.f(De.s.f6650a.plus(fVar2.f62886s), new f50.h(fVar2, c12222, a11222, null), kVar);
        if (f7 != Wc.a.COROUTINE_SUSPENDED) {
        }
        if (f7 == obj) {
        }
        return Unit.f71690a;
    }

    private static String D0(String str) {
        try {
            return URLDecoder.decode(str, Charsets.UTF_8.toString());
        } catch (Exception e11) {
            Ns.b.c("Error while trying to decode contentDeposition ", C4001c.b(e11), "CbottomPdfPreviewViewModel");
            return str;
        }
    }

    private static String G0(String str, String str2) {
        String D02;
        int J11 = kotlin.text.h.J(str, "filename=", 0, false, 6);
        Matcher matcher = f62857N.matcher(str);
        if (matcher.matches() && matcher.groupCount() >= 2) {
            D02 = matcher.group(2);
        } else if (J11 != -1) {
            String substring = str.substring(kotlin.text.h.J(str, "=", J11, false, 4) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            D02 = kotlin.text.h.X(substring, "\"", "", false);
        } else {
            U30.d.Companion.getClass();
            Set g10 = d.a.g();
            if (!(g10 instanceof Collection) || !g10.isEmpty()) {
                Iterator it = g10.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.h.t(str2, "." + ((String) it.next()), false)) {
                        String substring2 = str2.substring(kotlin.text.h.f(str2, "/", 0, 6) + 1);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        D02 = D0(substring2);
                        break;
                    }
                }
            }
            D02 = null;
        }
        if (D02 != null) {
            return D02;
        }
        String guessFileName = URLUtil.guessFileName(str2, str, null);
        Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(...)");
        return guessFileName;
    }

    private final void Q0() {
        this.f62887t = a.b.f96629a;
        B0 b02 = this.f62858A;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f62858A = null;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f62858A = C10727i.c(a11, He.b.f10879b.plus(this.f62886s), null, new g(null), 2);
    }

    public static Unit k0(f fVar, String path, Activity activity) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(activity, "activity");
        File file = new File(path);
        if (!fVar.f62885r) {
            Uri d11 = FileProvider.d(fVar.f62871d, fVar.f62882o.i(), file);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType(U30.d.PDF.d());
            intent.putExtra("android.intent.extra.STREAM", d11);
            fVar.f62870M.tryEmit(intent);
        } else if (Build.VERSION.SDK_INT < 29) {
            fVar.f62893z = new f50.c(fVar, file);
            fVar.f62862E = true;
            fVar.f62881n.g(activity);
        } else {
            C6788a a11 = androidx.lifecycle.x0.a(fVar);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new f50.g(file, fVar, null), 2);
        }
        return Unit.f71690a;
    }

    public static final Object u0(f fVar, String str, String str2, kotlin.coroutines.d dVar) {
        fVar.getClass();
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(De.s.f6650a.plus(fVar.f62886s), new f50.h(fVar, str2, str, null), (kotlin.coroutines.jvm.internal.c) dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final boolean v0(f fVar) {
        fVar.getClass();
        Boolean bool = null;
        try {
            String str = fVar.f62890w;
            if (str != null) {
                boolean g10 = fVar.f62875h.g(new File(str), fVar.f62883p.q(S90.c.MOB_PDF_QUALITY).b().getStringData());
                fVar.f62867J.setValue(Boolean.TRUE);
                bool = Boolean.valueOf(g10);
            }
        } catch (Exception e11) {
            L80.a.c("CbottomPdfPreviewViewModel", null, e11);
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void w0(f fVar) {
        fVar.getClass();
        L80.a.a("CbottomPdfPreviewViewModel", "restartDownloading");
        Cbottom2PdfDTO cbottom2PdfDTO = fVar.f62860C;
        Ns.b.c("Url is: ", cbottom2PdfDTO != null ? cbottom2PdfDTO.getUrl() : null, "CbottomPdfPreviewViewModel");
        fVar.f62887t = a.b.f96629a;
        B0 b02 = fVar.f62858A;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        fVar.f62858A = null;
        C6788a a11 = androidx.lifecycle.x0.a(fVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        fVar.f62858A = C10727i.c(a11, He.b.f10879b, null, new f50.i(fVar, null), 2);
    }

    public final void C0(String str) {
        Cbottom2SharingAction cbottom2SharingAction;
        if (str != null) {
            try {
                cbottom2SharingAction = this.f62877j.c(str);
            } catch (Exception e11) {
                Ns.b.c("Error parsing CBottomAction ", C4001c.b(e11), "CbottomPdfPreviewViewModel");
                cbottom2SharingAction = null;
            }
            if ((cbottom2SharingAction != null ? cbottom2SharingAction : null) != null) {
            }
        }
    }

    protected final Cbottom2PdfDTO E0() {
        return this.f62860C;
    }

    @NotNull
    public final x0<H40.a> F0() {
        return this.f62866I;
    }

    @NotNull
    public final L30.l H0() {
        return this.f62875h;
    }

    @NotNull
    public final x0<e50.e> I0() {
        return this.f62865H;
    }

    @NotNull
    public final x0<ScreenState> J0() {
        return this.f62864G;
    }

    @NotNull
    public final C0 K0() {
        return this.f62870M;
    }

    @NotNull
    public final x0<Boolean> L0() {
        return this.f62867J;
    }

    public final void M0(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f62873f.hideBottomNavigation(activity);
    }

    public final boolean N0() {
        return this.f62882o.isStandAloneIntegration();
    }

    public final void O0() {
        this.f62867J.setValue(Boolean.FALSE);
    }

    public final void P0(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f62873f.showBottomNavigation(activity);
    }

    public final void R0(int i11, int i12) {
        L30.l lVar = this.f62875h;
        lVar.j(i11);
        lVar.i(i12);
    }

    @Override // G40.a
    public final Cbottom2PdfDTO f0() {
        return this.f62860C;
    }

    @Override // G40.a
    public final void g0() {
        super.g0();
        this.f62889v = false;
        Q0();
    }

    @NotNull
    public final w0<AbstractC9781a> getPermissionAction() {
        return this.f62869L;
    }

    @NotNull
    public final x0<C9987a> getPermissionScreenState() {
        return this.f62868K;
    }

    @Override // G40.a
    protected final void handleState() {
        Pair pair;
        ru.ozon.fintech.network.models.a aVar = this.f62887t;
        boolean z11 = aVar instanceof a.C2102a;
        Context context = this.f62871d;
        if (z11) {
            pair = new Pair(ScreenState.INSTANCE.getGeneralError(new c(0, this, f.class, "onRestartDownloading", "onRestartDownloading()V", 0), context, FinSmallButtonState.Type.PRIMARY), this.f62861D);
        } else if (Intrinsics.d(aVar, a.b.f96629a)) {
            pair = new Pair(null, this.f62861D);
        } else {
            if (!Intrinsics.d(aVar, a.c.f96630a)) {
                throw new Sc.o();
            }
            pair = new Pair(new ScreenState.Progress(0L, null, 3, null), null);
        }
        ScreenState screenState = (ScreenState) pair.a();
        H40.a aVar2 = (H40.a) pair.b();
        this.f62864G.setValue(screenState);
        this.f62866I.setValue(aVar2);
        e50.d dVar = this.f62888u;
        if (!Intrinsics.d(dVar, d.a.f62013a)) {
            if (dVar instanceof d.b) {
                this.f62865H.setValue(e50.e.a(this.f62875h.f()));
            } else {
                if (!(dVar instanceof d.c)) {
                    throw new Sc.o();
                }
                L80.a.a("CbottomPdfPreviewViewModel", "PdfFileDownloadResult.SuccessDownloaded");
            }
        }
        x0<C9987a> x0Var = this.f62868K;
        AbstractC9782b abstractC9782b = this.f62863F;
        C0 c02 = this.f62869L;
        x0Var.setValue(this.f62881n.q(abstractC9782b, context, new d(1, c02, w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8), new e(0, this, f.class, "closePermissionRequest", "closePermissionRequest()V", 0)));
        c02.tryEmit(r90.f.p(this.f62863F));
    }

    @Override // G40.a
    @NotNull
    public final String i0() {
        String id2;
        Cbottom2PdfDTO cbottom2PdfDTO = this.f62860C;
        if ((cbottom2PdfDTO != null ? cbottom2PdfDTO.getId() : null) == null) {
            return getUuid();
        }
        Cbottom2PdfDTO cbottom2PdfDTO2 = this.f62860C;
        return (cbottom2PdfDTO2 == null || (id2 = cbottom2PdfDTO2.getId()) == null) ? "" : id2;
    }

    @Override // G40.a
    public final void j0(String str, Parcelable parcelable, Integer num, @NotNull String uuid, Boolean bool) {
        CbottomType type;
        Rect a11;
        Rect a12;
        Rect a13;
        List<Integer> footerPaddings;
        List<Integer> headerPaddings;
        List<Integer> mainPaddings;
        String id2;
        List<F40.a> main;
        String str2;
        String id3;
        List<F40.a> footer;
        String str3;
        String id4;
        List<F40.a> header;
        String str4;
        String id5;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        super.j0(str, parcelable, num, uuid, null);
        this.f62884q = parcelable;
        C10656a c10656a = this.f62877j;
        if (num != null && num.intValue() == 2 && parcelable != null && (parcelable instanceof Cbottom2PdfDTO)) {
            this.f62860C = (Cbottom2PdfDTO) parcelable;
        } else if (num != null && num.intValue() == 2 && str != null) {
            this.f62860C = (Cbottom2PdfDTO) c10656a.d(str);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            Cbottom2PdfDTO cbottom2PdfDTO = this.f62860C;
            if (cbottom2PdfDTO != null && (header = cbottom2PdfDTO.getHeader()) != null) {
                Cbottom2PdfDTO cbottom2PdfDTO2 = this.f62860C;
                if (cbottom2PdfDTO2 != null && (id5 = cbottom2PdfDTO2.getId()) != null) {
                    str4 = id5;
                    h hVar = new h(1, this, f.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
                    c10656a.getClass();
                    arrayList2.addAll(C10656a.b(str4, header, hVar, null));
                }
                str4 = "";
                h hVar2 = new h(1, this, f.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
                c10656a.getClass();
                arrayList2.addAll(C10656a.b(str4, header, hVar2, null));
            }
            Cbottom2PdfDTO cbottom2PdfDTO3 = this.f62860C;
            if (cbottom2PdfDTO3 != null && (footer = cbottom2PdfDTO3.getFooter()) != null) {
                Cbottom2PdfDTO cbottom2PdfDTO4 = this.f62860C;
                if (cbottom2PdfDTO4 != null && (id4 = cbottom2PdfDTO4.getId()) != null) {
                    str3 = id4;
                    i iVar = new i(1, this, f.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
                    c10656a.getClass();
                    arrayList3.addAll(C10656a.b(str3, footer, iVar, null));
                }
                str3 = "";
                i iVar2 = new i(1, this, f.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
                c10656a.getClass();
                arrayList3.addAll(C10656a.b(str3, footer, iVar2, null));
            }
            Cbottom2PdfDTO cbottom2PdfDTO5 = this.f62860C;
            if (cbottom2PdfDTO5 != null && (main = cbottom2PdfDTO5.getMain()) != null) {
                Cbottom2PdfDTO cbottom2PdfDTO6 = this.f62860C;
                if (cbottom2PdfDTO6 != null && (id3 = cbottom2PdfDTO6.getId()) != null) {
                    str2 = id3;
                    j jVar = new j(1, this, f.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
                    c10656a.getClass();
                    arrayList.addAll(C10656a.b(str2, main, jVar, null));
                }
                str2 = "";
                j jVar2 = new j(1, this, f.class, "actionListenerV2", "actionListenerV2(Lru/ozon/fintech/ui/ActionResult2UI;)V", 0);
                c10656a.getClass();
                arrayList.addAll(C10656a.b(str2, main, jVar2, null));
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            Cbottom2PdfDTO cbottom2PdfDTO7 = this.f62860C;
            String id6 = cbottom2PdfDTO7 != null ? cbottom2PdfDTO7.getId() : null;
            Cbottom2PdfDTO cbottom2PdfDTO8 = this.f62860C;
            this.f62876i.I(message, id6, (cbottom2PdfDTO8 == null || (type = cbottom2PdfDTO8.getType()) == null) ? null : type.name());
        }
        Cbottom2PdfDTO cbottom2PdfDTO9 = this.f62860C;
        String str5 = (cbottom2PdfDTO9 == null || (id2 = cbottom2PdfDTO9.getId()) == null) ? "" : id2;
        Cbottom2PdfDTO cbottom2PdfDTO10 = this.f62860C;
        if (cbottom2PdfDTO10 == null || (mainPaddings = cbottom2PdfDTO10.getMainPaddings()) == null || (a11 = E30.i.b(mainPaddings)) == null) {
            a11 = E30.i.a();
        }
        Rect rect = a11;
        Cbottom2PdfDTO cbottom2PdfDTO11 = this.f62860C;
        if (cbottom2PdfDTO11 == null || (headerPaddings = cbottom2PdfDTO11.getHeaderPaddings()) == null || (a12 = E30.i.b(headerPaddings)) == null) {
            a12 = E30.i.a();
        }
        Rect rect2 = a12;
        Cbottom2PdfDTO cbottom2PdfDTO12 = this.f62860C;
        if (cbottom2PdfDTO12 == null || (footerPaddings = cbottom2PdfDTO12.getFooterPaddings()) == null || (a13 = E30.i.b(footerPaddings)) == null) {
            a13 = E30.i.a();
        }
        this.f62861D = new H40.a(str5, arrayList2, arrayList3, arrayList, rect, a13, rect2, null, false, null);
        String str6 = this.f62859B;
        Cbottom2PdfDTO cbottom2PdfDTO13 = this.f62860C;
        if (!Intrinsics.d(str6, cbottom2PdfDTO13 != null ? cbottom2PdfDTO13.getUrl() : null)) {
            Q0();
            this.f62875h.d();
        }
        handleState();
    }

    @Override // G40.a
    public final void onBackPressed() {
        super.onBackPressed();
        Cbottom2PdfDTO cbottom2PdfDTO = this.f62860C;
        if (cbottom2PdfDTO != null ? Intrinsics.d(cbottom2PdfDTO.getCanClose(), Boolean.TRUE) : false) {
            this.f62878k.c(i0(), getUuid());
            this.f62887t = a.b.f96629a;
            B0 b02 = this.f62858A;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f62858A = null;
            String str = this.f62890w;
            if (str != null) {
                C10727i.c(this.f62872e.b(), null, null, new f50.j(str, null), 3);
            }
            this.f62873f.pop();
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        this.f62887t = a.b.f96629a;
        B0 b02 = this.f62858A;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f62858A = null;
        String str = this.f62890w;
        if (str != null) {
            C10727i.c(this.f62872e.b(), null, null, new f50.j(str, null), 3);
        }
        this.f62873f.pop();
        this.f62875h.d();
    }

    public final void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f62862E) {
            this.f62881n.g(activity);
        }
    }

    @Override // r90.f.a
    public final void permissionUpdated(AbstractC9782b abstractC9782b) {
        this.f62863F = abstractC9782b;
        if (abstractC9782b instanceof AbstractC9782b.a) {
            f50.c cVar = this.f62893z;
            if (cVar != null) {
                cVar.invoke();
            }
            this.f62893z = null;
        }
        handleState();
    }
}
