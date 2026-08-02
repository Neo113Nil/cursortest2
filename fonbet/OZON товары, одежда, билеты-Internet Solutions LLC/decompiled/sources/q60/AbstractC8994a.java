package q60;

import B90.C2618u;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: q60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8994a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Uri> f81729a;

    /* renamed from: q60.a$a, reason: collision with other inner class name */
    public static final class C1378a extends AbstractC8994a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Uri> f81730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1378a(@NotNull List<? extends Uri> uris) {
            super(uris);
            Intrinsics.checkNotNullParameter(uris, "uris");
            this.f81730b = uris;
        }

        @NotNull
        public final List<Uri> a() {
            return this.f81730b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1378a) && Intrinsics.d(this.f81730b, ((C1378a) obj).f81730b);
        }

        public final int hashCode() {
            return this.f81730b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("OpenFile(uris="), this.f81730b, ")");
        }
    }

    /* renamed from: q60.a$b */
    public static final class b extends AbstractC8994a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Uri> f81731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends Uri> uris) {
            super(uris);
            Intrinsics.checkNotNullParameter(uris, "uris");
            this.f81731b = uris;
        }

        @NotNull
        public final List<Uri> a() {
            return this.f81731b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f81731b, ((b) obj).f81731b);
        }

        public final int hashCode() {
            return this.f81731b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("OpenGallery(uris="), this.f81731b, ")");
        }
    }

    public AbstractC8994a(List list) {
        this.f81729a = list;
    }
}
