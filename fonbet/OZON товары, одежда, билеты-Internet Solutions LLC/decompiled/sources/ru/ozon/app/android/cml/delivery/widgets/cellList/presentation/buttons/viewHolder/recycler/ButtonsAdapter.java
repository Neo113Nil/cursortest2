package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewHolder.recycler;

import Sc.o;
import Tc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewHolder.recycler.Payload;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewItem.ButtonWithLoader;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonWithLoader;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonViewHolder;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonsAdapter extends t<ButtonWithLoader, ButtonViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new i.d<ButtonWithLoader>() { // from class: ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewHolder.recycler.ButtonsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ButtonWithLoader oldItem, ButtonWithLoader newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ButtonWithLoader oldItem, ButtonWithLoader newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem.getId(), newItem.getId());
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(ButtonWithLoader oldItem, ButtonWithLoader newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                b builder = C7714v.B();
                if (oldItem.getIsLoading() != newItem.getIsLoading()) {
                    builder.add(new Payload.Loading(newItem.getIsLoading()));
                }
                if (!Intrinsics.d(oldItem.getButton(), newItem.getButton())) {
                    builder.add(new Payload.Button(newItem.getButton()));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                b B11 = builder.B();
                if (B11.isEmpty()) {
                    return null;
                }
                return B11;
            }
        });
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((ButtonViewHolder) c11, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ButtonViewHolder(buttonV3View);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getItem(position).getButton(), this.onAction);
    }

    public void onBindViewHolder(@NotNull ButtonViewHolder holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ArrayList arrayList = new ArrayList();
        for (Object obj : payloads) {
            if (obj instanceof List) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            onBindViewHolder(holder, position);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Payload payload : (List) it.next()) {
                if (payload instanceof Payload.Loading) {
                    holder.setLoading(((Payload.Loading) payload).getIsLoading());
                } else {
                    if (!(payload instanceof Payload.Button)) {
                        throw new o();
                    }
                    holder.bind(((Payload.Button) payload).getButton(), this.onAction);
                }
            }
        }
    }
}
