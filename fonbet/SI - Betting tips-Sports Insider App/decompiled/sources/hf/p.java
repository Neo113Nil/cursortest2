package hf;

import androidx.appcompat.widget.c1;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final o f10630b = new o(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public Map f10631a;

    public p(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f10631a = map;
    }

    private final Object readResolve() {
        return this.f10631a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(c1.i(readByte, "Unsupported flags value: "));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        i builder = new i(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            builder.put(input.readObject(), input.readObject());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f10631a = builder.c();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.f10631a.size());
        for (Map.Entry entry : this.f10631a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public p() {
        this(n0.c());
    }
}
