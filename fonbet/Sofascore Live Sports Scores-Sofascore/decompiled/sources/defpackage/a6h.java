package defpackage;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a6h implements Externalizable {

    @NotNull
    public static final z5h b = new z5h(null);
    public Map a;

    public a6h() {
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.a = lm5Var;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(ljg.j(readByte, "Unsupported flags value: "));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(lnb.n("Illegal size value: ", readInt, '.'));
        }
        ltb ltbVar = new ltb(readInt);
        for (int i = 0; i < readInt; i++) {
            ltbVar.put(objectInput.readObject(), objectInput.readObject());
        }
        this.a = ltbVar.d();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
