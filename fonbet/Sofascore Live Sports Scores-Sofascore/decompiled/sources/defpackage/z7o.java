package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z7o implements orn {
    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) ldaVar.b;
        String ln = javaScriptMsgData.ln();
        if (ln == null || javaScriptMsgData.n() == null || javaScriptMsgData.m() == null || ln.length() == 0) {
            "Invalid logging message data: ".concat(String.valueOf(javaScriptMsgData));
            return;
        }
        String n = javaScriptMsgData.n();
        String m = javaScriptMsgData.m();
        new StringBuilder(String.valueOf(n).length() + 14 + String.valueOf(m).length());
        char charAt = ln.charAt(0);
        if (charAt == 'D' || charAt == 'E' || charAt == 'I' || charAt == 'S' || charAt == 'V' || charAt == 'W') {
            return;
        }
        "Unrecognized log level: ".concat(ln);
    }
}
