package ru.ozon.app.android.uikit.view.atoms.cells.subtitled;

import EX.c;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.CellWithSubtitle48iconBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u000f2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010\u0011R\u001a\u0010!\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001d\u00101\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u001e¨\u0006A"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle48IconView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "", "Lru/ozon/app/android/uikit/view/atoms/cells/DisclosureCell;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "", "setEnabled", "(Z)V", "alignActionViewTopVertical", "()V", "alignActionViewCenterVertical", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "color", "setTintColor", "(Ljava/lang/Integer;)V", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "show", "showIconParandjaAndPaddings", "actionViewId", "I", "getActionViewId", "()I", "Lkotlin/Function0;", "onClickListener", "Lkotlin/jvm/functions/Function0;", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/graphics/drawable/Drawable;", "parandja$delegate", "LSc/j;", "getParandja", "()Landroid/graphics/drawable/Drawable;", "parandja", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitle48iconBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitle48iconBinding;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextAtomView", "getSubtitleTextAtomView", "subtitleTextAtomView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "separatorView", "getDisclosureImageView", "disclosureImageView", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithSubtitle48IconView extends BaseCellWithSubtitleView implements AtomView, DisclosureCell {
    private final int actionViewId;

    @NotNull
    private final CellWithSubtitle48iconBinding binding;
    private Function0<Unit> onClickListener;

    /* renamed from: parandja$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j parandja;

    public /* synthetic */ CellWithSubtitle48IconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CellWithSubtitle48IconView cellWithSubtitle48IconView, View view) {
        Function0<Unit> function0;
        if (!cellWithSubtitle48IconView.isEnabled() || (function0 = cellWithSubtitle48IconView.onClickListener) == null) {
            return;
        }
        function0.invoke();
    }

    private final Drawable getParandja() {
        return (Drawable) this.parandja.getValue();
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
        dVar.e0(R$id.iconIv, 3, ResourceExtKt.toPx(6));
        dVar.o(R$id.iconIv, 4);
        dVar.f(this);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public int getActionViewId() {
        return this.actionViewId;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell
    @NotNull
    public ImageView getDisclosureImageView() {
        ImageView disclosureIv = this.binding.disclosureIv;
        Intrinsics.checkNotNullExpressionValue(disclosureIv, "disclosureIv");
        return disclosureIv;
    }

    @NotNull
    public ImageView getIcon() {
        ImageView iconIv = this.binding.iconIv;
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
        setBackgroundResource(isEnabled ? R$drawable.ripple_rect_white_bluewave : R$color.oz_semantic_bg_secondary);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        this.onClickListener = function0;
    }

    public void setScaleType(@NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.binding.iconIv.setScaleType(scaleType);
    }

    public void setTintColor(Integer color) {
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ThemeExtKt.tint(iconIv, color);
    }

    public final void showIconParandjaAndPaddings(boolean show) {
        ImageView imageView = this.binding.iconIv;
        if (show) {
            imageView.setBackgroundResource(ru.ozon.app.android.uikit.R$drawable.bg_cell_icon);
            imageView.setForeground(getParandja());
            ViewExtKt.setPaddingsDp(imageView, 2.0f);
        } else {
            imageView.setBackground(null);
            imageView.setForeground(null);
            ViewExtKt.setPaddingsDp(imageView, 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitle48IconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionViewId = R$id.disclosureIv;
        this.parandja = k.b(new CellWithSubtitle48IconView$parandja$2(context));
        this.binding = CellWithSubtitle48iconBinding.bind(View.inflate(context, R$layout.cell_with_subtitle_48icon, this));
        setMinHeight(ResourceExtKt.toPx(60));
        setBackgroundResource(R$color.oz_white_1);
        setOnClickListener(new c(this, 12));
    }
}
