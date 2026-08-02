package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1595f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C04723r A00;

    public C1595f6(C04723r c04723r) {
        this.A00 = c04723r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0707Dl(this, i));
    }
}
