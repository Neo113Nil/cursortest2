package ru.ozon.app.android.travel.feature.avia.widgets.stepper.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.stepper.presentation.StepperVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/stepper/view/StepperWidgetView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "stepperV", "Lru/ozon/app/android/travel/feature/avia/widgets/stepper/view/StepperView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/stepper/presentation/StepperVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepperWidgetView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(StepperWidgetView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final StepperView stepperV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepperWidgetView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new StepperWidgetView$special$$inlined$preCreationViewPool$default$1(this), new StepperWidgetView$special$$inlined$preCreationViewPool$default$2());
        StepperView stepperView = new StepperView(context, null, 0, 0, 14, null);
        stepperView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.stepperV = stepperView;
        setOrientation(1);
        addView(getTitleTAV());
        addView(stepperView);
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull StepperVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(getTitleTAV(), item.getTitle(), null, 2, null);
        if (item.getHideStepper()) {
            ViewExtKt.gone(this.stepperV);
        } else {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.stepperV);
            this.stepperV.bind(item);
        }
    }
}
