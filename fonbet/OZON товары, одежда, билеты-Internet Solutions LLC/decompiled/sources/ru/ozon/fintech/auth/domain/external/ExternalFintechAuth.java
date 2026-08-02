package ru.ozon.fintech.auth.domain.external;

import D30.c;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import xe.InterfaceC10750u;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u0000 12\u00020\u0001:\u00012J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0013\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010%\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0#H\u0016¢\u0006\u0004\b%\u0010&J'\u0010+\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J \u0010/\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;", "", "", "", "getAdditionalHeaders", "()Ljava/util/Map;", "", "isOzonSignedIn", "()Z", "Lxe/u;", "result", "", "logOutOzonId", "(Lxe/u;)V", "getUserOzonId", "()Ljava/lang/String;", "adParam", "setAdParam", "(Z)V", "getOzonIdHeaders", ImagesContract.URL, "LD30/c;", "tryAuthDomain", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "errorResponse", "reAuthOnWebViewReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "requestCode", "resultCode", "Lkotlin/Function1;", "onResult", "processSignInResultResult", "(IILkotlin/jvm/functions/Function1;)V", "phone", "otp", "", "otpId", "forceSignIn", "(Ljava/lang/String;Ljava/lang/String;J)V", "restoreRequiredCookie", "clearAccountManager", "clearAllCookies", "(ZZLkotlin/coroutines/d;)Ljava/lang/Object;", "Companion", "a", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ExternalFintechAuth {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f94938a;

    /* renamed from: ru.ozon.fintech.auth.domain.external.ExternalFintechAuth$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f94938a = new Companion();
    }

    Object clearAllCookies(boolean z11, boolean z12, @NotNull d<? super Unit> dVar);

    void forceSignIn(@NotNull String phone, @NotNull String otp, long otpId);

    @NotNull
    Map<String, String> getAdditionalHeaders();

    @NotNull
    Map<String, String> getOzonIdHeaders();

    String getUserOzonId();

    boolean isOzonSignedIn();

    void logOutOzonId(InterfaceC10750u<Boolean> result);

    void processSignInResultResult(int requestCode, int resultCode, @NotNull Function1<? super Boolean, Unit> onResult);

    Object reAuthOnWebViewReceivedHttpError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse, @NotNull d<? super c> dVar);

    void setAdParam(boolean adParam);

    Object tryAuthDomain(@NotNull String str, @NotNull d<? super c> dVar);
}
