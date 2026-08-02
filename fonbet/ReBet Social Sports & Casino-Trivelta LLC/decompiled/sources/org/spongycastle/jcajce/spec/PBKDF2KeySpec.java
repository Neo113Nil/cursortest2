package org.spongycastle.jcajce.spec;

import Li.f;
import Qi.a;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.asn1.X;

/* loaded from: classes5.dex */
public class PBKDF2KeySpec extends PBEKeySpec {
    private static final a defaultPRF = new a(f.f7242I0, X.f62244a);
    private a prf;

    public PBKDF2KeySpec(char[] cArr, byte[] bArr, int i10, int i11, a aVar) {
        super(cArr, bArr, i10, i11);
        this.prf = aVar;
    }

    public a getPrf() {
        return this.prf;
    }

    public boolean isDefaultPrf() {
        return defaultPRF.equals(this.prf);
    }
}
