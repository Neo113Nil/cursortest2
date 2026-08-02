package qj;

import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.j0;

/* renamed from: qj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6187a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5941t f63674a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC5941t f63675b;

    /* renamed from: c, reason: collision with root package name */
    public String f63676c;

    public C6187a(byte[] bArr) {
        Enumeration o10 = AbstractC5941t.k(bArr).o();
        while (o10.hasMoreElements()) {
            InterfaceC5927e interfaceC5927e = (InterfaceC5927e) o10.nextElement();
            if (interfaceC5927e instanceof AbstractC5941t) {
                this.f63674a = AbstractC5941t.k(interfaceC5927e);
            } else if (interfaceC5927e instanceof AbstractC5947z) {
                this.f63675b = AbstractC5941t.l((AbstractC5947z) interfaceC5927e, false);
            } else if (interfaceC5927e instanceof j0) {
                this.f63676c = j0.k(interfaceC5927e).getString();
            }
        }
    }
}
