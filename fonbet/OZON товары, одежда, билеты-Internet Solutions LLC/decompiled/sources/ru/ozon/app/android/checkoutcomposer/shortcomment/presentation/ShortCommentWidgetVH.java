package ru.ozon.app.android.checkoutcomposer.shortcomment.presentation;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/shortcomment/presentation/ShortCommentWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/shortcomment/presentation/ShortCommentVO;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/shortcomment/presentation/ShortCommentVO;Ll20/d;)V", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "shortCommentAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShortCommentWidgetVH extends k<ShortCommentVO> {
    public static final int $stable = (AtomsAdapter.$stable | VerticalAtomsLayout.$stable) | HandlersInhibitor.$stable;

    @NotNull
    private final VerticalAtomsLayout containerView;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final AtomsAdapter shortCommentAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortCommentWidgetVH(@NotNull HandlersInhibitor handlersInhibitor, @NotNull VerticalAtomsLayout containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.handlersInhibitor = handlersInhibitor;
        this.containerView = containerView;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_L_Bold, 0, 16, null, 0, false, false, 18, null, null, 16, 20, null, null, null, 473007, null))), null, null, null, 14, null);
        this.shortCommentAdapter = atomsAdapter;
        atomsAdapter.setOnAction(new ActionHandler.Builder(ref, this).enableClickThrottling(handlersInhibitor).configureBottomSheet(new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, SheetSoftInputMode.ADJUST_RESIZE, 0, false, false, false, false, false, false, 2038, null)).buildHandler());
        containerView.setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ShortCommentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.shortCommentAdapter.bind(getContext(), C7714v.a0(item.getShortComment()));
    }
}
