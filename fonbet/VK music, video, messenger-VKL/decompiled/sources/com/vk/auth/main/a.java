package com.vk.auth.main;

import android.os.Bundle;
import android.os.SystemClock;
import com.vk.auth.DefaultAuthActivity;

/* compiled from: AuthConfig.kt */
/* loaded from: classes.dex */
public final class a {
    public final SignUpDataHolder a;
    public final SignUpRouter b;
    public final e c;
    public final long d = SystemClock.elapsedRealtimeNanos();

    /* compiled from: AuthConfig.kt */
    /* renamed from: com.vk.auth.main.a$a, reason: collision with other inner class name */
    public static class C0403a {
        public final DefaultAuthActivity a;
        public com.vk.auth.c b;
        public final SignUpDataHolder c;
        public final i d;

        public C0403a(DefaultAuthActivity defaultAuthActivity, Bundle bundle) {
            SignUpDataHolder signUpDataHolder;
            this.a = defaultAuthActivity;
            this.c = (bundle == null || (signUpDataHolder = (SignUpDataHolder) bundle.getParcelable("___VkAuthLib_SignUpDataHolder___")) == null) ? new SignUpDataHolder() : signUpDataHolder;
            this.d = i.c;
        }
    }

    public a(SignUpDataHolder signUpDataHolder, SignUpRouter signUpRouter, e eVar) {
        this.a = signUpDataHolder;
        this.b = signUpRouter;
        this.c = eVar;
    }
}
