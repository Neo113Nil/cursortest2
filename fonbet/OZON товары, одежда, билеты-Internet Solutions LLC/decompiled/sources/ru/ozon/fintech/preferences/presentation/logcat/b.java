package ru.ozon.fintech.preferences.presentation.logcat;

import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.w0;
import Ae.x0;
import K30.a;
import Sc.o;
import Sc.s;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h3.C6788a;
import java.io.File;
import java.io.FileInputStream;
import k90.AbstractC7611a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
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
import ru.ozon.fintech.ui.screenstate.ScreenState;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class b extends E30.d implements f.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f96825a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U30.a f96826b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final h90.f f96827c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f f96828d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final S80.b f96829e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f96830f;

    /* renamed from: g, reason: collision with root package name */
    private ru.ozon.fintech.preferences.presentation.logcat.a f96831g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC9782b f96832h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private K30.a f96833i;

    /* renamed from: j, reason: collision with root package name */
    private String f96834j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f96835k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final x0<String> f96836l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<ScreenState> f96837m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final x0<C9987a> f96838n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private C0 f96839o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C0 f96840p;

    @e(c = "ru.ozon.fintech.preferences.presentation.logcat.LogCatViewModel$1", f = "LogCatViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            b.f0(b.this);
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.fintech.preferences.presentation.logcat.b$b, reason: collision with other inner class name */
    /* synthetic */ class C2118b extends C7719a implements Function1<AbstractC9781a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC9781a abstractC9781a) {
            ((w0) this.receiver).tryEmit(abstractC9781a);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class c extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            b.d0((b) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class d extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            b bVar = (b) this.receiver;
            bVar.getClass();
            C6788a a11 = androidx.lifecycle.x0.a(bVar);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.preferences.presentation.logcat.d(bVar, null), 2);
            return Unit.f71690a;
        }
    }

    public b(@NotNull Context context, @NotNull U30.a fintechFileManager, @NotNull h90.f notificationInteractor, @NotNull f permissionsDelegate, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechFileManager, "fintechFileManager");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f96825a = context;
        this.f96826b = fintechFileManager;
        this.f96827c = notificationInteractor;
        this.f96828d = permissionsDelegate;
        this.f96829e = fintechNavigation;
        this.f96830f = settings.i();
        this.f96833i = a.b.f15169a;
        this.f96836l = O0.a(null);
        this.f96837m = O0.a(null);
        this.f96838n = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_LATEST;
        this.f96839o = E0.a(0, 1, enumC11113a);
        this.f96840p = E0.a(0, 1, enumC11113a);
        permissionsDelegate.s(this);
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new a(null), 2);
    }

    public static final void d0(b bVar) {
        if (bVar.f96835k) {
            bVar.permissionUpdated(null);
            bVar.f96835k = false;
        }
    }

    public static final void f0(b bVar) {
        File f7;
        bVar.getClass();
        bVar.f96833i = a.c.f15170a;
        bVar.handleState();
        String str = null;
        try {
            L80.c d11 = L80.a.d();
            if (d11 != null && (f7 = d11.f()) != null) {
                FileInputStream fileInputStream = new FileInputStream(f7);
                try {
                    byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                    StringBuilder sb2 = new StringBuilder();
                    for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
                        sb2.append(new String(bArr, Charsets.UTF_8));
                    }
                    String sb3 = sb2.toString();
                    fileInputStream.close();
                    str = sb3;
                } finally {
                }
            }
        } catch (Exception e11) {
            L80.a.g(e11);
        }
        bVar.f96834j = str;
        if (str == null) {
            bVar.f96833i = new a.C0294a(new Exception("Ошибка загрузки"));
        } else {
            bVar.f96833i = a.b.f15169a;
        }
        bVar.handleState();
    }

    public static final void g0(b bVar, String str) {
        String string = bVar.f96825a.getString(R.string.fintech_ui_download_file_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        bVar.f96827c.b(new AbstractC7611a.C1161a("", "", str, string, Integer.valueOf(R.drawable.fintech_ui_file_download_24), "", 591, null));
    }

    private final void handleState() {
        b bVar;
        ScreenState generalError$default;
        x0<C9987a> x0Var = this.f96838n;
        AbstractC9782b abstractC9782b = this.f96832h;
        C0 c02 = this.f96839o;
        x0Var.setValue(this.f96828d.q(abstractC9782b, this.f96825a, new C2118b(1, c02, w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8), new c(0, this, b.class, "closePermissionRequest", "closePermissionRequest()V", 0)));
        c02.tryEmit(f.p(this.f96832h));
        x0<ScreenState> x0Var2 = this.f96837m;
        K30.a aVar = this.f96833i;
        if (Intrinsics.d(aVar, a.b.f15169a)) {
            generalError$default = null;
            bVar = this;
        } else if (Intrinsics.d(aVar, a.c.f15170a)) {
            bVar = this;
            generalError$default = new ScreenState.Progress(0L, null, 3, null);
        } else {
            if (!(aVar instanceof a.C0294a)) {
                throw new o();
            }
            bVar = this;
            generalError$default = ScreenState.Companion.getGeneralError$default(ScreenState.INSTANCE, new d(0, this, b.class, "reloadLogFile", "reloadLogFile()V", 0), bVar.f96825a, null, 4, null);
        }
        x0Var2.setValue(generalError$default);
        bVar.f96836l.setValue(bVar.f96834j);
    }

    @NotNull
    public final w0<AbstractC9781a> getPermissionAction() {
        return this.f96839o;
    }

    @NotNull
    public final x0<C9987a> getPermissionScreenState() {
        return this.f96838n;
    }

    public final void h0(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            this.f96831g = new ru.ozon.fintech.preferences.presentation.logcat.a(this);
            this.f96828d.g(activity);
        } else {
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.preferences.presentation.logcat.c(this, null), 2);
        }
    }

    @NotNull
    public final x0<String> i0() {
        return this.f96836l;
    }

    @NotNull
    public final x0<ScreenState> j0() {
        return this.f96837m;
    }

    @NotNull
    public final C0 k0() {
        return this.f96840p;
    }

    public final void l0() {
        this.f96829e.pop();
    }

    public final void m0() {
        File f7;
        L80.c d11 = L80.a.d();
        if (d11 == null || (f7 = d11.f()) == null) {
            return;
        }
        Uri d12 = FileProvider.d(this.f96825a, this.f96830f, f7);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setClipData(new ClipData("Log File", new String[]{"text/plain"}, new ClipData.Item(d12)));
        intent.putExtra("android.intent.extra.STREAM", d12);
        intent.putExtra("android.intent.extra.SUBJECT", f7.getName());
        intent.putExtra("android.intent.extra.TEXT", f7.getName());
        intent.addFlags(1);
        this.f96840p.tryEmit(intent);
    }

    public final void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f96835k) {
            this.f96828d.g(activity);
        }
    }

    @Override // r90.f.a
    public final void permissionUpdated(AbstractC9782b abstractC9782b) {
        this.f96832h = abstractC9782b;
        if (abstractC9782b instanceof AbstractC9782b.a) {
            ru.ozon.fintech.preferences.presentation.logcat.a aVar = this.f96831g;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f96831g = null;
        } else if (!(abstractC9782b instanceof AbstractC9782b.e)) {
            boolean z11 = this.f96835k;
            if (z11) {
                this.f96831g = null;
                this.f96832h = null;
            }
            this.f96835k = !z11;
        }
        handleState();
    }
}
