package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2552f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C14293r A00;

    public C2552f6(C14293r c14293r) {
        this.A00 = c14293r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C1664Dl(this, i));
    }
}
