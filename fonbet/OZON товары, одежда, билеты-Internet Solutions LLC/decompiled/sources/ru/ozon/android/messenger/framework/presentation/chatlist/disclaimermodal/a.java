package ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.disclaimer.modal.e;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a$a, reason: collision with other inner class name */
    public static final class C1678a implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1678a f90468a = new C1678a();
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f90469a = new b();
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final e f90470a;

        public c(@NotNull e disclaimerModalResponseVO) {
            Intrinsics.checkNotNullParameter(disclaimerModalResponseVO, "disclaimerModalResponseVO");
            this.f90470a = disclaimerModalResponseVO;
        }

        @NotNull
        public final e a() {
            return this.f90470a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f90470a, ((c) obj).f90470a);
        }

        public final int hashCode() {
            return this.f90470a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Show(disclaimerModalResponseVO=" + this.f90470a + ")";
        }
    }
}
