package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonSelectorInputView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsSelectorFieldView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "addViews", "()V", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "input", "Lkotlin/Function1;", "", "onSelectorClicked", "bindInput", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTO", "bindSubtitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "updateValue", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;)V", "bindError", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonSelectorInputView;", "selectorInputCtiv", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonSelectorInputView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsSelectorFieldView extends LinearLayout {

    @NotNull
    private final CommonSelectorInputView selectorInputCtiv;

    @NotNull
    private final TextAtomV2View subtitleTav;

    public /* synthetic */ HotelsBookAdditionsSelectorFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.selectorInputCtiv);
        addView(this.subtitleTav);
    }

    public final void bindError(@NotNull CommonInputVO.Selector input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.selectorInputCtiv.bindError(input);
    }

    public final void bindInput(@NotNull CommonInputVO.Selector input, @NotNull Function1<? super Long, Unit> onSelectorClicked) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        this.selectorInputCtiv.bind(input, onSelectorClicked);
    }

    public final void bindSubtitle(TextDTO textDTO) {
        TextHolderKt.bindOrGone$default(this.subtitleTav, textDTO, null, 2, null);
    }

    public final void updateValue(@NotNull CommonInputVO.Selector input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.selectorInputCtiv.updateValue(input);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookAdditionsSelectorFieldView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        CommonSelectorInputView commonSelectorInputView = new CommonSelectorInputView(context, null, 0, 0, 14, null);
        commonSelectorInputView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.selectorInputCtiv = commonSelectorInputView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        textAtomV2View = textAtomV2View == null ? new TextAtomV2View(context, null, 0, 6, null) : textAtomV2View;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(4, context);
        textAtomV2View.setLayoutParams(layoutParams);
        this.subtitleTav = textAtomV2View;
        setOrientation(1);
        addViews();
    }
}
