package ru.ozon.app.android.ugc.core.widgets.singlereview.header.variant;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "getReviewHeaderVO", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantDO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantDO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewVariantMapper implements Function2<SingleReviewVariantDO, d, List<? extends SingleReviewVariantVO>> {
    private final SingleReviewVariantVO getReviewHeaderVO(SingleReviewVariantDO singleReviewVariantDO) {
        long a11 = c.a(singleReviewVariantDO.getUuid(), "_variantText");
        TextDTO variantText = singleReviewVariantDO.getVariantText();
        return new SingleReviewVariantVO(a11, variantText != null ? TextDTO.copy$default(variantText, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewVariantVO> invoke(@NotNull SingleReviewVariantDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(getReviewHeaderVO(state));
    }
}
