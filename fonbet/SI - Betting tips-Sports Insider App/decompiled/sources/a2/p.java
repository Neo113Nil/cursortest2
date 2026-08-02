package a2;

import androidx.lifecycle.q0;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements q0, FunctionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f58a;

    public p(i function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f58a = function;
    }

    @Override // androidx.lifecycle.q0
    public final /* synthetic */ void a(Object obj) {
        this.f58a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual(this.f58a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.f58a;
    }

    public final int hashCode() {
        return this.f58a.hashCode();
    }
}
