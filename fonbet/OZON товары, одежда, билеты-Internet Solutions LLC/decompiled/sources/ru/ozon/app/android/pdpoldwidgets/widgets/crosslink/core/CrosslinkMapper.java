package ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.data.CrosslinkDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation.CrosslinkVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/core/CrosslinkMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/data/CrosslinkDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/data/CrosslinkDTO;Ll20/d;)Ljava/util/List;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CrosslinkMapper implements Function2<CrosslinkDTO, d, List<? extends CrosslinkVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CrosslinkVO> invoke(@NotNull CrosslinkDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        boolean z11 = dto.getTitle().length() > 0;
        Boolean valueOf = Boolean.valueOf(z11);
        if (!z11) {
            valueOf = null;
        }
        if (valueOf != null) {
            long hashCode = widgetInfo.d().hashCode();
            String title = dto.getTitle();
            String deeplink = dto.getDeeplink();
            if (deeplink == null) {
                deeplink = "";
            }
            List<CrosslinkVO> a02 = C7714v.a0(new CrosslinkVO(hashCode, title, deeplink));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
