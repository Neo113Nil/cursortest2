package com.vk.id.captcha.okhttp.api;

import Sc.o;
import Sc.r;
import Sc.s;
import U7.d;
import We.B;
import We.G;
import We.L;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.api.data.VKCaptchaResult;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import com.vk.id.captcha.okhttp.api.HitmanChallengeHandlingInterceptor;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0003*\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/HitmanChallengeHandlingInterceptor;", "LWe/B;", "", "", "domains", "<init>", "(Ljava/util/Set;)V", "domain", "challengeUrl", "passCaptchaAndGetToken", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/vk/id/captcha/api/data/VKCaptchaResult;", "result", "LSc/r;", "wrapResult-IoAF18A", "(Lcom/vk/id/captcha/api/data/VKCaptchaResult;)Ljava/lang/Object;", "wrapResult", "LWe/G;", "token", "withChallengeSolution", "(LWe/G;Ljava/lang/String;)LWe/G;", "withSavedChallengeSolution", "(LWe/G;)LWe/G;", "LWe/L;", "response", "", "shouldSkipCaptcha", "(LWe/L;Ljava/lang/String;)Z", "getDomain", "(LWe/G;)Ljava/lang/String;", "LWe/B$a;", "chain", "intercept", "(LWe/B$a;)LWe/L;", "Ljava/util/Set;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HitmanChallengeHandlingInterceptor implements B {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    @NotNull
    private final Set<String> domains;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\b\u001a\u0006*\u00020\u00070\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/HitmanChallengeHandlingInterceptor$Companion;", "", "", "HEADER_CHALLENGE", "Ljava/lang/String;", "HEADER_CHALLENGE_SOLUTION", "HEADER_CHALLENGE_URL", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HitmanChallengeHandlingInterceptor(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.domains = set;
    }

    private final String getDomain(G g10) {
        URL x11 = g10.j().x();
        String url = new URL(x11.getProtocol(), x11.getHost(), x11.getPort(), "").toString();
        Intrinsics.checkNotNullExpressionValue(url, "");
        return url;
    }

    private final String passCaptchaAndGetToken(final String domain, final String challengeUrl) {
        String str;
        synchronized (this) {
            r.Companion companion = r.INSTANCE;
            final AtomicReference atomicReference = new AtomicReference(r.a(s.a(new Exception("No result"))));
            executor.submit(new Runnable() { // from class: ca.b
                @Override // java.lang.Runnable
                public final void run() {
                    HitmanChallengeHandlingInterceptor.passCaptchaAndGetToken$lambda$2$lambda$0(domain, challengeUrl, atomicReference, this);
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
    public static final void passCaptchaAndGetToken$lambda$2$lambda$0(String str, String str2, final AtomicReference atomicReference, final HitmanChallengeHandlingInterceptor hitmanChallengeHandlingInterceptor) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(atomicReference, "");
        Intrinsics.checkNotNullParameter(hitmanChallengeHandlingInterceptor, "");
        VKCaptcha.INSTANCE.openCaptcha(str, d.e(str, str2), new VKCaptchaResultListener() { // from class: com.vk.id.captcha.okhttp.api.HitmanChallengeHandlingInterceptor$passCaptchaAndGetToken$1$1$1
            @Override // com.vk.id.captcha.api.listener.VKCaptchaResultListener
            public final void onResult(@NotNull VKCaptchaResult result) {
                Object m49wrapResultIoAF18A;
                Intrinsics.checkNotNullParameter(result, "");
                AtomicReference<r<String>> atomicReference2 = atomicReference;
                HitmanChallengeHandlingInterceptor hitmanChallengeHandlingInterceptor2 = hitmanChallengeHandlingInterceptor;
                synchronized (atomicReference2) {
                    m49wrapResultIoAF18A = hitmanChallengeHandlingInterceptor2.m49wrapResultIoAF18A(result);
                    atomicReference2.set(r.a(m49wrapResultIoAF18A));
                    atomicReference2.notifyAll();
                    Unit unit = Unit.f71690a;
                }
            }
        });
    }

    private final boolean shouldSkipCaptcha(L response, String domain) {
        if (!this.domains.contains(domain) && !this.domains.isEmpty()) {
            return true;
        }
        List<String> s11 = response.s("X-Challenge");
        if ((s11 instanceof Collection) && s11.isEmpty()) {
            return true;
        }
        Iterator<T> it = s11.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((String) it.next(), "required")) {
                return false;
            }
        }
        return true;
    }

    private final G withChallengeSolution(G g10, String str) {
        g10.getClass();
        G.a aVar = new G.a(g10);
        aVar.d("X-Challenge-Solution", str);
        return aVar.b();
    }

    private final G withSavedChallengeSolution(G g10) {
        String token = VKCaptcha.INSTANCE.getToken(getDomain(g10));
        if (g10.d("X-Challenge-Solution") != null || token == null) {
            return g10;
        }
        G.a aVar = new G.a(g10);
        aVar.a("X-Challenge-Solution", token);
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wrapResult-IoAF18A, reason: not valid java name */
    public final Object m49wrapResultIoAF18A(VKCaptchaResult result) {
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
        String str;
        Intrinsics.checkNotNullParameter(chain, "");
        String domain = getDomain(chain.request());
        L proceed = chain.proceed(withSavedChallengeSolution(chain.request()));
        if (shouldSkipCaptcha(proceed, domain) || (str = (String) C7714v.M(proceed.s("X-Challenge-Url"))) == null) {
            return proceed;
        }
        String passCaptchaAndGetToken = passCaptchaAndGetToken(domain, str);
        proceed.close();
        return chain.proceed(withChallengeSolution(chain.request(), passCaptchaAndGetToken));
    }
}
