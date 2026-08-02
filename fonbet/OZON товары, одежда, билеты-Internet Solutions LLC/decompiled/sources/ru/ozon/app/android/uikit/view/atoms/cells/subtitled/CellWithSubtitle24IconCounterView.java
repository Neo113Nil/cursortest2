package ru.ozon.app.android.uikit.view.atoms.cells.subtitled;

import AD.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.databinding.CellWithSubtitle24iconCounterBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00108\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0013R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Lru/ozon/app/android/uikit/view/atoms/cells/DisclosureCell;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setTintColor", "(Ljava/lang/Integer;)V", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "", "isEnabled", "setEnabled", "(Z)V", "alignActionViewTopVertical", "()V", "alignActionViewCenterVertical", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitle24iconCounterBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitle24iconCounterBinding;", "actionViewId", "I", "getActionViewId", "()I", "Lkotlin/Function0;", "onClickListener", "Lkotlin/jvm/functions/Function0;", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "", "Landroid/view/View;", "viewsWithBias", "[Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "rippleBackground", "Landroid/graphics/drawable/Drawable;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextAtomView", "getSubtitleTextAtomView", "subtitleTextAtomView", "getSeparatorView", "()Landroid/view/View;", "separatorView", "getDisclosureImageView", "disclosureImageView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getCounterBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "counterBadgeView", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithSubtitle24IconCounterView extends BaseCellWithSubtitleView implements AtomView, DisclosureCell {
    private final int actionViewId;

    @NotNull
    private final CellWithSubtitle24iconCounterBinding binding;
    private Function0<Unit> onClickListener;
    private final Drawable rippleBackground;

    @NotNull
    private final View[] viewsWithBias;

    public /* synthetic */ CellWithSubtitle24IconCounterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CellWithSubtitle24IconCounterView cellWithSubtitle24IconCounterView, View view) {
        Function0<Unit> function0;
        if (!cellWithSubtitle24IconCounterView.isEnabled() || (function0 = cellWithSubtitle24IconCounterView.onClickListener) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public void alignActionViewCenterVertical() {
        super.alignActionViewCenterVertical();
        d dVar = new d();
        dVar.p(this);
        dVar.e0(R$id.iconIv, 3, 0);
        dVar.s(R$id.iconIv, 4, 0, 4);
        dVar.f(this);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public void alignActionViewTopVertical() {
        super.alignActionViewTopVertical();
        d dVar = new d();
        dVar.p(this);
        dVar.e0(R$id.iconIv, 3, ResourceExtKt.toPx(10));
        dVar.o(R$id.iconIv, 4);
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

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell
    @NotNull
    public ImageView getDisclosureImageView() {
        AppCompatImageView disclosureIv = this.binding.disclosureIv;
        Intrinsics.checkNotNullExpressionValue(disclosureIv, "disclosureIv");
        return disclosureIv;
    }

    @NotNull
    public ImageView getIcon() {
        AppCompatImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        return iconIv;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    @NotNull
    /* renamed from: getSeparatorView */
    public View getSeparator() {
        View separator = this.binding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return separator;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView
    @NotNull
    /* renamed from: getSubtitleTextAtomView */
    public TextAtomView getSubtitleTav() {
        TextAtomView subtitleTav = this.binding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        return subtitleTav;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    @NotNull
    /* renamed from: getTitleTextAtomView */
    public TextAtomView getTitleTav() {
        TextAtomView titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        return titleTav;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell
    public void hideDisclosure(boolean z11) {
        DisclosureCell.DefaultImpls.hideDisclosure(this, z11);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell
    public void setDisclosureTintColor(@NotNull String str) {
        DisclosureCell.DefaultImpls.setDisclosureTintColor(this, str);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView, ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView, android.view.View
    public void setEnabled(boolean isEnabled) {
        super.setEnabled(isEnabled);
        setBackground(isEnabled ? this.rippleBackground : null);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        this.onClickListener = function0;
    }

    public void setTintColor(Integer color) {
        AppCompatImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ThemeExtKt.tint(iconIv, color);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle24IconCounterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionViewId = R$id.disclosureIv;
        this.rippleBackground = a.getDrawable(context, R$drawable.ripple_rect_transparent_background);
        CellWithSubtitle24iconCounterBinding inflate = CellWithSubtitle24iconCounterBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        this.viewsWithBias = new View[]{inflate.iconIv, inflate.titleTav};
        setOnClickListener(new b(this, 14));
    }
}
