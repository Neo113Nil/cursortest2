package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation.adapter;

import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemsAdapterFactory;", "", "<init>", "()V", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lkotlin/Function0;", "Ll20/d;", "widgetInfoProvider", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "isSingle", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemsAdapter;", "create", "(Landroidx/lifecycle/J;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/adapter/CouponGoalItemsAdapter;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponGoalItemsAdapterFactory {
    @NotNull
    public final CouponGoalItemsAdapter create(@NotNull J containerViewLifecycleOwner, @NotNull ComposerReferences composerReferences, @NotNull Function0<d> widgetInfoProvider, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Boolean> isSingle) {
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(widgetInfoProvider, "widgetInfoProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(isSingle, "isSingle");
        return new CouponGoalItemsAdapter(containerViewLifecycleOwner, composerReferences, widgetInfoProvider, actionHandler, isSingle);
    }
}
