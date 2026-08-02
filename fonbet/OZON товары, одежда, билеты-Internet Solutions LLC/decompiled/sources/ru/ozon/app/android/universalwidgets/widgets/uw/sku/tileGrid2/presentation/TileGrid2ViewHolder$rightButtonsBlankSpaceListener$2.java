package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2$1", "invoke", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ TileGrid2ViewHolder this$0;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2$1", "Landroidx/recyclerview/widget/RecyclerView$y;", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends RecyclerView.y {
        final /* synthetic */ M<Pair<Float, Float>> $downEventXY;
        final /* synthetic */ TileGrid2ViewHolder this$0;

        AnonymousClass1(M<Pair<Float, Float>> m11, TileGrid2ViewHolder tileGrid2ViewHolder) {
            this.$downEventXY = m11;
            this.this$0 = tileGrid2ViewHolder;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.Pair] */
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent event) {
            GallerySwipeViewDelegate gallerySwipeViewDelegate;
            M<Pair<Float, Float>> m11;
            Pair<Float, Float> pair;
            Intrinsics.checkNotNullParameter(rv, "rv");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 0) {
                this.$downEventXY.f71787a = new Pair(Float.valueOf(event.getX()), Float.valueOf(event.getY()));
            }
            if (event.getAction() == 1 && (pair = (m11 = this.$downEventXY).f71787a) != null) {
                TileGrid2ViewHolder tileGrid2ViewHolder = this.this$0;
                if (pair.e().floatValue() == event.getX() && pair.f().floatValue() == event.getY()) {
                    tileGrid2ViewHolder.getContainerView().performClick();
                    return true;
                }
                m11.f71787a = null;
            }
            gallerySwipeViewDelegate = this.this$0.gallerySwipeViewDelegate;
            if (gallerySwipeViewDelegate != null) {
                return gallerySwipeViewDelegate.onTouchViewEvent(event);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewHolder$rightButtonsBlankSpaceListener$2(TileGrid2ViewHolder tileGrid2ViewHolder) {
        super(0);
        this.this$0 = tileGrid2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new AnonymousClass1(new M(), this.this$0);
    }
}
