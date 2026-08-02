package je;

import ie.InterfaceC7061j;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: je.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7394n extends AbstractC7398s {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<a> f69904b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: je.n$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Collection<N> f69905a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private List<? extends N> f69906b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Collection<? extends N> allSupertypes) {
            Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
            this.f69905a = allSupertypes;
            int i11 = le.l.f73271f;
            this.f69906b = C7714v.a0(le.l.j());
        }

        @NotNull
        public final Collection<N> a() {
            return this.f69905a;
        }

        @NotNull
        public final List<N> b() {
            return this.f69906b;
        }

        public final void c(@NotNull List<? extends N> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f69906b = list;
        }
    }

    public AbstractC7394n(@NotNull ie.o storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f69904b = storageManager.c(C7386j.f69895a, new C7384i(this), new C7388k(this));
    }

    static Iterable c(AbstractC7394n abstractC7394n, s0 it) {
        Collection<N> o11;
        Intrinsics.checkNotNullParameter(it, "it");
        abstractC7394n.getClass();
        AbstractC7394n abstractC7394n2 = it instanceof AbstractC7394n ? (AbstractC7394n) it : null;
        if (abstractC7394n2 != null) {
            o11 = C7714v.p0(abstractC7394n2.f(false), abstractC7394n2.f69904b.invoke().a());
        } else {
            o11 = it.o();
            Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        }
        return o11;
    }

    @NotNull
    protected abstract Collection<N> d();

    protected N e() {
        return null;
    }

    @NotNull
    protected Collection<N> f(boolean z11) {
        return kotlin.collections.K.f71697a;
    }

    @NotNull
    protected abstract td.g0 g();

    @Override // je.s0
    @NotNull
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List<N> o() {
        return this.f69904b.invoke().b();
    }

    @NotNull
    protected List<N> i(@NotNull List<N> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    protected void j(@NotNull N type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
