package ru.ozon.android.messenger.framework.domain.model;

import Sc.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.B0;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f88802a;

        public a() {
            this(false);
        }

        @Override // ru.ozon.android.messenger.framework.domain.model.c
        public final int a(@NotNull List<? extends q> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            if (this.f88802a) {
                C7714v.x0(list);
            }
            return list.size();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f88802a == ((a) obj).f88802a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88802a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("Bottom(replaceNearest="), this.f88802a);
        }

        public a(boolean z11) {
            this.f88802a = z11;
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f88803a;

        public b(int i11) {
            this.f88803a = i11;
        }

        @Override // ru.ozon.android.messenger.framework.domain.model.c
        public final int a(@NotNull List<? extends q> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return this.f88803a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f88803a == ((b) obj).f88803a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f88803a);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f88803a, ")", new StringBuilder("Index(index="));
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.domain.model.c$c, reason: collision with other inner class name */
    public static final class C1634c implements c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f88804a;

        public C1634c() {
            this(false);
        }

        @Override // ru.ozon.android.messenger.framework.domain.model.c
        public final int a(@NotNull List<? extends q> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            if (!this.f88804a) {
                return 0;
            }
            C7714v.v0(list);
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1634c) && this.f88804a == ((C1634c) obj).f88804a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88804a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("Top(replaceNearest="), this.f88804a);
        }

        public C1634c(boolean z11) {
            this.f88804a = z11;
        }
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final p f88805a;

        public d(@NotNull p itemInfo) {
            Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
            this.f88805a = itemInfo;
        }

        @Override // ru.ozon.android.messenger.framework.domain.model.c
        public final int a(@NotNull List<? extends q> currentUiList) {
            c c1634c;
            Intrinsics.checkNotNullParameter(currentUiList, "list");
            p pVar = this.f88805a;
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            Intrinsics.checkNotNullParameter(currentUiList, "currentUiList");
            int i11 = B0.f89967a[pVar.b().ordinal()];
            if (i11 == 1) {
                c1634c = new C1634c(false);
            } else if (i11 == 2) {
                c1634c = new a(false);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                List<? extends q> list = currentUiList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((q) it.next()).c().b() == p.b.LAST) {
                            c1634c = new b(C7714v.P(currentUiList));
                            break;
                        }
                    }
                }
                c1634c = new a(false);
            }
            return c1634c.a(currentUiList);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.d(this.f88805a, ((d) obj).f88805a);
        }

        public final int hashCode() {
            return this.f88805a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Undefined(itemInfo=" + this.f88805a + ")";
        }
    }

    int a(@NotNull List<? extends q> list);
}
