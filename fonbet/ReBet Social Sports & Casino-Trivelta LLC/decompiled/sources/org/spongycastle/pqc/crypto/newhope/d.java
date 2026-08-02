package org.spongycastle.pqc.crypto.newhope;

import java.security.SecureRandom;
import org.spongycastle.crypto.params.AbstractC5975b;
import vj.C6693a;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final SecureRandom f62872a;

    public d(SecureRandom secureRandom) {
        this.f62872a = secureRandom;
    }

    public C6693a a(AbstractC5975b abstractC5975b) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[2048];
        g.e(this.f62872a, bArr, bArr2, ((e) abstractC5975b).pubData);
        return new C6693a(new e(bArr2), bArr);
    }
}
