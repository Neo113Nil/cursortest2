package t4;

import android.text.TextUtils;
import j3.v;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import k4.o;
import m3.C8050C;
import m3.InterfaceC8068j;

/* loaded from: classes8.dex */
public final class g implements o {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f99161a = new C8050C();

    /* renamed from: b, reason: collision with root package name */
    private final C9749b f99162b = new C9749b();

    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<k4.c> interfaceC8068j) {
        d e11;
        C8050C c8050c = this.f99161a;
        c8050c.P(i12 + i11, bArr);
        c8050c.R(i11);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(c8050c);
            while (!TextUtils.isEmpty(c8050c.r(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c11 = 65535;
                int i13 = 0;
                while (c11 == 65535) {
                    i13 = c8050c.f();
                    String r11 = c8050c.r(StandardCharsets.UTF_8);
                    c11 = r11 == null ? (char) 0 : "STYLE".equals(r11) ? (char) 2 : r11.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                c8050c.R(i13);
                if (c11 == 0) {
                    k4.f.b(new j(arrayList2), bVar, interfaceC8068j);
                    return;
                }
                if (c11 == 1) {
                    while (!TextUtils.isEmpty(c8050c.r(StandardCharsets.UTF_8))) {
                    }
                } else if (c11 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    c8050c.r(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f99162b.a(c8050c));
                } else if (c11 == 3 && (e11 = f.e(c8050c, arrayList)) != null) {
                    arrayList2.add(e11);
                }
            }
        } catch (v e12) {
            throw new IllegalArgumentException(e12);
        }
    }
}
