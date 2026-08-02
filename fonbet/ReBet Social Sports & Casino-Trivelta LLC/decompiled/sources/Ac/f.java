package Ac;

import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public f() {
    }

    public final void c(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr.length == 32) {
            System.arraycopy(bArr, 0, bArr2, i10, 32);
        } else if (bArr.length > 32) {
            System.arraycopy(bArr, bArr.length - 32, bArr2, i10, 32);
        } else {
            System.arraycopy(bArr, 0, bArr2, (32 - bArr.length) + i10, bArr.length);
        }
    }

    public final byte[] d(ECPublicKey eCPublicKey) {
        byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
        byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
        byte[] bArr = new byte[65];
        bArr[0] = 4;
        Intrinsics.checkNotNull(byteArray);
        c(byteArray, bArr, 1);
        Intrinsics.checkNotNull(byteArray2);
        c(byteArray2, bArr, 33);
        return bArr;
    }

    public final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
        byte[] doFinal = mac.doFinal(bArr);
        Mac mac2 = Mac.getInstance("HmacSHA256");
        mac2.init(new SecretKeySpec(doFinal, "HmacSHA256"));
        byte[] bArr4 = new byte[i10];
        byte[] bArr5 = new byte[0];
        int i11 = 0;
        byte b10 = 1;
        while (i11 < i10) {
            mac2.update(bArr5);
            mac2.update(bArr3);
            mac2.update(new byte[]{b10});
            bArr5 = mac2.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArr5, "doFinal(...)");
            int min = Math.min(bArr5.length, i10 - i11);
            System.arraycopy(bArr5, 0, bArr4, i11, min);
            i11 += min;
            b10 = (byte) (b10 + 1);
        }
        return bArr4;
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
