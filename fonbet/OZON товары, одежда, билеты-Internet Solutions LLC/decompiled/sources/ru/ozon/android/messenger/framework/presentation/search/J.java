package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface J {

    public static final class a implements J {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.framework.presentation.models.q f91594a;

        public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.q itemVO) {
            Intrinsics.checkNotNullParameter(itemVO, "itemVO");
            this.f91594a = itemVO;
        }

        @NotNull
        public final ru.ozon.android.messenger.framework.presentation.models.q a() {
            return this.f91594a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f91594a, ((a) obj).f91594a);
        }

        public final int hashCode() {
            return this.f91594a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Item(itemVO=" + this.f91594a + ")";
        }
    }

    public static final class b implements J {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f91595a = new b();
    }
}
