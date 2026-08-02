package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom;

import Sc.o;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;
import ru.ozon.app.android.commonwidgets.di.ff.CommonCurtainCustomPageViewLogicEnabled;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerHelper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/CurtainShowHelper;", "", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "pageLoadHelper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/PageLoadHelper;", "pageLoadWithCustomLogicHelper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/PageLoadWithCustomLogicHelper;", "timerHelper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/timer/TimerHelper;", "offsetHelper", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/OffsetHelper;", "show", "item", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "composerRootView", "Landroid/view/ViewGroup;", "unbind", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainShowHelper {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FeatureChecker featureChecker;
    private OffsetHelper offsetHelper;

    @NotNull
    private final PageLoadHelper pageLoadHelper;

    @NotNull
    private final PageLoadWithCustomLogicHelper pageLoadWithCustomLogicHelper;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final TimerHelper timerHelper;

    /* JADX WARN: Multi-variable type inference failed */
    public CurtainShowHelper(@NotNull ComposerReferences ref, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.ref = ref;
        this.actionHandler = actionHandler;
        this.featureChecker = featureChecker;
        this.pageLoadHelper = new PageLoadHelper(ref, actionHandler);
        this.pageLoadWithCustomLogicHelper = new PageLoadWithCustomLogicHelper(ref, actionHandler);
        this.timerHelper = new TimerHelper(ref, actionHandler);
    }

    public final void show(@NotNull CurtainCustomVO item, @NotNull ViewGroup composerRootView) {
        Unit unit;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        if (item.getIsShown()) {
            return;
        }
        this.offsetHelper = new OffsetHelper(this.ref, this.actionHandler, composerRootView);
        CurtainCustomVO.Condition showCondition = item.getShowCondition();
        if (Intrinsics.d(showCondition, CurtainCustomVO.Condition.PageLoaded.INSTANCE)) {
            if (this.featureChecker.isEnabled(CommonCurtainCustomPageViewLogicEnabled.INSTANCE)) {
                this.pageLoadWithCustomLogicHelper.show(item);
            } else {
                this.pageLoadHelper.show(item);
            }
            unit = Unit.f71690a;
        } else if (showCondition instanceof CurtainCustomVO.Condition.Timer) {
            this.timerHelper.show(item);
            unit = Unit.f71690a;
        } else {
            if (!(showCondition instanceof CurtainCustomVO.Condition.Offset)) {
                throw new o();
            }
            OffsetHelper offsetHelper = this.offsetHelper;
            if (offsetHelper != null) {
                offsetHelper.show(item);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
        }
        ExtensionsKt.getExhaustive(unit);
    }

    public final void unbind() {
        this.offsetHelper = null;
        this.timerHelper.unbind();
    }
}
