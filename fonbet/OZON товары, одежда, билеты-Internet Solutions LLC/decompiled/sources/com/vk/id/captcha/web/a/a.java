package com.vk.id.captcha.web.a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import com.vk.id.captcha.R$anim;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.VKCaptcha;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f60590a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "");
        this.f60590a = activity;
    }

    private final void a() {
        this.f60590a.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            this.f60590a.overrideActivityTransition(1, R$anim.fade_in, R$anim.fade_out);
        } else {
            this.f60590a.overridePendingTransition(R$anim.fade_in, R$anim.fade_out);
        }
        VKCaptcha.INSTANCE.closeCaptcha$captcha_release(a.C0920a.INSTANCE);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        a();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        a();
    }
}
