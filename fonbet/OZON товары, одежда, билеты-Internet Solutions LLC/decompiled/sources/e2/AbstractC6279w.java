package e2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC6279w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f61858a;

    public AbstractC6279w(@NotNull Object obj) {
        this.f61858a = obj;
        new LinkedHashMap();
    }

    @NotNull
    public Object a() {
        return this.f61858a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC6279w) && Intrinsics.d(a(), ((AbstractC6279w) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
