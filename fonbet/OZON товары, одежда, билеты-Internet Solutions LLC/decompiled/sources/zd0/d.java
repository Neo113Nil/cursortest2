package zd0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class d {

    public static final class a extends d {
        public a() {
            super(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Enabled(externalLogger=null)";
        }
    }

    public d(int i11) {
    }
}
