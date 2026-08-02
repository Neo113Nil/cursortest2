package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.SingleReviewGalleryItemSizeProvider;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList.SingleReviewMediaListVO;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 52\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b\"\u0010#JI\u0010-\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\u0014\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u00100(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00100(¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00104\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryMediaListView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Landroid/graphics/Bitmap;", "iconPlayBitmap", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/preload/PlayerPreloader;Landroid/graphics/Bitmap;)V", "", "index", "Landroid/view/View;", "getItemView", "(I)Landroid/view/View;", "count", "", "goneExtraViews", "(I)V", "", "isNeededBottomRow", "()Z", "child", "addView", "(Landroid/view/View;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListVO;", "item", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showMoreButton", "Lkotlin/Function1;", "", "openDeeplink", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindMedia", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaList/SingleReviewMediaListVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Landroid/graphics/Bitmap;", "dividerSize", "I", "bigItemSize", "smallItemSize", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SingleReviewGalleryMediaListView extends ViewGroup {
    private int bigItemSize;
    private int dividerSize;

    @NotNull
    private final Bitmap iconPlayBitmap;

    @NotNull
    private final PlayerPreloader playerPreloader;
    private int smallItemSize;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewGalleryMediaListView(@NotNull Context context, @NotNull PlayerPreloader playerPreloader, @NotNull Bitmap iconPlayBitmap) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(iconPlayBitmap, "iconPlayBitmap");
        this.playerPreloader = playerPreloader;
        this.iconPlayBitmap = iconPlayBitmap;
        this.dividerSize = SingleReviewGalleryItemSizeProvider.INSTANCE.getDividerSize();
    }

    private final View getItemView(int index) {
        View singleReviewGalleryBigItemView;
        View childAt = getChildAt(index);
        if (childAt != null) {
            ViewExtKt.show(childAt);
            return childAt;
        }
        if (index == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            singleReviewGalleryBigItemView = new SingleReviewGalleryBigItemView(context, this.playerPreloader, this.iconPlayBitmap);
        } else if (index != 5) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            singleReviewGalleryBigItemView = new SingleReviewGalleryItemView(context2, this.playerPreloader, this.iconPlayBitmap);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            singleReviewGalleryBigItemView = new SingleReviewGalleryMoreView(context3, this.playerPreloader, this.iconPlayBitmap);
        }
        addView(singleReviewGalleryBigItemView);
        return singleReviewGalleryBigItemView;
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

    private final boolean isNeededBottomRow() {
        Iterator<View> it = C5316f0.b(this).iterator();
        int i11 = 0;
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return i11 > 3;
            }
            if (((View) c5314e0.next()).getVisibility() == 0 && (i11 = i11 + 1) < 0) {
                C7714v.N0();
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        if (child != null && getChildCount() == 6) {
            throw new IllegalStateException("Too many elements");
        }
        super.addView(child);
    }

    public final void bindMedia(@NotNull SingleReviewMediaListVO item, ButtonV3Atom.LargeBorderlessButton showMoreButton, @NotNull Function1<? super String, Unit> openDeeplink, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        goneExtraViews(item.getListOfMedia().size());
        int i11 = 0;
        for (Object obj : item.getListOfMedia()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            MediaVO mediaVO = (MediaVO) obj;
            if (i11 > 5) {
                return;
            }
            View itemView = getItemView(i11);
            if (itemView instanceof SingleReviewGalleryMoreView) {
                if (showMoreButton != null) {
                    ((SingleReviewGalleryMoreView) itemView).bindMoreButton(mediaVO, showMoreButton, item.getMediaPreviewCornerRadius(), onAction);
                } else {
                    ((SingleReviewGalleryMoreView) itemView).bindMedia(mediaVO, item.getMediaPreviewCornerRadius(), openDeeplink);
                }
            } else if (itemView instanceof SingleReviewGalleryBigItemView) {
                SingleReviewGalleryBigItemView singleReviewGalleryBigItemView = (SingleReviewGalleryBigItemView) itemView;
                singleReviewGalleryBigItemView.bindMedia(mediaVO, item.getMediaPreviewCornerRadius(), openDeeplink);
                singleReviewGalleryBigItemView.bindSticker(item.getMediaImageSticker(), onAction);
            } else {
                if (!(itemView instanceof SingleReviewGalleryItemView)) {
                    throw new IllegalStateException("Don't know how to call bind for class: ".concat(itemView.getClass().getSimpleName()).toString());
                }
                ((SingleReviewGalleryItemView) itemView).bindMedia(mediaVO, item.getMediaPreviewCornerRadius(), openDeeplink);
            }
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int i11 = this.bigItemSize;
        int i12 = paddingTop + i11;
        int i13 = i11 + paddingLeft;
        int i14 = this.dividerSize;
        int i15 = i13 + i14;
        int i16 = i12 + i14;
        int i17 = this.smallItemSize;
        int i18 = paddingTop + i17;
        int i19 = i18 + i14;
        int i21 = i17 + paddingLeft;
        int i22 = i14 + i21;
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(paddingLeft, paddingTop, i13, i12);
        }
        View childAt2 = getChildAt(1);
        if (childAt2 != null) {
            childAt2.layout(i15, paddingTop, width, i18);
        }
        View childAt3 = getChildAt(2);
        if (childAt3 != null) {
            childAt3.layout(i15, i19, width, i12);
        }
        View childAt4 = getChildAt(3);
        if (childAt4 != null) {
            childAt4.layout(paddingLeft, i16, i21, height);
        }
        View childAt5 = getChildAt(4);
        if (childAt5 != null) {
            childAt5.layout(i22, i16, i13, height);
        }
        View childAt6 = getChildAt(5);
        if (childAt6 != null) {
            childAt6.layout(i15, i16, width, height);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i11 = this.dividerSize;
        int i12 = (paddingLeft - (i11 * 2)) / 3;
        this.smallItemSize = i12;
        this.bigItemSize = (i12 * 2) + i11;
        if (!isNeededBottomRow()) {
            paddingLeft = this.bigItemSize;
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + paddingLeft);
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view instanceof SingleReviewGalleryBigItemView ? this.bigItemSize : this.smallItemSize, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec);
        }
    }
}
