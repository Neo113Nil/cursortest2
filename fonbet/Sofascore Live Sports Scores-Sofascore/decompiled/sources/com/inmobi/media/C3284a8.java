package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b1d;
import defpackage.ku3;
import defpackage.vg6;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.a8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3284a8 {
    public final ku3 a;
    public final ExoPlayer b;
    public final b1d c;
    public final U1 d;
    public boolean e;

    public C3284a8(Context context, ku3 ku3Var, ExoPlayer exoPlayer, boolean z, b1d b1dVar) {
        context.getClass();
        ku3Var.getClass();
        exoPlayer.getClass();
        b1dVar.getClass();
        this.a = ku3Var;
        this.b = exoPlayer;
        this.c = b1dVar;
        U1 u1 = new U1(context);
        this.d = u1;
        this.e = z;
        u1.c = new WeakReference(new Y7(this));
    }

    public final void a() {
        ((vg6) this.b).setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        X4.a(this.c, this.a, new W1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true));
        this.e = true;
    }
}
