package ru.ozon.app.android.button.presentation.adapter;

import a00.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.databinding.ItemButtonBlockBinding;
import ru.ozon.app.android.button.presentation.ActionButtonVO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR6\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter$ButtonViewHolder;", "La00/h;", "viewModelOwnerProvider", "", "", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "actions", "Lkotlin/Function0;", "", "voIdProvider", "<init>", "(La00/h;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter$ButtonViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter$ButtonViewHolder;I)V", "La00/h;", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function0;", "", "Lru/ozon/app/android/button/presentation/ActionButtonVO$Button;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "ButtonViewHolder", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonsAdapter extends RecyclerView.g<ButtonViewHolder> {

    @NotNull
    private final Map<String, BaseActionConfig<?>> actions;

    @NotNull
    private List<ActionButtonVO.Button> items;

    @NotNull
    private final h viewModelOwnerProvider;

    @NotNull
    private final Function0<Long> voIdProvider;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/button/presentation/adapter/ButtonsAdapter$ButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/button/databinding/ItemButtonBlockBinding;", "binding", "La00/h;", "viewModelOwnerProvider", "", "", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "actions", "<init>", "(Lru/ozon/app/android/button/databinding/ItemButtonBlockBinding;La00/h;Ljava/util/Map;)V", "Lru/ozon/app/android/button/presentation/ActionButtonVO$Button;", "item", "", "widgetId", "", "bind", "(Lru/ozon/app/android/button/presentation/ActionButtonVO$Button;Ljava/lang/Long;)V", "Lru/ozon/app/android/button/databinding/ItemButtonBlockBinding;", "La00/h;", "Ljava/util/Map;", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonViewHolder extends RecyclerView.C {

        @NotNull
        private final Map<String, BaseActionConfig<?>> actions;

        @NotNull
        private final ItemButtonBlockBinding binding;

        @NotNull
        private final h viewModelOwnerProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ButtonViewHolder(@NotNull ItemButtonBlockBinding binding, @NotNull h viewModelOwnerProvider, @NotNull Map<String, ? extends BaseActionConfig<?>> actions) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.binding = binding;
            this.viewModelOwnerProvider = viewModelOwnerProvider;
            this.actions = actions;
        }

        public final void bind(@NotNull ActionButtonVO.Button item, Long widgetId) {
            Intrinsics.checkNotNullParameter(item, "item");
            ButtonAtom buttonAtom = this.binding.buttonBa;
            buttonAtom.bind(item.getAtom());
            buttonAtom.setOnAction(new ButtonsAdapter$ButtonViewHolder$bind$1$1(this, item, widgetId));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsAdapter(@NotNull h viewModelOwnerProvider, @NotNull Map<String, ? extends BaseActionConfig<?>> actions, @NotNull Function0<Long> voIdProvider) {
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(voIdProvider, "voIdProvider");
        this.viewModelOwnerProvider = viewModelOwnerProvider;
        this.actions = actions;
        this.voIdProvider = voIdProvider;
        this.items = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<ActionButtonVO.Button> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), this.voIdProvider.invoke());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemButtonBlockBinding inflate = ItemButtonBlockBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ButtonViewHolder(inflate, this.viewModelOwnerProvider, this.actions);
    }
}
