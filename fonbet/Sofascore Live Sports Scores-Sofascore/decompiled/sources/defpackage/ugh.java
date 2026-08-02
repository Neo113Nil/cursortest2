package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ugh implements u9e {
    public final fvg a;
    public final String b;

    public ugh(fvg fvgVar, String str) {
        this.a = fvgVar;
        this.b = str;
    }

    @Override // defpackage.u9e
    public final Object a(bt3 bt3Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i >= charSequence.length()) {
            return Integer.valueOf(i);
        }
        final char charAt = charSequence.charAt(i);
        fvg fvgVar = this.a;
        if (charAt == '-') {
            fvgVar.invoke(bt3Var, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (charAt != '+') {
            return new l9e(i, new Function0() { // from class: tgh
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return "Expected " + ugh.this.b + " but got " + charAt;
                }
            });
        }
        fvgVar.invoke(bt3Var, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.b;
    }
}
