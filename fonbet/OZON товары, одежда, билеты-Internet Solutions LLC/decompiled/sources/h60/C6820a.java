package h60;

import Sc.C4001c;
import U50.d;
import U50.j;
import android.content.Context;
import android.webkit.WebView;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.headers.GetHeadersRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ya0.C10876a;
import ya0.C10877b;

/* renamed from: h60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6820a implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f65034a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0<String> f65035b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<String> f65036c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10877b f65037d;

    public C6820a(@NotNull Moshi moshi, Function0<String> function0, Function0<String> function02, @NotNull C10877b fintechWebviewHeadersInfoProvider) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechWebviewHeadersInfoProvider, "fintechWebviewHeadersInfoProvider");
        this.f65034a = moshi;
        this.f65035b = function0;
        this.f65036c = function02;
        this.f65037d = fintechWebviewHeadersInfoProvider;
    }

    private static GetHeadersRequest a(C10876a c10876a) {
        String m11 = c10876a.m();
        if (m11 == null) {
            m11 = "";
        }
        String r11 = c10876a.r();
        if (r11 == null) {
            r11 = "";
        }
        String o11 = c10876a.o();
        if (o11 == null) {
            o11 = "";
        }
        String p11 = c10876a.p();
        if (p11 == null) {
            p11 = "";
        }
        String n11 = c10876a.n();
        if (n11 == null) {
            n11 = "";
        }
        String w11 = c10876a.w();
        String str = r11;
        String str2 = o11;
        String str3 = p11;
        String str4 = n11;
        String u11 = c10876a.u();
        String l11 = c10876a.l();
        String x11 = c10876a.x();
        String b11 = c10876a.b();
        String q11 = c10876a.q();
        String v11 = c10876a.v();
        String t2 = c10876a.t();
        String s11 = c10876a.s();
        String y11 = c10876a.y();
        String k11 = c10876a.k();
        return new GetHeadersRequest(m11, str, str2, str3, str4, w11, u11, l11, x11, b11, q11, v11, t2, s11, y11, k11 != null ? k11 : "", c10876a.a(), c10876a.h(), c10876a.i(), Boolean.valueOf(Boolean.parseBoolean(c10876a.z())), c10876a.f(), c10876a.g(), c10876a.d(), c10876a.j(), c10876a.e(), c10876a.c().get("x-ad-params"));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        FintechWebView fintechWebView;
        WebView webView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            C10877b c10877b = this.f65037d;
            Context context = (weakReference == null || (fintechWebView = weakReference.get()) == null || (webView = fintechWebView.getWebView()) == null) ? null : webView.getContext();
            String invoke = this.f65036c.invoke();
            String str = "";
            if (invoke == null) {
                invoke = "";
            }
            Function0<String> function0 = this.f65035b;
            try {
                str = this.f65034a.c(GetHeadersRequest.class).toJson(a(c10877b.a(context, invoke, function0 != null ? function0.invoke() : null)));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            return new NativeResult.Success(str);
        } catch (Exception e11) {
            L80.a.a("GetHeadersBridgeInterface", "Ошибка получения заголовков в GetHeadersBridgeInterface " + C4001c.b(e11));
            return new NativeResult.Error("Ошибка получения заголовков в GetHeadersBridgeInterface", null, 2, null);
        }
    }
}
