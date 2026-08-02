package com.vk.photo.editor.features.filter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.features.filter.a;
import com.vk.photo.editor.views.shimmer.Shimmer;
import com.vk.photo.editor.views.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.fyt0;
import xsna.izs;
import xsna.oer;
import xsna.rl2;
import xsna.rtm0;
import xsna.rtm0.a;
import xsna.s3q0;
import xsna.v8p0;
import xsna.w8p0;
import xsna.x90;
import xsna.xcr;

/* compiled from: FiltersAdapter.kt */
/* loaded from: classes4.dex */
public final class d extends x<com.vk.photo.editor.features.filter.a, RecyclerView.e0> {
    public final boolean c;
    public izs<? super FilterUiModel, s3q0> d;
    public izs<? super FilterUiModel, s3q0> e;
    public xcr f;

    /* compiled from: FiltersAdapter.kt */
    public static final class a extends m.e<com.vk.photo.editor.features.filter.a> {
        public static final a a = new a();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(com.vk.photo.editor.features.filter.a aVar, com.vk.photo.editor.features.filter.a aVar2) {
            return aVar.equals(aVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(com.vk.photo.editor.features.filter.a aVar, com.vk.photo.editor.features.filter.a aVar2) {
            com.vk.photo.editor.features.filter.a aVar3 = aVar;
            com.vk.photo.editor.features.filter.a aVar4 = aVar2;
            if (aVar3.getClass() != aVar4.getClass()) {
                return false;
            }
            if (aVar3 instanceof a.C1457a) {
                return epx.f(((a.C1457a) aVar3).a.a, ((a.C1457a) aVar4).a.a);
            }
            if (aVar3.equals(a.b.a)) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: FiltersAdapter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<oer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(oer oerVar) {
            d dVar = (d) this.receiver;
            dVar.getClass();
            int adapterPosition = oerVar.getAdapterPosition();
            if (adapterPosition != -1) {
                com.vk.photo.editor.features.filter.a item = dVar.getItem(adapterPosition);
                a.C1457a c1457a = item instanceof a.C1457a ? (a.C1457a) item : null;
                if (c1457a != null) {
                    dVar.d.invoke(c1457a.a);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: FiltersAdapter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<v8p0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(v8p0 v8p0Var) {
            d dVar = (d) this.receiver;
            dVar.getClass();
            int adapterPosition = v8p0Var.getAdapterPosition();
            if (adapterPosition != -1) {
                com.vk.photo.editor.features.filter.a item = dVar.getItem(adapterPosition);
                a.C1457a c1457a = item instanceof a.C1457a ? (a.C1457a) item : null;
                FilterUiModel filterUiModel = c1457a != null ? c1457a.a : null;
                if (filterUiModel != null) {
                    dVar.e.invoke(filterUiModel);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: FiltersAdapter.kt */
    /* renamed from: com.vk.photo.editor.features.filter.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C1460d extends FunctionReferenceImpl implements izs<rtm0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(rtm0 rtm0Var) {
            d dVar = (d) this.receiver;
            dVar.getClass();
            int adapterPosition = rtm0Var.getAdapterPosition();
            if (adapterPosition != -1) {
                com.vk.photo.editor.features.filter.a item = dVar.getItem(adapterPosition);
                a.C1457a c1457a = item instanceof a.C1457a ? (a.C1457a) item : null;
                if (c1457a != null) {
                    dVar.d.invoke(c1457a.a);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: FiltersAdapter.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<rtm0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(rtm0 rtm0Var) {
            d dVar = (d) this.receiver;
            dVar.getClass();
            int adapterPosition = rtm0Var.getAdapterPosition();
            if (adapterPosition != -1) {
                com.vk.photo.editor.features.filter.a item = dVar.getItem(adapterPosition);
                a.C1457a c1457a = item instanceof a.C1457a ? (a.C1457a) item : null;
                FilterUiModel filterUiModel = c1457a != null ? c1457a.a : null;
                if (filterUiModel != null) {
                    dVar.e.invoke(filterUiModel);
                }
            }
            return s3q0.a;
        }
    }

    public d() {
        super(a.a);
        this.c = true;
        this.d = new rl2(22);
        this.e = new x90(20);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return getItem(i).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        com.vk.photo.editor.features.filter.a item = getItem(i);
        if (!(item instanceof a.C1457a)) {
            if (!(item instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        if (e0Var instanceof oer) {
            oer oerVar = (oer) e0Var;
            ImageView imageView = oerVar.o;
            FilterUiModel filterUiModel = ((a.C1457a) item).a;
            TextView textView = oerVar.p;
            String str = filterUiModel.b;
            FilterUiModel.Type type = filterUiModel.f;
            boolean z = filterUiModel.d;
            textView.setText(str);
            oerVar.itemView.setContentDescription(filterUiModel.b);
            FilterUiModel.a aVar = filterUiModel.c;
            if (aVar instanceof FilterUiModel.a.b) {
                imageView.setImageBitmap(((FilterUiModel.a.b) aVar).a);
            } else {
                imageView.setImageDrawable(null);
            }
            oerVar.itemView.setSelected(z);
            fyt0.n(oerVar.n, z);
            fyt0.n(oerVar.q, z && type == FilterUiModel.Type.GROUP_ENTRY_POINT);
            fyt0.n(oerVar.r, !z && type == FilterUiModel.Type.GROUP_ENTRY_POINT && oerVar.l);
            return;
        }
        if (e0Var instanceof w8p0) {
            return;
        }
        if (e0Var instanceof v8p0) {
            ((v8p0) e0Var).m.setText(((a.C1457a) item).a.b);
            return;
        }
        if (e0Var instanceof rtm0) {
            rtm0 rtm0Var = (rtm0) e0Var;
            ArrayList arrayList = rtm0Var.w;
            ImageView imageView2 = rtm0Var.p;
            FrameLayout frameLayout = rtm0Var.o;
            FilterUiModel filterUiModel2 = ((a.C1457a) item).a;
            FilterUiModel.Type type2 = filterUiModel2.f;
            boolean z2 = filterUiModel2.d;
            if (type2 != FilterUiModel.Type.SUB_FILTER) {
                throw new IllegalStateException(("SubFilterViewHolder expects SUB_FILTER, but got " + type2).toString());
            }
            FilterUiModel.a aVar2 = filterUiModel2.c;
            boolean z3 = aVar2 instanceof FilterUiModel.a.c;
            boolean z4 = aVar2 instanceof FilterUiModel.a.b;
            fyt0.o(frameLayout, z4);
            fyt0.o(rtm0Var.q, z3);
            fyt0.o(rtm0Var.r, aVar2 instanceof FilterUiModel.a.C1456a);
            if (z4) {
                imageView2.setImageBitmap(((FilterUiModel.a.b) aVar2).a);
                frameLayout.setContentDescription(filterUiModel2.b);
                frameLayout.setSelected(z2);
            } else {
                imageView2.setImageDrawable(null);
                frameLayout.setContentDescription(null);
                frameLayout.setSelected(false);
            }
            fyt0.n(rtm0Var.u, z2);
            if (z3) {
                rtm0.a aVar3 = rtm0Var.new a();
                arrayList.add(aVar3);
                rtm0Var.n.o(aVar3);
            } else {
                arrayList.clear();
                com.vk.photo.editor.views.shimmer.a aVar4 = rtm0Var.s.c;
                ValueAnimator valueAnimator = aVar4.e;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    aVar4.e.cancel();
                }
            }
            rtm0Var.v = filterUiModel2.i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 0) {
            if (i == 1) {
                return new oer(from.inflate(R.layout.item_filter, viewGroup, false), this.c, new b(1, this, d.class, "onFilterViewHolderClick", "onFilterViewHolderClick(Lcom/vk/photo/editor/features/filter/holders/FilterViewHolder;)V", 0));
            }
            if (i == 2) {
                return new v8p0(from.inflate(R.layout.item_top_level_filter_error, viewGroup, false), new c(1, this, d.class, "onFilterRetry", "onFilterRetry(Lcom/vk/photo/editor/features/filter/holders/TopLevelFilterErrorHolder;)V", 0));
            }
            if (i != 3) {
                throw new IllegalArgumentException("Unknown view type");
            }
            View inflate = from.inflate(R.layout.item_subfilter, viewGroup, false);
            C1460d c1460d = new C1460d(1, this, d.class, "onSubFilterViewHolderClick", "onSubFilterViewHolderClick(Lcom/vk/photo/editor/features/filter/holders/SubFilterViewHolder;)V", 0);
            e eVar = new e(1, this, d.class, "onSubFilterRetry", "onSubFilterRetry(Lcom/vk/photo/editor/features/filter/holders/SubFilterViewHolder;)V", 0);
            xcr xcrVar = this.f;
            if (xcrVar != null) {
                return new rtm0(inflate, c1460d, eVar, xcrVar);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        View inflate2 = from.inflate(R.layout.item_filter_skeleton, viewGroup, false);
        w8p0 w8p0Var = new w8p0(inflate2);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate2.findViewById(R.id.shimmer_frame_layout);
        Context context = inflate2.getContext();
        Shimmer.b bVar = new Shimmer.b();
        bVar.a.getClass();
        Shimmer.b bVar2 = (Shimmer.b) bVar.c();
        bVar2.a.j = true;
        Shimmer.b bVar3 = (Shimmer.b) bVar2.d();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.editorSkeletonColor, typedValue, true);
        bVar3.e(typedValue.data);
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.editorSkeletonHighlightColor, typedValue2, true);
        bVar3.a.d = typedValue2.data;
        shimmerFrameLayout.a(bVar3.a());
        return w8p0Var;
    }

    public final com.vk.photo.editor.features.filter.a x0(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (com.vk.photo.editor.features.filter.a) super.getItem(i);
    }
}
