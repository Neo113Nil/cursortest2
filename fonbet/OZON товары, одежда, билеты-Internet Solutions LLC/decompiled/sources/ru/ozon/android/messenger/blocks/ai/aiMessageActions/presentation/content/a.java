package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a$a, reason: collision with other inner class name */
    public static final class C1454a implements a {

        /* renamed from: a, reason: collision with root package name */
        private final int f83984a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final IconButtonV3DTO f83985b;

        /* renamed from: c, reason: collision with root package name */
        private final long f83986c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f83987d;

        static {
            int i11 = IconButtonV3DTO.$stable;
        }

        public C1454a(int i11, @NotNull IconButtonV3DTO button, long j11, boolean z11) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.f83984a = i11;
            this.f83985b = button;
            this.f83986c = j11;
            this.f83987d = z11;
        }

        public final long a() {
            return this.f83986c;
        }

        public final boolean b() {
            return this.f83987d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1454a)) {
                return false;
            }
            C1454a c1454a = (C1454a) obj;
            return this.f83984a == c1454a.f83984a && Intrinsics.d(this.f83985b, c1454a.f83985b) && this.f83986c == c1454a.f83986c && this.f83987d == c1454a.f83987d;
        }

        @Override // ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a
        @NotNull
        public final IconButtonV3DTO getButton() {
            return this.f83985b;
        }

        @Override // ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a
        public final int getId() {
            return this.f83984a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83987d) + Pk0.c.a(GR.b.c(this.f83985b, Integer.hashCode(this.f83984a) * 31, 31), 31, this.f83986c);
        }

        @NotNull
        public final String toString() {
            return "AutoReset(id=" + this.f83984a + ", button=" + this.f83985b + ", ttl=" + this.f83986c + ", isSelected=" + this.f83987d + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final int f83988a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final IconButtonV3DTO f83989b;

        static {
            int i11 = IconButtonV3DTO.$stable;
        }

        public b(@NotNull IconButtonV3DTO button, int i11) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.f83988a = i11;
            this.f83989b = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f83988a == bVar.f83988a && Intrinsics.d(this.f83989b, bVar.f83989b);
        }

        @Override // ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a
        @NotNull
        public final IconButtonV3DTO getButton() {
            return this.f83989b;
        }

        @Override // ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a
        public final int getId() {
            return this.f83988a;
        }

        public final int hashCode() {
            return this.f83989b.hashCode() + (Integer.hashCode(this.f83988a) * 31);
        }

        @NotNull
        public final String toString() {
            return "Click(id=" + this.f83988a + ", button=" + this.f83989b + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final int f83990a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final IconButtonV3DTO f83991b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f83992c;

        static {
            int i11 = IconButtonV3DTO.$stable;
        }

        public c(int i11, @NotNull IconButtonV3DTO button, boolean z11) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.f83990a = i11;
            this.f83991b = button;
            this.f83992c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f83990a == cVar.f83990a && Intrinsics.d(this.f83991b, cVar.f83991b) && this.f83992c == cVar.f83992c;
        }

        @Override // ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a
        @NotNull
        public final IconButtonV3DTO getButton() {
            return this.f83991b;
        }

        @Override // ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a
        public final int getId() {
            return this.f83990a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83992c) + GR.b.c(this.f83991b, Integer.hashCode(this.f83990a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Toggle(id=");
            sb2.append(this.f83990a);
            sb2.append(", button=");
            sb2.append(this.f83991b);
            sb2.append(", isSelected=");
            return Pk0.a.a(")", sb2, this.f83992c);
        }
    }

    @NotNull
    IconButtonV3DTO getButton();

    int getId();
}
