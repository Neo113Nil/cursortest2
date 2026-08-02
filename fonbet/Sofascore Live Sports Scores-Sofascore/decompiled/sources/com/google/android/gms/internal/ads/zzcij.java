package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcij implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final zzchl b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f = 1.0f;

    public zzcij(Context context, zzchl zzchlVar) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = zzchlVar;
    }

    public final void a() {
        boolean z = this.d;
        zzchl zzchlVar = this.b;
        AudioManager audioManager = this.a;
        if (!z || this.e || this.f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.c) {
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                zzchlVar.x();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        if (audioManager != null) {
            this.c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        zzchlVar.x();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.x();
    }
}
