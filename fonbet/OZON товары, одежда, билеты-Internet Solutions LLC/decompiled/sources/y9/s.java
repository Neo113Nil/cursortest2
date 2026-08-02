package y9;

import h9.EnumC6876a;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import o9.C8660b;

/* loaded from: classes9.dex */
public abstract class s implements h9.u {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f106344a = Pattern.compile("[0-9]+");

    protected static int b(boolean[] zArr, int i11, int[] iArr, boolean z11) {
        int i12 = 0;
        for (int i13 : iArr) {
            int i14 = 0;
            while (i14 < i13) {
                zArr[i11] = z11;
                i14++;
                i11++;
            }
            i12 += i13;
            z11 = !z11;
        }
        return i12;
    }

    protected static void c(String str) {
        if (!f106344a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    @Override // h9.u
    public final C8660b a(String str, EnumC6876a enumC6876a, int i11, int i12, Map<h9.g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i11 + 'x' + i12);
        }
        Set f7 = f();
        if (f7 != null && !f7.contains(enumC6876a)) {
            throw new IllegalArgumentException("Can only encode " + f7 + ", but got " + enumC6876a);
        }
        int e11 = e();
        if (map != null) {
            h9.g gVar = h9.g.MARGIN;
            if (map.containsKey(gVar)) {
                e11 = Integer.parseInt(map.get(gVar).toString());
            }
        }
        boolean[] d11 = d(str);
        int length = d11.length;
        int i13 = e11 + length;
        int max = Math.max(i11, i13);
        int max2 = Math.max(1, i12);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        C8660b c8660b = new C8660b(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (d11[i16]) {
                c8660b.m(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return c8660b;
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }

    protected abstract Set f();
}
