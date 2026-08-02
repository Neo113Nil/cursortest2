package rg;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import rg.AbstractC6281b;
import sg.e;

/* renamed from: rg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6280a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6280a f64381a = new C6280a();

    public final byte[] a(byte[] bArr, byte[] bArr2, AbstractC6281b.a aVar, byte[] bArr3) {
        if (aVar == null) {
            try {
                aVar = AbstractC6281b.a.AES_DEFAULT;
            } catch (Exception e10) {
                throw new e(e.a.WMS_SEC_206, e10.getMessage());
            }
        }
        String b10 = aVar.b();
        String algorithm = aVar.getAlgorithm();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, algorithm);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
        Cipher cipher = Cipher.getInstance(algorithm + "/" + b10 + "/NoPadding");
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        byte[] doFinal = cipher.doFinal(bArr3);
        Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return doFinal;
    }
}
