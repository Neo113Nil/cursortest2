package e3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f8545a;

    /* renamed from: b, reason: collision with root package name */
    public final m3.o f8546b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8547c;

    public m0(UUID id2, m3.o workSpec, LinkedHashSet tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f8545a = id2;
        this.f8546b = workSpec;
        this.f8547c = tags;
    }
}
