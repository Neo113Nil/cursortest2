package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.viewHolder;

import D90.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.AdultWidgetViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.Grid3VO$Grid3ItemVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\r0 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/viewHolder/Grid3BaseItemViewHolder;", "Lru/ozon/app/android/product/common/AdultWidgetViewHolder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;)V", "", "navigateOrShowAdultDialog", "()V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/content/Context;", "context", "", "color", "", "getBackgroundColorOrDefault", "(Landroid/content/Context;Ljava/lang/String;)I", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "getOnClickListener", "()Landroid/view/View$OnClickListener;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Grid3BaseItemViewHolder extends AdultWidgetViewHolder<Grid3VO$Grid3ItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final View.OnClickListener onClickListener;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid3BaseItemViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull AdultHandler adultHandler, @NotNull AdultDelegate<Grid3VO$Grid3ItemVO> adultDelegate) {
        super(containerView, adultDelegate);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        this.refs = refs;
        this.adultHandler = adultHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.onClickListener = new c(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateOrShowAdultDialog() {
        if (getItem().getShouldBlur()) {
            AdultHandler.DefaultImpls.showAdultDialog$default(this.adultHandler, this.refs.getContainer().k(), new AdultListener() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.viewHolder.Grid3BaseItemViewHolder$navigateOrShowAdultDialog$2
                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultAccept() {
                    Grid3VO$Grid3ItemVO item;
                    item = Grid3BaseItemViewHolder.this.getItem();
                    AtomAction action = item.getAction();
                    if (action != null) {
                        Grid3BaseItemViewHolder.this.getActionHandler().invoke(action);
                    }
                }

                @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                public void onAdultReject() {
                    AdultListener.DefaultImpls.onAdultReject(this);
                }
            }, null, false, 12, null);
            return;
        }
        AtomAction action = getItem().getAction();
        if (action != null) {
            this.actionHandler.invoke(action);
        }
    }

    @NotNull
    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    protected final int getBackgroundColorOrDefault(@NotNull Context context, String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (color == null) {
            return 0;
        }
        return StyleParser.INSTANCE.parseColor(context, color, R$color.layer_floor_1);
    }

    @NotNull
    protected final View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull Grid3VO$Grid3ItemVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((Grid3BaseItemViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
