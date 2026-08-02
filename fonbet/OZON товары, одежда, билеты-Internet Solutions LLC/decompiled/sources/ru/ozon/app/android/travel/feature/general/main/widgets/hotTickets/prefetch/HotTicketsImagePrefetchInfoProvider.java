package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.prefetch;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.molecules.extensions.ThemeImageExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/prefetch/HotTicketsImagePrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "getUrl", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotTicketsImagePrefetchInfoProvider implements ImagePrefetchInfoProvider<ThemeImageV1VO> {

    @NotNull
    private final Context context;

    public HotTicketsImagePrefetchInfoProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public ImageSize getSize(@NotNull ThemeImageV1VO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(140, context);
        return new ImageSize(px, px);
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull ThemeImageV1VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return ThemeImageExtKt.getUrlForTheme(item, this.context);
    }
}
