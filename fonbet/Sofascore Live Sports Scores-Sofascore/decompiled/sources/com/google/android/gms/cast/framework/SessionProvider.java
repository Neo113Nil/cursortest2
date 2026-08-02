package com.google.android.gms.cast.framework;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.umn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class SessionProvider {
    public final Context a;
    public final String b;
    public final umn c = new umn(this);

    public SessionProvider(Context context, String str) {
        this.a = context.getApplicationContext();
        Preconditions.f(str);
        this.b = str;
    }

    public abstract CastSession a(String str);

    public abstract boolean b();
}
