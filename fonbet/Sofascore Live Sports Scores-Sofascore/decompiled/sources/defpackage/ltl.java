package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ltl {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends ltl {
        public final n4m a;

        public a(@Nullable n4m n4mVar) {
            super(null);
            this.a = n4mVar;
        }

        public static a copy$default(a aVar, n4m n4mVar, int i, Object obj) {
            if ((i & 1) != 0) {
                n4mVar = aVar.a;
            }
            aVar.getClass();
            return new a(n4mVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            n4m n4mVar = this.a;
            if (n4mVar == null) {
                return 0;
            }
            return n4mVar.hashCode();
        }

        public final String toString() {
            return "Initial(playable=" + this.a + ')';
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends ltl {
        public final n4m a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull n4m n4mVar) {
            super(null);
            n4mVar.getClass();
            this.a = n4mVar;
        }

        public static b copy$default(b bVar, n4m n4mVar, int i, Object obj) {
            if ((i & 1) != 0) {
                n4mVar = bVar.a;
            }
            bVar.getClass();
            n4mVar.getClass();
            return new b(n4mVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ReadyToPlay(playable=" + this.a + ')';
        }
    }

    public ltl(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends ltl {
        public final n4m a;
        public final long b;
        public final boolean c;
        public final boolean d;

        public /* synthetic */ c(n4m n4mVar, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(n4mVar, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        public static c copy$default(c cVar, n4m n4mVar, long j, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                n4mVar = cVar.a;
            }
            if ((i & 2) != 0) {
                j = cVar.b;
            }
            if ((i & 4) != 0) {
                z = cVar.c;
            }
            if ((i & 8) != 0) {
                z2 = cVar.d;
            }
            cVar.getClass();
            n4mVar.getClass();
            boolean z3 = z;
            return new c(n4mVar, j, z3, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.c(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + u0a.t(ljg.c(this.a.hashCode() * 31, 31, this.b), this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReadyToPrepareUIFor(playable=");
            sb.append(this.a);
            sb.append(", startingPositionMS=");
            sb.append(this.b);
            sb.append(", isAlreadyPlayingPlayable=");
            sb.append(this.c);
            sb.append(", isInitialPlayable=");
            return lnb.r(sb, this.d, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull n4m n4mVar, long j, boolean z, boolean z2) {
            super(null);
            n4mVar.getClass();
            this.a = n4mVar;
            this.b = j;
            this.c = z;
            this.d = z2;
        }
    }
}
