package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.imageprefetch;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/Grid3ImageSizeProvider;", "", "<init>", "()V", "itemWidth", "", "Ljava/lang/Integer;", "fullHorizontalWidgetOffset", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "screenWidth", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Grid3ImageSizeProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int fullHorizontalWidgetOffset = (UiExtKt.toPx(8) + UiExtKt.toPx(16)) * 2;
    private Integer itemWidth;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/imageprefetch/Grid3ImageSizeProvider$Companion;", "", "<init>", "()V", "SCREEN_OFFSET", "", "ITEMS_OFFSET", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final ImageSize getSize(int screenWidth) {
        if (this.itemWidth == null) {
            this.itemWidth = Integer.valueOf((screenWidth - this.fullHorizontalWidgetOffset) / 3);
        }
        Integer num = this.itemWidth;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        return new ImageSize(intValue, intValue);
    }
}
