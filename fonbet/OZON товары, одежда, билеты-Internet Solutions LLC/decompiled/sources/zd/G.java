package zd;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class G extends AbstractC11095C implements Jd.v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f108805a;

    public G(@NotNull Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.f108805a = recordComponent;
    }

    @Override // zd.AbstractC11095C
    @NotNull
    public final Member I() {
        Method b11 = C11099a.b(this.f108805a);
        if (b11 != null) {
            return b11;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // Jd.v
    @NotNull
    public final Jd.w getType() {
        Class c11 = C11099a.c(this.f108805a);
        if (c11 != null) {
            return new w(c11);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
