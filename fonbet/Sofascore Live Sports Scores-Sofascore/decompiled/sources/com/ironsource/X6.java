package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface X6 {
    default void a(@NotNull Y6 y6) {
        y6.getClass();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements X6 {

        @NotNull
        private final U6 a;

        public a(@NotNull U6 u6) {
            u6.getClass();
            this.a = u6;
        }

        public static /* synthetic */ a a(a aVar, U6 u6, int i, Object obj) {
            if ((i & 1) != 0) {
                u6 = aVar.a;
            }
            return aVar.a(u6);
        }

        @NotNull
        public final U6 b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull U6 u6) {
            u6.getClass();
            return new a(u6);
        }

        @NotNull
        public final U6 a() {
            return this.a;
        }

        @Override // com.ironsource.X6
        public void a(@NotNull Y6 y6) {
            y6.getClass();
            y6.a(this.a);
        }
    }
}
