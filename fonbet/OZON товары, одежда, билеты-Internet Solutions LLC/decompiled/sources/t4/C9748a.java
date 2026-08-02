package t4;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import k4.o;
import l3.C7855a;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.N;
import t4.f;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9748a implements o {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f99112a = new C8050C();

    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<k4.c> interfaceC8068j) {
        C7855a a11;
        C8050C c8050c = this.f99112a;
        c8050c.P(i11 + i12, bArr);
        c8050c.R(i11);
        ArrayList arrayList = new ArrayList();
        while (c8050c.a() > 0) {
            G10.a.b("Incomplete Mp4Webvtt Top Level box header found.", c8050c.a() >= 8);
            int p11 = c8050c.p();
            if (c8050c.p() == 1987343459) {
                int i13 = p11 - 8;
                CharSequence charSequence = null;
                C7855a.C1210a c1210a = null;
                while (i13 > 0) {
                    G10.a.b("Incomplete vtt cue box header found.", i13 >= 8);
                    int p12 = c8050c.p();
                    int p13 = c8050c.p();
                    int i14 = p12 - 8;
                    byte[] e11 = c8050c.e();
                    int f7 = c8050c.f();
                    int i15 = N.f74289a;
                    String str = new String(e11, f7, i14, StandardCharsets.UTF_8);
                    c8050c.S(i14);
                    i13 = (i13 - 8) - i14;
                    if (p13 == 1937011815) {
                        c1210a = f.f(str);
                    } else if (p13 == 1885436268) {
                        charSequence = f.h(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c1210a != null) {
                    c1210a.o(charSequence);
                    a11 = c1210a.a();
                } else {
                    Pattern pattern = f.f99137a;
                    f.d dVar = new f.d();
                    dVar.f99152c = charSequence;
                    a11 = dVar.a().a();
                }
                arrayList.add(a11);
            } else {
                c8050c.S(p11 - 8);
            }
        }
        interfaceC8068j.accept(new k4.c(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
