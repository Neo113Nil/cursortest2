package com.google.android.gms.signin;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import defpackage.d2n;
import defpackage.t1n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zad {
    public static final t1n a;
    public static final Api b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        t1n t1nVar = new t1n();
        a = t1nVar;
        d2n d2nVar = new d2n();
        new Scope(1, "profile");
        new Scope(1, NotificationCompat.CATEGORY_EMAIL);
        b = new Api("SignIn.API", t1nVar, clientKey);
        new Api("SignIn.INTERNAL_API", d2nVar, clientKey2);
    }
}
