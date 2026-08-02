package ru.ozon.app.android.storefront.widgets.shellNavBarTitle.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.data.ShellNavTitleDTO;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.ShellNavTitleVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/core/ShellNavTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShellNavTitleMapper implements Function2<ShellNavTitleDTO, d, List<? extends ShellNavTitleVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ShellNavTitleVO> invoke(@NotNull ShellNavTitleDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = dto.getTitle();
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextDTO copy$default = TextDTO.copy$default(title, null, textAlignment, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
        TextDTO subtitle = dto.getSubtitle();
        TextDTO copy$default2 = subtitle != null ? TextDTO.copy$default(subtitle, null, textAlignment, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTitle().getTrackingInfo();
        return C7714v.a0(new ShellNavTitleVO(hashCode, copy$default, copy$default2, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
