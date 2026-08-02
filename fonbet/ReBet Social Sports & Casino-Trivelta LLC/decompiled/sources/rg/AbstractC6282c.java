package rg;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.spec.MGF1ParameterSpec;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import sg.e;

/* renamed from: rg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6282c {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f64389a = Logger.getLogger(AbstractC6282c.class.getName());

    public static byte[] a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-256ANDMGF1PADDING");
            cipher.init(2, privateKey, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT));
            return cipher.doFinal(bArr);
        } catch (Exception e10) {
            throw new e(e.a.WMS_SEC_204, e10.getMessage());
        }
    }

    public static KeyPair b() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }
}
