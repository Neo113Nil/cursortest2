package ru.ozon.android.messenger.framework.presentation.messenger;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.haptic.HapticToken;

/* loaded from: classes10.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final HapticToken f91361a;

        public a(@NotNull HapticToken token) {
            Intrinsics.checkNotNullParameter(token, "token");
            this.f91361a = token;
        }

        @NotNull
        public final HapticToken a() {
            return this.f91361a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f91361a == ((a) obj).f91361a;
        }

        public final int hashCode() {
            return this.f91361a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "PerformHaptic(token=" + this.f91361a + ")";
        }
    }
}
