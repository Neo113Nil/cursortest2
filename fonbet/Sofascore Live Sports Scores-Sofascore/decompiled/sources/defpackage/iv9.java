package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class iv9 extends g41 implements Serializable {
    public final transient awf e;
    public final transient int f;

    public iv9(awf awfVar, int i) {
        this.e = awfVar;
        this.f = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(ljg.j(readInt, "Invalid key count "));
        }
        b10 d = lv9.d();
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(ljg.j(readInt2, "Invalid value count "));
            }
            zu9 s = hv9.s();
            for (int i3 = 0; i3 < readInt2; i3++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                s.c(readObject2);
            }
            d.A(readObject, s.g());
            i += readInt2;
        }
        try {
            awf c = d.c(true);
            cqa cqaVar = ov9.a;
            cqaVar.getClass();
            try {
                ((Field) cqaVar.a).set(this, c);
                cqa cqaVar2 = ov9.b;
                cqaVar2.getClass();
                try {
                    ((Field) cqaVar2.a).set(this, Integer.valueOf(i));
                } catch (IllegalAccessException e) {
                    a70.j(e);
                }
            } catch (IllegalAccessException e2) {
                a70.j(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(d().size());
        for (Map.Entry entry : d().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    @Override // defpackage.t6
    public final void g() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t6
    public final boolean h(Object obj) {
        return obj != null && super.h(obj);
    }

    @Override // defpackage.t6
    public final Map i() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.t6
    public final Collection j() {
        return new nv9(this);
    }

    @Override // defpackage.t6
    public final Set k() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.t6
    public final Collection l() {
        return (wu9) super.l();
    }

    @Override // defpackage.t6
    public final Iterator m() {
        return new mv9(this);
    }

    @Override // defpackage.t6
    public final Collection n(Object obj) {
        hv9 hv9Var = (hv9) this.e.get(obj);
        if (hv9Var != null) {
            return hv9Var;
        }
        av9 av9Var = hv9.b;
        return vvf.e;
    }

    @Override // defpackage.t6
    public final Set o() {
        return this.e.keySet();
    }

    @Override // defpackage.t6
    public final boolean p(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t6
    public final int q() {
        return this.f;
    }

    @Override // defpackage.t6
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public lv9 d() {
        return this.e;
    }
}
