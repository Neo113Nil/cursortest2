package ru.ozon.app.android.bank.externals.bank;

import D30.c;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.storage.user.model.User;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import xe.InterfaceC10750u;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/bank/externals/bank/OzonExternalFintechAuth;", "Lru/ozon/fintech/auth/domain/external/ExternalFintechAuth;", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "<init>", "(Lru/ozon/app/android/account/user/UserManager;)V", "", "", "toOzonIdString", "(J)Ljava/lang/String;", "getUserOzonId", "()Ljava/lang/String;", "", "adParam", "", "setAdParam", "(Z)V", "", "getOzonIdHeaders", "()Ljava/util/Map;", ImagesContract.URL, "LD30/c;", "tryAuthDomain", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "errorResponse", "reAuthOnWebViewReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getAdditionalHeaders", "isOzonSignedIn", "()Z", "Lru/ozon/app/android/account/user/UserManager;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonExternalFintechAuth implements ExternalFintechAuth {

    @NotNull
    private final UserManager userManager;

    public OzonExternalFintechAuth(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.userManager = userManager;
    }

    private final String toOzonIdString(long j11) {
        if (j11 == 0) {
            return null;
        }
        return String.valueOf(j11);
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public Object clearAllCookies(boolean z11, boolean z12, @NotNull d<? super Unit> dVar) {
        return Unit.f71690a;
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public void forceSignIn(@NotNull String phone, @NotNull String otp, long j11) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(otp, "otp");
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    @NotNull
    public Map<String, String> getAdditionalHeaders() {
        return U.c();
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    @NotNull
    public Map<String, String> getOzonIdHeaders() {
        return U.c();
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public String getUserOzonId() {
        User user = this.userManager.getUser();
        if (user != null) {
            return toOzonIdString(user.getUserId());
        }
        return null;
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public boolean isOzonSignedIn() {
        return this.userManager.getUserId() > 0;
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public void logOutOzonId(InterfaceC10750u<Boolean> interfaceC10750u) {
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public void processSignInResultResult(int i11, int i12, @NotNull Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public Object reAuthOnWebViewReceivedHttpError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse, @NotNull d<? super c> dVar) {
        return c.b.f5774a;
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public void setAdParam(boolean adParam) {
    }

    @Override // ru.ozon.fintech.auth.domain.external.ExternalFintechAuth
    public Object tryAuthDomain(@NotNull String str, @NotNull d<? super c> dVar) {
        return c.b.f5774a;
    }
}
