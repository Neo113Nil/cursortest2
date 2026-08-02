package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import defpackage.slo;
import defpackage.tmb;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzvl {
    public final HashSet a;
    public LoudnessCodecController b;

    public zzvl(int i) {
        this.a = new HashSet();
    }

    public final void a(int i) {
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.b = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i, slo.a, new tmb());
        this.b = create;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public final void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zzguk.f(this.a.add(mediaCodec));
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.a.remove(mediaCodec) || (loudnessCodecController = this.b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public zzvl() {
        throw null;
    }
}
