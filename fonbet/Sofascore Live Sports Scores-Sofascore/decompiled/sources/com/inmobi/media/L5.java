package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L5 {
    public final M5 a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ P5 d;

    public L5(P5 p5, M5 m5) {
        this.d = p5;
        this.a = m5;
        this.b = m5.c ? null : new boolean[p5.h];
    }

    public final OutputStream a(int i) {
        FileOutputStream fileOutputStream;
        K5 k5;
        synchronized (this.d) {
            try {
                M5 m5 = this.a;
                if (m5.d != this) {
                    throw new IllegalStateException();
                }
                if (!m5.c) {
                    this.b[i] = true;
                }
                File b = m5.b(i);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused) {
                    this.d.b.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused2) {
                        return P5.q;
                    }
                }
                k5 = new K5(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return k5;
    }
}
