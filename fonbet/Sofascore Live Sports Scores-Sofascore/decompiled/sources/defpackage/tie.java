package defpackage;

import android.widget.Magnifier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tie extends sie {
    @Override // defpackage.sie, defpackage.qie
    public final void a(long j, long j2, float f) {
        if (!Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.a;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
