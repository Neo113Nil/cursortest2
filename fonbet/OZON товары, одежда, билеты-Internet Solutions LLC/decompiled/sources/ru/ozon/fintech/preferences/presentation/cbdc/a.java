package ru.ozon.fintech.preferences.presentation.cbdc;

import A90.f;
import A90.g;
import Ae.C0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import C.o0;
import E30.d;
import Sc.r;
import Sc.s;
import Z30.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import bd.C5652b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonState;
import xe.C10727i;
import xe.M;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f96726a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f96727b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z30.a f96728c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final S80.b f96729d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final R30.a f96730e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private a.b f96731f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<C2111a> f96732g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<b> f96733h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C0 f96734i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C0 f96735j;

    /* renamed from: ru.ozon.fintech.preferences.presentation.cbdc.a$a, reason: collision with other inner class name */
    public static final class C2111a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FinLargeButtonState f96736a;

        /* renamed from: b, reason: collision with root package name */
        private final String f96737b;

        public C2111a(@NotNull FinLargeButtonState downloadButtonState, String str) {
            Intrinsics.checkNotNullParameter(downloadButtonState, "downloadButtonState");
            this.f96736a = downloadButtonState;
            this.f96737b = str;
        }

        @NotNull
        public final FinLargeButtonState a() {
            return this.f96736a;
        }

        public final String b() {
            return this.f96737b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2111a)) {
                return false;
            }
            C2111a c2111a = (C2111a) obj;
            c2111a.getClass();
            return this.f96736a.equals(c2111a.f96736a) && Intrinsics.d(this.f96737b, c2111a.f96737b);
        }

        public final int hashCode() {
            int hashCode = (this.f96736a.hashCode() + (Boolean.hashCode(false) * 31)) * 31;
            String str = this.f96737b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DownloadContainer(isDownloadButtonEnabled=false, downloadButtonState=");
            sb2.append(this.f96736a);
            sb2.append(", lastDownloadedDate=");
            return o0.c(sb2, this.f96737b, ")");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FinRadioButtonState f96738a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FinRadioButtonState f96739b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final FinRadioButtonState f96740c;

        public b(@NotNull FinRadioButtonState assetDefaultRadioState, @NotNull FinRadioButtonState downloadRadioState, @NotNull FinRadioButtonState noneRadioState) {
            Intrinsics.checkNotNullParameter(assetDefaultRadioState, "assetDefaultRadioState");
            Intrinsics.checkNotNullParameter(downloadRadioState, "downloadRadioState");
            Intrinsics.checkNotNullParameter(noneRadioState, "noneRadioState");
            this.f96738a = assetDefaultRadioState;
            this.f96739b = downloadRadioState;
            this.f96740c = noneRadioState;
        }

        @NotNull
        public final FinRadioButtonState a() {
            return this.f96738a;
        }

        @NotNull
        public final FinRadioButtonState b() {
            return this.f96739b;
        }

        @NotNull
        public final FinRadioButtonState c() {
            return this.f96740c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f96738a, bVar.f96738a) && Intrinsics.d(this.f96739b, bVar.f96739b) && Intrinsics.d(this.f96740c, bVar.f96740c);
        }

        public final int hashCode() {
            return this.f96740c.hashCode() + ((this.f96739b.hashCode() + (this.f96738a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "RadioButtonsState(assetDefaultRadioState=" + this.f96738a + ", downloadRadioState=" + this.f96739b + ", noneRadioState=" + this.f96740c + ")";
        }
    }

    @e(c = "ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcViewModel$processSelectedFile$1", f = "FintechCbdcViewModel.kt", l = {124, 132}, m = "invokeSuspend")
    static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96741d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f96743f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Uri uri, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f96743f = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new c(this.f96743f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        
            if (r6.emit("Сохранение выбранного файла", r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96741d;
            a aVar2 = a.this;
            if (i11 == 0) {
                s.b(obj);
                C0 l02 = aVar2.l0();
                this.f96741d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    aVar2.handleState();
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            Serializable q02 = aVar2.q0(this.f96743f);
            a.b bVar = a.b.f96629a;
            r.Companion companion = r.INSTANCE;
            String str = !(q02 instanceof r.b) ? "Файл успешно сохранен" : "Ошибка при сохранении файла";
            C0 l03 = aVar2.l0();
            this.f96741d = 2;
        }
    }

    public a(@NotNull Context context, @NotNull SharedPreferences sharedPreferences, @NotNull Z30.a digRoubleApi, @NotNull S80.b navigation, @NotNull R30.a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.f96726a = context;
        this.f96727b = sharedPreferences;
        this.f96728c = digRoubleApi;
        this.f96729d = navigation;
        this.f96730e = appCoroutineScopes;
        this.f96731f = digRoubleApi.c();
        this.f96732g = O0.a(null);
        this.f96733h = O0.a(null);
        this.f96734i = E0.a(0, 1, EnumC11113a.SUSPEND);
        this.f96735j = E0.a(0, 1, EnumC11113a.DROP_LATEST);
    }

    public static Unit d0(a aVar) {
        a.b bVar = a.b.None;
        aVar.f96731f = bVar;
        aVar.f96728c.a(bVar);
        aVar.handleState();
        return Unit.f71690a;
    }

    public static Unit e0(a aVar) {
        a.b bVar = a.b.DefaultAssets;
        aVar.f96731f = bVar;
        aVar.f96728c.a(bVar);
        aVar.handleState();
        return Unit.f71690a;
    }

    public static Unit f0(a aVar) {
        aVar.f96735j.tryEmit("*/*");
        return Unit.f71690a;
    }

    public static Unit g0(a aVar) {
        a.b bVar = a.b.NewDownloaded;
        aVar.f96731f = bVar;
        aVar.f96728c.a(bVar);
        aVar.handleState();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState() {
        C2111a c2111a;
        String str;
        x0<C2111a> x0Var = this.f96732g;
        a.b bVar = this.f96731f;
        a.b bVar2 = a.b.NewDownloaded;
        if (bVar == bVar2) {
            FinLargeButtonState finLargeButtonState = new FinLargeButtonState("btn", "Выбрать файл", new A90.d(this, 0), null, null, null, null, null, null, 504, null);
            long j11 = this.f96727b.getLong("CBDC_LAST_DOWNLOADED_KEY", 0L);
            if (j11 > 0) {
                str = LocalDateTime.ofInstant(Instant.ofEpochMilli(j11), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy"));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = "Never";
            }
            c2111a = new C2111a(finLargeButtonState, str);
        } else {
            c2111a = null;
        }
        x0Var.setValue(c2111a);
        this.f96733h.setValue(new b(new FinRadioButtonState(R.string.fintech_cbdc_debug_mfe_script_radio_btn_assets, null, a.b.DefaultAssets == this.f96731f, 0, null, null, new A90.e(this, 0), 56, null), new FinRadioButtonState(R.string.fintech_cbdc_debug_mfe_script_radio_btn_download, null, bVar2 == this.f96731f, 0, null, null, new f(this, 0), 56, null), new FinRadioButtonState(R.string.fintech_cbdc_debug_mfe_script_radio_btn_none, null, a.b.None == this.f96731f, 0, null, null, new g(this, 0), 56, null)));
    }

    @NotNull
    public final x0<C2111a> i0() {
        return this.f96732g;
    }

    @NotNull
    public final C0 j0() {
        return this.f96735j;
    }

    @NotNull
    public final x0<b> k0() {
        return this.f96733h;
    }

    @NotNull
    public final C0 l0() {
        return this.f96734i;
    }

    public final void m0() {
        this.f96729d.pop();
    }

    public final void n0() {
        handleState();
    }

    public final void p0(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        a.c cVar = a.c.f96630a;
        C10727i.c(this.f96730e.b(), null, null, new c(uri, null), 3);
    }

    @NotNull
    public final Serializable q0(@NotNull Uri uri) {
        Context context = this.f96726a;
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            File file = new File(context.getCacheDir(), "new_cbdcmfe.js");
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                r.Companion companion = r.INSTANCE;
                return s.a(new Exception("Не получилось открыть файл"));
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    C5652b.a(openInputStream, fileOutputStream);
                    fileOutputStream.close();
                    this.f96727b.edit().putLong("CBDC_LAST_DOWNLOADED_KEY", System.currentTimeMillis()).apply();
                    Unit unit = Unit.f71690a;
                    openInputStream.close();
                    r.Companion companion2 = r.INSTANCE;
                    return file;
                } finally {
                }
            } finally {
            }
        } catch (Exception e11) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(e11);
        }
    }
}
