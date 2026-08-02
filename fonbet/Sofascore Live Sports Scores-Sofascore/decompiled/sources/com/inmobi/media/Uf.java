package com.inmobi.media;

import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Uf {
    public static final int a(Tf tf) {
        tf.getClass();
        int ordinal = tf.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 90;
        }
        if (ordinal == 2) {
            return 180;
        }
        if (ordinal == 3) {
            return 270;
        }
        zzl.b();
        return 0;
    }

    public static final boolean b(Tf tf) {
        tf.getClass();
        return tf == Tf.LANDSCAPE || tf == Tf.REVERSE_LANDSCAPE;
    }

    public static final Tf a(byte b) {
        if (b == 1) {
            return Tf.PORTRAIT;
        }
        if (b == 2) {
            return Tf.REVERSE_PORTRAIT;
        }
        if (b == 3) {
            return Tf.LANDSCAPE;
        }
        if (b == 4) {
            return Tf.REVERSE_LANDSCAPE;
        }
        return Tf.PORTRAIT;
    }
}
