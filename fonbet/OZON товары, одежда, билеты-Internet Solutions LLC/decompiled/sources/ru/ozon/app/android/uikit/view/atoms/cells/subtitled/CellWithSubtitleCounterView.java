package ru.ozon.app.android.uikit.view.atoms.cells.subtitled;

import Dy.ViewOnClickListenerC2883a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.databinding.CellWithSubtitleCounterBinding;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R(\u00108\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitleCounterView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/app/android/uikit/view/atoms/cells/DisclosureCell;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "", "setEnabled", "(Z)V", "alignActionViewTopVertical", "()V", "alignActionViewCenterVertical", "color", "setCounterTextColor", "(I)V", "setCounterBackgroundColor", "(Ljava/lang/Integer;)V", "Lkotlin/Function0;", "action", "onClickListener", "(Lkotlin/jvm/functions/Function0;)V", "actionViewId", "I", "getActionViewId", "()I", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleCounterBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/CellWithSubtitleCounterBinding;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextAtomView", "getSubtitleTextAtomView", "subtitleTextAtomView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "separatorView", "Landroid/widget/ImageView;", "getDisclosureImageView", "()Landroid/widget/ImageView;", "disclosureImageView", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getCounter", "()Ljava/lang/CharSequence;", "setCounter", "(Ljava/lang/CharSequence;)V", "counter", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithSubtitleCounterView extends BaseCellWithSubtitleView implements AtomView, DisclosureCell {
    private final int actionViewId;

    @NotNull
    private final CellWithSubtitleCounterBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleCounterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$4(CellWithSubtitleCounterView cellWithSubtitleCounterView, Function0 function0, View view) {
        if (!cellWithSubtitleCounterView.isEnabled() || function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public void alignActionViewCenterVertical() {
        super.alignActionViewCenterVertical();
        d dVar = new d();
        dVar.p(this);
        dVar.s(R$id.counterTav, 3, 0, 3);
        dVar.s(R$id.counterTav, 4, 0, 4);
        dVar.e0(R$id.disclosureIv, 3, 0);
        dVar.f(this);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public void alignActionViewTopVertical() {
        super.alignActionViewTopVertical();
        d dVar = new d();
        dVar.p(this);
        dVar.s(R$id.counterTav, 3, R$id.titleTav, 3);
        dVar.o(R$id.counterTav, 4);
        dVar.e0(R$id.disclosureIv, 3, ResourceExtKt.toPx(2));
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

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.DisclosureCell
    public void hideDisclosure(boolean z11) {
        DisclosureCell.DefaultImpls.hideDisclosure(this, z11);
    }

    public final void onClickListener(Function0<Unit> action) {
        setOnClickListener(new ViewOnClickListenerC2883a(13, this, action));
    }

    public final void setCounter(CharSequence charSequence) {
        TextAtomView textAtomView = this.binding.counterTav;
        textAtomView.setText(charSequence);
        ViewExtKt.showOrGone(textAtomView, Boolean.valueOf(charSequence != null));
    }

    public final void setCounterBackgroundColor(Integer color) {
        if (color == null) {
            TextAtomView counterTav = this.binding.counterTav;
            Intrinsics.checkNotNullExpressionValue(counterTav, "counterTav");
            ViewExtKt.clearBackgroundTint(counterTav);
        } else {
            int intValue = color.intValue();
            TextAtomView counterTav2 = this.binding.counterTav;
            Intrinsics.checkNotNullExpressionValue(counterTav2, "counterTav");
            ViewExtKt.setBackgroundTint(counterTav2, intValue);
        }
    }

    public final void setCounterTextColor(int color) {
        this.binding.counterTav.setTextColor(color);
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

    public /* synthetic */ CellWithSubtitleCounterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithSubtitleCounterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionViewId = R$id.disclosureIv;
        this.binding = CellWithSubtitleCounterBinding.inflate(LayoutInflater.from(context), this);
    }
}
