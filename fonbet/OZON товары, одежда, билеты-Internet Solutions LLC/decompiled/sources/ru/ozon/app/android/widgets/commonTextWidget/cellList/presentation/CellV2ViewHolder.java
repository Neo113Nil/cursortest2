package ru.ozon.app.android.widgets.commonTextWidget.cellList.presentation;

import Vg.d;
import W10.c;
import WZ.t;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.presentation.CellV2VO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.cell.selection.radiobutton.RadioTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonViewApi;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00018B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0018*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b\"\u0010#J3\u0010*\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0016\u00102\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0018048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;", "applySortingViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;)V", "Landroid/content/res/Resources;", "resources", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "", "getDimension", "(Landroid/content/res/Resources;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)F", "", "hasSeparator", "", "setSeparator", "(Z)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "appendLocators", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;", "singleAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CellV2ViewHolder extends k<CellV2VO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ApplySortingViewModel applySortingViewModel;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ComposerReferences refs;
    private final SingleAtom singleAtom;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/cellList/presentation/CellV2ViewHolder$Companion;", "", "<init>", "()V", "RADIO_TITLE_LOCATOR", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellV2ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull ApplySortingViewModel applySortingViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(applySortingViewModel, "applySortingViewModel");
        this.refs = refs;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.applySortingViewModel = applySortingViewModel;
        SingleAtom singleAtom = containerView instanceof SingleAtom ? (SingleAtom) containerView : null;
        this.singleAtom = singleAtom;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new CellV2ViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        if (singleAtom != null) {
            singleAtom.setOnAction(buildHandler);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (A10.h.a(r8) == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void appendLocators(SingleAtom singleAtom) {
        int childCount = singleAtom.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = singleAtom.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (childAt instanceof RadioTitleSubtitleCellView) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = viewGroup.getChildAt(i12);
                    Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
                    if (childAt2 instanceof SmartLabel) {
                        SmartLabel smartLabel = (SmartLabel) childAt2;
                        CharSequence text = smartLabel.getText();
                        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                        if (text.length() > 0) {
                            ViewParent parent = singleAtom.getParent();
                            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                            int i13 = recyclerView != null ? 1 : 0;
                            smartLabel.setContentDescription("radioTitleSubtitleCell.title" + (getAdapterPosition() - i13));
                        }
                    }
                }
            }
        }
    }

    private final float getDimension(Resources resources, CommonCellSettings.LayoutPadding padding) {
        return resources.getDimension(padding.getCellLayoutPadding());
    }

    private final void setSeparator(boolean hasSeparator) {
        SingleAtom singleAtom = this.singleAtom;
        KeyEvent.Callback childAt = singleAtom != null ? singleAtom.getChildAt(0) : null;
        if (childAt instanceof MainAddonViewApi) {
            ((MainAddonViewApi) childAt).setHasSeparator(hasSeparator);
        } else if (childAt instanceof CellView) {
            ((CellView) childAt).setHasSeparator(hasSeparator);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        SingleAtom singleAtom = this.singleAtom;
        if (singleAtom != null) {
            appendLocators(singleAtom);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.applySortingViewModel.cancelApplySorting();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CellV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SingleAtom singleAtom = this.singleAtom;
        if (singleAtom == null) {
            return;
        }
        singleAtom.bind(item.getCell(), true);
        CellV2VO.LayoutModel layoutModel = item.getLayoutModel();
        float dimension = getDimension(getResources(), layoutModel.getTopMargin());
        float dimension2 = getDimension(getResources(), item.getLeftMargin());
        float dimension3 = getDimension(getResources(), layoutModel.getBottomMargin());
        float dimension4 = getDimension(getResources(), item.getRightMargin());
        this.singleAtom.setPadding((int) (getDimension(getResources(), item.getLeftPadding()) + dimension2), layoutModel.getPaddingTop() + ((int) dimension), (int) (getDimension(getResources(), item.getLeftPadding()) + dimension4), layoutModel.getPaddingBottom() + ((int) dimension3));
        float[] fArr = {layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getTopCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius(), layoutModel.getBottomCornerRadius()};
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), item.getIslandColor());
        int intValue = parseColor != null ? parseColor.intValue() : 0;
        Integer parseColor2 = styleParser.parseColor(getContext(), item.getBackgroundColor());
        this.singleAtom.setBackground(new CellV2Drawable(parseColor2 != null ? parseColor2.intValue() : a.getColor(getContext(), UniColors.LAYER_FLOOR_1.getResId()), intValue, fArr, dimension, dimension4, dimension3, dimension2));
        setSeparator(layoutModel.getHasSeparator());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CellV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
