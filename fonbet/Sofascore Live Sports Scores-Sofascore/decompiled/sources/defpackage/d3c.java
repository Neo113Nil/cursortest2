package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d3c extends Exception {
    public final String a;
    public final boolean b;
    public final a3c c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d3c(b bVar, m3c m3cVar, boolean z, int i) {
        this(r3, m3cVar, r5, z, null, r10.toString());
        String str = "Decoder init failed: [" + i + "], " + bVar;
        String str2 = bVar.o;
        StringBuilder r = mz1.r("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        r.append(Math.abs(i));
    }

    public d3c(String str, Throwable th, String str2, boolean z, a3c a3cVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = a3cVar;
        this.d = str3;
    }
}
