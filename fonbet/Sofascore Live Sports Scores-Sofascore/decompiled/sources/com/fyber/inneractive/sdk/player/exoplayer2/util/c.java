package com.fyber.inneractive.sdk.player.exoplayer2.util;

import defpackage.pvd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c {
    public final File a;
    public final File b;

    public c(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }

    public final b b() {
        if (this.a.exists()) {
            boolean exists = this.b.exists();
            File file = this.a;
            if (exists) {
                file.delete();
            } else if (!file.renameTo(this.b)) {
                Objects.toString(this.a);
                Objects.toString(this.b);
            }
        }
        try {
            return new b(this.a);
        } catch (FileNotFoundException unused) {
            if (!this.a.getParentFile().mkdirs()) {
                pvd.q(this.a, "Couldn't create directory ");
                return null;
            }
            try {
                return new b(this.a);
            } catch (FileNotFoundException unused2) {
                pvd.q(this.a, "Couldn't create ");
                return null;
            }
        }
    }
}
