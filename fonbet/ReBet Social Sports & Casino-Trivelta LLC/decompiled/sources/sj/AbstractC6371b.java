package sj;

import Qi.u;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.P;
import org.spongycastle.asn1.f0;
import rj.InterfaceC6305a;

/* renamed from: sj.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6371b {

    /* renamed from: a, reason: collision with root package name */
    public u f64948a;

    /* renamed from: b, reason: collision with root package name */
    public Oi.c f64949b;

    /* renamed from: c, reason: collision with root package name */
    public List f64950c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f64951d = false;

    public AbstractC6371b(Oi.c cVar, u uVar) {
        this.f64949b = cVar;
        this.f64948a = uVar;
    }

    public AbstractC6371b a(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        this.f64950c.add(new Li.a(c5936n, new f0(interfaceC5927e)));
        return this;
    }

    public C6370a b(InterfaceC6305a interfaceC6305a) {
        Li.c cVar;
        if (this.f64950c.isEmpty()) {
            cVar = this.f64951d ? new Li.c(this.f64949b, this.f64948a, null) : new Li.c(this.f64949b, this.f64948a, new f0());
        } else {
            C5928f c5928f = new C5928f();
            Iterator it = this.f64950c.iterator();
            while (it.hasNext()) {
                c5928f.a(Li.a.c(it.next()));
            }
            cVar = new Li.c(this.f64949b, this.f64948a, new f0(c5928f));
        }
        try {
            OutputStream a10 = interfaceC6305a.a();
            a10.write(cVar.b(ASN1Encoding.DER));
            a10.close();
            return new C6370a(new Li.b(cVar, interfaceC6305a.b(), new P(interfaceC6305a.getSignature())));
        } catch (IOException unused) {
            throw new IllegalStateException("cannot produce certification request signature");
        }
    }
}
