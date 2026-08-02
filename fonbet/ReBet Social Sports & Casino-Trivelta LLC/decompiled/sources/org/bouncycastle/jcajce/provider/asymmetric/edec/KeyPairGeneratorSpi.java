package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.Ed25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.Ed448KeyPairGenerator;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.X448KeyPairGenerator;
import org.bouncycastle.crypto.params.Ed25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.Ed448KeyGenerationParameters;
import org.bouncycastle.crypto.params.X25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.X448KeyGenerationParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;

/* loaded from: classes5.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 0;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 2;
    private static final int XDH = -2;
    private int algorithm;
    private AsymmetricCipherKeyPairGenerator generator;
    private boolean initialised;
    private SecureRandom secureRandom;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1, new Ed25519KeyPairGenerator());
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(0, new Ed448KeyPairGenerator());
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1, null);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3, new X25519KeyPairGenerator());
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(2, new X448KeyPairGenerator());
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2, null);
        }
    }

    public KeyPairGeneratorSpi(int i10, AsymmetricCipherKeyPairGenerator asymmetricCipherKeyPairGenerator) {
        this.algorithm = i10;
        this.generator = asymmetricCipherKeyPairGenerator;
    }

    private void algorithmCheck(int i10) {
        int i11 = this.algorithm;
        if (i11 != i10) {
            if (i11 == 1 || i11 == 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (i11 == -1 && i10 != 1 && i10 != 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (i11 == 3 || i11 == 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (i11 == -2 && i10 != 3 && i10 != 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
        }
    }

    private void initializeGenerator(String str) {
        int i10;
        AsymmetricCipherKeyPairGenerator ed448KeyPairGenerator;
        if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed448) || str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
            i10 = 0;
            algorithmCheck(0);
            ed448KeyPairGenerator = new Ed448KeyPairGenerator();
        } else if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed25519) || str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
            i10 = 1;
            algorithmCheck(1);
            ed448KeyPairGenerator = new Ed25519KeyPairGenerator();
        } else if (str.equalsIgnoreCase(XDHParameterSpec.X448) || str.equals(EdECObjectIdentifiers.id_X448.getId())) {
            i10 = 2;
            algorithmCheck(2);
            ed448KeyPairGenerator = new X448KeyPairGenerator();
        } else {
            if (!str.equalsIgnoreCase(XDHParameterSpec.X25519) && !str.equals(EdECObjectIdentifiers.id_X25519.getId())) {
                return;
            }
            i10 = 3;
            algorithmCheck(3);
            ed448KeyPairGenerator = new X25519KeyPairGenerator();
        }
        this.generator = ed448KeyPairGenerator;
        setupGenerator(i10);
    }

    private void setupGenerator(int i10) {
        AsymmetricCipherKeyPairGenerator asymmetricCipherKeyPairGenerator;
        KeyGenerationParameters x25519KeyGenerationParameters;
        this.initialised = true;
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 == 0) {
                    asymmetricCipherKeyPairGenerator = this.generator;
                    x25519KeyGenerationParameters = new Ed448KeyGenerationParameters(this.secureRandom);
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        asymmetricCipherKeyPairGenerator = this.generator;
                        x25519KeyGenerationParameters = new X448KeyGenerationParameters(this.secureRandom);
                    } else if (i10 != 3) {
                        return;
                    }
                }
                asymmetricCipherKeyPairGenerator.init(x25519KeyGenerationParameters);
            }
            asymmetricCipherKeyPairGenerator = this.generator;
            x25519KeyGenerationParameters = new Ed25519KeyGenerationParameters(this.secureRandom);
            asymmetricCipherKeyPairGenerator.init(x25519KeyGenerationParameters);
        }
        asymmetricCipherKeyPairGenerator = this.generator;
        x25519KeyGenerationParameters = new X25519KeyGenerationParameters(this.secureRandom);
        asymmetricCipherKeyPairGenerator.init(x25519KeyGenerationParameters);
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.generator == null) {
            throw new IllegalStateException("generator not correctly initialized");
        }
        if (!this.initialised) {
            setupGenerator(this.algorithm);
        }
        AsymmetricCipherKeyPair generateKeyPair = this.generator.generateKeyPair();
        int i10 = this.algorithm;
        return (i10 == -2 || i10 == 2 || i10 == 3) ? new KeyPair(new BCXDHPublicKey(generateKeyPair.getPublic()), new BCXDHPrivateKey(generateKeyPair.getPrivate())) : new KeyPair(new BCEdDSAPublicKey(generateKeyPair.getPublic()), new BCEdDSAPrivateKey(generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        int i11;
        AsymmetricCipherKeyPairGenerator x25519KeyPairGenerator;
        this.secureRandom = secureRandom;
        try {
            if (i10 == 255 || i10 == 256) {
                int i12 = this.algorithm;
                i11 = 3;
                if (i12 != -2) {
                    if (i12 == -1 || i12 == 1) {
                        algorithmCheck(1);
                        this.generator = new Ed25519KeyPairGenerator();
                        setupGenerator(1);
                        return;
                    } else if (i12 != 3) {
                        throw new InvalidParameterException("key size not configurable");
                    }
                }
                algorithmCheck(3);
                x25519KeyPairGenerator = new X25519KeyPairGenerator();
            } else {
                if (i10 != 448) {
                    throw new InvalidParameterException("unknown key size");
                }
                int i13 = this.algorithm;
                i11 = 2;
                if (i13 != -2) {
                    if (i13 == -1 || i13 == 0) {
                        algorithmCheck(0);
                        this.generator = new Ed448KeyPairGenerator();
                        setupGenerator(0);
                        return;
                    } else if (i13 != 2) {
                        throw new InvalidParameterException("key size not configurable");
                    }
                }
                algorithmCheck(2);
                x25519KeyPairGenerator = new X448KeyPairGenerator();
            }
            this.generator = x25519KeyPairGenerator;
            setupGenerator(i11);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidParameterException(e10.getMessage());
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String curveName;
        this.secureRandom = secureRandom;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            curveName = ((ECGenParameterSpec) algorithmParameterSpec).getName();
        } else if (algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec) {
            curveName = ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
        } else if (algorithmParameterSpec instanceof EdDSAParameterSpec) {
            curveName = ((EdDSAParameterSpec) algorithmParameterSpec).getCurveName();
        } else {
            if (!(algorithmParameterSpec instanceof XDHParameterSpec)) {
                String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                if (nameFrom != null) {
                    initializeGenerator(nameFrom);
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
            }
            curveName = ((XDHParameterSpec) algorithmParameterSpec).getCurveName();
        }
        initializeGenerator(curveName);
    }
}
