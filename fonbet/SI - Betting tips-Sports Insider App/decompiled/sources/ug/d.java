package ug;

import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f24267a = new char[117];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f24268b = new byte[126];

    static {
        for (int i5 = 0; i5 < 32; i5++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = f24268b;
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = ByteCompanionObject.MAX_VALUE;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(char c2, int i5) {
        if (c2 != 'u') {
            f24267a[c2] = (char) i5;
        }
    }
}
