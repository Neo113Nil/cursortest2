package ru.ozon.app.android.pikazon.retry;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "", "DoNothing", "Retry", "Lru/ozon/app/android/pikazon/retry/OnConnectionRestored$DoNothing;", "Lru/ozon/app/android/pikazon/retry/OnConnectionRestored$Retry;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OnConnectionRestored {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/retry/OnConnectionRestored$DoNothing;", "Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DoNothing implements OnConnectionRestored {

        @NotNull
        public static final DoNothing INSTANCE = new DoNothing();

        private DoNothing() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DoNothing);
        }

        public int hashCode() {
            return -1419721418;
        }

        @NotNull
        public String toString() {
            return "DoNothing";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pikazon/retry/OnConnectionRestored$Retry;", "Lru/ozon/app/android/pikazon/retry/OnConnectionRestored;", "count", "", "<init>", "(I)V", "getCount", "()I", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Retry implements OnConnectionRestored {
        private final int count;

        public Retry(int i11) {
            this.count = i11;
        }

        public final int getCount() {
            return this.count;
        }
    }
}
