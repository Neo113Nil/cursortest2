package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pq4 implements Externalizable {
    public nek a;
    public lek b;

    private final Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        Object readObject = objectInput.readObject();
        readObject.getClass();
        this.a = (nek) readObject;
        Object readObject2 = objectInput.readObject();
        readObject2.getClass();
        this.b = t6a.h(c.k((byte[]) readObject2));
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(c.m(this.b.f));
    }
}
