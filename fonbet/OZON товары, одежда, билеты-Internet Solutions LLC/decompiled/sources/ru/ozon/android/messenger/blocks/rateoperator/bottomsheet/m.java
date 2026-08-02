package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.rateoperator.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.AbstractC9511b;
import ru.ozon.app.android.messenger.databinding.MItemRateOperatorReasonsBinding;
import ru.ozon.uni.android.controls.tag.TagButtonView;

/* loaded from: classes10.dex */
public final class m extends RecyclerView.g<a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f86225a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private List<d.b> f86226b;

    public final class a extends AbstractC9511b<d.b> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final MItemRateOperatorReasonsBinding f86227a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f86228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull m mVar, MItemRateOperatorReasonsBinding view) {
            super(view.getConstraintLayout());
            Intrinsics.checkNotNullParameter(view, "binding");
            this.f86228b = mVar;
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86227a = view;
        }

        public final void e(@NotNull final d.b vo) {
            Intrinsics.checkNotNullParameter(vo, "vo");
            final TagButtonView tagButtonView = this.f86227a.rateReasonButton;
            tagButtonView.setText(vo.getName());
            tagButtonView.setEnabled(true);
            final m mVar = this.f86228b;
            tagButtonView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List list;
                    boolean z11;
                    List list2;
                    TagButtonView tagButtonView2 = TagButtonView.this;
                    boolean isSelected = tagButtonView2.isSelected();
                    m mVar2 = mVar;
                    d.b bVar = vo;
                    if (isSelected) {
                        list2 = mVar2.f86225a;
                        ((ArrayList) list2).remove(bVar);
                        z11 = false;
                    } else {
                        list = mVar2.f86225a;
                        ((ArrayList) list).add(bVar);
                        z11 = true;
                    }
                    tagButtonView2.setSelected(z11);
                }
            });
        }
    }

    public m(@NotNull ArrayList selectedReasons) {
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        this.f86225a = selectedReasons;
        this.f86226b = K.f71697a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void g(@NotNull List<d.b> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f86226b = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        return this.f86226b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(a aVar, int i11) {
        a holder = aVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.e(this.f86226b.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MItemRateOperatorReasonsBinding inflate = MItemRateOperatorReasonsBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new a(this, inflate);
    }
}
