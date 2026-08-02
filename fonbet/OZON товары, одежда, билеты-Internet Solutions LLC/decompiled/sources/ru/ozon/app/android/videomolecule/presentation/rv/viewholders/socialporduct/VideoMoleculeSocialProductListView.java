package ru.ozon.app.android.videomolecule.presentation.rv.viewholders.socialporduct;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView;
import ru.ozon.app.android.storefront.ui.videomolecule.R$id;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.socialporduct.VideoMoleculeSocialProductListView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/socialporduct/VideoMoleculeSocialProductListView;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "landscapePadding", "prevPosition", "Ljava/lang/Integer;", "getAvailableRightWidthInList", "targetView", "Landroid/view/View;", "minimalWidth", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "processPortrait", "processLandscape", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeSocialProductListView extends SocialProductListView {
    private final int landscapePadding;
    private Integer prevPosition;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeSocialProductListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(VideoMoleculeSocialProductListView videoMoleculeSocialProductListView, View view, int i11, int i12, int i13, int i14) {
        RecyclerView.o layoutManager = videoMoleculeSocialProductListView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        videoMoleculeSocialProductListView.prevPosition = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
    }

    private final void processLandscape() {
        int i11 = this.landscapePadding;
        ViewExtKt.updatePadding$default(this, i11, 0, i11, 0, 10, null);
    }

    private final void processPortrait() {
        ViewExtKt.updatePadding$default(this, getHorizontalPadding(), 0, getHorizontalPadding(), 0, 10, null);
    }

    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListView
    public int getAvailableRightWidthInList(@NotNull View targetView, int minimalWidth) {
        int measuredWidth;
        int horizontalPadding;
        int itemDivider;
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        if (getContext().getResources().getConfiguration().orientation == 2) {
            measuredWidth = getMeasuredWidth();
            horizontalPadding = this.landscapePadding;
        } else {
            measuredWidth = getMeasuredWidth();
            horizontalPadding = getHorizontalPadding();
        }
        int i11 = measuredWidth - (horizontalPadding * 2);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            Intrinsics.f(childAt);
            if (!childAt.equals(targetView)) {
                i11 -= childAt.getMeasuredWidth();
                itemDivider = getItemDivider();
                if (i12 != 0) {
                    itemDivider *= 2;
                }
            } else if (getChildCount() > 1) {
                itemDivider = getItemDivider();
            }
            i11 -= itemDivider;
        }
        return Math.max(minimalWidth, i11);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig == null) {
            return;
        }
        if (newConfig.orientation == 2) {
            processLandscape();
        } else {
            processPortrait();
        }
        Integer num = this.prevPosition;
        if (num != null) {
            int intValue = num.intValue();
            RecyclerView.o layoutManager = getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPosition(intValue);
            }
        }
    }

    public /* synthetic */ VideoMoleculeSocialProductListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeSocialProductListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.landscapePadding = ResourceExtKt.toPx(60);
        this.prevPosition = 0;
        setId(R$id.socialProductListView);
        ViewExtKt.updatePadding$default(this, getHorizontalPadding(), 0, getHorizontalPadding(), 0, 10, null);
        setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: DY.a
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i12, int i13, int i14, int i15) {
                VideoMoleculeSocialProductListView._init_$lambda$0(VideoMoleculeSocialProductListView.this, view, i12, i13, i14, i15);
            }
        });
    }
}
