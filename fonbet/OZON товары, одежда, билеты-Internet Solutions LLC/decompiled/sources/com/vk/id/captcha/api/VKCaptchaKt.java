package com.vk.id.captcha.api;

import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.data.VKCaptchaError;
import com.vk.id.captcha.api.data.VKCaptchaResult;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\".\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/a;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "result", "Lcom/vk/id/captcha/a;", "getResult", "()Lcom/vk/id/captcha/a;", "setResult", "(Lcom/vk/id/captcha/a;)V"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKCaptchaKt {
    private static a result;

    public static final void setResult(a aVar) {
        String lastDomain$captcha_release;
        String lastRedirectUri$captcha_release;
        VKCaptchaResultListener captchaListener$captcha_release;
        if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            VKCaptchaResult.Success success = new VKCaptchaResult.Success(dVar.a(), dVar.b());
            VKCaptcha vKCaptcha = VKCaptcha.INSTANCE;
            VKCaptchaResultListener captchaListener$captcha_release2 = vKCaptcha.getCaptchaListener$captcha_release();
            if (captchaListener$captcha_release2 != null) {
                captchaListener$captcha_release2.onResult(success);
            }
            if (dVar.b() != null) {
                vKCaptcha.getCaptchaStorage$captcha_release().a(dVar.b(), dVar.a());
            }
        } else if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            VKCaptchaResult.Error error = new VKCaptchaResult.Error(bVar.a(), bVar.b());
            VKCaptchaResultListener captchaListener$captcha_release3 = VKCaptcha.INSTANCE.getCaptchaListener$captcha_release();
            if (captchaListener$captcha_release3 != null) {
                captchaListener$captcha_release3.onResult(error);
            }
        } else if (aVar instanceof a.C0920a) {
            VKCaptchaResult.Error error2 = new VKCaptchaResult.Error(new VKCaptchaError.Cancelled(), null);
            VKCaptchaResultListener captchaListener$captcha_release4 = VKCaptcha.INSTANCE.getCaptchaListener$captcha_release();
            if (captchaListener$captcha_release4 != null) {
                captchaListener$captcha_release4.onResult(error2);
            }
        } else if (Intrinsics.d(aVar, a.c.INSTANCE)) {
            VKCaptcha vKCaptcha2 = VKCaptcha.INSTANCE;
            synchronized (vKCaptcha2) {
                lastDomain$captcha_release = vKCaptcha2.getLastDomain$captcha_release();
                lastRedirectUri$captcha_release = vKCaptcha2.getLastRedirectUri$captcha_release();
                captchaListener$captcha_release = vKCaptcha2.getCaptchaListener$captcha_release();
                Unit unit = Unit.f71690a;
            }
            if (lastDomain$captcha_release == null || lastRedirectUri$captcha_release == null || captchaListener$captcha_release == null) {
                StringBuilder sb2 = new StringBuilder("Can not retry to open captcha because illegal state. domain is null:");
                sb2.append(lastDomain$captcha_release == null);
                sb2.append(", redirectUri is null:");
                sb2.append(lastRedirectUri$captcha_release == null);
                sb2.append(", captchaListener is null: ");
                sb2.append(captchaListener$captcha_release == null);
                Log.e("VKCaptchaState", sb2.toString());
                return;
            }
            vKCaptcha2.openCaptcha(lastDomain$captcha_release, lastRedirectUri$captcha_release, captchaListener$captcha_release);
        }
        result = aVar;
    }
}
