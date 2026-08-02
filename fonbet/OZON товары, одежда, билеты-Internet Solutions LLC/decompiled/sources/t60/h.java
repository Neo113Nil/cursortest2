package t60;

import U50.j;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.permissions.PermissionRequestResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import s90.C9635d;
import s90.InterfaceC9636e;
import t90.AbstractC9782b;

/* loaded from: classes3.dex */
public final class h extends V50.c implements U50.a {

    /* renamed from: b, reason: collision with root package name */
    private final r90.f f99226b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f99227c;

    /* renamed from: d, reason: collision with root package name */
    private j f99228d;

    /* renamed from: e, reason: collision with root package name */
    private kotlin.reflect.d<? extends InterfaceC9636e> f99229e;

    public h(@NotNull Moshi moshi, r90.f fVar) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f99226b = fVar;
        this.f99227c = moshi;
    }

    private final void f(WeakReference weakReference, j jVar, Function2 function2) {
        String str;
        FintechWebView fintechWebView;
        r parentFragmentActivity = (weakReference == null || (fintechWebView = (FintechWebView) weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        if (parentFragmentActivity != null) {
            this.f99228d = jVar;
            r90.f fVar = this.f99226b;
            if (fVar != null) {
                function2.invoke(fVar, parentFragmentActivity);
                return;
            }
            return;
        }
        try {
            str = this.f99227c.c(PermissionRequestResult.class).toJson(new PermissionRequestResult(false));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        jVar.invoke(new NativeResult.Success(str));
        this.f99229e = null;
        L80.a.a("RequestPermissionBridgeInterface", "weakWebViewRef.get()?.getParentFragmentActivity() = null");
    }

    @Override // V50.c
    public final boolean b(AbstractC9782b abstractC9782b) {
        List<InterfaceC9636e> a11;
        if (this.f99228d == null || abstractC9782b == null || (a11 = abstractC9782b.a()) == null) {
            return false;
        }
        List<InterfaceC9636e> list = a11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (InterfaceC9636e interfaceC9636e : list) {
            if ((interfaceC9636e instanceof C9635d) || (interfaceC9636e instanceof s90.f) || (interfaceC9636e instanceof s90.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // V50.c
    public final void d(boolean z11) {
        String str;
        L80.a.a("RequestPermissionBridgeInterface", "sendToCallback granted " + z11);
        j jVar = this.f99228d;
        if (jVar != null) {
            try {
                str = this.f99227c.c(PermissionRequestResult.class).toJson(new PermissionRequestResult(z11));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str = "";
            }
            jVar.invoke(new NativeResult.Success(str));
        }
        if (Intrinsics.d(this.f99229e, N.b(C9635d.class)) && z11 && !(a() instanceof AbstractC9782b.c)) {
            boolean z12 = a() instanceof AbstractC9782b.C2182b;
        }
        this.f99228d = null;
        this.f99229e = null;
    }

    public final Function1<NativeResult, Unit> e() {
        return this.f99228d;
    }

    public final void g(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.reflect.d<? extends InterfaceC9636e> dVar = this.f99229e;
        if (dVar != null) {
            boolean equals = dVar.equals(N.b(C9635d.class));
            r90.f fVar = this.f99226b;
            if (equals) {
                if (fVar != null) {
                    fVar.d(activity, true);
                }
            } else if (dVar.equals(N.b(s90.f.class))) {
                if (fVar != null) {
                    fVar.b(activity);
                }
            } else {
                if (!dVar.equals(N.b(s90.h.class)) || fVar == null) {
                    return;
                }
                fVar.f(activity);
            }
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "request_permission";
    }

    public final void h() {
        this.f99228d = null;
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String str;
        kotlin.reflect.d<? extends InterfaceC9636e> a11;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            str = new JSONObject(parameterJson).getString("permission");
        } catch (Exception e11) {
            L80.a.c("RequestPermissionBridgeInterface", null, e11);
            str = null;
        }
        if (str == null || (a11 = b.a(str)) == null) {
            return;
        }
        this.f99229e = a11;
        if (a11.equals(N.b(C9635d.class))) {
            f(weakReference, (j) callback, new f());
            return;
        }
        if (a11.equals(N.b(s90.f.class))) {
            f(weakReference, (j) callback, new sa.h(1));
        } else if (a11.equals(N.b(s90.h.class))) {
            f(weakReference, (j) callback, new g(0));
        } else {
            L80.a.a("RequestPermissionBridgeInterface", "Wrong permission class");
            this.f99229e = null;
        }
    }
}
