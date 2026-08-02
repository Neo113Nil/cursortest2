package ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.TravelTextVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextMapper implements Function2<TravelTextDTO, d, List<? extends TravelTextVO>> {

    @NotNull
    private final Context context;

    public TravelTextMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelTextVO> invoke(@NotNull TravelTextDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom text = dto.getText();
        String backgroundColor = dto.getBackgroundColor();
        Integer offsetHorizontal = dto.getOffsetHorizontal();
        int px = offsetHorizontal != null ? ResourceExtKt.toPx(offsetHorizontal.intValue(), this.context) : 0;
        Integer offsetTop = dto.getOffsetTop();
        int px2 = offsetTop != null ? ResourceExtKt.toPx(offsetTop.intValue(), this.context) : 0;
        Integer offsetBottom = dto.getOffsetBottom();
        return C7714v.a0(new TravelTextVO(hashCode, text, backgroundColor, px, px2, offsetBottom != null ? ResourceExtKt.toPx(offsetBottom.intValue(), this.context) : 0, dto.isCentered() ? 4 : 2));
    }
}
