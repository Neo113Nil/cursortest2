package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t89 extends t01 {
    @Override // defpackage.t01
    public final void O(String str) {
        str.getClass();
        List list = zi9.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.d(charAt, 32) <= 0 || StringsKt.K("\"(),/:;<=>?@[\\]{}", charAt)) {
                StringBuilder q = wt3.q("Header name '", str, "' contains illegal character '");
                q.append(str.charAt(i2));
                q.append("' (code ");
                throw new gk4(wv8.j(q, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.t01
    public final void P(String str) {
        str.getClass();
        str.getClass();
        List list = zi9.a;
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.d(charAt, 32) < 0 && charAt != '\t') {
                StringBuilder q = wt3.q("Header value '", str, "' contains illegal character '");
                q.append(str.charAt(i2));
                q.append("' (code ");
                throw new gk4(wv8.j(q, str.charAt(i2) & 255, ')'));
            }
            i++;
            i2 = i3;
        }
    }
}
