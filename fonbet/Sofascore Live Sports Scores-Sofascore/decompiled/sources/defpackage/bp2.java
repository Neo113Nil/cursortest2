package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class bp2 extends ip2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public bp2(String str) {
        char[] charArray = str.toString().toCharArray();
        this.b = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.m3f
    public final boolean apply(Object obj) {
        switch (this.a) {
        }
        return b(((Character) obj).charValue());
    }

    @Override // defpackage.ip2
    public final boolean b(char c) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Arrays.binarySearch((char[]) obj, c) >= 0;
            default:
                return !((ip2) obj).b(c);
        }
    }

    @Override // defpackage.ip2
    public ip2 c() {
        switch (this.a) {
            case 1:
                return (ip2) this.b;
            default:
                return super.c();
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(ip2.d(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((ip2) obj) + ".negate()";
        }
    }

    public bp2(ip2 ip2Var) {
        this.b = ip2Var;
    }
}
