package ru.ozon.android.messenger.blocks.input.pickerlauncher;

import B90.C2618u;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Uri> f85559a;

    public static final class a extends f {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Uri> f85560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends Uri> data) {
            super(data);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f85560b = data;
        }

        @NotNull
        public final List<Uri> a() {
            return this.f85560b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f85560b, ((a) obj).f85560b);
        }

        public final int hashCode() {
            return this.f85560b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("Files(data="), this.f85560b, ")");
        }
    }

    public static final class b extends f {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Uri> f85561b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends Uri> data) {
            super(data);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f85561b = data;
        }

        @NotNull
        public final List<Uri> a() {
            return this.f85561b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f85561b, ((b) obj).f85561b);
        }

        public final int hashCode() {
            return this.f85561b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C2618u.h(new StringBuilder("Photos(data="), this.f85561b, ")");
        }
    }

    private f() {
        throw null;
    }

    public f(List list) {
        this.f85559a = list;
    }
}
