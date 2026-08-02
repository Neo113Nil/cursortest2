package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class umi implements tmi, Serializable {
    public transient Object a = new Object();
    public final tmi b;
    public volatile transient boolean c;
    public transient Object d;

    public umi(tmi tmiVar) {
        tmiVar.getClass();
        this.b = tmiVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = new Object();
    }

    @Override // defpackage.tmi
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        return mz1.n(new StringBuilder("Suppliers.memoize("), this.c ? mz1.n(new StringBuilder("<supplier that returned "), this.d, ">") : this.b, ")");
    }
}
