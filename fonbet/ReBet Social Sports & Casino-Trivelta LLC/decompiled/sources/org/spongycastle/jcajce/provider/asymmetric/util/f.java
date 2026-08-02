package org.spongycastle.jcajce.provider.asymmetric.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import mj.InterfaceC5595c;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;

/* loaded from: classes5.dex */
public class f implements InterfaceC5595c {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f62698a;

    /* renamed from: b, reason: collision with root package name */
    public Vector f62699b;

    public f(Hashtable hashtable, Vector vector) {
        this.f62698a = hashtable;
        this.f62699b = vector;
    }

    @Override // mj.InterfaceC5595c
    public InterfaceC5927e getBagAttribute(C5936n c5936n) {
        return (InterfaceC5927e) this.f62698a.get(c5936n);
    }

    @Override // mj.InterfaceC5595c
    public Enumeration getBagAttributeKeys() {
        return this.f62699b.elements();
    }

    @Override // mj.InterfaceC5595c
    public void setBagAttribute(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        if (this.f62698a.containsKey(c5936n)) {
            this.f62698a.put(c5936n, interfaceC5927e);
        } else {
            this.f62698a.put(c5936n, interfaceC5927e);
            this.f62699b.addElement(c5936n);
        }
    }

    public f() {
        this(new Hashtable(), new Vector());
    }
}
