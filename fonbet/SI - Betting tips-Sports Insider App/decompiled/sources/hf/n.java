package hf;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.collections.t;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements Externalizable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final m f10627c = new m(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public Collection f10628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10629b;

    public n() {
        this(0, e0.f19204a);
    }

    private final Object readResolve() {
        return this.f10628a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Collection a7;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i5 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i10 = 0;
        if (i5 == 0) {
            e eVar = new e(readInt);
            while (i10 < readInt) {
                eVar.add(input.readObject());
                i10++;
            }
            a7 = t.a(eVar);
        } else {
            if (i5 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i5 + '.');
            }
            r rVar = new r(new i(readInt));
            while (i10 < readInt) {
                rVar.add(input.readObject());
                i10++;
            }
            a7 = u0.a(rVar);
        }
        this.f10628a = a7;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.f10629b);
        output.writeInt(this.f10628a.size());
        Iterator it = this.f10628a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public n(int i5, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f10628a = collection;
        this.f10629b = i5;
    }
}
