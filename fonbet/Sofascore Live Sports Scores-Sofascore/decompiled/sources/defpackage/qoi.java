package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class qoi implements lt8 {
    public static final qoi a = new qoi();

    public final f4a a(l62 l62Var) {
        InputStream W0 = l62Var.W0();
        fog fogVar = new fog();
        fogVar.a = null;
        fogVar.b = null;
        fogVar.c = false;
        fogVar.e = false;
        fogVar.f = null;
        fogVar.g = null;
        fogVar.h = false;
        fogVar.i = null;
        if (!W0.markSupported()) {
            W0 = new BufferedInputStream(W0);
        }
        try {
            W0.mark(3);
            int read = W0.read() + (W0.read() << 8);
            W0.reset();
            if (read == 35615) {
                W0 = new BufferedInputStream(new GZIPInputStream(W0));
            }
        } catch (IOException unused) {
        }
        try {
            W0.mark(4096);
            fogVar.B(W0);
            return new f4a(fogVar.a, 14);
        } finally {
            try {
                W0.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qoi) && (obj instanceof lt8)) {
            return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.lt8
    public final dt8 getFunctionDelegate() {
        return new ot8(1, n9e.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
