package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.image;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.color.VariantsMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/image/AspectsCompactV2ImageMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/color/VariantsMapper;", "variantsMapper", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/color/VariantsMapper;)V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/color/VariantsMapper;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsCompactV2ImageMapper implements Function2<AspectsV2DTO.AspectV2, d, List<? extends AspectsCompactV2VO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final VariantsMapper variantsMapper;

    public AspectsCompactV2ImageMapper(@NotNull Context context, @NotNull VariantsMapper variantsMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(variantsMapper, "variantsMapper");
        this.context = context;
        this.variantsMapper = variantsMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AspectsCompactV2VO> invoke(@NotNull AspectsV2DTO.AspectV2 dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return this.variantsMapper.map(dto, widgetInfo, new AspectsCompactV2ImageMapper$invoke$1(widgetInfo.d().hashCode(), this));
    }
}
