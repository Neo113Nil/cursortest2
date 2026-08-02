package com.ironsource;

import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface V0 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements V0 {

        @NotNull
        public static final b a = new b();

        private b() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements V0 {

        @NotNull
        private final String a;

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }

        @NotNull
        public final String b() {
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
            return lnb.o("Invalid(reason=", this.a, ")");
        }

        @NotNull
        public final a a(@NotNull String str) {
            str.getClass();
            return new a(str);
        }

        @NotNull
        public final String a() {
            return this.a;
        }
    }
}
