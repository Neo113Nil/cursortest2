package w8;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface i {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i11) {
            this.code = i11;
        }

        public final int a() {
            return this.code;
        }
    }

    @NonNull
    a b();
}
