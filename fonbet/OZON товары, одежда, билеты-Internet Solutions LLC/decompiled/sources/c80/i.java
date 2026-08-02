package c80;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import Sc.C4005g;
import Sc.s;
import U30.d;
import We.E;
import We.G;
import We.L;
import a80.InterfaceC4961a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.MenuItem;
import android.webkit.URLUtil;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import b80.InterfaceC5585a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import ru.ozon.app.android.R;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class i extends E30.d implements f.a {

    /* renamed from: I, reason: collision with root package name */
    private static final Pattern f56735I = Pattern.compile(".*filename\\*+=([^']*'')?([^;]*)");

    /* renamed from: A, reason: collision with root package name */
    private U30.d f56736A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final x0<InterfaceC5585a> f56737B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final x0<FinToolbarState> f56738C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f56739D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private String f56740E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final x0<C9987a> f56741F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private C0 f56742G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final C0 f56743H;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f56744a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final R30.a f56745b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f56746c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final E f56747d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final U30.a f56748e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final r90.f f56749f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final L30.l f56750g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final K40.a f56751h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f56752i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Q90.c f56753j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f56754k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f56755l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f56756m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private String f56757n;

    /* renamed from: o, reason: collision with root package name */
    private String f56758o;

    /* renamed from: p, reason: collision with root package name */
    private String f56759p;

    /* renamed from: q, reason: collision with root package name */
    private String f56760q;

    /* renamed from: r, reason: collision with root package name */
    private String f56761r;

    /* renamed from: s, reason: collision with root package name */
    private String f56762s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC9782b f56763t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f56764u;

    /* renamed from: v, reason: collision with root package name */
    private c80.f f56765v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f56766w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private InterfaceC4961a f56767x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f56768y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final g f56769z;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$1", f = "SharingPreviewViewModel.kt", l = {137}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56770d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f56771e;

        /* renamed from: c80.i$a$a, reason: collision with other inner class name */
        static final class C0858a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f56773a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f56774b;

            C0858a(i iVar, M m11) {
                this.f56773a = iVar;
                this.f56774b = m11;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (((Unit) obj) != null) {
                    final i iVar = this.f56773a;
                    if (Intrinsics.d(iVar.f56766w, a.b.f96629a)) {
                        iVar.f56768y = true;
                        String str = iVar.f56762s;
                        String str2 = iVar.f56761r;
                        String str3 = iVar.f56760q;
                        final M m11 = this.f56774b;
                        E30.g.b(new InterfaceC6511n() { // from class: c80.g
                            @Override // fd.InterfaceC6511n
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                String fileName = (String) obj2;
                                String fileType = (String) obj3;
                                String filePath = (String) obj4;
                                Intrinsics.checkNotNullParameter(fileName, "fileName");
                                Intrinsics.checkNotNullParameter(fileType, "fileType");
                                Intrinsics.checkNotNullParameter(filePath, "filePath");
                                return C10727i.c(m11, null, null, new h(iVar, fileName, fileType, new File(filePath), null), 3);
                            }
                        }, str, str2, str3);
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
            a aVar = i.this.new a(dVar);
            aVar.f56771e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56770d;
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.f56771e;
                i iVar = i.this;
                x0<Unit> e11 = iVar.C0().e();
                C0858a c0858a = new C0858a(iVar, m11);
                this.f56770d = 1;
                if (e11.collect(c0858a, this) == aVar) {
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

    /* synthetic */ class b extends C7735q implements Function1<MenuItem, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItem menuItem) {
            i.d0((i) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class c extends C7735q implements Function1<MenuItem, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItem menuItem) {
            i.d0((i) this.receiver);
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
            ((i) this.receiver).permissionUpdated(null);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class f extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            i.s0((i) this.receiver);
            return Unit.f71690a;
        }
    }

    public static final class g extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            L80.a.c("SharingPreviewViewModel", null, th2);
        }
    }

    public i(@NotNull Context context, @NotNull R30.a appCoroutineScopes, @NotNull S80.b fintechNavigation, @NotNull E okHttpClient, @NotNull U30.a fileManager, @NotNull r90.f permissionsDelegate, @NotNull L30.l pdfBitmapRenderManager, @NotNull K40.a cbottomDisplay, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull Q90.c featureToggles, @NotNull ru.ozon.fintech.settings.domain.a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(pdfBitmapRenderManager, "pdfBitmapRenderManager");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f56744a = context;
        this.f56745b = appCoroutineScopes;
        this.f56746c = fintechNavigation;
        this.f56747d = okHttpClient;
        this.f56748e = fileManager;
        this.f56749f = permissionsDelegate;
        this.f56750g = pdfBitmapRenderManager;
        this.f56751h = cbottomDisplay;
        this.f56752i = fintechAnalyticInteractor;
        this.f56753j = featureToggles;
        this.f56754k = settings;
        this.f56755l = settings.i();
        this.f56756m = Intrinsics.d(Build.MANUFACTURER, "Xiaomi");
        this.f56757n = "";
        this.f56766w = a.b.f96629a;
        this.f56767x = InterfaceC4961a.C0701a.f36435a;
        this.f56769z = new g(J.f105405n0);
        this.f56737B = O0.a(InterfaceC5585a.C0832a.f55718a);
        this.f56738C = O0.a(null);
        this.f56739D = O0.a(null);
        this.f56740E = "";
        this.f56741F = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_LATEST;
        this.f56742G = E0.a(0, 1, enumC11113a);
        this.f56743H = E0.a(0, 1, enumC11113a);
        permissionsDelegate.s(this);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    private final FinLargeButtonState B0() {
        String str = this.f56758o;
        if (str == null) {
            str = this.f56744a.getString(this.f56756m ? R.string.fintech_save_file_btn_text : R.string.fintech_share_file_btn_text);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        return new FinLargeButtonState("share", str, null, null, FinLargeButtonState.Type.PRIMARY, null, null, null, null, 492, null);
    }

    public static final void d0(i iVar) {
        String str = iVar.f56760q;
        if (str != null) {
            C10727i.c(iVar.f56745b.b(), null, null, new n(str, null), 3);
        }
        iVar.f56746c.pop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState() {
        i iVar;
        FinToolbarState finToolbarState;
        InterfaceC5585a bVar;
        ScreenState progress;
        x0<FinToolbarState> x0Var = this.f56738C;
        int length = this.f56757n.length();
        Context context = this.f56744a;
        if (length > 0) {
            finToolbarState = new FinToolbarState(this.f56757n, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(FinToolbarState.INSTANCE.getCLOSE_WITH_CIRCLE_BACKGROUND_MENU_RES()), null, null, new b(1, this, i.class, "close", "close(Landroid/view/MenuItem;)V", 0), 17, 28670, null);
            iVar = this;
        } else {
            iVar = this;
            finToolbarState = new FinToolbarState(context.getString(R.string.fintech_share_file_default_toolbar_title), null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(FinToolbarState.INSTANCE.getCLOSE_WITH_CIRCLE_BACKGROUND_MENU_RES()), null, null, new c(1, iVar, i.class, "close", "close(Landroid/view/MenuItem;)V", 0), 17, 28670, null);
        }
        x0Var.setValue(finToolbarState);
        x0<InterfaceC5585a> x0Var2 = iVar.f56737B;
        InterfaceC4961a interfaceC4961a = iVar.f56767x;
        if (Intrinsics.d(interfaceC4961a, InterfaceC4961a.C0701a.f36435a)) {
            bVar = InterfaceC5585a.C0832a.f55718a;
        } else if (interfaceC4961a instanceof InterfaceC4961a.c) {
            InterfaceC4961a.c cVar = (InterfaceC4961a.c) interfaceC4961a;
            bVar = new InterfaceC5585a.c(cVar.a(), cVar.b(), cVar.c(), iVar.B0());
        } else {
            if (!(interfaceC4961a instanceof InterfaceC4961a.b)) {
                throw new Sc.o();
            }
            bVar = new InterfaceC5585a.b(iVar.B0(), iVar.f56750g.f());
        }
        x0Var2.setValue(bVar);
        x0<C9987a> x0Var3 = iVar.f56741F;
        AbstractC9782b abstractC9782b = iVar.f56763t;
        C0 c02 = iVar.f56742G;
        x0Var3.setValue(iVar.f56749f.q(abstractC9782b, context, new d(1, c02, w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8), new e(0, iVar, i.class, "closePermissionRequest", "closePermissionRequest()V", 0)));
        c02.tryEmit(r90.f.p(iVar.f56763t));
        x0<ScreenState> x0Var4 = iVar.f56739D;
        ru.ozon.fintech.network.models.a aVar = iVar.f56766w;
        if (aVar instanceof a.C2102a) {
            progress = ScreenState.INSTANCE.getGeneralError(new f(0, iVar, i.class, "onRestartDownloading", "onRestartDownloading()V", 0), context, FinSmallButtonState.Type.PRIMARY);
        } else if (Intrinsics.d(aVar, a.b.f96629a)) {
            progress = null;
        } else {
            if (!Intrinsics.d(aVar, a.c.f96630a)) {
                throw new Sc.o();
            }
            progress = new ScreenState.Progress(0L, null, 3, null);
        }
        x0Var4.setValue(progress);
    }

    public static final Object p0(i iVar, String str, String str2, long j11, kotlin.coroutines.jvm.internal.j jVar) {
        iVar.getClass();
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(De.s.f6650a.plus(iVar.f56769z), new k(str2, iVar, str, j11, null), jVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public static final boolean r0(i iVar) {
        iVar.getClass();
        Boolean bool = null;
        try {
            String str = iVar.f56760q;
            if (str != null) {
                bool = Boolean.valueOf(iVar.f56750g.g(new File(str), iVar.f56753j.q(S90.c.MOB_PDF_QUALITY).b().getStringData()));
            }
        } catch (Exception e11) {
            L80.a.c("SharingPreviewViewModel", null, e11);
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void s0(i iVar) {
        iVar.getClass();
        L80.a.a("SharingPreviewViewModel", "restartDownloading");
        L80.a.a("SharingPreviewViewModel", "Url is: " + iVar.f56759p);
        C6788a a11 = androidx.lifecycle.x0.a(iVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new m(iVar, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y0(i iVar, String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        int i11;
        String str3;
        String str4;
        Object f7;
        Object obj;
        i iVar2;
        String str5;
        L execute;
        We.M c11;
        InputStream a22;
        Throwable th2;
        Throwable th3;
        iVar.getClass();
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i12 = oVar.f56798i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oVar.f56798i = i12 - LinearLayoutManager.INVALID_OFFSET;
                o oVar2 = oVar;
                Object obj2 = oVar2.f56796g;
                Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = oVar2.f56798i;
                String str6 = null;
                int i13 = 0;
                String str7 = "";
                if (i11 != 0) {
                    s.b(obj2);
                    L80.a.a("SharingPreviewViewModel", "startDownloading");
                    iVar.f56766w = a.c.f96630a;
                    iVar.handleState();
                    File file = new File(iVar.f56748e.h("downloads"), str2);
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.f(absolutePath);
                    try {
                        G.a aVar = new G.a();
                        aVar.k(str);
                        execute = iVar.f56747d.a(aVar.b()).execute();
                        c11 = execute.c();
                    } catch (Exception e11) {
                        e = e11;
                        str3 = "";
                        str6 = str3;
                    }
                    if (!execute.v() || c11 == null) {
                        str3 = "";
                        str4 = str3;
                        iVar.f56761r = str4;
                        iVar.f56760q = absolutePath;
                        long length = file.length();
                        oVar2.f56793d = iVar;
                        oVar2.f56794e = str;
                        oVar2.f56795f = str4;
                        oVar2.f56798i = 1;
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        f7 = C10727i.f(De.s.f6650a.plus(iVar.f56769z), new k(str4, iVar, str2, length, null), oVar2);
                        obj = f7;
                        if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                            obj = Unit.f71690a;
                        }
                        if (obj != obj3) {
                            return obj3;
                        }
                        iVar2 = iVar;
                        str5 = str;
                    } else {
                        L80.a.a("SharingPreviewViewModel", "response isSuccessful");
                        String q11 = L.q(execute, "content-length");
                        if (q11 != null) {
                            try {
                                Long.parseLong(q11);
                            } catch (Exception e12) {
                                e = e12;
                                str6 = "";
                                str3 = str6;
                                L80.a.g(e);
                                str4 = str6;
                                iVar.f56761r = str4;
                                iVar.f56760q = absolutePath;
                                long length2 = file.length();
                                oVar2.f56793d = iVar;
                                oVar2.f56794e = str;
                                oVar2.f56795f = str4;
                                oVar2.f56798i = 1;
                                C10720e0 c10720e02 = C10720e0.f105451a;
                                f7 = C10727i.f(De.s.f6650a.plus(iVar.f56769z), new k(str4, iVar, str2, length2, null), oVar2);
                                obj = f7;
                                if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                                }
                                if (obj != obj3) {
                                }
                            }
                        }
                        String q12 = L.q(execute, "content-type");
                        if (q12 == null) {
                            q12 = "";
                        }
                        try {
                            a22 = c11.source().a2();
                        } catch (Exception e13) {
                            e = e13;
                            L80.a.g(e);
                            str4 = str6;
                            iVar.f56761r = str4;
                            iVar.f56760q = absolutePath;
                            long length22 = file.length();
                            oVar2.f56793d = iVar;
                            oVar2.f56794e = str;
                            oVar2.f56795f = str4;
                            oVar2.f56798i = 1;
                            C10720e0 c10720e022 = C10720e0.f105451a;
                            f7 = C10727i.f(De.s.f6650a.plus(iVar.f56769z), new k(str4, iVar, str2, length22, null), oVar2);
                            obj = f7;
                            if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                            }
                            if (obj != obj3) {
                            }
                        }
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(absolutePath));
                            try {
                                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                                int read = a22.read(bArr);
                                long j11 = 0;
                                while (read >= 0) {
                                    fileOutputStream.write(bArr, i13, read);
                                    str3 = str7;
                                    j11 += read;
                                    try {
                                        read = a22.read(bArr);
                                        str7 = str3;
                                        i13 = 0;
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                        str7 = str3;
                                        try {
                                            throw th3;
                                        } catch (Throwable th5) {
                                            try {
                                                Vd0.b.a(fileOutputStream, th3);
                                                throw th5;
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                str6 = str7;
                                                try {
                                                    throw th2;
                                                } catch (Throwable th7) {
                                                    Vd0.b.a(a22, th2);
                                                    throw th7;
                                                }
                                            }
                                        }
                                    }
                                }
                                str3 = str7;
                                str6 = j11 > 0 ? q12 : str3;
                                try {
                                    Unit unit = Unit.f71690a;
                                    try {
                                        fileOutputStream.close();
                                        a22.close();
                                        str4 = str6;
                                        iVar.f56761r = str4;
                                        iVar.f56760q = absolutePath;
                                        long length222 = file.length();
                                        oVar2.f56793d = iVar;
                                        oVar2.f56794e = str;
                                        oVar2.f56795f = str4;
                                        oVar2.f56798i = 1;
                                        C10720e0 c10720e0222 = C10720e0.f105451a;
                                        f7 = C10727i.f(De.s.f6650a.plus(iVar.f56769z), new k(str4, iVar, str2, length222, null), oVar2);
                                        obj = f7;
                                        if (f7 != Wc.a.COROUTINE_SUSPENDED) {
                                        }
                                        if (obj != obj3) {
                                        }
                                    } catch (Throwable th8) {
                                        th2 = th8;
                                        throw th2;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    str7 = str6;
                                    th3 = th;
                                    throw th3;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                str3 = str7;
                            }
                        } catch (Throwable th11) {
                            str3 = "";
                            th2 = th11;
                            str6 = str3;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = oVar2.f56795f;
                    str5 = oVar2.f56794e;
                    iVar2 = oVar2.f56793d;
                    s.b(obj2);
                    str3 = "";
                }
                InterfaceC6618a interfaceC6618a = iVar2.f56752i;
                boolean z11 = str4.length() <= 0;
                U30.d dVar = iVar2.f56736A;
                String d11 = dVar == null ? dVar.d() : null;
                interfaceC6618a.i0(str5, d11 != null ? str3 : d11, z11);
                return Unit.f71690a;
            }
        }
        oVar = new o(iVar, cVar);
        o oVar22 = oVar;
        Object obj22 = oVar22.f56796g;
        Object obj32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oVar22.f56798i;
        String str62 = null;
        int i132 = 0;
        String str72 = "";
        if (i11 != 0) {
        }
        InterfaceC6618a interfaceC6618a2 = iVar2.f56752i;
        if (str4.length() <= 0) {
        }
        U30.d dVar2 = iVar2.f56736A;
        if (dVar2 == null) {
        }
        interfaceC6618a2.i0(str5, d11 != null ? str3 : d11, z11);
        return Unit.f71690a;
    }

    public static final String z0(i iVar, long j11) {
        iVar.getClass();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        float f7 = j11;
        Context context = iVar.f56744a;
        return f7 < 1048576.0f ? U7.d.e(decimalFormat.format(Float.valueOf(f7 / 1024.0f)), context.getString(R.string.fintech_share_file_subtitle_size_suffix_kb)) : f7 < 1.0737418E9f ? U7.d.e(decimalFormat.format(Float.valueOf((f7 / 1024.0f) * 1024.0f)), context.getString(R.string.fintech_share_file_subtitle_size_suffix_mb)) : U7.d.e(decimalFormat.format(Float.valueOf((f7 / 1024.0f) * 1024.0f * 1024.0f)), context.getString(R.string.fintech_share_file_subtitle_size_suffix_gb));
    }

    @NotNull
    public final x0<InterfaceC5585a> A0() {
        return this.f56737B;
    }

    @NotNull
    public final L30.l C0() {
        return this.f56750g;
    }

    @NotNull
    public final x0<ScreenState> D0() {
        return this.f56739D;
    }

    @NotNull
    public final C0 E0() {
        return this.f56743H;
    }

    @NotNull
    public final x0<FinToolbarState> F0() {
        return this.f56738C;
    }

    public final void G0(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f56746c.hideBottomNavigation(activity);
    }

    public final boolean H0() {
        return this.f56754k.isStandAloneIntegration();
    }

    public final void I0() {
        String str = this.f56760q;
        if (str != null) {
            C10727i.c(this.f56745b.b(), null, null, new n(str, null), 3);
        }
        this.f56746c.pop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(@NotNull String str, boolean z11, @NotNull String url, @NotNull String str2, @NotNull String mimeType, @NotNull String uuid, String str3) {
        String substring;
        String lowerCase;
        String title = str;
        String contentDeposition = str2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentDeposition, "contentDeposition");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f56768y = false;
        this.f56759p = url;
        U30.d.Companion.getClass();
        U30.d c11 = d.a.c(mimeType);
        this.f56740E = uuid;
        this.f56736A = c11;
        this.f56758o = str3;
        if (c11 == U30.d.UNKNOWN || !z11) {
            try {
                contentDeposition = URLDecoder.decode(contentDeposition, Charsets.UTF_8.toString());
            } catch (Exception unused) {
            }
            int J11 = kotlin.text.h.J(contentDeposition, "filename=", 0, false, 6);
            Matcher matcher = f56735I.matcher(contentDeposition);
            if (!matcher.matches() || matcher.groupCount() < 2) {
                if (J11 != -1) {
                    String substring2 = contentDeposition.substring(kotlin.text.h.J(contentDeposition, "=", J11, false, 4) + 1);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    substring = kotlin.text.h.X(substring2, "\"", "", false);
                } else {
                    Set g10 = d.a.g();
                    if (!(g10 instanceof Collection) || !g10.isEmpty()) {
                        Iterator it = g10.iterator();
                        while (it.hasNext()) {
                            if (kotlin.text.h.t(url, "." + ((String) it.next()), false)) {
                                substring = url.substring(kotlin.text.h.f(url, "/", 0, 6) + 1);
                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                try {
                                    substring = URLDecoder.decode(substring, Charsets.UTF_8.toString());
                                    break;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
                if (substring == null) {
                    substring = URLUtil.guessFileName(url, contentDeposition, mimeType);
                    Intrinsics.checkNotNullExpressionValue(substring, "guessFileName(...)");
                }
                if (title.length() == 0) {
                    title = substring;
                }
                lowerCase = kotlin.text.h.j0('.', substring, "").toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!Intrinsics.d(lowerCase, c11.b()) || lowerCase.length() <= 0) {
                    title = kotlin.text.h.n0('.', title, title);
                    if (c11.b().length() != 0) {
                        title = G.g.c(title, ".", c11.b());
                    }
                } else if (!kotlin.text.h.t(title, ".".concat(lowerCase), false)) {
                    title = G.g.c(title, ".", lowerCase);
                }
            } else {
                substring = matcher.group(2);
            }
            substring = null;
            if (substring == null) {
            }
            if (title.length() == 0) {
            }
            lowerCase = kotlin.text.h.j0('.', substring, "").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.d(lowerCase, c11.b())) {
            }
            title = kotlin.text.h.n0('.', title, title);
            if (c11.b().length() != 0) {
            }
        } else {
            title = this.f56748e.p(title, c11);
        }
        String str4 = title;
        this.f56757n = str4;
        this.f56762s = str4;
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b.plus(this.f56769z), null, new l(z11, this, url, str4, mimeType, null), 2);
    }

    public final void K0(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = this.f56760q;
        if (str != null) {
            File file = new File(str);
            if (!this.f56756m) {
                Uri d11 = FileProvider.d(this.f56744a, this.f56755l, file);
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("application/pdf");
                intent.putExtra("android.intent.extra.STREAM", d11);
                this.f56743H.tryEmit(intent);
                return;
            }
            if (Build.VERSION.SDK_INT < 29) {
                this.f56765v = new c80.f(this, file);
                this.f56764u = true;
                this.f56749f.g(activity);
            } else {
                C6788a a11 = androidx.lifecycle.x0.a(this);
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(a11, He.b.f10879b, null, new j(file, this, null), 2);
            }
        }
    }

    public final void L0(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f56746c.showBottomNavigation(activity);
    }

    public final void M0(int i11, int i12) {
        L30.l lVar = this.f56750g;
        lVar.j(i11);
        lVar.i(i12);
    }

    @NotNull
    public final w0<AbstractC9781a> getPermissionAction() {
        return this.f56742G;
    }

    @NotNull
    public final x0<C9987a> getPermissionScreenState() {
        return this.f56741F;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        String str = this.f56760q;
        if (str != null) {
            C10727i.c(this.f56745b.b(), null, null, new n(str, null), 3);
        }
        this.f56750g.d();
    }

    public final void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f56764u) {
            this.f56749f.g(activity);
        }
    }

    @Override // r90.f.a
    public final void permissionUpdated(AbstractC9782b abstractC9782b) {
        this.f56763t = abstractC9782b;
        if (abstractC9782b instanceof AbstractC9782b.a) {
            c80.f fVar = this.f56765v;
            if (fVar != null) {
                fVar.invoke();
            }
            this.f56765v = null;
        }
        handleState();
    }
}
