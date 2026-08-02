package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/adapter/QuickFiltersAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$FilterItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onItemClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersAdapter extends t<QuickFiltersVO.FilterItem, RecyclerView.C> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> onItemClickListener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/adapter/QuickFiltersAdapter$Companion;", "", "<init>", "()V", "ATOM_VIEW_TYPE", "", "DIVIDER_VIEW_TYPE", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickFiltersAdapter(@NotNull Function1<? super AtomAction, Unit> onItemClickListener) {
        super(new QuickFiltersItemCallback());
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.onItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        QuickFiltersVO.FilterItem item = getItem(position);
        if (item instanceof QuickFiltersVO.AtomViewVO) {
            return 1;
        }
        if (item instanceof QuickFiltersVO.Divider) {
            return 2;
        }
        return super.getItemViewType(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        QuickFiltersVO.FilterItem item = getItem(position);
        if (holder instanceof QuickFiltersAtomViewHolder) {
            if (item instanceof QuickFiltersVO.AtomViewVO) {
                ((QuickFiltersAtomViewHolder) holder).bind(((QuickFiltersVO.AtomViewVO) item).getAtom());
            }
        } else if ((holder instanceof QuickFiltersDividerViewHolder) && (item instanceof QuickFiltersVO.Divider)) {
            ((QuickFiltersDividerViewHolder) holder).bind(((QuickFiltersVO.Divider) item).getColor());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
            singleAtom.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return new QuickFiltersAtomViewHolder(singleAtom, this.onItemClickListener);
        }
        if (viewType != 2) {
            throw new IllegalStateException("Invalid view type for QuickFiltersAdapter::onCreateViewHolder");
        }
        View view = new View(parent.getContext());
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(1, context2);
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        view.setLayoutParams(new RecyclerView.p(px, ResourceExtKt.toPx(32, context3)));
        return new QuickFiltersDividerViewHolder(view);
    }
}
