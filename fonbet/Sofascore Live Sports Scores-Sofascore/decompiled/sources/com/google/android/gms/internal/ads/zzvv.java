package com.google.android.gms.internal.ads;

import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzvv extends Exception {
    public final String a;
    public final zzvs b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvv(zzv zzvVar, zzwd zzwdVar, int i) {
        this(r5, zzwdVar, r7, null, me4.g(r11, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(r11).length() + 60)));
        String zzvVar2 = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + zzvVar2.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(zzvVar2);
        String sb2 = sb.toString();
        String str = zzvVar.o;
        int abs = Math.abs(i);
    }

    public zzvv(String str, Throwable th, String str2, zzvs zzvsVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = zzvsVar;
        this.c = str3;
    }
}
