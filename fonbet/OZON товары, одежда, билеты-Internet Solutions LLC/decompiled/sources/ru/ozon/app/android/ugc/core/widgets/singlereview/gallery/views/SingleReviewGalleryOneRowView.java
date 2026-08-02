package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.SingleReviewGalleryItemSizeProvider;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow.SingleReviewGalleryRowVO;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!JO\u0010,\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\f0'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\f0'¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryOneRowView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Landroid/graphics/Bitmap;", "iconPlayBitmap", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/preload/PlayerPreloader;Landroid/graphics/Bitmap;)V", "", "count", "", "goneExtraViews", "(I)V", "index", "Landroid/view/View;", "getItemView", "(I)Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO$MediaItem;", "mediaItems", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "Lkotlin/Function1;", "", "openDeeplink", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindMedia", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/CornerRadius;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Landroid/graphics/Bitmap;", "dividerSize", "I", "itemSize", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SingleReviewGalleryOneRowView extends ViewGroup {
    private int dividerSize;

    @NotNull
    private final Bitmap iconPlayBitmap;
    private int itemSize;

    @NotNull
    private final PlayerPreloader playerPreloader;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewGalleryOneRowView(@NotNull Context context, @NotNull PlayerPreloader playerPreloader, @NotNull Bitmap iconPlayBitmap) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(iconPlayBitmap, "iconPlayBitmap");
        this.playerPreloader = playerPreloader;
        this.iconPlayBitmap = iconPlayBitmap;
        this.dividerSize = SingleReviewGalleryItemSizeProvider.INSTANCE.getDividerSize();
    }

    private final View getItemView(int index) {
        View singleReviewGalleryItemView;
        View childAt = getChildAt(index);
        if (childAt != null) {
            ViewExtKt.show(childAt);
            return childAt;
        }
        if (index == 2) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            singleReviewGalleryItemView = new SingleReviewGalleryMoreView(context, this.playerPreloader, this.iconPlayBitmap);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            singleReviewGalleryItemView = new SingleReviewGalleryItemView(context2, this.playerPreloader, this.iconPlayBitmap);
        }
        addView(singleReviewGalleryItemView);
        return singleReviewGalleryItemView;
    }

    private final void goneExtraViews(int count) {
        int childCount = getChildCount();
        while (count < childCount) {
            View childAt = getChildAt(count);
            if (childAt != null) {
                ViewExtKt.gone(childAt);
                childAt.setOnClickListener(null);
            }
            count++;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        if (child != null && getChildCount() == 3) {
            throw new IllegalStateException("Too many elements");
        }
        super.addView(child);
    }

    public final void bindMedia(@NotNull List<? extends SingleReviewGalleryRowVO.MediaItem> mediaItems, CornerRadius mediaPreviewCornerRadius, @NotNull Function1<? super String, Unit> openDeeplink, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        goneExtraViews(mediaItems.size());
        int i11 = 0;
        for (Object obj : mediaItems) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SingleReviewGalleryRowVO.MediaItem mediaItem = (SingleReviewGalleryRowVO.MediaItem) obj;
            View itemView = getItemView(i11);
            if (!(itemView instanceof SingleReviewGalleryMoreView)) {
                if (!(itemView instanceof SingleReviewGalleryItemView)) {
                    throw new IllegalStateException("Don't know how to call bind for class: ".concat(itemView.getClass().getSimpleName()).toString());
                }
                ((SingleReviewGalleryItemView) itemView).bindMedia(mediaItem.getMedia(), mediaPreviewCornerRadius, openDeeplink);
            } else if (mediaItem instanceof SingleReviewGalleryRowVO.MediaItem.MoreButton) {
                SingleReviewGalleryRowVO.MediaItem.MoreButton moreButton = (SingleReviewGalleryRowVO.MediaItem.MoreButton) mediaItem;
                ((SingleReviewGalleryMoreView) itemView).bindMoreButton(moreButton.getMedia(), moreButton.getShowMoreButton(), mediaPreviewCornerRadius, onAction);
            } else {
                ((SingleReviewGalleryMoreView) itemView).bindMedia(mediaItem.getMedia(), mediaPreviewCornerRadius, openDeeplink);
            }
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingLeft = getPaddingLeft();
        int i11 = this.itemSize;
        int i12 = paddingLeft + i11;
        int i13 = this.dividerSize;
        int i14 = i12 + i13;
        int i15 = i14 + i11;
        int i16 = i13 + i15;
        int i17 = i11 + i16;
        int paddingTop = getPaddingTop();
        int i18 = this.itemSize + paddingTop;
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(paddingLeft, paddingTop, i12, i18);
        }
        View childAt2 = getChildAt(1);
        if (childAt2 != null) {
            childAt2.layout(i14, paddingTop, i15, i18);
        }
        View childAt3 = getChildAt(2);
        if (childAt3 != null) {
            childAt3.layout(i16, paddingTop, i17, i18);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingLeft = (((size - getPaddingLeft()) - getPaddingRight()) - (this.dividerSize * 2)) / 3;
        this.itemSize = paddingLeft;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + paddingLeft);
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.itemSize, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec);
        }
    }
}
