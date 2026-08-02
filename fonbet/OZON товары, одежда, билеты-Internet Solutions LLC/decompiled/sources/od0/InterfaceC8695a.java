package od0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: od0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8695a {

    /* renamed from: od0.a$a, reason: collision with other inner class name */
    public static final class C1321a implements InterfaceC8695a {
    }

    /* renamed from: od0.a$b */
    public static final class b implements InterfaceC8695a {

        /* renamed from: a, reason: collision with root package name */
        private final c f78076a;

        public b(c cVar) {
            this.f78076a = cVar;
        }

        public final c a() {
            return this.f78076a;
        }
    }

    /* renamed from: od0.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f78077a;

        /* renamed from: b, reason: collision with root package name */
        private final String f78078b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f78079c;

        public c(String str, String str2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f78077a = str;
            this.f78078b = str2;
            this.f78079c = message;
        }

        public final String a() {
            return this.f78077a;
        }

        @NotNull
        public final String b() {
            return this.f78079c;
        }

        public final String c() {
            return this.f78078b;
        }
    }

    /* renamed from: od0.a$d */
    public static final class d implements InterfaceC8695a {

        /* renamed from: a, reason: collision with root package name */
        private final c f78080a;

        public d(c cVar) {
            this.f78080a = cVar;
        }

        public final c a() {
            return this.f78080a;
        }
    }
}
