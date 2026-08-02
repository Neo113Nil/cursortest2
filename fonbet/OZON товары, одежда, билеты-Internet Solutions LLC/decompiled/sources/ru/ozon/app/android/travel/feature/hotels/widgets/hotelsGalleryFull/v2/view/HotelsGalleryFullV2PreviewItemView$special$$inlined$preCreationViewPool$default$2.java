package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2PreviewItemView$special$$inlined$preCreationViewPool$default$2 extends AbstractC7737t implements Function1<Image, Unit> {
    final /* synthetic */ Context $context$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullV2PreviewItemView$special$$inlined$preCreationViewPool$default$2(Context context) {
        super(1);
        this.$context$inlined = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Image image) {
        invoke(image);
        return Unit.f71690a;
    }

    public final void invoke(Image PreCreationViewPoolDelegate) {
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        Image image = PreCreationViewPoolDelegate;
        image.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        image.setBackgroundColor(ThemeExtKt.themeColor(this.$context$inlined, R$attr.bgLightKey));
    }
}
