package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g1g implements pia {
    public static final dy9 j = new dy9(50);
    public final kn4 b;
    public final pia c;
    public final pia d;
    public final int e;
    public final int f;
    public final Class g;
    public final uvd h;
    public final bwj i;

    public g1g(kn4 kn4Var, pia piaVar, pia piaVar2, int i, int i2, bwj bwjVar, Class cls, uvd uvdVar) {
        this.b = kn4Var;
        this.c = piaVar;
        this.d = piaVar2;
        this.e = i;
        this.f = i2;
        this.i = bwjVar;
        this.g = cls;
        this.h = uvdVar;
    }

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
        Object g;
        kn4 kn4Var = this.b;
        synchronized (kn4Var) {
            wmb wmbVar = (wmb) kn4Var.d;
            h0f h0fVar = (h0f) ((ArrayDeque) wmbVar.b).poll();
            if (h0fVar == null) {
                h0fVar = wmbVar.R();
            }
            vmb vmbVar = (vmb) h0fVar;
            vmbVar.b = 8;
            vmbVar.c = byte[].class;
            g = kn4Var.g(vmbVar, byte[].class);
        }
        byte[] bArr = (byte[]) g;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        bwj bwjVar = this.i;
        if (bwjVar != null) {
            bwjVar.b(messageDigest);
        }
        this.h.b(messageDigest);
        dy9 dy9Var = j;
        Class cls = this.g;
        byte[] bArr2 = (byte[]) dy9Var.c(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(pia.a);
            dy9Var.f(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.b.j(bArr);
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        if (!(obj instanceof g1g)) {
            return false;
        }
        g1g g1gVar = (g1g) obj;
        return this.f == g1gVar.f && this.e == g1gVar.e && kik.k(this.i, g1gVar.i) && this.g.equals(g1gVar.g) && this.c.equals(g1gVar.c) && this.d.equals(g1gVar.d) && this.h.equals(g1gVar.h);
    }

    @Override // defpackage.pia
    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        bwj bwjVar = this.i;
        if (bwjVar != null) {
            hashCode = (hashCode * 31) + bwjVar.hashCode();
        }
        int hashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
