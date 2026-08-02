package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import j3.Q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsGalleryFullVideoBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/Q;", "videoSize", "", "invoke", "(Lj3/Q;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$9 extends AbstractC7737t implements Function1<Q, Unit> {
    final /* synthetic */ HotelsGalleryFullPagerVideoViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullPagerVideoViewHolder$initPlayer$1$9(HotelsGalleryFullPagerVideoViewHolder hotelsGalleryFullPagerVideoViewHolder) {
        super(1);
        this.this$0 = hotelsGalleryFullPagerVideoViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Q q11) {
        invoke2(q11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Q videoSize) {
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding;
        Pair calculateOptimalVideoSize;
        ItemHotelsGalleryFullVideoBinding itemHotelsGalleryFullVideoBinding2;
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        HotelsGalleryFullPagerVideoViewHolder hotelsGalleryFullPagerVideoViewHolder = this.this$0;
        itemHotelsGalleryFullVideoBinding = hotelsGalleryFullPagerVideoViewHolder.binding;
        calculateOptimalVideoSize = hotelsGalleryFullPagerVideoViewHolder.calculateOptimalVideoSize(itemHotelsGalleryFullVideoBinding, videoSize);
        int intValue = ((Number) calculateOptimalVideoSize.a()).intValue();
        int intValue2 = ((Number) calculateOptimalVideoSize.b()).intValue();
        itemHotelsGalleryFullVideoBinding2 = this.this$0.binding;
        PlayerView exoPlayerV = itemHotelsGalleryFullVideoBinding2.exoPlayerV;
        Intrinsics.checkNotNullExpressionValue(exoPlayerV, "exoPlayerV");
        ViewGroup.LayoutParams layoutParams = exoPlayerV.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = intValue;
        ((ViewGroup.MarginLayoutParams) bVar).height = intValue2;
        exoPlayerV.setLayoutParams(bVar);
    }
}
