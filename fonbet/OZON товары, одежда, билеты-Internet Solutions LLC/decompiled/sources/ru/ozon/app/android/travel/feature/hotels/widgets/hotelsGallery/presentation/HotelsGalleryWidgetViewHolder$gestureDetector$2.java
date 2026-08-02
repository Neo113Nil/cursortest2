package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.view.HotelsGalleryView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/GestureDetector;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsGalleryWidgetViewHolder$gestureDetector$2 extends AbstractC7737t implements Function0<GestureDetector> {
    final /* synthetic */ HotelsGalleryWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryWidgetViewHolder$gestureDetector$2(HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder) {
        super(0);
        this.this$0 = hotelsGalleryWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GestureDetector invoke() {
        Context context = this.this$0.getContext();
        final HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder = this.this$0;
        return new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryWidgetViewHolder$gestureDetector$2.1
            /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onScroll(MotionEvent firstEvent, MotionEvent secondEvent, float distanceX, float distanceY) {
                HotelsGalleryView hotelsGalleryView;
                boolean z11;
                HotelsGalleryVO.Settings mobileSettings;
                AtomAction hotelsGalleryFeedAtomAction;
                HotelsGalleryViewModel hotelsGalleryViewModel;
                HotelsGalleryView hotelsGalleryView2;
                Function1 function1;
                Intrinsics.checkNotNullParameter(secondEvent, "secondEvent");
                hotelsGalleryView = HotelsGalleryWidgetViewHolder.this.view;
                ViewPager2 hotelsGalleryVp = hotelsGalleryView.getHotelsGalleryVp();
                RecyclerView.g e11 = hotelsGalleryVp.e();
                if (e11 != null) {
                    if (hotelsGalleryVp.f() == e11.getShimmersCount() - 1) {
                        z11 = true;
                        boolean z12 = distanceX <= 0.0f;
                        if (z11 || !z12) {
                            return false;
                        }
                        HotelsGalleryVO boundData = HotelsGalleryWidgetViewHolder.this.getBoundData();
                        if (boundData != null && (mobileSettings = boundData.getMobileSettings()) != null && (hotelsGalleryFeedAtomAction = mobileSettings.getHotelsGalleryFeedAtomAction()) != null) {
                            HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder2 = HotelsGalleryWidgetViewHolder.this;
                            hotelsGalleryViewModel = hotelsGalleryWidgetViewHolder2.viewModel;
                            hotelsGalleryView2 = hotelsGalleryWidgetViewHolder2.view;
                            hotelsGalleryViewModel.savePosition(hotelsGalleryView2.getHotelsGalleryVp().f());
                            function1 = hotelsGalleryWidgetViewHolder2.actionHandler;
                            function1.invoke(hotelsGalleryFeedAtomAction);
                        }
                        return true;
                    }
                }
                z11 = false;
                if (distanceX <= 0.0f) {
                }
                if (z11) {
                }
                return false;
            }
        });
    }
}
