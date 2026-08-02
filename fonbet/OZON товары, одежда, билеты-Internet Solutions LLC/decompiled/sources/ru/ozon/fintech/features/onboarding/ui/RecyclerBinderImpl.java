package ru.ozon.fintech.features.onboarding.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerBinder;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/onboarding/ui/RecyclerBinderImpl;", "Lcom/detmir/recycli/adapters/RecyclerBinder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$C;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "", "state", "Lcom/detmir/recycli/adapters/RecyclerItem;", "item", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/lang/String;Lcom/detmir/recycli/adapters/RecyclerItem;)V", "recyclerItemState", "getItemViewType", "(Ljava/lang/String;)I", "Ljava/util/HashMap;", "stateToIndexMap", "Ljava/util/HashMap;", "getStateToIndexMap", "()Ljava/util/HashMap;", "onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecyclerBinderImpl implements RecyclerBinder {

    @NotNull
    private final HashMap<String, Integer> stateToIndexMap = U.f(new Pair("ru.ozon.fintech.features.onboarding.ui.DisclosureItem#default", 0), new Pair("ru.ozon.fintech.features.onboarding.ui.DisclosureItem#ru.ozon.fintech.features.onboarding.ui.DisclosureItemView", 0));

    public static final class a extends RecyclerView.C {
    }

    @Override // com.detmir.recycli.adapters.RecyclerBinder
    public int getItemViewType(@NotNull String recyclerItemState) {
        Intrinsics.checkNotNullParameter(recyclerItemState, "recyclerItemState");
        Integer num = getStateToIndexMap().get(recyclerItemState);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.detmir.recycli.adapters.RecyclerBinder
    @NotNull
    public HashMap<String, Integer> getStateToIndexMap() {
        return this.stateToIndexMap;
    }

    @Override // com.detmir.recycli.adapters.RecyclerBinder
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull String state, @NotNull RecyclerItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.d(state, "ru.ozon.fintech.features.onboarding.ui.DisclosureItem#default")) {
            View view = holder.itemView;
            Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.fintech.features.onboarding.ui.DisclosureItemView");
            ((DisclosureItemView) view).binds((DisclosureItem) item);
        } else if (Intrinsics.d(state, "ru.ozon.fintech.features.onboarding.ui.DisclosureItem#ru.ozon.fintech.features.onboarding.ui.DisclosureItemView")) {
            View view2 = holder.itemView;
            Intrinsics.g(view2, "null cannot be cast to non-null type ru.ozon.fintech.features.onboarding.ui.DisclosureItemView");
            ((DisclosureItemView) view2).binds((DisclosureItem) item);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, ru.ozon.fintech.features.onboarding.ui.DisclosureItemView] */
    @Override // com.detmir.recycli.adapters.RecyclerBinder
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        M m11 = new M();
        if (viewType != 0) {
            throw new Exception("Recyclii can't find view for a RecyclerItem");
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        m11.f71787a = new DisclosureItemView(context, null, 0, 6, null);
        return new a((View) m11.f71787a);
    }
}
