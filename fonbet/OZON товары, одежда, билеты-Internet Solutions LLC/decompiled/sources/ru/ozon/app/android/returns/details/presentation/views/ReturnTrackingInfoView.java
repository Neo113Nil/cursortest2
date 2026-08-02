package ru.ozon.app.android.returns.details.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.list.GalleryView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/views/ReturnTrackingInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "marginHorizontal", "disclaimerSingleAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getDisclaimerSingleAtom", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "photosGalleryView", "Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "getPhotosGalleryView", "()Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTrackingInfoView extends LinearLayout {

    @NotNull
    private final SingleAtom disclaimerSingleAtom;
    private final int marginHorizontal;

    @NotNull
    private final GalleryView photosGalleryView;

    public /* synthetic */ ReturnTrackingInfoView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final SingleAtom getDisclaimerSingleAtom() {
        return this.disclaimerSingleAtom;
    }

    @NotNull
    public final GalleryView getPhotosGalleryView() {
        return this.photosGalleryView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnTrackingInfoView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.marginHorizontal = px;
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ViewExtKt.gone(singleAtom);
        this.disclaimerSingleAtom = singleAtom;
        GalleryView galleryView = new GalleryView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, UiExtKt.toPx(16, context), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        galleryView.setLayoutParams(layoutParams);
        this.photosGalleryView = galleryView;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        layoutParams2.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i13;
        layoutParams2.setMarginEnd(px);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i14;
        setLayoutParams(layoutParams2);
        addView(singleAtom);
        addView(galleryView);
    }
}
