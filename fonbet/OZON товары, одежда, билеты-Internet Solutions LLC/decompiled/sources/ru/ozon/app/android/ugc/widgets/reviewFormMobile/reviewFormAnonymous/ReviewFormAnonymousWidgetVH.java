package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousVO;", "Lru/ozon/uni/android/cell/CellView;", "view", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "isChecked", "isUserEvent", "", "setAnonymousState", "(ZZ)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousVO;Ll20/d;)V", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormAnonymousWidgetVH extends k<ReviewFormAnonymousVO> {

    @NotNull
    private final ReviewFormViewModel formViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final CellView view;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous.ReviewFormAnonymousWidgetVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<ToggleView, Boolean, Unit> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ToggleView toggleView, Boolean bool) {
            invoke(toggleView, bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(ToggleView toggleView, boolean z11) {
            Intrinsics.checkNotNullParameter(toggleView, "<unused var>");
            ReviewFormAnonymousWidgetVH.this.refs.getController().update(new AnonymousUpdateKey(z11));
            ReviewFormAnonymousWidgetVH.this.setAnonymousState(z11, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormAnonymousWidgetVH(@NotNull CellView view, @NotNull ReviewFormViewModel formViewModel, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.formViewModel = formViewModel;
        this.refs = refs;
        view.getRightBlock().getToggleView().setOnStateChangeListener(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnonymousState(boolean isChecked, boolean isUserEvent) {
        String uploadKey;
        ReviewFormAnonymousVO boundData = getBoundData();
        if (boundData == null || (uploadKey = boundData.getUploadKey()) == null) {
            return;
        }
        this.formViewModel.onViewIntent(new ViewIntent.AnonymousUpdated(uploadKey, isChecked, isUserEvent));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewFormAnonymousVO item, @NotNull d info) {
        Boolean isSelected;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellHolderKt.bind$default(this.view, item.getAnonymousCell(), null, 2, null);
        CellDTO.RightBlock rightBlock = item.getAnonymousCell().getRightBlock();
        AtomDTO control = rightBlock != null ? rightBlock.getControl() : null;
        ToggleDTO toggleDTO = control instanceof ToggleDTO ? (ToggleDTO) control : null;
        setAnonymousState((toggleDTO == null || (isSelected = toggleDTO.isSelected()) == null) ? false : isSelected.booleanValue(), false);
    }
}
