package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class rhi extends n4 {
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhi(String str, gfa gfaVar) {
        super(gfaVar);
        str.getClass();
        this.g = str;
    }

    @Override // defpackage.n4
    public int A() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.g;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }

    @Override // defpackage.n4
    public boolean e() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.g;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i;
                return n4.v(charAt);
            }
            i++;
        }
    }

    @Override // defpackage.n4
    public final String g() {
        j('\"');
        int i = this.b;
        String str = this.g;
        int O = StringsKt.O(str, '\"', i, 4);
        if (O == -1) {
            n();
            int i2 = this.b;
            n4.s(this, lnb.o("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < O; i3++) {
            if (str.charAt(i3) == '\\') {
                return m(this.b, i3, str);
            }
        }
        this.b = O + 1;
        return str.substring(i, O);
    }

    @Override // defpackage.n4
    public byte h() {
        String str;
        int i = this.b;
        while (true) {
            str = this.g;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                return lz.C(charAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    @Override // defpackage.n4
    public void j(char c) {
        int i = this.b;
        if (i == -1) {
            E(c);
            throw null;
        }
        while (true) {
            String str = this.g;
            if (i >= str.length()) {
                this.b = -1;
                E(c);
                throw null;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                if (charAt == c) {
                    return;
                }
                E(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.n4
    public final CharSequence u() {
        return this.g;
    }

    @Override // defpackage.n4
    public final String w(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (h() == 6 && Intrinsics.c(y(z), str)) {
                this.c = null;
                if (h() == 5) {
                    return y(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.c = null;
        }
    }

    @Override // defpackage.n4
    public final int z(int i) {
        if (i < this.g.length()) {
            return i;
        }
        return -1;
    }
}
