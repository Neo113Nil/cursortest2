package l70;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f72949a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String label) {
            super(0);
            Intrinsics.checkNotNullParameter(label, "label");
            this.f72949a = label;
        }

        @NotNull
        public final String a() {
            return this.f72949a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f72949a, ((a) obj).f72949a);
        }

        public final int hashCode() {
            return this.f72949a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("SelectBank(label="), this.f72949a, ")");
        }
    }

    /* renamed from: l70.b$b, reason: collision with other inner class name */
    public static final class C1219b extends b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f72950a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f72951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1219b(boolean z11, @NotNull String label) {
            super(0);
            Intrinsics.checkNotNullParameter(label, "label");
            this.f72950a = z11;
            this.f72951b = label;
        }

        public final boolean a() {
            return this.f72950a;
        }

        @NotNull
        public final String b() {
            return this.f72951b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1219b)) {
                return false;
            }
            C1219b c1219b = (C1219b) obj;
            return this.f72950a == c1219b.f72950a && Intrinsics.d(this.f72951b, c1219b.f72951b);
        }

        public final int hashCode() {
            return this.f72951b.hashCode() + (Boolean.hashCode(this.f72950a) * 31);
        }

        @NotNull
        public final String toString() {
            return "SelectContact(allowScan=" + this.f72950a + ", label=" + this.f72951b + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f72952a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f72953b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f72954c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String label, Integer num, @NotNull String text) {
            super(0);
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f72952a = label;
            this.f72953b = num;
            this.f72954c = text;
        }

        public final Integer a() {
            return this.f72953b;
        }

        @NotNull
        public final String b() {
            return this.f72952a;
        }

        @NotNull
        public final String c() {
            return this.f72954c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f72952a, cVar.f72952a) && Intrinsics.d(this.f72953b, cVar.f72953b) && Intrinsics.d(this.f72954c, cVar.f72954c);
        }

        public final int hashCode() {
            int hashCode = this.f72952a.hashCode() * 31;
            Integer num = this.f72953b;
            return this.f72954c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectedContact(label=");
            sb2.append(this.f72952a);
            sb2.append(", flag=");
            sb2.append(this.f72953b);
            sb2.append(", text=");
            return o0.c(sb2, this.f72954c, ")");
        }
    }

    public b(int i11) {
    }
}
