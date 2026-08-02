package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.view;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$8 extends AbstractC7737t implements Function1<ButtonV3View, Unit> {
    final /* synthetic */ HotelsGalleryFeedV2ItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$8(HotelsGalleryFeedV2ItemView hotelsGalleryFeedV2ItemView) {
        super(1);
        this.this$0 = hotelsGalleryFeedV2ItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ButtonV3View buttonV3View) {
        invoke(buttonV3View);
        return Unit.f71690a;
    }

    public final void invoke(ButtonV3View PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(this.this$0.getDs().getMargin8(), this.this$0.getDs().getMargin8(), this.this$0.getDs().getMargin8(), this.this$0.getDs().getMargin8());
        PreCreationViewPoolDelegate.setLayoutParams(layoutParams);
    }
}
