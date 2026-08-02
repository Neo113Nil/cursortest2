package ru.ozon.app.android.uikit.view.atoms.cells.subtitled;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.CellWithSubtitleToggleCounterBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleCounterView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleToggleCounterView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isSelected", "", "setSelected", "(Z)V", "isEnabled", "setEnabled", "alignActionViewTopVertical", "()V", "alignActionViewCenterVertical", "actionViewId", "I", "getActionViewId", "()I", "Lkotlin/Function1;", "onCheckedChangeListener", "Lkotlin/jvm/functions/Function1;", "getOnCheckedChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnCheckedChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "_onCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleToggleCounterBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleToggleCounterBinding;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextAtomView", "getSubtitleTextAtomView", "subtitleTextAtomView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "separatorView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getCounterBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "counterBadgeView", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithSubtitleToggleCounterView extends BaseCellWithSubtitleView implements AtomView {

    @NotNull
    private final CompoundButton.OnCheckedChangeListener _onCheckedChangeListener;
    private final int actionViewId;

    @NotNull
    private final CellWithSubtitleToggleCounterBinding binding;
    private Function1<? super Boolean, Unit> onCheckedChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleToggleCounterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _onCheckedChangeListener$lambda$0(CellWithSubtitleToggleCounterView cellWithSubtitleToggleCounterView, CompoundButton compoundButton, boolean z11) {
        cellWithSubtitleToggleCounterView.setSelected(z11);
        Function1<? super Boolean, Unit> function1 = cellWithSubtitleToggleCounterView.onCheckedChangeListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
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
        dVar.t(getActionViewId(), 3, 0, 3, ResourceExtKt.toPx(8));
        fixTextsMargins(dVar, ResourceExtKt.toPx(12));
        dVar.f(this);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public int getActionViewId() {
        return this.actionViewId;
    }

    @NotNull
    public BadgeView getCounterBadgeView() {
        BadgeView counterBadge = this.binding.counterBadge;
        Intrinsics.checkNotNullExpressionValue(counterBadge, "counterBadge");
        return counterBadge;
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
        this.binding.toggleSw.setEnabled(isEnabled);
    }

    public final void setOnCheckedChangeListener(Function1<? super Boolean, Unit> function1) {
        this.onCheckedChangeListener = function1;
    }

    @Override // android.view.View
    public void setSelected(boolean isSelected) {
        super.setSelected(isSelected);
        ToggleView toggleView = this.binding.toggleSw;
        toggleView.setOnCheckedChangeListener(null);
        toggleView.setChecked(isSelected);
        toggleView.setOnCheckedChangeListener(this._onCheckedChangeListener);
    }

    public /* synthetic */ CellWithSubtitleToggleCounterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleToggleCounterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionViewId = R$id.toggleSw;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: tX.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                CellWithSubtitleToggleCounterView._onCheckedChangeListener$lambda$0(CellWithSubtitleToggleCounterView.this, compoundButton, z11);
            }
        };
        this._onCheckedChangeListener = onCheckedChangeListener;
        CellWithSubtitleToggleCounterBinding bind = CellWithSubtitleToggleCounterBinding.bind(View.inflate(context, R$layout.cell_with_subtitle_toggle_counter, this));
        this.binding = bind;
        setBackgroundResource(R$color.oz_semantic_bg_secondary);
        bind.toggleSw.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
