package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cardImages;

import IR.a;
import androidx.appcompat.widget.AppCompatImageView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/cardImages/ImageViewHolder;", "Ljk0/j;", "Landroidx/appcompat/widget/AppCompatImageView;", "view", "Lkotlin/Function0;", "", "onImageClick", "<init>", "(Landroidx/appcompat/widget/AppCompatImageView;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$ImageVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$ImageVO;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageViewHolder extends j {

    @NotNull
    private final AppCompatImageView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewHolder(@NotNull AppCompatImageView view, @NotNull Function0<Unit> onImageClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        this.view = view;
        view.setOnClickListener(new a(onImageClick, 0));
    }

    public final void bind(@NotNull HotelsMapInfoV4VO.ImageVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.view, item.getUrl(), null, null, null, null, false, null, 126, null);
    }
}
