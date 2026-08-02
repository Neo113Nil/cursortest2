package ru.ozon.android.messenger.blocks.input.attachments.manager;

import java.util.List;
import java.util.Set;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface a {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static String f85398a;

        public static String a() {
            return f85398a;
        }

        public static void b(String str) {
            f85398a = str;
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.input.attachments.manager.a$a, reason: collision with other inner class name */
    public static final class C1497a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> f85396a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Set<ru.ozon.android.messenger.blocks.input.pickerlauncher.e> f85397b;

        /* JADX WARN: Multi-variable type inference failed */
        public C1497a(@NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> attachments, @NotNull Set<? extends ru.ozon.android.messenger.blocks.input.pickerlauncher.e> incidents) {
            Intrinsics.checkNotNullParameter(attachments, "attachments");
            Intrinsics.checkNotNullParameter(incidents, "incidents");
            this.f85396a = attachments;
            this.f85397b = incidents;
        }

        @NotNull
        public final List<ru.ozon.android.messenger.blocks.input.attachments.presentation.b> a() {
            return this.f85396a;
        }

        @NotNull
        public final Set<ru.ozon.android.messenger.blocks.input.pickerlauncher.e> b() {
            return this.f85397b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1497a)) {
                return false;
            }
            C1497a c1497a = (C1497a) obj;
            return Intrinsics.d(this.f85396a, c1497a.f85396a) && Intrinsics.d(this.f85397b, c1497a.f85397b);
        }

        public final int hashCode() {
            return this.f85397b.hashCode() + (this.f85396a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "AttachmentsChangedEvent(attachments=" + this.f85396a + ", incidents=" + this.f85397b + ")";
        }

        public C1497a() {
            this(K.f71697a, M.f71699a);
        }
    }
}
