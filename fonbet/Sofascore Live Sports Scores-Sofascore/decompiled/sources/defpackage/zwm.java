package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class zwm {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends zwm {
        public final ywl a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ywl ywlVar) {
            super(null);
            ywlVar.getClass();
            this.a = ywlVar;
        }

        public static a copy$default(a aVar, ywl ywlVar, int i, Object obj) {
            if ((i & 1) != 0) {
                ywlVar = aVar.a;
            }
            aVar.getClass();
            ywlVar.getClass();
            return new a(ywlVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PlayerStateChanged(state=" + this.a + ')';
        }
    }

    public zwm(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
