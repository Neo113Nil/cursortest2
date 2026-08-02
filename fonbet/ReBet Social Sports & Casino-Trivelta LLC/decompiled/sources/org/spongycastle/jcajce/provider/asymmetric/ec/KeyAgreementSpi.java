package org.spongycastle.jcajce.provider.asymmetric.ec;

import Ri.m;
import Ti.b;
import Ti.c;
import Xi.h;
import ej.AbstractC4217a;
import fj.AbstractC4310a;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import kj.AbstractC5263b;
import mj.InterfaceC5593a;
import mj.InterfaceC5594b;
import org.spongycastle.crypto.d;
import org.spongycastle.crypto.params.k;
import org.spongycastle.crypto.params.n;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;

/* loaded from: classes5.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final m converter = new m();
    private d agreement;
    private String kaAlgorithm;
    private AbstractC5263b mqvParameters;
    private k parameters;
    private BigInteger result;

    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", new c(), new h(AbstractC4217a.b()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", new c(), new h(AbstractC4217a.c()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", new c(), new h(AbstractC4217a.d()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", new c(), new h(AbstractC4217a.e()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", new c(), new h(AbstractC4217a.j()));
        }
    }

    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", new b(), null);
        }
    }

    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new c(), null);
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", new c(), new Ui.a(AbstractC4217a.b()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", new b(), new h(AbstractC4217a.b()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", new b(), new h(AbstractC4217a.b()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", new b(), new h(AbstractC4217a.c()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", new c(), new Ui.a(AbstractC4217a.d()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", new b(), new h(AbstractC4217a.d()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", new c(), new Ui.a(AbstractC4217a.e()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", new b(), new h(AbstractC4217a.e()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", new c(), new Ui.a(AbstractC4217a.j()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", new b(), new h(AbstractC4217a.j()));
        }
    }

    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new Ti.d(), null);
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", new Ti.d(), new Ui.a(AbstractC4217a.b()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", new Ti.d(), new h(AbstractC4217a.b()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", new Ti.d(), new Ui.a(AbstractC4217a.c()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", new Ti.d(), new h(AbstractC4217a.c()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", new Ti.d(), new Ui.a(AbstractC4217a.d()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", new Ti.d(), new h(AbstractC4217a.d()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", new Ti.d(), new Ui.a(AbstractC4217a.e()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", new Ti.d(), new h(AbstractC4217a.e()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", new Ti.d(), new Ui.a(AbstractC4217a.j()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", new Ti.d(), new h(AbstractC4217a.j()));
        }
    }

    public class a extends InvalidKeyException {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Exception f62691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Exception exc) {
            super(str);
            this.f62691a = exc;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f62691a;
        }
    }

    public KeyAgreementSpi(String str, d dVar, org.spongycastle.crypto.m mVar) {
        super(str, mVar);
        this.kaAlgorithm = str;
        this.agreement = dVar;
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        if (this.agreement instanceof Ti.d) {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(AbstractC5263b.class) + " for initialisation");
        }
        if (key instanceof PrivateKey) {
            n nVar = (n) org.spongycastle.jcajce.provider.asymmetric.util.c.b((PrivateKey) key);
            this.parameters = nVar.b();
            this.ukmParameters = null;
            this.agreement.a(nVar);
            return;
        }
        throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(InterfaceC5593a.class) + " for initialisation");
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        m mVar = converter;
        return mVar.c(bigInteger, mVar.a(this.parameters.a()));
    }

    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return bigIntToBytes(this.result);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z10) {
        if (this.parameters == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        }
        if (!z10) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        }
        if (this.agreement instanceof Ti.d) {
            throw null;
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(InterfaceC5594b.class) + " for doPhase");
        }
        try {
            this.result = this.agreement.b(AbstractC4310a.a((PublicKey) key));
            return null;
        } catch (Exception e10) {
            throw new a("calculation failed: " + e10.getMessage(), e10);
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        initFromKey(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) {
        initFromKey(key, null);
    }
}
