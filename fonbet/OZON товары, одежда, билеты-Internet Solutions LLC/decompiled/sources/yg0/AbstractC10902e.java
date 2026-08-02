package yg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yg0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10902e {

    /* renamed from: yg0.e$a */
    public static final class a extends AbstractC10902e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f106636a;

        public a() {
            this(0);
        }

        @NotNull
        public final String a() {
            return this.f106636a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f106636a, ((a) obj).f106636a);
        }

        public final int hashCode() {
            return this.f106636a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Fatal(eventMessage="), this.f106636a, ")");
        }

        public /* synthetic */ a(int i11) {
            this("Тестовый Fatal-ивент");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String eventMessage) {
            super(0);
            Intrinsics.checkNotNullParameter(eventMessage, "eventMessage");
            this.f106636a = eventMessage;
        }
    }

    /* renamed from: yg0.e$b */
    public static final class b extends AbstractC10902e {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f106637a;

        public b() {
            this(0);
        }

        @NotNull
        public final String a() {
            return this.f106637a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f106637a, ((b) obj).f106637a);
        }

        public final int hashCode() {
            return this.f106637a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("NonFatal(eventMessage="), this.f106637a, ")");
        }

        public /* synthetic */ b(int i11) {
            this("Тестовый NonFatal-ивент");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String eventMessage) {
            super(0);
            Intrinsics.checkNotNullParameter(eventMessage, "eventMessage");
            this.f106637a = eventMessage;
        }
    }

    public AbstractC10902e(int i11) {
    }
}
