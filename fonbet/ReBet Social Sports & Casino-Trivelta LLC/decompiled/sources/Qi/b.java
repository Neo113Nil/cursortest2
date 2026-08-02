package Qi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.InterfaceC5926d;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.i0;

/* loaded from: classes5.dex */
public class b extends AbstractC5935m implements InterfaceC5926d {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5927e f9762a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC5940s f9763b;

    public b(o oVar) {
        this.f9762a = oVar;
        this.f9763b = oVar.toASN1Primitive();
    }

    public static b c(Object obj) {
        if (obj == null || (obj instanceof b)) {
            return (b) obj;
        }
        if (obj instanceof y) {
            return new b(y.c(obj));
        }
        if (obj instanceof o) {
            return new b((o) obj);
        }
        if (obj instanceof AbstractC5947z) {
            return new b(y.e((AbstractC5947z) obj, false));
        }
        if (obj instanceof AbstractC5941t) {
            return new b(o.c(obj));
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f9763b;
    }

    public b(y yVar) {
        this.f9762a = yVar;
        this.f9763b = new i0(false, 0, this.f9762a);
    }
}
