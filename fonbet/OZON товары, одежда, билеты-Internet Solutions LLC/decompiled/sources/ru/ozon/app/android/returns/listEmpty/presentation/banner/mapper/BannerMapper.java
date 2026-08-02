package ru.ozon.app.android.returns.listEmpty.presentation.banner.mapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.returns.listEmpty.data.ReturnListEmptyDto;
import ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\n\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/banner/mapper/BannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto;", "Ll20/d;", "", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Banner;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;", "toVo", "(Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;)Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Banner;", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$ImageSize;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "(Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$ImageSize;)Lru/ozon/app/android/pikazon/image/ImageSize;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto;Ll20/d;)Ljava/util/List;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BannerMapper implements Function2<ReturnListEmptyDto, d, List<? extends TextBlockVO.Banner>> {
    private final TextBlockVO.Banner toVo(ReturnListEmptyDto.TextBlock textBlock) {
        return new TextBlockVO.Banner(textBlock.hashCode(), textBlock.getColor(), textBlock.getImage(), toVo(textBlock.getImageSize()), textBlock.getHeader(), textBlock.getCallToAction(), textBlock.getTextRows());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextBlockVO.Banner> invoke(@NotNull ReturnListEmptyDto state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state.getBanner()));
    }

    private final ImageSize toVo(ReturnListEmptyDto.ImageSize imageSize) {
        return new ImageSize(ResourceExtKt.toPx(imageSize.getWidth()), ResourceExtKt.toPx(imageSize.getHeight()));
    }
}
