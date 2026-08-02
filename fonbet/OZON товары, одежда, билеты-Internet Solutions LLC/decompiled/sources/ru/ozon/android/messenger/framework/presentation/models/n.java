package ru.ozon.android.messenger.framework.presentation.models;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class n {

    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        private final int f91449a;

        public a(int i11) {
            super(0);
            this.f91449a = i11;
        }

        public final int a() {
            return this.f91449a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f91449a == ((a) obj).f91449a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f91449a);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f91449a, ")", new StringBuilder("ImageResource(imageRes="));
        }
    }

    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91450a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String url) {
            super(0);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f91450a = url;
        }

        @NotNull
        public final String a() {
            return this.f91450a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f91450a, ((b) obj).f91450a);
        }

        public final int hashCode() {
            return this.f91450a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Url(url="), this.f91450a, ")");
        }
    }

    public n(int i11) {
    }
}
