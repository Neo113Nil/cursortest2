package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation;

import Vg.d;
import WZ.l;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.domain.flags.TooltipRichAnimationEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 )2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001)BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0018\u0010\u0013\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001d0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/view/ProfileIconButtonView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/view/ProfileIconButtonView;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Landroid/content/SharedPreferences;Lru/ozon/app/android/network/abtool/FeatureChecker;LWZ/l;)V", "item", "", "shouldShowTooltip", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;Ll20/d;)V", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/view/ProfileIconButtonView;", "LVg/d;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileIconButtonViewHolder extends k<ProfileIconButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ProfileIconButtonView containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileIconButtonViewHolder(@NotNull ProfileIconButtonView containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor inhibitor, @NotNull SharedPreferences sharedPreferences, @NotNull FeatureChecker featureChecker, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.sharedPreferences = sharedPreferences;
        this.featureChecker = featureChecker;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).customActionHandlers(new ProfileIconButtonViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final boolean shouldShowTooltip(ProfileIconButtonVO item) {
        if (item.getIconTooltip() == null) {
            return false;
        }
        String tooltipKey = item.getIconTooltip().getTooltipKey();
        if (tooltipKey == null) {
            return true;
        }
        if (Intrinsics.d(this.sharedPreferences.getString("profile_icon_button_tooltip_key", null), tooltipKey)) {
            return false;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("profile_icon_button_tooltip_key", tooltipKey);
        edit.commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProfileIconButtonVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, shouldShowTooltip(item), this.featureChecker.isEnabled(TooltipRichAnimationEnabled.INSTANCE), this.actionHandler, new ProfileIconButtonViewHolder$bind$1(item, this), new ProfileIconButtonViewHolder$bind$2(this));
        String indicatorKey = item.getIndicatorKey();
        if (indicatorKey != null) {
            if (this.sharedPreferences.contains("indicator_key") && Intrinsics.d(this.sharedPreferences.getString("indicator_key", null), indicatorKey)) {
                return;
            }
            this.containerView.toggleIndicatorVisibility(true);
        }
    }
}
