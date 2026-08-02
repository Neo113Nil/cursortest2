package mf0;

import Kk.C3532b;
import gf0.C6730b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nf0.C8591a;
import org.jetbrains.annotations.NotNull;

/* renamed from: mf0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8141c {

    /* renamed from: mf0.c$a */
    public static final class a implements InterfaceC8141c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "AddResultListener(key=null, backStackEntryId=null, action=null)";
        }
    }

    /* renamed from: mf0.c$b */
    public static final class b implements InterfaceC8141c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f74837a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 979611157;
        }

        @NotNull
        public final String toString() {
            return "Back";
        }
    }

    /* renamed from: mf0.c$c, reason: collision with other inner class name */
    public static final class C1273c implements InterfaceC8141c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1273c)) {
                return false;
            }
            ((C1273c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "BackTo(destination=null)";
        }
    }

    /* renamed from: mf0.c$d */
    public static final class d implements InterfaceC8141c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f74838a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function1<C8591a, Unit> f74839b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull String deeplink, @NotNull Function1<? super C8591a, Unit> optionsBuilder) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
            this.f74838a = deeplink;
            this.f74839b = optionsBuilder;
        }

        @NotNull
        public final String a() {
            return this.f74838a;
        }

        @NotNull
        public final Function1<C8591a, Unit> b() {
            return this.f74839b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f74838a, dVar.f74838a) && Intrinsics.d(this.f74839b, dVar.f74839b);
        }

        public final int hashCode() {
            return this.f74839b.hashCode() + (this.f74838a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Deeplink(deeplink=" + this.f74838a + ", optionsBuilder=" + this.f74839b + ")";
        }
    }

    /* renamed from: mf0.c$e */
    public static final class e implements InterfaceC8141c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @NotNull
        public final String toString() {
            return "DeeplinkIntent(deeplink=null)";
        }
    }

    /* renamed from: mf0.c$f */
    public static final class f implements InterfaceC8141c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f74840a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 979922521;
        }

        @NotNull
        public final String toString() {
            return "Lock";
        }
    }

    /* renamed from: mf0.c$g */
    public static final class g<T> implements InterfaceC8141c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "SendResult(key=null, result=null, usePreviousBackStackEntry=false)";
        }
    }

    /* renamed from: mf0.c$h */
    public static final class h implements InterfaceC8141c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "ToGraph(graph=null, optionsBuilder=null)";
        }
    }

    /* renamed from: mf0.c$i */
    public static final class i implements InterfaceC8141c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C6730b<?> f74841a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function1<C8591a, Unit> f74842b;

        public i(@NotNull C6730b destinationBundle, @NotNull Function1 optionsBuilder) {
            Intrinsics.checkNotNullParameter(destinationBundle, "destinationBundle");
            Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
            this.f74841a = destinationBundle;
            this.f74842b = optionsBuilder;
        }

        @NotNull
        public final C6730b<?> a() {
            return this.f74841a;
        }

        @NotNull
        public final Function1<C8591a, Unit> b() {
            return this.f74842b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f74841a.equals(iVar.f74841a) && Intrinsics.d(this.f74842b, iVar.f74842b);
        }

        public final int hashCode() {
            return this.f74842b.hashCode() + C3532b.a(C3532b.a(this.f74841a.hashCode() * 31, 31, false), 31, false);
        }

        @NotNull
        public final String toString() {
            return "ToScreen(destinationBundle=" + this.f74841a + ", canDuplicate=false, ignoreLock=false, optionsBuilder=" + this.f74842b + ")";
        }
    }
}
