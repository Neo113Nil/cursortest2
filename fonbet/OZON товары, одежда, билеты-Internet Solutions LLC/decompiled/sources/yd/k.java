package yd;

import Jd.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.e0;
import zd.y;

/* loaded from: classes.dex */
public final class k implements Id.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f106574a = new k();

    public static final class a implements Id.a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final y f106575b;

        public a(@NotNull y javaElement) {
            Intrinsics.checkNotNullParameter(javaElement, "javaElement");
            this.f106575b = javaElement;
        }

        @Override // Id.a
        public final y a() {
            return this.f106575b;
        }

        @Override // td.d0
        @NotNull
        public final void b() {
            e0 NO_SOURCE_FILE = e0.f99393a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        }

        @NotNull
        public final y c() {
            return this.f106575b;
        }

        @NotNull
        public final String toString() {
            return a.class.getName() + ": " + this.f106575b;
        }
    }

    @NotNull
    public final a a(@NotNull l javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new a((y) javaElement);
    }
}
