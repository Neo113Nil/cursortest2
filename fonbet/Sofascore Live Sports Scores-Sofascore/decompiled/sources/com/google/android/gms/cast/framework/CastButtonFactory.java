package com.google.android.gms.cast.framework;

import android.content.Context;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzpm;
import defpackage.ibc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class CastButtonFactory {
    public static final ArrayList a;
    public static final Object b;

    static {
        new Logger("CastButtonFactory", null);
        new ArrayList();
        a = new ArrayList();
        b = new Object();
    }

    private CastButtonFactory() {
    }

    public static void a(Context context, MediaRouteButton mediaRouteButton) {
        ibc a2;
        Preconditions.e("Must be called from the main thread.");
        if (mediaRouteButton != null) {
            Preconditions.e("Must be called from the main thread.");
            CastContext d = CastContext.d(context);
            if (d != null && (a2 = d.a()) != null) {
                mediaRouteButton.setRouteSelector(a2);
            }
            synchronized (b) {
                a.add(new WeakReference(mediaRouteButton));
            }
        }
        com.google.android.gms.internal.cast.zzr.a(zzpm.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }
}
