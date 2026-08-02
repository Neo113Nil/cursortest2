package ru.ozon.android.messenger.blocks.ratemessenger.recycler.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ratemessenger.k;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.utils.image.c;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.databinding.MReasonItemBinding;

/* loaded from: classes10.dex */
public final class a extends RecyclerView.g<C1518a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d.a f86145a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f86146b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f86147c;

    /* renamed from: ru.ozon.android.messenger.blocks.ratemessenger.recycler.adapter.a$a, reason: collision with other inner class name */
    public static final class C1518a extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final MReasonItemBinding f86148a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final d.a f86149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1518a(@NotNull MReasonItemBinding binding, @NotNull d.a networkConfig, @NotNull Function1<? super Integer, Unit> onItemClicked) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
            Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
            this.f86148a = binding;
            this.f86149b = networkConfig;
            this.itemView.setOnClickListener(new Cy.b(6, onItemClicked, this));
        }

        public final void e(@NotNull k reasonVO) {
            Intrinsics.checkNotNullParameter(reasonVO, "reasonVO");
            MReasonItemBinding mReasonItemBinding = this.f86148a;
            ImageView reasonIV = mReasonItemBinding.reasonIV;
            Intrinsics.checkNotNullExpressionValue(reasonIV, "reasonIV");
            c.a(reasonIV, reasonVO.a(), this.f86149b);
            Pair pair = reasonVO.d() ? new Pair(Integer.valueOf(R$color.text_primary), Float.valueOf(1.0f)) : new Pair(Integer.valueOf(R$color.text_secondary), Float.valueOf(0.0f));
            int intValue = ((Number) pair.a()).intValue();
            float floatValue = ((Number) pair.b()).floatValue();
            ImageView imageView = mReasonItemBinding.reasonIV;
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(floatValue);
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            mReasonItemBinding.reasonNameTav.setTextColor(androidx.core.content.a.getColor(this.itemView.getContext(), intValue));
            mReasonItemBinding.reasonNameTav.setText(reasonVO.b());
        }
    }

    public a(@NotNull d.a networkConfig, @NotNull Function0<Unit> onItemClicked) {
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        this.f86145a = networkConfig;
        this.f86146b = onItemClicked;
        this.f86147c = new ArrayList();
    }

    public static final void f(a aVar, int i11) {
        ((k) aVar.f86147c.get(i11)).e(!((k) r0.get(i11)).d());
        aVar.notifyItemChanged(i11);
        aVar.f86146b.invoke();
    }

    @NotNull
    public final ArrayList g() {
        ArrayList arrayList = this.f86147c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).d()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        return this.f86147c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(C1518a c1518a, int i11) {
        C1518a holder = c1518a;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.e((k) this.f86147c.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final C1518a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MReasonItemBinding inflate = MReasonItemBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new C1518a(inflate, this.f86145a, new b(1, this, a.class, "onItemClicked", "onItemClicked(I)V", 0));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(List<k> list) {
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((k) it.next()).e(false);
        }
        Unit unit = Unit.f71690a;
        ArrayList arrayList = this.f86147c;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }
}
