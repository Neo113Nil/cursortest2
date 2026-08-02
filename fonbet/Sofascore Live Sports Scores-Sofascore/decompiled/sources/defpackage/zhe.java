package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zhe implements u9e {
    public final String a;

    public zhe(String str) {
        str.getClass();
        this.a = str;
        if (str.length() <= 0) {
            a70.p("Empty string is not allowed");
            throw null;
        }
        if (vha.z(str.charAt(0))) {
            ogj.h(lnb.o("String '", str, "' starts with a digit"));
            throw null;
        }
        if (vha.z(str.charAt(str.length() - 1))) {
            ogj.h(lnb.o("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    @Override // defpackage.u9e
    public final Object a(bt3 bt3Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        String str = this.a;
        if (str.length() + i > charSequence.length()) {
            return new l9e(i, new xxb(this, 26));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return new l9e(i, new ug9(this, charSequence, i, i2));
            }
        }
        return Integer.valueOf(str.length() + i);
    }

    public final String toString() {
        return lnb.q(new StringBuilder("'"), this.a, '\'');
    }
}
