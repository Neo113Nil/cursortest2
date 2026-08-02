package y1;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25522a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f25523b;

    public a(int i5) {
        this.f25522a = i5;
        kotlin.collections.n0.c().getClass();
        Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        this.f25523b = source;
    }

    @Override // y1.c0
    public final int a() {
        return this.f25522a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Intrinsics.areEqual(a.class, obj.getClass()) && this.f25522a == ((a) obj).f25522a;
    }

    @Override // y1.c0
    public final Bundle getArguments() {
        return this.f25523b;
    }

    public final int hashCode() {
        return 31 + this.f25522a;
    }

    public final String toString() {
        return d9.e.i(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f25522a, ')');
    }
}
