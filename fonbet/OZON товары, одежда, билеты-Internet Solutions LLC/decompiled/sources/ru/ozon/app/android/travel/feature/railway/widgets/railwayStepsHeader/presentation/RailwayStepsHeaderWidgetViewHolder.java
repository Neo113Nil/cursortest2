package ru.ozon.app.android.travel.feature.railway.widgets.railwayStepsHeader.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.railway.databinding.WidgetRailwayStepsHeaderBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayStepsHeader/presentation/RailwayStepsHeaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayStepsHeader/presentation/RailwayStepsHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayStepsHeader/presentation/RailwayStepsHeaderVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/railway/databinding/WidgetRailwayStepsHeaderBinding;", "binding", "Lru/ozon/app/android/travel/feature/railway/databinding/WidgetRailwayStepsHeaderBinding;", "", "iconPadding", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayStepsHeaderWidgetViewHolder extends k<RailwayStepsHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetRailwayStepsHeaderBinding binding;

    @NotNull
    private final View containerView;
    private final int iconPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RailwayStepsHeaderWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        WidgetRailwayStepsHeaderBinding bind = WidgetRailwayStepsHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.iconPadding = ResourceExtKt.toPx(4, getContext());
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RailwayStepsHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView railwayStepsHeaderTitleTav = this.binding.railwayStepsHeaderTitleTav;
        Intrinsics.checkNotNullExpressionValue(railwayStepsHeaderTitleTav, "railwayStepsHeaderTitleTav");
        TextAtomHolderKt.bind$default(railwayStepsHeaderTitleTav, item.getTitle(), null, 2, null);
        TextAtomView railwayStepsHeaderSubtitleTav = this.binding.railwayStepsHeaderSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(railwayStepsHeaderSubtitleTav, "railwayStepsHeaderSubtitleTav");
        TextAtomHolderKt.bindOrGone$default(railwayStepsHeaderSubtitleTav, item.getSubtitle(), null, 2, null);
        SmallIconButtonView smallIconButtonView = this.binding.railwayStepsHeaderEditSibv;
        Intrinsics.f(smallIconButtonView);
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, item.getEditButton(), this.actionHandler);
        int i11 = this.iconPadding;
        smallIconButtonView.setPadding(i11, i11, i11, i11);
    }
}
