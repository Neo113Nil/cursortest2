package com.vk.id.captcha.okhttp.api;

import Sc.o;
import Sc.r;
import Sc.s;
import We.A;
import We.B;
import We.G;
import We.L;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.api.data.VKCaptchaResult;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import com.vk.id.captcha.okhttp.api.Error14HandlingInterceptor;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/Error14HandlingInterceptor;", "LWe/B;", "", "", "domains", "<init>", "(Ljava/util/Set;)V", "redirectUri", "passCaptchaAndGetToken", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/vk/id/captcha/api/data/VKCaptchaResult;", "result", "LSc/r;", "wrapResult-IoAF18A", "(Lcom/vk/id/captcha/api/data/VKCaptchaResult;)Ljava/lang/Object;", "wrapResult", "LWe/G;", "token", "withSuccessToken", "(LWe/G;Ljava/lang/String;)LWe/G;", "LWe/L;", "getRedirectUri", "(LWe/L;)Ljava/lang/String;", "", "shouldSkipCaptcha", "(LWe/G;)Z", "", "parseCookie", "(LWe/L;)V", "withCookie", "(LWe/G;)LWe/G;", "LWe/B$a;", "chain", "intercept", "(LWe/B$a;)LWe/L;", "Ljava/util/Set;", "Ljava/util/concurrent/atomic/AtomicReference;", "cookie", "Ljava/util/concurrent/atomic/AtomicReference;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Error14HandlingInterceptor implements B {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    @NotNull
    private final AtomicReference<String> cookie;

    @NotNull
    private final Set<String> domains;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0006*\u00020\u00050\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/Error14HandlingInterceptor$Companion;", "", "", "CAPTCHA_ERROR_CODE", "I", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Error14HandlingInterceptor(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.domains = set;
        this.cookie = new AtomicReference<>(null);
    }

    private final String getRedirectUri(L l11) {
        try {
            JSONObject jSONObject = new JSONObject(l11.y(Long.MAX_VALUE).string());
            if (!jSONObject.has("error")) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            if (jSONObject2.getInt("error_code") == 14) {
                return jSONObject2.getString("redirect_uri");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final void parseCookie(L l11) {
        Object obj;
        Iterator<T> it = l11.s("Set-Cookie").iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (h.t((String) obj, "remixstlid", false)) {
                    break;
                }
            }
        }
        String str = (String) obj;
        if (str != null) {
            this.cookie.set(str);
        }
    }

    private final String passCaptchaAndGetToken(final String redirectUri) {
        String str;
        synchronized (this) {
            r.Companion companion = r.INSTANCE;
            final AtomicReference atomicReference = new AtomicReference(r.a(s.a(new Exception("No result"))));
            executor.submit(new Runnable() { // from class: ca.a
                @Override // java.lang.Runnable
                public final void run() {
                    Error14HandlingInterceptor.passCaptchaAndGetToken$lambda$3$lambda$1(redirectUri, atomicReference, this);
                }
            });
            synchronized (atomicReference) {
                try {
                    Object obj = atomicReference.get();
                    Intrinsics.checkNotNullExpressionValue(obj, "");
                    Object f26106a = ((r) obj).getF26106a();
                    if (f26106a instanceof r.b) {
                        f26106a = null;
                    }
                    if (f26106a == null) {
                        atomicReference.wait();
                    }
                    Object obj2 = atomicReference.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "");
                    Object f26106a2 = ((r) obj2).getF26106a();
                    s.b(f26106a2);
                    str = (String) f26106a2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void passCaptchaAndGetToken$lambda$3$lambda$1(String str, final AtomicReference atomicReference, final Error14HandlingInterceptor error14HandlingInterceptor) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(atomicReference, "");
        Intrinsics.checkNotNullParameter(error14HandlingInterceptor, "");
        VKCaptcha vKCaptcha = VKCaptcha.INSTANCE;
        A.f33515l.getClass();
        A c11 = A.b.c(str);
        vKCaptcha.openCaptcha(c11.u() + "://" + c11.h(), str, new VKCaptchaResultListener() { // from class: com.vk.id.captcha.okhttp.api.Error14HandlingInterceptor$passCaptchaAndGetToken$1$1$2
            @Override // com.vk.id.captcha.api.listener.VKCaptchaResultListener
            public final void onResult(@NotNull VKCaptchaResult result) {
                Object m47wrapResultIoAF18A;
                Intrinsics.checkNotNullParameter(result, "");
                AtomicReference<r<String>> atomicReference2 = atomicReference;
                Error14HandlingInterceptor error14HandlingInterceptor2 = error14HandlingInterceptor;
                synchronized (atomicReference2) {
                    m47wrapResultIoAF18A = error14HandlingInterceptor2.m47wrapResultIoAF18A(result);
                    atomicReference2.set(r.a(m47wrapResultIoAF18A));
                    atomicReference2.notifyAll();
                    Unit unit = Unit.f71690a;
                }
            }
        });
    }

    private final boolean shouldSkipCaptcha(G g10) {
        return (this.domains.contains(g10.j().x().getHost()) || this.domains.isEmpty()) ? false : true;
    }

    private final G withCookie(G g10) {
        g10.getClass();
        G.a aVar = new G.a(g10);
        String str = this.cookie.get();
        if (str != null) {
            aVar.a("Cookie", str);
        }
        return aVar.b();
    }

    private final G withSuccessToken(G g10, String str) {
        g10.getClass();
        G.a aVar = new G.a(g10);
        A.a j11 = g10.j().j();
        j11.d("success_token", str);
        aVar.j(j11.e());
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wrapResult-IoAF18A, reason: not valid java name */
    public final Object m47wrapResultIoAF18A(VKCaptchaResult result) {
        if (result instanceof VKCaptchaResult.Error) {
            r.Companion companion = r.INSTANCE;
            VKCaptchaResult.Error error = (VKCaptchaResult.Error) result;
            return s.a(new Exception(error.getError().getMessage(), error.getError().getError()));
        }
        if (!(result instanceof VKCaptchaResult.Success)) {
            throw new o();
        }
        r.Companion companion2 = r.INSTANCE;
        return ((VKCaptchaResult.Success) result).getToken();
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        String redirectUri;
        Intrinsics.checkNotNullParameter(chain, "");
        G withCookie = withCookie(chain.request());
        L proceed = chain.proceed(withCookie);
        parseCookie(proceed);
        return (shouldSkipCaptcha(withCookie) || (redirectUri = getRedirectUri(proceed)) == null) ? proceed : chain.proceed(withSuccessToken(withCookie(chain.request()), passCaptchaAndGetToken(redirectUri)));
    }
}
