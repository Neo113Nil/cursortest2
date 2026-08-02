package ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.content;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.DatesElementVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/content/DateSlotAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO$DateVO;", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/content/DateSlotViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "clickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/atom/aspect/AspectView;", "createAspectView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/aspect/AspectView;", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/content/DateSlotViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/content/DateSlotViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateSlotAdapter extends t<DatesElementVO.DateVO, DateSlotViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> clickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateSlotAdapter(@NotNull Function1<? super AtomAction, Unit> clickListener) {
        super(new DiffUtilDeliveryDateSlot());
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.clickListener = clickListener;
    }

    private final AspectView createAspectView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectView aspectView = new AspectView(context, null, 0, 6, null);
        aspectView.setId(R$id.dateAspectView);
        aspectView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(6, context2);
        aspectView.setPadding(px, px, px, px);
        return aspectView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DateSlotViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DatesElementVO.DateVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, (List<? extends Object>) K.f71697a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DateSlotViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DateSlotViewHolder(createAspectView(parent), new DateSlotAdapter$onCreateViewHolder$1(this));
    }
}
