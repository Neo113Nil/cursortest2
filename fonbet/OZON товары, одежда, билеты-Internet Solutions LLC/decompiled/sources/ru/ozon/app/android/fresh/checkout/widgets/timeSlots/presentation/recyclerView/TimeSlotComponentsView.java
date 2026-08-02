package ru.ozon.app.android.fresh.checkout.widgets.timeSlots.presentation.recyclerView;

import Bi.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.domain.TimeSlotsVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/recyclerView/TimeSlotComponentsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "bind", "", "item", "Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/domain/TimeSlotsVO$TimeSlot;", "setContainerPadding", "aspectPadding", "isIconVisible", "", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeSlotComponentsView extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable;
    private static final int topSubtitleMargin = UiExtKt.toPx(2);
    private static final int startTitleMargin = UiExtKt.toPx(6);
    private static final int verticalTitleMargin = UiExtKt.toPx(4);
    private static final int endTitleMargin = UiExtKt.toPx(6);
    private static final int endTitleMarginWithIcon = UiExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/timeSlots/presentation/recyclerView/TimeSlotComponentsView$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimeSlotComponentsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setContainerPadding(int aspectPadding, boolean isIconVisible) {
        int i11 = startTitleMargin + aspectPadding;
        int i12 = verticalTitleMargin;
        setPadding(i11, aspectPadding + i12, (isIconVisible ? endTitleMarginWithIcon : endTitleMargin) + aspectPadding, aspectPadding + i12);
    }

    public final void bind(@NotNull TimeSlotsVO.TimeSlot item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        setContainerPadding(item.getAspectPadding(), item.getTitle().getIcon() != null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSlotComponentsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.timeSlotTitleView, -2, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.timeSlotSubtitleView, -2, -2);
        int i12 = R$id.timeSlotTitleView;
        d12.f41638j = i12;
        d12.f41656t = i12;
        ((ViewGroup.MarginLayoutParams) d12).topMargin = topSubtitleMargin;
        textAtomV2View2.setLayoutParams(d12);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        setId(R$id.timeSlotComponents);
        setLayoutParams(new ConstraintLayout.b(-2, -2));
    }
}
