package nf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.collections.f;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends f implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f20889a;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f20889a = entries;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new d(this.f20889a);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) p.r(element.ordinal(), this.f20889a)) == element;
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i5) {
        kotlin.collections.c cVar = f.Companion;
        Enum[] enumArr = this.f20889a;
        int length = enumArr.length;
        cVar.getClass();
        kotlin.collections.c.b(i5, length);
        return enumArr[i5];
    }

    @Override // kotlin.collections.a
    public final int getSize() {
        return this.f20889a.length;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) p.r(ordinal, this.f20889a)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) p.r(ordinal, this.f20889a)) == element) {
            return ordinal;
        }
        return -1;
    }
}
