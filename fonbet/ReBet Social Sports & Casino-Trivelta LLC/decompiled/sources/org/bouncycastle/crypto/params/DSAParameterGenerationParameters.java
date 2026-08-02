package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* renamed from: l, reason: collision with root package name */
    private final int f61774l;

    /* renamed from: n, reason: collision with root package name */
    private final int f61775n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom) {
        this(i10, i11, i12, secureRandom, -1);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f61774l;
    }

    public int getN() {
        return this.f61775n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom, int i13) {
        this.f61774l = i10;
        this.f61775n = i11;
        this.certainty = i12;
        this.usageIndex = i13;
        this.random = secureRandom;
    }
}
