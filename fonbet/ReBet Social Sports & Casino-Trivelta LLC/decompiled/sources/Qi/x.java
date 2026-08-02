package Qi;

import org.spongycastle.asn1.A;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.C5931i;
import org.spongycastle.asn1.InterfaceC5926d;

/* loaded from: classes5.dex */
public class x extends AbstractC5935m implements InterfaceC5926d {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5940s f9872a;

    public x(AbstractC5940s abstractC5940s) {
        if (!(abstractC5940s instanceof A) && !(abstractC5940s instanceof C5931i)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.f9872a = abstractC5940s;
    }

    public static x c(Object obj) {
        if (obj == null || (obj instanceof x)) {
            return (x) obj;
        }
        if (obj instanceof A) {
            return new x((A) obj);
        }
        if (obj instanceof C5931i) {
            return new x((C5931i) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public String e() {
        AbstractC5940s abstractC5940s = this.f9872a;
        return abstractC5940s instanceof A ? ((A) abstractC5940s).k() : ((C5931i) abstractC5940s).o();
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f9872a;
    }

    public String toString() {
        return e();
    }
}
