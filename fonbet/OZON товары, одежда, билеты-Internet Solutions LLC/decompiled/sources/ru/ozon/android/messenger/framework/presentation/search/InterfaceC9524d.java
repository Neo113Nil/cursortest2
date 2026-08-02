package ru.ozon.android.messenger.framework.presentation.search;

import C.o0;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.search.J;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC9524d {

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.d$a */
    public static final class a implements InterfaceC9524d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f91713a = new a();
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.d$b */
    public static final class b implements InterfaceC9524d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f91714a;

        public b() {
            this(null);
        }

        @NotNull
        public final List<J> a() {
            return this.f91714a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f91714a, ((b) obj).f91714a);
        }

        public final int hashCode() {
            return this.f91714a.hashCode();
        }

        @NotNull
        public final String toString() {
            return Om.a(")", new StringBuilder("ShowLoadingItems(newItems="), this.f91714a);
        }

        public b(Object obj) {
            ArrayList newItems = new ArrayList(10);
            for (int i11 = 0; i11 < 10; i11++) {
                newItems.add(J.b.f91595a);
            }
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.f91714a = newItems;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.d$c */
    public static final class c implements InterfaceC9524d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<ru.ozon.android.messenger.framework.presentation.models.q> f91715a;

        public c(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> newItems) {
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.f91715a = newItems;
        }

        @NotNull
        public final List<ru.ozon.android.messenger.framework.presentation.models.q> a() {
            return this.f91715a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.d$d, reason: collision with other inner class name */
    public static final class C1716d implements InterfaceC9524d {

        /* renamed from: a, reason: collision with root package name */
        private final String f91716a;

        public C1716d(String str) {
            this.f91716a = str;
        }

        public final String a() {
            return this.f91716a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1716d) && Intrinsics.d(this.f91716a, ((C1716d) obj).f91716a);
        }

        public final int hashCode() {
            String str = this.f91716a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("UpdatePaginationCursor(cursor="), this.f91716a, ")");
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.d$e */
    public static final class e implements InterfaceC9524d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f91717a;

        public e(@NotNull ArrayList newItems) {
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.f91717a = newItems;
        }

        @NotNull
        public final List<J> a() {
            return this.f91717a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f91717a.equals(((e) obj).f91717a);
        }

        public final int hashCode() {
            return this.f91717a.hashCode();
        }

        @NotNull
        public final String toString() {
            return Om.a(")", new StringBuilder("UpdateSearchItems(newItems="), this.f91717a);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.search.d$f */
    public static final class f implements InterfaceC9524d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91718a;

        public f(@NotNull String newQuery) {
            Intrinsics.checkNotNullParameter(newQuery, "newQuery");
            this.f91718a = newQuery;
        }

        @NotNull
        public final String a() {
            return this.f91718a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.d(this.f91718a, ((f) obj).f91718a);
        }

        public final int hashCode() {
            return this.f91718a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("UpdateSearchQuery(newQuery="), this.f91718a, ")");
        }
    }
}
