package h90;

import k90.AbstractC7611a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC7611a f65192a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f65193b;

        public a(AbstractC7611a abstractC7611a, boolean z11) {
            this.f65192a = abstractC7611a;
            this.f65193b = z11;
        }

        public final boolean a() {
            return this.f65193b;
        }

        public final AbstractC7611a b() {
            return this.f65192a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f65192a, aVar.f65192a) && this.f65193b == aVar.f65193b;
        }

        public final int hashCode() {
            AbstractC7611a abstractC7611a = this.f65192a;
            return Boolean.hashCode(this.f65193b) + ((abstractC7611a == null ? 0 : abstractC7611a.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "NotificationData(notification=" + this.f65192a + ", needProcess=" + this.f65193b + ")";
        }
    }

    Object a(@NotNull k90.b bVar, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar);
}
