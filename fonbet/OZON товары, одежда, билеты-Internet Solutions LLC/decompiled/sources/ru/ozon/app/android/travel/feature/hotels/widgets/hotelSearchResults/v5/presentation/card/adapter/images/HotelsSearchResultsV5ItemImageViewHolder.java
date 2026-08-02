package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.adapter.images;

import androidx.appcompat.widget.AppCompatImageView;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/adapter/images/HotelsSearchResultsV5ItemImageViewHolder;", "Ljk0/j;", "Landroidx/appcompat/widget/AppCompatImageView;", "containerView", "<init>", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "", "item", "", "bind", "(Ljava/lang/String;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5ItemImageViewHolder extends j {

    @NotNull
    private final AppCompatImageView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsSearchResultsV5ItemImageViewHolder(@NotNull AppCompatImageView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void bind(@NotNull String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.containerView, item, null, null, null, null, false, null, 126, null);
    }
}
