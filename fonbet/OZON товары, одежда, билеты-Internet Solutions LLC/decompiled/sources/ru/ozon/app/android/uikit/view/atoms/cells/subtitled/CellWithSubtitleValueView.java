package ru.ozon.app.android.uikit.view.atoms.cells.subtitled;

import CG.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.CellWithSubtitleValueBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R(\u00103\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleValueView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/app/android/uikit/view/atoms/cells/DisclosureCell;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "", "setEnabled", "(Z)V", "maxLines", "setValueTextMaxLines", "(I)V", "resetValueTextMaxLines", "()V", "actionViewId", "I", "getActionViewId", "()I", "Lkotlin/Function0;", "onClickListener", "Lkotlin/jvm/functions/Function0;", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleValueBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleValueBinding;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextAtomView", "getSubtitleTextAtomView", "subtitleTextAtomView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "separatorView", "Landroid/widget/ImageView;", "getDisclosureImageView", "()Landroid/widget/ImageView;", "disclosureImageView", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue", "()Ljava/lang/CharSequence;", "setValue", "(Ljava/lang/CharSequence;)V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithSubtitleValueView extends BaseCellWithSubtitleView implements AtomView, DisclosureCell {
    private final int actionViewId;

    @NotNull
    private final CellWithSubtitleValueBinding binding;
    private Function0<Unit> onClickListener;

    public /* synthetic */ CellWithSubtitleValueView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CellWithSubtitleValueView cellWithSubtitleValueView, View view) {
        Function0<Unit> function0;
        if (!cellWithSubtitleValueView.isEnabled() || (function0 = cellWithSubtitleValueView.onClickListener) == null) {
            return;
        }
        function0.invoke();
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

    public final void resetValueTextMaxLines() {
        TextAtomView valueTav = this.binding.valueTav;
        Intrinsics.checkNotNullExpressionValue(valueTav, "valueTav");
        resetMaxLines(valueTav);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell
    public void setDisclosureTintColor(@NotNull String str) {
        DisclosureCell.DefaultImpls.setDisclosureTintColor(this, str);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView, ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView, android.view.View
    public void setEnabled(boolean isEnabled) {
        super.setEnabled(isEnabled);
        setBackgroundResource(isEnabled ? R$drawable.ripple_rect_white_bluewave : R$color.oz_white_1);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        this.onClickListener = function0;
    }

    public final void setValue(CharSequence charSequence) {
        TextAtomView textAtomView = this.binding.valueTav;
        textAtomView.setText(charSequence);
        ViewExtKt.showOrGone(textAtomView, Boolean.valueOf(charSequence != null));
    }

    public final void setValueTextMaxLines(int maxLines) {
        this.binding.valueTav.setMaxLines(maxLines);
        this.binding.valueTav.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleValueView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionViewId = R$id.disclosureIv;
        this.binding = CellWithSubtitleValueBinding.bind(View.inflate(context, R$layout.cell_with_subtitle_value, this));
        setBackgroundResource(R$color.oz_white_1);
        setOnClickListener(new a(this, 18));
    }
}
