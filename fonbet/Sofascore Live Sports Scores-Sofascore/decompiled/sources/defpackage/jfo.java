package defpackage;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jfo implements PackageManager$OnChecksumsReadyListener {
    public final n8p a = n8p.q();

    public final void onChecksumsReady(List list) {
        n8p n8pVar = this.a;
        if (list == null) {
            n8pVar.d("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum c = hbo.c(list.get(i));
                if (c.getType() == 8) {
                    a6p i2 = a6p.a.i();
                    byte[] value = c.getValue();
                    int length = value.length;
                    jca.g0(0, length, value.length);
                    StringBuilder sb = new StringBuilder(i2.c(length));
                    try {
                        i2.a(sb, value, length);
                        n8pVar.d(sb.toString());
                        return;
                    } catch (IOException e) {
                        throw new AssertionError(e);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        n8pVar.d("");
    }
}
