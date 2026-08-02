package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f69825a = new a();

    public static final class a extends B0 {
        @Override // je.B0
        public final y0 e(N key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    @NotNull
    public final F0 c() {
        F0 f7 = F0.f(this);
        Intrinsics.checkNotNullExpressionValue(f7, "create(...)");
        return f7;
    }

    @NotNull
    public InterfaceC10030h d(@NotNull InterfaceC10030h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    public abstract y0 e(@NotNull N n11);

    public boolean f() {
        return this instanceof a;
    }

    @NotNull
    public N g(@NotNull N topLevelType, @NotNull L0 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }
}
