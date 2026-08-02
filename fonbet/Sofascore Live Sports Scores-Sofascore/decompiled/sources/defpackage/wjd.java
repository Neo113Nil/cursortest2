package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wjd implements pia {
    public final Object b;

    public wjd(Object obj) {
        w1a.m(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(pia.a));
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        if (obj instanceof wjd) {
            return this.b.equals(((wjd) obj).b);
        }
        return false;
    }

    @Override // defpackage.pia
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return lnb.p(new StringBuilder("ObjectKey{object="), this.b, '}');
    }
}
