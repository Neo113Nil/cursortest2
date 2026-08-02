package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "containerWidth", "", "containerHeight", "isVerticalContent", "", "<init>", "(Landroid/content/Context;IIZ)V", "clickView", "Landroid/view/View;", "getClickView", "()Landroid/view/View;", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "ugcView", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcView;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/ugc/GalleryV4UgcVo;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class GalleryV4UgcContainerView extends FrameLayout {
    private final Drawable backgroundColor;

    @NotNull
    private final View clickView;

    @NotNull
    private GalleryV4UgcView ugcView;

    public /* synthetic */ GalleryV4UgcContainerView(Context context, int i11, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? -1 : i11, (i13 & 4) != 0 ? -1 : i12, (i13 & 8) != 0 ? true : z11);
    }

    public final void bind(@NotNull GalleryV4UgcVo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        layoutParams.width = item.getSize().getWidth();
        int height = item.getSize().getHeight();
        layoutParams.height = height;
        if (i11 != height || i12 != layoutParams.width) {
            setLayoutParams(layoutParams);
        }
        this.ugcView.bind(item, new GalleryV4UgcContainerView$bind$2(this));
    }

    @NotNull
    public final View getClickView() {
        return this.clickView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV4UgcContainerView(@NotNull Context context, int i11, int i12, boolean z11) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable a11 = C7232a.a(context, R$drawable.bg_round_gallery_v4_other_item);
        this.backgroundColor = a11;
        setLayoutParams(new FrameLayout.LayoutParams(i11, i12));
        setBackground(a11);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        this.clickView = view;
        this.ugcView = new GalleryV4UgcView(context, z11);
        addView(view);
        addView(this.ugcView);
    }
}
