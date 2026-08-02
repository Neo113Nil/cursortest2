package z60;

import H30.q;
import Sc.s;
import U30.d;
import U50.j;
import android.content.Context;
import android.os.Build;
import android.util.Base64InputStream;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import h3.C6788a;
import h90.f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k90.AbstractC7611a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import s90.InterfaceC9636e;
import s90.i;
import t90.AbstractC9782b;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class e extends V50.c implements U50.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f107294b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f107295c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final U30.a f107296d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f107297e;

    /* renamed from: f, reason: collision with root package name */
    private final r90.f f107298f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Moshi f107299g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f107300h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C6788a f107301i;

    /* renamed from: j, reason: collision with root package name */
    private j f107302j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f107303k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f107304l;

    /* renamed from: m, reason: collision with root package name */
    private Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> f107305m;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileBridgeInterface$sendToCallback$1", f = "ShareFileBridgeInterface.kt", l = {100}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f107306d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f107306d;
            e eVar = e.this;
            if (i11 == 0) {
                s.b(obj);
                Function1 function1 = eVar.f107305m;
                if (function1 != null) {
                    this.f107306d = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            eVar.f107305m = null;
            return Unit.f71690a;
        }
    }

    public e(@NotNull Context context, @NotNull S80.b navigation, @NotNull U30.a fileManager, @NotNull f notificationInteractor, r90.f fVar, @NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull C6788a coroutineScope, @NotNull ru.ozon.fintech.settings.domain.a settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f107294b = context;
        this.f107295c = navigation;
        this.f107296d = fileManager;
        this.f107297e = notificationInteractor;
        this.f107298f = fVar;
        this.f107299g = moshi;
        this.f107300h = fintechAnalyticInteractor;
        this.f107301i = coroutineScope;
        this.f107303k = settings.i();
        this.f107304l = Intrinsics.d(Build.MANUFACTURER, "Xiaomi");
    }

    public static final Object e(e eVar, Base64InputStream base64InputStream, String str, U30.d dVar, String str2, kotlin.coroutines.jvm.internal.j jVar) {
        if (eVar.f107302j == null) {
            return Unit.f71690a;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(He.b.f10879b, new C10993a(eVar, str, base64InputStream, dVar, str2, null), jVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Comparable k(e eVar, Base64InputStream base64InputStream, String str, U30.d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        C10995c c10995c;
        int i11;
        e eVar2;
        File file;
        if (cVar instanceof C10995c) {
            c10995c = (C10995c) cVar;
            int i12 = c10995c.f107289g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10995c.f107289g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c10995c.f107287e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10995c.f107289g;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    d dVar2 = new d(eVar, base64InputStream, dVar, str, null);
                    c10995c.f107286d = eVar;
                    c10995c.f107289g = 1;
                    obj = C10727i.f(bVar, dVar2, c10995c);
                    if (obj == aVar) {
                        return aVar;
                    }
                    eVar2 = eVar;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar2 = c10995c.f107286d;
                    s.b(obj);
                }
                file = (File) obj;
                if (file != null) {
                    try {
                        return FileProvider.d(eVar2.f107294b, eVar2.f107303k, file);
                    } catch (Exception e11) {
                        L80.a.c("ShareFileBridgeInterface", null, e11);
                    }
                }
                return null;
            }
        }
        c10995c = new C10995c(eVar, cVar);
        Object obj2 = c10995c.f107287e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10995c.f107289g;
        if (i11 != 0) {
        }
        file = (File) obj2;
        if (file != null) {
        }
        return null;
    }

    public static final void l(e eVar, String str) {
        String string = eVar.f107294b.getString(R.string.fintech_ui_download_file_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        eVar.f107297e.b(new AbstractC7611a.C1161a("", "", str, string, Integer.valueOf(R.drawable.fintech_ui_file_download_24), "", 0, null));
    }

    public static final void m(e eVar, boolean z11, U30.d dVar, String str) {
        String str2;
        InterfaceC6618a interfaceC6618a = eVar.f107300h;
        if (z11) {
            j jVar = eVar.f107302j;
            if (jVar != null) {
                Moshi moshi = eVar.f107299g;
                try {
                    str2 = moshi.c(Boolean.class).toJson(Boolean.TRUE);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    str2 = "";
                }
                jVar.invoke(new NativeResult.Success(str2));
            }
            interfaceC6618a.e1((r13 & 1) == 0, (r13 & 2) == 0, (r13 & 4) == 0, (r13 & 8) != 0 ? null : null, dVar, (r13 & 32) == 0 ? "Ошибка! Не удалось распознать mimeType" : null);
        } else {
            j jVar2 = eVar.f107302j;
            if (jVar2 != null) {
                jVar2.invoke(new NativeResult.Error("Ошибка при декодинге файла", null, 2, null));
            }
            interfaceC6618a.e1((r13 & 1) == 0, (r13 & 2) == 0, (r13 & 4) == 0, (r13 & 8) != 0 ? null : str, dVar, (r13 & 32) == 0 ? "Ошибка! Не удалось распознать mimeType" : null);
        }
        eVar.f107302j = null;
        eVar.f107296d.g(TimeUnit.DAYS.toMillis(1L), "tmp", false);
    }

    @Override // V50.c
    public final boolean b(AbstractC9782b abstractC9782b) {
        List<InterfaceC9636e> a11;
        if (abstractC9782b == null || (a11 = abstractC9782b.a()) == null) {
            return false;
        }
        List<InterfaceC9636e> list = a11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC9636e) it.next()) instanceof i) {
                return true;
            }
        }
        return false;
    }

    @Override // V50.c
    public final void d(boolean z11) {
        if (z11) {
            C10727i.c(this.f107301i, null, null, new a(null), 3);
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "file";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Moshi moshi = this.f107299g;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(ShareFileRequest.class, "clazz");
        Object a11 = q.a(moshi, parameterJson, ShareFileRequest.class);
        if (a11 == null) {
            ((j) callback).invoke(new NativeResult.Error("Ошибка парсинга Json'а", NativeResult.Error.a.SDK_ERROR));
        }
        ShareFileRequest shareFileRequest = (ShareFileRequest) a11;
        if (shareFileRequest != null) {
            this.f107302j = (j) callback;
            r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
            d.a aVar = U30.d.Companion;
            String mimeType = shareFileRequest.getMimeType();
            aVar.getClass();
            U30.d c11 = d.a.c(mimeType);
            if (c11 != U30.d.UNKNOWN) {
                C10727i.c(this.f107301i, null, null, new C10994b(shareFileRequest, this, c11, parentFragmentActivity, null), 3);
                return;
            }
            this.f107300h.e1((r13 & 1) == 0, (r13 & 2) == 0, (r13 & 4) == 0, (r13 & 8) != 0 ? null : null, d.a.c(shareFileRequest.getMimeType()), (r13 & 32) == 0 ? "Ошибка! Не удалось распознать mimeType" : null);
            j jVar = this.f107302j;
            if (jVar != null) {
                jVar.invoke(new NativeResult.Error("Ошибка! Не удалось распознать mimeType", null, 2, null));
            }
        }
    }

    public final Function1<NativeResult, Unit> o() {
        return this.f107302j;
    }

    public final void p() {
        this.f107302j = null;
    }
}
