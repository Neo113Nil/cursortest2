package org.spongycastle.asn1;

import java.util.Vector;

/* renamed from: org.spongycastle.asn1.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5928f {

    /* renamed from: a, reason: collision with root package name */
    public final Vector f62253a = new Vector();

    public void a(InterfaceC5927e interfaceC5927e) {
        this.f62253a.addElement(interfaceC5927e);
    }

    public InterfaceC5927e b(int i10) {
        return (InterfaceC5927e) this.f62253a.elementAt(i10);
    }

    public int c() {
        return this.f62253a.size();
    }
}
