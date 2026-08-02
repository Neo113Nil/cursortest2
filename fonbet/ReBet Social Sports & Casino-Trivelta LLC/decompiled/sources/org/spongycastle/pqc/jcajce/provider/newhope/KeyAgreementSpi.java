package org.spongycastle.pqc.jcajce.provider.newhope;

import android.support.v4.media.session.b;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.spongycastle.pqc.crypto.newhope.c;
import org.spongycastle.pqc.crypto.newhope.d;
import org.spongycastle.pqc.crypto.newhope.e;
import vj.C6693a;
import yj.a;

/* loaded from: classes5.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private c agreement;
    private d exchangePairGenerator;
    private a otherPartyKey;
    private byte[] shared;

    public KeyAgreementSpi() {
        super("NH", null);
    }

    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return engineGenerateSecret();
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z10) {
        if (!z10) {
            throw new IllegalStateException("NewHope can only be between two parties.");
        }
        a aVar = (a) key;
        this.otherPartyKey = aVar;
        d dVar = this.exchangePairGenerator;
        if (dVar == null) {
            this.shared = this.agreement.a(aVar.a());
            return null;
        }
        C6693a a10 = dVar.a((AbstractC5975b) aVar.a());
        this.shared = a10.b();
        return new a((e) a10.a());
    }

    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        byte[] d10 = Aj.a.d(this.shared);
        Aj.a.m(this.shared, (byte) 0);
        return d10;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) {
        if (key == null) {
            this.exchangePairGenerator = new d(secureRandom);
        } else {
            this.agreement = new c();
            b.a(key);
            throw null;
        }
    }

    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i10) {
        byte[] bArr2 = this.shared;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        Aj.a.m(this.shared, (byte) 0);
        return this.shared.length;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("NewHope does not require parameters");
    }
}
