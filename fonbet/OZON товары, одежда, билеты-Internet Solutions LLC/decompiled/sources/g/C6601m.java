package g;

import h.C6761g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6601m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C6761g.f f63683a = C6761g.b.f64579a;

    /* renamed from: g.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private C6761g.f f63684a = C6761g.b.f64579a;

        @NotNull
        public final C6601m a() {
            C6601m c6601m = new C6601m();
            c6601m.b(this.f63684a);
            return c6601m;
        }

        @NotNull
        public final void b(@NotNull C6761g.f mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f63684a = mediaType;
        }
    }

    @NotNull
    public final C6761g.f a() {
        return this.f63683a;
    }

    public final void b(@NotNull C6761g.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f63683a = fVar;
    }
}
