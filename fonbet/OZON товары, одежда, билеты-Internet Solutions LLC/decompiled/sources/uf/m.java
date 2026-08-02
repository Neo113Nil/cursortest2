package uf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes6.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f100774a = new byte[UserVerificationMethods.USER_VERIFY_ALL];

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f100775b = new int[UserVerificationMethods.USER_VERIFY_ALL];

    static void a(int i11, int i12, int[] iArr) {
        int i13 = 0;
        while (i13 < i12) {
            int min = Math.min(i13 + UserVerificationMethods.USER_VERIFY_ALL, i12) - i13;
            System.arraycopy(f100775b, 0, iArr, i11 + i13, min);
            i13 += min;
        }
    }

    static void b(int i11, byte[] bArr) {
        int i12 = 0;
        while (i12 < i11) {
            int min = Math.min(i12 + UserVerificationMethods.USER_VERIFY_ALL, i11) - i12;
            System.arraycopy(f100774a, 0, bArr, i12, min);
            i12 += min;
        }
    }
}
