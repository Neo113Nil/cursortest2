package cg;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f3937a;

    /* renamed from: b, reason: collision with root package name */
    public int f3938b;

    private final Object readResolve() {
        io.sentry.hints.j jVar = g.f3925c;
        return io.sentry.hints.j.u(this.f3938b, this.f3937a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f3937a = input.readLong();
        this.f3938b = input.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeLong(this.f3937a);
        output.writeInt(this.f3938b);
    }
}
