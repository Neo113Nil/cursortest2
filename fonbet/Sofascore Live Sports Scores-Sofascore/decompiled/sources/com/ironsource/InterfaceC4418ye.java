package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4418ye {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ye$a */
    public static final class a implements InterfaceC4418ye {

        @NotNull
        private final C4221ne a;

        @Nullable
        private final C4037d9 b;

        public a(@NotNull C4221ne c4221ne, @Nullable C4037d9 c4037d9) {
            c4221ne.getClass();
            this.a = c4221ne;
            this.b = c4037d9;
        }

        public static /* synthetic */ a a(a aVar, C4221ne c4221ne, C4037d9 c4037d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4221ne = aVar.a;
            }
            if ((i & 2) != 0) {
                c4037d9 = aVar.b;
            }
            return aVar.a(c4221ne, c4037d9);
        }

        @Nullable
        public final C4037d9 b() {
            return this.b;
        }

        @NotNull
        public final C4221ne c() {
            return this.a;
        }

        @Nullable
        public final C4037d9 d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C4037d9 c4037d9 = this.b;
            return hashCode + (c4037d9 == null ? 0 : c4037d9.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        public /* synthetic */ a(C4221ne c4221ne, C4037d9 c4037d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c4221ne, (i & 2) != 0 ? null : c4037d9);
        }

        @NotNull
        public final a a(@NotNull C4221ne c4221ne, @Nullable C4037d9 c4037d9) {
            c4221ne.getClass();
            return new a(c4221ne, c4037d9);
        }

        @NotNull
        public final C4221ne a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ye$b */
    public static final class b implements InterfaceC4418ye {

        @NotNull
        private final C4346ue a;

        @Nullable
        private final C4037d9 b;

        public b(@NotNull C4346ue c4346ue, @Nullable C4037d9 c4037d9) {
            c4346ue.getClass();
            this.a = c4346ue;
            this.b = c4037d9;
        }

        public static /* synthetic */ b a(b bVar, C4346ue c4346ue, C4037d9 c4037d9, int i, Object obj) {
            if ((i & 1) != 0) {
                c4346ue = bVar.a;
            }
            if ((i & 2) != 0) {
                c4037d9 = bVar.b;
            }
            return bVar.a(c4346ue, c4037d9);
        }

        @Nullable
        public final C4037d9 b() {
            return this.b;
        }

        @Nullable
        public final C4037d9 c() {
            return this.b;
        }

        @NotNull
        public final C4346ue d() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            C4037d9 c4037d9 = this.b;
            return hashCode + (c4037d9 == null ? 0 : c4037d9.hashCode());
        }

        @NotNull
        public String toString() {
            return "Success(sdkInitResponse=" + this.a + ", performanceMeasurer=" + this.b + ")";
        }

        @NotNull
        public final b a(@NotNull C4346ue c4346ue, @Nullable C4037d9 c4037d9) {
            c4346ue.getClass();
            return new b(c4346ue, c4037d9);
        }

        @NotNull
        public final C4346ue a() {
            return this.a;
        }
    }
}
