package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c3c extends Exception {
    public final String a;
    public final boolean b;
    public final z2c c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c3c(sm8 sm8Var, l3c l3cVar, boolean z, int i) {
        this(r3, l3cVar, r5, z, null, r10.toString());
        String str = "Decoder init failed: [" + i + "], " + sm8Var;
        String str2 = sm8Var.l;
        StringBuilder r = mz1.r("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        r.append(Math.abs(i));
    }

    public c3c(String str, Throwable th, String str2, boolean z, z2c z2cVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = z2cVar;
        this.d = str3;
    }
}
