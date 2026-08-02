package ru.ozon.android.messenger.blocks.ratemessenger.sucessstate;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f86160a = new a();
    }

    /* renamed from: ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b$b, reason: collision with other inner class name */
    public static final class C1520b implements b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f86161a;

        public C1520b(@NotNull c rateMessengerSuccessModalVo) {
            Intrinsics.checkNotNullParameter(rateMessengerSuccessModalVo, "rateMessengerSuccessModalVo");
            this.f86161a = rateMessengerSuccessModalVo;
        }

        @NotNull
        public final c a() {
            return this.f86161a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1520b) && Intrinsics.d(this.f86161a, ((C1520b) obj).f86161a);
        }

        public final int hashCode() {
            return this.f86161a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Show(rateMessengerSuccessModalVo=" + this.f86161a + ")";
        }
    }
}
