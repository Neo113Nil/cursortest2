package ru.ozon.android.messenger.framework.core.initialization.newinit;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f87354a;

        /* renamed from: b, reason: collision with root package name */
        private final String f87355b;

        public a(@NotNull String namespace, String str) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            this.f87354a = namespace;
            this.f87355b = str;
        }

        public final String a() {
            return this.f87355b;
        }

        @NotNull
        public final String b() {
            return this.f87354a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f87354a, aVar.f87354a) && Intrinsics.d(this.f87355b, aVar.f87355b);
        }

        public final int hashCode() {
            int hashCode = this.f87354a.hashCode() * 31;
            String str = this.f87355b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NetworkConfig(namespace=");
            sb2.append(this.f87354a);
            sb2.append(", baseFileUrl=");
            return o0.c(sb2, this.f87355b, ")");
        }
    }

    @NotNull
    ru.ozon.android.messenger.framework.core.initialization.di.b a();

    @NotNull
    ru.ozon.android.messenger.framework.core.initialization.di.c getComponent();

    @NotNull
    a getNetworkConfig();
}
