package com.google.common.collect;

import defpackage.c1a;
import defpackage.dwf;
import defpackage.qjd;
import defpackage.rjd;
import defpackage.rv9;
import defpackage.sv9;
import defpackage.z1a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a extends c1a {
    public final /* synthetic */ sv9 d;

    public a(sv9 sv9Var) {
        this.d = sv9Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof qjd)) {
            return false;
        }
        qjd qjdVar = (qjd) obj;
        if (qjdVar.a() <= 0) {
            return false;
        }
        return ((dwf) this.d).e.b(qjdVar.a) == qjdVar.a();
    }

    @Override // defpackage.c1a
    public final Object get(int i) {
        rjd rjdVar = ((dwf) this.d).e;
        z1a.v(i, rjdVar.c);
        return new qjd(rjdVar, i);
    }

    @Override // defpackage.vv9, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.r().size();
    }

    @Override // defpackage.c1a, defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return new rv9(this.d);
    }
}
