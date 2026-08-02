package ru.ozon.uni.atoms.v3.containers;

import FG.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.generator.GeneratorId;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002*+B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH$¢\u0006\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fRR\u0010$\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010 j\u0004\u0018\u0001`\"2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010 j\u0004\u0018\u0001`\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/uni/atoms/v3/containers/RecyclerContainer;", "Lru/ozon/uni/atoms/data/AtomDTO;", "T", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "items", "", "bind", "(Ljava/util/List;)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setItemClickListener", "(Landroid/view/View$OnClickListener;)V", "submitItems", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generator", "Lru/ozon/uni/atoms/generator/GeneratorId;", "getGenerator$uni_release", "()Lru/ozon/uni/atoms/generator/GeneratorId;", "Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter;", "getAtomsAdapter", "()Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/v3/containers/OnActionListener;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "AtomRecyclerListAdapter", "AtomWrappedRecyclerListAdapter", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RecyclerContainer<T extends AtomDTO> extends RecyclerView {

    @NotNull
    private final AtomRecyclerListAdapter atomsAdapter;

    @NotNull
    private final GeneratorId generator;
    private Function1<? super AtomAction, Unit> onAction;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000256B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R6\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010%j\u0004\u0018\u0001`'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter$ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter$ViewHolder;", "holder", "", "onViewAttachedToWindow", "(Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter$ViewHolder;)V", "onViewDetachedFromWindow", "position", "onBindViewHolder", "(Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter$ViewHolder;I)V", "Landroid/view/ViewGroup$LayoutParams;", "createAtomLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "Lru/ozon/uni/atoms/AtomsFactory;", "factory", "Lru/ozon/uni/atoms/AtomsFactory;", "getFactory", "()Lru/ozon/uni/atoms/AtomsFactory;", "setFactory", "(Lru/ozon/uni/atoms/AtomsFactory;)V", "Landroid/view/View$OnClickListener;", "onItemClickListener", "Landroid/view/View$OnClickListener;", "getOnItemClickListener", "()Landroid/view/View$OnClickListener;", "setOnItemClickListener", "(Landroid/view/View$OnClickListener;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/v3/containers/OnActionListener;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/generator/GeneratorId;", "generator", "Lru/ozon/uni/atoms/generator/GeneratorId;", "getGenerator$uni_release", "()Lru/ozon/uni/atoms/generator/GeneratorId;", "setGenerator$uni_release", "(Lru/ozon/uni/atoms/generator/GeneratorId;)V", "Companion", "ViewHolder", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class AtomRecyclerListAdapter extends t<AtomDTO, ViewHolder> {
        private AtomsFactory factory;
        private GeneratorId generator;
        private Function1<? super AtomAction, Unit> onAction;
        private View.OnClickListener onItemClickListener;
        public static final int $stable = 8;

        @NotNull
        private static final RecyclerContainer$AtomRecyclerListAdapter$Companion$diffCallback$1 diffCallback = new i.d<AtomDTO>() { // from class: ru.ozon.uni.atoms.v3.containers.RecyclerContainer$AtomRecyclerListAdapter$Companion$diffCallback$1
            @Override // androidx.recyclerview.widget.i.d
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(AtomDTO oldItem, AtomDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AtomDTO oldItem, AtomDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getType(), newItem.getType());
            }
        };

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/uni/atoms/v3/containers/OnActionListener;", "onAction", "bind", "(Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "itemListener", "Landroid/view/View$OnClickListener;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ViewHolder extends RecyclerView.C {

            @NotNull
            private final View containerView;
            private View.OnClickListener itemListener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewHolder(@NotNull View containerView) {
                super(containerView);
                Intrinsics.checkNotNullParameter(containerView, "containerView");
                this.containerView = containerView;
                getContainerView().setOnClickListener(new a(this, 8));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void _init_$lambda$0(ViewHolder viewHolder, View view) {
                View.OnClickListener onClickListener = viewHolder.itemListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            public final void bind(@NotNull AtomDTO item, Function1<? super AtomAction, Unit> onAction) {
                Intrinsics.checkNotNullParameter(item, "item");
                View view = this.itemView;
                Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.atoms.v3.containers.SingleAtom");
                SingleAtom singleAtom = (SingleAtom) view;
                SingleAtom.bind$default(singleAtom, item, false, 2, null);
                singleAtom.setOnAction(onAction);
            }

            @NotNull
            public View getContainerView() {
                return this.containerView;
            }

            public final void setClickListener(View.OnClickListener listener) {
                this.itemListener = listener;
            }
        }

        public AtomRecyclerListAdapter() {
            super(diffCallback);
            this.factory = AtomConfig.INSTANCE.provideAtomsFactory();
        }

        @NotNull
        protected ViewGroup.LayoutParams createAtomLayoutParams() {
            return new ViewGroup.LayoutParams(-1, -2);
        }

        public final void setGenerator$uni_release(GeneratorId generatorId) {
            this.generator = generatorId;
        }

        public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
            this.onAction = function1;
        }

        public final void setOnItemClickListener(View.OnClickListener onClickListener) {
            this.onItemClickListener = onClickListener;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            AtomDTO item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            holder.bind(item, this.onAction);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
            singleAtom.setLayoutParams(createAtomLayoutParams());
            singleAtom.setAtomsFactory(this.factory);
            GeneratorId generatorId = this.generator;
            if (generatorId != null) {
                singleAtom.setGenerator$uni_release(generatorId);
            }
            return new ViewHolder(singleAtom);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            super.onViewAttachedToWindow((AtomRecyclerListAdapter) holder);
            holder.setClickListener(this.onItemClickListener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onViewDetachedFromWindow(@NotNull ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            super.onViewDetachedFromWindow((AtomRecyclerListAdapter) holder);
            holder.setClickListener(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomWrappedRecyclerListAdapter;", "Lru/ozon/uni/atoms/v3/containers/RecyclerContainer$AtomRecyclerListAdapter;", "<init>", "()V", "createAtomLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AtomWrappedRecyclerListAdapter extends AtomRecyclerListAdapter {
        @Override // ru.ozon.uni.atoms.v3.containers.RecyclerContainer.AtomRecyclerListAdapter
        @NotNull
        protected ViewGroup.LayoutParams createAtomLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecyclerContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.generator.findParent();
        submitItems(items);
    }

    @NotNull
    protected final AtomRecyclerListAdapter getAtomsAdapter() {
        return this.atomsAdapter;
    }

    public final void setItemClickListener(View.OnClickListener listener) {
        this.atomsAdapter.setOnItemClickListener(listener);
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
        this.atomsAdapter.setOnAction(function1);
    }

    protected abstract void submitItems(@NotNull List<? extends T> items);

    public /* synthetic */ RecyclerContainer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerContainer(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GeneratorId create = AtomConfig.INSTANCE.getGeneratorIdFactory().create(this);
        this.generator = create;
        AtomRecyclerListAdapter atomRecyclerListAdapter = new AtomRecyclerListAdapter();
        atomRecyclerListAdapter.setGenerator$uni_release(create);
        this.atomsAdapter = atomRecyclerListAdapter;
        setAdapter(atomRecyclerListAdapter);
    }
}
