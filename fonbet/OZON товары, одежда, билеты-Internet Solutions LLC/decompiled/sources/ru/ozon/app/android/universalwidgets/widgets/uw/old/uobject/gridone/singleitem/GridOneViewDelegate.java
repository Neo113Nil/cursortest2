package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH&J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/GridOneViewDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeDelegate;", "imageView", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "getImageView", "()Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "textLl", "Landroid/widget/LinearLayout;", "getTextLl", "()Landroid/widget/LinearLayout;", "getTitleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "createIfNotExist", "", "getSubtitleTv", "setBackgroundColor", "", "color", "", "setupRootPaddings", "paddings", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "setCornerRadius", "radius", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface GridOneViewDelegate extends AdvBadgeDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ AppCompatTextView getSubtitleTv$default(GridOneViewDelegate gridOneViewDelegate, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSubtitleTv");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return gridOneViewDelegate.getSubtitleTv(z11);
        }

        public static /* synthetic */ AppCompatTextView getTitleTv$default(GridOneViewDelegate gridOneViewDelegate, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTitleTv");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return gridOneViewDelegate.getTitleTv(z11);
        }
    }

    @NotNull
    AspectRatioImageView getImageView();

    AppCompatTextView getSubtitleTv(boolean createIfNotExist);

    @NotNull
    LinearLayout getTextLl();

    AppCompatTextView getTitleTv(boolean createIfNotExist);

    void setBackgroundColor(int color);

    void setCornerRadius(float radius);

    void setupRootPaddings(@NotNull ObjectItemsVO.Paddings paddings);
}
