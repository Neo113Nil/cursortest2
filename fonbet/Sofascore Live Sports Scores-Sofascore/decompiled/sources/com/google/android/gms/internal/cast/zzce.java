package com.google.android.gms.internal.cast;

import android.os.Looper;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.internal.Logger;
import defpackage.brn;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzce {
    public static final Logger i = new Logger("SessionTransController", null);
    public final CastOptions a;
    public boolean f;
    public SessionManager g;
    public SessionState h;
    public final Set b = Collections.synchronizedSet(new HashSet());
    public int e = 0;
    public final zzfk c = new zzfk(Looper.getMainLooper());
    public final brn d = new brn(this, 1);

    public zzce(CastOptions castOptions) {
        this.a = castOptions;
    }

    public final void a() {
        this.c.removeCallbacks(this.d);
        this.e = 0;
        this.h = null;
    }
}
