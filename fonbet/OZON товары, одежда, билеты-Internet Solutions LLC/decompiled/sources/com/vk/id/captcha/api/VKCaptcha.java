package com.vk.id.captcha.api;

import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import com.vk.id.captcha.b.a;
import com.vk.id.captcha.web.VKCaptchaWebViewActivity;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001b\u00101\u001a\u00020,8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0007028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b6\u00107"}, d2 = {"Lcom/vk/id/captcha/api/VKCaptcha;", "", "<init>", "()V", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)V", "", "domain", "redirectUri", "Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "openCaptcha", "(Ljava/lang/String;Ljava/lang/String;Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;)V", "closeCaptcha", "Lcom/vk/id/captcha/a;", "state", "closeCaptcha$captcha_release", "(Lcom/vk/id/captcha/a;)V", "getToken", "(Ljava/lang/String;)Ljava/lang/String;", "token", "setResult$captcha_release", "(Ljava/lang/String;Ljava/lang/String;)V", "captchaListener", "Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;", "getCaptchaListener$captcha_release", "()Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;", "setCaptchaListener$captcha_release", "(Lcom/vk/id/captcha/api/listener/VKCaptchaResultListener;)V", "lastDomain", "Ljava/lang/String;", "getLastDomain$captcha_release", "()Ljava/lang/String;", "setLastDomain$captcha_release", "(Ljava/lang/String;)V", "lastRedirectUri", "getLastRedirectUri$captcha_release", "setLastRedirectUri$captcha_release", "Lcom/vk/id/captcha/a/a;", "captchaStorage$delegate", "LSc/j;", "getCaptchaStorage$captcha_release", "()Lcom/vk/id/captcha/a/a;", "captchaStorage", "Ljava/util/concurrent/atomic/AtomicReference;", "appContext", "Ljava/util/concurrent/atomic/AtomicReference;", "internalLocale", "getInternalLocale$captcha_release", "()Ljava/util/concurrent/atomic/AtomicReference;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKCaptcha {
    private static volatile VKCaptchaResultListener captchaListener;
    private static volatile String lastDomain;
    private static volatile String lastRedirectUri;

    @NotNull
    public static final VKCaptcha INSTANCE = new VKCaptcha();

    /* renamed from: captchaStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j captchaStorage = k.b(VKCaptcha$captchaStorage$2.INSTANCE);

    @NotNull
    private static final AtomicReference<Context> appContext = new AtomicReference<>();

    @NotNull
    private static final AtomicReference<Locale> internalLocale = new AtomicReference<>(null);

    private VKCaptcha() {
    }

    private final Locale getLocale() {
        Locale locale = internalLocale.get();
        if (locale != null) {
            return locale;
        }
        Context context = appContext.get();
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Locale locale2 = context.getResources().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        return locale2;
    }

    public final void closeCaptcha() {
        closeCaptcha$captcha_release(a.C0920a.INSTANCE);
    }

    public final void closeCaptcha$captcha_release(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "");
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        a.Companion.a().a().a();
        VKCaptchaKt.setResult(state);
    }

    public final VKCaptchaResultListener getCaptchaListener$captcha_release() {
        return captchaListener;
    }

    @NotNull
    public final com.vk.id.captcha.a.a getCaptchaStorage$captcha_release() {
        return (com.vk.id.captcha.a.a) captchaStorage.getValue();
    }

    public final String getLastDomain$captcha_release() {
        return lastDomain;
    }

    public final String getLastRedirectUri$captcha_release() {
        return lastRedirectUri;
    }

    public final String getToken(@NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "");
        return getCaptchaStorage$captcha_release().a(domain);
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        appContext.set(context.getApplicationContext());
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        a.Companion.a(applicationContext);
    }

    @SuppressLint({"UseKtx"})
    public final void openCaptcha(@NotNull String domain, @NotNull String redirectUri, @NotNull VKCaptchaResultListener listener) {
        Intrinsics.checkNotNullParameter(domain, "");
        Intrinsics.checkNotNullParameter(redirectUri, "");
        Intrinsics.checkNotNullParameter(listener, "");
        String language = getLocale().getLanguage();
        int i11 = 3;
        if (language != null) {
            int hashCode = language.hashCode();
            if (hashCode != 3201) {
                if (hashCode == 3241) {
                    language.equals("en");
                } else if (hashCode != 3246) {
                    if (hashCode != 3276) {
                        if (hashCode != 3580) {
                            if (hashCode != 3651) {
                                if (hashCode != 3710) {
                                    if (hashCode == 3734 && language.equals("uk")) {
                                        i11 = 1;
                                    }
                                } else if (language.equals("tr")) {
                                    i11 = 82;
                                }
                            } else if (language.equals("ru")) {
                                i11 = 0;
                            }
                        } else if (language.equals("pl")) {
                            i11 = 15;
                        }
                    } else if (language.equals("fr")) {
                        i11 = 16;
                    }
                } else if (language.equals("es")) {
                    i11 = 4;
                }
            } else if (language.equals("de")) {
                i11 = 6;
            }
        }
        String uri = Uri.parse(redirectUri).buildUpon().appendQueryParameter("lang_id", String.valueOf(i11)).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "");
        synchronized (this) {
            captchaListener = listener;
            lastDomain = domain;
            lastRedirectUri = uri;
            a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
            a.Companion.a().a(true);
            Unit unit = Unit.f71690a;
        }
        Context context = appContext.get();
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Context context2 = context;
        Intent intent = new Intent(context2, (Class<?>) VKCaptchaWebViewActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("VK_CAPTCHA_URL_KEY", uri);
        intent.putExtra("VK_CAPTCHA_CHALLENGE_DOMAIN_URL_KEY", domain);
        context2.startActivity(intent);
    }

    public final void setResult$captcha_release(@NotNull String token, String domain) {
        Intrinsics.checkNotNullParameter(token, "");
        VKCaptchaKt.setResult(new a.d(token, domain));
    }
}
