package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.presentation;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalMobileAdvantageBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.presentation.AddLegalMobileVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter$ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter$ViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter$ViewHolder;I)V", "DiffUtilItemCallback", "ViewHolder", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalMobileAdvantagesAdapter extends t<AddLegalMobileVO.AdvantageVO, ViewHolder> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter$DiffUtilItemCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;)Z", "areContentsTheSame", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DiffUtilItemCallback extends i.d<AddLegalMobileVO.AdvantageVO> {

        @NotNull
        public static final DiffUtilItemCallback INSTANCE = new DiffUtilItemCallback();

        private DiffUtilItemCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull AddLegalMobileVO.AdvantageVO oldItem, @NotNull AddLegalMobileVO.AdvantageVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull AddLegalMobileVO.AdvantageVO oldItem, @NotNull AddLegalMobileVO.AdvantageVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileAdvantagesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;", "item", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileVO$AdvantageVO;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalMobileAdvantageBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalMobileAdvantageBinding;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewHolder extends RecyclerView.C {

        @NotNull
        private final WidgetAddLegalMobileAdvantageBinding binding;

        @NotNull
        private final View containerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.containerView = containerView;
            WidgetAddLegalMobileAdvantageBinding bind = WidgetAddLegalMobileAdvantageBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(@NotNull AddLegalMobileVO.AdvantageVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            WidgetAddLegalMobileAdvantageBinding widgetAddLegalMobileAdvantageBinding = this.binding;
            widgetAddLegalMobileAdvantageBinding.indexTv.setText(item.getIndex());
            TextAtomV2View titleTav = widgetAddLegalMobileAdvantageBinding.titleTav;
            Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
            TextHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
            TextAtomV2View subtitleTav = widgetAddLegalMobileAdvantageBinding.subtitleTav;
            Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
            TextHolderKt.bind$default(subtitleTav, item.getSubtitle(), null, 2, null);
        }
    }

    public AddLegalMobileAdvantagesAdapter() {
        super(DiffUtilItemCallback.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AddLegalMobileVO.AdvantageVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ViewHolder(ViewGroupExtKt.inflate(parent, R$layout.widget_add_legal_mobile_advantage));
    }
}
