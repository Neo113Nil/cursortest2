package fe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fe.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6544x {

    /* renamed from: fe.x$a */
    public static final class a implements InterfaceC6544x {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f63263a = new a();

        @Override // fe.InterfaceC6544x
        @NotNull
        public final je.N a(@NotNull Nd.p proto, @NotNull String flexibleId, @NotNull je.Y lowerBound, @NotNull je.Y upperBound) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    @NotNull
    je.N a(@NotNull Nd.p pVar, @NotNull String str, @NotNull je.Y y11, @NotNull je.Y y12);
}
