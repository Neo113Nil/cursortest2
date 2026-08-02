package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.mapper.CouponGoalsV2VO;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.CouponGoalViewV2;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0018\u00010\tj\u0004\u0018\u0001`\n0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0018\u00010\tj\u0004\u0018\u0001`\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/mapper/CouponGoalsV2VO$CouponGoalItemVO;", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lkotlin/Function0;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfoProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "isSingle", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemViewHolder;I)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponGoalItemsAdapter extends i<CouponGoalsV2VO.CouponGoalItemVO, CouponGoalItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final Function0<Boolean> isSingle;

    @NotNull
    private final Function0<d> widgetInfoProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CouponGoalItemsAdapter(@NotNull J containerViewLifecycleOwner, @NotNull ComposerReferences composerReferences, @NotNull Function0<d> widgetInfoProvider, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Boolean> isSingle) {
        super(new GenericDiffUtil(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(widgetInfoProvider, "widgetInfoProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(isSingle, "isSingle");
        this.composerReferences = composerReferences;
        this.widgetInfoProvider = widgetInfoProvider;
        this.actionHandler = actionHandler;
        this.isSingle = isSingle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CouponGoalItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        d invoke = this.widgetInfoProvider.invoke();
        if (invoke != null) {
            CouponGoalsV2VO.CouponGoalItemVO item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            k.bindItem$default(holder, item, invoke, null, 4, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CouponGoalItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CouponGoalViewV2 couponGoalViewV2 = new CouponGoalViewV2(context, null, 0, 6, null);
        couponGoalViewV2.setLayoutParams(new ConstraintLayout.b(-1, -1));
        return new CouponGoalItemViewHolder(couponGoalViewV2, this.composerReferences, this.actionHandler, this.isSingle);
    }
}
