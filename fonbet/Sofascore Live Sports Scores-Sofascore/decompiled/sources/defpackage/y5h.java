package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class y5h implements Externalizable {

    @NotNull
    public static final x5h c = new x5h(null);
    public Collection a;
    public final int b;

    public y5h(int i, Collection collection) {
        collection.getClass();
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection a;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException(lnb.n("Unsupported flags value: ", readByte, '.'));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(lnb.n("Illegal size value: ", readInt, '.'));
        }
        int i2 = 0;
        if (i == 0) {
            xbb xbbVar = new xbb(readInt);
            while (i2 < readInt) {
                xbbVar.add(objectInput.readObject());
                i2++;
            }
            a = a.a(xbbVar);
        } else {
            if (i != 1) {
                throw new InvalidObjectException(lnb.n("Unsupported collection type tag: ", i, '.'));
            }
            c9h c9hVar = new c9h(readInt);
            while (i2 < readInt) {
                c9hVar.add(objectInput.readObject());
                i2++;
            }
            a = w9h.a(c9hVar);
        }
        this.a = a;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public y5h() {
        this(0, km5.a);
    }
}
