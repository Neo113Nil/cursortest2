package ru.ozon.android.messenger.framework.core.viewmapper;

import KD.i;
import X4.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.messenger.R$id;

/* loaded from: classes10.dex */
public abstract class b<State, VO extends g, Binding extends X4.a> extends d<State, VO> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private HashMap<ViewGroup, a<VO, Binding>> f87362a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<VO, Binding> {

        /* renamed from: a, reason: collision with root package name */
        private final g f87363a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C1565b f87364b;

        /* renamed from: c, reason: collision with root package name */
        private final X4.a f87365c;

        public a(g gVar, @NotNull C1565b lifecycleOwner, X4.a aVar) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            this.f87363a = gVar;
            this.f87364b = lifecycleOwner;
            this.f87365c = aVar;
        }

        public static a a(a aVar, g gVar) {
            C1565b lifecycleOwner = aVar.f87364b;
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            return new a(gVar, lifecycleOwner, aVar.f87365c);
        }

        public final Binding b() {
            return (Binding) this.f87365c;
        }

        public final VO c() {
            return (VO) this.f87363a;
        }

        @NotNull
        public final C1565b d() {
            return this.f87364b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f87363a.equals(aVar.f87363a) && this.f87364b.equals(aVar.f87364b) && Intrinsics.d(this.f87365c, aVar.f87365c);
        }

        public final int hashCode() {
            int hashCode = (this.f87364b.hashCode() + (this.f87363a.hashCode() * 31)) * 31;
            X4.a aVar = this.f87365c;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "NoUiItem(block=" + this.f87363a + ", lifecycleOwner=" + this.f87364b + ", binding=" + this.f87365c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ru.ozon.android.messenger.framework.core.viewmapper.b$b, reason: collision with other inner class name */
    public static final class C1565b implements J {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final L f87366a = new L(this);

        public final void a(@NotNull AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f87366a.h(event);
        }

        @Override // androidx.lifecycle.J
        @NotNull
        public final AbstractC5434v getLifecycle() {
            return this.f87366a;
        }
    }

    @NotNull
    protected static ViewGroup d(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View findViewById = viewGroup.findViewById(R$id.actionButtonContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (ViewGroup) findViewById;
    }

    @NotNull
    protected static ViewGroup e(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View findViewById = viewGroup.findViewById(R$id.bottomContainerLl);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (ViewGroup) findViewById;
    }

    @NotNull
    protected static ViewGroup f(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View findViewById = viewGroup.findViewById(R$id.headerContainerLl);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (ViewGroup) findViewById;
    }

    @NotNull
    protected static ViewGroup h(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View findViewById = viewGroup.findViewById(R$id.middleContainerLl);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (ViewGroup) findViewById;
    }

    @NotNull
    protected static ViewGroup i(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View findViewById = viewGroup.findViewById(R$id.pinContainerLl);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (ViewGroup) findViewById;
    }

    protected abstract void b(@NotNull ViewGroup viewGroup, @NotNull Binding binding, @NotNull ru.ozon.android.messenger.framework.core.d dVar, @NotNull VO vo);

    protected abstract void c(@NotNull ViewGroup viewGroup, @NotNull X4.a aVar, @NotNull ru.ozon.android.messenger.framework.core.d dVar, @NotNull g gVar);

    protected final C1565b g(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        a<VO, Binding> aVar = this.f87362a.get(rootView);
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final e getViewMapperType() {
        return e.b.f87375a;
    }

    @NotNull
    protected abstract Binding j(@NotNull ViewGroup viewGroup);

    public final void k(@NotNull ViewGroup rootView) {
        C1565b d11;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        a<VO, Binding> aVar = this.f87362a.get(rootView);
        if (aVar == null || (d11 = aVar.d()) == null) {
            return;
        }
        d11.a(AbstractC5434v.a.ON_DESTROY);
    }

    protected abstract void l(@NotNull ViewGroup viewGroup, @NotNull Binding binding, @NotNull ru.ozon.android.messenger.framework.core.d dVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(@NotNull ViewGroup rootView, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull ru.ozon.android.messenger.framework.presentation.models.e blockItem) {
        ViewGroup viewGroup;
        ru.ozon.android.messenger.framework.core.d dVar;
        Binding b11;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(blockItem, "blockItem");
        g newItem = blockItem.b();
        if (newItem == null) {
            newItem = null;
        }
        if (newItem == null) {
            return;
        }
        HashMap<ViewGroup, a<VO, Binding>> hashMap = this.f87362a;
        a<VO, Binding> aVar = hashMap.get(rootView);
        if (aVar == null) {
            C1565b c1565b = new C1565b();
            X4.a j11 = j(rootView);
            hashMap.put(rootView, new a<>(newItem, c1565b, j11));
            AbstractC5434v lifecycle = references.f().getLifecycle();
            i iVar = new i(c1565b, 1);
            lifecycle.a(iVar);
            AbstractC5434v lifecycle2 = c1565b.getLifecycle();
            if (lifecycle2.b() == AbstractC5434v.b.DESTROYED) {
                lifecycle.e(iVar);
                hashMap.remove(rootView);
                l(rootView, j11, references);
                viewGroup = rootView;
                dVar = references;
            } else {
                viewGroup = rootView;
                dVar = references;
                lifecycle2.a(new c((L) lifecycle2, lifecycle, iVar, this, viewGroup, j11, dVar));
            }
            b(viewGroup, j11, dVar, newItem);
        } else {
            viewGroup = rootView;
            dVar = references;
            hashMap.put(viewGroup, a.a(aVar, newItem));
        }
        a<VO, Binding> aVar2 = hashMap.get(viewGroup);
        if (aVar2 == null || (b11 = aVar2.b()) == null) {
            throw new IllegalStateException("Binding isn't exist");
        }
        if (aVar != null) {
            VO oldItem = aVar.c();
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
        }
        c(viewGroup, b11, dVar, newItem);
    }
}
