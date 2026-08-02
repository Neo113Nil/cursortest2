package gh0;

import java.util.concurrent.CompletableFuture;
import jh0.C7429a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gh0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC6738d {

    /* renamed from: gh0.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final jh0.b f64488a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final jh0.c f64489b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Wh0.d<C7429a> f64490c;

        public a(@NotNull jh0.b pushTokenType, @NotNull jh0.c updateTrigger, @NotNull Wh0.d<C7429a> result) {
            Intrinsics.checkNotNullParameter(pushTokenType, "pushTokenType");
            Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
            Intrinsics.checkNotNullParameter(result, "result");
            this.f64488a = pushTokenType;
            this.f64489b = updateTrigger;
            this.f64490c = result;
        }

        @NotNull
        public final jh0.b a() {
            return this.f64488a;
        }

        @NotNull
        public final Wh0.d<C7429a> b() {
            return this.f64490c;
        }

        @NotNull
        public final jh0.c c() {
            return this.f64489b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64488a == aVar.f64488a && this.f64489b == aVar.f64489b && Intrinsics.d(this.f64490c, aVar.f64490c);
        }

        public final int hashCode() {
            return this.f64490c.hashCode() + ((this.f64489b.hashCode() + (this.f64488a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "PushTokenUpdateResult(pushTokenType=" + this.f64488a + ", updateTrigger=" + this.f64489b + ", result=" + this.f64490c + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: gh0.d$b */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b FCM;
        public static final b HMS;
        public static final b RU_STORE;

        static {
            b bVar = new b("FCM", 0);
            FCM = bVar;
            b bVar2 = new b("HMS", 1);
            HMS = bVar2;
            b bVar3 = new b("RU_STORE", 2);
            RU_STORE = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    @NotNull
    CompletableFuture<a> a(@NotNull jh0.c cVar);

    @NotNull
    b getType();
}
