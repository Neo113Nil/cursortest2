package ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5316f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyTeenView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "horizontalCellMargin", "horizontalMargin", "verticalMargin", "bottomMarginButton", "bgColor", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "captionView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCaptionView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "islandSeparatorView", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "bgView", "Landroid/view/View;", "createButtonAndCaption", "", "nightContext", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCancelReasonStickyTeenView extends ConstraintLayout implements SelectCancelReasonStickyView {
    private final int bgColor;

    @NotNull
    private final View bgView;
    private final int bottomMarginButton;

    @NotNull
    private final CellView cellView;
    private final int horizontalCellMargin;
    private final int horizontalMargin;

    @NotNull
    private final IslandSeparatorView islandSeparatorView;
    private final int verticalMargin;

    public /* synthetic */ SelectCancelReasonStickyTeenView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void createButtonAndCaption(@NotNull Context nightContext) {
        Intrinsics.checkNotNullParameter(nightContext, "nightContext");
        ButtonV3View buttonV3View = new ButtonV3View(nightContext, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = UiExtKt.toPx(20);
        bVar.f41662z = this.bottomMarginButton;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
        buttonV3View.setLayoutParams(bVar);
        addView(buttonV3View);
        TextAtomV2View textAtomV2View = new TextAtomV2View(nightContext, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        ViewExtKt.gone(textAtomV2View);
        addView(textAtomV2View);
        ConstraintLayoutExtKt.updateConstraints(this, new SelectCancelReasonStickyTeenView$createButtonAndCaption$1(this, buttonV3View, textAtomV2View));
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyView
    @NotNull
    public ButtonV3View getButtonView() {
        return (ButtonV3View) l.k(l.h(C5316f0.b(this), SelectCancelReasonStickyTeenView$special$$inlined$filterIsInstance$1.INSTANCE));
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyView
    @NotNull
    public TextAtomV2View getCaptionView() {
        return (TextAtomV2View) l.k(l.h(C5316f0.b(this), SelectCancelReasonStickyTeenView$special$$inlined$filterIsInstance$2.INSTANCE));
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyView
    @NotNull
    public CellView getCellView() {
        return this.cellView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCancelReasonStickyTeenView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.horizontalCellMargin = UiExtKt.toPx(12, context);
        this.horizontalMargin = UiExtKt.toPx(8, context);
        this.verticalMargin = UiExtKt.toPx(8, context);
        this.bottomMarginButton = UiExtKt.toPx(8, context);
        StyleParser styleParser = StyleParser.INSTANCE;
        UniColors uniColors = UniColors.BG_DARK_KEY;
        int parseColor = styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId());
        this.bgColor = parseColor;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(View.generateViewId());
        cellView.setLayoutParams(new ConstraintLayout.b(0, -2));
        ViewExtKt.gone(cellView);
        this.cellView = cellView;
        IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context, null, 0, 6, null);
        islandSeparatorView.setId(View.generateViewId());
        islandSeparatorView.setLayoutParams(new ConstraintLayout.b(0, -2));
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(true, false, 0, parseColor));
        this.islandSeparatorView = islandSeparatorView;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        view.setBackgroundColor(parseColor);
        this.bgView = view;
        setId(View.generateViewId());
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        addView(view);
        addView(islandSeparatorView);
        addView(getCellView());
    }
}
