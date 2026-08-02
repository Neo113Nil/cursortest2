package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ip2 implements m3f {
    public static ip2 a(String str) {
        int length = str.length();
        if (length != 0) {
            return length != 1 ? length != 2 ? new bp2(str) : new ep2(str.charAt(0), str.charAt(1)) : new dp2(str.charAt(0), 0);
        }
        return ap2.f;
    }

    public static String d(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public abstract boolean b(char c);

    public ip2 c() {
        return new bp2(this);
    }
}
