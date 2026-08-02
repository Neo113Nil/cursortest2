package ru.ozon.app.android.ugc.core.widgets.singlereview.otherReviewButton;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewsButtonVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewButtonVO;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewButtonVO;Ll20/d;)V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getContainerView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OtherReviewsButtonVH extends k<OtherReviewButtonVO> {
    public static final int $stable = LargeButtonView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final LargeButtonView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherReviewsButtonVH(@NotNull LargeButtonView containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OtherReviewButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ButtonV3Atom.LargeButton showOtherButton = item.getShowOtherButton();
        if (showOtherButton != null) {
            LargeButtonHolderKt.bind(this.containerView, showOtherButton, this.actionHandler);
        }
    }
}
