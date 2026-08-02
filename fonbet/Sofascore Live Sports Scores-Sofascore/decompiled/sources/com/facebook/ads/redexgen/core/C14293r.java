package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C14293r extends E2 {
    public static byte[] A01;
    public final /* synthetic */ C14283q A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -43, -60, -55, -49};
    }

    public C14293r(C14283q c14283q) {
        this.A00 = c14283q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.get() == null) goto L6;
     */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(E3 e3) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        weakReference = this.A00.A00;
        if (weakReference != null) {
            weakReference3 = this.A00.A00;
        }
        this.A00.A00 = new WeakReference(new C2552f6(this));
        AudioManager audioManager = (AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 71));
        weakReference2 = this.A00.A00;
        audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) weakReference2.get(), 3, 1);
    }
}
