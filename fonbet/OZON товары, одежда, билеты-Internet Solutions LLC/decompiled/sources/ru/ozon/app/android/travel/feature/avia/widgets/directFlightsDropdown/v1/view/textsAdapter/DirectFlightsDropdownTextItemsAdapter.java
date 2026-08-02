package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.textsAdapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/textsAdapter/DirectFlightsDropdownTextItemsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/textsAdapter/DirectFlightsDropdownTextItemViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/textsAdapter/DirectFlightsDropdownTextItemViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/textsAdapter/DirectFlightsDropdownTextItemViewHolder;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownTextItemsAdapter extends t<TextDTO, DirectFlightsDropdownTextItemViewHolder> {
    public DirectFlightsDropdownTextItemsAdapter() {
        super(new i.d<TextDTO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.textsAdapter.DirectFlightsDropdownTextItemsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TextDTO oldItem, TextDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TextDTO oldItem, TextDTO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.hashCode() == newItem.hashCode();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DirectFlightsDropdownTextItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DirectFlightsDropdownTextItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomV2View.class);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        textAtomV2View.setLayoutParams(new RecyclerView.p(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        return new DirectFlightsDropdownTextItemViewHolder(textAtomV2View);
    }
}
