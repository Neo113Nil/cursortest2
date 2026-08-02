package ru.ozon.app.android.uikit.view.atoms.cells.subtitled;

import DG.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.CellWithSubtitleCheckboxRadioCounterBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.app.android.uikit.view.atoms.cells.CheckboxRadioCell;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*¨\u00065"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleCheckboxRadioCounterView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Lru/ozon/app/android/uikit/view/atoms/cells/CheckboxRadioCell;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onCheckedChange", "()V", "", "isSelected", "setSelected", "(Z)V", "isEnabled", "setEnabled", "alignActionViewTopVertical", "alignActionViewCenterVertical", "Lkotlin/Function1;", "onCheckedChangeListener", "Lkotlin/jvm/functions/Function1;", "getOnCheckedChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnCheckedChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleCheckboxRadioCounterBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleCheckboxRadioCounterBinding;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getSubtitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleTextAtomView", "getTitleTextAtomView", "titleTextAtomView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "separatorView", "getActionViewId", "()I", "actionViewId", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getCounterBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "counterBadgeView", "getSelectorView", "selectorView", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithSubtitleCheckboxRadioCounterView extends BaseCellWithSubtitleView implements AtomView, CheckboxRadioCell {

    @NotNull
    private final CellWithSubtitleCheckboxRadioCounterBinding binding;
    private Function1<? super Boolean, Unit> onCheckedChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleCheckboxRadioCounterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCheckedChange() {
        setSelected(!isSelected());
        Function1<? super Boolean, Unit> function1 = this.onCheckedChangeListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(isSelected()));
        }
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public void alignActionViewCenterVertical() {
        super.alignActionViewCenterVertical();
        d dVar = new d();
        dVar.p(this);
        dVar.t(getActionViewId(), 3, 0, 3, 0);
        fixTextsMargins(dVar, ResourceExtKt.toPx(8));
        dVar.f(this);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public void alignActionViewTopVertical() {
        super.alignActionViewTopVertical();
        d dVar = new d();
        dVar.p(this);
        dVar.t(getActionViewId(), 3, 0, 3, ResourceExtKt.toPx(10));
        fixTextsMargins(dVar, ResourceExtKt.toPx(12));
        dVar.f(this);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public int getActionViewId() {
        return R$id.radioButtonView;
    }

    @NotNull
    public BadgeView getCounterBadgeView() {
        BadgeView counterBadge = this.binding.counterBadge;
        Intrinsics.checkNotNullExpressionValue(counterBadge, "counterBadge");
        return counterBadge;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.CheckboxRadioCell
    @NotNull
    public View getSelectorView() {
        View radioButtonView = this.binding.radioButtonView;
        Intrinsics.checkNotNullExpressionValue(radioButtonView, "radioButtonView");
        return radioButtonView;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    @NotNull
    public View getSeparatorView() {
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return separator;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView
    @NotNull
    public TextAtomView getSubtitleTextAtomView() {
        TextAtomView subtitleTav = this.binding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        return subtitleTav;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    @NotNull
    public TextAtomView getTitleTextAtomView() {
        TextAtomView titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        return titleTav;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView, ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView, android.view.View
    public void setEnabled(boolean isEnabled) {
        super.setEnabled(isEnabled);
        this.binding.counterBadge.setEnabled(isEnabled);
        this.binding.radioButtonView.setEnabled(isEnabled);
    }

    public final void setOnCheckedChangeListener(Function1<? super Boolean, Unit> function1) {
        this.onCheckedChangeListener = function1;
    }

    @Override // android.view.View
    public void setSelected(boolean isSelected) {
        super.setSelected(isSelected);
        this.binding.radioButtonView.setSelected(isSelected);
    }

    public void setSelectorStyle(@NotNull CheckboxRadioCell.SelectorStyle selectorStyle) {
        CheckboxRadioCell.DefaultImpls.setSelectorStyle(this, selectorStyle);
    }

    public /* synthetic */ CellWithSubtitleCheckboxRadioCounterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleCheckboxRadioCounterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CellWithSubtitleCheckboxRadioCounterBinding bind = CellWithSubtitleCheckboxRadioCounterBinding.bind(View.inflate(context, R$layout.cell_with_subtitle_checkbox_radio_counter, this));
        this.binding = bind;
        setBackgroundResource(R$color.oz_semantic_bg_secondary);
        bind.radioButtonView.setOnClickListener(new a(this, 13));
        setOnClickListener(new AI.a(this, 17));
    }
}
