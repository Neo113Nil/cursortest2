package n20;

import ed.InterfaceC6346b;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k20.C7475g;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import o20.C8633a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n20.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC8427g {

    @InterfaceC6346b
    /* renamed from: n20.g$a */
    public static final class a implements InterfaceC8427g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList<b> f76364a;

        private /* synthetic */ a(ArrayList arrayList) {
            this.f76364a = arrayList;
        }

        public static final /* synthetic */ a d(ArrayList arrayList) {
            return new a(arrayList);
        }

        @Override // n20.InterfaceC8427g
        public final Collection<C8633a> a(long j11, @NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(storage, "storage");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = this.f76364a.iterator();
            while (it.hasNext()) {
                C8633a e11 = b.e(((b) it.next()).g(), j11, storage);
                if (e11 != null) {
                    linkedHashSet.add(e11);
                }
            }
            if (linkedHashSet.isEmpty()) {
                return null;
            }
            return linkedHashSet;
        }

        @Override // n20.InterfaceC8427g
        public final LinkedHashSet b(long j11, @NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(storage, "storage");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<b> it = this.f76364a.iterator();
            while (it.hasNext()) {
                Iterable f7 = b.f(it.next().g(), j11, storage);
                if (f7 == null) {
                    f7 = K.f71697a;
                }
                C7714v.p(f7, linkedHashSet);
            }
            if (linkedHashSet.isEmpty()) {
                return null;
            }
            return linkedHashSet;
        }

        @Override // n20.InterfaceC8427g
        public final void c(@NotNull i widget, @NotNull C8425e<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            Intrinsics.checkNotNullParameter(widget, "widget");
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            this.f76364a.add(b.d(widget));
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.d(this.f76364a, ((a) obj).f76364a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f76364a.hashCode();
        }

        public final String toString() {
            return "Composite(widgets=" + this.f76364a + ")";
        }
    }

    @InterfaceC6346b
    /* renamed from: n20.g$b */
    public static final class b implements InterfaceC8427g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final i f76365a;

        private /* synthetic */ b(i iVar) {
            this.f76365a = iVar;
        }

        public static final /* synthetic */ b d(i iVar) {
            return new b(iVar);
        }

        public static final C8633a e(i iVar, long j11, @NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            if (!C7705l.l(iVar.getVersions(), j11)) {
                return null;
            }
            InterfaceC7243a<? extends Object> config = iVar.config(storage);
            return new C8633a((iVar.getHash$composer_widget() * 31) + (config.getClass().isAnonymousClass() ? config.hashCode() : config.getClass().hashCode()), config);
        }

        public static LinkedHashSet f(i iVar, long j11, @NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            if (!C7705l.l(iVar.getVersions(), j11)) {
                return null;
            }
            InterfaceC8046a<?, ? extends l20.c>[] viewMappers = iVar.viewMappers(storage);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (InterfaceC8046a<?, ? extends l20.c> interfaceC8046a : viewMappers) {
                linkedHashSet.add(new C8426f((iVar.getHash$composer_widget() * 31) + (interfaceC8046a.getClass().isAnonymousClass() ? interfaceC8046a.hashCode() : interfaceC8046a.getClass().hashCode()), interfaceC8046a));
            }
            return linkedHashSet;
        }

        @Override // n20.InterfaceC8427g
        public final Collection<C8633a> a(long j11, @NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(storage, "storage");
            C8633a e11 = e(this.f76365a, j11, storage);
            if (e11 == null) {
                return null;
            }
            return C7714v.a0(e11);
        }

        @Override // n20.InterfaceC8427g
        public final LinkedHashSet b(long j11, @NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return f(this.f76365a, j11, storage);
        }

        @Override // n20.InterfaceC8427g
        public final void c(@NotNull i widget, @NotNull C8425e<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            Intrinsics.checkNotNullParameter(widget, "widget");
            Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
            i iVar = this.f76365a;
            String widgetKey = iVar.getWidgetKey();
            ArrayList widgets = new ArrayList(2);
            widgets.add(new b(iVar));
            widgets.add(new b(widget));
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(widgets, "widgets");
            widgetStore.m440insertWidgetyiMf5Ak$composer_widget(widgetKey, a.d(widgets));
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return Intrinsics.d(this.f76365a, ((b) obj).f76365a);
            }
            return false;
        }

        public final /* synthetic */ i g() {
            return this.f76365a;
        }

        public final int hashCode() {
            return this.f76365a.hashCode();
        }

        public final String toString() {
            return "Raw(value=" + this.f76365a + ")";
        }
    }

    Collection<C8633a> a(long j11, @NotNull C7475g c7475g);

    LinkedHashSet b(long j11, @NotNull C7475g c7475g);

    void c(@NotNull i iVar, @NotNull C8425e<? extends InterfaceC8046a<?, ? extends l20.c>> c8425e);
}
