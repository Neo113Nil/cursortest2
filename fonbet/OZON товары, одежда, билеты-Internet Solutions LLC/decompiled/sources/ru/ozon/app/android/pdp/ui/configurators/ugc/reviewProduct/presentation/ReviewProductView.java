package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/ReviewProductView;", "", "Landroid/widget/ImageView;", "getImageIv", "()Landroid/widget/ImageView;", "imageIv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getNameTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "nameTav", "Landroidx/recyclerview/widget/RecyclerView;", "getBadgesRv", "()Landroidx/recyclerview/widget/RecyclerView;", "badgesRv", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ReviewProductView {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static RecyclerView getBadgesRv(@NotNull ReviewProductView reviewProductView) {
            return null;
        }
    }

    RecyclerView getBadgesRv();

    @NotNull
    ImageView getImageIv();

    @NotNull
    TextAtomV2View getNameTav();
}
