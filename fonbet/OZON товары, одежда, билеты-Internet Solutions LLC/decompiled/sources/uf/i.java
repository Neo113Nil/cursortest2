package uf;

/* loaded from: classes6.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f100709a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f100710b;

    static void a(i iVar, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr = iVar.f100710b;
            byte[] bArr = iVar.f100709a;
            int i13 = i12 * 4;
            iArr[i12] = ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }
    }

    static void b(i iVar, byte[] bArr, int[] iArr) {
        iVar.f100709a = bArr;
        iVar.f100710b = iArr;
    }
}
