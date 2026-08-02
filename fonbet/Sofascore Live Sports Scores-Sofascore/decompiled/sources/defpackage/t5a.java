package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class t5a implements Externalizable {
    public long a;
    public int b;

    private final Object readResolve() {
        o5a o5aVar = o5a.c;
        return uic.l(this.b, this.a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.a = objectInput.readLong();
        this.b = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }
}
