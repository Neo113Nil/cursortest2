package ic;

import Cf.C2759a;
import Hf.u;
import Ub.d;
import Ub.i;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ic.AbstractC7042a;
import java.util.List;
import jc.C7335b;

/* renamed from: ic.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C7043b extends AbstractC7042a {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<AbstractC7042a.b<u, AbstractC7042a.c>> f66218a;

    /* renamed from: b, reason: collision with root package name */
    private final C7044c f66219b;

    /* renamed from: c, reason: collision with root package name */
    private final i f66220c;

    /* renamed from: d, reason: collision with root package name */
    private LayoutInflater f66221d;

    /* renamed from: e, reason: collision with root package name */
    private d f66222e;

    /* renamed from: f, reason: collision with root package name */
    private List<u> f66223f;

    /* renamed from: ic.b$a */
    static class a implements AbstractC7042a.InterfaceC1089a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<AbstractC7042a.b<u, AbstractC7042a.c>> f66224a = new SparseArray<>(3);

        /* renamed from: b, reason: collision with root package name */
        private final C7044c f66225b;

        /* renamed from: c, reason: collision with root package name */
        private i f66226c;

        a(@NonNull C7044c c7044c) {
            this.f66225b = c7044c;
        }

        @Override // ic.AbstractC7042a.InterfaceC1089a
        @NonNull
        public final AbstractC7042a.InterfaceC1089a a(@NonNull C7335b c7335b) {
            this.f66224a.append(C2759a.class.hashCode(), c7335b);
            return this;
        }

        @Override // ic.AbstractC7042a.InterfaceC1089a
        @NonNull
        public final AbstractC7042a build() {
            if (this.f66226c == null) {
                this.f66226c = i.a();
            }
            return new C7043b(this.f66224a, this.f66225b, this.f66226c);
        }
    }

    C7043b(@NonNull SparseArray sparseArray, @NonNull C7044c c7044c, @NonNull i iVar) {
        this.f66218a = sparseArray;
        this.f66219b = c7044c;
        this.f66220c = iVar;
        setHasStableIds(true);
    }

    @NonNull
    private AbstractC7042a.b<u, AbstractC7042a.c> h(int i11) {
        return i11 == 0 ? this.f66219b : this.f66218a.get(i11);
    }

    @Override // ic.AbstractC7042a
    public final void g(@NonNull d dVar, @NonNull String str) {
        List<u> b11 = this.f66220c.b(dVar.c(str));
        this.f66219b.b();
        SparseArray<AbstractC7042a.b<u, AbstractC7042a.c>> sparseArray = this.f66218a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.valueAt(i11).b();
        }
        this.f66222e = dVar;
        this.f66223f = b11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        List<u> list = this.f66223f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i11) {
        int hashCode = this.f66223f.get(i11).getClass().hashCode();
        if (this.f66218a.indexOfKey(hashCode) <= -1) {
            hashCode = 0;
        }
        h(hashCode).getClass();
        return r4.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        int hashCode = this.f66223f.get(i11).getClass().hashCode();
        if (this.f66218a.indexOfKey(hashCode) > -1) {
            return hashCode;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NonNull AbstractC7042a.c cVar, int i11) {
        AbstractC7042a.c cVar2 = cVar;
        u uVar = this.f66223f.get(i11);
        int hashCode = uVar.getClass().hashCode();
        if (this.f66218a.indexOfKey(hashCode) <= -1) {
            hashCode = 0;
        }
        h(hashCode).a(this.f66222e, cVar2, uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NonNull
    public final AbstractC7042a.c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        if (this.f66221d == null) {
            this.f66221d = LayoutInflater.from(viewGroup.getContext());
        }
        return h(i11).c(this.f66221d, viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(@NonNull AbstractC7042a.c cVar) {
        AbstractC7042a.c cVar2 = cVar;
        super.onViewRecycled(cVar2);
        h(cVar2.getItemViewType()).getClass();
    }
}
