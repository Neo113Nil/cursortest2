package dg;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f8378a;

    /* renamed from: b, reason: collision with root package name */
    public long f8379b;

    private final Object readResolve() {
        long j = this.f8378a;
        long j6 = this.f8379b;
        return (j == 0 && j6 == 0) ? b.f8375d : new b(j, j6);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f8378a = input.readLong();
        this.f8379b = input.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeLong(this.f8378a);
        output.writeLong(this.f8379b);
    }
}
